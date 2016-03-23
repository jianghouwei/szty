/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： urlhaoEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@URLHAO数据实体
    *@作者：宋春林 
    */

	public class urlhao_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private long haoid;
        /**
	     * 
	     */
		private String name;
        /**
	     * 
	     */
		private String url;
        /**
	     * 
	     */
		private Date cdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public long getHaoid() {
     
		return haoid;
	    }
        
	    public void setHaoid(long haoid) {
		this.haoid = haoid;
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
       

	    /**
		*
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       
      /*  public static aihao_dao convert(urlhao_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setHaoid(_dao.getHaoid());
        
        temp.setName(_dao.getName());
        
        temp.setUrl(_dao.getUrl());
        
        temp.setCdate(_dao.getCdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

