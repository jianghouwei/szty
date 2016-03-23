/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumwallpaperEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMWALLPAPER数据实体
    *@作者：宋春林 
    */

	public class mvnforumwallpaper_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int wallpaperid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private String wallpapername;
        /**
	     * 
	     */
		private int wallpapercategory;
        /**
	     * 
	     */
		private String wallpapersrcname;
        /**
	     * 
	     */
		private String folderpart;
        /**
	     * 
	     */
		private Date wallpapercreationdate;
        /**
	     * 
	     */
		private Date wallpapermodifieddate;
        /**
	     * 
	     */
		private String wallpaperownername;
        /**
	     * 
	     */
		private int wallpaperpreviewid;
        /**
	     * 
	     */
		private int supportclient;
        /**
	     * 
	     */
		private int wallpaperstatus;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getWallpaperid() {
     
		return wallpaperid;
	    }
        
	    public void setWallpaperid(int wallpaperid) {
		this.wallpaperid = wallpaperid;
	    }
       

	    /**
		*
		*/
		
        public int getForumid() {
     
		return forumid;
	    }
        
	    public void setForumid(int forumid) {
		this.forumid = forumid;
	    }
       

	    /**
		*
		*/
		
        public String getWallpapername() {
     
		return wallpapername;
	    }
        
	    public void setWallpapername(String wallpapername) {
		this.wallpapername = wallpapername;
	    }
       

	    /**
		*
		*/
		
        public int getWallpapercategory() {
     
		return wallpapercategory;
	    }
        
	    public void setWallpapercategory(int wallpapercategory) {
		this.wallpapercategory = wallpapercategory;
	    }
       

	    /**
		*
		*/
		
        public String getWallpapersrcname() {
     
		return wallpapersrcname;
	    }
        
	    public void setWallpapersrcname(String wallpapersrcname) {
		this.wallpapersrcname = wallpapersrcname;
	    }
       

	    /**
		*
		*/
		
        public String getFolderpart() {
     
		return folderpart;
	    }
        
	    public void setFolderpart(String folderpart) {
		this.folderpart = folderpart;
	    }
       

	    /**
		*
		*/
		
        public Date getWallpapercreationdate() {
     
		return wallpapercreationdate;
	    }
        
	    public void setWallpapercreationdate(Date wallpapercreationdate) {
		this.wallpapercreationdate = wallpapercreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getWallpapermodifieddate() {
     
		return wallpapermodifieddate;
	    }
        
	    public void setWallpapermodifieddate(Date wallpapermodifieddate) {
		this.wallpapermodifieddate = wallpapermodifieddate;
	    }
       

	    /**
		*
		*/
		
        public String getWallpaperownername() {
     
		return wallpaperownername;
	    }
        
	    public void setWallpaperownername(String wallpaperownername) {
		this.wallpaperownername = wallpaperownername;
	    }
       

	    /**
		*
		*/
		
        public int getWallpaperpreviewid() {
     
		return wallpaperpreviewid;
	    }
        
	    public void setWallpaperpreviewid(int wallpaperpreviewid) {
		this.wallpaperpreviewid = wallpaperpreviewid;
	    }
       

	    /**
		*
		*/
		
        public int getSupportclient() {
     
		return supportclient;
	    }
        
	    public void setSupportclient(int supportclient) {
		this.supportclient = supportclient;
	    }
       

	    /**
		*
		*/
		
        public int getWallpaperstatus() {
     
		return wallpaperstatus;
	    }
        
	    public void setWallpaperstatus(int wallpaperstatus) {
		this.wallpaperstatus = wallpaperstatus;
	    }
       

	    /**
		*
		*/
		
        public int getViewcount() {
     
		return viewcount;
	    }
        
	    public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	    }
       
      /*  public static aihao_dao convert(mvnforumwallpaper_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setWallpaperid(_dao.getWallpaperid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setWallpapername(_dao.getWallpapername());
        
        temp.setWallpapercategory(_dao.getWallpapercategory());
        
        temp.setWallpapersrcname(_dao.getWallpapersrcname());
        
        temp.setFolderpart(_dao.getFolderpart());
        
        temp.setWallpapercreationdate(_dao.getWallpapercreationdate());
        
        temp.setWallpapermodifieddate(_dao.getWallpapermodifieddate());
        
        temp.setWallpaperownername(_dao.getWallpaperownername());
        
        temp.setWallpaperpreviewid(_dao.getWallpaperpreviewid());
        
        temp.setSupportclient(_dao.getSupportclient());
        
        temp.setWallpaperstatus(_dao.getWallpaperstatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

