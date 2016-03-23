package com.szty.sms.controller;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szty.framework.base.msg.RepMsg;
import com.szty.sms.service.SmsService;
import com.szty.sms.utils.SmsProperject;
import com.szty.web.ota.controller.ResponseUtil;

/**
 * 短信服务接口 ClassName: SmsController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月18日 上午10:36:03 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
@Controller
public class SmsController {

	@Autowired
	private SmsService smsService;

	/**
	 * 短信发送服务 sendMsm:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param request
	 * @param response
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "/sendMsm")
	public String sendMsm(HttpServletRequest request, HttpServletResponse response) {
		String mobile = request.getParameter("phone");
		if (mobile == null) {
			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "手机号码为空"));
			return null;
		}
		if (! this.iSmobile(mobile)) {
			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "手机号格式不对"));
			return null;
		}
		Long time = new Date().getTime();
		if (smsService.isSendMsm(mobile, time)) {
			Boolean is = smsService.sendMsm(mobile, time);
			if(!is){
				ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "发送失败"));
				return null;
			}
		}
		ResponseUtil.outJson(response, RepMsg.JsonMsg("true", "发送成功"));
		return null;
	}

	/**
	 * 短信验证码校验 isMsm:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param request
	 * @param response
	 * @since JDK 1.7
	 */
	@RequestMapping(value = "/isMsM")
	public String isMsm(HttpServletRequest request, HttpServletResponse response) {
		String mobile = request.getParameter("phone");
		String code = request.getParameter("code");
		if (code == null) {
			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "验证码为空"));
			return null;
		}
		if (code.length() != SmsProperject.CODE_LENTH.intValue()) {
			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "验证码长度不对"));
			return null;
		}
		if (mobile == null) {
			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "手机号码为空"));
			return null;
		}
		if (!this.iSmobile(mobile)) {
			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "手机号格式不对"));
			return null;
		}
		Boolean is = smsService.isMsm(mobile, code);
		if(! is){
			ResponseUtil.outJson(response, RepMsg.JsonMsg("false", "手机号格式不对"));
			return null;
		}
		smsService.isMsm(mobile, code);
		ResponseUtil.outJson(response, RepMsg.JsonMsg("true", "成功"));
		return null;
	}

	/**
	 * 手机号码验证 ismobile:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param mobile
	 * @return
	 * @since JDK 1.7
	 */
	public Boolean iSmobile(String mobile) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
		Matcher m = p.matcher(mobile);
		return m.matches();
	}

}
