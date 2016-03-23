/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： ddinputEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@DDINPUT数据实体
    *@作者：宋春林 
    */

	public class ddinput_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String ddcity;
        /**
	     * 
	     */
		private String ddcityid;
        /**
	     * 
	     */
		private String ddband;
        /**
	     * 
	     */
		private String ddbandid;
        /**
	     * 
	     */
		private String aihaopro;
        /**
	     * 
	     */
		private String aihaocity;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getDdcity() {
     
		return ddcity;
	    }
        
	    public void setDdcity(String ddcity) {
		this.ddcity = ddcity;
	    }
       

	    /**
		*
		*/
		
        public String getDdcityid() {
     
		return ddcityid;
	    }
        
	    public void setDdcityid(String ddcityid) {
		this.ddcityid = ddcityid;
	    }
       

	    /**
		*
		*/
		
        public String getDdband() {
     
		return ddband;
	    }
        
	    public void setDdband(String ddband) {
		this.ddband = ddband;
	    }
       

	    /**
		*
		*/
		
        public String getDdbandid() {
     
		return ddbandid;
	    }
        
	    public void setDdbandid(String ddbandid) {
		this.ddbandid = ddbandid;
	    }
       

	    /**
		*
		*/
		
        public String getAihaopro() {
     
		return aihaopro;
	    }
        
	    public void setAihaopro(String aihaopro) {
		this.aihaopro = aihaopro;
	    }
       

	    /**
		*
		*/
		
        public String getAihaocity() {
     
		return aihaocity;
	    }
        
	    public void setAihaocity(String aihaocity) {
		this.aihaocity = aihaocity;
	    }
       
      /*  public static aihao_dao convert(ddinput_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setDdcity(_dao.getDdcity());
        
        temp.setDdcityid(_dao.getDdcityid());
        
        temp.setDdband(_dao.getDdband());
        
        temp.setDdbandid(_dao.getDdbandid());
        
        temp.setAihaopro(_dao.getAihaopro());
        
        temp.setAihaocity(_dao.getAihaocity());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

