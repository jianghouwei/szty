/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： userrequestEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@USERREQUEST数据实体
    *@作者：宋春林 
    */

	public class userrequest_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private long msgid;
        /**
	     * 
	     */
		private String username;
        /**
	     * 
	     */
		private String phone;
        /**
	     * 
	     */
		private String address;
        /**
	     * 
	     */
		private String addresscode;
        /**
	     * 
	     */
		private String requestname;
        /**
	     * 
	     */
		private Date cdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public long getMsgid() {
     
		return msgid;
	    }
        
	    public void setMsgid(long msgid) {
		this.msgid = msgid;
	    }
       

	    /**
		*
		*/
		
        public String getUsername() {
     
		return username;
	    }
        
	    public void setUsername(String username) {
		this.username = username;
	    }
       

	    /**
		*
		*/
		
        public String getPhone() {
     
		return phone;
	    }
        
	    public void setPhone(String phone) {
		this.phone = phone;
	    }
       

	    /**
		*
		*/
		
        public String getAddress() {
     
		return address;
	    }
        
	    public void setAddress(String address) {
		this.address = address;
	    }
       

	    /**
		*
		*/
		
        public String getAddresscode() {
     
		return addresscode;
	    }
        
	    public void setAddresscode(String addresscode) {
		this.addresscode = addresscode;
	    }
       

	    /**
		*
		*/
		
        public String getRequestname() {
     
		return requestname;
	    }
        
	    public void setRequestname(String requestname) {
		this.requestname = requestname;
	    }
       

	    /**
		*
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       
      /*  public static aihao_dao convert(userrequest_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMsgid(_dao.getMsgid());
        
        temp.setUsername(_dao.getUsername());
        
        temp.setPhone(_dao.getPhone());
        
        temp.setAddress(_dao.getAddress());
        
        temp.setAddresscode(_dao.getAddresscode());
        
        temp.setRequestname(_dao.getRequestname());
        
        temp.setCdate(_dao.getCdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

