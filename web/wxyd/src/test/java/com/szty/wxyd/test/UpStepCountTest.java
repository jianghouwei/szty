package com.szty.wxyd.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.szty.wxyd.data.model.SetpMacOpenModel;
import com.szty.wxyd.service.StepLocalService;
import com.szty.wxyd.util.HttpUtil;

/**
 * Service 层测试
 * 
 * @ClassName: UpStepCountTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mao.ru
 * @date 2016年1月18日 上午11:45:43
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//,"classpath*:/com/szty/wxyd/dao/*Mapper.xml"
@ContextConfiguration(locations ={"classpath*:/spring.xml","classpath*:/spring-mybatis.xml","classpath*:/spring-mvc.xml"} )
public class UpStepCountTest {

	@Autowired
	private StepLocalService stepLocalService;

	/**
	 * 
	 * @Title: isRegister
	 * @author mao.ru
	 * @Description: TODO(验证是否要注册，是否绑定， 是否授权)
	 * @param 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	//@Test
	public void isRegister() {
		SetpMacOpenModel smom = setSetpMacOpenModel();
		stepLocalService.isRegister(smom);
	}
	
	//@Test
	public void registerMacInfo() throws Exception{
		SetpMacOpenModel smom = setSetpMacOpenModel();
		stepLocalService.postDerviceId(smom);
	}
	
	public static SetpMacOpenModel setSetpMacOpenModel(){
		SetpMacOpenModel  smom = new SetpMacOpenModel();
		smom.setStepNow("100");
		smom.setAuthKey("");
		smom.setAuthVer("0");
		smom.setBleSimpleProtocol("0");
		smom.setCloseStrategy("1");
		smom.setConnectProtocol("3");
		smom.setConnStrategy("1");
		smom.setCryptMethod("0");
		smom.setMac("E4F89C0B3520");
		smom.setManuMacPos("-2");
		smom.setSerMacPos("-2");
		smom.setOpenId("oYC7Pt8MOJXL71fnYfgXGNd4MB2A");
		return smom;
	}
	@Test
	public  void isbind(){
		
	}
    public static void main(String[] args) {
    	Map<String,Object> map = new HashMap<String,Object>();
		map.put("mac", "E4F89C0B3520");
		SetpMacOpenModel sm = new SetpMacOpenModel();
		sm.setMac("");
		String json = JSON.toJSONString("E4F89C0B3520");
		String url = "http://localhost:8080/web-wxyd/isBind?mac='E4F89C0B3520'";
		String st = HttpUtil.doPost(url);
//		String st = HttpUtil.doPost("", map);
		//String st = HttpUtil.doPost(url, json);
		System.out.println(st);
	}
}
