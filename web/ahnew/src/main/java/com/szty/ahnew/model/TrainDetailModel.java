package com.szty.ahnew.model;

import java.util.List;

/**
 * 
 * @ClassName: TrainDetailModel
 * @Description: TODO(车次详情)
 * @author mao.ru
 * @date 2016年1月21日 上午10:45:26
 *
 */
public class TrainDetailModel {

	private String startDate;// "2016-01-20"
	private String destinationCity;
	private String linkUrl;
	private String departureCity;
	private String isEnd;
	private String isStart;
	private String ticketStatus;
	private String endStation;
	private String number;
	private String endTime;
	private String startTime;
	private String duration;
	private String startStation;
	private List<TrainSeatModel> seats;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getIsEnd() {
		return isEnd;
	}

	public void setIsEnd(String isEnd) {
		this.isEnd = isEnd;
	}

	public String getIsStart() {
		return isStart;
	}

	public void setIsStart(String isStart) {
		this.isStart = isStart;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public List<TrainSeatModel> getSeats() {
		return seats;
	}

	public void setSeats(List<TrainSeatModel> seats) {
		this.seats = seats;
	}

}
