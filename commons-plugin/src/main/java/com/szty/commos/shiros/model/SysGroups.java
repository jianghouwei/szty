package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysGroups extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private String groupName;
	/**组别编码**/
	 private String groupCode;
	/**是否禁用**/
	 private String isEnable;
	/****/
	 private String isDelete;
	/****/
	 private String updateTime;
	/****/
	 private String updateUser;
	/****/
	 private String createTime;
	/****/
	 private String createUser;


	 public void setId(Long id){
		 this.id = id;
	}

	 public Long getId(){
		return this.id;
	}


	 public void setGroupName(String groupName){
		 this.groupName = groupName;
	}

	 public String getGroupName(){
		return this.groupName;
	}


	 public void setGroupCode(String groupCode){
		 this.groupCode = groupCode;
	}

	 public String getGroupCode(){
		return this.groupCode;
	}


	 public void setIsEnable(String isEnable){
		 this.isEnable = isEnable;
	}

	 public String getIsEnable(){
		return this.isEnable;
	}


	 public void setIsDelete(String isDelete){
		 this.isDelete = isDelete;
	}

	 public String getIsDelete(){
		return this.isDelete;
	}


	 public void setUpdateTime(String updateTime){
		 this.updateTime = updateTime;
	}

	 public String getUpdateTime(){
		return this.updateTime;
	}


	 public void setUpdateUser(String updateUser){
		 this.updateUser = updateUser;
	}

	 public String getUpdateUser(){
		return this.updateUser;
	}


	 public void setCreateTime(String createTime){
		 this.createTime = createTime;
	}

	 public String getCreateTime(){
		return this.createTime;
	}


	 public void setCreateUser(String createUser){
		 this.createUser = createUser;
	}

	 public String getCreateUser(){
		return this.createUser;
	}


}
