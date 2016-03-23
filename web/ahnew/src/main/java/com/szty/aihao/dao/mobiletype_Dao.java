/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mobiletypeEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MOBILETYPE数据实体
    *@作者：宋春林 
    */

	public class mobiletype_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int motypeid;
        /**
	     * 
	     */
		private int osid;
        /**
	     * 
	     */
		private String motypename;
        /**
	     * 
	     */
		private String motypeicon;
        /**
	     * 
	     */
		private String motypesis;
        /**
	     * 
	     */
		private Date motypecreationdate;
        /**
	     * 
	     */
		private int motypestatus;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getMotypeid() {
     
		return motypeid;
	    }
        
	    public void setMotypeid(int motypeid) {
		this.motypeid = motypeid;
	    }
       

	    /**
		*
		*/
		
        public int getOsid() {
     
		return osid;
	    }
        
	    public void setOsid(int osid) {
		this.osid = osid;
	    }
       

	    /**
		*
		*/
		
        public String getMotypename() {
     
		return motypename;
	    }
        
	    public void setMotypename(String motypename) {
		this.motypename = motypename;
	    }
       

	    /**
		*
		*/
		
        public String getMotypeicon() {
     
		return motypeicon;
	    }
        
	    public void setMotypeicon(String motypeicon) {
		this.motypeicon = motypeicon;
	    }
       

	    /**
		*
		*/
		
        public String getMotypesis() {
     
		return motypesis;
	    }
        
	    public void setMotypesis(String motypesis) {
		this.motypesis = motypesis;
	    }
       

	    /**
		*
		*/
		
        public Date getMotypecreationdate() {
     
		return motypecreationdate;
	    }
        
	    public void setMotypecreationdate(Date motypecreationdate) {
		this.motypecreationdate = motypecreationdate;
	    }
       

	    /**
		*
		*/
		
        public int getMotypestatus() {
     
		return motypestatus;
	    }
        
	    public void setMotypestatus(int motypestatus) {
		this.motypestatus = motypestatus;
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
       
      /*  public static aihao_dao convert(mobiletype_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMotypeid(_dao.getMotypeid());
        
        temp.setOsid(_dao.getOsid());
        
        temp.setMotypename(_dao.getMotypename());
        
        temp.setMotypeicon(_dao.getMotypeicon());
        
        temp.setMotypesis(_dao.getMotypesis());
        
        temp.setMotypecreationdate(_dao.getMotypecreationdate());
        
        temp.setMotypestatus(_dao.getMotypestatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

