/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumgameadapterEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMGAMEADAPTER数据实体
    *@作者：宋春林 
    */

	public class mvnforumgameadapter_Dao implements Serializable
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
		private int gameid;
        /**
	     * 
	     */
		private String mobilemanufacturer;
        /**
	     * 
	     */
		private String operatingsystem;
        /**
	     * 
	     */
		private String mobileseries;
        /**
	     * 
	     */
		private String mobiletype;
        /**
	     * 
	     */
		private String mobilescreen;
        /**
	     * 
	     */
		private String adapterfile;
        /**
	     * 
	     */
		private int adapterfilesize;
        /**
	     * 
	     */
		private Date adaptercreationdate;
        /**
	     * 
	     */
		private int viewcount;
        /**
	     * 
	     */
		private int downloadcount;
        
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
		
        public int getGameid() {
     
		return gameid;
	    }
        
	    public void setGameid(int gameid) {
		this.gameid = gameid;
	    }
       

	    /**
		*
		*/
		
        public String getMobilemanufacturer() {
     
		return mobilemanufacturer;
	    }
        
	    public void setMobilemanufacturer(String mobilemanufacturer) {
		this.mobilemanufacturer = mobilemanufacturer;
	    }
       

	    /**
		*
		*/
		
        public String getOperatingsystem() {
     
		return operatingsystem;
	    }
        
	    public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	    }
       

	    /**
		*
		*/
		
        public String getMobileseries() {
     
		return mobileseries;
	    }
        
	    public void setMobileseries(String mobileseries) {
		this.mobileseries = mobileseries;
	    }
       

	    /**
		*
		*/
		
        public String getMobiletype() {
     
		return mobiletype;
	    }
        
	    public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	    }
       

	    /**
		*
		*/
		
        public String getMobilescreen() {
     
		return mobilescreen;
	    }
        
	    public void setMobilescreen(String mobilescreen) {
		this.mobilescreen = mobilescreen;
	    }
       

	    /**
		*
		*/
		
        public String getAdapterfile() {
     
		return adapterfile;
	    }
        
	    public void setAdapterfile(String adapterfile) {
		this.adapterfile = adapterfile;
	    }
       

	    /**
		*
		*/
		
        public int getAdapterfilesize() {
     
		return adapterfilesize;
	    }
        
	    public void setAdapterfilesize(int adapterfilesize) {
		this.adapterfilesize = adapterfilesize;
	    }
       

	    /**
		*
		*/
		
        public Date getAdaptercreationdate() {
     
		return adaptercreationdate;
	    }
        
	    public void setAdaptercreationdate(Date adaptercreationdate) {
		this.adaptercreationdate = adaptercreationdate;
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
       

	    /**
		*
		*/
		
        public int getDownloadcount() {
     
		return downloadcount;
	    }
        
	    public void setDownloadcount(int downloadcount) {
		this.downloadcount = downloadcount;
	    }
       
      /*  public static aihao_dao convert(mvnforumgameadapter_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setAdapterid(_dao.getAdapterid());
        
        temp.setGameid(_dao.getGameid());
        
        temp.setMobilemanufacturer(_dao.getMobilemanufacturer());
        
        temp.setOperatingsystem(_dao.getOperatingsystem());
        
        temp.setMobileseries(_dao.getMobileseries());
        
        temp.setMobiletype(_dao.getMobiletype());
        
        temp.setMobilescreen(_dao.getMobilescreen());
        
        temp.setAdapterfile(_dao.getAdapterfile());
        
        temp.setAdapterfilesize(_dao.getAdapterfilesize());
        
        temp.setAdaptercreationdate(_dao.getAdaptercreationdate());
        
        temp.setViewcount(_dao.getViewcount());
        
        temp.setDownloadcount(_dao.getDownloadcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

