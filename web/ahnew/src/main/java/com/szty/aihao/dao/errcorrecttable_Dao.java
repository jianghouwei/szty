/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： errcorrecttableEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@ERRCORRECTTABLE数据实体
    *@作者：宋春林 
    */

	public class errcorrecttable_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int errorid;
        /**
	     * 
	     */
		private String merchantid;
        /**
	     * 
	     */
		private String merchantname;
        /**
	     * 
	     */
		private String merchantmobile;
        /**
	     * 
	     */
		private String merchantaddress;
        /**
	     * 
	     */
		private String merchantlat;
        /**
	     * 
	     */
		private String merchantlng;
        /**
	     * 
	     */
		private String merchantother;
        /**
	     * 
	     */
		private int clientos;
        /**
	     * 
	     */
		private String errorcreatemobile;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private Date udate;
        /**
	     * 
	     */
		private int checkstatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getErrorid() {
     
		return errorid;
	    }
        
	    public void setErrorid(int errorid) {
		this.errorid = errorid;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantid() {
     
		return merchantid;
	    }
        
	    public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantname() {
     
		return merchantname;
	    }
        
	    public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantmobile() {
     
		return merchantmobile;
	    }
        
	    public void setMerchantmobile(String merchantmobile) {
		this.merchantmobile = merchantmobile;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantaddress() {
     
		return merchantaddress;
	    }
        
	    public void setMerchantaddress(String merchantaddress) {
		this.merchantaddress = merchantaddress;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantlat() {
     
		return merchantlat;
	    }
        
	    public void setMerchantlat(String merchantlat) {
		this.merchantlat = merchantlat;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantlng() {
     
		return merchantlng;
	    }
        
	    public void setMerchantlng(String merchantlng) {
		this.merchantlng = merchantlng;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantother() {
     
		return merchantother;
	    }
        
	    public void setMerchantother(String merchantother) {
		this.merchantother = merchantother;
	    }
       

	    /**
		*
		*/
		
        public int getClientos() {
     
		return clientos;
	    }
        
	    public void setClientos(int clientos) {
		this.clientos = clientos;
	    }
       

	    /**
		*
		*/
		
        public String getErrorcreatemobile() {
     
		return errorcreatemobile;
	    }
        
	    public void setErrorcreatemobile(String errorcreatemobile) {
		this.errorcreatemobile = errorcreatemobile;
	    }
       

	    /**
		*
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       

	    /**
		*
		*/
		
        public Date getUdate() {
     
		return udate;
	    }
        
	    public void setUdate(Date udate) {
		this.udate = udate;
	    }
       

	    /**
		*
		*/
		
        public int getCheckstatus() {
     
		return checkstatus;
	    }
        
	    public void setCheckstatus(int checkstatus) {
		this.checkstatus = checkstatus;
	    }
       
      /*  public static aihao_dao convert(errcorrecttable_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setErrorid(_dao.getErrorid());
        
        temp.setMerchantid(_dao.getMerchantid());
        
        temp.setMerchantname(_dao.getMerchantname());
        
        temp.setMerchantmobile(_dao.getMerchantmobile());
        
        temp.setMerchantaddress(_dao.getMerchantaddress());
        
        temp.setMerchantlat(_dao.getMerchantlat());
        
        temp.setMerchantlng(_dao.getMerchantlng());
        
        temp.setMerchantother(_dao.getMerchantother());
        
        temp.setClientos(_dao.getClientos());
        
        temp.setErrorcreatemobile(_dao.getErrorcreatemobile());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setUdate(_dao.getUdate());
        
        temp.setCheckstatus(_dao.getCheckstatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

