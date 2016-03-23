/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsymbusEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSYMBUS数据实体
    *@作者：宋春林 
    */

	public class mvnforumsymbus_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int busid;
        /**
	     * 
	     */
		private String contentid;
        /**
	     * 
	     */
		private String imei;
        /**
	     * 
	     */
		private String imsi;
        /**
	     * 
	     */
		private String cid;
        /**
	     * 
	     */
		private String pid;
        /**
	     * 
	     */
		private String sid;
        /**
	     * 
	     */
		private String ver;
        /**
	     * 
	     */
		private String ret;
        /**
	     * 
	     */
		private Date buscreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getBusid() {
     
		return busid;
	    }
        
	    public void setBusid(int busid) {
		this.busid = busid;
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
		
        public String getImei() {
     
		return imei;
	    }
        
	    public void setImei(String imei) {
		this.imei = imei;
	    }
       

	    /**
		*
		*/
		
        public String getImsi() {
     
		return imsi;
	    }
        
	    public void setImsi(String imsi) {
		this.imsi = imsi;
	    }
       

	    /**
		*
		*/
		
        public String getCid() {
     
		return cid;
	    }
        
	    public void setCid(String cid) {
		this.cid = cid;
	    }
       

	    /**
		*
		*/
		
        public String getPid() {
     
		return pid;
	    }
        
	    public void setPid(String pid) {
		this.pid = pid;
	    }
       

	    /**
		*
		*/
		
        public String getSid() {
     
		return sid;
	    }
        
	    public void setSid(String sid) {
		this.sid = sid;
	    }
       

	    /**
		*
		*/
		
        public String getVer() {
     
		return ver;
	    }
        
	    public void setVer(String ver) {
		this.ver = ver;
	    }
       

	    /**
		*
		*/
		
        public String getRet() {
     
		return ret;
	    }
        
	    public void setRet(String ret) {
		this.ret = ret;
	    }
       

	    /**
		*
		*/
		
        public Date getBuscreationdate() {
     
		return buscreationdate;
	    }
        
	    public void setBuscreationdate(Date buscreationdate) {
		this.buscreationdate = buscreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumsymbus_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setBusid(_dao.getBusid());
        
        temp.setContentid(_dao.getContentid());
        
        temp.setImei(_dao.getImei());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setCid(_dao.getCid());
        
        temp.setPid(_dao.getPid());
        
        temp.setSid(_dao.getSid());
        
        temp.setVer(_dao.getVer());
        
        temp.setRet(_dao.getRet());
        
        temp.setBuscreationdate(_dao.getBuscreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

