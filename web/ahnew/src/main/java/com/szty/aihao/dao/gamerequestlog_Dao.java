/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： gamerequestlogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@GAMEREQUESTLOG数据实体
    *@作者：宋春林 
    */

	public class gamerequestlog_Dao implements Serializable
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
		private String logurl;
        /**
	     * 
	     */
		private String logrooturl;
        /**
	     * 
	     */
		private String logcreateip;
        /**
	     * 
	     */
		private Date logcdate;
        /**
	     * 
	     */
		private String logcreateprovince;
        
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
		
        public String getLogurl() {
     
		return logurl;
	    }
        
	    public void setLogurl(String logurl) {
		this.logurl = logurl;
	    }
       

	    /**
		*
		*/
		
        public String getLogrooturl() {
     
		return logrooturl;
	    }
        
	    public void setLogrooturl(String logrooturl) {
		this.logrooturl = logrooturl;
	    }
       

	    /**
		*
		*/
		
        public String getLogcreateip() {
     
		return logcreateip;
	    }
        
	    public void setLogcreateip(String logcreateip) {
		this.logcreateip = logcreateip;
	    }
       

	    /**
		*
		*/
		
        public Date getLogcdate() {
     
		return logcdate;
	    }
        
	    public void setLogcdate(Date logcdate) {
		this.logcdate = logcdate;
	    }
       

	    /**
		*
		*/
		
        public String getLogcreateprovince() {
     
		return logcreateprovince;
	    }
        
	    public void setLogcreateprovince(String logcreateprovince) {
		this.logcreateprovince = logcreateprovince;
	    }
       
      /*  public static aihao_dao convert(gamerequestlog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLogid(_dao.getLogid());
        
        temp.setLogurl(_dao.getLogurl());
        
        temp.setLogrooturl(_dao.getLogrooturl());
        
        temp.setLogcreateip(_dao.getLogcreateip());
        
        temp.setLogcdate(_dao.getLogcdate());
        
        temp.setLogcreateprovince(_dao.getLogcreateprovince());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

