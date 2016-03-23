package com.szty.wxyd.model;

/**
 *
 * @ClassName: RespMsg
 * @Description: TODO(返回参数)
 * @author mao.ru
 * @date 2016年1月12日 下午4:10:38
 *
 */
public class RespMsg {

	private String ret_code;
	
	private String error_info;

	public String getRet_code() {
		return ret_code;
	}

	public void setRet_code(String ret_code) {
		this.ret_code = ret_code;
	}

	public String getError_info() {
		return error_info;
	}

	public void setError_info(String error_info) {
		this.error_info = error_info;
	}
	
	
}
