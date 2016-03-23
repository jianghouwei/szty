/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsymconfigEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSYMCONFIG数据实体
    *@作者：宋春林 
    */

	public class mvnforumsymconfig_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int configid;
        /**
	     * 
	     */
		private String contentid;
        /**
	     * 
	     */
		private int flg;
        /**
	     * 
	     */
		private String supportua;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getConfigid() {
     
		return configid;
	    }
        
	    public void setConfigid(int configid) {
		this.configid = configid;
	    }
       

	    /**
		*
		*/
		
        public String getContentid() {
     
		return contentid;
	    }
        
	    public void setContentid(String contentid) {
		this.contentid = contentid;
	    }
       

	    /**
		*
		*/
		
        public int getFlg() {
     
		return flg;
	    }
        
	    public void setFlg(int flg) {
		this.flg = flg;
	    }
       

	    /**
		*
		*/
		
        public String getSupportua() {
     
		return supportua;
	    }
        
	    public void setSupportua(String supportua) {
		this.supportua = supportua;
	    }
       
      /*  public static aihao_dao convert(mvnforumsymconfig_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setConfigid(_dao.getConfigid());
        
        temp.setContentid(_dao.getContentid());
        
        temp.setFlg(_dao.getFlg());
        
        temp.setSupportua(_dao.getSupportua());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

