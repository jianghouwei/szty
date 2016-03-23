/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaoactivitylogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOACTIVITYLOG数据实体
    *@作者：宋春林 
    */

	public class aihaoactivitylog_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int activtiylogid;
        /**
	     * 
	     */
		private String activtiyname;
        /**
	     * 
	     */
		private String uniquevalue;
        /**
	     * 
	     */
		private Date cdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getActivtiylogid() {
     
		return activtiylogid;
	    }
        
	    public void setActivtiylogid(int activtiylogid) {
		this.activtiylogid = activtiylogid;
	    }
       

	    /**
		*
		*/
		
        public String getActivtiyname() {
     
		return activtiyname;
	    }
        
	    public void setActivtiyname(String activtiyname) {
		this.activtiyname = activtiyname;
	    }
       

	    /**
		*
		*/
		
        public String getUniquevalue() {
     
		return uniquevalue;
	    }
        
	    public void setUniquevalue(String uniquevalue) {
		this.uniquevalue = uniquevalue;
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
       
      /*  public static aihao_dao convert(aihaoactivitylog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setActivtiylogid(_dao.getActivtiylogid());
        
        temp.setActivtiyname(_dao.getActivtiyname());
        
        temp.setUniquevalue(_dao.getUniquevalue());
        
        temp.setCdate(_dao.getCdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

