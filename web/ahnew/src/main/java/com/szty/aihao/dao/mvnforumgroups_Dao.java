/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumgroupsEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMGROUPS数据实体
    *@作者：宋春林 
    */

	public class mvnforumgroups_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int groupid;
        /**
	     * 
	     */
		private int groupownerid;
        /**
	     * 
	     */
		private String groupownername;
        /**
	     * 
	     */
		private String groupname;
        /**
	     * 
	     */
		private String groupdesc;
        /**
	     * 
	     */
		private int groupoption;
        /**
	     * 
	     */
		private Date groupcreationdate;
        /**
	     * 
	     */
		private Date groupmodifieddate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getGroupid() {
     
		return groupid;
	    }
        
	    public void setGroupid(int groupid) {
		this.groupid = groupid;
	    }
       

	    /**
		*
		*/
		
        public int getGroupownerid() {
     
		return groupownerid;
	    }
        
	    public void setGroupownerid(int groupownerid) {
		this.groupownerid = groupownerid;
	    }
       

	    /**
		*
		*/
		
        public String getGroupownername() {
     
		return groupownername;
	    }
        
	    public void setGroupownername(String groupownername) {
		this.groupownername = groupownername;
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
		
        public String getGroupdesc() {
     
		return groupdesc;
	    }
        
	    public void setGroupdesc(String groupdesc) {
		this.groupdesc = groupdesc;
	    }
       

	    /**
		*
		*/
		
        public int getGroupoption() {
     
		return groupoption;
	    }
        
	    public void setGroupoption(int groupoption) {
		this.groupoption = groupoption;
	    }
       

	    /**
		*
		*/
		
        public Date getGroupcreationdate() {
     
		return groupcreationdate;
	    }
        
	    public void setGroupcreationdate(Date groupcreationdate) {
		this.groupcreationdate = groupcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getGroupmodifieddate() {
     
		return groupmodifieddate;
	    }
        
	    public void setGroupmodifieddate(Date groupmodifieddate) {
		this.groupmodifieddate = groupmodifieddate;
	    }
       
      /*  public static aihao_dao convert(mvnforumgroups_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGroupid(_dao.getGroupid());
        
        temp.setGroupownerid(_dao.getGroupownerid());
        
        temp.setGroupownername(_dao.getGroupownername());
        
        temp.setGroupname(_dao.getGroupname());
        
        temp.setGroupdesc(_dao.getGroupdesc());
        
        temp.setGroupoption(_dao.getGroupoption());
        
        temp.setGroupcreationdate(_dao.getGroupcreationdate());
        
        temp.setGroupmodifieddate(_dao.getGroupmodifieddate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

