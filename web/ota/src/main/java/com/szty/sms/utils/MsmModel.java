package com.szty.sms.utils;

public class MsmModel {

	
	private String mobile;
	
	/**发送次数**/
	private Integer count;
	
	/**当天第一更新发送时间**/
	private Long dataTime;
	
	/** 本次发送验证码  */
	private String code;
	
	/** 本次发送验证码  */
	private Long updateTime;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Long getDataTime() {
		return dataTime;
	}

	public void setDataTime(Long dataTime) {
		this.dataTime = dataTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "MsmModel [mobile=" + mobile + ", count=" + count + ", dataTime=" + dataTime + ", code=" + code
				+ ", updateTime=" + updateTime + "]";
	}

	
	
}
