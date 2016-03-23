package com.szty.wxyd.loc.model;

/**
 * 
 * @ClassName: RespBaseMsg
 * @Description: TODO(app返回基础类)
 * @author mao.ru
 * @date 2016年1月20日 上午11:57:09
 *
 */
public class RespBaseMsg {
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
