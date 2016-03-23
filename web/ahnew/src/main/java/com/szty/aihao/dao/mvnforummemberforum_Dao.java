/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforummemberforumEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMMEMBERFORUM数据实体
    *@作者：宋春林 
    */

	public class mvnforummemberforum_Dao implements Serializable
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
		
        public int getMemberid() {
     
		return memberid;
	    }
        
	    public void setMemberid(int memberid) {
		this.memberid = memberid;
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
       
      /*  public static aihao_dao convert(mvnforummemberforum_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMemberid(_dao.getMemberid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setPermission(_dao.getPermission());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

