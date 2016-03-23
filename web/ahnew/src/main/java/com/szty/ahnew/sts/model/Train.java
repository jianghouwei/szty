package com.szty.ahnew.sts.model;

import java.util.List;

public class Train {

    private String trainType;//快速",     
    private String trainNo;//K1206/K1207",
    private String from;//南宁",          
    private String to;//深圳东",          
    private String startTime;//22:10",    
    private String endTime;//13:49",      
    private String duration;//15小时39分",
    private List<SeatInfo> seatInfos;
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public List<SeatInfo> getSeatInfos() {
		return seatInfos;
	}
	public void setSeatInfos(List<SeatInfo> seatInfos) {
		this.seatInfos = seatInfos;
	}
    
    

}
