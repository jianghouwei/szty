/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaouserloginEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOUSERLOGIN数据实体
    *@作者：宋春林 
    */

	public class aihaouserlogin_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private long id;
        /**
	     * 
	     */
		private long uinfoid;
        /**
	     * 
	     */
		private String status;
        /**
	     * 
	     */
		private String longitude;
        /**
	     * 
	     */
		private String latitude;
        /**
	     * 
	     */
		private Date logintime;
        /**
	     * 
	     */
		private Date logouttime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public long getId() {
     
		return id;
	    }
        
	    public void setId(long id) {
		this.id = id;
	    }
       

	    /**
		*
		*/
		
        public long getUinfoid() {
     
		return uinfoid;
	    }
        
	    public void setUinfoid(long uinfoid) {
		this.uinfoid = uinfoid;
	    }
       

	    /**
		*
		*/
		
        public String getStatus() {
     
		return status;
	    }
        
	    public void setStatus(String status) {
		this.status = status;
	    }
       

	    /**
		*
		*/
		
        public String getLongitude() {
     
		return longitude;
	    }
        
	    public void setLongitude(String longitude) {
		this.longitude = longitude;
	    }
       

	    /**
		*
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
		
        public Date getLogintime() {
     
		return logintime;
	    }
        
	    public void setLogintime(Date logintime) {
		this.logintime = logintime;
	    }
       

	    /**
		*
		*/
		
        public Date getLogouttime() {
     
		return logouttime;
	    }
        
	    public void setLogouttime(Date logouttime) {
		this.logouttime = logouttime;
	    }
       
      /*  public static aihao_dao convert(aihaouserlogin_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setUinfoid(_dao.getUinfoid());
        
        temp.setStatus(_dao.getStatus());
        
        temp.setLongitude(_dao.getLongitude());
        
        temp.setLatitude(_dao.getLatitude());
        
        temp.setLogintime(_dao.getLogintime());
        
        temp.setLogouttime(_dao.getLogouttime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

