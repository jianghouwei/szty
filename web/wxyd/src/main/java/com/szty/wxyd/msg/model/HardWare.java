package com.szty.wxyd.msg.model;

/**
 * 微信运动消息返回
 * 
 * @ClassName: HardWare
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mao.ru
 * @date 2016年1月13日 下午12:05:56
 *
 */
public class HardWare {

	private String MessageView;// 消息展示，目前支持myrank（排行榜）
	private String MessageAction;// 消息点击动作，目前支持ranklist（点击跳转排行榜）

	public String getMessageView() {
		return MessageView;
	}

	public void setMessageView(String messageView) {
		MessageView = messageView;
	}

	public String getMessageAction() {
		return MessageAction;
	}

	public void setMessageAction(String messageAction) {
		MessageAction = messageAction;
	}

}
