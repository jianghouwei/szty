package com.szty.framework.base.msg;

import com.alibaba.fastjson.JSON;

public class RepMsg {

	private String result;

	private String msg;

	public RepMsg(String code, String msg) {
		super();
		this.result = code;
		this.msg = msg;
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

}
