/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： clientupdateEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@CLIENTUPDATE数据实体
    *@作者：宋春林 
    */

	public class clientupdate_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int updateid;
        /**
	     * 
	     */
		private String os;
        /**
	     * 
	     */
		private String jixing;
        /**
	     * 
	     */
		private String introduction;
        /**
	     * 
	     */
		private String ver;
        /**
	     * 
	     */
		private String url;
        /**
	     * 
	     */
		private int isstrong;
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
		private int status;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getUpdateid() {
     
		return updateid;
	    }
        
	    public void setUpdateid(int updateid) {
		this.updateid = updateid;
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
		
        public String getJixing() {
     
		return jixing;
	    }
        
	    public void setJixing(String jixing) {
		this.jixing = jixing;
	    }
       

	    /**
		*
		*/
		
        public String getIntroduction() {
     
		return introduction;
	    }
        
	    public void setIntroduction(String introduction) {
		this.introduction = introduction;
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
		
        public String getUrl() {
     
		return url;
	    }
        
	    public void setUrl(String url) {
		this.url = url;
	    }
       

	    /**
		*
		*/
		
        public int getIsstrong() {
     
		return isstrong;
	    }
        
	    public void setIsstrong(int isstrong) {
		this.isstrong = isstrong;
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
		
        public int getStatus() {
     
		return status;
	    }
        
	    public void setStatus(int status) {
		this.status = status;
	    }
       
      /*  public static aihao_dao convert(clientupdate_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setUpdateid(_dao.getUpdateid());
        
        temp.setOs(_dao.getOs());
        
        temp.setJixing(_dao.getJixing());
        
        temp.setIntroduction(_dao.getIntroduction());
        
        temp.setVer(_dao.getVer());
        
        temp.setUrl(_dao.getUrl());
        
        temp.setIsstrong(_dao.getIsstrong());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setUdate(_dao.getUdate());
        
        temp.setStatus(_dao.getStatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

