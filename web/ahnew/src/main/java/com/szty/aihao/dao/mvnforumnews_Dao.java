/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumnewsEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMNEWS数据实体
    *@作者：宋春林 
    */

	public class mvnforumnews_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int newsid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private String newstitle;
        /**
	     * 
	     */
		private String newscontent;
        /**
	     * 
	     */
		private int newscategory;
        /**
	     * 
	     */
		private Date newscreationdate;
        /**
	     * 
	     */
		private Date newsmodifieddate;
        /**
	     * 
	     */
		private String newsownername;
        /**
	     * 
	     */
		private int newsrelatedforumtype;
        /**
	     * 
	     */
		private int newsrelatedid;
        /**
	     * 
	     */
		private int newsstatus;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getNewsid() {
     
		return newsid;
	    }
        
	    public void setNewsid(int newsid) {
		this.newsid = newsid;
	    }
       

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
		
        public String getNewstitle() {
     
		return newstitle;
	    }
        
	    public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	    }
       

	    /**
		*
		*/
		
        public String getNewscontent() {
     
		return newscontent;
	    }
        
	    public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	    }
       

	    /**
		*
		*/
		
        public int getNewscategory() {
     
		return newscategory;
	    }
        
	    public void setNewscategory(int newscategory) {
		this.newscategory = newscategory;
	    }
       

	    /**
		*
		*/
		
        public Date getNewscreationdate() {
     
		return newscreationdate;
	    }
        
	    public void setNewscreationdate(Date newscreationdate) {
		this.newscreationdate = newscreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getNewsmodifieddate() {
     
		return newsmodifieddate;
	    }
        
	    public void setNewsmodifieddate(Date newsmodifieddate) {
		this.newsmodifieddate = newsmodifieddate;
	    }
       

	    /**
		*
		*/
		
        public String getNewsownername() {
     
		return newsownername;
	    }
        
	    public void setNewsownername(String newsownername) {
		this.newsownername = newsownername;
	    }
       

	    /**
		*
		*/
		
        public int getNewsrelatedforumtype() {
     
		return newsrelatedforumtype;
	    }
        
	    public void setNewsrelatedforumtype(int newsrelatedforumtype) {
		this.newsrelatedforumtype = newsrelatedforumtype;
	    }
       

	    /**
		*
		*/
		
        public int getNewsrelatedid() {
     
		return newsrelatedid;
	    }
        
	    public void setNewsrelatedid(int newsrelatedid) {
		this.newsrelatedid = newsrelatedid;
	    }
       

	    /**
		*
		*/
		
        public int getNewsstatus() {
     
		return newsstatus;
	    }
        
	    public void setNewsstatus(int newsstatus) {
		this.newsstatus = newsstatus;
	    }
       

	    /**
		*
		*/
		
        public int getViewcount() {
     
		return viewcount;
	    }
        
	    public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	    }
       
      /*  public static aihao_dao convert(mvnforumnews_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setNewsid(_dao.getNewsid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setNewstitle(_dao.getNewstitle());
        
        temp.setNewscontent(_dao.getNewscontent());
        
        temp.setNewscategory(_dao.getNewscategory());
        
        temp.setNewscreationdate(_dao.getNewscreationdate());
        
        temp.setNewsmodifieddate(_dao.getNewsmodifieddate());
        
        temp.setNewsownername(_dao.getNewsownername());
        
        temp.setNewsrelatedforumtype(_dao.getNewsrelatedforumtype());
        
        temp.setNewsrelatedid(_dao.getNewsrelatedid());
        
        temp.setNewsstatus(_dao.getNewsstatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

