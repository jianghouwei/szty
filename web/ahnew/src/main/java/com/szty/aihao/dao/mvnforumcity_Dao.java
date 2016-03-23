/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumcityEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMCITY数据实体
    *@作者：宋春林 
    */

	public class mvnforumcity_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int cityid;
        /**
	     * 
	     */
		private String cityname;
        /**
	     * 
	     */
		private int proid;
        /**
	     * 
	     */
		private String keys;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getCityid() {
     
		return cityid;
	    }
        
	    public void setCityid(int cityid) {
		this.cityid = cityid;
	    }
       

	    /**
		*
		*/
		
        public String getCityname() {
     
		return cityname;
	    }
        
	    public void setCityname(String cityname) {
		this.cityname = cityname;
	    }
       

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
		
        public String getKeys() {
     
		return keys;
	    }
        
	    public void setKeys(String keys) {
		this.keys = keys;
	    }
       
      /*  public static aihao_dao convert(mvnforumcity_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setCityid(_dao.getCityid());
        
        temp.setCityname(_dao.getCityname());
        
        temp.setProid(_dao.getProid());
        
        temp.setKeys(_dao.getKeys());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

