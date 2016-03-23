/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： jobmembertableEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@JOBMEMBERTABLE数据实体
    *@作者：宋春林 
    */

	public class jobmembertable_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int jobmemberid;
        /**
	     * 
	     */
		private String mobile;
        /**
	     * 
	     */
		private int jobid;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private String userid;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getJobmemberid() {
     
		return jobmemberid;
	    }
        
	    public void setJobmemberid(int jobmemberid) {
		this.jobmemberid = jobmemberid;
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
		
        public int getJobid() {
     
		return jobid;
	    }
        
	    public void setJobid(int jobid) {
		this.jobid = jobid;
	    }
       

	    /**
		*
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       

	    /**
		*
		*/
		
        public String getUserid() {
     
		return userid;
	    }
        
	    public void setUserid(String userid) {
		this.userid = userid;
	    }
       
      /*  public static aihao_dao convert(jobmembertable_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setJobmemberid(_dao.getJobmemberid());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setJobid(_dao.getJobid());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setUserid(_dao.getUserid());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

