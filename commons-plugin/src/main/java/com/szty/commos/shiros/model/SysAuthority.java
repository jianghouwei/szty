package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysAuthority extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private Long resoucesId;
	 
	 private String resoucesCode;
	 
	 private String resoucesAuth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getResoucesId() {
		return resoucesId;
	}

	public void setResoucesId(Long resoucesId) {
		this.resoucesId = resoucesId;
	}

	public String getResoucesCode() {
		return resoucesCode;
	}

	public void setResoucesCode(String resoucesCode) {
		this.resoucesCode = resoucesCode;
	}

	public String getResoucesAuth() {
		return resoucesAuth;
	}

	public void setResoucesAuth(String resoucesAuth) {
		this.resoucesAuth = resoucesAuth;
	}



}
