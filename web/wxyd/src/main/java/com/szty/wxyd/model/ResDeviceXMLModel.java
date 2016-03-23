package com.szty.wxyd.model;

/**
 * 
 * @ClassName: ResDeviceModel
 * @Description: TODO(设备绑定或者解绑微信发给第三方参数)
 * @author mao.ru
 * @date 2016年1月12日 下午2:25:37
 *
 */
public class ResDeviceXMLModel {

	private String ToUserName;// 接收方（公众号）的user name
	private String FromUserName;// 发送方（微信用户）的user name
	private String CreateTime;// 消息创建时间，消息后台生成
	private String MsgType;// 消息类型：device_text
	private String DeviceType;// 设备类型，目前为“公众账号原始ID”
	private String DeviceID;// 设备ID，第三方提供
	private String Content;// 消息内容，BASE64编码
	private String SessionID;// 微信客户端生成的session
								// id，用于request和response对应，因此响应中该字段第三方需要原封不变的带回
	private String MsgId;// 消息id，微信后台生成
	private String OpenID;// 微信用户账号的OpenID
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(String deviceType) {
		DeviceType = deviceType;
	}
	public String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(String deviceID) {
		DeviceID = deviceID;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getSessionID() {
		return SessionID;
	}
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	public String getOpenID() {
		return OpenID;
	}
	public void setOpenID(String openID) {
		OpenID = openID;
	}
	
	
}
