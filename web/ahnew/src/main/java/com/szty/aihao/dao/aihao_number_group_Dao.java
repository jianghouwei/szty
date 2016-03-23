/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihao_number_groupEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAO_NUMBER_GROUP数据实体
    *@作者：宋春林 
    */

	public class aihao_number_group_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int id;
        /**
	     * 
	     */
		private String groupname;
        /**
	     * 
	     */
		private int provincecode;
        /**
	     * 
	     */
		private int citycode;
        /**
	     * 
	     */
		private int status;
        /**
	     * 
	     */
		private Date createdate;
        /**
	     * 
	     */
		private Date updatedate;
        /**
	     * 
	     */
		private int isnew;
        /**
	     * 
	     */
		private int weights;
        /**
	     * 
	     */
		private String imgid;
        /**
	     * 
	     */
		private int downcnt;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*
		*/
		
        public String getGroupname() {
     
		return groupname;
	    }
        
	    public void setGroupname(String groupname) {
		this.groupname = groupname;
	    }
       

	    /**
		*
		*/
		
        public int getProvincecode() {
     
		return provincecode;
	    }
        
	    public void setProvincecode(int provincecode) {
		this.provincecode = provincecode;
	    }
       

	    /**
		*
		*/
		
        public int getCitycode() {
     
		return citycode;
	    }
        
	    public void setCitycode(int citycode) {
		this.citycode = citycode;
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
       

	    /**
		*
		*/
		
        public Date getCreatedate() {
     
		return createdate;
	    }
        
	    public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	    }
       

	    /**
		*
		*/
		
        public Date getUpdatedate() {
     
		return updatedate;
	    }
        
	    public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	    }
       

	    /**
		*
		*/
		
        public int getIsnew() {
     
		return isnew;
	    }
        
	    public void setIsnew(int isnew) {
		this.isnew = isnew;
	    }
       

	    /**
		*
		*/
		
        public int getWeights() {
     
		return weights;
	    }
        
	    public void setWeights(int weights) {
		this.weights = weights;
	    }
       

	    /**
		*
		*/
		
        public String getImgid() {
     
		return imgid;
	    }
        
	    public void setImgid(String imgid) {
		this.imgid = imgid;
	    }
       

	    /**
		*
		*/
		
        public int getDowncnt() {
     
		return downcnt;
	    }
        
	    public void setDowncnt(int downcnt) {
		this.downcnt = downcnt;
	    }
       
      /*  public static aihao_dao convert(aihao_number_group_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setGroupname(_dao.getGroupname());
        
        temp.setProvincecode(_dao.getProvincecode());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setStatus(_dao.getStatus());
        
        temp.setCreatedate(_dao.getCreatedate());
        
        temp.setUpdatedate(_dao.getUpdatedate());
        
        temp.setIsnew(_dao.getIsnew());
        
        temp.setWeights(_dao.getWeights());
        
        temp.setImgid(_dao.getImgid());
        
        temp.setDowncnt(_dao.getDowncnt());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

