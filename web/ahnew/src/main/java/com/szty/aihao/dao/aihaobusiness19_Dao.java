/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaobusiness19Entity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOBUSINESS19数据实体
    *@作者：宋春林 
    */

	public class aihaobusiness19_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String sname;
        /**
	     * 
	     */
		private String fbigclass;
        /**
	     * 
	     */
		private String bigclass;
        /**
	     * 
	     */
		private String tag;
        /**
	     * 
	     */
		private String province;
        /**
	     * 
	     */
		private String city;
        /**
	     * 
	     */
		private String area;
        /**
	     * 
	     */
		private String address;
        /**
	     * 
	     */
		private double latitude;
        /**
	     * 
	     */
		private double longitude;
        /**
	     * 
	     */
		private String area_code;
        /**
	     * 
	     */
		private String telephone;
        /**
	     * 
	     */
		private String phone;
        /**
	     * 
	     */
		private int id;
        /**
	     * 
	     */
		private String provincecode;
        /**
	     * 
	     */
		private String citycode;
        /**
	     * 
	     */
		private int groupid;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getSname() {
     
		return sname;
	    }
        
	    public void setSname(String sname) {
		this.sname = sname;
	    }
       

	    /**
		*
		*/
		
        public String getFbigclass() {
     
		return fbigclass;
	    }
        
	    public void setFbigclass(String fbigclass) {
		this.fbigclass = fbigclass;
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
		
        public String getTag() {
     
		return tag;
	    }
        
	    public void setTag(String tag) {
		this.tag = tag;
	    }
       

	    /**
		*
		*/
		
        public String getProvince() {
     
		return province;
	    }
        
	    public void setProvince(String province) {
		this.province = province;
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
		
        public String getArea() {
     
		return area;
	    }
        
	    public void setArea(String area) {
		this.area = area;
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
		
        public double getLatitude() {
     
		return latitude;
	    }
        
	    public void setLatitude(double latitude) {
		this.latitude = latitude;
	    }
       

	    /**
		*
		*/
		
        public double getLongitude() {
     
		return longitude;
	    }
        
	    public void setLongitude(double longitude) {
		this.longitude = longitude;
	    }
       

	    /**
		*
		*/
		
        public String getArea_code() {
     
		return area_code;
	    }
        
	    public void setArea_code(String area_code) {
		this.area_code = area_code;
	    }
       

	    /**
		*
		*/
		
        public String getTelephone() {
     
		return telephone;
	    }
        
	    public void setTelephone(String telephone) {
		this.telephone = telephone;
	    }
       

	    /**
		*
		*/
		
        public String getPhone() {
     
		return phone;
	    }
        
	    public void setPhone(String phone) {
		this.phone = phone;
	    }
       

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
		*
		*/
		
        public String getProvincecode() {
     
		return provincecode;
	    }
        
	    public void setProvincecode(String provincecode) {
		this.provincecode = provincecode;
	    }
       

	    /**
		*
		*/
		
        public String getCitycode() {
     
		return citycode;
	    }
        
	    public void setCitycode(String citycode) {
		this.citycode = citycode;
	    }
       

	    /**
		*
		*/
		
        public int getGroupid() {
     
		return groupid;
	    }
        
	    public void setGroupid(int groupid) {
		this.groupid = groupid;
	    }
       
      /*  public static aihao_dao convert(aihaobusiness19_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setSname(_dao.getSname());
        
        temp.setFbigclass(_dao.getFbigclass());
        
        temp.setBigclass(_dao.getBigclass());
        
        temp.setTag(_dao.getTag());
        
        temp.setProvince(_dao.getProvince());
        
        temp.setCity(_dao.getCity());
        
        temp.setArea(_dao.getArea());
        
        temp.setAddress(_dao.getAddress());
        
        temp.setLatitude(_dao.getLatitude());
        
        temp.setLongitude(_dao.getLongitude());
        
        temp.setArea_code(_dao.getArea_code());
        
        temp.setTelephone(_dao.getTelephone());
        
        temp.setPhone(_dao.getPhone());
        
        temp.setId(_dao.getId());
        
        temp.setProvincecode(_dao.getProvincecode());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setGroupid(_dao.getGroupid());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

