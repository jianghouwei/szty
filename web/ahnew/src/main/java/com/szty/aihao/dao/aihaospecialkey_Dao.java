/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaospecialkeyEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOSPECIALKEY数据实体
    *@作者：宋春林 
    */

	public class aihaospecialkey_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int specialkeyid;
        /**
	     * 
	     */
		private String specialkeyname;
        /**
	     * 
	     */
		private String specialcontain;
        /**
	     * 
	     */
		private int status;
        /**
	     * 
	     */
		private Date cdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getSpecialkeyid() {
     
		return specialkeyid;
	    }
        
	    public void setSpecialkeyid(int specialkeyid) {
		this.specialkeyid = specialkeyid;
	    }
       

	    /**
		*
		*/
		
        public String getSpecialkeyname() {
     
		return specialkeyname;
	    }
        
	    public void setSpecialkeyname(String specialkeyname) {
		this.specialkeyname = specialkeyname;
	    }
       

	    /**
		*
		*/
		
        public String getSpecialcontain() {
     
		return specialcontain;
	    }
        
	    public void setSpecialcontain(String specialcontain) {
		this.specialcontain = specialcontain;
	    }
       

	    /**
		*
		*/
		
        public int getStatus() {
     
		return status;
	    }
        
	    public void setStatus(int status) {
		this.status = status;
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
       
      /*  public static aihao_dao convert(aihaospecialkey_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setSpecialkeyid(_dao.getSpecialkeyid());
        
        temp.setSpecialkeyname(_dao.getSpecialkeyname());
        
        temp.setSpecialcontain(_dao.getSpecialcontain());
        
        temp.setStatus(_dao.getStatus());
        
        temp.setCdate(_dao.getCdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

