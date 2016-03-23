/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztydepartmentEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYDEPARTMENT数据实体
    *@作者：宋春林 
    */

	public class sztydepartment_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ??ID???sztydepartment_seq?
	     */
		private int did;
        /**
	     * ????
	     */
		private String departmentname;
        /**
	     * ??????
	     */
		private String englishname;
        /**
	     * ???ID
	     */
		private int perantid;
        /**
	     * leader??
	     */
		private String leader;
        /**
	     * ???
	     */
		private String telephone;
        /**
	     * ??
	     */
		private String memo;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*??ID???sztydepartment_seq?
		*/
		
        public int getDid() {
     
		return did;
	    }
        
	    public void setDid(int did) {
		this.did = did;
	    }
       

	    /**
		*????
		*/
		
        public String getDepartmentname() {
     
		return departmentname;
	    }
        
	    public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	    }
       

	    /**
		*??????
		*/
		
        public String getEnglishname() {
     
		return englishname;
	    }
        
	    public void setEnglishname(String englishname) {
		this.englishname = englishname;
	    }
       

	    /**
		*???ID
		*/
		
        public int getPerantid() {
     
		return perantid;
	    }
        
	    public void setPerantid(int perantid) {
		this.perantid = perantid;
	    }
       

	    /**
		*leader??
		*/
		
        public String getLeader() {
     
		return leader;
	    }
        
	    public void setLeader(String leader) {
		this.leader = leader;
	    }
       

	    /**
		*???
		*/
		
        public String getTelephone() {
     
		return telephone;
	    }
        
	    public void setTelephone(String telephone) {
		this.telephone = telephone;
	    }
       

	    /**
		*??
		*/
		
        public String getMemo() {
     
		return memo;
	    }
        
	    public void setMemo(String memo) {
		this.memo = memo;
	    }
       
      /*  public static aihao_dao convert(sztydepartment_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setDid(_dao.getDid());
        
        temp.setDepartmentname(_dao.getDepartmentname());
        
        temp.setEnglishname(_dao.getEnglishname());
        
        temp.setPerantid(_dao.getPerantid());
        
        temp.setLeader(_dao.getLeader());
        
        temp.setTelephone(_dao.getTelephone());
        
        temp.setMemo(_dao.getMemo());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

