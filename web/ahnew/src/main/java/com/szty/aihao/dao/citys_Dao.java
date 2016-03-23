/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： citysEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@CITYS数据实体
    *@作者：宋春林 
    */

	public class citys_Dao implements Serializable
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
		private String cityname;
        /**
	     * 
	     */
		private int procode;
        /**
	     * 
	     */
		private int citycode;
        /**
	     * ?????????
	     */
		private String weather_code;
        /**
	     * 
	     */
		private String citypinyin;
        /**
	     * 
	     */
		private String cityh;
        /**
	     * 
	     */
		private String citysx;
        /**
	     * 
	     */
		private String quhao;
        /**
	     * 
	     */
		private String youbian;
        
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
		
        public String getCityname() {
     
		return cityname;
	    }
        
	    public void setCityname(String cityname) {
		this.cityname = cityname;
	    }
       

	    /**
		*
		*/
		
        public int getProcode() {
     
		return procode;
	    }
        
	    public void setProcode(int procode) {
		this.procode = procode;
	    }
       

	    /**
		*
		*/
		
        public int getCitycode() {
     
		return citycode;
	    }
        
	    public void setCitycode(int citycode) {
		this.citycode = citycode;
	    }
       

	    /**
		*?????????
		*/
		
        public String getWeather_code() {
     
		return weather_code;
	    }
        
	    public void setWeather_code(String weather_code) {
		this.weather_code = weather_code;
	    }
       

	    /**
		*
		*/
		
        public String getCitypinyin() {
     
		return citypinyin;
	    }
        
	    public void setCitypinyin(String citypinyin) {
		this.citypinyin = citypinyin;
	    }
       

	    /**
		*
		*/
		
        public String getCityh() {
     
		return cityh;
	    }
        
	    public void setCityh(String cityh) {
		this.cityh = cityh;
	    }
       

	    /**
		*
		*/
		
        public String getCitysx() {
     
		return citysx;
	    }
        
	    public void setCitysx(String citysx) {
		this.citysx = citysx;
	    }
       

	    /**
		*
		*/
		
        public String getQuhao() {
     
		return quhao;
	    }
        
	    public void setQuhao(String quhao) {
		this.quhao = quhao;
	    }
       

	    /**
		*
		*/
		
        public String getYoubian() {
     
		return youbian;
	    }
        
	    public void setYoubian(String youbian) {
		this.youbian = youbian;
	    }
       
      /*  public static aihao_dao convert(citys_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setCityname(_dao.getCityname());
        
        temp.setProcode(_dao.getProcode());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setWeather_code(_dao.getWeather_code());
        
        temp.setCitypinyin(_dao.getCitypinyin());
        
        temp.setCityh(_dao.getCityh());
        
        temp.setCitysx(_dao.getCitysx());
        
        temp.setQuhao(_dao.getQuhao());
        
        temp.setYoubian(_dao.getYoubian());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

