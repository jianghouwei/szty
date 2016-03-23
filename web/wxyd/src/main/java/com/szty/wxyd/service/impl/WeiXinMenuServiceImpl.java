package com.szty.wxyd.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.szty.wxyd.model.Button;
import com.szty.wxyd.model.ClickButton;
import com.szty.wxyd.model.Menu;
import com.szty.wxyd.model.RepMenuMode;
import com.szty.wxyd.service.WeiXinBaseService;
import com.szty.wxyd.service.WeiXinMenuService;
import com.szty.wxyd.util.HttpUtil;
import com.szty.wxyd.util.WeiXinConfing;

@Service
public class WeiXinMenuServiceImpl implements WeiXinMenuService {

	private static final Logger log = Logger.getLogger(WeiXinMenuServiceImpl.class);
	@Autowired
	private WeiXinConfing wxconfig;

	@Autowired
	private WeiXinBaseService weiXinBaseService;

	public RepMenuMode creatMenu(Menu menu) {
		String url = wxconfig.menuCreateUrl + "?access_token=" + weiXinBaseService.getWeiXinToKen();
		String json = JSON.toJSONString(setMenuData());
		log.info("创建菜单 请求参数：===》"+json);
		String res = HttpUtil.doPost(url, json);
		log.info("创建菜单：===》"+res);
		RepMenuMode rep = null;
		if (!res.isEmpty()) {
			rep = JSON.parseObject(res, RepMenuMode.class);
		}
		return rep;
	}

	public Menu getMenu() {
		String url = wxconfig.menuGetUrl + "?access_token=" + weiXinBaseService.getWeiXinToKen();
		String res = HttpUtil.doGet(url);
		log.info("获取菜单：===》"+res);
		Menu rep = null;
		if (!res.isEmpty()) {
			rep = JSON.parseObject(res, Menu.class);
		}
		return rep;
	}

	public RepMenuMode delMenu() {
		
		String url = wxconfig.menuDeleteUrl + "?access_token=" + weiXinBaseService.getWeiXinToKen();
		String res = HttpUtil.doGet(url);
		log.info("删除菜单：===》"+res);
		RepMenuMode rep = null;
		if (!res.isEmpty()) {
			rep = JSON.parseObject(res, RepMenuMode.class);
		}
		return rep;
	}

	public static Menu setMenuData() {
		
		
		Menu menu = new Menu();
		Button sub_button = new Button();
		
		ClickButton stepNow = new ClickButton();
		stepNow.setName("当前步数");
		stepNow.setType("click");
		stepNow.setKey("setp_now_count");

		ClickButton setcount = new ClickButton();
		setcount.setName("排行榜");
		setcount.setType("click");
		setcount.setKey("setp_all_count");
		
		sub_button.setSub_button(new Button[] { stepNow, setcount});
		sub_button.setName("Fitwear健康");
		
		ClickButton aboutUs = new ClickButton();
		aboutUs.setName("关于我们");
		aboutUs.setType("click");
		aboutUs.setKey("about_us");
	
		menu.setButton(new Button[] { sub_button, aboutUs});
		return menu;
	}

}
