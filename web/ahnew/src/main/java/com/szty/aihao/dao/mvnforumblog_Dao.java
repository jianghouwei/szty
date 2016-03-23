/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumblogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMBLOG数据实体
    *@作者：宋春林 
    */

	public class mvnforumblog_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int blogid;
        /**
	     * 
	     */
		private String blogownername;
        /**
	     * 
	     */
		private String blognickname;
        /**
	     * 
	     */
		private String blogtitle;
        /**
	     * 
	     */
		private String blogcontent;
        /**
	     * 
	     */
		private Date blogcreationdate;
        /**
	     * 
	     */
		private Date blogmodifieddate;
        /**
	     * 
	     */
		private int blogstatus;
        /**
	     * 
	     */
		private int reviewcount;
        /**
	     * 
	     */
		private int coverfavoritecount;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getBlogid() {
     
		return blogid;
	    }
        
	    public void setBlogid(int blogid) {
		this.blogid = blogid;
	    }
       

	    /**
		*
		*/
		
        public String getBlogownername() {
     
		return blogownername;
	    }
        
	    public void setBlogownername(String blogownername) {
		this.blogownername = blogownername;
	    }
       

	    /**
		*
		*/
		
        public String getBlognickname() {
     
		return blognickname;
	    }
        
	    public void setBlognickname(String blognickname) {
		this.blognickname = blognickname;
	    }
       

	    /**
		*
		*/
		
        public String getBlogtitle() {
     
		return blogtitle;
	    }
        
	    public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	    }
       

	    /**
		*
		*/
		
        public String getBlogcontent() {
     
		return blogcontent;
	    }
        
	    public void setBlogcontent(String blogcontent) {
		this.blogcontent = blogcontent;
	    }
       

	    /**
		*
		*/
		
        public Date getBlogcreationdate() {
     
		return blogcreationdate;
	    }
        
	    public void setBlogcreationdate(Date blogcreationdate) {
		this.blogcreationdate = blogcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getBlogmodifieddate() {
     
		return blogmodifieddate;
	    }
        
	    public void setBlogmodifieddate(Date blogmodifieddate) {
		this.blogmodifieddate = blogmodifieddate;
	    }
       

	    /**
		*
		*/
		
        public int getBlogstatus() {
     
		return blogstatus;
	    }
        
	    public void setBlogstatus(int blogstatus) {
		this.blogstatus = blogstatus;
	    }
       

	    /**
		*
		*/
		
        public int getReviewcount() {
     
		return reviewcount;
	    }
        
	    public void setReviewcount(int reviewcount) {
		this.reviewcount = reviewcount;
	    }
       

	    /**
		*
		*/
		
        public int getCoverfavoritecount() {
     
		return coverfavoritecount;
	    }
        
	    public void setCoverfavoritecount(int coverfavoritecount) {
		this.coverfavoritecount = coverfavoritecount;
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
       
      /*  public static aihao_dao convert(mvnforumblog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setBlogid(_dao.getBlogid());
        
        temp.setBlogownername(_dao.getBlogownername());
        
        temp.setBlognickname(_dao.getBlognickname());
        
        temp.setBlogtitle(_dao.getBlogtitle());
        
        temp.setBlogcontent(_dao.getBlogcontent());
        
        temp.setBlogcreationdate(_dao.getBlogcreationdate());
        
        temp.setBlogmodifieddate(_dao.getBlogmodifieddate());
        
        temp.setBlogstatus(_dao.getBlogstatus());
        
        temp.setReviewcount(_dao.getReviewcount());
        
        temp.setCoverfavoritecount(_dao.getCoverfavoritecount());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

