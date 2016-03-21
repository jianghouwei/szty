package com.szty.sms.service;

/**
 * 短信服务
 * ClassName: SmsService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月18日 上午10:40:13 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public interface SmsService {
	
	/**
	 * 短信发送
	 * sendMsm:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param mobile
	 * @return
	 * @since JDK 1.7
	 */
	public Boolean sendMsm(String mobile,Long time);
	
	
	/**
	 * 短信发送校验  每天同一个号码只能发送50次
	 * sendMsm:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param mobile
	 * @return
	 * @since JDK 1.7
	 */
	public Boolean isSendMsm(String mobile, Long time);
	
	
	/**
	 * 短信验证码校验
	 * sendMsm:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param mobile
	 * @return
	 * @since JDK 1.7
	 */
	public Boolean isMsm(String mobile,String code);

}
