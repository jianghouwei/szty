package com.szty.web.ota.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szty.framework.base.msg.RepMsg;
import com.szty.web.ota.service.OtaUpdateService;

/**
 * 手表OTA升级信息接口 ClassName: OTAUpdateController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON( author hetanghong ,2015年9月24日上午11:01:08 ). <br/>
 * date: 2016年3月11日 上午9:28:39 <br/>
 *
 * @author mao.ru
 * @version V1.1
 * @since JDK 1.7
 */
@Controller
public class OTAUpdateController {

	
	@Autowired
	private OtaUpdateService  otaUpdateService;
	
	
	@RequestMapping(value = "/OTA/getOTAUpdateInfo")
	public void getOTAUpdateInfo(HttpServletRequest request, HttpServletResponse response) throws Exception  {
		String app = request.getParameter("app");
		String channel = request.getParameter("channel");
		String extension = request.getParameter("extension");//文件后缀名
		String result = "";
		try {
			if (null != app && null != channel) {
				result = otaUpdateService.getFileTOJsonByAppAndChannelOfFile(app, channel,extension);
			} else {
				result = RepMsg.JsonMsg("error", "[app,channel] 为必填参数！");
			}
		}catch (FileNotFoundException e) {
			result = RepMsg.JsonMsg("error", "文件不存在，请检查！["+e.getMessage()+"]");
			throw new FileNotFoundException(result);
		} catch (IOException e) {
			result = RepMsg.JsonMsg("error", "位置文件IO读取错误:["+e.getMessage()+"]");
			throw new FileNotFoundException(result);
		} 
		ResponseUtil.outJson(response, result);
	}
}
