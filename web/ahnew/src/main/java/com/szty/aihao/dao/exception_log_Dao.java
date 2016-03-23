/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： exception_logEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@EXCEPTION_LOG数据实体
    *@作者：宋春林 
    */

	public class exception_log_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private Date datetime;
        /**
	     * 
	     */
		private String err_model;
        /**
	     * 
	     */
		private String err_code;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public Date getDatetime() {
     
		return datetime;
	    }
        
	    public void setDatetime(Date datetime) {
		this.datetime = datetime;
	    }
       

	    /**
		*
		*/
		
        public String getErr_model() {
     
		return err_model;
	    }
        
	    public void setErr_model(String err_model) {
		this.err_model = err_model;
	    }
       

	    /**
		*
		*/
		
        public String getErr_code() {
     
		return err_code;
	    }
        
	    public void setErr_code(String err_code) {
		this.err_code = err_code;
	    }
       
      /*  public static aihao_dao convert(exception_log_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setDatetime(_dao.getDatetime());
        
        temp.setErr_model(_dao.getErr_model());
        
        temp.setErr_code(_dao.getErr_code());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

