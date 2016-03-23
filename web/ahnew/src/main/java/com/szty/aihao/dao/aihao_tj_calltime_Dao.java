/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihao_tj_calltimeEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAO_TJ_CALLTIME数据实体
    *@作者：宋春林 
    */

	public class aihao_tj_calltime_Dao implements Serializable
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
		private String telnum;
        /**
	     * 
	     */
		private String teltime;
        /**
	     * 
	     */
		private int tellong;
        /**
	     * 
	     */
		private String rmk;
        /**
	     * 
	     */
		private String os;
        
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
		
        public String getTelnum() {
     
		return telnum;
	    }
        
	    public void setTelnum(String telnum) {
		this.telnum = telnum;
	    }
       

	    /**
		*
		*/
		
        public String getTeltime() {
     
		return teltime;
	    }
        
	    public void setTeltime(String teltime) {
		this.teltime = teltime;
	    }
       

	    /**
		*
		*/
		
        public int getTellong() {
     
		return tellong;
	    }
        
	    public void setTellong(int tellong) {
		this.tellong = tellong;
	    }
       

	    /**
		*
		*/
		
        public String getRmk() {
     
		return rmk;
	    }
        
	    public void setRmk(String rmk) {
		this.rmk = rmk;
	    }
       

	    /**
		*
		*/
		
        public String getOs() {
     
		return os;
	    }
        
	    public void setOs(String os) {
		this.os = os;
	    }
       
      /*  public static aihao_dao convert(aihao_tj_calltime_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setTelnum(_dao.getTelnum());
        
        temp.setTeltime(_dao.getTeltime());
        
        temp.setTellong(_dao.getTellong());
        
        temp.setRmk(_dao.getRmk());
        
        temp.setOs(_dao.getOs());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

