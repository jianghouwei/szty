package com.szty.sms.utils;

import java.util.Random;

/**
 * 短息用户名密码配置 ClassName: smsProperject <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月18日 上午10:22:03 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
public class smsProperject {

	/** 短信发送url */
	public static final String SMS_URL = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";

	/** 短信发送用户名 */
	public static final String SMS_ACCOUNT = "cf_szty";

	/** 短信发送密码 */
	public static final String SMS_PSSWORD = "szty1234";
	
	/** 短信发送一日限制次数 */
	public static final Integer SMS_COUNT = 50;

	/** 验证码长度设置  */
	public static final Integer CODE_LENTH = 6;
	
	/** 验证统计有效时间  1天*/
	public static final Long mis = 86400000L;
	
	/** 验证码发送间隔时间 1分钟*/
	public static final Long submis = 60000L;
	/**
	 * 获取短信验证码
	 * getSmsCode:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @return
	 * @since JDK 1.7
	 */
	public static String getSmsCode() {
//		int mobile_code = (int) ((Math.random() * 9 + 1) * 100000);
		Random rm = new Random();  
	    double mobile_code = (1 + rm.nextDouble()) * Math.pow(10, CODE_LENTH);  
		return String.valueOf(mobile_code);
	}
	
	
	

}
