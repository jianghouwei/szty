﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaosearchlogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOSEARCHLOG数据实体
    *@作者：宋春林 
    */

	public class aihaosearchlog_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int logid;
        /**
	     * 
	     */
		private String productid;
        /**
	     * 
	     */
		private String pcode;
        /**
	     * 
	     */
		private String channel;
        /**
	     * 
	     */
		private String ver;
        /**
	     * 
	     */
		private String imsi;
        /**
	     * 
	     */
		private String mobile;
        /**
	     * 
	     */
		private String pb;
        /**
	     * 
	     */
		private String pm;
        /**
	     * 
	     */
		private String os;
        /**
	     * 
	     */
		private String ar;
        /**
	     * 
	     */
		private String c;
        /**
	     * 
	     */
		private String la;
        /**
	     * 
	     */
		private String lo;
        /**
	     * 
	     */
		private String keywords;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private int totalreturn;
        /**
	     * 
	     */
		private int comefrom;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getLogid() {
     
		return logid;
	    }
        
	    public void setLogid(int logid) {
		this.logid = logid;
	    }
       

	    /**
		*
		*/
		
        public String getProductid() {
     
		return productid;
	    }
        
	    public void setProductid(String productid) {
		this.productid = productid;
	    }
       

	    /**
		*
		*/
		
        public String getPcode() {
     
		return pcode;
	    }
        
	    public void setPcode(String pcode) {
		this.pcode = pcode;
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
		
        public String getVer() {
     
		return ver;
	    }
        
	    public void setVer(String ver) {
		this.ver = ver;
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
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       

	    /**
		*
		*/
		
        public String getPb() {
     
		return pb;
	    }
        
	    public void setPb(String pb) {
		this.pb = pb;
	    }
       

	    /**
		*
		*/
		
        public String getPm() {
     
		return pm;
	    }
        
	    public void setPm(String pm) {
		this.pm = pm;
	    }
       

	    /**
		*
		*/
		
        public String getOs() {
     
		return os;
	    }
        
	    public void setOs(String os) {
		this.os = os;
	    }
       

	    /**
		*
		*/
		
        public String getAr() {
     
		return ar;
	    }
        
	    public void setAr(String ar) {
		this.ar = ar;
	    }
       

	    /**
		*
		*/
		
        public String getC() {
     
		return c;
	    }
        
	    public void setC(String c) {
		this.c = c;
	    }
       

	    /**
		*
		*/
		
        public String getLa() {
     
		return la;
	    }
        
	    public void setLa(String la) {
		this.la = la;
	    }
       

	    /**
		*
		*/
		
        public String getLo() {
     
		return lo;
	    }
        
	    public void setLo(String lo) {
		this.lo = lo;
	    }
       

	    /**
		*
		*/
		
        public String getKeywords() {
     
		return keywords;
	    }
        
	    public void setKeywords(String keywords) {
		this.keywords = keywords;
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
		
        public int getTotalreturn() {
     
		return totalreturn;
	    }
        
	    public void setTotalreturn(int totalreturn) {
		this.totalreturn = totalreturn;
	    }
       

	    /**
		*
		*/
		
        public int getComefrom() {
     
		return comefrom;
	    }
        
	    public void setComefrom(int comefrom) {
		this.comefrom = comefrom;
	    }
       
      /*  public static aihao_dao convert(aihaosearchlog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLogid(_dao.getLogid());
        
        temp.setProductid(_dao.getProductid());
        
        temp.setPcode(_dao.getPcode());
        
        temp.setChannel(_dao.getChannel());
        
        temp.setVer(_dao.getVer());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setPb(_dao.getPb());
        
        temp.setPm(_dao.getPm());
        
        temp.setOs(_dao.getOs());
        
        temp.setAr(_dao.getAr());
        
        temp.setC(_dao.getC());
        
        temp.setLa(_dao.getLa());
        
        temp.setLo(_dao.getLo());
        
        temp.setKeywords(_dao.getKeywords());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setTotalreturn(_dao.getTotalreturn());
        
        temp.setComefrom(_dao.getComefrom());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

