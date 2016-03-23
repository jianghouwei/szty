/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： test_col_rowEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TEST_COL_ROW数据实体
    *@作者：宋春林 
    */

	public class test_col_row_Dao implements Serializable
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
		private String c1;
        /**
	     * 
	     */
		private String c2;
        /**
	     * 
	     */
		private String c3;
        
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
		
        public String getC1() {
     
		return c1;
	    }
        
	    public void setC1(String c1) {
		this.c1 = c1;
	    }
       

	    /**
		*
		*/
		
        public String getC2() {
     
		return c2;
	    }
        
	    public void setC2(String c2) {
		this.c2 = c2;
	    }
       

	    /**
		*
		*/
		
        public String getC3() {
     
		return c3;
	    }
        
	    public void setC3(String c3) {
		this.c3 = c3;
	    }
       
      /*  public static aihao_dao convert(test_col_row_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setC1(_dao.getC1());
        
        temp.setC2(_dao.getC2());
        
        temp.setC3(_dao.getC3());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

