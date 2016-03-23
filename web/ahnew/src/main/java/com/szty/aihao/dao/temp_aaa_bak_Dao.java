/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： temp_aaa_bakEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TEMP_AAA_BAK数据实体
    *@作者：宋春林 
    */

	public class temp_aaa_bak_Dao implements Serializable
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
		private String mobile;
        
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
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       
      /*  public static aihao_dao convert(temp_aaa_bak_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPrefix(_dao.getPrefix());
        
        temp.setMobile(_dao.getMobile());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

