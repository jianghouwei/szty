package com.szty.commos.shiros.model;
import com.szty.framework.base.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class SysResources extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private String resourcesPath;
	/****/
	 private String resourcesName;
	/****/
	 private String resourcesCode;
	/****/
	 private String adds;
	/****/
	 private String edits;
	/****/
	 private String imports;
	/****/
	 private String exports;
	/****/
	 private String deletes;
	/****/
	 private String views;
	/****/
	 private String uploads;
	/****/
	 private String isDelete;
	/****/
	 private String isEnable;
	/****/
	 private String updateTime;
	/****/
	 private String updateUser;
	/****/
	 private String createUser;
	/****/
	 private String createTime;


	 public void setId(Long id){
		 this.id = id;
	}

	 public Long getId(){
		return this.id;
	}


	 public void setResourcesPath(String resourcesPath){
		 this.resourcesPath = resourcesPath;
	}

	 public String getResourcesPath(){
		return this.resourcesPath;
	}


	 public void setResourcesName(String resourcesName){
		 this.resourcesName = resourcesName;
	}

	 public String getResourcesName(){
		return this.resourcesName;
	}


	 public void setResourcesCode(String resourcesCode){
		 this.resourcesCode = resourcesCode;
	}

	 public String getResourcesCode(){
		return this.resourcesCode;
	}


	 public void setAdds(String adds){
		 this.adds = adds;
	}

	 public String getAdds(){
		return this.adds;
	}


	 public void setEdits(String edits){
		 this.edits = edits;
	}

	 public String getEdits(){
		return this.edits;
	}


	 public void setImports(String imports){
		 this.imports = imports;
	}

	 public String getImports(){
		return this.imports;
	}


	 public void setExports(String exports){
		 this.exports = exports;
	}

	 public String getExports(){
		return this.exports;
	}


	 public void setDeletes(String deletes){
		 this.deletes = deletes;
	}

	 public String getDeletes(){
		return this.deletes;
	}


	 public void setViews(String views){
		 this.views = views;
	}

	 public String getViews(){
		return this.views;
	}


	 public void setUploads(String uploads){
		 this.uploads = uploads;
	}

	 public String getUploads(){
		return this.uploads;
	}


	 public void setIsDelete(String isDelete){
		 this.isDelete = isDelete;
	}

	 public String getIsDelete(){
		return this.isDelete;
	}


	 public void setIsEnable(String isEnable){
		 this.isEnable = isEnable;
	}

	 public String getIsEnable(){
		return this.isEnable;
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


	 public void setCreateUser(String createUser){
		 this.createUser = createUser;
	}

	 public String getCreateUser(){
		return this.createUser;
	}


	 public void setCreateTime(String createTime){
		 this.createTime = createTime;
	}

	 public String getCreateTime(){
		return this.createTime;
	}


}
