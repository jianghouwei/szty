/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumpageelementsEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMPAGEELEMENTS数据实体
    *@作者：宋春林 
    */

	public class mvnforumpageelements_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int elementid;
        /**
	     * 
	     */
		private int pageid;
        /**
	     * 
	     */
		private String content;
        /**
	     * 
	     */
		private int elementorder;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getElementid() {
     
		return elementid;
	    }
        
	    public void setElementid(int elementid) {
		this.elementid = elementid;
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
		
        public String getContent() {
     
		return content;
	    }
        
	    public void setContent(String content) {
		this.content = content;
	    }
       

	    /**
		*
		*/
		
        public int getElementorder() {
     
		return elementorder;
	    }
        
	    public void setElementorder(int elementorder) {
		this.elementorder = elementorder;
	    }
       
      /*  public static aihao_dao convert(mvnforumpageelements_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setElementid(_dao.getElementid());
        
        temp.setPageid(_dao.getPageid());
        
        temp.setContent(_dao.getContent());
        
        temp.setElementorder(_dao.getElementorder());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

