/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumwallpaperadapterEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMWALLPAPERADAPTER数据实体
    *@作者：宋春林 
    */

	public class mvnforumwallpaperadapter_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int adapterid;
        /**
	     * 
	     */
		private int wallpaperid;
        /**
	     * 
	     */
		private String adaptername;
        /**
	     * 
	     */
		private String wallpaperscreen;
        /**
	     * 
	     */
		private String wallpaperformat;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getAdapterid() {
     
		return adapterid;
	    }
        
	    public void setAdapterid(int adapterid) {
		this.adapterid = adapterid;
	    }
       

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
		
        public String getAdaptername() {
     
		return adaptername;
	    }
        
	    public void setAdaptername(String adaptername) {
		this.adaptername = adaptername;
	    }
       

	    /**
		*
		*/
		
        public String getWallpaperscreen() {
     
		return wallpaperscreen;
	    }
        
	    public void setWallpaperscreen(String wallpaperscreen) {
		this.wallpaperscreen = wallpaperscreen;
	    }
       

	    /**
		*
		*/
		
        public String getWallpaperformat() {
     
		return wallpaperformat;
	    }
        
	    public void setWallpaperformat(String wallpaperformat) {
		this.wallpaperformat = wallpaperformat;
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
       
      /*  public static aihao_dao convert(mvnforumwallpaperadapter_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setAdapterid(_dao.getAdapterid());
        
        temp.setWallpaperid(_dao.getWallpaperid());
        
        temp.setAdaptername(_dao.getAdaptername());
        
        temp.setWallpaperscreen(_dao.getWallpaperscreen());
        
        temp.setWallpaperformat(_dao.getWallpaperformat());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

