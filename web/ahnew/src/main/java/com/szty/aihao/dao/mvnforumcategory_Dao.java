/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumcategoryEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMCATEGORY数据实体
    *@作者：宋春林 
    */

	public class mvnforumcategory_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int categoryid;
        /**
	     * 
	     */
		private int parentcategoryid;
        /**
	     * 
	     */
		private String categoryname;
        /**
	     * 
	     */
		private String categorydesc;
        /**
	     * 
	     */
		private Date categorycreationdate;
        /**
	     * 
	     */
		private Date categorymodifieddate;
        /**
	     * 
	     */
		private int categoryorder;
        /**
	     * 
	     */
		private int categoryoption;
        /**
	     * 
	     */
		private int categorystatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getCategoryid() {
     
		return categoryid;
	    }
        
	    public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	    }
       

	    /**
		*
		*/
		
        public int getParentcategoryid() {
     
		return parentcategoryid;
	    }
        
	    public void setParentcategoryid(int parentcategoryid) {
		this.parentcategoryid = parentcategoryid;
	    }
       

	    /**
		*
		*/
		
        public String getCategoryname() {
     
		return categoryname;
	    }
        
	    public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	    }
       

	    /**
		*
		*/
		
        public String getCategorydesc() {
     
		return categorydesc;
	    }
        
	    public void setCategorydesc(String categorydesc) {
		this.categorydesc = categorydesc;
	    }
       

	    /**
		*
		*/
		
        public Date getCategorycreationdate() {
     
		return categorycreationdate;
	    }
        
	    public void setCategorycreationdate(Date categorycreationdate) {
		this.categorycreationdate = categorycreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getCategorymodifieddate() {
     
		return categorymodifieddate;
	    }
        
	    public void setCategorymodifieddate(Date categorymodifieddate) {
		this.categorymodifieddate = categorymodifieddate;
	    }
       

	    /**
		*
		*/
		
        public int getCategoryorder() {
     
		return categoryorder;
	    }
        
	    public void setCategoryorder(int categoryorder) {
		this.categoryorder = categoryorder;
	    }
       

	    /**
		*
		*/
		
        public int getCategoryoption() {
     
		return categoryoption;
	    }
        
	    public void setCategoryoption(int categoryoption) {
		this.categoryoption = categoryoption;
	    }
       

	    /**
		*
		*/
		
        public int getCategorystatus() {
     
		return categorystatus;
	    }
        
	    public void setCategorystatus(int categorystatus) {
		this.categorystatus = categorystatus;
	    }
       
      /*  public static aihao_dao convert(mvnforumcategory_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setCategoryid(_dao.getCategoryid());
        
        temp.setParentcategoryid(_dao.getParentcategoryid());
        
        temp.setCategoryname(_dao.getCategoryname());
        
        temp.setCategorydesc(_dao.getCategorydesc());
        
        temp.setCategorycreationdate(_dao.getCategorycreationdate());
        
        temp.setCategorymodifieddate(_dao.getCategorymodifieddate());
        
        temp.setCategoryorder(_dao.getCategoryorder());
        
        temp.setCategoryoption(_dao.getCategoryoption());
        
        temp.setCategorystatus(_dao.getCategorystatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

