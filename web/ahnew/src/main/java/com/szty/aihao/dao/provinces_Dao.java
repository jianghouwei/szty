/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： provincesEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@PROVINCES数据实体
    *@作者：宋春林 
    */

	public class provinces_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String proname;
        /**
	     * 
	     */
		private int procode;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getProname() {
     
		return proname;
	    }
        
	    public void setProname(String proname) {
		this.proname = proname;
	    }
       

	    /**
		*
		*/
		
        public int getProcode() {
     
		return procode;
	    }
        
	    public void setProcode(int procode) {
		this.procode = procode;
	    }
       
      /*  public static aihao_dao convert(provinces_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setProname(_dao.getProname());
        
        temp.setProcode(_dao.getProcode());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

