/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsmsreportEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSMSREPORT数据实体
    *@作者：宋春林 
    */

	public class mvnforumsmsreport_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int reportid;
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
		private String report;
        /**
	     * 
	     */
		private Date reportcreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getReportid() {
     
		return reportid;
	    }
        
	    public void setReportid(int reportid) {
		this.reportid = reportid;
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
		
        public String getReport() {
     
		return report;
	    }
        
	    public void setReport(String report) {
		this.report = report;
	    }
       

	    /**
		*
		*/
		
        public Date getReportcreationdate() {
     
		return reportcreationdate;
	    }
        
	    public void setReportcreationdate(Date reportcreationdate) {
		this.reportcreationdate = reportcreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumsmsreport_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setReportid(_dao.getReportid());
        
        temp.setSpid(_dao.getSpid());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setLinkid(_dao.getLinkid());
        
        temp.setReport(_dao.getReport());
        
        temp.setReportcreationdate(_dao.getReportcreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

