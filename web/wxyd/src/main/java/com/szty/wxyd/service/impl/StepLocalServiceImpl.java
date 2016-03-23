package com.szty.wxyd.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.szty.wxyd.dao.UserMacMapper;
import com.szty.wxyd.dao.UserStepMapper;
import com.szty.wxyd.dao.WxDeviceMapper;
import com.szty.wxyd.dao.WxUserMapper;
import com.szty.wxyd.data.model.SetpMacOpenModel;
import com.szty.wxyd.data.model.UserMac;
import com.szty.wxyd.data.model.UserStep;
import com.szty.wxyd.data.model.WxDevice;
import com.szty.wxyd.data.model.WxUser;
import com.szty.wxyd.loc.model.RespBingMsg;
import com.szty.wxyd.model.BindModel;
import com.szty.wxyd.model.DeviceModel;
import com.szty.wxyd.model.ResDeviceModel;
import com.szty.wxyd.model.SetpModel;
import com.szty.wxyd.service.DeviceHandleService;
import com.szty.wxyd.service.StepLocalService;
import com.szty.wxyd.util.DateStyle;
import com.szty.wxyd.util.DateUtil;
import com.szty.wxyd.util.WeiXinConfing;

@Service
public class StepLocalServiceImpl implements StepLocalService {

	@Autowired
	private WxDeviceMapper wxDeviceMapper;

	@Autowired
	private WxUserMapper wxUserMapper;

	@Autowired
	private UserStepMapper userStepMapper;

	@Autowired
	private DeviceHandleService deviceHandleService;

	@Autowired
	private UserMacMapper userMacMapper;

	@Autowired
	private WeiXinConfing wxConfig;

	/**
	 * @throws Exception
	 *             1：先获取机器码 2: 注册设备
	 * @Title: registerMacInfo
	 * @author mao.ru
	 * @Description: TODO(避开事物，因为机器码传查询一次少一次)
	 * @param @return 设定文件
	 * @return int 返回类型 1:操作成功 2操作失败3:获取机器码失败
	 * @throws
	 */
	public int postDerviceId(SetpMacOpenModel smom) throws Exception {
		// 申请设备编号
		this.insterRegisterMacInfo(smom);
		return  1;
	}

	/**
	 * @throws Exception
	 *             1. 注册保存mac相关信息 2. 申请绑定mac和openId相关信息 3. 授权mac和device相关认证 前提
	 *             1：先获取机器码
	 * @Title: registerMacInfo
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @return 设定文件
	 * @return int 返回类型 1:操作成功 2操作失败3:获取机器码失败
	 * @throws
	 */
	public RespBingMsg insterRegisterMacInfo(SetpMacOpenModel smom) throws Exception {
		RespBingMsg rbm = new RespBingMsg();
		// 1:插入设备表
		smom.setCreateTime(new Date());
		UserMac userMac = new UserMac();
		WxDevice wxDevice = new WxDevice();
		WxUser wxUser = new WxUser();
		BeanUtils.copyProperties(smom, userMac);
		userMac.setState("1");// 有效
		userMacMapper.save(userMac);
		// 2:授权设备
		WxDevice wxd = new WxDevice();
		wxd.setState("2");
		List<WxDevice> list = wxDeviceMapper.queryList(wxd);
		if (!list.isEmpty() && userMac.getState().equals("1")) {
			wxDevice = list.get(0);
			// 通知微信服务器授权设备
			smom.setDeviceid(wxDevice.getDeviceid());
			String am = deviceHandleService.setAuthorizeDevice(this
					.getResDeviceModel(smom));
			if (am.equals("1")) {
				wxDevice.setMac(smom.getMac());
				wxDevice.setState("1");
				wxDeviceMapper.updateByPrimaryKey(wxDevice);
			}
		}
		if (userMac.getState().equals("1") && wxDevice.getState().equals("1")) {
			// 2:绑定openId和用吗Mac
			// 3.通知微信绑定设备
			BindModel bindModel = new BindModel();
			deviceHandleService.setCompelBindDevice(bindModel);
			BeanUtils.copyProperties(smom, wxUser);
			wxUser.setState("1");// 已绑定
			wxUserMapper.save(wxUser);
		}
		if (!wxUser.getState().equals("1")) {
			throw new Exception("认证授权失败");
		}
		return rbm;
	}

	public RespBingMsg insterLocRegisterMacInfo(SetpMacOpenModel smom){
		smom.setCreateTime(new Date());
		RespBingMsg rbm = new RespBingMsg();
		rbm.setMac(smom.getMac());
		//查询当前mac是否已经绑定derviid
		WxDevice wxd = new WxDevice();
		wxd.setState("3");//未授权
		wxd.setMac(smom.getMac());
		List<WxDevice> listcount = wxDeviceMapper.queryList(wxd);
		if(!listcount.isEmpty() && wxd.getState().equals("3")){
			WxDevice wxDevice = listcount.get(0);
			rbm.setDeviceid(wxDevice.getDeviceid());
			rbm.setQrticket(wxDevice.getQrticket());
		}else{
			// 2:插入授权设备表
			wxd.setState("2");//未授权
			wxd.setMac(null);
			List<WxDevice> list = wxDeviceMapper.queryList(wxd);
			if (!list.isEmpty() && wxd.getState().equals("2")) {
				WxDevice wxDevice = list.get(0);
				rbm.setDeviceid(wxDevice.getDeviceid());
				rbm.setQrticket(wxDevice.getQrticket());
				wxDevice.setState("3");//待授权
				wxDevice.setMac(smom.getMac());
				wxDeviceMapper.updateByPrimaryKey(wxDevice);
			}
		}
		rbm.setPublicOpenId(wxConfig.publicOpenId);
		rbm.setError_info("本地绑定成功，获取机器编号成功");
		rbm.setRet_code("1");
		return rbm;
	}

	/**
	 * 1.保存openid 步数， 2.同步微信后台步数
	 * 
	 * @Title: saveStepInfo
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @return 设定文件
	 * @return int 返回类型 1:操作成功 2操作失败 3：当前上传步数小于上次步数不能上传
	 * @throws xiugai
	 */
	public int saveStepInfo(SetpMacOpenModel smom) {
		UserStep us = new UserStep();
		us.setOpenId(smom.getOpenId());
		us.setMac(smom.getMac());
		us.setCreateTimeBegin(DateUtil.DateToString(
				DateUtil.getTodayDateStart(), DateStyle.YYYY_MM_DD_HH_MM_SS));
		UserStep userStep = userStepMapper.queryListByMaxCreatTime(us);
		if (userStep != null) {
			String step = userStep.getStepNow();
			if (!step.isEmpty()
					&& Integer.valueOf(step) < Integer.valueOf(smom
							.getStepNow())) {
				// 调用微信写入当前步数
				SetpModel setpModel = new SetpModel();
				setpModel.setOpenid(smom.getOpenId());
				setpModel.setStep(smom.getStepNow());
				setpModel.setTimestamp(String.valueOf(smom.getCreateTime()
						.getTime()));
				String rep = deviceHandleService.setStep(setpModel);
				if (!"0".equals(rep)) {
					return 2;// 上传微信步数同步失败
				}
				// 插入当前步数
				UserStep us2 = new UserStep();
				BeanUtils.copyProperties(smom, us2);
				userStepMapper.save(us2);
				return 1;
			}
		}
		return 2;
	}

	/**
	 * 验证是否要注册，是否绑定， 是否授权
	 * 
	 * @Title: isregister
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param smom
	 * @param @return 设定文件
	 * @return String 返回类型 1: ok 2:mac 无效 3：未授权 4： 位绑定
	 * @throws
	 */
	public String isRegister(SetpMacOpenModel smom) {
		String mac = smom.getMac();
		WxUser wu = new WxUser();
		wu.setMac(mac);
		//wu.setOpenId(smom.getOpenId());
		List<WxUser> wslist = wxUserMapper.queryList(wu);
		if (wslist.isEmpty() || !wslist.get(0).getState().equals("1")) {
			return "4";
		}
		return "1";
	}

	public static SetpMacOpenModel setSetpMacOpenModel() {
		SetpMacOpenModel smom = new SetpMacOpenModel();
		// smom.set
		smom.setStepNow("100");
		smom.setAuthKey("1234567890ABCDEF1234567890ABCDEF");
		smom.setAuthVer("1");
		smom.setBleSimpleProtocol("0");
		smom.setCloseStrategy("1");
		smom.setConnectProtocol("3");
		smom.setConnStrategy("1");
		smom.setCryptMethod("0");
		smom.setMac("E4F89C0B3519");
		smom.setManuMacPos("-2");
		smom.setOpenId("oYC7Pt8MOJXL71fnYfgXGNd4MB2A");

		return smom;
	}

	/**
	 * 组装设备授权数据
	 * 
	 * @Title: getResDeviceModel
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param smom
	 * @param @return 设定文件
	 * @return ResDeviceModel 返回类型
	 * @throws
	 */
	protected ResDeviceModel getResDeviceModel(SetpMacOpenModel smom) {
		ResDeviceModel resModel = new ResDeviceModel();
		List<DeviceModel> device_list = new ArrayList<DeviceModel>();
		DeviceModel dm = new DeviceModel();
		dm.setId(smom.getDeviceid());
		dm.setMac(smom.getMac());
		if (StringUtils.isEmpty(smom.getAuthKey())) {
			dm.setAuth_key("1234567890ABCDEF1234567890ABCDEF");
		} else {
			dm.setAuth_key(smom.getAuthKey());
		}
		if (StringUtils.isEmpty(smom.getAuthVer())) {
			dm.setAuth_ver("1");
		} else {
			dm.setAuth_ver(smom.getAuthVer());
		}
		if (StringUtils.isEmpty(smom.getConnectProtocol())) {
			dm.setConnect_protocol("3");
		} else {
			dm.setConnect_protocol(smom.getConnectProtocol());
		}
		if (StringUtils.isEmpty(smom.getCloseStrategy())) {
			dm.setClose_strategy("1");
		} else {
			dm.setClose_strategy(smom.getCloseStrategy());
		}
		if (StringUtils.isEmpty(smom.getConnStrategy())) {
			dm.setConn_strategy("1");
		} else {
			dm.setConn_strategy(smom.getConnStrategy());
		}
		if (StringUtils.isEmpty(smom.getCryptMethod())) {
			dm.setCrypt_method("0");
		} else {
			dm.setCrypt_method(smom.getCryptMethod());
		}
		if (StringUtils.isEmpty(smom.getManuMacPos())) {
			dm.setManu_mac_pos("-1");
		} else {
			dm.setManu_mac_pos(smom.getManuMacPos());
		}
		if (StringUtils.isEmpty(smom.getSerMacPos())) {
			dm.setSer_mac_pos("-2");
		} else {
			dm.setSer_mac_pos(smom.getSerMacPos());
		}
		if (StringUtils.isEmpty(smom.getBleSimpleProtocol())) {
			dm.setBle_simple_protocol("0");
		} else {
			dm.setBle_simple_protocol(smom.getBleSimpleProtocol());
		}
		device_list.add(dm);
		resModel.setDevice_list(device_list);
		resModel.setDevice_num(String.valueOf(device_list.size()));
		resModel.setOp_type("0");
		return resModel;

	}


}
