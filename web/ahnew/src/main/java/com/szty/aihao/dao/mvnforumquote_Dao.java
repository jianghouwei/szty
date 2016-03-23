/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumquoteEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMQUOTE数据实体
    *@作者：宋春林 
    */

	public class mvnforumquote_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int quoteid;
        /**
	     * 
	     */
		private int pageid;
        /**
	     * 
	     */
		private int quotetype;
        /**
	     * 
	     */
		private int resourceid;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getQuoteid() {
     
		return quoteid;
	    }
        
	    public void setQuoteid(int quoteid) {
		this.quoteid = quoteid;
	    }
       

	    /**
		*
		*/
		
        public int getPageid() {
     
		return pageid;
	    }
        
	    public void setPageid(int pageid) {
		this.pageid = pageid;
	    }
       

	    /**
		*
		*/
		
        public int getQuotetype() {
     
		return quotetype;
	    }
        
	    public void setQuotetype(int quotetype) {
		this.quotetype = quotetype;
	    }
       

	    /**
		*
		*/
		
        public int getResourceid() {
     
		return resourceid;
	    }
        
	    public void setResourceid(int resourceid) {
		this.resourceid = resourceid;
	    }
       
      /*  public static aihao_dao convert(mvnforumquote_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setQuoteid(_dao.getQuoteid());
        
        temp.setPageid(_dao.getPageid());
        
        temp.setQuotetype(_dao.getQuotetype());
        
        temp.setResourceid(_dao.getResourceid());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

