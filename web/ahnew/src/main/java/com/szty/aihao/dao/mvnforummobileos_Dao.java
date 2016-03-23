/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforummobileosEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMMOBILEOS数据实体
    *@作者：宋春林 
    */

	public class mvnforummobileos_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int mobileosid;
        /**
	     * 
	     */
		private String mobilemanufacturer;
        /**
	     * 
	     */
		private String operatingsystem;
        /**
	     * 
	     */
		private String mobilescreen;
        /**
	     * 
	     */
		private String mobiletype;
        /**
	     * 
	     */
		private String java;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getMobileosid() {
     
		return mobileosid;
	    }
        
	    public void setMobileosid(int mobileosid) {
		this.mobileosid = mobileosid;
	    }
       

	    /**
		*
		*/
		
        public String getMobilemanufacturer() {
     
		return mobilemanufacturer;
	    }
        
	    public void setMobilemanufacturer(String mobilemanufacturer) {
		this.mobilemanufacturer = mobilemanufacturer;
	    }
       

	    /**
		*
		*/
		
        public String getOperatingsystem() {
     
		return operatingsystem;
	    }
        
	    public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	    }
       

	    /**
		*
		*/
		
        public String getMobilescreen() {
     
		return mobilescreen;
	    }
        
	    public void setMobilescreen(String mobilescreen) {
		this.mobilescreen = mobilescreen;
	    }
       

	    /**
		*
		*/
		
        public String getMobiletype() {
     
		return mobiletype;
	    }
        
	    public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	    }
       

	    /**
		*
		*/
		
        public String getJava() {
     
		return java;
	    }
        
	    public void setJava(String java) {
		this.java = java;
	    }
       
      /*  public static aihao_dao convert(mvnforummobileos_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMobileosid(_dao.getMobileosid());
        
        temp.setMobilemanufacturer(_dao.getMobilemanufacturer());
        
        temp.setOperatingsystem(_dao.getOperatingsystem());
        
        temp.setMobilescreen(_dao.getMobilescreen());
        
        temp.setMobiletype(_dao.getMobiletype());
        
        temp.setJava(_dao.getJava());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

