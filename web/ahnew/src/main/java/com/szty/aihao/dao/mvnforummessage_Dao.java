/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforummessageEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMMESSAGE数据实体
    *@作者：宋春林 
    */

	public class mvnforummessage_Dao implements Serializable
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
		private String foldername;
        /**
	     * 
	     */
		private int memberid;
        /**
	     * 
	     */
		private int messagesenderid;
        /**
	     * 
	     */
		private String messagesendername;
        /**
	     * 
	     */
		private String messagetolist;
        /**
	     * 
	     */
		private String messagecclist;
        /**
	     * 
	     */
		private String messagebcclist;
        /**
	     * 
	     */
		private String messagetopic;
        /**
	     * 
	     */
		private String messagebody;
        /**
	     * 
	     */
		private int messagetype;
        /**
	     * 
	     */
		private int messageoption;
        /**
	     * 
	     */
		private int messagestatus;
        /**
	     * 
	     */
		private int messagereadstatus;
        /**
	     * 
	     */
		private int messagenotify;
        /**
	     * 
	     */
		private String messageicon;
        /**
	     * 
	     */
		private int messageattachcount;
        /**
	     * 
	     */
		private String messageip;
        /**
	     * 
	     */
		private Date messagecreationdate;
        
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
		
        public String getFoldername() {
     
		return foldername;
	    }
        
	    public void setFoldername(String foldername) {
		this.foldername = foldername;
	    }
       

	    /**
		*
		*/
		
        public int getMemberid() {
     
		return memberid;
	    }
        
	    public void setMemberid(int memberid) {
		this.memberid = memberid;
	    }
       

	    /**
		*
		*/
		
        public int getMessagesenderid() {
     
		return messagesenderid;
	    }
        
	    public void setMessagesenderid(int messagesenderid) {
		this.messagesenderid = messagesenderid;
	    }
       

	    /**
		*
		*/
		
        public String getMessagesendername() {
     
		return messagesendername;
	    }
        
	    public void setMessagesendername(String messagesendername) {
		this.messagesendername = messagesendername;
	    }
       

	    /**
		*
		*/
		
        public String getMessagetolist() {
     
		return messagetolist;
	    }
        
	    public void setMessagetolist(String messagetolist) {
		this.messagetolist = messagetolist;
	    }
       

	    /**
		*
		*/
		
        public String getMessagecclist() {
     
		return messagecclist;
	    }
        
	    public void setMessagecclist(String messagecclist) {
		this.messagecclist = messagecclist;
	    }
       

	    /**
		*
		*/
		
        public String getMessagebcclist() {
     
		return messagebcclist;
	    }
        
	    public void setMessagebcclist(String messagebcclist) {
		this.messagebcclist = messagebcclist;
	    }
       

	    /**
		*
		*/
		
        public String getMessagetopic() {
     
		return messagetopic;
	    }
        
	    public void setMessagetopic(String messagetopic) {
		this.messagetopic = messagetopic;
	    }
       

	    /**
		*
		*/
		
        public String getMessagebody() {
     
		return messagebody;
	    }
        
	    public void setMessagebody(String messagebody) {
		this.messagebody = messagebody;
	    }
       

	    /**
		*
		*/
		
        public int getMessagetype() {
     
		return messagetype;
	    }
        
	    public void setMessagetype(int messagetype) {
		this.messagetype = messagetype;
	    }
       

	    /**
		*
		*/
		
        public int getMessageoption() {
     
		return messageoption;
	    }
        
	    public void setMessageoption(int messageoption) {
		this.messageoption = messageoption;
	    }
       

	    /**
		*
		*/
		
        public int getMessagestatus() {
     
		return messagestatus;
	    }
        
	    public void setMessagestatus(int messagestatus) {
		this.messagestatus = messagestatus;
	    }
       

	    /**
		*
		*/
		
        public int getMessagereadstatus() {
     
		return messagereadstatus;
	    }
        
	    public void setMessagereadstatus(int messagereadstatus) {
		this.messagereadstatus = messagereadstatus;
	    }
       

	    /**
		*
		*/
		
        public int getMessagenotify() {
     
		return messagenotify;
	    }
        
	    public void setMessagenotify(int messagenotify) {
		this.messagenotify = messagenotify;
	    }
       

	    /**
		*
		*/
		
        public String getMessageicon() {
     
		return messageicon;
	    }
        
	    public void setMessageicon(String messageicon) {
		this.messageicon = messageicon;
	    }
       

	    /**
		*
		*/
		
        public int getMessageattachcount() {
     
		return messageattachcount;
	    }
        
	    public void setMessageattachcount(int messageattachcount) {
		this.messageattachcount = messageattachcount;
	    }
       

	    /**
		*
		*/
		
        public String getMessageip() {
     
		return messageip;
	    }
        
	    public void setMessageip(String messageip) {
		this.messageip = messageip;
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
       
      /*  public static aihao_dao convert(mvnforummessage_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMessageid(_dao.getMessageid());
        
        temp.setFoldername(_dao.getFoldername());
        
        temp.setMemberid(_dao.getMemberid());
        
        temp.setMessagesenderid(_dao.getMessagesenderid());
        
        temp.setMessagesendername(_dao.getMessagesendername());
        
        temp.setMessagetolist(_dao.getMessagetolist());
        
        temp.setMessagecclist(_dao.getMessagecclist());
        
        temp.setMessagebcclist(_dao.getMessagebcclist());
        
        temp.setMessagetopic(_dao.getMessagetopic());
        
        temp.setMessagebody(_dao.getMessagebody());
        
        temp.setMessagetype(_dao.getMessagetype());
        
        temp.setMessageoption(_dao.getMessageoption());
        
        temp.setMessagestatus(_dao.getMessagestatus());
        
        temp.setMessagereadstatus(_dao.getMessagereadstatus());
        
        temp.setMessagenotify(_dao.getMessagenotify());
        
        temp.setMessageicon(_dao.getMessageicon());
        
        temp.setMessageattachcount(_dao.getMessageattachcount());
        
        temp.setMessageip(_dao.getMessageip());
        
        temp.setMessagecreationdate(_dao.getMessagecreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

