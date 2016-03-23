/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： huangye_bakEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@HUANGYE_BAK数据实体
    *@作者：宋春林 
    */

	public class huangye_bak_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int merid;
        /**
	     * 
	     */
		private String mername;
        /**
	     * 
	     */
		private String meraddress;
        /**
	     * 
	     */
		private String merphone;
        /**
	     * 
	     */
		private String merbaiduaddress;
        /**
	     * 
	     */
		private String merbaidulatitude;
        /**
	     * 
	     */
		private String merbaidulongitude;
        /**
	     * 
	     */
		private Date mercdate;
        /**
	     * 
	     */
		private Date merudate;
        /**
	     * 
	     */
		private String fenlei;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getMerid() {
     
		return merid;
	    }
        
	    public void setMerid(int merid) {
		this.merid = merid;
	    }
       

	    /**
		*
		*/
		
        public String getMername() {
     
		return mername;
	    }
        
	    public void setMername(String mername) {
		this.mername = mername;
	    }
       

	    /**
		*
		*/
		
        public String getMeraddress() {
     
		return meraddress;
	    }
        
	    public void setMeraddress(String meraddress) {
		this.meraddress = meraddress;
	    }
       

	    /**
		*
		*/
		
        public String getMerphone() {
     
		return merphone;
	    }
        
	    public void setMerphone(String merphone) {
		this.merphone = merphone;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaiduaddress() {
     
		return merbaiduaddress;
	    }
        
	    public void setMerbaiduaddress(String merbaiduaddress) {
		this.merbaiduaddress = merbaiduaddress;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaidulatitude() {
     
		return merbaidulatitude;
	    }
        
	    public void setMerbaidulatitude(String merbaidulatitude) {
		this.merbaidulatitude = merbaidulatitude;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaidulongitude() {
     
		return merbaidulongitude;
	    }
        
	    public void setMerbaidulongitude(String merbaidulongitude) {
		this.merbaidulongitude = merbaidulongitude;
	    }
       

	    /**
		*
		*/
		
        public Date getMercdate() {
     
		return mercdate;
	    }
        
	    public void setMercdate(Date mercdate) {
		this.mercdate = mercdate;
	    }
       

	    /**
		*
		*/
		
        public Date getMerudate() {
     
		return merudate;
	    }
        
	    public void setMerudate(Date merudate) {
		this.merudate = merudate;
	    }
       

	    /**
		*
		*/
		
        public String getFenlei() {
     
		return fenlei;
	    }
        
	    public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	    }
       
      /*  public static aihao_dao convert(huangye_bak_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMerid(_dao.getMerid());
        
        temp.setMername(_dao.getMername());
        
        temp.setMeraddress(_dao.getMeraddress());
        
        temp.setMerphone(_dao.getMerphone());
        
        temp.setMerbaiduaddress(_dao.getMerbaiduaddress());
        
        temp.setMerbaidulatitude(_dao.getMerbaidulatitude());
        
        temp.setMerbaidulongitude(_dao.getMerbaidulongitude());
        
        temp.setMercdate(_dao.getMercdate());
        
        temp.setMerudate(_dao.getMerudate());
        
        temp.setFenlei(_dao.getFenlei());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

