/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： china_areaEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@CHINA_AREA数据实体
    *@作者：宋春林 
    */

	public class china_area_Dao implements Serializable
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
		private String name;
        /**
	     * 
	     */
		private int lv;
        /**
	     * 
	     */
		private int usetype;
        /**
	     * 
	     */
		private int upid;
        /**
	     * 
	     */
		private int displayorder;
        
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
		
        public String getName() {
     
		return name;
	    }
        
	    public void setName(String name) {
		this.name = name;
	    }
       

	    /**
		*
		*/
		
        public int getLv() {
     
		return lv;
	    }
        
	    public void setLv(int lv) {
		this.lv = lv;
	    }
       

	    /**
		*
		*/
		
        public int getUsetype() {
     
		return usetype;
	    }
        
	    public void setUsetype(int usetype) {
		this.usetype = usetype;
	    }
       

	    /**
		*
		*/
		
        public int getUpid() {
     
		return upid;
	    }
        
	    public void setUpid(int upid) {
		this.upid = upid;
	    }
       

	    /**
		*
		*/
		
        public int getDisplayorder() {
     
		return displayorder;
	    }
        
	    public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	    }
       
      /*  public static aihao_dao convert(china_area_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setName(_dao.getName());
        
        temp.setLv(_dao.getLv());
        
        temp.setUsetype(_dao.getUsetype());
        
        temp.setUpid(_dao.getUpid());
        
        temp.setDisplayorder(_dao.getDisplayorder());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

