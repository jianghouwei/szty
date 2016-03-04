package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysUsersRoles extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private Long usersId;
	/****/
	 private Long rolesId;


	 public void setId(Long id){
		 this.id = id;
	}

	 public Long getId(){
		return this.id;
	}


	 public void setUsersId(Long usersId){
		 this.usersId = usersId;
	}

	 public Long getUsersId(){
		return this.usersId;
	}


	 public void setRolesId(Long rolesId){
		 this.rolesId = rolesId;
	}

	 public Long getRolesId(){
		return this.rolesId;
	}


}
