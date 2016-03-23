/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： twitteruserEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TWITTERUSER数据实体
    *@作者：宋春林 
    */

	public class twitteruser_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int userid;
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
		private String nickname;
        /**
	     * 
	     */
		private String email;
        /**
	     * 
	     */
		private int sex;
        /**
	     * 
	     */
		private String location;
        /**
	     * 
	     */
		private String web;
        /**
	     * 
	     */
		private String birthday;
        /**
	     * 
	     */
		private String notes;
        /**
	     * 
	     */
		private String pichead;
        /**
	     * 
	     */
		private Date lasttime;
        /**
	     * 
	     */
		private String lastip;
        /**
	     * 
	     */
		private int state;
        /**
	     * 
	     */
		private Date regtime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getUserid() {
     
		return userid;
	    }
        
	    public void setUserid(int userid) {
		this.userid = userid;
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
		
        public String getNickname() {
     
		return nickname;
	    }
        
	    public void setNickname(String nickname) {
		this.nickname = nickname;
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
		
        public int getSex() {
     
		return sex;
	    }
        
	    public void setSex(int sex) {
		this.sex = sex;
	    }
       

	    /**
		*
		*/
		
        public String getLocation() {
     
		return location;
	    }
        
	    public void setLocation(String location) {
		this.location = location;
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
		
        public String getBirthday() {
     
		return birthday;
	    }
        
	    public void setBirthday(String birthday) {
		this.birthday = birthday;
	    }
       

	    /**
		*
		*/
		
        public String getNotes() {
     
		return notes;
	    }
        
	    public void setNotes(String notes) {
		this.notes = notes;
	    }
       

	    /**
		*
		*/
		
        public String getPichead() {
     
		return pichead;
	    }
        
	    public void setPichead(String pichead) {
		this.pichead = pichead;
	    }
       

	    /**
		*
		*/
		
        public Date getLasttime() {
     
		return lasttime;
	    }
        
	    public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	    }
       

	    /**
		*
		*/
		
        public String getLastip() {
     
		return lastip;
	    }
        
	    public void setLastip(String lastip) {
		this.lastip = lastip;
	    }
       

	    /**
		*
		*/
		
        public int getState() {
     
		return state;
	    }
        
	    public void setState(int state) {
		this.state = state;
	    }
       

	    /**
		*
		*/
		
        public Date getRegtime() {
     
		return regtime;
	    }
        
	    public void setRegtime(Date regtime) {
		this.regtime = regtime;
	    }
       
      /*  public static aihao_dao convert(twitteruser_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setUserid(_dao.getUserid());
        
        temp.setUsername(_dao.getUsername());
        
        temp.setPassword(_dao.getPassword());
        
        temp.setNickname(_dao.getNickname());
        
        temp.setEmail(_dao.getEmail());
        
        temp.setSex(_dao.getSex());
        
        temp.setLocation(_dao.getLocation());
        
        temp.setWeb(_dao.getWeb());
        
        temp.setBirthday(_dao.getBirthday());
        
        temp.setNotes(_dao.getNotes());
        
        temp.setPichead(_dao.getPichead());
        
        temp.setLasttime(_dao.getLasttime());
        
        temp.setLastip(_dao.getLastip());
        
        temp.setState(_dao.getState());
        
        temp.setRegtime(_dao.getRegtime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

