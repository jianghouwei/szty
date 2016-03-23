/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaouserlogin_newEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOUSERLOGIN_NEW数据实体
    *@作者：宋春林 
    */

	public class aihaouserlogin_new_Dao implements Serializable
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
		private String platform;
        /**
	     * 
	     */
		private String productcode;
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
		private String mobile;
        /**
	     * 
	     */
		private String imsi;
        /**
	     * 
	     */
		private Date createtime;
        
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
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
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
		
        public Date getCreatetime() {
     
		return createtime;
	    }
        
	    public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	    }
       
      /*  public static aihao_dao convert(aihaouserlogin_new_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setPlatform(_dao.getPlatform());
        
        temp.setProductcode(_dao.getProductcode());
        
        temp.setChannel(_dao.getChannel());
        
        temp.setVersion(_dao.getVersion());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

