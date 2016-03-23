/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumpictureEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMPICTURE数据实体
    *@作者：宋春林 
    */

	public class mvnforumpicture_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int pictureid;
        /**
	     * 
	     */
		private Date picturecreationdate;
        /**
	     * 
	     */
		private String pictureurl;
        /**
	     * 
	     */
		private int recommendtype;
        /**
	     * 
	     */
		private int recommendsrcid;
        /**
	     * 
	     */
		private String recommendsrcname;
        /**
	     * 
	     */
		private String pictureownername;
        /**
	     * 
	     */
		private int picturestatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getPictureid() {
     
		return pictureid;
	    }
        
	    public void setPictureid(int pictureid) {
		this.pictureid = pictureid;
	    }
       

	    /**
		*
		*/
		
        public Date getPicturecreationdate() {
     
		return picturecreationdate;
	    }
        
	    public void setPicturecreationdate(Date picturecreationdate) {
		this.picturecreationdate = picturecreationdate;
	    }
       

	    /**
		*
		*/
		
        public String getPictureurl() {
     
		return pictureurl;
	    }
        
	    public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	    }
       

	    /**
		*
		*/
		
        public int getRecommendtype() {
     
		return recommendtype;
	    }
        
	    public void setRecommendtype(int recommendtype) {
		this.recommendtype = recommendtype;
	    }
       

	    /**
		*
		*/
		
        public int getRecommendsrcid() {
     
		return recommendsrcid;
	    }
        
	    public void setRecommendsrcid(int recommendsrcid) {
		this.recommendsrcid = recommendsrcid;
	    }
       

	    /**
		*
		*/
		
        public String getRecommendsrcname() {
     
		return recommendsrcname;
	    }
        
	    public void setRecommendsrcname(String recommendsrcname) {
		this.recommendsrcname = recommendsrcname;
	    }
       

	    /**
		*
		*/
		
        public String getPictureownername() {
     
		return pictureownername;
	    }
        
	    public void setPictureownername(String pictureownername) {
		this.pictureownername = pictureownername;
	    }
       

	    /**
		*
		*/
		
        public int getPicturestatus() {
     
		return picturestatus;
	    }
        
	    public void setPicturestatus(int picturestatus) {
		this.picturestatus = picturestatus;
	    }
       
      /*  public static aihao_dao convert(mvnforumpicture_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPictureid(_dao.getPictureid());
        
        temp.setPicturecreationdate(_dao.getPicturecreationdate());
        
        temp.setPictureurl(_dao.getPictureurl());
        
        temp.setRecommendtype(_dao.getRecommendtype());
        
        temp.setRecommendsrcid(_dao.getRecommendsrcid());
        
        temp.setRecommendsrcname(_dao.getRecommendsrcname());
        
        temp.setPictureownername(_dao.getPictureownername());
        
        temp.setPicturestatus(_dao.getPicturestatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

