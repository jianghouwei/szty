/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumattachmentEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMATTACHMENT数据实体
    *@作者：宋春林 
    */

	public class mvnforumattachment_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int attachid;
        /**
	     * 
	     */
		private int postid;
        /**
	     * 
	     */
		private int memberid;
        /**
	     * 
	     */
		private String attachfilename;
        /**
	     * 
	     */
		private int attachfilesize;
        /**
	     * 
	     */
		private String attachmimetype;
        /**
	     * 
	     */
		private String attachdesc;
        /**
	     * 
	     */
		private String attachcreationip;
        /**
	     * 
	     */
		private Date attachcreationdate;
        /**
	     * 
	     */
		private Date attachmodifieddate;
        /**
	     * 
	     */
		private int attachdownloadcount;
        /**
	     * 
	     */
		private int attachoption;
        /**
	     * 
	     */
		private int attachstatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getAttachid() {
     
		return attachid;
	    }
        
	    public void setAttachid(int attachid) {
		this.attachid = attachid;
	    }
       

	    /**
		*
		*/
		
        public int getPostid() {
     
		return postid;
	    }
        
	    public void setPostid(int postid) {
		this.postid = postid;
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
		
        public String getAttachfilename() {
     
		return attachfilename;
	    }
        
	    public void setAttachfilename(String attachfilename) {
		this.attachfilename = attachfilename;
	    }
       

	    /**
		*
		*/
		
        public int getAttachfilesize() {
     
		return attachfilesize;
	    }
        
	    public void setAttachfilesize(int attachfilesize) {
		this.attachfilesize = attachfilesize;
	    }
       

	    /**
		*
		*/
		
        public String getAttachmimetype() {
     
		return attachmimetype;
	    }
        
	    public void setAttachmimetype(String attachmimetype) {
		this.attachmimetype = attachmimetype;
	    }
       

	    /**
		*
		*/
		
        public String getAttachdesc() {
     
		return attachdesc;
	    }
        
	    public void setAttachdesc(String attachdesc) {
		this.attachdesc = attachdesc;
	    }
       

	    /**
		*
		*/
		
        public String getAttachcreationip() {
     
		return attachcreationip;
	    }
        
	    public void setAttachcreationip(String attachcreationip) {
		this.attachcreationip = attachcreationip;
	    }
       

	    /**
		*
		*/
		
        public Date getAttachcreationdate() {
     
		return attachcreationdate;
	    }
        
	    public void setAttachcreationdate(Date attachcreationdate) {
		this.attachcreationdate = attachcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getAttachmodifieddate() {
     
		return attachmodifieddate;
	    }
        
	    public void setAttachmodifieddate(Date attachmodifieddate) {
		this.attachmodifieddate = attachmodifieddate;
	    }
       

	    /**
		*
		*/
		
        public int getAttachdownloadcount() {
     
		return attachdownloadcount;
	    }
        
	    public void setAttachdownloadcount(int attachdownloadcount) {
		this.attachdownloadcount = attachdownloadcount;
	    }
       

	    /**
		*
		*/
		
        public int getAttachoption() {
     
		return attachoption;
	    }
        
	    public void setAttachoption(int attachoption) {
		this.attachoption = attachoption;
	    }
       

	    /**
		*
		*/
		
        public int getAttachstatus() {
     
		return attachstatus;
	    }
        
	    public void setAttachstatus(int attachstatus) {
		this.attachstatus = attachstatus;
	    }
       
      /*  public static aihao_dao convert(mvnforumattachment_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setAttachid(_dao.getAttachid());
        
        temp.setPostid(_dao.getPostid());
        
        temp.setMemberid(_dao.getMemberid());
        
        temp.setAttachfilename(_dao.getAttachfilename());
        
        temp.setAttachfilesize(_dao.getAttachfilesize());
        
        temp.setAttachmimetype(_dao.getAttachmimetype());
        
        temp.setAttachdesc(_dao.getAttachdesc());
        
        temp.setAttachcreationip(_dao.getAttachcreationip());
        
        temp.setAttachcreationdate(_dao.getAttachcreationdate());
        
        temp.setAttachmodifieddate(_dao.getAttachmodifieddate());
        
        temp.setAttachdownloadcount(_dao.getAttachdownloadcount());
        
        temp.setAttachoption(_dao.getAttachoption());
        
        temp.setAttachstatus(_dao.getAttachstatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

