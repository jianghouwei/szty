package com.szty.commos.shiros.model.dto;

import java.util.List;

public class OntreeModel {

	private String id;
	private String text;
	private Boolean checked;
	private List<OntreeModel> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public List<OntreeModel> getChildren() {
		return children;
	}

	public void setChildren(List<OntreeModel> children) {
		this.children = children;
	}

}
