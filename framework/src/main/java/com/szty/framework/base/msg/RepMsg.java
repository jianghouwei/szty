package com.szty.framework.base.msg;

import com.alibaba.fastjson.JSON;

public class RepMsg {

	private String result;

	private String msg;

	private String orderId;

	public RepMsg(String code, String msg) {
		super();
		this.result = code;
		this.msg = msg;
	}

	public RepMsg(String result, String msg, String orderId) {
		super();
		this.result = result;
		this.msg = msg;
		this.orderId = orderId;
	}

	public static String JsonMsg(String result, String msg, String orderId) {

		return JSON.toJSONString(new RepMsg(result, msg,orderId));
	}

	public static String JsonMsg(String result, String msg) {

		return JSON.toJSONString(new RepMsg(result, msg));
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
