/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： twittermessageEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TWITTERMESSAGE数据实体
    *@作者：宋春林 
    */

	public class twittermessage_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int messageid;
        /**
	     * 
	     */
		private int userid;
        /**
	     * 
	     */
		private int senduserid;
        /**
	     * 
	     */
		private String content;
        /**
	     * 
	     */
		private int state;
        /**
	     * 
	     */
		private Date messagetime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getMessageid() {
     
		return messageid;
	    }
        
	    public void setMessageid(int messageid) {
		this.messageid = messageid;
	    }
       

	    /**
		*
		*/
		
        public int getUserid() {
     
		return userid;
	    }
        
	    public void setUserid(int userid) {
		this.userid = userid;
	    }
       

	    /**
		*
		*/
		
        public int getSenduserid() {
     
		return senduserid;
	    }
        
	    public void setSenduserid(int senduserid) {
		this.senduserid = senduserid;
	    }
       

	    /**
		*
		*/
		
        public String getContent() {
     
		return content;
	    }
        
	    public void setContent(String content) {
		this.content = content;
	    }
       

	    /**
		*
		*/
		
        public int getState() {
     
		return state;
	    }
        
	    public void setState(int state) {
		this.state = state;
	    }
       

	    /**
		*
		*/
		
        public Date getMessagetime() {
     
		return messagetime;
	    }
        
	    public void setMessagetime(Date messagetime) {
		this.messagetime = messagetime;
	    }
       
      /*  public static aihao_dao convert(twittermessage_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMessageid(_dao.getMessageid());
        
        temp.setUserid(_dao.getUserid());
        
        temp.setSenduserid(_dao.getSenduserid());
        
        temp.setContent(_dao.getContent());
        
        temp.setState(_dao.getState());
        
        temp.setMessagetime(_dao.getMessagetime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

