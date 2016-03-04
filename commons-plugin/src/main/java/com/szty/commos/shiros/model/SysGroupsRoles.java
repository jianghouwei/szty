package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysGroupsRoles extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private Long groupsId;
	/****/
	 private Long rolesId;


	 public void setId(Long id){
		 this.id = id;
	}

	 public Long getId(){
		return this.id;
	}


	 public void setGroupsId(Long groupsId){
		 this.groupsId = groupsId;
	}

	 public Long getGroupsId(){
		return this.groupsId;
	}


	 public void setRolesId(Long rolesId){
		 this.rolesId = rolesId;
	}

	 public Long getRolesId(){
		return this.rolesId;
	}


}
