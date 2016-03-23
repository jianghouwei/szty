/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： jobtableEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@JOBTABLE数据实体
    *@作者：宋春林 
    */

	public class jobtable_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int jobid;
        /**
	     * 
	     */
		private Date jobcdate;
        /**
	     * 
	     */
		private String merchantid;
        /**
	     * 
	     */
		private String jobcreatemobile;
        /**
	     * 
	     */
		private String jobcreateuserid;
        /**
	     * 
	     */
		private Date jobusedtime;
        /**
	     * 
	     */
		private int jobinvitetype;
        /**
	     * 
	     */
		private String mobilelist;
        /**
	     * 
	     */
		private String jobwarn;
        /**
	     * 
	     */
		private String merchantname;
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
		private String merchantbaidulat;
        /**
	     * 
	     */
		private String merchantbaidulng;
        /**
	     * 
	     */
		private String merchantaddress;
        /**
	     * 
	     */
		private String merchantphone;
        /**
	     * 
	     */
		private String merchantbigclass;
        /**
	     * 
	     */
		private String jobwarnhour;
        /**
	     * 
	     */
		private int merchantfrom;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getJobid() {
     
		return jobid;
	    }
        
	    public void setJobid(int jobid) {
		this.jobid = jobid;
	    }
       

	    /**
		*
		*/
		
        public Date getJobcdate() {
     
		return jobcdate;
	    }
        
	    public void setJobcdate(Date jobcdate) {
		this.jobcdate = jobcdate;
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
		
        public String getJobcreatemobile() {
     
		return jobcreatemobile;
	    }
        
	    public void setJobcreatemobile(String jobcreatemobile) {
		this.jobcreatemobile = jobcreatemobile;
	    }
       

	    /**
		*
		*/
		
        public String getJobcreateuserid() {
     
		return jobcreateuserid;
	    }
        
	    public void setJobcreateuserid(String jobcreateuserid) {
		this.jobcreateuserid = jobcreateuserid;
	    }
       

	    /**
		*
		*/
		
        public Date getJobusedtime() {
     
		return jobusedtime;
	    }
        
	    public void setJobusedtime(Date jobusedtime) {
		this.jobusedtime = jobusedtime;
	    }
       

	    /**
		*
		*/
		
        public int getJobinvitetype() {
     
		return jobinvitetype;
	    }
        
	    public void setJobinvitetype(int jobinvitetype) {
		this.jobinvitetype = jobinvitetype;
	    }
       

	    /**
		*
		*/
		
        public String getMobilelist() {
     
		return mobilelist;
	    }
        
	    public void setMobilelist(String mobilelist) {
		this.mobilelist = mobilelist;
	    }
       

	    /**
		*
		*/
		
        public String getJobwarn() {
     
		return jobwarn;
	    }
        
	    public void setJobwarn(String jobwarn) {
		this.jobwarn = jobwarn;
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
		
        public String getMerchantbaidulat() {
     
		return merchantbaidulat;
	    }
        
	    public void setMerchantbaidulat(String merchantbaidulat) {
		this.merchantbaidulat = merchantbaidulat;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantbaidulng() {
     
		return merchantbaidulng;
	    }
        
	    public void setMerchantbaidulng(String merchantbaidulng) {
		this.merchantbaidulng = merchantbaidulng;
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
		
        public String getMerchantphone() {
     
		return merchantphone;
	    }
        
	    public void setMerchantphone(String merchantphone) {
		this.merchantphone = merchantphone;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantbigclass() {
     
		return merchantbigclass;
	    }
        
	    public void setMerchantbigclass(String merchantbigclass) {
		this.merchantbigclass = merchantbigclass;
	    }
       

	    /**
		*
		*/
		
        public String getJobwarnhour() {
     
		return jobwarnhour;
	    }
        
	    public void setJobwarnhour(String jobwarnhour) {
		this.jobwarnhour = jobwarnhour;
	    }
       

	    /**
		*
		*/
		
        public int getMerchantfrom() {
     
		return merchantfrom;
	    }
        
	    public void setMerchantfrom(int merchantfrom) {
		this.merchantfrom = merchantfrom;
	    }
       
      /*  public static aihao_dao convert(jobtable_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setJobid(_dao.getJobid());
        
        temp.setJobcdate(_dao.getJobcdate());
        
        temp.setMerchantid(_dao.getMerchantid());
        
        temp.setJobcreatemobile(_dao.getJobcreatemobile());
        
        temp.setJobcreateuserid(_dao.getJobcreateuserid());
        
        temp.setJobusedtime(_dao.getJobusedtime());
        
        temp.setJobinvitetype(_dao.getJobinvitetype());
        
        temp.setMobilelist(_dao.getMobilelist());
        
        temp.setJobwarn(_dao.getJobwarn());
        
        temp.setMerchantname(_dao.getMerchantname());
        
        temp.setMerchantlat(_dao.getMerchantlat());
        
        temp.setMerchantlng(_dao.getMerchantlng());
        
        temp.setMerchantbaidulat(_dao.getMerchantbaidulat());
        
        temp.setMerchantbaidulng(_dao.getMerchantbaidulng());
        
        temp.setMerchantaddress(_dao.getMerchantaddress());
        
        temp.setMerchantphone(_dao.getMerchantphone());
        
        temp.setMerchantbigclass(_dao.getMerchantbigclass());
        
        temp.setJobwarnhour(_dao.getJobwarnhour());
        
        temp.setMerchantfrom(_dao.getMerchantfrom());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

