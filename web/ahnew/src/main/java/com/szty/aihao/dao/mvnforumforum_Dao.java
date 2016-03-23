/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumforumEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMFORUM数据实体
    *@作者：宋春林 
    */

	public class mvnforumforum_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private int categoryid;
        /**
	     * 
	     */
		private String forumownername;
        /**
	     * 
	     */
		private String lastpostmembername;
        /**
	     * 
	     */
		private String forumname;
        /**
	     * 
	     */
		private String forumdesc;
        /**
	     * 
	     */
		private Date forumcreationdate;
        /**
	     * 
	     */
		private Date forummodifieddate;
        /**
	     * 
	     */
		private Date forumlastpostdate;
        /**
	     * 
	     */
		private int forumorder;
        /**
	     * 
	     */
		private int forumtype;
        /**
	     * 
	     */
		private int forummodetype;
        /**
	     * 
	     */
		private int forumformatoption;
        /**
	     * 
	     */
		private int forumoption;
        /**
	     * 
	     */
		private int forumstatus;
        /**
	     * 
	     */
		private int forummoderationmode;
        /**
	     * 
	     */
		private String forumpassword;
        /**
	     * 
	     */
		private int forumthreadcount;
        /**
	     * 
	     */
		private int forumpostcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getForumid() {
     
		return forumid;
	    }
        
	    public void setForumid(int forumid) {
		this.forumid = forumid;
	    }
       

	    /**
		*
		*/
		
        public int getCategoryid() {
     
		return categoryid;
	    }
        
	    public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	    }
       

	    /**
		*
		*/
		
        public String getForumownername() {
     
		return forumownername;
	    }
        
	    public void setForumownername(String forumownername) {
		this.forumownername = forumownername;
	    }
       

	    /**
		*
		*/
		
        public String getLastpostmembername() {
     
		return lastpostmembername;
	    }
        
	    public void setLastpostmembername(String lastpostmembername) {
		this.lastpostmembername = lastpostmembername;
	    }
       

	    /**
		*
		*/
		
        public String getForumname() {
     
		return forumname;
	    }
        
	    public void setForumname(String forumname) {
		this.forumname = forumname;
	    }
       

	    /**
		*
		*/
		
        public String getForumdesc() {
     
		return forumdesc;
	    }
        
	    public void setForumdesc(String forumdesc) {
		this.forumdesc = forumdesc;
	    }
       

	    /**
		*
		*/
		
        public Date getForumcreationdate() {
     
		return forumcreationdate;
	    }
        
	    public void setForumcreationdate(Date forumcreationdate) {
		this.forumcreationdate = forumcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getForummodifieddate() {
     
		return forummodifieddate;
	    }
        
	    public void setForummodifieddate(Date forummodifieddate) {
		this.forummodifieddate = forummodifieddate;
	    }
       

	    /**
		*
		*/
		
        public Date getForumlastpostdate() {
     
		return forumlastpostdate;
	    }
        
	    public void setForumlastpostdate(Date forumlastpostdate) {
		this.forumlastpostdate = forumlastpostdate;
	    }
       

	    /**
		*
		*/
		
        public int getForumorder() {
     
		return forumorder;
	    }
        
	    public void setForumorder(int forumorder) {
		this.forumorder = forumorder;
	    }
       

	    /**
		*
		*/
		
        public int getForumtype() {
     
		return forumtype;
	    }
        
	    public void setForumtype(int forumtype) {
		this.forumtype = forumtype;
	    }
       

	    /**
		*
		*/
		
        public int getForummodetype() {
     
		return forummodetype;
	    }
        
	    public void setForummodetype(int forummodetype) {
		this.forummodetype = forummodetype;
	    }
       

	    /**
		*
		*/
		
        public int getForumformatoption() {
     
		return forumformatoption;
	    }
        
	    public void setForumformatoption(int forumformatoption) {
		this.forumformatoption = forumformatoption;
	    }
       

	    /**
		*
		*/
		
        public int getForumoption() {
     
		return forumoption;
	    }
        
	    public void setForumoption(int forumoption) {
		this.forumoption = forumoption;
	    }
       

	    /**
		*
		*/
		
        public int getForumstatus() {
     
		return forumstatus;
	    }
        
	    public void setForumstatus(int forumstatus) {
		this.forumstatus = forumstatus;
	    }
       

	    /**
		*
		*/
		
        public int getForummoderationmode() {
     
		return forummoderationmode;
	    }
        
	    public void setForummoderationmode(int forummoderationmode) {
		this.forummoderationmode = forummoderationmode;
	    }
       

	    /**
		*
		*/
		
        public String getForumpassword() {
     
		return forumpassword;
	    }
        
	    public void setForumpassword(String forumpassword) {
		this.forumpassword = forumpassword;
	    }
       

	    /**
		*
		*/
		
        public int getForumthreadcount() {
     
		return forumthreadcount;
	    }
        
	    public void setForumthreadcount(int forumthreadcount) {
		this.forumthreadcount = forumthreadcount;
	    }
       

	    /**
		*
		*/
		
        public int getForumpostcount() {
     
		return forumpostcount;
	    }
        
	    public void setForumpostcount(int forumpostcount) {
		this.forumpostcount = forumpostcount;
	    }
       
      /*  public static aihao_dao convert(mvnforumforum_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setForumid(_dao.getForumid());
        
        temp.setCategoryid(_dao.getCategoryid());
        
        temp.setForumownername(_dao.getForumownername());
        
        temp.setLastpostmembername(_dao.getLastpostmembername());
        
        temp.setForumname(_dao.getForumname());
        
        temp.setForumdesc(_dao.getForumdesc());
        
        temp.setForumcreationdate(_dao.getForumcreationdate());
        
        temp.setForummodifieddate(_dao.getForummodifieddate());
        
        temp.setForumlastpostdate(_dao.getForumlastpostdate());
        
        temp.setForumorder(_dao.getForumorder());
        
        temp.setForumtype(_dao.getForumtype());
        
        temp.setForummodetype(_dao.getForummodetype());
        
        temp.setForumformatoption(_dao.getForumformatoption());
        
        temp.setForumoption(_dao.getForumoption());
        
        temp.setForumstatus(_dao.getForumstatus());
        
        temp.setForummoderationmode(_dao.getForummoderationmode());
        
        temp.setForumpassword(_dao.getForumpassword());
        
        temp.setForumthreadcount(_dao.getForumthreadcount());
        
        temp.setForumpostcount(_dao.getForumpostcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

