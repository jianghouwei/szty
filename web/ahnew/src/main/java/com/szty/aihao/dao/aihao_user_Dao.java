/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihao_userEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAO_USER数据实体
    *@作者：宋春林 
    */

	public class aihao_user_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int id;
        /**
	     * 
	     */
		private String username;
        /**
	     * 
	     */
		private String password;
        /**
	     * 
	     */
		private Date ctime;
        /**
	     * 
	     */
		private Date utime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*
		*/
		
        public String getUsername() {
     
		return username;
	    }
        
	    public void setUsername(String username) {
		this.username = username;
	    }
       

	    /**
		*
		*/
		
        public String getPassword() {
     
		return password;
	    }
        
	    public void setPassword(String password) {
		this.password = password;
	    }
       

	    /**
		*
		*/
		
        public Date getCtime() {
     
		return ctime;
	    }
        
	    public void setCtime(Date ctime) {
		this.ctime = ctime;
	    }
       

	    /**
		*
		*/
		
        public Date getUtime() {
     
		return utime;
	    }
        
	    public void setUtime(Date utime) {
		this.utime = utime;
	    }
       
      /*  public static aihao_dao convert(aihao_user_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setUsername(_dao.getUsername());
        
        temp.setPassword(_dao.getPassword());
        
        temp.setCtime(_dao.getCtime());
        
        temp.setUtime(_dao.getUtime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

