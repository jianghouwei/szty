package com.szty.ahnew.model;

import java.util.List;

public class TrainContent {

	private String task;
	private String query;
	private String searchQuery;
	private String confidence;
	private List<TrainData> data;
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getSearchQuery() {
		return searchQuery;
	}
	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}
	public String getConfidence() {
		return confidence;
	}
	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}
	public List<TrainData> getData() {
		return data;
	}
	public void setData(List<TrainData> data) {
		this.data = data;
	}
	
	
}
