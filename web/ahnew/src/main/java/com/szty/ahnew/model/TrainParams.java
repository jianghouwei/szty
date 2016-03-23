package com.szty.ahnew.model;

import java.util.List;

public class TrainParams {

	/**
	 * 火车 背景颜色  默认：train
	 */
	private String background ;
	
	private List<TrainDetailModel> details;

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public List<TrainDetailModel> getDetails() {
		return details;
	}

	public void setDetails(List<TrainDetailModel> details) {
		this.details = details;
	}


	
}
