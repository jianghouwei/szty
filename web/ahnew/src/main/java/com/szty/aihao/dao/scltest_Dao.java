/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： scltestEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SCLTEST数据实体
    *@作者：宋春林 
    */

	public class scltest_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 主健
	     */
		private int id;
        /**
	     * TEST1
	     */
		private String test1;
        /**
	     * TEST2
	     */
		private String test2;
        /**
	     * TEST3
	     */
		private String test3;
        /**
	     * 时间
	     */
		private Date adddate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*主健
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*TEST1
		*/
		
        public String getTest1() {
     
		return test1;
	    }
        
	    public void setTest1(String test1) {
		this.test1 = test1;
	    }
       

	    /**
		*TEST2
		*/
		
        public String getTest2() {
     
		return test2;
	    }
        
	    public void setTest2(String test2) {
		this.test2 = test2;
	    }
       

	    /**
		*TEST3
		*/
		
        public String getTest3() {
     
		return test3;
	    }
        
	    public void setTest3(String test3) {
		this.test3 = test3;
	    }
       

	    /**
		*时间
		*/
		
        public Date getAdddate() {
     
		return adddate;
	    }
        
	    public void setAdddate(Date adddate) {
		this.adddate = adddate;
	    }
       
      /*  public static aihao_dao convert(scltest_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setTest1(_dao.getTest1());
        
        temp.setTest2(_dao.getTest2());
        
        temp.setTest3(_dao.getTest3());
        
        temp.setAdddate(_dao.getAdddate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

