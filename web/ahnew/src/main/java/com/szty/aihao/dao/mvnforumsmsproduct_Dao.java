/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsmsproductEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSMSPRODUCT数据实体
    *@作者：宋春林 
    */

	public class mvnforumsmsproduct_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int productid;
        /**
	     * 
	     */
		private String sid;
        /**
	     * 
	     */
		private String productname;
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
		private Date productcreationdate;
        /**
	     * 
	     */
		private int status;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getProductid() {
     
		return productid;
	    }
        
	    public void setProductid(int productid) {
		this.productid = productid;
	    }
       

	    /**
		*
		*/
		
        public String getSid() {
     
		return sid;
	    }
        
	    public void setSid(String sid) {
		this.sid = sid;
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
		
        public Date getProductcreationdate() {
     
		return productcreationdate;
	    }
        
	    public void setProductcreationdate(Date productcreationdate) {
		this.productcreationdate = productcreationdate;
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
       
      /*  public static aihao_dao convert(mvnforumsmsproduct_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setProductid(_dao.getProductid());
        
        temp.setSid(_dao.getSid());
        
        temp.setProductname(_dao.getProductname());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setUsername(_dao.getUsername());
        
        temp.setProductcreationdate(_dao.getProductcreationdate());
        
        temp.setStatus(_dao.getStatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

