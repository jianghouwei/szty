/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaosonclassEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOSONCLASS数据实体
    *@作者：宋春林 
    */

	public class aihaosonclass_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int sonclassid;
        /**
	     * 
	     */
		private int bigclassid;
        /**
	     * 
	     */
		private String sonclassname;
        /**
	     * 
	     */
		private String sonclasspic;
        /**
	     * 
	     */
		private int sonclasspicsize;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getSonclassid() {
     
		return sonclassid;
	    }
        
	    public void setSonclassid(int sonclassid) {
		this.sonclassid = sonclassid;
	    }
       

	    /**
		*
		*/
		
        public int getBigclassid() {
     
		return bigclassid;
	    }
        
	    public void setBigclassid(int bigclassid) {
		this.bigclassid = bigclassid;
	    }
       

	    /**
		*
		*/
		
        public String getSonclassname() {
     
		return sonclassname;
	    }
        
	    public void setSonclassname(String sonclassname) {
		this.sonclassname = sonclassname;
	    }
       

	    /**
		*
		*/
		
        public String getSonclasspic() {
     
		return sonclasspic;
	    }
        
	    public void setSonclasspic(String sonclasspic) {
		this.sonclasspic = sonclasspic;
	    }
       

	    /**
		*
		*/
		
        public int getSonclasspicsize() {
     
		return sonclasspicsize;
	    }
        
	    public void setSonclasspicsize(int sonclasspicsize) {
		this.sonclasspicsize = sonclasspicsize;
	    }
       
      /*  public static aihao_dao convert(aihaosonclass_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setSonclassid(_dao.getSonclassid());
        
        temp.setBigclassid(_dao.getBigclassid());
        
        temp.setSonclassname(_dao.getSonclassname());
        
        temp.setSonclasspic(_dao.getSonclasspic());
        
        temp.setSonclasspicsize(_dao.getSonclasspicsize());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

