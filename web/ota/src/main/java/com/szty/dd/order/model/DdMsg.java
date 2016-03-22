package com.szty.dd.order.model;

import com.alibaba.fastjson.JSON;

public class DdMsg {

	private String errno;

	private String errmsg;
	
	public DdMsg(String errno, String errmsg) {
		super();
		this.errno = errno;
		this.errmsg = errmsg;
	}

	public static String JsonMsg(String errno, String errmsg) {
		return JSON.toJSONString(new DdMsg(errno, errmsg));
	}

	public String getErrno() {
		return errno;
	}

	public void setErrno(String errno) {
		this.errno = errno;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}
