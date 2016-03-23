/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihao_weatherinfoEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAO_WEATHERINFO数据实体
    *@作者：宋春林 
    */

	public class aihao_weatherinfo_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * id
	     */
		private int wid;
        /**
	     * ??
	     */
		private Date wdate;
        /**
	     * ??ID
	     */
		private String provinceid;
        /**
	     * ??id
	     */
		private String cityid;
        /**
	     * ????(?????)
	     */
		private String temp_high;
        /**
	     * ????(?????)
	     */
		private String temp_low;
        /**
	     * ??????
	     */
		private String weather_day;
        /**
	     * ??????
	     */
		private int weather_day_code;
        /**
	     * ??????
	     */
		private String weather_night;
        /**
	     * ??????
	     */
		private int weather_night_code;
        /**
	     * ?
	     */
		private String wind;
        /**
	     * ??
	     */
		private String suggest;
        /**
	     * ???
	     */
		private String uv;
        /**
	     * ??
	     */
		private String xc;
        /**
	     * ??
	     */
		private String cx;
        /**
	     * ??
	     */
		private String cl;
        /**
	     * ??
	     */
		private String ls;
        /**
	     * ??
	     */
		private String allergy;
        /**
	     * ???
	     */
		private String co;
        /**
	     * ????
	     */
		private Date creattime;
        /**
	     * ????
	     */
		private Date updatetime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*id
		*/
		
        public int getWid() {
     
		return wid;
	    }
        
	    public void setWid(int wid) {
		this.wid = wid;
	    }
       

	    /**
		*??
		*/
		
        public Date getWdate() {
     
		return wdate;
	    }
        
	    public void setWdate(Date wdate) {
		this.wdate = wdate;
	    }
       

	    /**
		*??ID
		*/
		
        public String getProvinceid() {
     
		return provinceid;
	    }
        
	    public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	    }
       

	    /**
		*??id
		*/
		
        public String getCityid() {
     
		return cityid;
	    }
        
	    public void setCityid(String cityid) {
		this.cityid = cityid;
	    }
       

	    /**
		*????(?????)
		*/
		
        public String getTemp_high() {
     
		return temp_high;
	    }
        
	    public void setTemp_high(String temp_high) {
		this.temp_high = temp_high;
	    }
       

	    /**
		*????(?????)
		*/
		
        public String getTemp_low() {
     
		return temp_low;
	    }
        
	    public void setTemp_low(String temp_low) {
		this.temp_low = temp_low;
	    }
       

	    /**
		*??????
		*/
		
        public String getWeather_day() {
     
		return weather_day;
	    }
        
	    public void setWeather_day(String weather_day) {
		this.weather_day = weather_day;
	    }
       

	    /**
		*??????
		*/
		
        public int getWeather_day_code() {
     
		return weather_day_code;
	    }
        
	    public void setWeather_day_code(int weather_day_code) {
		this.weather_day_code = weather_day_code;
	    }
       

	    /**
		*??????
		*/
		
        public String getWeather_night() {
     
		return weather_night;
	    }
        
	    public void setWeather_night(String weather_night) {
		this.weather_night = weather_night;
	    }
       

	    /**
		*??????
		*/
		
        public int getWeather_night_code() {
     
		return weather_night_code;
	    }
        
	    public void setWeather_night_code(int weather_night_code) {
		this.weather_night_code = weather_night_code;
	    }
       

	    /**
		*?
		*/
		
        public String getWind() {
     
		return wind;
	    }
        
	    public void setWind(String wind) {
		this.wind = wind;
	    }
       

	    /**
		*??
		*/
		
        public String getSuggest() {
     
		return suggest;
	    }
        
	    public void setSuggest(String suggest) {
		this.suggest = suggest;
	    }
       

	    /**
		*???
		*/
		
        public String getUv() {
     
		return uv;
	    }
        
	    public void setUv(String uv) {
		this.uv = uv;
	    }
       

	    /**
		*??
		*/
		
        public String getXc() {
     
		return xc;
	    }
        
	    public void setXc(String xc) {
		this.xc = xc;
	    }
       

	    /**
		*??
		*/
		
        public String getCx() {
     
		return cx;
	    }
        
	    public void setCx(String cx) {
		this.cx = cx;
	    }
       

	    /**
		*??
		*/
		
        public String getCl() {
     
		return cl;
	    }
        
	    public void setCl(String cl) {
		this.cl = cl;
	    }
       

	    /**
		*??
		*/
		
        public String getLs() {
     
		return ls;
	    }
        
	    public void setLs(String ls) {
		this.ls = ls;
	    }
       

	    /**
		*??
		*/
		
        public String getAllergy() {
     
		return allergy;
	    }
        
	    public void setAllergy(String allergy) {
		this.allergy = allergy;
	    }
       

	    /**
		*???
		*/
		
        public String getCo() {
     
		return co;
	    }
        
	    public void setCo(String co) {
		this.co = co;
	    }
       

	    /**
		*????
		*/
		
        public Date getCreattime() {
     
		return creattime;
	    }
        
	    public void setCreattime(Date creattime) {
		this.creattime = creattime;
	    }
       

	    /**
		*????
		*/
		
        public Date getUpdatetime() {
     
		return updatetime;
	    }
        
	    public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	    }
       
      /*  public static aihao_dao convert(aihao_weatherinfo_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setWid(_dao.getWid());
        
        temp.setWdate(_dao.getWdate());
        
        temp.setProvinceid(_dao.getProvinceid());
        
        temp.setCityid(_dao.getCityid());
        
        temp.setTemp_high(_dao.getTemp_high());
        
        temp.setTemp_low(_dao.getTemp_low());
        
        temp.setWeather_day(_dao.getWeather_day());
        
        temp.setWeather_day_code(_dao.getWeather_day_code());
        
        temp.setWeather_night(_dao.getWeather_night());
        
        temp.setWeather_night_code(_dao.getWeather_night_code());
        
        temp.setWind(_dao.getWind());
        
        temp.setSuggest(_dao.getSuggest());
        
        temp.setUv(_dao.getUv());
        
        temp.setXc(_dao.getXc());
        
        temp.setCx(_dao.getCx());
        
        temp.setCl(_dao.getCl());
        
        temp.setLs(_dao.getLs());
        
        temp.setAllergy(_dao.getAllergy());
        
        temp.setCo(_dao.getCo());
        
        temp.setCreattime(_dao.getCreattime());
        
        temp.setUpdatetime(_dao.getUpdatetime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

