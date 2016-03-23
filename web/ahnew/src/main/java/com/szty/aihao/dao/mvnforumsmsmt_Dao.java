/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsmsmtEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSMSMT数据实体
    *@作者：宋春林 
    */

	public class mvnforumsmsmt_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int mtid;
        /**
	     * 
	     */
		private String productname;
        /**
	     * 
	     */
		private String spid;
        /**
	     * 
	     */
		private String mobile;
        /**
	     * 
	     */
		private String linkid;
        /**
	     * 
	     */
		private String message;
        /**
	     * 
	     */
		private Date mtcreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getMtid() {
     
		return mtid;
	    }
        
	    public void setMtid(int mtid) {
		this.mtid = mtid;
	    }
       

	    /**
		*
		*/
		
        public String getProductname() {
     
		return productname;
	    }
        
	    public void setProductname(String productname) {
		this.productname = productname;
	    }
       

	    /**
		*
		*/
		
        public String getSpid() {
     
		return spid;
	    }
        
	    public void setSpid(String spid) {
		this.spid = spid;
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
		
        public String getLinkid() {
     
		return linkid;
	    }
        
	    public void setLinkid(String linkid) {
		this.linkid = linkid;
	    }
       

	    /**
		*
		*/
		
        public String getMessage() {
     
		return message;
	    }
        
	    public void setMessage(String message) {
		this.message = message;
	    }
       

	    /**
		*
		*/
		
        public Date getMtcreationdate() {
     
		return mtcreationdate;
	    }
        
	    public void setMtcreationdate(Date mtcreationdate) {
		this.mtcreationdate = mtcreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumsmsmt_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMtid(_dao.getMtid());
        
        temp.setProductname(_dao.getProductname());
        
        temp.setSpid(_dao.getSpid());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setLinkid(_dao.getLinkid());
        
        temp.setMessage(_dao.getMessage());
        
        temp.setMtcreationdate(_dao.getMtcreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

