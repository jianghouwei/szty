/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumhllclientlogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMHLLCLIENTLOG数据实体
    *@作者：宋春林 
    */

	public class mvnforumhllclientlog_Dao implements Serializable
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
		private String logownername;
        /**
	     * 
	     */
		private int operatingsystem;
        /**
	     * 
	     */
		private String useragent;
        /**
	     * 
	     */
		private int appid;
        /**
	     * 
	     */
		private String funct;
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
		
        public String getLogownername() {
     
		return logownername;
	    }
        
	    public void setLogownername(String logownername) {
		this.logownername = logownername;
	    }
       

	    /**
		*
		*/
		
        public int getOperatingsystem() {
     
		return operatingsystem;
	    }
        
	    public void setOperatingsystem(int operatingsystem) {
		this.operatingsystem = operatingsystem;
	    }
       

	    /**
		*
		*/
		
        public String getUseragent() {
     
		return useragent;
	    }
        
	    public void setUseragent(String useragent) {
		this.useragent = useragent;
	    }
       

	    /**
		*
		*/
		
        public int getAppid() {
     
		return appid;
	    }
        
	    public void setAppid(int appid) {
		this.appid = appid;
	    }
       

	    /**
		*
		*/
		
        public String getFunct() {
     
		return funct;
	    }
        
	    public void setFunct(String funct) {
		this.funct = funct;
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
       
      /*  public static aihao_dao convert(mvnforumhllclientlog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLogid(_dao.getLogid());
        
        temp.setLogownername(_dao.getLogownername());
        
        temp.setOperatingsystem(_dao.getOperatingsystem());
        
        temp.setUseragent(_dao.getUseragent());
        
        temp.setAppid(_dao.getAppid());
        
        temp.setFunct(_dao.getFunct());
        
        temp.setLogcreationdate(_dao.getLogcreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

