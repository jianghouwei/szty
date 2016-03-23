/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： waphaoclassEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@WAPHAOCLASS数据实体
    *@作者：宋春林 
    */

	public class waphaoclass_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String cat;
        /**
	     * 
	     */
		private String name;
        /**
	     * 
	     */
		private String url;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getCat() {
     
		return cat;
	    }
        
	    public void setCat(String cat) {
		this.cat = cat;
	    }
       

	    /**
		*
		*/
		
        public String getName() {
     
		return name;
	    }
        
	    public void setName(String name) {
		this.name = name;
	    }
       

	    /**
		*
		*/
		
        public String getUrl() {
     
		return url;
	    }
        
	    public void setUrl(String url) {
		this.url = url;
	    }
       
      /*  public static aihao_dao convert(waphaoclass_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setCat(_dao.getCat());
        
        temp.setName(_dao.getName());
        
        temp.setUrl(_dao.getUrl());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

