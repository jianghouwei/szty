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
	/****/
	 private String add;
	/****/
	 private String edit;
	/****/
	 private String imports;
	/****/
	 private String exports;
	/****/
	 private String delete;
	/****/
	 private String view;
	/****/
	 private String upload;


	 public void setId(Long id){
		 this.id = id;
	}

	 public Long getId(){
		return this.id;
	}


	 public void setResoucesId(Long resoucesId){
		 this.resoucesId = resoucesId;
	}

	 public Long getResoucesId(){
		return this.resoucesId;
	}


	 public void setAdd(String add){
		 this.add = add;
	}

	 public String getAdd(){
		return this.add;
	}


	 public void setEdit(String edit){
		 this.edit = edit;
	}

	 public String getEdit(){
		return this.edit;
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


	 public void setDelete(String delete){
		 this.delete = delete;
	}

	 public String getDelete(){
		return this.delete;
	}


	 public void setView(String view){
		 this.view = view;
	}

	 public String getView(){
		return this.view;
	}


	 public void setUpload(String upload){
		 this.upload = upload;
	}

	 public String getUpload(){
		return this.upload;
	}


}
