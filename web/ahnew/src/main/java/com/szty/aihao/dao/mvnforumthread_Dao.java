/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumthreadEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMTHREAD数据实体
    *@作者：宋春林 
    */

	public class mvnforumthread_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int threadid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private String membername;
        /**
	     * 
	     */
		private String lastpostmembername;
        /**
	     * 
	     */
		private String threadtopic;
        /**
	     * 
	     */
		private String threadbody;
        /**
	     * 
	     */
		private int threadvotecount;
        /**
	     * 
	     */
		private int threadvotetotalstars;
        /**
	     * 
	     */
		private Date threadcreationdate;
        /**
	     * 
	     */
		private Date threadlastpostdate;
        /**
	     * 
	     */
		private int threadtype;
        /**
	     * 
	     */
		private int threadpriority;
        /**
	     * 
	     */
		private int threadoption;
        /**
	     * 
	     */
		private int threadstatus;
        /**
	     * 
	     */
		private int threadhaspoll;
        /**
	     * 
	     */
		private int threadviewcount;
        /**
	     * 
	     */
		private int threadreplycount;
        /**
	     * 
	     */
		private String threadicon;
        /**
	     * 
	     */
		private int threadduration;
        /**
	     * 
	     */
		private int threadattachcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public int getForumid() {
     
		return forumid;
	    }
        
	    public void setForumid(int forumid) {
		this.forumid = forumid;
	    }
       

	    /**
		*
		*/
		
        public String getMembername() {
     
		return membername;
	    }
        
	    public void setMembername(String membername) {
		this.membername = membername;
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
		
        public String getThreadtopic() {
     
		return threadtopic;
	    }
        
	    public void setThreadtopic(String threadtopic) {
		this.threadtopic = threadtopic;
	    }
       

	    /**
		*
		*/
		
        public String getThreadbody() {
     
		return threadbody;
	    }
        
	    public void setThreadbody(String threadbody) {
		this.threadbody = threadbody;
	    }
       

	    /**
		*
		*/
		
        public int getThreadvotecount() {
     
		return threadvotecount;
	    }
        
	    public void setThreadvotecount(int threadvotecount) {
		this.threadvotecount = threadvotecount;
	    }
       

	    /**
		*
		*/
		
        public int getThreadvotetotalstars() {
     
		return threadvotetotalstars;
	    }
        
	    public void setThreadvotetotalstars(int threadvotetotalstars) {
		this.threadvotetotalstars = threadvotetotalstars;
	    }
       

	    /**
		*
		*/
		
        public Date getThreadcreationdate() {
     
		return threadcreationdate;
	    }
        
	    public void setThreadcreationdate(Date threadcreationdate) {
		this.threadcreationdate = threadcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getThreadlastpostdate() {
     
		return threadlastpostdate;
	    }
        
	    public void setThreadlastpostdate(Date threadlastpostdate) {
		this.threadlastpostdate = threadlastpostdate;
	    }
       

	    /**
		*
		*/
		
        public int getThreadtype() {
     
		return threadtype;
	    }
        
	    public void setThreadtype(int threadtype) {
		this.threadtype = threadtype;
	    }
       

	    /**
		*
		*/
		
        public int getThreadpriority() {
     
		return threadpriority;
	    }
        
	    public void setThreadpriority(int threadpriority) {
		this.threadpriority = threadpriority;
	    }
       

	    /**
		*
		*/
		
        public int getThreadoption() {
     
		return threadoption;
	    }
        
	    public void setThreadoption(int threadoption) {
		this.threadoption = threadoption;
	    }
       

	    /**
		*
		*/
		
        public int getThreadstatus() {
     
		return threadstatus;
	    }
        
	    public void setThreadstatus(int threadstatus) {
		this.threadstatus = threadstatus;
	    }
       

	    /**
		*
		*/
		
        public int getThreadhaspoll() {
     
		return threadhaspoll;
	    }
        
	    public void setThreadhaspoll(int threadhaspoll) {
		this.threadhaspoll = threadhaspoll;
	    }
       

	    /**
		*
		*/
		
        public int getThreadviewcount() {
     
		return threadviewcount;
	    }
        
	    public void setThreadviewcount(int threadviewcount) {
		this.threadviewcount = threadviewcount;
	    }
       

	    /**
		*
		*/
		
        public int getThreadreplycount() {
     
		return threadreplycount;
	    }
        
	    public void setThreadreplycount(int threadreplycount) {
		this.threadreplycount = threadreplycount;
	    }
       

	    /**
		*
		*/
		
        public String getThreadicon() {
     
		return threadicon;
	    }
        
	    public void setThreadicon(String threadicon) {
		this.threadicon = threadicon;
	    }
       

	    /**
		*
		*/
		
        public int getThreadduration() {
     
		return threadduration;
	    }
        
	    public void setThreadduration(int threadduration) {
		this.threadduration = threadduration;
	    }
       

	    /**
		*
		*/
		
        public int getThreadattachcount() {
     
		return threadattachcount;
	    }
        
	    public void setThreadattachcount(int threadattachcount) {
		this.threadattachcount = threadattachcount;
	    }
       
      /*  public static aihao_dao convert(mvnforumthread_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setThreadid(_dao.getThreadid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setMembername(_dao.getMembername());
        
        temp.setLastpostmembername(_dao.getLastpostmembername());
        
        temp.setThreadtopic(_dao.getThreadtopic());
        
        temp.setThreadbody(_dao.getThreadbody());
        
        temp.setThreadvotecount(_dao.getThreadvotecount());
        
        temp.setThreadvotetotalstars(_dao.getThreadvotetotalstars());
        
        temp.setThreadcreationdate(_dao.getThreadcreationdate());
        
        temp.setThreadlastpostdate(_dao.getThreadlastpostdate());
        
        temp.setThreadtype(_dao.getThreadtype());
        
        temp.setThreadpriority(_dao.getThreadpriority());
        
        temp.setThreadoption(_dao.getThreadoption());
        
        temp.setThreadstatus(_dao.getThreadstatus());
        
        temp.setThreadhaspoll(_dao.getThreadhaspoll());
        
        temp.setThreadviewcount(_dao.getThreadviewcount());
        
        temp.setThreadreplycount(_dao.getThreadreplycount());
        
        temp.setThreadicon(_dao.getThreadicon());
        
        temp.setThreadduration(_dao.getThreadduration());
        
        temp.setThreadattachcount(_dao.getThreadattachcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

