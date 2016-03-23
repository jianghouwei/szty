/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumofflinemessageEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMOFFLINEMESSAGE数据实体
    *@作者：宋春林 
    */

	public class mvnforumofflinemessage_Dao implements Serializable
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
		private String sendmobile;
        /**
	     * 
	     */
		private String receivemobile;
        /**
	     * 
	     */
		private String message;
        /**
	     * 
	     */
		private String resourceid;
        /**
	     * 
	     */
		private Date messagecreationdate;
        /**
	     * 
	     */
		private int status;
        
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
		
        public String getSendmobile() {
     
		return sendmobile;
	    }
        
	    public void setSendmobile(String sendmobile) {
		this.sendmobile = sendmobile;
	    }
       

	    /**
		*
		*/
		
        public String getReceivemobile() {
     
		return receivemobile;
	    }
        
	    public void setReceivemobile(String receivemobile) {
		this.receivemobile = receivemobile;
	    }
       

	    /**
		*
		*/
		
        public String getMessage() {
     
		return message;
	    }
        
	    public void setMessage(String message) {
		this.message = message;
	    }
       

	    /**
		*
		*/
		
        public String getResourceid() {
     
		return resourceid;
	    }
        
	    public void setResourceid(String resourceid) {
		this.resourceid = resourceid;
	    }
       

	    /**
		*
		*/
		
        public Date getMessagecreationdate() {
     
		return messagecreationdate;
	    }
        
	    public void setMessagecreationdate(Date messagecreationdate) {
		this.messagecreationdate = messagecreationdate;
	    }
       

	    /**
		*
		*/
		
        public int getStatus() {
     
		return status;
	    }
        
	    public void setStatus(int status) {
		this.status = status;
	    }
       
      /*  public static aihao_dao convert(mvnforumofflinemessage_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMessageid(_dao.getMessageid());
        
        temp.setSendmobile(_dao.getSendmobile());
        
        temp.setReceivemobile(_dao.getReceivemobile());
        
        temp.setMessage(_dao.getMessage());
        
        temp.setResourceid(_dao.getResourceid());
        
        temp.setMessagecreationdate(_dao.getMessagecreationdate());
        
        temp.setStatus(_dao.getStatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

