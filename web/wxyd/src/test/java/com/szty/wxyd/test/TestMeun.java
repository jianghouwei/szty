package com.szty.wxyd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.szty.wxyd.service.WeiXinMenuService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath*:/spring.xml","classpath*:/spring-mybatis.xml","classpath*:/spring-mvc.xml",} )
public class TestMeun {

	@Autowired
	private WeiXinMenuService weiXinMenuService;

	//@Test
	public void getMeun() {
		weiXinMenuService.getMenu();
	}
	@Test
	public void delMeun() {
		weiXinMenuService.delMenu();
	}
	//@Test
	public void createMeun() {
		weiXinMenuService.creatMenu(null);
	}
	@Test
	public void test(){
		
	}
}
