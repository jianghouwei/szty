package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysAuthRoles extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private Long authorityId;
	/****/
	 private Long roleId;


	 public void setId(Long id){
		 this.id = id;
	}

	 public Long getId(){
		return this.id;
	}


	 public void setAuthorityId(Long authorityId){
		 this.authorityId = authorityId;
	}

	 public Long getAuthorityId(){
		return this.authorityId;
	}


	 public void setRoleId(Long roleId){
		 this.roleId = roleId;
	}

	 public Long getRoleId(){
		return this.roleId;
	}


}
