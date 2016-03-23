/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： twittershareEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TWITTERSHARE数据实体
    *@作者：宋春林 
    */

	public class twittershare_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int shareid;
        /**
	     * 
	     */
		private int userid;
        /**
	     * 
	     */
		private int topicsid;
        /**
	     * 
	     */
		private Date sharetime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getShareid() {
     
		return shareid;
	    }
        
	    public void setShareid(int shareid) {
		this.shareid = shareid;
	    }
       

	    /**
		*
		*/
		
        public int getUserid() {
     
		return userid;
	    }
        
	    public void setUserid(int userid) {
		this.userid = userid;
	    }
       

	    /**
		*
		*/
		
        public int getTopicsid() {
     
		return topicsid;
	    }
        
	    public void setTopicsid(int topicsid) {
		this.topicsid = topicsid;
	    }
       

	    /**
		*
		*/
		
        public Date getSharetime() {
     
		return sharetime;
	    }
        
	    public void setSharetime(Date sharetime) {
		this.sharetime = sharetime;
	    }
       
      /*  public static aihao_dao convert(twittershare_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setShareid(_dao.getShareid());
        
        temp.setUserid(_dao.getUserid());
        
        temp.setTopicsid(_dao.getTopicsid());
        
        temp.setSharetime(_dao.getSharetime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

