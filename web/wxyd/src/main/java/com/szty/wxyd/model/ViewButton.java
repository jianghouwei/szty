package com.szty.wxyd.model;

public class ViewButton extends Button {

	private String url;// view类型必须 网页链接，用户点击菜单可打开链接，不超过1024字节

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
