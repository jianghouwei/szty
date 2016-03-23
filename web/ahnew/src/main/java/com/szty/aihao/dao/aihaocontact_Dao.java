/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaocontactEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOCONTACT数据实体
    *@作者：宋春林 
    */

	public class aihaocontact_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ID
	     */
		private int id;
        /**
	     * ??ID
	     */
		private int uinfoid;
        /**
	     * ?
	     */
		private String firstname;
        /**
	     * ?
	     */
		private String name;
        /**
	     * ????
	     */
		private String mobile;
        /**
	     * ????
	     */
		private String hometel;
        /**
	     * ????
	     */
		private String companytel;
        /**
	     * ????
	     */
		private String email;
        /**
	     * ??????
	     */
		private String im;
        /**
	     * ????
	     */
		private String postcode;
        /**
	     * ??
	     */
		private String country;
        /**
	     * ??
	     */
		private String province;
        /**
	     * ??
	     */
		private String city;
        /**
	     * ??
	     */
		private String street;
        /**
	     * 
	     */
		private Date createtime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*ID
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*??ID
		*/
		
        public int getUinfoid() {
     
		return uinfoid;
	    }
        
	    public void setUinfoid(int uinfoid) {
		this.uinfoid = uinfoid;
	    }
       

	    /**
		*?
		*/
		
        public String getFirstname() {
     
		return firstname;
	    }
        
	    public void setFirstname(String firstname) {
		this.firstname = firstname;
	    }
       

	    /**
		*?
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
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       

	    /**
		*????
		*/
		
        public String getHometel() {
     
		return hometel;
	    }
        
	    public void setHometel(String hometel) {
		this.hometel = hometel;
	    }
       

	    /**
		*????
		*/
		
        public String getCompanytel() {
     
		return companytel;
	    }
        
	    public void setCompanytel(String companytel) {
		this.companytel = companytel;
	    }
       

	    /**
		*????
		*/
		
        public String getEmail() {
     
		return email;
	    }
        
	    public void setEmail(String email) {
		this.email = email;
	    }
       

	    /**
		*??????
		*/
		
        public String getIm() {
     
		return im;
	    }
        
	    public void setIm(String im) {
		this.im = im;
	    }
       

	    /**
		*????
		*/
		
        public String getPostcode() {
     
		return postcode;
	    }
        
	    public void setPostcode(String postcode) {
		this.postcode = postcode;
	    }
       

	    /**
		*??
		*/
		
        public String getCountry() {
     
		return country;
	    }
        
	    public void setCountry(String country) {
		this.country = country;
	    }
       

	    /**
		*??
		*/
		
        public String getProvince() {
     
		return province;
	    }
        
	    public void setProvince(String province) {
		this.province = province;
	    }
       

	    /**
		*??
		*/
		
        public String getCity() {
     
		return city;
	    }
        
	    public void setCity(String city) {
		this.city = city;
	    }
       

	    /**
		*??
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
		
        public Date getCreatetime() {
     
		return createtime;
	    }
        
	    public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	    }
       
      /*  public static aihao_dao convert(aihaocontact_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setUinfoid(_dao.getUinfoid());
        
        temp.setFirstname(_dao.getFirstname());
        
        temp.setName(_dao.getName());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setHometel(_dao.getHometel());
        
        temp.setCompanytel(_dao.getCompanytel());
        
        temp.setEmail(_dao.getEmail());
        
        temp.setIm(_dao.getIm());
        
        temp.setPostcode(_dao.getPostcode());
        
        temp.setCountry(_dao.getCountry());
        
        temp.setProvince(_dao.getProvince());
        
        temp.setCity(_dao.getCity());
        
        temp.setStreet(_dao.getStreet());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

