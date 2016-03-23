/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihao34Entity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAO34数据实体
    *@作者：宋春林 
    */

	public class aihao34_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String id;
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
		private String province_id;
        /**
	     * 
	     */
		private String city_id;
        /**
	     * 
	     */
		private String district_id;
        /**
	     * 
	     */
		private String trade_id;
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
		private String source;
        /**
	     * 
	     */
		private String xy_level;
        /**
	     * 
	     */
		private String weight;
        /**
	     * 
	     */
		private String is_exist;
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
		private String wl_discount;
        /**
	     * 
	     */
		private String bizcode;
        /**
	     * 
	     */
		private String status;
        /**
	     * 
	     */
		private String owner;
        /**
	     * 
	     */
		private String collector_id;
        /**
	     * 
	     */
		private String review_count;
        /**
	     * 
	     */
		private String is_disp;
        /**
	     * 
	     */
		private String attributes;
        /**
	     * 
	     */
		private String levelv;
        /**
	     * 
	     */
		private int row_num;
        /**
	     * 
	     */
		private String geohas;
        /**
	     * 
	     */
		private String baidux;
        /**
	     * 
	     */
		private String baiduy;
        /**
	     * 
	     */
		private String bigclass;
        /**
	     * 
	     */
		private int youxiannum;
        /**
	     * 
	     */
		private int showstatus;
        /**
	     * 
	     */
		private String ddyhbandid;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getId() {
     
		return id;
	    }
        
	    public void setId(String id) {
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
		
        public String getProvince_id() {
     
		return province_id;
	    }
        
	    public void setProvince_id(String province_id) {
		this.province_id = province_id;
	    }
       

	    /**
		*
		*/
		
        public String getCity_id() {
     
		return city_id;
	    }
        
	    public void setCity_id(String city_id) {
		this.city_id = city_id;
	    }
       

	    /**
		*
		*/
		
        public String getDistrict_id() {
     
		return district_id;
	    }
        
	    public void setDistrict_id(String district_id) {
		this.district_id = district_id;
	    }
       

	    /**
		*
		*/
		
        public String getTrade_id() {
     
		return trade_id;
	    }
        
	    public void setTrade_id(String trade_id) {
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
		
        public String getSource() {
     
		return source;
	    }
        
	    public void setSource(String source) {
		this.source = source;
	    }
       

	    /**
		*
		*/
		
        public String getXy_level() {
     
		return xy_level;
	    }
        
	    public void setXy_level(String xy_level) {
		this.xy_level = xy_level;
	    }
       

	    /**
		*
		*/
		
        public String getWeight() {
     
		return weight;
	    }
        
	    public void setWeight(String weight) {
		this.weight = weight;
	    }
       

	    /**
		*
		*/
		
        public String getIs_exist() {
     
		return is_exist;
	    }
        
	    public void setIs_exist(String is_exist) {
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
		
        public String getWl_discount() {
     
		return wl_discount;
	    }
        
	    public void setWl_discount(String wl_discount) {
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
		
        public String getStatus() {
     
		return status;
	    }
        
	    public void setStatus(String status) {
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
		
        public String getCollector_id() {
     
		return collector_id;
	    }
        
	    public void setCollector_id(String collector_id) {
		this.collector_id = collector_id;
	    }
       

	    /**
		*
		*/
		
        public String getReview_count() {
     
		return review_count;
	    }
        
	    public void setReview_count(String review_count) {
		this.review_count = review_count;
	    }
       

	    /**
		*
		*/
		
        public String getIs_disp() {
     
		return is_disp;
	    }
        
	    public void setIs_disp(String is_disp) {
		this.is_disp = is_disp;
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
		
        public String getLevelv() {
     
		return levelv;
	    }
        
	    public void setLevelv(String levelv) {
		this.levelv = levelv;
	    }
       

	    /**
		*
		*/
		
        public int getRow_num() {
     
		return row_num;
	    }
        
	    public void setRow_num(int row_num) {
		this.row_num = row_num;
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
       

	    /**
		*
		*/
		
        public String getBaidux() {
     
		return baidux;
	    }
        
	    public void setBaidux(String baidux) {
		this.baidux = baidux;
	    }
       

	    /**
		*
		*/
		
        public String getBaiduy() {
     
		return baiduy;
	    }
        
	    public void setBaiduy(String baiduy) {
		this.baiduy = baiduy;
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
		
        public int getYouxiannum() {
     
		return youxiannum;
	    }
        
	    public void setYouxiannum(int youxiannum) {
		this.youxiannum = youxiannum;
	    }
       

	    /**
		*
		*/
		
        public int getShowstatus() {
     
		return showstatus;
	    }
        
	    public void setShowstatus(int showstatus) {
		this.showstatus = showstatus;
	    }
       

	    /**
		*
		*/
		
        public String getDdyhbandid() {
     
		return ddyhbandid;
	    }
        
	    public void setDdyhbandid(String ddyhbandid) {
		this.ddyhbandid = ddyhbandid;
	    }
       
        public static aihao_dao convert(aihao34_Dao _dao){
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
        
        temp.setCreated_at(_dao.getCreated_at());
        
        temp.setUpdated_at(_dao.getUpdated_at());
        
        temp.setService_mask(_dao.getService_mask());
        
        temp.setX(_dao.getX());
        
        temp.setY(_dao.getY());
        
        temp.setLandmark(_dao.getLandmark());
        
        temp.setRegion(_dao.getRegion());
        
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
        
        temp.setAttributes(_dao.getAttributes());
        
        temp.setLevelv(_dao.getLevelv());
        
        temp.setRow_num(_dao.getRow_num());
        
        temp.setGeohas(_dao.getGeohas());
        
        temp.setBaidux(_dao.getBaidux());
        
        temp.setBaiduy(_dao.getBaiduy());
        
        temp.setBigclass(_dao.getBigclass());
        
        temp.setYouxiannum(_dao.getYouxiannum());
        
        temp.setShowstatus(_dao.getShowstatus());
        
        temp.setDdyhbandid(_dao.getDdyhbandid());
        
        return temp;
        }
		// 公共属性结束
		
	}

