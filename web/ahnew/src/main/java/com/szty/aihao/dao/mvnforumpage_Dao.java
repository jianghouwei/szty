/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumpageEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMPAGE数据实体
    *@作者：宋春林 
    */

	public class mvnforumpage_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int pageid;
        /**
	     * 
	     */
		private int parentpageid;
        /**
	     * 
	     */
		private int browsecount;
        /**
	     * 
	     */
		private Date pagecreationdate;
        /**
	     * 
	     */
		private Date pagemodifieddate;
        /**
	     * 
	     */
		private String pageownername;
        /**
	     * 
	     */
		private String pagetitle;
        /**
	     * 
	     */
		private int pagestatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getPageid() {
     
		return pageid;
	    }
        
	    public void setPageid(int pageid) {
		this.pageid = pageid;
	    }
       

	    /**
		*
		*/
		
        public int getParentpageid() {
     
		return parentpageid;
	    }
        
	    public void setParentpageid(int parentpageid) {
		this.parentpageid = parentpageid;
	    }
       

	    /**
		*
		*/
		
        public int getBrowsecount() {
     
		return browsecount;
	    }
        
	    public void setBrowsecount(int browsecount) {
		this.browsecount = browsecount;
	    }
       

	    /**
		*
		*/
		
        public Date getPagecreationdate() {
     
		return pagecreationdate;
	    }
        
	    public void setPagecreationdate(Date pagecreationdate) {
		this.pagecreationdate = pagecreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getPagemodifieddate() {
     
		return pagemodifieddate;
	    }
        
	    public void setPagemodifieddate(Date pagemodifieddate) {
		this.pagemodifieddate = pagemodifieddate;
	    }
       

	    /**
		*
		*/
		
        public String getPageownername() {
     
		return pageownername;
	    }
        
	    public void setPageownername(String pageownername) {
		this.pageownername = pageownername;
	    }
       

	    /**
		*
		*/
		
        public String getPagetitle() {
     
		return pagetitle;
	    }
        
	    public void setPagetitle(String pagetitle) {
		this.pagetitle = pagetitle;
	    }
       

	    /**
		*
		*/
		
        public int getPagestatus() {
     
		return pagestatus;
	    }
        
	    public void setPagestatus(int pagestatus) {
		this.pagestatus = pagestatus;
	    }
       
      /*  public static aihao_dao convert(mvnforumpage_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPageid(_dao.getPageid());
        
        temp.setParentpageid(_dao.getParentpageid());
        
        temp.setBrowsecount(_dao.getBrowsecount());
        
        temp.setPagecreationdate(_dao.getPagecreationdate());
        
        temp.setPagemodifieddate(_dao.getPagemodifieddate());
        
        temp.setPageownername(_dao.getPageownername());
        
        temp.setPagetitle(_dao.getPagetitle());
        
        temp.setPagestatus(_dao.getPagestatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

