package com.szty.ahnew.util;

public class ResponseMsg {

	private String status;//返回码
	private String msg;//返回描述
	private Object content;//返回数据
	
	public ResponseMsg(String code, String msg, Object content) {
		super();
		this.status = code;
		this.msg = msg;
		this.content = content;
	}
	
	public ResponseMsg(String code, String msg) {
		super();
		this.status = code;
		this.msg = msg;
	}
	public String getCode() {
		return status;
	}
	public void setCode(String code) {
		this.status = code;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}


	
}