/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mobileareamap1Entity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MOBILEAREAMAP1数据实体
    *@作者：宋春林 
    */

	public class mobileareamap1_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String countryid;
        /**
	     * 
	     */
		private String countryname;
        /**
	     * 
	     */
		private String prefix;
        /**
	     * 
	     */
		private String province_id;
        /**
	     * 
	     */
		private String province_name;
        /**
	     * 
	     */
		private String area_id;
        /**
	     * 
	     */
		private String area_name;
        /**
	     * 
	     */
		private String cardtype;
        /**
	     * 
	     */
		private long mobile_type;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getCountryid() {
     
		return countryid;
	    }
        
	    public void setCountryid(String countryid) {
		this.countryid = countryid;
	    }
       

	    /**
		*
		*/
		
        public String getCountryname() {
     
		return countryname;
	    }
        
	    public void setCountryname(String countryname) {
		this.countryname = countryname;
	    }
       

	    /**
		*
		*/
		
        public String getPrefix() {
     
		return prefix;
	    }
        
	    public void setPrefix(String prefix) {
		this.prefix = prefix;
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
		
        public String getProvince_name() {
     
		return province_name;
	    }
        
	    public void setProvince_name(String province_name) {
		this.province_name = province_name;
	    }
       

	    /**
		*
		*/
		
        public String getArea_id() {
     
		return area_id;
	    }
        
	    public void setArea_id(String area_id) {
		this.area_id = area_id;
	    }
       

	    /**
		*
		*/
		
        public String getArea_name() {
     
		return area_name;
	    }
        
	    public void setArea_name(String area_name) {
		this.area_name = area_name;
	    }
       

	    /**
		*
		*/
		
        public String getCardtype() {
     
		return cardtype;
	    }
        
	    public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	    }
       

	    /**
		*
		*/
		
        public long getMobile_type() {
     
		return mobile_type;
	    }
        
	    public void setMobile_type(long mobile_type) {
		this.mobile_type = mobile_type;
	    }
       
      /*  public static aihao_dao convert(mobileareamap1_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setCountryid(_dao.getCountryid());
        
        temp.setCountryname(_dao.getCountryname());
        
        temp.setPrefix(_dao.getPrefix());
        
        temp.setProvince_id(_dao.getProvince_id());
        
        temp.setProvince_name(_dao.getProvince_name());
        
        temp.setArea_id(_dao.getArea_id());
        
        temp.setArea_name(_dao.getArea_name());
        
        temp.setCardtype(_dao.getCardtype());
        
        temp.setMobile_type(_dao.getMobile_type());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

