package com.szty.web.ota.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DidiController {

	@RequestMapping(value = "/pushReply")
	public String setDdMsg(HttpServletRequest request, HttpServletResponse response) {

		System.out.println( "请求一次。。。。");
		return null;
	}
}
