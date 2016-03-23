/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： pptmptableEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@PPTMPTABLE数据实体
    *@作者：宋春林 
    */

	public class pptmptable_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String bid;
        /**
	     * 
	     */
		private String name;
        /**
	     * 
	     */
		private String city;
        /**
	     * 
	     */
		private String address;
        /**
	     * 
	     */
		private String ppcphone;
        /**
	     * 
	     */
		private String laln;
        /**
	     * 
	     */
		private String bigclass;
        /**
	     * 
	     */
		private String lat;
        /**
	     * 
	     */
		private String lng;
        /**
	     * 
	     */
		private String baidulat;
        /**
	     * 
	     */
		private String baidulng;
        /**
	     * 
	     */
		private int provinceid;
        /**
	     * 
	     */
		private int cityid;
        /**
	     * 
	     */
		private String geohas;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getBid() {
     
		return bid;
	    }
        
	    public void setBid(String bid) {
		this.bid = bid;
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
		
        public String getCity() {
     
		return city;
	    }
        
	    public void setCity(String city) {
		this.city = city;
	    }
       

	    /**
		*
		*/
		
        public String getAddress() {
     
		return address;
	    }
        
	    public void setAddress(String address) {
		this.address = address;
	    }
       

	    /**
		*
		*/
		
        public String getPpcphone() {
     
		return ppcphone;
	    }
        
	    public void setPpcphone(String ppcphone) {
		this.ppcphone = ppcphone;
	    }
       

	    /**
		*
		*/
		
        public String getLaln() {
     
		return laln;
	    }
        
	    public void setLaln(String laln) {
		this.laln = laln;
	    }
       

	    /**
		*
		*/
		
        public String getBigclass() {
     
		return bigclass;
	    }
        
	    public void setBigclass(String bigclass) {
		this.bigclass = bigclass;
	    }
       

	    /**
		*
		*/
		
        public String getLat() {
     
		return lat;
	    }
        
	    public void setLat(String lat) {
		this.lat = lat;
	    }
       

	    /**
		*
		*/
		
        public String getLng() {
     
		return lng;
	    }
        
	    public void setLng(String lng) {
		this.lng = lng;
	    }
       

	    /**
		*
		*/
		
        public String getBaidulat() {
     
		return baidulat;
	    }
        
	    public void setBaidulat(String baidulat) {
		this.baidulat = baidulat;
	    }
       

	    /**
		*
		*/
		
        public String getBaidulng() {
     
		return baidulng;
	    }
        
	    public void setBaidulng(String baidulng) {
		this.baidulng = baidulng;
	    }
       

	    /**
		*
		*/
		
        public int getProvinceid() {
     
		return provinceid;
	    }
        
	    public void setProvinceid(int provinceid) {
		this.provinceid = provinceid;
	    }
       

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
		
        public String getGeohas() {
     
		return geohas;
	    }
        
	    public void setGeohas(String geohas) {
		this.geohas = geohas;
	    }
       
      /*  public static aihao_dao convert(pptmptable_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setBid(_dao.getBid());
        
        temp.setName(_dao.getName());
        
        temp.setCity(_dao.getCity());
        
        temp.setAddress(_dao.getAddress());
        
        temp.setPpcphone(_dao.getPpcphone());
        
        temp.setLaln(_dao.getLaln());
        
        temp.setBigclass(_dao.getBigclass());
        
        temp.setLat(_dao.getLat());
        
        temp.setLng(_dao.getLng());
        
        temp.setBaidulat(_dao.getBaidulat());
        
        temp.setBaidulng(_dao.getBaidulng());
        
        temp.setProvinceid(_dao.getProvinceid());
        
        temp.setCityid(_dao.getCityid());
        
        temp.setGeohas(_dao.getGeohas());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

