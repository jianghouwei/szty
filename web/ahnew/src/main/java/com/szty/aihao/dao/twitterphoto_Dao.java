/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： twitterphotoEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TWITTERPHOTO数据实体
    *@作者：宋春林 
    */

	public class twitterphoto_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int photoid;
        /**
	     * 
	     */
		private int userid;
        /**
	     * 
	     */
		private String photoname;
        /**
	     * 
	     */
		private String notes;
        /**
	     * 
	     */
		private String fileimg;
        /**
	     * 
	     */
		private int state;
        /**
	     * 
	     */
		private Date phototime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getPhotoid() {
     
		return photoid;
	    }
        
	    public void setPhotoid(int photoid) {
		this.photoid = photoid;
	    }
       

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
		
        public String getPhotoname() {
     
		return photoname;
	    }
        
	    public void setPhotoname(String photoname) {
		this.photoname = photoname;
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
		
        public String getFileimg() {
     
		return fileimg;
	    }
        
	    public void setFileimg(String fileimg) {
		this.fileimg = fileimg;
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
		
        public Date getPhototime() {
     
		return phototime;
	    }
        
	    public void setPhototime(Date phototime) {
		this.phototime = phototime;
	    }
       
      /*  public static aihao_dao convert(twitterphoto_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPhotoid(_dao.getPhotoid());
        
        temp.setUserid(_dao.getUserid());
        
        temp.setPhotoname(_dao.getPhotoname());
        
        temp.setNotes(_dao.getNotes());
        
        temp.setFileimg(_dao.getFileimg());
        
        temp.setState(_dao.getState());
        
        temp.setPhototime(_dao.getPhototime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

