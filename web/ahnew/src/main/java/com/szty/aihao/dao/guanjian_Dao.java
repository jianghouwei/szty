/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： guanjianEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@GUANJIAN数据实体
    *@作者：宋春林 
    */

	public class guanjian_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String gjname;
        /**
	     * 
	     */
		private String gjcolor;
        /**
	     * 
	     */
		private String gjsize;
        /**
	     * 
	     */
		private Date gjcdate;
        /**
	     * 
	     */
		private int gjorder;
        /**
	     * 
	     */
		private int gjid;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getGjname() {
     
		return gjname;
	    }
        
	    public void setGjname(String gjname) {
		this.gjname = gjname;
	    }
       

	    /**
		*
		*/
		
        public String getGjcolor() {
     
		return gjcolor;
	    }
        
	    public void setGjcolor(String gjcolor) {
		this.gjcolor = gjcolor;
	    }
       

	    /**
		*
		*/
		
        public String getGjsize() {
     
		return gjsize;
	    }
        
	    public void setGjsize(String gjsize) {
		this.gjsize = gjsize;
	    }
       

	    /**
		*
		*/
		
        public Date getGjcdate() {
     
		return gjcdate;
	    }
        
	    public void setGjcdate(Date gjcdate) {
		this.gjcdate = gjcdate;
	    }
       

	    /**
		*
		*/
		
        public int getGjorder() {
     
		return gjorder;
	    }
        
	    public void setGjorder(int gjorder) {
		this.gjorder = gjorder;
	    }
       

	    /**
		*
		*/
		
        public int getGjid() {
     
		return gjid;
	    }
        
	    public void setGjid(int gjid) {
		this.gjid = gjid;
	    }
       
      /*  public static aihao_dao convert(guanjian_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGjname(_dao.getGjname());
        
        temp.setGjcolor(_dao.getGjcolor());
        
        temp.setGjsize(_dao.getGjsize());
        
        temp.setGjcdate(_dao.getGjcdate());
        
        temp.setGjorder(_dao.getGjorder());
        
        temp.setGjid(_dao.getGjid());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

