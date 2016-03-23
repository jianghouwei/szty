/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumwatchEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMWATCH数据实体
    *@作者：宋春林 
    */

	public class mvnforumwatch_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int watchid;
        /**
	     * 
	     */
		private int memberid;
        /**
	     * 
	     */
		private int categoryid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private int threadid;
        /**
	     * 
	     */
		private int watchtype;
        /**
	     * 
	     */
		private int watchoption;
        /**
	     * 
	     */
		private int watchstatus;
        /**
	     * 
	     */
		private Date watchcreationdate;
        /**
	     * 
	     */
		private Date watchlastsentdate;
        /**
	     * 
	     */
		private Date watchenddate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getWatchid() {
     
		return watchid;
	    }
        
	    public void setWatchid(int watchid) {
		this.watchid = watchid;
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
		
        public int getCategoryid() {
     
		return categoryid;
	    }
        
	    public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
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
		
        public int getThreadid() {
     
		return threadid;
	    }
        
	    public void setThreadid(int threadid) {
		this.threadid = threadid;
	    }
       

	    /**
		*
		*/
		
        public int getWatchtype() {
     
		return watchtype;
	    }
        
	    public void setWatchtype(int watchtype) {
		this.watchtype = watchtype;
	    }
       

	    /**
		*
		*/
		
        public int getWatchoption() {
     
		return watchoption;
	    }
        
	    public void setWatchoption(int watchoption) {
		this.watchoption = watchoption;
	    }
       

	    /**
		*
		*/
		
        public int getWatchstatus() {
     
		return watchstatus;
	    }
        
	    public void setWatchstatus(int watchstatus) {
		this.watchstatus = watchstatus;
	    }
       

	    /**
		*
		*/
		
        public Date getWatchcreationdate() {
     
		return watchcreationdate;
	    }
        
	    public void setWatchcreationdate(Date watchcreationdate) {
		this.watchcreationdate = watchcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getWatchlastsentdate() {
     
		return watchlastsentdate;
	    }
        
	    public void setWatchlastsentdate(Date watchlastsentdate) {
		this.watchlastsentdate = watchlastsentdate;
	    }
       

	    /**
		*
		*/
		
        public Date getWatchenddate() {
     
		return watchenddate;
	    }
        
	    public void setWatchenddate(Date watchenddate) {
		this.watchenddate = watchenddate;
	    }
       
      /*  public static aihao_dao convert(mvnforumwatch_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setWatchid(_dao.getWatchid());
        
        temp.setMemberid(_dao.getMemberid());
        
        temp.setCategoryid(_dao.getCategoryid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setThreadid(_dao.getThreadid());
        
        temp.setWatchtype(_dao.getWatchtype());
        
        temp.setWatchoption(_dao.getWatchoption());
        
        temp.setWatchstatus(_dao.getWatchstatus());
        
        temp.setWatchcreationdate(_dao.getWatchcreationdate());
        
        temp.setWatchlastsentdate(_dao.getWatchlastsentdate());
        
        temp.setWatchenddate(_dao.getWatchenddate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

