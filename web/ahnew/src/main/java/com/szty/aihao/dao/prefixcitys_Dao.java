﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： prefixcitysEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@PREFIXCITYS数据实体
    *@作者：宋春林 
    */

	public class prefixcitys_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String prefix;
        /**
	     * 
	     */
		private int procode;
        /**
	     * 
	     */
		private int citycode;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getPrefix() {
     
		return prefix;
	    }
        
	    public void setPrefix(String prefix) {
		this.prefix = prefix;
	    }
       

	    /**
		*
		*/
		
        public int getProcode() {
     
		return procode;
	    }
        
	    public void setProcode(int procode) {
		this.procode = procode;
	    }
       

	    /**
		*
		*/
		
        public int getCitycode() {
     
		return citycode;
	    }
        
	    public void setCitycode(int citycode) {
		this.citycode = citycode;
	    }
       
      /*  public static aihao_dao convert(prefixcitys_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPrefix(_dao.getPrefix());
        
        temp.setProcode(_dao.getProcode());
        
        temp.setCitycode(_dao.getCitycode());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

