/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： test_ncharEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TEST_NCHAR数据实体
    *@作者：宋春林 
    */

	public class test_nchar_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String nchar_col;
        /**
	     * 
	     */
		private String nvarchar_col;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getNchar_col() {
     
		return nchar_col;
	    }
        
	    public void setNchar_col(String nchar_col) {
		this.nchar_col = nchar_col;
	    }
       

	    /**
		*
		*/
		
        public String getNvarchar_col() {
     
		return nvarchar_col;
	    }
        
	    public void setNvarchar_col(String nvarchar_col) {
		this.nvarchar_col = nvarchar_col;
	    }
       
      /*  public static aihao_dao convert(test_nchar_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setNchar_col(_dao.getNchar_col());
        
        temp.setNvarchar_col(_dao.getNvarchar_col());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

