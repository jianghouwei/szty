/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sc_categoryEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/11/3
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SC_CATEGORY数据实体
    *@作者：宋春林 
    */

	public class sc_category_Dao implements Serializable
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
		private String catename;
        /**
	     * 
	     */
		private String cateflag;
        /**
	     * 
	     */
		private String parantid;
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
		
        public String getCatename() {
     
		return catename;
	    }
        
	    public void setCatename(String catename) {
		this.catename = catename;
	    }
       

	    /**
		*
		*/
		
        public String getCateflag() {
     
		return cateflag;
	    }
        
	    public void setCateflag(String cateflag) {
		this.cateflag = cateflag;
	    }
       

	    /**
		*
		*/
		
        public String getParantid() {
     
		return parantid;
	    }
        
	    public void setParantid(String parantid) {
		this.parantid = parantid;
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
       
      /*  public static aihao_dao convert(sc_category_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setCatename(_dao.getCatename());
        
        temp.setCateflag(_dao.getCateflag());
        
        temp.setParantid(_dao.getParantid());
        
        temp.setIsdel(_dao.getIsdel());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

