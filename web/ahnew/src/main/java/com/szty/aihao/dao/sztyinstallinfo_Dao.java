/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztyinstallinfoEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYINSTALLINFO数据实体
    *@作者：宋春林 
    */

	public class sztyinstallinfo_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ???????installinfo_seq?
	     */
		private int id;
        /**
	     * ???
	     */
		private String platform;
        /**
	     * ???
	     */
		private String channel;
        /**
	     * ??ID
	     */
		private String productcode;
        /**
	     * ???
	     */
		private String version;
        /**
	     * imsi
	     */
		private String imsi;
        /**
	     * ????
	     */
		private String phonemodel;
        /**
	     * ????
	     */
		private Date createtime;
        /**
	     * ????
	     */
		private String phonebrand;
        /**
	     * ???????????
	     */
		private String ostype;
        /**
	     * ???
	     */
		private String mobile;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*???????installinfo_seq?
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*???
		*/
		
        public String getPlatform() {
     
		return platform;
	    }
        
	    public void setPlatform(String platform) {
		this.platform = platform;
	    }
       

	    /**
		*???
		*/
		
        public String getChannel() {
     
		return channel;
	    }
        
	    public void setChannel(String channel) {
		this.channel = channel;
	    }
       

	    /**
		*??ID
		*/
		
        public String getProductcode() {
     
		return productcode;
	    }
        
	    public void setProductcode(String productcode) {
		this.productcode = productcode;
	    }
       

	    /**
		*???
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
		*????
		*/
		
        public String getPhonemodel() {
     
		return phonemodel;
	    }
        
	    public void setPhonemodel(String phonemodel) {
		this.phonemodel = phonemodel;
	    }
       

	    /**
		*????
		*/
		
        public Date getCreatetime() {
     
		return createtime;
	    }
        
	    public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	    }
       

	    /**
		*????
		*/
		
        public String getPhonebrand() {
     
		return phonebrand;
	    }
        
	    public void setPhonebrand(String phonebrand) {
		this.phonebrand = phonebrand;
	    }
       

	    /**
		*???????????
		*/
		
        public String getOstype() {
     
		return ostype;
	    }
        
	    public void setOstype(String ostype) {
		this.ostype = ostype;
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
       
      /*  public static aihao_dao convert(sztyinstallinfo_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setPlatform(_dao.getPlatform());
        
        temp.setChannel(_dao.getChannel());
        
        temp.setProductcode(_dao.getProductcode());
        
        temp.setVersion(_dao.getVersion());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setPhonemodel(_dao.getPhonemodel());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        temp.setPhonebrand(_dao.getPhonebrand());
        
        temp.setOstype(_dao.getOstype());
        
        temp.setMobile(_dao.getMobile());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

