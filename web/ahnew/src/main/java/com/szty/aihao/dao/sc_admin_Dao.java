/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sc_adminEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/11/3
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SC_ADMIN数据实体
    *@作者：宋春林 
    */

	public class sc_admin_Dao implements Serializable
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
		private String adminname;
        /**
	     * 
	     */
		private String adminpass;
        /**
	     * 
	     */
		private String adminflag;
        /**
	     * 
	     */
		private Date createtime;
        /**
	     * 
	     */
		private int isdel;
        
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
		
        public String getAdminname() {
     
		return adminname;
	    }
        
	    public void setAdminname(String adminname) {
		this.adminname = adminname;
	    }
       

	    /**
		*
		*/
		
        public String getAdminpass() {
     
		return adminpass;
	    }
        
	    public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	    }
       

	    /**
		*
		*/
		
        public String getAdminflag() {
     
		return adminflag;
	    }
        
	    public void setAdminflag(String adminflag) {
		this.adminflag = adminflag;
	    }
       

	    /**
		*
		*/
		
        public Date getCreatetime() {
     
		return createtime;
	    }
        
	    public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	    }
       

	    /**
		*
		*/
		
        public int getIsdel() {
     
		return isdel;
	    }
        
	    public void setIsdel(int isdel) {
		this.isdel = isdel;
	    }
       
      /*  public static aihao_dao convert(sc_admin_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setAdminname(_dao.getAdminname());
        
        temp.setAdminpass(_dao.getAdminpass());
        
        temp.setAdminflag(_dao.getAdminflag());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        temp.setIsdel(_dao.getIsdel());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

