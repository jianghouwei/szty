package com.szty.wxyd.model;

public class Button {

	private Button[] sub_button;// 二级菜单数组，个数应为1~5个
	private String type;// 菜单的响应动作类型
	private String name;// 菜单标题，不超过16个字节，子菜单不超过40个字节

	// private String media_id;// media_id类型和view_limited类型必须//
	// 调用新增永久素材接口返回的合法media_id
	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
