package com.szty.dd.order.service;

import java.util.UUID;

import com.szty.commos.utils.DateUtil;

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
		String random = String.valueOf((UUID.randomUUID().getLeastSignificantBits())).replaceAll("-", "");
		System.out.println(random.length());
		StringBuffer str = new StringBuffer();
		str.append(DateUtil.getDateNow()).append(route).append(random);
		return str.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString()+ "=== "+ UUID.randomUUID().toString().length());
		System.out.println(DateUtil.getDateNow()+"====" +DateUtil.getDateNow().length());
		System.out.println(DateUtil.getDateNow());
		System.out.println(getOrderId("dd")+"++"+ getOrderId("dd").length());
		//System.out.println(UUID.randomUUID().getMostSignificantBits());
	}
}
