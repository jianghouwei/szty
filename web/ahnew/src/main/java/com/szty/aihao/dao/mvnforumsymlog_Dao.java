﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsymlogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSYMLOG数据实体
    *@作者：宋春林 
    */

	public class mvnforumsymlog_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int logid;
        /**
	     * 
	     */
		private String imei;
        /**
	     * 
	     */
		private String imsi;
        /**
	     * 
	     */
		private String cid;
        /**
	     * 
	     */
		private String pid;
        /**
	     * 
	     */
		private String sid;
        /**
	     * 
	     */
		private String skey;
        /**
	     * 
	     */
		private String ver;
        /**
	     * 
	     */
		private Date logcreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getLogid() {
     
		return logid;
	    }
        
	    public void setLogid(int logid) {
		this.logid = logid;
	    }
       

	    /**
		*
		*/
		
        public String getImei() {
     
		return imei;
	    }
        
	    public void setImei(String imei) {
		this.imei = imei;
	    }
       

	    /**
		*
		*/
		
        public String getImsi() {
     
		return imsi;
	    }
        
	    public void setImsi(String imsi) {
		this.imsi = imsi;
	    }
       

	    /**
		*
		*/
		
        public String getCid() {
     
		return cid;
	    }
        
	    public void setCid(String cid) {
		this.cid = cid;
	    }
       

	    /**
		*
		*/
		
        public String getPid() {
     
		return pid;
	    }
        
	    public void setPid(String pid) {
		this.pid = pid;
	    }
       

	    /**
		*
		*/
		
        public String getSid() {
     
		return sid;
	    }
        
	    public void setSid(String sid) {
		this.sid = sid;
	    }
       

	    /**
		*
		*/
		
        public String getSkey() {
     
		return skey;
	    }
        
	    public void setSkey(String skey) {
		this.skey = skey;
	    }
       

	    /**
		*
		*/
		
        public String getVer() {
     
		return ver;
	    }
        
	    public void setVer(String ver) {
		this.ver = ver;
	    }
       

	    /**
		*
		*/
		
        public Date getLogcreationdate() {
     
		return logcreationdate;
	    }
        
	    public void setLogcreationdate(Date logcreationdate) {
		this.logcreationdate = logcreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumsymlog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLogid(_dao.getLogid());
        
        temp.setImei(_dao.getImei());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setCid(_dao.getCid());
        
        temp.setPid(_dao.getPid());
        
        temp.setSid(_dao.getSid());
        
        temp.setSkey(_dao.getSkey());
        
        temp.setVer(_dao.getVer());
        
        temp.setLogcreationdate(_dao.getLogcreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

