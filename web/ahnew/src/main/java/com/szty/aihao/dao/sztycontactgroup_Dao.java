/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztycontactgroupEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYCONTACTGROUP数据实体
    *@作者：宋春林 
    */

	public class sztycontactgroup_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int gid;
        /**
	     * 
	     */
		private int usid;
        /**
	     * 
	     */
		private String groupname;
        /**
	     * 
	     */
		private String grouptype;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getGid() {
     
		return gid;
	    }
        
	    public void setGid(int gid) {
		this.gid = gid;
	    }
       

	    /**
		*
		*/
		
        public int getUsid() {
     
		return usid;
	    }
        
	    public void setUsid(int usid) {
		this.usid = usid;
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
		
        public String getGrouptype() {
     
		return grouptype;
	    }
        
	    public void setGrouptype(String grouptype) {
		this.grouptype = grouptype;
	    }
       
      /*  public static aihao_dao convert(sztycontactgroup_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGid(_dao.getGid());
        
        temp.setUsid(_dao.getUsid());
        
        temp.setGroupname(_dao.getGroupname());
        
        temp.setGrouptype(_dao.getGrouptype());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

