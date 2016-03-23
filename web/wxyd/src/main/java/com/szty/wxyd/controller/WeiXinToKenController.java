package com.szty.wxyd.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szty.wxyd.model.WeiXinResModel;
import com.szty.wxyd.service.WeiXinDoPostService;
import com.szty.wxyd.util.MessageCodeUtil;
import com.szty.wxyd.util.MessageUtil;
import com.szty.wxyd.util.WeiXinConfing;
import com.szty.wxyd.util.WeiXinUtil;

@Controller
@RequestMapping(value="/getToken")
public class WeiXinToKenController {

	private static final Logger log = Logger.getLogger(WeiXinToKenController.class);

	private static final String msgKey = "MsgType";
	@Autowired
	private WeiXinConfing wxConfig;
	@Autowired
	private WeiXinDoPostService wxDoPostService;

	/**
	 * @Title: getLocalHostToKen
	 * @author mao.ru
	 * @Description: TODO(微信获取本地ToKen)
	 * @param @param signature
	 * @param @param timestamp
	 * @param @param nonce
	 * @param @param echostr
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping(method = { RequestMethod.GET })
	public @ResponseBody String getLocalHostToKen(
			@RequestParam("signature") String signature,
			@RequestParam("timestamp") String timestamp,
			@RequestParam("nonce") String nonce,
			@RequestParam("echostr") String echostr,
			HttpServletResponse response) {

		WeiXinResModel wxm = new WeiXinResModel(signature, timestamp, nonce,
				echostr, wxConfig.loctoken);
		log.info("微信验证请求接入,请求参数:" + wxm.toString());
		String res = wxm.getSequenceFiles();
		if (signature.equals(WeiXinUtil.SHA1(res))) {
			log.info("签名:{" + signature + "},本地加签:{"
					+ WeiXinUtil.getHashSHA(res) + "}");
			return echostr;
		} else {
		}
		return "error";
	}

	/**
	 * 
	 * @Title: doPostHandle
	 * @author mao.ru
	 * @Description: TODO(微信借口主动回调)
	 * @param @param requestBody
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws Exception
	 */
	@RequestMapping(method = { RequestMethod.POST },produces="text/xml;charset=UTF-8")
	public @ResponseBody String doPostHandle(@RequestBody String requestBody)
			throws Exception {
		log.info("<===============微信回调======start=======================>");
		log.info("微信回调请求参数:=====>" + requestBody);
		Map<String, String> map = MessageUtil.parseStringToXml(requestBody);
		if (!map.isEmpty()) {
			// 依据消息类型调用不同接口
			int key = MessageCodeUtil.getName(map.get(msgKey));
			log.info("微信回调事件:=====[>>>>>>>>>" + key+"]===["+map.get(msgKey)+"]");
			String rspStr = "";
			switch (key) {
			case 1:
				rspStr = wxDoPostService.doPostTextHandle(map);
				break;
			case 2:
				rspStr = wxDoPostService.doPostImageHandle(map);
				break;
			case 3:
				rspStr = wxDoPostService.doPostLinkHandle(map);
				break;
			case 4:
				rspStr = wxDoPostService.doPostLocationHandle(map);
				break;
			case 5:
				rspStr = wxDoPostService.doPostVoiceHandle(map);
				break;
			case 6:
				rspStr = wxDoPostService.doPostEventHandle(map);
				break;
			case 7:
				rspStr = wxDoPostService.doPostDeviceEvent(map);
				break;
			case 8:
				rspStr = wxDoPostService.doPostDeviceText(map);
				break;
			default:
				rspStr = wxDoPostService.doPostErrorHandle(map);
				break;
			}
			log.info("微信回调=》返回参数：==>["+rspStr+"]");
			log.info("<===============微信回调======end=======================>");
			return rspStr;

		} else {
			// 返回错误文本接口
			log.info("<===============微信回调======end=============错误接口=========>");
			return wxDoPostService.doPostErrorHandle(map);
		}
		
	}
	
	/**
	 * @Title: getLocalHostToKen
	 * @author mao.ru
	 * @Description: TODO(微信获取本地ToKen)
	 * @param @param signature
	 * @param @param timestamp
	 * @param @param nonce
	 * @param @param echostr
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping(value="/getBind" ,method = { RequestMethod.GET })
	public @ResponseBody String getLocalHostToKenBind(
			@RequestParam("signature") String signature,
			@RequestParam("timestamp") String timestamp,
			@RequestParam("nonce") String nonce,
			@RequestParam("echostr") String echostr,
			HttpServletResponse response) {

		WeiXinResModel wxm = new WeiXinResModel(signature, timestamp, nonce,
				echostr, wxConfig.loctoken);
		log.info("微信验证请求接入,请求参数:" + wxm.toString());
		String res = wxm.getSequenceFiles();
		if (signature.equals(WeiXinUtil.SHA1(res))) {
			log.info("签名:{" + signature + "},本地加签:{"
					+ WeiXinUtil.getHashSHA(res) + "}");
			return echostr;
		} else {
		}
		return "error";
	}
	
	
	/**
	 * 
	 * @Title: doPostHandle
	 * @author mao.ru
	 * @Description: TODO(微信借口主动回调)
	 * @param @param requestBody
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws Exception
	 */
	@RequestMapping(value="/getBind" ,method = { RequestMethod.POST })
	public @ResponseBody String doPostHandleJson(String START_OBJECT)
			throws Exception {
		log.info("<===============微信回调======start=======================>");
		log.info("微信回调请求参数:=====>" + START_OBJECT);
		Map<String, String> map = MessageUtil.parseStringToXml(START_OBJECT);
		if (!map.isEmpty()) {
			// 依据消息类型调用不同接口
			int key = MessageCodeUtil.getName(map.get(msgKey));
			log.info("微信回调事件:=====[>>>>>>>>>" + key+"]===["+map.get(msgKey)+"]");
			String rspStr = "";
			switch (key) {
			case 1:
				rspStr = wxDoPostService.doPostTextHandle(map);
				break;
			case 2:
				rspStr = wxDoPostService.doPostImageHandle(map);
				break;
			case 3:
				rspStr = wxDoPostService.doPostLinkHandle(map);
				break;
			case 4:
				rspStr = wxDoPostService.doPostLocationHandle(map);
				break;
			case 5:
				rspStr = wxDoPostService.doPostVoiceHandle(map);
				break;
			case 6:
				rspStr = wxDoPostService.doPostEventHandle(map);
				break;
			case 7:
				rspStr = wxDoPostService.doPostEventHandle(map);
				break;
			case 8:
				rspStr = wxDoPostService.doPostDeviceText(map);
				break;
			default:
				rspStr = wxDoPostService.doPostDeviceEvent(map);
				break;
			}
			log.info("微信回调=》返回参数：==>["+rspStr+"]");
			log.info("<===============微信回调======end=======================>");
			return rspStr;

		} else {
			// 返回错误文本接口
			log.info("<===============微信回调======end=============错误接口=========>");
			return wxDoPostService.doPostErrorHandle(map);
		}
		
	}

}