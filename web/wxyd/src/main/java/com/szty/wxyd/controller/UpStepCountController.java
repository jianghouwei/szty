package com.szty.wxyd.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.szty.wxyd.data.model.SetpMacOpenModel;
import com.szty.wxyd.loc.model.RespBingMsg;
import com.szty.wxyd.model.QrcodeMode;
import com.szty.wxyd.service.DeviceHandleService;
import com.szty.wxyd.service.StepLocalService;

/**
 * 
 * @ClassName: UpStepDay
 * @Description: TODO()
 * @author mao.ru
 * @date 2016年1月12日 上午11:27:23
 *
 */
@Controller
public class UpStepCountController {

	private static final Logger log = Logger
			.getLogger(UpStepCountController.class);

	@Autowired
	private StepLocalService stepLocalService;

	@Autowired
	private DeviceHandleService deviceHandleService;

	/**
	 * @throws Exception
	 *             app传数据注册和上传步数
	 * @Title: bind
	 * @author mao.ru
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param setModel
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping(value = "/setStep", method = { RequestMethod.POST }, produces = "apolication/json;charset=UTF-8")
	public @ResponseBody String step(@RequestBody SetpMacOpenModel setModel)
			throws Exception {
		log.info("上传步数请求参数:====>[" + setModel.toString() + "]");
		// 验证是否绑定
		String ret = stepLocalService.isRegister(setModel);
		if("1".equals(ret)){
			int re = stepLocalService.saveStepInfo(setModel);
			if (re != 1) {
				return "error";
			}
		}
		return "ok";
	}

	/**
	 * 
	 * @Title: bind
	 * @author mao.ru
	 * @Description: TODO(绑定设备)
	 * @param @param setModel
	 * @param @return
	 * @param @throws Exception 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping(value = "/appBind", method = { RequestMethod.POST }, produces = "apolication/json;charset=UTF-8")
	public @ResponseBody String bind(@RequestBody SetpMacOpenModel setModel)
			throws Exception {
		RespBingMsg rbm = new RespBingMsg();
		int su = stepLocalService.postDerviceId(setModel);
		if(true){
			rbm.setRet_code("1");
			rbm.setError_info("绑定成功");
		}
		String ret = JSON.toJSONString(rbm);
		return ret;
	}

	/**
	 * 
	 * @Title: isbind
	 * @author mao.ru
	 * @Description: TODO(验证是否绑定)
	 * @param @param setModel
	 * @param @return 设定文件 0：已绑定 1：未绑定
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping(value = "/isBind", method = { RequestMethod.POST } ,produces = "apolication/json;charset=UTF-8")
	public @ResponseBody String isbind(
			@RequestParam("mac") String mac ) {
		RespBingMsg respBingModel = new RespBingMsg();
		SetpMacOpenModel setModel = new SetpMacOpenModel();
		setModel.setMac(mac);
		String ret = stepLocalService.isRegister(setModel);
		// 没有绑定
		if (!ret.equals("1")) {
			// 申请设备编号
			QrcodeMode qm = deviceHandleService.setDirverQrcode();
			if (qm.getBase_resp().getErrcode().equals("0")) {
				//没有绑定,则本地先绑定
				respBingModel = stepLocalService.insterLocRegisterMacInfo(setModel);
				return JSON.toJSONString(respBingModel);
			}
		}
		// 已绑定
		respBingModel.setRet_code("0");
		respBingModel.setRet_code("ok");
		return JSON.toJSONString(respBingModel);

	}
}
