package com.szty.wxyd.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @ClassName: WeiXinResModel
 * @Description: TODO(微信获取本地token验证)
 * @author mao.ru
 * @date 2016年1月8日 下午12:52:06
 *
 */
public class WeiXinResModel {

	/**
	 * 微信加密签名
	 */
	private String signature;
	/**
	 * 时间戳
	 */
	private String timestamp;
	/**
	 * 随机数
	 */
	private String nonce;
	/**
	 * 随机字符串
	 */
	private String echostr;
	
	/**
	 * 本地ToKen
	 */
	private String token;

	/**
	 * 入参时间 日志记录
	 */
	private Date date;

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getEchostr() {
		return echostr;
	}

	public void setEchostr(String echostr) {
		this.echostr = echostr;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


	@Override
	public String toString() {
		return "WeiXinResModel [signature=" + signature + ", timestamp="
				+ timestamp + ", nonce=" + nonce + ", echostr=" + echostr
				+ ", token=" + token + ", date=" + date + "]";
	}

	public WeiXinResModel(String signature, String timestamp, String nonce,
			String echostr,String token) {
		super();
		this.date = new Date();
		this.signature = signature;
		this.timestamp = timestamp;
		this.nonce = nonce;
		this.echostr = echostr;
		this.token = token;
	}

	/**
	 * @Title: getSequenceFiles
	 * @author mao.ru
	 * @Description: TODO(获取字典排序后的属性值)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String getSequenceFiles() {
		List<String> list = new ArrayList<String>();
		list.add(this.token);
		list.add(this.timestamp);
		list.add(this.nonce);
		StringBuffer sb = new StringBuffer();
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).trim());
		}
		return sb.toString();
	}

}
