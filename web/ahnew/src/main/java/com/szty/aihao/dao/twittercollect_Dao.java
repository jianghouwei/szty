/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： twittercollectEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TWITTERCOLLECT数据实体
    *@作者：宋春林 
    */

	public class twittercollect_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int collectid;
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
		private Date collecttime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getCollectid() {
     
		return collectid;
	    }
        
	    public void setCollectid(int collectid) {
		this.collectid = collectid;
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
		
        public Date getCollecttime() {
     
		return collecttime;
	    }
        
	    public void setCollecttime(Date collecttime) {
		this.collecttime = collecttime;
	    }
       
      /*  public static aihao_dao convert(twittercollect_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setCollectid(_dao.getCollectid());
        
        temp.setUserid(_dao.getUserid());
        
        temp.setTopicsid(_dao.getTopicsid());
        
        temp.setCollecttime(_dao.getCollecttime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

