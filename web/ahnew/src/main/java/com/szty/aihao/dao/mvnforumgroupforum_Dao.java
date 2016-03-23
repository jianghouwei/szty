/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumgroupforumEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMGROUPFORUM数据实体
    *@作者：宋春林 
    */

	public class mvnforumgroupforum_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int groupid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private int permission;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getGroupid() {
     
		return groupid;
	    }
        
	    public void setGroupid(int groupid) {
		this.groupid = groupid;
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
		
        public int getPermission() {
     
		return permission;
	    }
        
	    public void setPermission(int permission) {
		this.permission = permission;
	    }
       
      /*  public static aihao_dao convert(mvnforumgroupforum_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGroupid(_dao.getGroupid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setPermission(_dao.getPermission());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

