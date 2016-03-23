package com.szty.wxyd.model;

/**
 * 
 * @ClassName: BindModel
 * @Description: TODO(绑定和解绑参数)
 * @author mao.ru
 * @date 2016年1月12日 下午5:22:43
 *
 */
public class BindModel {

	private String ticket;
	private String device_id;
	private String openid;
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	
}
