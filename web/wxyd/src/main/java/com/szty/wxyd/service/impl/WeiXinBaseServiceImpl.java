package com.szty.wxyd.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szty.wxyd.service.WeiXinBaseService;
import com.szty.wxyd.util.LocalWxToKenSingleton;
import com.szty.wxyd.util.WeiXinConfing;

@Service
public class WeiXinBaseServiceImpl implements WeiXinBaseService {

	
	private static final Logger log = Logger
			.getLogger(WeiXinBaseServiceImpl.class);
	@Autowired
	private WeiXinConfing wxconfig;

	public String getWeiXinToKen() {
		log.debug("获取微信ToKen==-================start=========================>>>");
		LocalWxToKenSingleton locToken = LocalWxToKenSingleton
				.getInstanceToKen(wxconfig.accessTokenCreateUrl,
						wxconfig.appid, wxconfig.grantType, wxconfig.appsecret);
		log.debug("获取微信ToKen===>>>ToKen["+locToken.getAccess_token()+"]");
		log.debug("获取微信ToKen==-================start=========================>>>");
		return locToken.getAccess_token();
	}

}
