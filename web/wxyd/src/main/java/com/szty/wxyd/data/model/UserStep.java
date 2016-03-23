package com.szty.wxyd.data.model;
import com.szty.wxyd.data.model.BaseModel;



/**
 * 
 * 
 * 
 */
public class UserStep extends BaseModel {

	/****/
	 private Long id;
	/****/
	 private String openId;
	/**用户物理Ip**/
	 private String mac;
	/**当前步数**/
	 private String stepNow;
	/**上传时间**/
	 private String createTime;
	 private String createTimeBegin;
	 private String createTimeEnd;



	 public void setId(Long id){
		 this.id = id;
	}

	 public Long getId(){
		return this.id;
	}


	 public void setOpenId(String openId){
		 this.openId = openId;
	}

	 public String getOpenId(){
		return this.openId;
	}


	 public void setMac(String mac){
		 this.mac = mac;
	}

	 public String getMac(){
		return this.mac;
	}


	 public void setStepNow(String stepNow){
		 this.stepNow = stepNow;
	}

	 public String getStepNow(){
		return this.stepNow;
	}


	 public void setCreateTime(String createTime){
		 this.createTime = createTime;
	}

	 public String getCreateTime(){
		return this.createTime;
	}

	 public void setCreateTimeBegin (String createTimeBegin){
		 this.createTimeBegin = createTimeBegin ;
	}

	 public String getCreateTimeBegin (){
		return this.createTimeBegin;
	}

	 public void setCreateTimeEnd (String createTimeEnd){
		 this.createTimeEnd = createTimeEnd ;
	}

	 public String getCreateTimeEnd (){
		return this.createTimeEnd;
	}

}
