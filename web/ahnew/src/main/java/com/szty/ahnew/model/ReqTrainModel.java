package com.szty.ahnew.model;

/**
 *  火车查询请求参数
 * @ClassName: ReqTrainModel
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mao.ru
 * @date 2016年1月20日 下午5:05:33
 *
 */
public class ReqTrainModel {

	private String version;//接口版本号
	private String train;//车次
	private String from;//出发站
	private String to;//到达站
	private String date;//日期
	
	private String userId;//请求用户
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTrain() {
		return train;
	}
	public void setTrain(String train) {
		this.train = train;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
