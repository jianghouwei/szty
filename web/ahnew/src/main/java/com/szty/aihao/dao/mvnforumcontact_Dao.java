/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumcontactEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMCONTACT数据实体
    *@作者：宋春林 
    */

	public class mvnforumcontact_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int contactid;
        /**
	     * 
	     */
		private String contactownername;
        /**
	     * 
	     */
		private String friendsname;
        /**
	     * 
	     */
		private String friendsmobile;
        /**
	     * 
	     */
		private String friendsemail;
        /**
	     * 
	     */
		private String familyphone;
        /**
	     * 
	     */
		private String companyname;
        /**
	     * 
	     */
		private String companyphone;
        /**
	     * 
	     */
		private String faxphone;
        /**
	     * 
	     */
		private Date contactcreationdate;
        /**
	     * 
	     */
		private Date contactmodifieddate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getContactid() {
     
		return contactid;
	    }
        
	    public void setContactid(int contactid) {
		this.contactid = contactid;
	    }
       

	    /**
		*
		*/
		
        public String getContactownername() {
     
		return contactownername;
	    }
        
	    public void setContactownername(String contactownername) {
		this.contactownername = contactownername;
	    }
       

	    /**
		*
		*/
		
        public String getFriendsname() {
     
		return friendsname;
	    }
        
	    public void setFriendsname(String friendsname) {
		this.friendsname = friendsname;
	    }
       

	    /**
		*
		*/
		
        public String getFriendsmobile() {
     
		return friendsmobile;
	    }
        
	    public void setFriendsmobile(String friendsmobile) {
		this.friendsmobile = friendsmobile;
	    }
       

	    /**
		*
		*/
		
        public String getFriendsemail() {
     
		return friendsemail;
	    }
        
	    public void setFriendsemail(String friendsemail) {
		this.friendsemail = friendsemail;
	    }
       

	    /**
		*
		*/
		
        public String getFamilyphone() {
     
		return familyphone;
	    }
        
	    public void setFamilyphone(String familyphone) {
		this.familyphone = familyphone;
	    }
       

	    /**
		*
		*/
		
        public String getCompanyname() {
     
		return companyname;
	    }
        
	    public void setCompanyname(String companyname) {
		this.companyname = companyname;
	    }
       

	    /**
		*
		*/
		
        public String getCompanyphone() {
     
		return companyphone;
	    }
        
	    public void setCompanyphone(String companyphone) {
		this.companyphone = companyphone;
	    }
       

	    /**
		*
		*/
		
        public String getFaxphone() {
     
		return faxphone;
	    }
        
	    public void setFaxphone(String faxphone) {
		this.faxphone = faxphone;
	    }
       

	    /**
		*
		*/
		
        public Date getContactcreationdate() {
     
		return contactcreationdate;
	    }
        
	    public void setContactcreationdate(Date contactcreationdate) {
		this.contactcreationdate = contactcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getContactmodifieddate() {
     
		return contactmodifieddate;
	    }
        
	    public void setContactmodifieddate(Date contactmodifieddate) {
		this.contactmodifieddate = contactmodifieddate;
	    }
       
      /*  public static aihao_dao convert(mvnforumcontact_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setContactid(_dao.getContactid());
        
        temp.setContactownername(_dao.getContactownername());
        
        temp.setFriendsname(_dao.getFriendsname());
        
        temp.setFriendsmobile(_dao.getFriendsmobile());
        
        temp.setFriendsemail(_dao.getFriendsemail());
        
        temp.setFamilyphone(_dao.getFamilyphone());
        
        temp.setCompanyname(_dao.getCompanyname());
        
        temp.setCompanyphone(_dao.getCompanyphone());
        
        temp.setFaxphone(_dao.getFaxphone());
        
        temp.setContactcreationdate(_dao.getContactcreationdate());
        
        temp.setContactmodifieddate(_dao.getContactmodifieddate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

