/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihao_number_bakEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAO_NUMBER_BAK数据实体
    *@作者：宋春林 
    */

	public class aihao_number_bak_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int id;
        /**
	     * ??
	     */
		private String name;
        /**
	     * ????
	     */
		private int procode;
        /**
	     * ????
	     */
		private String proname;
        /**
	     * ????
	     */
		private int citycode;
        /**
	     * ????
	     */
		private String cityname;
        /**
	     * ??
	     */
		private String area;
        /**
	     * ??
	     */
		private String address;
        /**
	     * ??
	     */
		private double latitude;
        /**
	     * ??
	     */
		private double longitude;
        /**
	     * ??
	     */
		private String phone;
        /**
	     * ?ID
	     */
		private int groupid;
        /**
	     * ??,????????????
	     */
		private int weights;
        /**
	     * ??ID
	     */
		private String imgid;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*??
		*/
		
        public String getName() {
     
		return name;
	    }
        
	    public void setName(String name) {
		this.name = name;
	    }
       

	    /**
		*????
		*/
		
        public int getProcode() {
     
		return procode;
	    }
        
	    public void setProcode(int procode) {
		this.procode = procode;
	    }
       

	    /**
		*????
		*/
		
        public String getProname() {
     
		return proname;
	    }
        
	    public void setProname(String proname) {
		this.proname = proname;
	    }
       

	    /**
		*????
		*/
		
        public int getCitycode() {
     
		return citycode;
	    }
        
	    public void setCitycode(int citycode) {
		this.citycode = citycode;
	    }
       

	    /**
		*????
		*/
		
        public String getCityname() {
     
		return cityname;
	    }
        
	    public void setCityname(String cityname) {
		this.cityname = cityname;
	    }
       

	    /**
		*??
		*/
		
        public String getArea() {
     
		return area;
	    }
        
	    public void setArea(String area) {
		this.area = area;
	    }
       

	    /**
		*??
		*/
		
        public String getAddress() {
     
		return address;
	    }
        
	    public void setAddress(String address) {
		this.address = address;
	    }
       

	    /**
		*??
		*/
		
        public double getLatitude() {
     
		return latitude;
	    }
        
	    public void setLatitude(double latitude) {
		this.latitude = latitude;
	    }
       

	    /**
		*??
		*/
		
        public double getLongitude() {
     
		return longitude;
	    }
        
	    public void setLongitude(double longitude) {
		this.longitude = longitude;
	    }
       

	    /**
		*??
		*/
		
        public String getPhone() {
     
		return phone;
	    }
        
	    public void setPhone(String phone) {
		this.phone = phone;
	    }
       

	    /**
		*?ID
		*/
		
        public int getGroupid() {
     
		return groupid;
	    }
        
	    public void setGroupid(int groupid) {
		this.groupid = groupid;
	    }
       

	    /**
		*??,????????????
		*/
		
        public int getWeights() {
     
		return weights;
	    }
        
	    public void setWeights(int weights) {
		this.weights = weights;
	    }
       

	    /**
		*??ID
		*/
		
        public String getImgid() {
     
		return imgid;
	    }
        
	    public void setImgid(String imgid) {
		this.imgid = imgid;
	    }
       
      /*  public static aihao_dao convert(aihao_number_bak_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setName(_dao.getName());
        
        temp.setProcode(_dao.getProcode());
        
        temp.setProname(_dao.getProname());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setCityname(_dao.getCityname());
        
        temp.setArea(_dao.getArea());
        
        temp.setAddress(_dao.getAddress());
        
        temp.setLatitude(_dao.getLatitude());
        
        temp.setLongitude(_dao.getLongitude());
        
        temp.setPhone(_dao.getPhone());
        
        temp.setGroupid(_dao.getGroupid());
        
        temp.setWeights(_dao.getWeights());
        
        temp.setImgid(_dao.getImgid());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

