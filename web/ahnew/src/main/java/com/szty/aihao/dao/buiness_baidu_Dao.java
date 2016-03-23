/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： buiness_baiduEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@BUINESS_BAIDU数据实体
    *@作者：宋春林 
    */

	public class buiness_baidu_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
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
		private String address;
        /**
	     * 
	     */
		private String telephone;
        /**
	     * 
	     */
		private String uuid;
        /**
	     * 
	     */
		private String distance;
        /**
	     * 
	     */
		private String type;
        /**
	     * 
	     */
		private String tag;
        /**
	     * 
	     */
		private String detail_url;
        /**
	     * 
	     */
		private String price;
        /**
	     * 
	     */
		private String shop_hours;
        /**
	     * 
	     */
		private String overall_rating;
        /**
	     * 
	     */
		private String taste_rating;
        /**
	     * 
	     */
		private String service_rating;
        /**
	     * 
	     */
		private String environment_rating;
        /**
	     * 
	     */
		private String facility_rating;
        /**
	     * 
	     */
		private String hygiene_rating;
        /**
	     * 
	     */
		private String technology_rating;
        /**
	     * 
	     */
		private String image_num;
        /**
	     * 
	     */
		private String groupon_num;
        /**
	     * 
	     */
		private String discount_num;
        /**
	     * 
	     */
		private String comment_num;
        /**
	     * 
	     */
		private String favorite_num;
        /**
	     * 
	     */
		private String checkin_num;
        /**
	     * 
	     */
		private String formatted_address;
        /**
	     * 
	     */
		private String business;
        /**
	     * 
	     */
		private String city;
        /**
	     * 
	     */
		private String district;
        /**
	     * 
	     */
		private String province;
        /**
	     * 
	     */
		private String street;
        /**
	     * 
	     */
		private String street_number;
        /**
	     * 
	     */
		private String citycode;
        /**
	     * 
	     */
		private String grabstartime;
        /**
	     * 
	     */
		private String grabendtime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public String getAddress() {
     
		return address;
	    }
        
	    public void setAddress(String address) {
		this.address = address;
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
		
        public String getUuid() {
     
		return uuid;
	    }
        
	    public void setUuid(String uuid) {
		this.uuid = uuid;
	    }
       

	    /**
		*
		*/
		
        public String getDistance() {
     
		return distance;
	    }
        
	    public void setDistance(String distance) {
		this.distance = distance;
	    }
       

	    /**
		*
		*/
		
        public String getType() {
     
		return type;
	    }
        
	    public void setType(String type) {
		this.type = type;
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
		
        public String getDetail_url() {
     
		return detail_url;
	    }
        
	    public void setDetail_url(String detail_url) {
		this.detail_url = detail_url;
	    }
       

	    /**
		*
		*/
		
        public String getPrice() {
     
		return price;
	    }
        
	    public void setPrice(String price) {
		this.price = price;
	    }
       

	    /**
		*
		*/
		
        public String getShop_hours() {
     
		return shop_hours;
	    }
        
	    public void setShop_hours(String shop_hours) {
		this.shop_hours = shop_hours;
	    }
       

	    /**
		*
		*/
		
        public String getOverall_rating() {
     
		return overall_rating;
	    }
        
	    public void setOverall_rating(String overall_rating) {
		this.overall_rating = overall_rating;
	    }
       

	    /**
		*
		*/
		
        public String getTaste_rating() {
     
		return taste_rating;
	    }
        
	    public void setTaste_rating(String taste_rating) {
		this.taste_rating = taste_rating;
	    }
       

	    /**
		*
		*/
		
        public String getService_rating() {
     
		return service_rating;
	    }
        
	    public void setService_rating(String service_rating) {
		this.service_rating = service_rating;
	    }
       

	    /**
		*
		*/
		
        public String getEnvironment_rating() {
     
		return environment_rating;
	    }
        
	    public void setEnvironment_rating(String environment_rating) {
		this.environment_rating = environment_rating;
	    }
       

	    /**
		*
		*/
		
        public String getFacility_rating() {
     
		return facility_rating;
	    }
        
	    public void setFacility_rating(String facility_rating) {
		this.facility_rating = facility_rating;
	    }
       

	    /**
		*
		*/
		
        public String getHygiene_rating() {
     
		return hygiene_rating;
	    }
        
	    public void setHygiene_rating(String hygiene_rating) {
		this.hygiene_rating = hygiene_rating;
	    }
       

	    /**
		*
		*/
		
        public String getTechnology_rating() {
     
		return technology_rating;
	    }
        
	    public void setTechnology_rating(String technology_rating) {
		this.technology_rating = technology_rating;
	    }
       

	    /**
		*
		*/
		
        public String getImage_num() {
     
		return image_num;
	    }
        
	    public void setImage_num(String image_num) {
		this.image_num = image_num;
	    }
       

	    /**
		*
		*/
		
        public String getGroupon_num() {
     
		return groupon_num;
	    }
        
	    public void setGroupon_num(String groupon_num) {
		this.groupon_num = groupon_num;
	    }
       

	    /**
		*
		*/
		
        public String getDiscount_num() {
     
		return discount_num;
	    }
        
	    public void setDiscount_num(String discount_num) {
		this.discount_num = discount_num;
	    }
       

	    /**
		*
		*/
		
        public String getComment_num() {
     
		return comment_num;
	    }
        
	    public void setComment_num(String comment_num) {
		this.comment_num = comment_num;
	    }
       

	    /**
		*
		*/
		
        public String getFavorite_num() {
     
		return favorite_num;
	    }
        
	    public void setFavorite_num(String favorite_num) {
		this.favorite_num = favorite_num;
	    }
       

	    /**
		*
		*/
		
        public String getCheckin_num() {
     
		return checkin_num;
	    }
        
	    public void setCheckin_num(String checkin_num) {
		this.checkin_num = checkin_num;
	    }
       

	    /**
		*
		*/
		
        public String getFormatted_address() {
     
		return formatted_address;
	    }
        
	    public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	    }
       

	    /**
		*
		*/
		
        public String getBusiness() {
     
		return business;
	    }
        
	    public void setBusiness(String business) {
		this.business = business;
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
		
        public String getDistrict() {
     
		return district;
	    }
        
	    public void setDistrict(String district) {
		this.district = district;
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
		
        public String getStreet() {
     
		return street;
	    }
        
	    public void setStreet(String street) {
		this.street = street;
	    }
       

	    /**
		*
		*/
		
        public String getStreet_number() {
     
		return street_number;
	    }
        
	    public void setStreet_number(String street_number) {
		this.street_number = street_number;
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
		
        public String getGrabstartime() {
     
		return grabstartime;
	    }
        
	    public void setGrabstartime(String grabstartime) {
		this.grabstartime = grabstartime;
	    }
       

	    /**
		*
		*/
		
        public String getGrabendtime() {
     
		return grabendtime;
	    }
        
	    public void setGrabendtime(String grabendtime) {
		this.grabendtime = grabendtime;
	    }
       
      /*  public static aihao_dao convert(buiness_baidu_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLat(_dao.getLat());
        
        temp.setLng(_dao.getLng());
        
        temp.setAddress(_dao.getAddress());
        
        temp.setTelephone(_dao.getTelephone());
        
        temp.setUuid(_dao.getUuid());
        
        temp.setDistance(_dao.getDistance());
        
        temp.setType(_dao.getType());
        
        temp.setTag(_dao.getTag());
        
        temp.setDetail_url(_dao.getDetail_url());
        
        temp.setPrice(_dao.getPrice());
        
        temp.setShop_hours(_dao.getShop_hours());
        
        temp.setOverall_rating(_dao.getOverall_rating());
        
        temp.setTaste_rating(_dao.getTaste_rating());
        
        temp.setService_rating(_dao.getService_rating());
        
        temp.setEnvironment_rating(_dao.getEnvironment_rating());
        
        temp.setFacility_rating(_dao.getFacility_rating());
        
        temp.setHygiene_rating(_dao.getHygiene_rating());
        
        temp.setTechnology_rating(_dao.getTechnology_rating());
        
        temp.setImage_num(_dao.getImage_num());
        
        temp.setGroupon_num(_dao.getGroupon_num());
        
        temp.setDiscount_num(_dao.getDiscount_num());
        
        temp.setComment_num(_dao.getComment_num());
        
        temp.setFavorite_num(_dao.getFavorite_num());
        
        temp.setCheckin_num(_dao.getCheckin_num());
        
        temp.setFormatted_address(_dao.getFormatted_address());
        
        temp.setBusiness(_dao.getBusiness());
        
        temp.setCity(_dao.getCity());
        
        temp.setDistrict(_dao.getDistrict());
        
        temp.setProvince(_dao.getProvince());
        
        temp.setStreet(_dao.getStreet());
        
        temp.setStreet_number(_dao.getStreet_number());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setGrabstartime(_dao.getGrabstartime());
        
        temp.setGrabendtime(_dao.getGrabendtime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

