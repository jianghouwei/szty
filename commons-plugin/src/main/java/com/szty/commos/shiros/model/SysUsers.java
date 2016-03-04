package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysUsers extends BaseModel {

	/**id**/
	 private Long id;
	/**用户名**/
	 private String userName;
	/**密码**/
	 private String userPassword;
	/**员工编码**/
	 private String userCode;
	/****/
	 private String userEmail;
	/**性别**/
	 private String userSex;
	/**联系电话**/
	 private String userTel;
	/****/
	 private String isEnable;
	/****/
	 private String isDelete;
	/****/
	 private String upateUser;
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


	 public void setUserName(String userName){
		 this.userName = userName;
	}

	 public String getUserName(){
		return this.userName;
	}


	 public void setUserPassword(String userPassword){
		 this.userPassword = userPassword;
	}

	 public String getUserPassword(){
		return this.userPassword;
	}


	 public void setUserCode(String userCode){
		 this.userCode = userCode;
	}

	 public String getUserCode(){
		return this.userCode;
	}


	 public void setUserEmail(String userEmail){
		 this.userEmail = userEmail;
	}

	 public String getUserEmail(){
		return this.userEmail;
	}


	 public void setUserSex(String userSex){
		 this.userSex = userSex;
	}

	 public String getUserSex(){
		return this.userSex;
	}


	 public void setUserTel(String userTel){
		 this.userTel = userTel;
	}

	 public String getUserTel(){
		return this.userTel;
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


	 public void setUpateUser(String upateUser){
		 this.upateUser = upateUser;
	}

	 public String getUpateUser(){
		return this.upateUser;
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
