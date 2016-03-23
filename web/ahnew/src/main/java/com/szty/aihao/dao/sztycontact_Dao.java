/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztycontactEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYCONTACT数据实体
    *@作者：宋春林 
    */

	public class sztycontact_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private long id;
        /**
	     * ???
	     */
		private String mobile;
        /**
	     * ??????
	     */
		private String contactmobile;
        /**
	     * ???
	     */
		private String username;
        /**
	     * ?
	     */
		private String familyname;
        /**
	     * ?
	     */
		private String name;
        /**
	     * ??(0:??1:?)
	     */
		private int gender;
        /**
	     * ??
	     */
		private String alias;
        /**
	     * ??
	     */
		private String signature;
        /**
	     * ??
	     */
		private String avatar;
        /**
	     * ????
	     */
		private String fromring;
        /**
	     * ????
	     */
		private String toring;
        /**
	     * ????
	     */
		private String email;
        /**
	     * MSN
	     */
		private String msn;
        /**
	     * QQ
	     */
		private String qq;
        /**
	     * ????
	     */
		private String web;
        /**
	     * ????
	     */
		private String blog;
        /**
	     * ??
	     */
		private Date birthday;
        /**
	     * ??
	     */
		private String address;
        /**
	     * ????(??/??)
	     */
		private String unit;
        /**
	     * ??
	     */
		private String specially;
        /**
	     * ??
	     */
		private String remark;
        /**
	     * ????
	     */
		private Date createtime;
        /**
	     * ????
	     */
		private Date updatetime;
        /**
	     * ????(0:???1:??)
	     */
		private int isdelete;
        /**
	     * 
	     */
		private int groupid;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public long getId() {
     
		return id;
	    }
        
	    public void setId(long id) {
		this.id = id;
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
		*??????
		*/
		
        public String getContactmobile() {
     
		return contactmobile;
	    }
        
	    public void setContactmobile(String contactmobile) {
		this.contactmobile = contactmobile;
	    }
       

	    /**
		*???
		*/
		
        public String getUsername() {
     
		return username;
	    }
        
	    public void setUsername(String username) {
		this.username = username;
	    }
       

	    /**
		*?
		*/
		
        public String getFamilyname() {
     
		return familyname;
	    }
        
	    public void setFamilyname(String familyname) {
		this.familyname = familyname;
	    }
       

	    /**
		*?
		*/
		
        public String getName() {
     
		return name;
	    }
        
	    public void setName(String name) {
		this.name = name;
	    }
       

	    /**
		*??(0:??1:?)
		*/
		
        public int getGender() {
     
		return gender;
	    }
        
	    public void setGender(int gender) {
		this.gender = gender;
	    }
       

	    /**
		*??
		*/
		
        public String getAlias() {
     
		return alias;
	    }
        
	    public void setAlias(String alias) {
		this.alias = alias;
	    }
       

	    /**
		*??
		*/
		
        public String getSignature() {
     
		return signature;
	    }
        
	    public void setSignature(String signature) {
		this.signature = signature;
	    }
       

	    /**
		*??
		*/
		
        public String getAvatar() {
     
		return avatar;
	    }
        
	    public void setAvatar(String avatar) {
		this.avatar = avatar;
	    }
       

	    /**
		*????
		*/
		
        public String getFromring() {
     
		return fromring;
	    }
        
	    public void setFromring(String fromring) {
		this.fromring = fromring;
	    }
       

	    /**
		*????
		*/
		
        public String getToring() {
     
		return toring;
	    }
        
	    public void setToring(String toring) {
		this.toring = toring;
	    }
       

	    /**
		*????
		*/
		
        public String getEmail() {
     
		return email;
	    }
        
	    public void setEmail(String email) {
		this.email = email;
	    }
       

	    /**
		*MSN
		*/
		
        public String getMsn() {
     
		return msn;
	    }
        
	    public void setMsn(String msn) {
		this.msn = msn;
	    }
       

	    /**
		*QQ
		*/
		
        public String getQq() {
     
		return qq;
	    }
        
	    public void setQq(String qq) {
		this.qq = qq;
	    }
       

	    /**
		*????
		*/
		
        public String getWeb() {
     
		return web;
	    }
        
	    public void setWeb(String web) {
		this.web = web;
	    }
       

	    /**
		*????
		*/
		
        public String getBlog() {
     
		return blog;
	    }
        
	    public void setBlog(String blog) {
		this.blog = blog;
	    }
       

	    /**
		*??
		*/
		
        public Date getBirthday() {
     
		return birthday;
	    }
        
	    public void setBirthday(Date birthday) {
		this.birthday = birthday;
	    }
       

	    /**
		*??
		*/
		
        public String getAddress() {
     
		return address;
	    }
        
	    public void setAddress(String address) {
		this.address = address;
	    }
       

	    /**
		*????(??/??)
		*/
		
        public String getUnit() {
     
		return unit;
	    }
        
	    public void setUnit(String unit) {
		this.unit = unit;
	    }
       

	    /**
		*??
		*/
		
        public String getSpecially() {
     
		return specially;
	    }
        
	    public void setSpecially(String specially) {
		this.specially = specially;
	    }
       

	    /**
		*??
		*/
		
        public String getRemark() {
     
		return remark;
	    }
        
	    public void setRemark(String remark) {
		this.remark = remark;
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
		
        public Date getUpdatetime() {
     
		return updatetime;
	    }
        
	    public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	    }
       

	    /**
		*????(0:???1:??)
		*/
		
        public int getIsdelete() {
     
		return isdelete;
	    }
        
	    public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	    }
       

	    /**
		*
		*/
		
        public int getGroupid() {
     
		return groupid;
	    }
        
	    public void setGroupid(int groupid) {
		this.groupid = groupid;
	    }
       
      /*  public static aihao_dao convert(sztycontact_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setContactmobile(_dao.getContactmobile());
        
        temp.setUsername(_dao.getUsername());
        
        temp.setFamilyname(_dao.getFamilyname());
        
        temp.setName(_dao.getName());
        
        temp.setGender(_dao.getGender());
        
        temp.setAlias(_dao.getAlias());
        
        temp.setSignature(_dao.getSignature());
        
        temp.setAvatar(_dao.getAvatar());
        
        temp.setFromring(_dao.getFromring());
        
        temp.setToring(_dao.getToring());
        
        temp.setEmail(_dao.getEmail());
        
        temp.setMsn(_dao.getMsn());
        
        temp.setQq(_dao.getQq());
        
        temp.setWeb(_dao.getWeb());
        
        temp.setBlog(_dao.getBlog());
        
        temp.setBirthday(_dao.getBirthday());
        
        temp.setAddress(_dao.getAddress());
        
        temp.setUnit(_dao.getUnit());
        
        temp.setSpecially(_dao.getSpecially());
        
        temp.setRemark(_dao.getRemark());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        temp.setUpdatetime(_dao.getUpdatetime());
        
        temp.setIsdelete(_dao.getIsdelete());
        
        temp.setGroupid(_dao.getGroupid());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

