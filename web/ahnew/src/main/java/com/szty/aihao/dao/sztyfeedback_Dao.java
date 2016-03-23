/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztyfeedbackEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYFEEDBACK数据实体
    *@作者：宋春林 
    */

	public class sztyfeedback_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ???????sztyfeedback_seq?
	     */
		private long id;
        /**
	     * ?????????
	     */
		private String orderno;
        /**
	     * ???
	     */
		private String platform;
        /**
	     * ???
	     */
		private String mobile;
        /**
	     * imsi
	     */
		private String imsi;
        /**
	     * ????
	     */
		private String brand;
        /**
	     * ????
	     */
		private String model;
        /**
	     * ?????1???2???3??
	     */
		private String infotype;
        /**
	     * ????
	     */
		private String content;
        /**
	     * ????
	     */
		private Date feedbacktime;
        /**
	     * ????
	     */
		private String productcode;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*???????sztyfeedback_seq?
		*/
		
        public long getId() {
     
		return id;
	    }
        
	    public void setId(long id) {
		this.id = id;
	    }
       

	    /**
		*?????????
		*/
		
        public String getOrderno() {
     
		return orderno;
	    }
        
	    public void setOrderno(String orderno) {
		this.orderno = orderno;
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
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
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
		*?????1???2???3??
		*/
		
        public String getInfotype() {
     
		return infotype;
	    }
        
	    public void setInfotype(String infotype) {
		this.infotype = infotype;
	    }
       

	    /**
		*????
		*/
		
        public String getContent() {
     
		return content;
	    }
        
	    public void setContent(String content) {
		this.content = content;
	    }
       

	    /**
		*????
		*/
		
        public Date getFeedbacktime() {
     
		return feedbacktime;
	    }
        
	    public void setFeedbacktime(Date feedbacktime) {
		this.feedbacktime = feedbacktime;
	    }
       

	    /**
		*????
		*/
		
        public String getProductcode() {
     
		return productcode;
	    }
        
	    public void setProductcode(String productcode) {
		this.productcode = productcode;
	    }
       
      /*  public static aihao_dao convert(sztyfeedback_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setOrderno(_dao.getOrderno());
        
        temp.setPlatform(_dao.getPlatform());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setBrand(_dao.getBrand());
        
        temp.setModel(_dao.getModel());
        
        temp.setInfotype(_dao.getInfotype());
        
        temp.setContent(_dao.getContent());
        
        temp.setFeedbacktime(_dao.getFeedbacktime());
        
        temp.setProductcode(_dao.getProductcode());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

