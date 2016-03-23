/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforummembergroupEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMMEMBERGROUP数据实体
    *@作者：宋春林 
    */

	public class mvnforummembergroup_Dao implements Serializable
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
		private int memberid;
        /**
	     * 
	     */
		private String membername;
        /**
	     * 
	     */
		private int privilege;
        /**
	     * 
	     */
		private Date creationdate;
        /**
	     * 
	     */
		private Date modifieddate;
        
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
		
        public int getMemberid() {
     
		return memberid;
	    }
        
	    public void setMemberid(int memberid) {
		this.memberid = memberid;
	    }
       

	    /**
		*
		*/
		
        public String getMembername() {
     
		return membername;
	    }
        
	    public void setMembername(String membername) {
		this.membername = membername;
	    }
       

	    /**
		*
		*/
		
        public int getPrivilege() {
     
		return privilege;
	    }
        
	    public void setPrivilege(int privilege) {
		this.privilege = privilege;
	    }
       

	    /**
		*
		*/
		
        public Date getCreationdate() {
     
		return creationdate;
	    }
        
	    public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getModifieddate() {
     
		return modifieddate;
	    }
        
	    public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	    }
       
      /*  public static aihao_dao convert(mvnforummembergroup_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGroupid(_dao.getGroupid());
        
        temp.setMemberid(_dao.getMemberid());
        
        temp.setMembername(_dao.getMembername());
        
        temp.setPrivilege(_dao.getPrivilege());
        
        temp.setCreationdate(_dao.getCreationdate());
        
        temp.setModifieddate(_dao.getModifieddate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

