/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： test_varcharEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TEST_VARCHAR数据实体
    *@作者：宋春林 
    */

	public class test_varchar_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String varchar_col;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getVarchar_col() {
     
		return varchar_col;
	    }
        
	    public void setVarchar_col(String varchar_col) {
		this.varchar_col = varchar_col;
	    }
       
      /*  public static aihao_dao convert(test_varchar_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setVarchar_col(_dao.getVarchar_col());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

