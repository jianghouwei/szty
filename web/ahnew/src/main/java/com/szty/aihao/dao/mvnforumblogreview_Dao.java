/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumblogreviewEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMBLOGREVIEW数据实体
    *@作者：宋春林 
    */

	public class mvnforumblogreview_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int reviewid;
        /**
	     * 
	     */
		private int blogid;
        /**
	     * 
	     */
		private String reviewownername;
        /**
	     * 
	     */
		private String reviewcontent;
        /**
	     * 
	     */
		private Date reviewcreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getReviewid() {
     
		return reviewid;
	    }
        
	    public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
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
		
        public String getReviewownername() {
     
		return reviewownername;
	    }
        
	    public void setReviewownername(String reviewownername) {
		this.reviewownername = reviewownername;
	    }
       

	    /**
		*
		*/
		
        public String getReviewcontent() {
     
		return reviewcontent;
	    }
        
	    public void setReviewcontent(String reviewcontent) {
		this.reviewcontent = reviewcontent;
	    }
       

	    /**
		*
		*/
		
        public Date getReviewcreationdate() {
     
		return reviewcreationdate;
	    }
        
	    public void setReviewcreationdate(Date reviewcreationdate) {
		this.reviewcreationdate = reviewcreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumblogreview_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setReviewid(_dao.getReviewid());
        
        temp.setBlogid(_dao.getBlogid());
        
        temp.setReviewownername(_dao.getReviewownername());
        
        temp.setReviewcontent(_dao.getReviewcontent());
        
        temp.setReviewcreationdate(_dao.getReviewcreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

