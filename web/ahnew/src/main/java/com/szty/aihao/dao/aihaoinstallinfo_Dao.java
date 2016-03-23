/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaoinstallinfoEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOINSTALLINFO数据实体
    *@作者：宋春林 
    */

	public class aihaoinstallinfo_Dao implements Serializable
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
		private String channel;
        /**
	     * 
	     */
		private String version;
        /**
	     * 
	     */
		private String imsi;
        /**
	     * 
	     */
		private String phonemodel;
        /**
	     * 
	     */
		private Date createtime;
        /**
	     * 
	     */
		private String phonebrand;
        /**
	     * 
	     */
		private String ostype;
        /**
	     * 
	     */
		private String mobile;
        /**
	     * 
	     */
		private String platform;
        /**
	     * 
	     */
		private String productcode;
        
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
		
        public String getChannel() {
     
		return channel;
	    }
        
	    public void setChannel(String channel) {
		this.channel = channel;
	    }
       

	    /**
		*
		*/
		
        public String getVersion() {
     
		return version;
	    }
        
	    public void setVersion(String version) {
		this.version = version;
	    }
       

	    /**
		*
		*/
		
        public String getImsi() {
     
		return imsi;
	    }
        
	    public void setImsi(String imsi) {
		this.imsi = imsi;
	    }
       

	    /**
		*
		*/
		
        public String getPhonemodel() {
     
		return phonemodel;
	    }
        
	    public void setPhonemodel(String phonemodel) {
		this.phonemodel = phonemodel;
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
       

	    /**
		*
		*/
		
        public String getPhonebrand() {
     
		return phonebrand;
	    }
        
	    public void setPhonebrand(String phonebrand) {
		this.phonebrand = phonebrand;
	    }
       

	    /**
		*
		*/
		
        public String getOstype() {
     
		return ostype;
	    }
        
	    public void setOstype(String ostype) {
		this.ostype = ostype;
	    }
       

	    /**
		*
		*/
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       

	    /**
		*
		*/
		
        public String getPlatform() {
     
		return platform;
	    }
        
	    public void setPlatform(String platform) {
		this.platform = platform;
	    }
       

	    /**
		*
		*/
		
        public String getProductcode() {
     
		return productcode;
	    }
        
	    public void setProductcode(String productcode) {
		this.productcode = productcode;
	    }
       
      /*  public static aihao_dao convert(aihaoinstallinfo_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setChannel(_dao.getChannel());
        
        temp.setVersion(_dao.getVersion());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setPhonemodel(_dao.getPhonemodel());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        temp.setPhonebrand(_dao.getPhonebrand());
        
        temp.setOstype(_dao.getOstype());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setPlatform(_dao.getPlatform());
        
        temp.setProductcode(_dao.getProductcode());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

