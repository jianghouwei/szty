/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： t_stat_weekly2Entity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@T_STAT_WEEKLY2数据实体
    *@作者：宋春林 
    */

	public class t_stat_weekly2_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String item;
        /**
	     * 
	     */
		private String rmk1;
        /**
	     * 
	     */
		private String rmk2;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getItem() {
     
		return item;
	    }
        
	    public void setItem(String item) {
		this.item = item;
	    }
       

	    /**
		*
		*/
		
        public String getRmk1() {
     
		return rmk1;
	    }
        
	    public void setRmk1(String rmk1) {
		this.rmk1 = rmk1;
	    }
       

	    /**
		*
		*/
		
        public String getRmk2() {
     
		return rmk2;
	    }
        
	    public void setRmk2(String rmk2) {
		this.rmk2 = rmk2;
	    }
       
      /*  public static aihao_dao convert(t_stat_weekly2_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setItem(_dao.getItem());
        
        temp.setRmk1(_dao.getRmk1());
        
        temp.setRmk2(_dao.getRmk2());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

