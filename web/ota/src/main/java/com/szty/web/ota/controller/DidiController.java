package com.szty.web.ota.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szty.sms.service.impl.SmsServiceImpl;

@Controller
public class DidiController {

	private static final Logger log = Logger.getLogger(DidiController.class);
	
	
	@RequestMapping(value = "/pushReply")
	public String setDdMsg(HttpServletRequest request, HttpServletResponse response) {
		System.out.println( "请求一次。。。。");
		String order_id = request.getParameter("order_id");
		log.info("滴滴回掉接口订单号【【【【【【"+order_id+"】】】】】】】】】】】】】】】】】】");
		
		return null;
	}
}
