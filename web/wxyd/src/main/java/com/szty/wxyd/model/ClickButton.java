package com.szty.wxyd.model;

public class ClickButton extends Button {

	private String key;// click等点击类型必须 菜单KEY值，用于消息接口推送，不超过128字节

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
