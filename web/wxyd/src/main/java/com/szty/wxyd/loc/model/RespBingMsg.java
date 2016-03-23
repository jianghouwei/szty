package com.szty.wxyd.loc.model;

public class RespBingMsg extends RespBaseMsg {

	private String deviceid;

	private String openId;
	
	private String publicOpenId;
	
	private String qrticket;
	
	private String mac;

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPublicOpenId() {
		return publicOpenId;
	}

	public void setPublicOpenId(String publicOpenId) {
		this.publicOpenId = publicOpenId;
	}

	public String getQrticket() {
		return qrticket;
	}

	public void setQrticket(String qrticket) {
		this.qrticket = qrticket;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}
	
	
}
