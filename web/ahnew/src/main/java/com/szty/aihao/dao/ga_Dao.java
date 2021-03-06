﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： gaEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@GA数据实体
    *@作者：宋春林 
    */

	public class ga_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int id;
        /**
	     * 
	     */
		private String name;
        /**
	     * 
	     */
		private String telno;
        /**
	     * 
	     */
		private String address;
        /**
	     * 
	     */
		private String branch_name;
        /**
	     * 
	     */
		private String short_name;
        /**
	     * 
	     */
		private String introduction;
        /**
	     * 
	     */
		private String recommendation;
        /**
	     * 
	     */
		private String feature;
        /**
	     * 
	     */
		private String special_offer;
        /**
	     * 
	     */
		private String style;
        /**
	     * 
	     */
		private int province_id;
        /**
	     * 
	     */
		private int city_id;
        /**
	     * 
	     */
		private int district_id;
        /**
	     * 
	     */
		private int trade_id;
        /**
	     * 
	     */
		private String province_name;
        /**
	     * 
	     */
		private String city_name;
        /**
	     * 
	     */
		private String district_name;
        /**
	     * 
	     */
		private String trade_name;
        /**
	     * 
	     */
		private int level;
        /**
	     * 
	     */
		private Date created_at;
        /**
	     * 
	     */
		private Date updated_at;
        /**
	     * 
	     */
		private String service_mask;
        /**
	     * 
	     */
		private String x;
        /**
	     * 
	     */
		private String y;
        /**
	     * 
	     */
		private String landmark;
        /**
	     * 
	     */
		private String region;
        /**
	     * 
	     */
		private String attributes;
        /**
	     * 
	     */
		private String source;
        /**
	     * 
	     */
		private int xy_level;
        /**
	     * 
	     */
		private int weight;
        /**
	     * 
	     */
		private int is_exist;
        /**
	     * 
	     */
		private String tag;
        /**
	     * 
	     */
		private String category;
        /**
	     * 
	     */
		private String price;
        /**
	     * 
	     */
		private String open_time;
        /**
	     * 
	     */
		private String official_site;
        /**
	     * 
	     */
		private int wl_discount;
        /**
	     * 
	     */
		private String bizcode;
        /**
	     * 
	     */
		private int status;
        /**
	     * 
	     */
		private String owner;
        /**
	     * 
	     */
		private int collector_id;
        /**
	     * 
	     */
		private int review_count;
        /**
	     * 
	     */
		private int is_disp;
        
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
		
        public String getTelno() {
     
		return telno;
	    }
        
	    public void setTelno(String telno) {
		this.telno = telno;
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
		
        public String getBranch_name() {
     
		return branch_name;
	    }
        
	    public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	    }
       

	    /**
		*
		*/
		
        public String getShort_name() {
     
		return short_name;
	    }
        
	    public void setShort_name(String short_name) {
		this.short_name = short_name;
	    }
       

	    /**
		*
		*/
		
        public String getIntroduction() {
     
		return introduction;
	    }
        
	    public void setIntroduction(String introduction) {
		this.introduction = introduction;
	    }
       

	    /**
		*
		*/
		
        public String getRecommendation() {
     
		return recommendation;
	    }
        
	    public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	    }
       

	    /**
		*
		*/
		
        public String getFeature() {
     
		return feature;
	    }
        
	    public void setFeature(String feature) {
		this.feature = feature;
	    }
       

	    /**
		*
		*/
		
        public String getSpecial_offer() {
     
		return special_offer;
	    }
        
	    public void setSpecial_offer(String special_offer) {
		this.special_offer = special_offer;
	    }
       

	    /**
		*
		*/
		
        public String getStyle() {
     
		return style;
	    }
        
	    public void setStyle(String style) {
		this.style = style;
	    }
       

	    /**
		*
		*/
		
        public int getProvince_id() {
     
		return province_id;
	    }
        
	    public void setProvince_id(int province_id) {
		this.province_id = province_id;
	    }
       

	    /**
		*
		*/
		
        public int getCity_id() {
     
		return city_id;
	    }
        
	    public void setCity_id(int city_id) {
		this.city_id = city_id;
	    }
       

	    /**
		*
		*/
		
        public int getDistrict_id() {
     
		return district_id;
	    }
        
	    public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	    }
       

	    /**
		*
		*/
		
        public int getTrade_id() {
     
		return trade_id;
	    }
        
	    public void setTrade_id(int trade_id) {
		this.trade_id = trade_id;
	    }
       

	    /**
		*
		*/
		
        public String getProvince_name() {
     
		return province_name;
	    }
        
	    public void setProvince_name(String province_name) {
		this.province_name = province_name;
	    }
       

	    /**
		*
		*/
		
        public String getCity_name() {
     
		return city_name;
	    }
        
	    public void setCity_name(String city_name) {
		this.city_name = city_name;
	    }
       

	    /**
		*
		*/
		
        public String getDistrict_name() {
     
		return district_name;
	    }
        
	    public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	    }
       

	    /**
		*
		*/
		
        public String getTrade_name() {
     
		return trade_name;
	    }
        
	    public void setTrade_name(String trade_name) {
		this.trade_name = trade_name;
	    }
       

	    /**
		*
		*/
		
        public int getLevel() {
     
		return level;
	    }
        
	    public void setLevel(int level) {
		this.level = level;
	    }
       

	    /**
		*
		*/
		
        public Date getCreated_at() {
     
		return created_at;
	    }
        
	    public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	    }
       

	    /**
		*
		*/
		
        public Date getUpdated_at() {
     
		return updated_at;
	    }
        
	    public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	    }
       

	    /**
		*
		*/
		
        public String getService_mask() {
     
		return service_mask;
	    }
        
	    public void setService_mask(String service_mask) {
		this.service_mask = service_mask;
	    }
       

	    /**
		*
		*/
		
        public String getX() {
     
		return x;
	    }
        
	    public void setX(String x) {
		this.x = x;
	    }
       

	    /**
		*
		*/
		
        public String getY() {
     
		return y;
	    }
        
	    public void setY(String y) {
		this.y = y;
	    }
       

	    /**
		*
		*/
		
        public String getLandmark() {
     
		return landmark;
	    }
        
	    public void setLandmark(String landmark) {
		this.landmark = landmark;
	    }
       

	    /**
		*
		*/
		
        public String getRegion() {
     
		return region;
	    }
        
	    public void setRegion(String region) {
		this.region = region;
	    }
       

	    /**
		*
		*/
		
        public String getAttributes() {
     
		return attributes;
	    }
        
	    public void setAttributes(String attributes) {
		this.attributes = attributes;
	    }
       

	    /**
		*
		*/
		
        public String getSource() {
     
		return source;
	    }
        
	    public void setSource(String source) {
		this.source = source;
	    }
       

	    /**
		*
		*/
		
        public int getXy_level() {
     
		return xy_level;
	    }
        
	    public void setXy_level(int xy_level) {
		this.xy_level = xy_level;
	    }
       

	    /**
		*
		*/
		
        public int getWeight() {
     
		return weight;
	    }
        
	    public void setWeight(int weight) {
		this.weight = weight;
	    }
       

	    /**
		*
		*/
		
        public int getIs_exist() {
     
		return is_exist;
	    }
        
	    public void setIs_exist(int is_exist) {
		this.is_exist = is_exist;
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
		
        public String getCategory() {
     
		return category;
	    }
        
	    public void setCategory(String category) {
		this.category = category;
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
		
        public String getOpen_time() {
     
		return open_time;
	    }
        
	    public void setOpen_time(String open_time) {
		this.open_time = open_time;
	    }
       

	    /**
		*
		*/
		
        public String getOfficial_site() {
     
		return official_site;
	    }
        
	    public void setOfficial_site(String official_site) {
		this.official_site = official_site;
	    }
       

	    /**
		*
		*/
		
        public int getWl_discount() {
     
		return wl_discount;
	    }
        
	    public void setWl_discount(int wl_discount) {
		this.wl_discount = wl_discount;
	    }
       

	    /**
		*
		*/
		
        public String getBizcode() {
     
		return bizcode;
	    }
        
	    public void setBizcode(String bizcode) {
		this.bizcode = bizcode;
	    }
       

	    /**
		*
		*/
		
        public int getStatus() {
     
		return status;
	    }
        
	    public void setStatus(int status) {
		this.status = status;
	    }
       

	    /**
		*
		*/
		
        public String getOwner() {
     
		return owner;
	    }
        
	    public void setOwner(String owner) {
		this.owner = owner;
	    }
       

	    /**
		*
		*/
		
        public int getCollector_id() {
     
		return collector_id;
	    }
        
	    public void setCollector_id(int collector_id) {
		this.collector_id = collector_id;
	    }
       

	    /**
		*
		*/
		
        public int getReview_count() {
     
		return review_count;
	    }
        
	    public void setReview_count(int review_count) {
		this.review_count = review_count;
	    }
       

	    /**
		*
		*/
		
        public int getIs_disp() {
     
		return is_disp;
	    }
        
	    public void setIs_disp(int is_disp) {
		this.is_disp = is_disp;
	    }
       
      /*  public static aihao_dao convert(ga_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setName(_dao.getName());
        
        temp.setTelno(_dao.getTelno());
        
        temp.setAddress(_dao.getAddress());
        
        temp.setBranch_name(_dao.getBranch_name());
        
        temp.setShort_name(_dao.getShort_name());
        
        temp.setIntroduction(_dao.getIntroduction());
        
        temp.setRecommendation(_dao.getRecommendation());
        
        temp.setFeature(_dao.getFeature());
        
        temp.setSpecial_offer(_dao.getSpecial_offer());
        
        temp.setStyle(_dao.getStyle());
        
        temp.setProvince_id(_dao.getProvince_id());
        
        temp.setCity_id(_dao.getCity_id());
        
        temp.setDistrict_id(_dao.getDistrict_id());
        
        temp.setTrade_id(_dao.getTrade_id());
        
        temp.setProvince_name(_dao.getProvince_name());
        
        temp.setCity_name(_dao.getCity_name());
        
        temp.setDistrict_name(_dao.getDistrict_name());
        
        temp.setTrade_name(_dao.getTrade_name());
        
        temp.setLevel(_dao.getLevel());
        
        temp.setCreated_at(_dao.getCreated_at());
        
        temp.setUpdated_at(_dao.getUpdated_at());
        
        temp.setService_mask(_dao.getService_mask());
        
        temp.setX(_dao.getX());
        
        temp.setY(_dao.getY());
        
        temp.setLandmark(_dao.getLandmark());
        
        temp.setRegion(_dao.getRegion());
        
        temp.setAttributes(_dao.getAttributes());
        
        temp.setSource(_dao.getSource());
        
        temp.setXy_level(_dao.getXy_level());
        
        temp.setWeight(_dao.getWeight());
        
        temp.setIs_exist(_dao.getIs_exist());
        
        temp.setTag(_dao.getTag());
        
        temp.setCategory(_dao.getCategory());
        
        temp.setPrice(_dao.getPrice());
        
        temp.setOpen_time(_dao.getOpen_time());
        
        temp.setOfficial_site(_dao.getOfficial_site());
        
        temp.setWl_discount(_dao.getWl_discount());
        
        temp.setBizcode(_dao.getBizcode());
        
        temp.setStatus(_dao.getStatus());
        
        temp.setOwner(_dao.getOwner());
        
        temp.setCollector_id(_dao.getCollector_id());
        
        temp.setReview_count(_dao.getReview_count());
        
        temp.setIs_disp(_dao.getIs_disp());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

