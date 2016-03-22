package com.szty.dd.order.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.szty.commos.utils.DateUtil;
import com.szty.commos.utils.HttpUtil;

/**
 * 
 * ClassName: DOrderUtils <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月21日 下午5:02:31 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public class DOrderUtils {

	/**
	 * androidPnUrl
	 */
	//protected static final String url = "http://localhost:8080/androidpn/notification_api_send.do";
	protected static final String url = "http://121.42.47.224/androidpn/notification_api_send.do";
	/**
	 * 时间+业务编码++随机数
	 * getOrderId:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @return
	 * @since JDK 1.7
	 */
	public static String getOrderId(String route){
//		String random = String.valueOf((UUID.randomUUID().getLeastSignificantBits())).replaceAll("-", "");
//		System.out.println(random.length());
//		StringBuffer str = new StringBuffer();
//		str.append(DateUtil.getDateNow()).append(route).append(random);
		String str = UUID.randomUUID().toString().replaceAll("-", "");
		return str;
	}
	
	/**
	 * 
	 * sendAndroidPn:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param username
	 * @param msg
	 * @param broadcast
	 * @since JDK 1.7
	 */
	public static void sendAndroidPn(String username,String msg){
		Map<String ,Object> params = new HashMap<String ,Object>();
		params.put("broadcast", "N");
		params.put("username", username);
		params.put("message", msg);
		params.put("title", "抢单司机");
		params.put("uri", "联络os");
		HttpUtil.doPost(url, params);
	}
	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString()+ "=== "+ UUID.randomUUID().toString().length());
		System.out.println(DateUtil.getDateNow()+"====" +DateUtil.getDateNow().length());
		System.out.println(DateUtil.getDateNow());
		System.out.println(getOrderId("dd")+"++"+ getOrderId("dd").length());
		//System.out.println(UUID.randomUUID().getMostSignificantBits());
	}
}
