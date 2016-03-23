/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumprovinceEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMPROVINCE数据实体
    *@作者：宋春林 
    */

	public class mvnforumprovince_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int proid;
        /**
	     * 
	     */
		private String proname;
        /**
	     * 
	     */
		private String keys;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getProid() {
     
		return proid;
	    }
        
	    public void setProid(int proid) {
		this.proid = proid;
	    }
       

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
		
        public String getKeys() {
     
		return keys;
	    }
        
	    public void setKeys(String keys) {
		this.keys = keys;
	    }
       
      /*  public static aihao_dao convert(mvnforumprovince_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setProid(_dao.getProid());
        
        temp.setProname(_dao.getProname());
        
        temp.setKeys(_dao.getKeys());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

