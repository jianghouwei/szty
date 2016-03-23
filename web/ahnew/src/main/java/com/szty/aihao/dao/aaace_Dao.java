/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aaaceEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AAACE数据实体
    *@作者：宋春林 
    */

	public class aaace_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String id;
        /**
	     * 
	     */
		private String xxx;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getId() {
     
		return id;
	    }
        
	    public void setId(String id) {
		this.id = id;
	    }
       

	    /**
		*
		*/
		
        public String getXxx() {
     
		return xxx;
	    }
        
	    public void setXxx(String xxx) {
		this.xxx = xxx;
	    }
       
      /*  public static aihao_dao convert(aaace_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setXxx(_dao.getXxx());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

