package com.szty.wxyd.msg.model;

/**
 * 
 * @ClassName: Event
 * @Description: TODO(自定义菜单事件)
 * @author mao.ru
 * @date 2016年1月13日 上午11:45:45
 *
 */
public class Event extends BaseMessage {

	private String Event;// 事件类型，CLICK
	
	private String EventKey;// 事件KEY值，与自定义菜单接口中KEY值对应
	
	public String getEvent() {
		return Event;
	}
	public void setEvent(String event) {
		Event = event;
	}
	public String getEventKey() {
		return EventKey;
	}
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}
	
	
}
