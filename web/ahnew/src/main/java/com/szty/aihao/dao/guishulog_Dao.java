/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： guishulogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@GUISHULOG数据实体
    *@作者：宋春林 
    */

	public class guishulog_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String mobile;
        /**
	     * 
	     */
		private String mobileattribution;
        /**
	     * 
	     */
		private String mobilenum;
        /**
	     * 
	     */
		private String numexplan;
        /**
	     * 
	     */
		private String evaluate;
        /**
	     * 
	     */
		private String imply;
        /**
	     * 
	     */
		private String poetry;
        /**
	     * 
	     */
		private String stars;
        /**
	     * 
	     */
		private String poetryexplan;
        /**
	     * 
	     */
		private String mobilevalue;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private String qian;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public String getMobileattribution() {
     
		return mobileattribution;
	    }
        
	    public void setMobileattribution(String mobileattribution) {
		this.mobileattribution = mobileattribution;
	    }
       

	    /**
		*
		*/
		
        public String getMobilenum() {
     
		return mobilenum;
	    }
        
	    public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	    }
       

	    /**
		*
		*/
		
        public String getNumexplan() {
     
		return numexplan;
	    }
        
	    public void setNumexplan(String numexplan) {
		this.numexplan = numexplan;
	    }
       

	    /**
		*
		*/
		
        public String getEvaluate() {
     
		return evaluate;
	    }
        
	    public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	    }
       

	    /**
		*
		*/
		
        public String getImply() {
     
		return imply;
	    }
        
	    public void setImply(String imply) {
		this.imply = imply;
	    }
       

	    /**
		*
		*/
		
        public String getPoetry() {
     
		return poetry;
	    }
        
	    public void setPoetry(String poetry) {
		this.poetry = poetry;
	    }
       

	    /**
		*
		*/
		
        public String getStars() {
     
		return stars;
	    }
        
	    public void setStars(String stars) {
		this.stars = stars;
	    }
       

	    /**
		*
		*/
		
        public String getPoetryexplan() {
     
		return poetryexplan;
	    }
        
	    public void setPoetryexplan(String poetryexplan) {
		this.poetryexplan = poetryexplan;
	    }
       

	    /**
		*
		*/
		
        public String getMobilevalue() {
     
		return mobilevalue;
	    }
        
	    public void setMobilevalue(String mobilevalue) {
		this.mobilevalue = mobilevalue;
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
		
        public String getQian() {
     
		return qian;
	    }
        
	    public void setQian(String qian) {
		this.qian = qian;
	    }
       
      /*  public static aihao_dao convert(guishulog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMobile(_dao.getMobile());
        
        temp.setMobileattribution(_dao.getMobileattribution());
        
        temp.setMobilenum(_dao.getMobilenum());
        
        temp.setNumexplan(_dao.getNumexplan());
        
        temp.setEvaluate(_dao.getEvaluate());
        
        temp.setImply(_dao.getImply());
        
        temp.setPoetry(_dao.getPoetry());
        
        temp.setStars(_dao.getStars());
        
        temp.setPoetryexplan(_dao.getPoetryexplan());
        
        temp.setMobilevalue(_dao.getMobilevalue());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setQian(_dao.getQian());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

