/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mobileareamapEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MOBILEAREAMAP数据实体
    *@作者：宋春林 
    */

	public class mobileareamap_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String area_id;
        /**
	     * 
	     */
		private String area_name;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getArea_id() {
     
		return area_id;
	    }
        
	    public void setArea_id(String area_id) {
		this.area_id = area_id;
	    }
       

	    /**
		*
		*/
		
        public String getArea_name() {
     
		return area_name;
	    }
        
	    public void setArea_name(String area_name) {
		this.area_name = area_name;
	    }
       
      /*  public static aihao_dao convert(mobileareamap_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setArea_id(_dao.getArea_id());
        
        temp.setArea_name(_dao.getArea_name());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

