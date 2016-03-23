/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： osmobileEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@OSMOBILE数据实体
    *@作者：宋春林 
    */

	public class osmobile_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int osid;
        /**
	     * 
	     */
		private String osname;
        /**
	     * 
	     */
		private String osicon;
        /**
	     * 
	     */
		private Date oscreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getOsid() {
     
		return osid;
	    }
        
	    public void setOsid(int osid) {
		this.osid = osid;
	    }
       

	    /**
		*
		*/
		
        public String getOsname() {
     
		return osname;
	    }
        
	    public void setOsname(String osname) {
		this.osname = osname;
	    }
       

	    /**
		*
		*/
		
        public String getOsicon() {
     
		return osicon;
	    }
        
	    public void setOsicon(String osicon) {
		this.osicon = osicon;
	    }
       

	    /**
		*
		*/
		
        public Date getOscreationdate() {
     
		return oscreationdate;
	    }
        
	    public void setOscreationdate(Date oscreationdate) {
		this.oscreationdate = oscreationdate;
	    }
       
      /*  public static aihao_dao convert(osmobile_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setOsid(_dao.getOsid());
        
        temp.setOsname(_dao.getOsname());
        
        temp.setOsicon(_dao.getOsicon());
        
        temp.setOscreationdate(_dao.getOscreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

