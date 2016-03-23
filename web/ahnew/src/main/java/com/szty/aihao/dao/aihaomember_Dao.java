/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaomemberEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOMEMBER数据实体
    *@作者：宋春林 
    */

	public class aihaomember_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int memberid;
        /**
	     * 
	     */
		private String uniquevalue;
        /**
	     * 
	     */
		private String imei;
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
		private String mobile;
        /**
	     * 
	     */
		private String mobilebrand;
        /**
	     * 
	     */
		private String mobilemodels;
        /**
	     * 
	     */
		private String os;
        /**
	     * 
	     */
		private String bindsinaaccount;
        /**
	     * 
	     */
		private String bindqqspaceaccount;
        /**
	     * 
	     */
		private String bindweixinaccount;
        /**
	     * 
	     */
		private String otheraccount;
        /**
	     * 
	     */
		private String membersetupprovince;
        /**
	     * 
	     */
		private String membersetupcity;
        /**
	     * 
	     */
		private Date membercreationtime;
        /**
	     * 
	     */
		private Date membermodifytime;
        /**
	     * 
	     */
		private int memberintegral;
        /**
	     * 
	     */
		private int memberlevel;
        /**
	     * 
	     */
		private int memberexp;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getMemberid() {
     
		return memberid;
	    }
        
	    public void setMemberid(int memberid) {
		this.memberid = memberid;
	    }
       

	    /**
		*
		*/
		
        public String getUniquevalue() {
     
		return uniquevalue;
	    }
        
	    public void setUniquevalue(String uniquevalue) {
		this.uniquevalue = uniquevalue;
	    }
       

	    /**
		*
		*/
		
        public String getImei() {
     
		return imei;
	    }
        
	    public void setImei(String imei) {
		this.imei = imei;
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
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       

	    /**
		*
		*/
		
        public String getMobilebrand() {
     
		return mobilebrand;
	    }
        
	    public void setMobilebrand(String mobilebrand) {
		this.mobilebrand = mobilebrand;
	    }
       

	    /**
		*
		*/
		
        public String getMobilemodels() {
     
		return mobilemodels;
	    }
        
	    public void setMobilemodels(String mobilemodels) {
		this.mobilemodels = mobilemodels;
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
		
        public String getBindsinaaccount() {
     
		return bindsinaaccount;
	    }
        
	    public void setBindsinaaccount(String bindsinaaccount) {
		this.bindsinaaccount = bindsinaaccount;
	    }
       

	    /**
		*
		*/
		
        public String getBindqqspaceaccount() {
     
		return bindqqspaceaccount;
	    }
        
	    public void setBindqqspaceaccount(String bindqqspaceaccount) {
		this.bindqqspaceaccount = bindqqspaceaccount;
	    }
       

	    /**
		*
		*/
		
        public String getBindweixinaccount() {
     
		return bindweixinaccount;
	    }
        
	    public void setBindweixinaccount(String bindweixinaccount) {
		this.bindweixinaccount = bindweixinaccount;
	    }
       

	    /**
		*
		*/
		
        public String getOtheraccount() {
     
		return otheraccount;
	    }
        
	    public void setOtheraccount(String otheraccount) {
		this.otheraccount = otheraccount;
	    }
       

	    /**
		*
		*/
		
        public String getMembersetupprovince() {
     
		return membersetupprovince;
	    }
        
	    public void setMembersetupprovince(String membersetupprovince) {
		this.membersetupprovince = membersetupprovince;
	    }
       

	    /**
		*
		*/
		
        public String getMembersetupcity() {
     
		return membersetupcity;
	    }
        
	    public void setMembersetupcity(String membersetupcity) {
		this.membersetupcity = membersetupcity;
	    }
       

	    /**
		*
		*/
		
        public Date getMembercreationtime() {
     
		return membercreationtime;
	    }
        
	    public void setMembercreationtime(Date membercreationtime) {
		this.membercreationtime = membercreationtime;
	    }
       

	    /**
		*
		*/
		
        public Date getMembermodifytime() {
     
		return membermodifytime;
	    }
        
	    public void setMembermodifytime(Date membermodifytime) {
		this.membermodifytime = membermodifytime;
	    }
       

	    /**
		*
		*/
		
        public int getMemberintegral() {
     
		return memberintegral;
	    }
        
	    public void setMemberintegral(int memberintegral) {
		this.memberintegral = memberintegral;
	    }
       

	    /**
		*
		*/
		
        public int getMemberlevel() {
     
		return memberlevel;
	    }
        
	    public void setMemberlevel(int memberlevel) {
		this.memberlevel = memberlevel;
	    }
       

	    /**
		*
		*/
		
        public int getMemberexp() {
     
		return memberexp;
	    }
        
	    public void setMemberexp(int memberexp) {
		this.memberexp = memberexp;
	    }
       
      /*  public static aihao_dao convert(aihaomember_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMemberid(_dao.getMemberid());
        
        temp.setUniquevalue(_dao.getUniquevalue());
        
        temp.setImei(_dao.getImei());
        
        temp.setProductid(_dao.getProductid());
        
        temp.setPcode(_dao.getPcode());
        
        temp.setChannel(_dao.getChannel());
        
        temp.setVer(_dao.getVer());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setMobilebrand(_dao.getMobilebrand());
        
        temp.setMobilemodels(_dao.getMobilemodels());
        
        temp.setOs(_dao.getOs());
        
        temp.setBindsinaaccount(_dao.getBindsinaaccount());
        
        temp.setBindqqspaceaccount(_dao.getBindqqspaceaccount());
        
        temp.setBindweixinaccount(_dao.getBindweixinaccount());
        
        temp.setOtheraccount(_dao.getOtheraccount());
        
        temp.setMembersetupprovince(_dao.getMembersetupprovince());
        
        temp.setMembersetupcity(_dao.getMembersetupcity());
        
        temp.setMembercreationtime(_dao.getMembercreationtime());
        
        temp.setMembermodifytime(_dao.getMembermodifytime());
        
        temp.setMemberintegral(_dao.getMemberintegral());
        
        temp.setMemberlevel(_dao.getMemberlevel());
        
        temp.setMemberexp(_dao.getMemberexp());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

