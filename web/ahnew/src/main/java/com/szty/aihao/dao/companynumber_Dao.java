/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： companynumberEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@COMPANYNUMBER数据实体
    *@作者：宋春林 
    */

	public class companynumber_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String mobilenumber;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getMobilenumber() {
     
		return mobilenumber;
	    }
        
	    public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	    }
       
      /*  public static aihao_dao convert(companynumber_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMobilenumber(_dao.getMobilenumber());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

