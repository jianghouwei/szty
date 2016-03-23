/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforummemberEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMMEMBER数据实体
    *@作者：宋春林 
    */

	public class mvnforummember_Dao implements Serializable
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
		private String membername;
        /**
	     * 
	     */
		private String memberpassword;
        /**
	     * 
	     */
		private String memberfirstemail;
        /**
	     * 
	     */
		private String memberemail;
        /**
	     * 
	     */
		private int memberemailvisible;
        /**
	     * 
	     */
		private int membernamevisible;
        /**
	     * 
	     */
		private String memberfirstip;
        /**
	     * 
	     */
		private String memberlastip;
        /**
	     * 
	     */
		private int memberviewcount;
        /**
	     * 
	     */
		private int memberpostcount;
        /**
	     * 
	     */
		private Date membercreationdate;
        /**
	     * 
	     */
		private Date membermodifieddate;
        /**
	     * 
	     */
		private Date memberexpiredate;
        /**
	     * 
	     */
		private Date memberpasswordexpiredate;
        /**
	     * 
	     */
		private Date memberlastlogon;
        /**
	     * 
	     */
		private int memberoption;
        /**
	     * 
	     */
		private int memberstatus;
        /**
	     * 
	     */
		private String memberactivatecode;
        /**
	     * 
	     */
		private String membertemppassword;
        /**
	     * 
	     */
		private int membermessagecount;
        /**
	     * 
	     */
		private int membermessageoption;
        /**
	     * 
	     */
		private int memberpostsperpage;
        /**
	     * 
	     */
		private int memberwarncount;
        /**
	     * 
	     */
		private int membervotecount;
        /**
	     * 
	     */
		private int membervotetotalstars;
        /**
	     * 
	     */
		private int memberrewardpoints;
        /**
	     * 
	     */
		private String membertitle;
        /**
	     * 
	     */
		private double membertimezone;
        /**
	     * 
	     */
		private String membersignature;
        /**
	     * 
	     */
		private String memberavatar;
        /**
	     * 
	     */
		private String memberskin;
        /**
	     * 
	     */
		private String memberlanguage;
        /**
	     * 
	     */
		private String memberfirstname;
        /**
	     * 
	     */
		private String memberlastname;
        /**
	     * 
	     */
		private int membergender;
        /**
	     * 
	     */
		private Date memberbirthday;
        /**
	     * 
	     */
		private String memberaddress;
        /**
	     * 
	     */
		private String membercity;
        /**
	     * 
	     */
		private String memberstate;
        /**
	     * 
	     */
		private String membercountry;
        /**
	     * 
	     */
		private String memberphone;
        /**
	     * 
	     */
		private String membermobile;
        /**
	     * 
	     */
		private String memberfax;
        /**
	     * 
	     */
		private String membercareer;
        /**
	     * 
	     */
		private String memberhomepage;
        /**
	     * 
	     */
		private String memberyahoo;
        /**
	     * 
	     */
		private String memberaol;
        /**
	     * 
	     */
		private String membericq;
        /**
	     * 
	     */
		private String membermsn;
        /**
	     * 
	     */
		private String membercoollink1;
        /**
	     * 
	     */
		private String membercoollink2;
        
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
		
        public String getMembername() {
     
		return membername;
	    }
        
	    public void setMembername(String membername) {
		this.membername = membername;
	    }
       

	    /**
		*
		*/
		
        public String getMemberpassword() {
     
		return memberpassword;
	    }
        
	    public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	    }
       

	    /**
		*
		*/
		
        public String getMemberfirstemail() {
     
		return memberfirstemail;
	    }
        
	    public void setMemberfirstemail(String memberfirstemail) {
		this.memberfirstemail = memberfirstemail;
	    }
       

	    /**
		*
		*/
		
        public String getMemberemail() {
     
		return memberemail;
	    }
        
	    public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	    }
       

	    /**
		*
		*/
		
        public int getMemberemailvisible() {
     
		return memberemailvisible;
	    }
        
	    public void setMemberemailvisible(int memberemailvisible) {
		this.memberemailvisible = memberemailvisible;
	    }
       

	    /**
		*
		*/
		
        public int getMembernamevisible() {
     
		return membernamevisible;
	    }
        
	    public void setMembernamevisible(int membernamevisible) {
		this.membernamevisible = membernamevisible;
	    }
       

	    /**
		*
		*/
		
        public String getMemberfirstip() {
     
		return memberfirstip;
	    }
        
	    public void setMemberfirstip(String memberfirstip) {
		this.memberfirstip = memberfirstip;
	    }
       

	    /**
		*
		*/
		
        public String getMemberlastip() {
     
		return memberlastip;
	    }
        
	    public void setMemberlastip(String memberlastip) {
		this.memberlastip = memberlastip;
	    }
       

	    /**
		*
		*/
		
        public int getMemberviewcount() {
     
		return memberviewcount;
	    }
        
	    public void setMemberviewcount(int memberviewcount) {
		this.memberviewcount = memberviewcount;
	    }
       

	    /**
		*
		*/
		
        public int getMemberpostcount() {
     
		return memberpostcount;
	    }
        
	    public void setMemberpostcount(int memberpostcount) {
		this.memberpostcount = memberpostcount;
	    }
       

	    /**
		*
		*/
		
        public Date getMembercreationdate() {
     
		return membercreationdate;
	    }
        
	    public void setMembercreationdate(Date membercreationdate) {
		this.membercreationdate = membercreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getMembermodifieddate() {
     
		return membermodifieddate;
	    }
        
	    public void setMembermodifieddate(Date membermodifieddate) {
		this.membermodifieddate = membermodifieddate;
	    }
       

	    /**
		*
		*/
		
        public Date getMemberexpiredate() {
     
		return memberexpiredate;
	    }
        
	    public void setMemberexpiredate(Date memberexpiredate) {
		this.memberexpiredate = memberexpiredate;
	    }
       

	    /**
		*
		*/
		
        public Date getMemberpasswordexpiredate() {
     
		return memberpasswordexpiredate;
	    }
        
	    public void setMemberpasswordexpiredate(Date memberpasswordexpiredate) {
		this.memberpasswordexpiredate = memberpasswordexpiredate;
	    }
       

	    /**
		*
		*/
		
        public Date getMemberlastlogon() {
     
		return memberlastlogon;
	    }
        
	    public void setMemberlastlogon(Date memberlastlogon) {
		this.memberlastlogon = memberlastlogon;
	    }
       

	    /**
		*
		*/
		
        public int getMemberoption() {
     
		return memberoption;
	    }
        
	    public void setMemberoption(int memberoption) {
		this.memberoption = memberoption;
	    }
       

	    /**
		*
		*/
		
        public int getMemberstatus() {
     
		return memberstatus;
	    }
        
	    public void setMemberstatus(int memberstatus) {
		this.memberstatus = memberstatus;
	    }
       

	    /**
		*
		*/
		
        public String getMemberactivatecode() {
     
		return memberactivatecode;
	    }
        
	    public void setMemberactivatecode(String memberactivatecode) {
		this.memberactivatecode = memberactivatecode;
	    }
       

	    /**
		*
		*/
		
        public String getMembertemppassword() {
     
		return membertemppassword;
	    }
        
	    public void setMembertemppassword(String membertemppassword) {
		this.membertemppassword = membertemppassword;
	    }
       

	    /**
		*
		*/
		
        public int getMembermessagecount() {
     
		return membermessagecount;
	    }
        
	    public void setMembermessagecount(int membermessagecount) {
		this.membermessagecount = membermessagecount;
	    }
       

	    /**
		*
		*/
		
        public int getMembermessageoption() {
     
		return membermessageoption;
	    }
        
	    public void setMembermessageoption(int membermessageoption) {
		this.membermessageoption = membermessageoption;
	    }
       

	    /**
		*
		*/
		
        public int getMemberpostsperpage() {
     
		return memberpostsperpage;
	    }
        
	    public void setMemberpostsperpage(int memberpostsperpage) {
		this.memberpostsperpage = memberpostsperpage;
	    }
       

	    /**
		*
		*/
		
        public int getMemberwarncount() {
     
		return memberwarncount;
	    }
        
	    public void setMemberwarncount(int memberwarncount) {
		this.memberwarncount = memberwarncount;
	    }
       

	    /**
		*
		*/
		
        public int getMembervotecount() {
     
		return membervotecount;
	    }
        
	    public void setMembervotecount(int membervotecount) {
		this.membervotecount = membervotecount;
	    }
       

	    /**
		*
		*/
		
        public int getMembervotetotalstars() {
     
		return membervotetotalstars;
	    }
        
	    public void setMembervotetotalstars(int membervotetotalstars) {
		this.membervotetotalstars = membervotetotalstars;
	    }
       

	    /**
		*
		*/
		
        public int getMemberrewardpoints() {
     
		return memberrewardpoints;
	    }
        
	    public void setMemberrewardpoints(int memberrewardpoints) {
		this.memberrewardpoints = memberrewardpoints;
	    }
       

	    /**
		*
		*/
		
        public String getMembertitle() {
     
		return membertitle;
	    }
        
	    public void setMembertitle(String membertitle) {
		this.membertitle = membertitle;
	    }
       

	    /**
		*
		*/
		
        public double getMembertimezone() {
     
		return membertimezone;
	    }
        
	    public void setMembertimezone(double membertimezone) {
		this.membertimezone = membertimezone;
	    }
       

	    /**
		*
		*/
		
        public String getMembersignature() {
     
		return membersignature;
	    }
        
	    public void setMembersignature(String membersignature) {
		this.membersignature = membersignature;
	    }
       

	    /**
		*
		*/
		
        public String getMemberavatar() {
     
		return memberavatar;
	    }
        
	    public void setMemberavatar(String memberavatar) {
		this.memberavatar = memberavatar;
	    }
       

	    /**
		*
		*/
		
        public String getMemberskin() {
     
		return memberskin;
	    }
        
	    public void setMemberskin(String memberskin) {
		this.memberskin = memberskin;
	    }
       

	    /**
		*
		*/
		
        public String getMemberlanguage() {
     
		return memberlanguage;
	    }
        
	    public void setMemberlanguage(String memberlanguage) {
		this.memberlanguage = memberlanguage;
	    }
       

	    /**
		*
		*/
		
        public String getMemberfirstname() {
     
		return memberfirstname;
	    }
        
	    public void setMemberfirstname(String memberfirstname) {
		this.memberfirstname = memberfirstname;
	    }
       

	    /**
		*
		*/
		
        public String getMemberlastname() {
     
		return memberlastname;
	    }
        
	    public void setMemberlastname(String memberlastname) {
		this.memberlastname = memberlastname;
	    }
       

	    /**
		*
		*/
		
        public int getMembergender() {
     
		return membergender;
	    }
        
	    public void setMembergender(int membergender) {
		this.membergender = membergender;
	    }
       

	    /**
		*
		*/
		
        public Date getMemberbirthday() {
     
		return memberbirthday;
	    }
        
	    public void setMemberbirthday(Date memberbirthday) {
		this.memberbirthday = memberbirthday;
	    }
       

	    /**
		*
		*/
		
        public String getMemberaddress() {
     
		return memberaddress;
	    }
        
	    public void setMemberaddress(String memberaddress) {
		this.memberaddress = memberaddress;
	    }
       

	    /**
		*
		*/
		
        public String getMembercity() {
     
		return membercity;
	    }
        
	    public void setMembercity(String membercity) {
		this.membercity = membercity;
	    }
       

	    /**
		*
		*/
		
        public String getMemberstate() {
     
		return memberstate;
	    }
        
	    public void setMemberstate(String memberstate) {
		this.memberstate = memberstate;
	    }
       

	    /**
		*
		*/
		
        public String getMembercountry() {
     
		return membercountry;
	    }
        
	    public void setMembercountry(String membercountry) {
		this.membercountry = membercountry;
	    }
       

	    /**
		*
		*/
		
        public String getMemberphone() {
     
		return memberphone;
	    }
        
	    public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	    }
       

	    /**
		*
		*/
		
        public String getMembermobile() {
     
		return membermobile;
	    }
        
	    public void setMembermobile(String membermobile) {
		this.membermobile = membermobile;
	    }
       

	    /**
		*
		*/
		
        public String getMemberfax() {
     
		return memberfax;
	    }
        
	    public void setMemberfax(String memberfax) {
		this.memberfax = memberfax;
	    }
       

	    /**
		*
		*/
		
        public String getMembercareer() {
     
		return membercareer;
	    }
        
	    public void setMembercareer(String membercareer) {
		this.membercareer = membercareer;
	    }
       

	    /**
		*
		*/
		
        public String getMemberhomepage() {
     
		return memberhomepage;
	    }
        
	    public void setMemberhomepage(String memberhomepage) {
		this.memberhomepage = memberhomepage;
	    }
       

	    /**
		*
		*/
		
        public String getMemberyahoo() {
     
		return memberyahoo;
	    }
        
	    public void setMemberyahoo(String memberyahoo) {
		this.memberyahoo = memberyahoo;
	    }
       

	    /**
		*
		*/
		
        public String getMemberaol() {
     
		return memberaol;
	    }
        
	    public void setMemberaol(String memberaol) {
		this.memberaol = memberaol;
	    }
       

	    /**
		*
		*/
		
        public String getMembericq() {
     
		return membericq;
	    }
        
	    public void setMembericq(String membericq) {
		this.membericq = membericq;
	    }
       

	    /**
		*
		*/
		
        public String getMembermsn() {
     
		return membermsn;
	    }
        
	    public void setMembermsn(String membermsn) {
		this.membermsn = membermsn;
	    }
       

	    /**
		*
		*/
		
        public String getMembercoollink1() {
     
		return membercoollink1;
	    }
        
	    public void setMembercoollink1(String membercoollink1) {
		this.membercoollink1 = membercoollink1;
	    }
       

	    /**
		*
		*/
		
        public String getMembercoollink2() {
     
		return membercoollink2;
	    }
        
	    public void setMembercoollink2(String membercoollink2) {
		this.membercoollink2 = membercoollink2;
	    }
       
      /*  public static aihao_dao convert(mvnforummember_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMemberid(_dao.getMemberid());
        
        temp.setMembername(_dao.getMembername());
        
        temp.setMemberpassword(_dao.getMemberpassword());
        
        temp.setMemberfirstemail(_dao.getMemberfirstemail());
        
        temp.setMemberemail(_dao.getMemberemail());
        
        temp.setMemberemailvisible(_dao.getMemberemailvisible());
        
        temp.setMembernamevisible(_dao.getMembernamevisible());
        
        temp.setMemberfirstip(_dao.getMemberfirstip());
        
        temp.setMemberlastip(_dao.getMemberlastip());
        
        temp.setMemberviewcount(_dao.getMemberviewcount());
        
        temp.setMemberpostcount(_dao.getMemberpostcount());
        
        temp.setMembercreationdate(_dao.getMembercreationdate());
        
        temp.setMembermodifieddate(_dao.getMembermodifieddate());
        
        temp.setMemberexpiredate(_dao.getMemberexpiredate());
        
        temp.setMemberpasswordexpiredate(_dao.getMemberpasswordexpiredate());
        
        temp.setMemberlastlogon(_dao.getMemberlastlogon());
        
        temp.setMemberoption(_dao.getMemberoption());
        
        temp.setMemberstatus(_dao.getMemberstatus());
        
        temp.setMemberactivatecode(_dao.getMemberactivatecode());
        
        temp.setMembertemppassword(_dao.getMembertemppassword());
        
        temp.setMembermessagecount(_dao.getMembermessagecount());
        
        temp.setMembermessageoption(_dao.getMembermessageoption());
        
        temp.setMemberpostsperpage(_dao.getMemberpostsperpage());
        
        temp.setMemberwarncount(_dao.getMemberwarncount());
        
        temp.setMembervotecount(_dao.getMembervotecount());
        
        temp.setMembervotetotalstars(_dao.getMembervotetotalstars());
        
        temp.setMemberrewardpoints(_dao.getMemberrewardpoints());
        
        temp.setMembertitle(_dao.getMembertitle());
        
        temp.setMembertimezone(_dao.getMembertimezone());
        
        temp.setMembersignature(_dao.getMembersignature());
        
        temp.setMemberavatar(_dao.getMemberavatar());
        
        temp.setMemberskin(_dao.getMemberskin());
        
        temp.setMemberlanguage(_dao.getMemberlanguage());
        
        temp.setMemberfirstname(_dao.getMemberfirstname());
        
        temp.setMemberlastname(_dao.getMemberlastname());
        
        temp.setMembergender(_dao.getMembergender());
        
        temp.setMemberbirthday(_dao.getMemberbirthday());
        
        temp.setMemberaddress(_dao.getMemberaddress());
        
        temp.setMembercity(_dao.getMembercity());
        
        temp.setMemberstate(_dao.getMemberstate());
        
        temp.setMembercountry(_dao.getMembercountry());
        
        temp.setMemberphone(_dao.getMemberphone());
        
        temp.setMembermobile(_dao.getMembermobile());
        
        temp.setMemberfax(_dao.getMemberfax());
        
        temp.setMembercareer(_dao.getMembercareer());
        
        temp.setMemberhomepage(_dao.getMemberhomepage());
        
        temp.setMemberyahoo(_dao.getMemberyahoo());
        
        temp.setMemberaol(_dao.getMemberaol());
        
        temp.setMembericq(_dao.getMembericq());
        
        temp.setMembermsn(_dao.getMembermsn());
        
        temp.setMembercoollink1(_dao.getMembercoollink1());
        
        temp.setMembercoollink2(_dao.getMembercoollink2());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

