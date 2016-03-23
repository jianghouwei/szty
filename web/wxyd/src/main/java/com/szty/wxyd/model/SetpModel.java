package com.szty.wxyd.model;

/**
 * 上传步骤
 * 
 * @ClassName: SetpModel
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mao.ru
 * @date 2016年1月12日 下午5:33:22
 *
 */
public class SetpModel {

	private String openid;// 请求用户账号（openID）

	private String access_token;// 请求来源账号(access_token)

	private String timestamp;// 今日上报今天的步数，只能在今天的0点到第二天的凌晨1点上报今天的步数，否则不算。

	private String step;// 设置用户的每日步数

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

}
