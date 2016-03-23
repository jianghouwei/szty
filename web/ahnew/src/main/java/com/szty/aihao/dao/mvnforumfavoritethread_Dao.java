/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumfavoritethreadEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMFAVORITETHREAD数据实体
    *@作者：宋春林 
    */

	public class mvnforumfavoritethread_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int memberid;
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
		private Date favoritecreationdate;
        /**
	     * 
	     */
		private int favoritetype;
        /**
	     * 
	     */
		private int favoriteoption;
        /**
	     * 
	     */
		private int favoritestatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public Date getFavoritecreationdate() {
     
		return favoritecreationdate;
	    }
        
	    public void setFavoritecreationdate(Date favoritecreationdate) {
		this.favoritecreationdate = favoritecreationdate;
	    }
       

	    /**
		*
		*/
		
        public int getFavoritetype() {
     
		return favoritetype;
	    }
        
	    public void setFavoritetype(int favoritetype) {
		this.favoritetype = favoritetype;
	    }
       

	    /**
		*
		*/
		
        public int getFavoriteoption() {
     
		return favoriteoption;
	    }
        
	    public void setFavoriteoption(int favoriteoption) {
		this.favoriteoption = favoriteoption;
	    }
       

	    /**
		*
		*/
		
        public int getFavoritestatus() {
     
		return favoritestatus;
	    }
        
	    public void setFavoritestatus(int favoritestatus) {
		this.favoritestatus = favoritestatus;
	    }
       
      /*  public static aihao_dao convert(mvnforumfavoritethread_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMemberid(_dao.getMemberid());
        
        temp.setThreadid(_dao.getThreadid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setFavoritecreationdate(_dao.getFavoritecreationdate());
        
        temp.setFavoritetype(_dao.getFavoritetype());
        
        temp.setFavoriteoption(_dao.getFavoriteoption());
        
        temp.setFavoritestatus(_dao.getFavoritestatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

