package com.szty.sms.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Service;

import com.szty.sms.service.SmsService;
import com.szty.sms.utils.MsmModel;
import com.szty.sms.utils.SendSms;
import com.szty.sms.utils.smsProperject;

@Service
public class SmsServiceImpl implements SmsService {

	private static final Logger log = Logger.getLogger(SmsServiceImpl.class);


	@Autowired
	private EhCacheCacheManager springCacheManager;


	@Override
	public Boolean sendMsm(String mobile,Long time ) {
		// 获取验证码
		String content = smsProperject.getSmsCode();
		log.info("后台生成验证码："+content);
		// 发送验证码
		String code = SendSms.sendSms(mobile, content);
		if (!content.equals(code)) {
			log.info("ERROR====发送失败：>>>>>>>content="+"后台生成验证码："+content +"&&&&&发送返回code="+code );
			return Boolean.FALSE;
		}
		log.info("SUFFICESS====发送成功：>>>>>>>content="+"后台生成验证码："+content +"&&&&&发送返回code="+code );
		this.setMsmModel(mobile, time , code);
		return Boolean.TRUE;
	}

	@Override
	public Boolean isMsm(String mobile, String code) {
		Cache cache = springCacheManager.getCache("OtaJsonFileCache");
		String key = "sms." + mobile;
		MsmModel sms = cache.get(key, MsmModel.class);
		if(sms != null && sms.getCode().equals(code)){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	/**
	 * 当前请求手机号码能否发送短信
	 * isSendMsm:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @return
	 * @since JDK 1.7
	 */
	public Boolean isSendMsm(String mobile, Long time ) {
		Cache cache = springCacheManager.getCache("OtaJsonFileCache");
		String key = "sms." + mobile;
		MsmModel sms = cache.get(key, MsmModel.class);
		if (sms == null) {
			return Boolean.TRUE;
		} else {
			if(time.longValue() - smsProperject.mis.longValue() >= sms.getDataTime().longValue()){
				return Boolean.TRUE;
			}else{
				
				if(sms.getCount().intValue() < smsProperject.SMS_COUNT.intValue() ){
					return Boolean.TRUE;
				}
				//间隔时间大于一分钟
				if(time-sms.getUpdateTime() > smsProperject.submis){
					return Boolean.TRUE;
				}
			}
		}
		return Boolean.FALSE;
	}

	/**
	 * 更新值
	 * setMsmModel:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author mao.ru
	 * @param mobile
	 * @param time
	 * @param code
	 * @since JDK 1.7
	 */
	protected void setMsmModel(String mobile, Long time, String code) {
		Cache cache = springCacheManager.getCache("OtaJsonFileCache");
		String key = "sms." + mobile;
		MsmModel sms = cache.get(key, MsmModel.class);
		if (sms == null ) {
			log.info("SUFFICESS====：>>>>>>>该手机号第一次使用======");
			sms = new MsmModel();
			sms.setCount(1);
			sms.setDataTime(time);
		} else {
			log.info("SUFFICESS====读取缓存信息成功：>>>>>>>"+sms.toString());
			sms.setCount(sms.getCount().intValue() + 1);
			if(time - sms.getDataTime() > smsProperject.mis){
				//缓存记录大于一天，清空记录
				sms.setCount(1);
				sms.setDataTime(time);
			}
		}
		sms.setMobile(mobile);
		sms.setCode(code);
		sms.setUpdateTime(time);
		log.info("SUFFICESS====写入缓存成功：>>>>>>>"+sms.toString());
		cache.put(key, sms);
		
	}


}
