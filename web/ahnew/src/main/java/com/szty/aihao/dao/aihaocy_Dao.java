/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaocyEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOCY数据实体
    *@作者：宋春林 
    */

	public class aihaocy_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int haoid;
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
		private int typecode;
        /**
	     * 
	     */
		private int sort;
        /**
	     * 
	     */
		private String bigclass;
        /**
	     * 
	     */
		private int status;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getHaoid() {
     
		return haoid;
	    }
        
	    public void setHaoid(int haoid) {
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
		
        public int getTypecode() {
     
		return typecode;
	    }
        
	    public void setTypecode(int typecode) {
		this.typecode = typecode;
	    }
       

	    /**
		*
		*/
		
        public int getSort() {
     
		return sort;
	    }
        
	    public void setSort(int sort) {
		this.sort = sort;
	    }
       

	    /**
		*
		*/
		
        public String getBigclass() {
     
		return bigclass;
	    }
        
	    public void setBigclass(String bigclass) {
		this.bigclass = bigclass;
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
       
      /*  public static aihao_dao convert(aihaocy_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setHaoid(_dao.getHaoid());
        
        temp.setImgid(_dao.getImgid());
        
        temp.setName(_dao.getName());
        
        temp.setTelephone(_dao.getTelephone());
        
        temp.setTypename(_dao.getTypename());
        
        temp.setTypecode(_dao.getTypecode());
        
        temp.setSort(_dao.getSort());
        
        temp.setBigclass(_dao.getBigclass());
        
        temp.setStatus(_dao.getStatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

