/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaouselogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOUSELOG数据实体
    *@作者：宋春林 
    */

	public class aihaouselog_Dao implements Serializable
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
		private int platform;
        /**
	     * ??ID
	     */
		private int productcode;
        /**
	     * ??
	     */
		private String channel;
        /**
	     * ??
	     */
		private String version;
        /**
	     * imsi
	     */
		private String imsi;
        /**
	     * ???
	     */
		private String mobile;
        /**
	     * ????
	     */
		private String os;
        /**
	     * ????
	     */
		private String brand;
        /**
	     * ????
	     */
		private String model;
        /**
	     * ????
	     */
		private int provincecode;
        /**
	     * ????
	     */
		private int citycode;
        /**
	     * ??????
	     */
		private Date cdate;
        /**
	     * ?????????
	     */
		private int code;
        /**
	     * ????
	     */
		private int cnt;
        
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
		
        public int getPlatform() {
     
		return platform;
	    }
        
	    public void setPlatform(int platform) {
		this.platform = platform;
	    }
       

	    /**
		*??ID
		*/
		
        public int getProductcode() {
     
		return productcode;
	    }
        
	    public void setProductcode(int productcode) {
		this.productcode = productcode;
	    }
       

	    /**
		*??
		*/
		
        public String getChannel() {
     
		return channel;
	    }
        
	    public void setChannel(String channel) {
		this.channel = channel;
	    }
       

	    /**
		*??
		*/
		
        public String getVersion() {
     
		return version;
	    }
        
	    public void setVersion(String version) {
		this.version = version;
	    }
       

	    /**
		*imsi
		*/
		
        public String getImsi() {
     
		return imsi;
	    }
        
	    public void setImsi(String imsi) {
		this.imsi = imsi;
	    }
       

	    /**
		*???
		*/
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       

	    /**
		*????
		*/
		
        public String getOs() {
     
		return os;
	    }
        
	    public void setOs(String os) {
		this.os = os;
	    }
       

	    /**
		*????
		*/
		
        public String getBrand() {
     
		return brand;
	    }
        
	    public void setBrand(String brand) {
		this.brand = brand;
	    }
       

	    /**
		*????
		*/
		
        public String getModel() {
     
		return model;
	    }
        
	    public void setModel(String model) {
		this.model = model;
	    }
       

	    /**
		*????
		*/
		
        public int getProvincecode() {
     
		return provincecode;
	    }
        
	    public void setProvincecode(int provincecode) {
		this.provincecode = provincecode;
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
		*??????
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       

	    /**
		*?????????
		*/
		
        public int getCode() {
     
		return code;
	    }
        
	    public void setCode(int code) {
		this.code = code;
	    }
       

	    /**
		*????
		*/
		
        public int getCnt() {
     
		return cnt;
	    }
        
	    public void setCnt(int cnt) {
		this.cnt = cnt;
	    }
       
      /*  public static aihao_dao convert(aihaouselog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setPlatform(_dao.getPlatform());
        
        temp.setProductcode(_dao.getProductcode());
        
        temp.setChannel(_dao.getChannel());
        
        temp.setVersion(_dao.getVersion());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setOs(_dao.getOs());
        
        temp.setBrand(_dao.getBrand());
        
        temp.setModel(_dao.getModel());
        
        temp.setProvincecode(_dao.getProvincecode());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setCode(_dao.getCode());
        
        temp.setCnt(_dao.getCnt());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

