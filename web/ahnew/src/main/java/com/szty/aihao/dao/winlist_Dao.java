/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： winlistEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@WINLIST数据实体
    *@作者：宋春林 
    */

	public class winlist_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private long winnerid;
        /**
	     * 
	     */
		private String username;
        /**
	     * 
	     */
		private String phone;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private int status;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public long getWinnerid() {
     
		return winnerid;
	    }
        
	    public void setWinnerid(long winnerid) {
		this.winnerid = winnerid;
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
		
        public String getPhone() {
     
		return phone;
	    }
        
	    public void setPhone(String phone) {
		this.phone = phone;
	    }
       

	    /**
		*
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       

	    /**
		*
		*/
		
        public int getStatus() {
     
		return status;
	    }
        
	    public void setStatus(int status) {
		this.status = status;
	    }
       
      /*  public static aihao_dao convert(winlist_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setWinnerid(_dao.getWinnerid());
        
        temp.setUsername(_dao.getUsername());
        
        temp.setPhone(_dao.getPhone());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setStatus(_dao.getStatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

