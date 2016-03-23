/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： test_charEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TEST_CHAR数据实体
    *@作者：宋春林 
    */

	public class test_char_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String char_col;
        /**
	     * 
	     */
		private String varchar_col;
        /**
	     * 
	     */
		private String long_col;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getChar_col() {
     
		return char_col;
	    }
        
	    public void setChar_col(String char_col) {
		this.char_col = char_col;
	    }
       

	    /**
		*
		*/
		
        public String getVarchar_col() {
     
		return varchar_col;
	    }
        
	    public void setVarchar_col(String varchar_col) {
		this.varchar_col = varchar_col;
	    }
       

	    /**
		*
		*/
		
        public String getLong_col() {
     
		return long_col;
	    }
        
	    public void setLong_col(String long_col) {
		this.long_col = long_col;
	    }
       
      /*  public static aihao_dao convert(test_char_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setChar_col(_dao.getChar_col());
        
        temp.setVarchar_col(_dao.getVarchar_col());
        
        temp.setLong_col(_dao.getLong_col());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

