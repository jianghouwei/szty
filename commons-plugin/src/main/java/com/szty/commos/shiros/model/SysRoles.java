package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysRoles extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private String roleName;
	/****/
	 private String roleCode;
	/****/
	 private String isEnable;
	/****/
	 private String isDelete;
	/****/
	 private String updateUser;
	/****/
	 private String updateTime;
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


	 public void setRoleName(String roleName){
		 this.roleName = roleName;
	}

	 public String getRoleName(){
		return this.roleName;
	}


	 public void setRoleCode(String roleCode){
		 this.roleCode = roleCode;
	}

	 public String getRoleCode(){
		return this.roleCode;
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


	 public void setUpdateUser(String updateUser){
		 this.updateUser = updateUser;
	}

	 public String getUpdateUser(){
		return this.updateUser;
	}


	 public void setUpdateTime(String updateTime){
		 this.updateTime = updateTime;
	}

	 public String getUpdateTime(){
		return this.updateTime;
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
