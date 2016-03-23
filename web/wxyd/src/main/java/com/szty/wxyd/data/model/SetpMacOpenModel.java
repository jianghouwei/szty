package com.szty.wxyd.data.model;

import java.util.Date;


/**
 * mac 和Step 以及openmodel
 * @ClassName: SetpMacOpenModel
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mao.ru
 * @date 2016年1月14日 下午1:27:23
 *
 */
public class SetpMacOpenModel {


    private String mac;

    private String connectProtocol;

    private String authKey;

    private String closeStrategy;

    private String connStrategy;

    private String cryptMethod;

    private String authVer;

    private String manuMacPos;

    private String serMacPos;

    private String bleSimpleProtocol;
    
    private String deviceid;
    
    private String openId;

    private String stepNow;
    
    private Date createTime;

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getConnectProtocol() {
		return connectProtocol;
	}

	public void setConnectProtocol(String connectProtocol) {
		this.connectProtocol = connectProtocol;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getCloseStrategy() {
		return closeStrategy;
	}

	public void setCloseStrategy(String closeStrategy) {
		this.closeStrategy = closeStrategy;
	}

	public String getConnStrategy() {
		return connStrategy;
	}

	public void setConnStrategy(String connStrategy) {
		this.connStrategy = connStrategy;
	}

	public String getCryptMethod() {
		return cryptMethod;
	}

	public void setCryptMethod(String cryptMethod) {
		this.cryptMethod = cryptMethod;
	}

	public String getAuthVer() {
		return authVer;
	}

	public void setAuthVer(String authVer) {
		this.authVer = authVer;
	}

	public String getManuMacPos() {
		return manuMacPos;
	}

	public void setManuMacPos(String manuMacPos) {
		this.manuMacPos = manuMacPos;
	}

	public String getSerMacPos() {
		return serMacPos;
	}

	public void setSerMacPos(String serMacPos) {
		this.serMacPos = serMacPos;
	}

	public String getBleSimpleProtocol() {
		return bleSimpleProtocol;
	}

	public void setBleSimpleProtocol(String bleSimpleProtocol) {
		this.bleSimpleProtocol = bleSimpleProtocol;
	}

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

	public String getStepNow() {
		return stepNow;
	}

	public void setStepNow(String stepNow) {
		this.stepNow = stepNow;
	}

	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "SetpMacOpenModel [mac=" + mac + ", connectProtocol="
				+ connectProtocol + ", authKey=" + authKey + ", closeStrategy="
				+ closeStrategy + ", connStrategy=" + connStrategy
				+ ", cryptMethod=" + cryptMethod + ", authVer=" + authVer
				+ ", manuMacPos=" + manuMacPos + ", serMacPos=" + serMacPos
				+ ", bleSimpleProtocol=" + bleSimpleProtocol + ", deviceid="
				+ deviceid + ", openId=" + openId + ", stepNow=" + stepNow
				+ "]";
	}
    
    

}