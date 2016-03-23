/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztyuserstatusEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYUSERSTATUS数据实体
    *@作者：宋春林 
    */

	public class sztyuserstatus_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ???
	     */
		private String mobile;
        /**
	     * ???
	     */
		private int platform;
        /**
	     * ??
	     */
		private int status;
        /**
	     * ??????
	     */
		private Date loginintime;
        /**
	     * ????
	     */
		private Date loginouttime;
        /**
	     * ??
	     */
		private String longitude;
        /**
	     * ??
	     */
		private String latitude;
        /**
	     * 
	     */
		private int id;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*???
		*/
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       

	    /**
		*???
		*/
		
        public int getPlatform() {
     
		return platform;
	    }
        
	    public void setPlatform(int platform) {
		this.platform = platform;
	    }
       

	    /**
		*??
		*/
		
        public int getStatus() {
     
		return status;
	    }
        
	    public void setStatus(int status) {
		this.status = status;
	    }
       

	    /**
		*??????
		*/
		
        public Date getLoginintime() {
     
		return loginintime;
	    }
        
	    public void setLoginintime(Date loginintime) {
		this.loginintime = loginintime;
	    }
       

	    /**
		*????
		*/
		
        public Date getLoginouttime() {
     
		return loginouttime;
	    }
        
	    public void setLoginouttime(Date loginouttime) {
		this.loginouttime = loginouttime;
	    }
       

	    /**
		*??
		*/
		
        public String getLongitude() {
     
		return longitude;
	    }
        
	    public void setLongitude(String longitude) {
		this.longitude = longitude;
	    }
       

	    /**
		*??
		*/
		
        public String getLatitude() {
     
		return latitude;
	    }
        
	    public void setLatitude(String latitude) {
		this.latitude = latitude;
	    }
       

	    /**
		*
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       
      /*  public static aihao_dao convert(sztyuserstatus_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMobile(_dao.getMobile());
        
        temp.setPlatform(_dao.getPlatform());
        
        temp.setStatus(_dao.getStatus());
        
        temp.setLoginintime(_dao.getLoginintime());
        
        temp.setLoginouttime(_dao.getLoginouttime());
        
        temp.setLongitude(_dao.getLongitude());
        
        temp.setLatitude(_dao.getLatitude());
        
        temp.setId(_dao.getId());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

