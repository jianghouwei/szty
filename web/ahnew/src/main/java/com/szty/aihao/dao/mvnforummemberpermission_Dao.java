﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforummemberpermissionEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMMEMBERPERMISSION数据实体
    *@作者：宋春林 
    */

	public class mvnforummemberpermission_Dao implements Serializable
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
		
        public int getPermission() {
     
		return permission;
	    }
        
	    public void setPermission(int permission) {
		this.permission = permission;
	    }
       
      /*  public static aihao_dao convert(mvnforummemberpermission_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMemberid(_dao.getMemberid());
        
        temp.setPermission(_dao.getPermission());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

