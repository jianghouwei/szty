package com.szty.wxyd.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.szty.wxyd.dao.WxDeviceMapper;
import com.szty.wxyd.data.model.WxDevice;
import com.szty.wxyd.model.AuthorizeModel;
import com.szty.wxyd.model.BindModel;
import com.szty.wxyd.model.CodeList;
import com.szty.wxyd.model.CreateQrcode;
import com.szty.wxyd.model.DeviceModel;
import com.szty.wxyd.model.QrcodeMode;
import com.szty.wxyd.model.ReqModel;
import com.szty.wxyd.model.ResDeviceModel;
import com.szty.wxyd.model.SetpModel;
import com.szty.wxyd.service.DeviceHandleService;
import com.szty.wxyd.service.WeiXinBaseService;
import com.szty.wxyd.util.DateStyle;
import com.szty.wxyd.util.DateUtil;
import com.szty.wxyd.util.HttpUtil;
import com.szty.wxyd.util.WeiXinConfing;

@Service
public class DeviceHandleServiceImpl implements DeviceHandleService {

	private static final Logger log = Logger
			.getLogger(DeviceHandleServiceImpl.class);

	@Autowired
	private WeiXinConfing wxconfig;

	@Autowired
	private WeiXinBaseService weiXinBaseService;

	@Autowired
	private WxDeviceMapper wxDeviceMapper;

	public QrcodeMode setDirverQrcode() {

		String url = wxconfig.getQrcodeUrl + "?access_token="
				+ weiXinBaseService.getWeiXinToKen() + "&product_id="
				+ wxconfig.productId;
		String res = HttpUtil.doGet(url);
		log.info("第三方获取deviceid和设备二维码：===》[" + res + "]");
		QrcodeMode rep = null;
		if (!res.isEmpty()) {
			rep = JSON.parseObject(res, QrcodeMode.class);
		}
		if (rep.getBase_resp().getErrcode().equals("0")) {
			// 2:插入微信授权表
			WxDevice wxDevice = new WxDevice();
			wxDevice.setCreateTime(DateUtil.DateToString(new Date(),
					DateStyle.YYYY_MM_DD_HH_MM_SS));
			wxDevice.setDeviceid(rep.getDeviceid());
			wxDevice.setQrticket(rep.getQrticket());
			wxDevice.setState("2");// 未授权
			wxDeviceMapper.save(wxDevice);
		}
		return rep;
	}

	public String setAuthorizeDevice(ResDeviceModel resModel) {
		String url = wxconfig.authorizeDeviceUrl + "?access_token="
				+ weiXinBaseService.getWeiXinToKen();
		// resModel = this.toResDeviceModel();
		String json = JSON.toJSONString(resModel);
		String res = HttpUtil.doPost(url, json);
		log.info("授权新接口：===》[" + res + "]");
		AuthorizeModel rep = null;
		if (!res.isEmpty()) {
			rep = JSON.parseObject(res, AuthorizeModel.class);
		}
		if (rep == null || rep.getResp().isEmpty()
				|| !rep.getResp().get(0).getErrcode().equals("0")) {
			return "2";
		}
		return "1";
	}
	
	public String setOldAuthorizeDevice(ResDeviceModel resModel) {
		String url = wxconfig.authorizeDeviceUrl + "?access_token="
				+ weiXinBaseService.getWeiXinToKen();
		// resModel = this.toResDeviceModel();
		String json = JSON.toJSONString(resModel);
		String res = HttpUtil.doPost(url, json);
		log.info("授权原始接口：===》[" + res + "]");
		AuthorizeModel rep = null;
		if (!res.isEmpty()) {
			rep = JSON.parseObject(res, AuthorizeModel.class);
		}
		if (rep == null || rep.getResp().isEmpty()
				|| !rep.getResp().get(0).getErrcode().equals("0")) {
			return "2";
		}
		return "1";
	}

	public String setBindDevice(BindModel bindModel) {
		String url = wxconfig.bindUrl + "?access_token="
				+ weiXinBaseService.getWeiXinToKen();
		String json = JSON.toJSONString(bindModel);
		String res = HttpUtil.doPost(url, json);
		log.info("绑定：===》[" + res + "]");
		return res;
	}

	public String setUnBindDevice(BindModel bindModel) {
		String url = wxconfig.unBindUrl + "?access_token="
				+ weiXinBaseService.getWeiXinToKen();
		String json = JSON.toJSONString(bindModel);
		String res = HttpUtil.doPost(url, json);
		log.info("解绑：===》[" + res + "]");
		return res;
	}

	public String setCompelBindDevice(BindModel bindModel) {
		String url = wxconfig.compelBindUrl + "?access_token="
				+ weiXinBaseService.getWeiXinToKen();
		String json = JSON.toJSONString(bindModel);
		String res = HttpUtil.doPost(url, json);
		log.info("强制绑定：===》[" + res + "]");
		return res;
	}

	public String setCompelUnBindDevice(BindModel bindModel) {
		String url = wxconfig.compelUnBindUrl + "?access_token="
				+ weiXinBaseService.getWeiXinToKen();
		String json = JSON.toJSONString(bindModel);
		String res = HttpUtil.doPost(url, json);
		log.info("强制解绑：===》[" + res + "]");
		return res;
	}

	/**
	 * zuofei
	 */
	public String setStep(SetpModel setpModel) {
		// setpModel.setTimestamp(String.valueOf(new Date().getTime()));
		String url = wxconfig.setStepUrl + "?access_token="
				+ weiXinBaseService.getWeiXinToKen();
		String json = JSON.toJSONString(setpModel);
		String res = HttpUtil.doPost(url, json);
		log.info("上传步数：===》[" + res + "]");
		ReqModel rep = null;
		if (!res.isEmpty()) {
			rep = JSON.parseObject(res, ReqModel.class);
		}
		return rep.getErrcode();
	}

	/**
	 * 
	 * @Title: toResDeviceModel
	 * @author mao.ru
	 * @Description: TODO(拼接授权参数)
	 * @param @return 设定文件 --测试数据
	 * @return ResDeviceModel 返回类型
	 * @throws
	 */
	protected ResDeviceModel toResDeviceModel() {
		ResDeviceModel resModel = new ResDeviceModel();
		List<DeviceModel> device_list = new ArrayList<DeviceModel>();
		DeviceModel dm = new DeviceModel();
		dm.setId("");
		dm.setMac("E4F89C0B3519");
		dm.setAuth_key("1234567890ABCDEF1234567890ABCDEF");
		dm.setAuth_ver("1");
		dm.setConnect_protocol("3");
		dm.setClose_strategy("1");
		dm.setConn_strategy("1");
		dm.setCrypt_method("0");
		dm.setManu_mac_pos("-1");
		dm.setSer_mac_pos("-2");
		dm.setBle_simple_protocol("0");
		device_list.add(dm);
		resModel.setDevice_list(device_list);
		resModel.setDevice_num(String.valueOf(device_list.size()));
		resModel.setOp_type("0");
		return resModel;

	}

	@Override
	public CodeList getCreateQrcode(CreateQrcode createQrcode) {
		String url = wxconfig.createQrcode + "?access_token="
				+ weiXinBaseService.getWeiXinToKen();
		String json = JSON.toJSONString(createQrcode);
		String res = HttpUtil.doPost(url, json);
		CodeList rep = null;
		if (!res.isEmpty()) {
			rep = JSON.parseObject(res, CodeList.class);
		}
		return rep;
	}

}
