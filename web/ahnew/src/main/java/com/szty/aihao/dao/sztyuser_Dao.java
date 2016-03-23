/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztyuserEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYUSER数据实体
    *@作者：宋春林 
    */

	public class sztyuser_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private long id;
        /**
	     * 
	     */
		private String mobile;
        /**
	     * 
	     */
		private String username;
        /**
	     * 
	     */
		private String password;
        /**
	     * 
	     */
		private String familyname;
        /**
	     * 
	     */
		private String name;
        /**
	     * 
	     */
		private int gender;
        /**
	     * 
	     */
		private String alias;
        /**
	     * 
	     */
		private String signature;
        /**
	     * 
	     */
		private String avatar;
        /**
	     * 
	     */
		private String email;
        /**
	     * 
	     */
		private String msn;
        /**
	     * 
	     */
		private String qq;
        /**
	     * 
	     */
		private String web;
        /**
	     * 
	     */
		private String blog;
        /**
	     * 
	     */
		private Date birthday;
        /**
	     * 
	     */
		private String address;
        /**
	     * 
	     */
		private String unit;
        /**
	     * 
	     */
		private String specially;
        /**
	     * 
	     */
		private String remark;
        /**
	     * 
	     */
		private Date createtime;
        /**
	     * 
	     */
		private Date updatetime;
        /**
	     * 
	     */
		private int isdelete;
        /**
	     * 
	     */
		private int platform;
        /**
	     * 
	     */
		private String productcode;
        /**
	     * 
	     */
		private String channelno;
        /**
	     * 
	     */
		private String version;
        /**
	     * 
	     */
		private String imsi;
        
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
		
        public String getUsername() {
     
		return username;
	    }
        
	    public void setUsername(String username) {
		this.username = username;
	    }
       

	    /**
		*
		*/
		
        public String getPassword() {
     
		return password;
	    }
        
	    public void setPassword(String password) {
		this.password = password;
	    }
       

	    /**
		*
		*/
		
        public String getFamilyname() {
     
		return familyname;
	    }
        
	    public void setFamilyname(String familyname) {
		this.familyname = familyname;
	    }
       

	    /**
		*
		*/
		
        public String getName() {
     
		return name;
	    }
        
	    public void setName(String name) {
		this.name = name;
	    }
       

	    /**
		*
		*/
		
        public int getGender() {
     
		return gender;
	    }
        
	    public void setGender(int gender) {
		this.gender = gender;
	    }
       

	    /**
		*
		*/
		
        public String getAlias() {
     
		return alias;
	    }
        
	    public void setAlias(String alias) {
		this.alias = alias;
	    }
       

	    /**
		*
		*/
		
        public String getSignature() {
     
		return signature;
	    }
        
	    public void setSignature(String signature) {
		this.signature = signature;
	    }
       

	    /**
		*
		*/
		
        public String getAvatar() {
     
		return avatar;
	    }
        
	    public void setAvatar(String avatar) {
		this.avatar = avatar;
	    }
       

	    /**
		*
		*/
		
        public String getEmail() {
     
		return email;
	    }
        
	    public void setEmail(String email) {
		this.email = email;
	    }
       

	    /**
		*
		*/
		
        public String getMsn() {
     
		return msn;
	    }
        
	    public void setMsn(String msn) {
		this.msn = msn;
	    }
       

	    /**
		*
		*/
		
        public String getQq() {
     
		return qq;
	    }
        
	    public void setQq(String qq) {
		this.qq = qq;
	    }
       

	    /**
		*
		*/
		
        public String getWeb() {
     
		return web;
	    }
        
	    public void setWeb(String web) {
		this.web = web;
	    }
       

	    /**
		*
		*/
		
        public String getBlog() {
     
		return blog;
	    }
        
	    public void setBlog(String blog) {
		this.blog = blog;
	    }
       

	    /**
		*
		*/
		
        public Date getBirthday() {
     
		return birthday;
	    }
        
	    public void setBirthday(Date birthday) {
		this.birthday = birthday;
	    }
       

	    /**
		*
		*/
		
        public String getAddress() {
     
		return address;
	    }
        
	    public void setAddress(String address) {
		this.address = address;
	    }
       

	    /**
		*
		*/
		
        public String getUnit() {
     
		return unit;
	    }
        
	    public void setUnit(String unit) {
		this.unit = unit;
	    }
       

	    /**
		*
		*/
		
        public String getSpecially() {
     
		return specially;
	    }
        
	    public void setSpecially(String specially) {
		this.specially = specially;
	    }
       

	    /**
		*
		*/
		
        public String getRemark() {
     
		return remark;
	    }
        
	    public void setRemark(String remark) {
		this.remark = remark;
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
       

	    /**
		*
		*/
		
        public Date getUpdatetime() {
     
		return updatetime;
	    }
        
	    public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	    }
       

	    /**
		*
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
		
        public int getPlatform() {
     
		return platform;
	    }
        
	    public void setPlatform(int platform) {
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
		
        public String getChannelno() {
     
		return channelno;
	    }
        
	    public void setChannelno(String channelno) {
		this.channelno = channelno;
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
		
        public String getImsi() {
     
		return imsi;
	    }
        
	    public void setImsi(String imsi) {
		this.imsi = imsi;
	    }
       
      /*  public static aihao_dao convert(sztyuser_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setUsername(_dao.getUsername());
        
        temp.setPassword(_dao.getPassword());
        
        temp.setFamilyname(_dao.getFamilyname());
        
        temp.setName(_dao.getName());
        
        temp.setGender(_dao.getGender());
        
        temp.setAlias(_dao.getAlias());
        
        temp.setSignature(_dao.getSignature());
        
        temp.setAvatar(_dao.getAvatar());
        
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
        
        temp.setPlatform(_dao.getPlatform());
        
        temp.setProductcode(_dao.getProductcode());
        
        temp.setChannelno(_dao.getChannelno());
        
        temp.setVersion(_dao.getVersion());
        
        temp.setImsi(_dao.getImsi());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

