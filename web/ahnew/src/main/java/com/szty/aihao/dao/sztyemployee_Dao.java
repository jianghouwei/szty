/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztyemployeeEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYEMPLOYEE数据实体
    *@作者：宋春林 
    */

	public class sztyemployee_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ??ID
	     */
		private int eid;
        /**
	     * ??ID???sztydepartment??did??
	     */
		private int departmentid;
        /**
	     * ??
	     */
		private String job;
        /**
	     * ??
	     */
		private int duty;
        /**
	     * ????
	     */
		private Date entrydate;
        /**
	     * ????
	     */
		private String hobby;
        /**
	     * ??ID
	     */
		private int bossid;
        /**
	     * ????
	     */
		private String employeename;
        /**
	     * ????
	     */
		private String card;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*??ID
		*/
		
        public int getEid() {
     
		return eid;
	    }
        
	    public void setEid(int eid) {
		this.eid = eid;
	    }
       

	    /**
		*??ID???sztydepartment??did??
		*/
		
        public int getDepartmentid() {
     
		return departmentid;
	    }
        
	    public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	    }
       

	    /**
		*??
		*/
		
        public String getJob() {
     
		return job;
	    }
        
	    public void setJob(String job) {
		this.job = job;
	    }
       

	    /**
		*??
		*/
		
        public int getDuty() {
     
		return duty;
	    }
        
	    public void setDuty(int duty) {
		this.duty = duty;
	    }
       

	    /**
		*????
		*/
		
        public Date getEntrydate() {
     
		return entrydate;
	    }
        
	    public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	    }
       

	    /**
		*????
		*/
		
        public String getHobby() {
     
		return hobby;
	    }
        
	    public void setHobby(String hobby) {
		this.hobby = hobby;
	    }
       

	    /**
		*??ID
		*/
		
        public int getBossid() {
     
		return bossid;
	    }
        
	    public void setBossid(int bossid) {
		this.bossid = bossid;
	    }
       

	    /**
		*????
		*/
		
        public String getEmployeename() {
     
		return employeename;
	    }
        
	    public void setEmployeename(String employeename) {
		this.employeename = employeename;
	    }
       

	    /**
		*????
		*/
		
        public String getCard() {
     
		return card;
	    }
        
	    public void setCard(String card) {
		this.card = card;
	    }
       
      /*  public static aihao_dao convert(sztyemployee_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setEid(_dao.getEid());
        
        temp.setDepartmentid(_dao.getDepartmentid());
        
        temp.setJob(_dao.getJob());
        
        temp.setDuty(_dao.getDuty());
        
        temp.setEntrydate(_dao.getEntrydate());
        
        temp.setHobby(_dao.getHobby());
        
        temp.setBossid(_dao.getBossid());
        
        temp.setEmployeename(_dao.getEmployeename());
        
        temp.setCard(_dao.getCard());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

