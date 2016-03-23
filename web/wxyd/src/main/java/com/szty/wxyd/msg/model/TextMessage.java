package com.szty.wxyd.msg.model;

/**
 * 
 * @ClassName: TextMessage
 * @Description: TODO(文本消息)
 * @author mao.ru
 * @date 2016年1月13日 上午9:40:06
 *
 */
public class TextMessage extends BaseMessage {
	// 回复的消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
