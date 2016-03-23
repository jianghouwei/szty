/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumringadapterEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMRINGADAPTER数据实体
    *@作者：宋春林 
    */

	public class mvnforumringadapter_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int adapterid;
        /**
	     * 
	     */
		private int ringid;
        /**
	     * 
	     */
		private String adaptername;
        /**
	     * 
	     */
		private String ringformat;
        /**
	     * 
	     */
		private int ringsize;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getAdapterid() {
     
		return adapterid;
	    }
        
	    public void setAdapterid(int adapterid) {
		this.adapterid = adapterid;
	    }
       

	    /**
		*
		*/
		
        public int getRingid() {
     
		return ringid;
	    }
        
	    public void setRingid(int ringid) {
		this.ringid = ringid;
	    }
       

	    /**
		*
		*/
		
        public String getAdaptername() {
     
		return adaptername;
	    }
        
	    public void setAdaptername(String adaptername) {
		this.adaptername = adaptername;
	    }
       

	    /**
		*
		*/
		
        public String getRingformat() {
     
		return ringformat;
	    }
        
	    public void setRingformat(String ringformat) {
		this.ringformat = ringformat;
	    }
       

	    /**
		*
		*/
		
        public int getRingsize() {
     
		return ringsize;
	    }
        
	    public void setRingsize(int ringsize) {
		this.ringsize = ringsize;
	    }
       

	    /**
		*
		*/
		
        public int getViewcount() {
     
		return viewcount;
	    }
        
	    public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	    }
       
      /*  public static aihao_dao convert(mvnforumringadapter_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setAdapterid(_dao.getAdapterid());
        
        temp.setRingid(_dao.getRingid());
        
        temp.setAdaptername(_dao.getAdaptername());
        
        temp.setRingformat(_dao.getRingformat());
        
        temp.setRingsize(_dao.getRingsize());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

