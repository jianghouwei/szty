/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： hllclientlogonEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@HLLCLIENTLOGON数据实体
    *@作者：宋春林 
    */

	public class hllclientlogon_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int logonid;
        /**
	     * 
	     */
		private String imsi;
        /**
	     * 
	     */
		private int operatingsystem;
        /**
	     * 
	     */
		private String webunionid;
        /**
	     * 
	     */
		private Date logoncreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getLogonid() {
     
		return logonid;
	    }
        
	    public void setLogonid(int logonid) {
		this.logonid = logonid;
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
		
        public int getOperatingsystem() {
     
		return operatingsystem;
	    }
        
	    public void setOperatingsystem(int operatingsystem) {
		this.operatingsystem = operatingsystem;
	    }
       

	    /**
		*
		*/
		
        public String getWebunionid() {
     
		return webunionid;
	    }
        
	    public void setWebunionid(String webunionid) {
		this.webunionid = webunionid;
	    }
       

	    /**
		*
		*/
		
        public Date getLogoncreationdate() {
     
		return logoncreationdate;
	    }
        
	    public void setLogoncreationdate(Date logoncreationdate) {
		this.logoncreationdate = logoncreationdate;
	    }
       
      /*  public static aihao_dao convert(hllclientlogon_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLogonid(_dao.getLogonid());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setOperatingsystem(_dao.getOperatingsystem());
        
        temp.setWebunionid(_dao.getWebunionid());
        
        temp.setLogoncreationdate(_dao.getLogoncreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

