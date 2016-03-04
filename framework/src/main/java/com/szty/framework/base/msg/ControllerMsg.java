package com.szty.framework.base.msg;

/**
 * JSON 返回
 * ClassName: ControllerMsg <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 下午1:52:17 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public class ControllerMsg {

	/** 返回代码 **/
	private String code;
	/** 返回消息 **/
	private String msg;
	
	public ControllerMsg(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
