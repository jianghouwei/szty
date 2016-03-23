/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumblogfavoritesEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMBLOGFAVORITES数据实体
    *@作者：宋春林 
    */

	public class mvnforumblogfavorites_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int favoriteid;
        /**
	     * 
	     */
		private int blogid;
        /**
	     * 
	     */
		private String favoriteownername;
        /**
	     * 
	     */
		private Date favoritecreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getFavoriteid() {
     
		return favoriteid;
	    }
        
	    public void setFavoriteid(int favoriteid) {
		this.favoriteid = favoriteid;
	    }
       

	    /**
		*
		*/
		
        public int getBlogid() {
     
		return blogid;
	    }
        
	    public void setBlogid(int blogid) {
		this.blogid = blogid;
	    }
       

	    /**
		*
		*/
		
        public String getFavoriteownername() {
     
		return favoriteownername;
	    }
        
	    public void setFavoriteownername(String favoriteownername) {
		this.favoriteownername = favoriteownername;
	    }
       

	    /**
		*
		*/
		
        public Date getFavoritecreationdate() {
     
		return favoritecreationdate;
	    }
        
	    public void setFavoritecreationdate(Date favoritecreationdate) {
		this.favoritecreationdate = favoritecreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumblogfavorites_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setFavoriteid(_dao.getFavoriteid());
        
        temp.setBlogid(_dao.getBlogid());
        
        temp.setFavoriteownername(_dao.getFavoriteownername());
        
        temp.setFavoritecreationdate(_dao.getFavoritecreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

