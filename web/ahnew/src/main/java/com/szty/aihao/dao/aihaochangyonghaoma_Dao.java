/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaochangyonghaomaEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOCHANGYONGHAOMA数据实体
    *@作者：宋春林 
    */

	public class aihaochangyonghaoma_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private long haoid;
        /**
	     * 
	     */
		private String imgid;
        /**
	     * 
	     */
		private String name;
        /**
	     * 
	     */
		private String telephone;
        /**
	     * 
	     */
		private String typename;
        /**
	     * 
	     */
		private long typecode;
        /**
	     * 
	     */
		private long sort;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public long getHaoid() {
     
		return haoid;
	    }
        
	    public void setHaoid(long haoid) {
		this.haoid = haoid;
	    }
       

	    /**
		*
		*/
		
        public String getImgid() {
     
		return imgid;
	    }
        
	    public void setImgid(String imgid) {
		this.imgid = imgid;
	    }
       

	    /**
		*
		*/
		
        public String getName() {
     
		return name;
	    }
        
	    public void setName(String name) {
		this.name = name;
	    }
       

	    /**
		*
		*/
		
        public String getTelephone() {
     
		return telephone;
	    }
        
	    public void setTelephone(String telephone) {
		this.telephone = telephone;
	    }
       

	    /**
		*
		*/
		
        public String getTypename() {
     
		return typename;
	    }
        
	    public void setTypename(String typename) {
		this.typename = typename;
	    }
       

	    /**
		*
		*/
		
        public long getTypecode() {
     
		return typecode;
	    }
        
	    public void setTypecode(long typecode) {
		this.typecode = typecode;
	    }
       

	    /**
		*
		*/
		
        public long getSort() {
     
		return sort;
	    }
        
	    public void setSort(long sort) {
		this.sort = sort;
	    }
       
      /*  public static aihao_dao convert(aihaochangyonghaoma_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setHaoid(_dao.getHaoid());
        
        temp.setImgid(_dao.getImgid());
        
        temp.setName(_dao.getName());
        
        temp.setTelephone(_dao.getTelephone());
        
        temp.setTypename(_dao.getTypename());
        
        temp.setTypecode(_dao.getTypecode());
        
        temp.setSort(_dao.getSort());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

