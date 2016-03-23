/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： twittertopicsEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TWITTERTOPICS数据实体
    *@作者：宋春林 
    */

	public class twittertopics_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int topicsid;
        /**
	     * 
	     */
		private int userid;
        /**
	     * 
	     */
		private String content;
        /**
	     * 
	     */
		private int state;
        /**
	     * 
	     */
		private Date topicstime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public int getUserid() {
     
		return userid;
	    }
        
	    public void setUserid(int userid) {
		this.userid = userid;
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
		
        public int getState() {
     
		return state;
	    }
        
	    public void setState(int state) {
		this.state = state;
	    }
       

	    /**
		*
		*/
		
        public Date getTopicstime() {
     
		return topicstime;
	    }
        
	    public void setTopicstime(Date topicstime) {
		this.topicstime = topicstime;
	    }
       
      /*  public static aihao_dao convert(twittertopics_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setTopicsid(_dao.getTopicsid());
        
        temp.setUserid(_dao.getUserid());
        
        temp.setContent(_dao.getContent());
        
        temp.setState(_dao.getState());
        
        temp.setTopicstime(_dao.getTopicstime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

