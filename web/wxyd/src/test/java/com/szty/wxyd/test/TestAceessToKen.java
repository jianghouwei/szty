package com.szty.wxyd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.szty.wxyd.service.WeiXinBaseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath*:/spring.xml","classpath*:/spring-mybatis.xml","classpath*:/spring-mvc.xml",} )
public class TestAceessToKen{

	@Autowired
	private WeiXinBaseService baseService;

	//@Test
	public void getWXtoKen() {
//		String ret = baseService.getWeiXinToKen();
//		System.out.println(ret);
	}
}
