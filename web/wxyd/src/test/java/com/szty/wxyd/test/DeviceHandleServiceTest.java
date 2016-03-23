package com.szty.wxyd.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.szty.wxyd.dao.WxDeviceMapper;
import com.szty.wxyd.model.BindModel;
import com.szty.wxyd.model.CodeList;
import com.szty.wxyd.model.CreateQrcode;
import com.szty.wxyd.model.DeviceModel;
import com.szty.wxyd.model.QrcodeMode;
import com.szty.wxyd.model.ResDeviceModel;
import com.szty.wxyd.model.SetpModel;
import com.szty.wxyd.service.DeviceHandleService;
import com.szty.wxyd.service.WeiXinBaseService;
import com.szty.wxyd.util.HttpUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring.xml",
		"classpath*:/spring-mybatis.xml", "classpath*:/spring-mvc.xml", })
public class DeviceHandleServiceTest {

	/*
	 * 1:获取机器唯一编码(由微信分配) 2:授权微信建立信任机制 3:绑定硬件
	 */
	@Autowired
	private DeviceHandleService derHandleService;

	@Autowired
	private WxDeviceMapper wxDeviceMapper;

	/**
	 * 备注 deviceid由微信服务器分配
	 * 
	 * @Title: getQrcode
	 * @author mao.ru
	 * @Description: TODO(第三方获取deviceid和设备二维码)
	 * @param 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	@Test
	public void getQrcode() {
		QrcodeMode qm = derHandleService.setDirverQrcode();
		System.out.println("=====================>>>>>:[" + qm.getDeviceid()
				+ qm.getQrticket() + "]");

	}

	/**
	 * 
	 * @Title: setAuthorizeDevice
	 * @author mao.ru
	 * @Description: TODO(设备授权--更新)
	 * @param @return 设定文件
	 * @return String 返回类型  890000199999
	 * @throws
	 */
	@Test
	public void setAuthorizeDevice() {

		ResDeviceModel resModel = new ResDeviceModel();
		List<DeviceModel> device_list = new ArrayList<DeviceModel>();
		DeviceModel dm = new DeviceModel();
		dm.setId("890000111111");
		dm.setMac("80618F5367BB");
		dm.setAuth_key("");
		dm.setAuth_ver("0");// 为0
		dm.setConnect_protocol("3");
		dm.setClose_strategy("1");
		dm.setConn_strategy("1");
		dm.setCrypt_method("0");
		dm.setManu_mac_pos("-1");
		dm.setSer_mac_pos("-2");
		dm.setBle_simple_protocol("0");
		device_list.add(dm);
		resModel.setDevice_list(device_list);
		resModel.setDevice_num(String.valueOf(device_list.size()));
		resModel.setOp_type("0");// 更新
		resModel.setProduct_id("5793");// 新接口不需要
		String str = derHandleService.setAuthorizeDevice(resModel);
		System.out.println("=====================>>>>>:[" + str + "]");
	}

	// @Test
	public void getCreateQrcode() {
		CreateQrcode createQrcode = new CreateQrcode();
		List<String> list = new ArrayList<String>();
		list.add("gh_1357217ef858_6d2040a1bb17089a");
		createQrcode.setDevice_id_list(list);
		createQrcode.setDevice_num(String.valueOf(list.size()));
		CodeList str = derHandleService.getCreateQrcode(createQrcode);
		System.out.println("=====================>>>>>:["
				+ str.getCode_list().get(0).getTicket() + "]");

	}

	/**
	 * 
	 * @Title: setBindDevice
	 * @author mao.ru
	 * @Description: TODO(绑定设备)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	@Test
	public void setCompelBindDevice() {
		// BindModel bindModel = new BindModel();
		// bindModel.setDevice_id("gh_1357217ef858_6d2040a1bb17089a");
		// bindModel.setOpenid("oYC7Pt8MOJXL71fnYfgXGNd4MB2A");// 接收人
		// String str = derHandleService.setCompelBindDevice(bindModel);
		// System.out.println("=====================>>>>>:[" + str + "]");

		BindModel bindModel = new BindModel();
		bindModel.setDevice_id("890000199988");
		bindModel.setTicket("http://we.qq.com/d/AQBMrvGOwnGhKq-EzYbAl6FWlx0Qq1NXo0WnVTJ2");
		bindModel.setOpenid("oTK7xjvdV_HkunkUES7zHi7nmx-g");// 接收人
		String str = derHandleService.setCompelBindDevice(bindModel);
		System.out.println("=====================>>>>>:[" + str + "]");
	}

	/**
	 * 
	 * @Title: setUnBindDevice
	 * @author mao.ru
	 * @Description: TODO(解绑设备)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	// @Test
	public void setCompelUnBindDevice() {

	}

	/**
	 * 
	 * @Title: setStep
	 * @author mao.ru
	 * @Description: TODO(上传当前步数)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	// @Test
	public void setStep() {
		SetpModel setpModel = new SetpModel();
		setpModel.setOpenid("oYC7Pt8MOJXL71fnYfgXGNd4MB2A");
		setpModel.setStep("10");
		String str = derHandleService.setStep(setpModel);
		System.out.println("=====================>>>>>:[" + str + "]");

	}

	@Autowired
	private WeiXinBaseService weiXinBaseService;

	/**
	 * 
	 * @Title: test
	 * @author mao.ru
	 * @Description: TODO(查询设备状态)
	 * @param 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	@Test
	public void test() {
		String url = "https://api.weixin.qq.com/device/get_stat?access_token="
				+ weiXinBaseService.getWeiXinToKen()
				+ "&device_id=890000111111";
		String str = HttpUtil.doGet(url);
		System.out.println(str);
	}

	/**
	 * 
	 * @Title: test2
	 * @author mao.ru
	 * @Description: TODO(获取设备二维码)
	 * @param 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	@Test
	public void test2() {
		CreateQrcode cq = new CreateQrcode();
		List<String> device_id_list = new ArrayList<String>();
		device_id_list.add("890000111111");
		cq.setDevice_id_list(device_id_list);
		cq.setDevice_num(String.valueOf(device_id_list.size()));
		CodeList str = derHandleService.getCreateQrcode(cq);
		System.out.println("=====================>>>>>:["
				+ str.getCode_list().get(0).getDevice_id() + "====>>"
				+ str.getCode_list().get(0).getTicket() + "]");
	}

}
