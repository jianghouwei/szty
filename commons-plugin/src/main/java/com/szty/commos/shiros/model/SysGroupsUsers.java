package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysGroupsUsers extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private Long groupId;
	/****/
	 private Long userId;


	 public void setId(Long id){
		 this.id = id;
	}

	 public Long getId(){
		return this.id;
	}


	 public void setGroupId(Long groupId){
		 this.groupId = groupId;
	}

	 public Long getGroupId(){
		return this.groupId;
	}


	 public void setUserId(Long userId){
		 this.userId = userId;
	}

	 public Long getUserId(){
		return this.userId;
	}


}
