/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： newsEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@NEWS数据实体
    *@作者：宋春林 
    */

	public class news_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int newsid;
        /**
	     * 
	     */
		private String newstitle;
        /**
	     * 
	     */
		private String newscontent;
        /**
	     * 
	     */
		private Date newscreationdate;
        /**
	     * 
	     */
		private int newsstatus;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getNewsid() {
     
		return newsid;
	    }
        
	    public void setNewsid(int newsid) {
		this.newsid = newsid;
	    }
       

	    /**
		*
		*/
		
        public String getNewstitle() {
     
		return newstitle;
	    }
        
	    public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	    }
       

	    /**
		*
		*/
		
        public String getNewscontent() {
     
		return newscontent;
	    }
        
	    public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	    }
       

	    /**
		*
		*/
		
        public Date getNewscreationdate() {
     
		return newscreationdate;
	    }
        
	    public void setNewscreationdate(Date newscreationdate) {
		this.newscreationdate = newscreationdate;
	    }
       

	    /**
		*
		*/
		
        public int getNewsstatus() {
     
		return newsstatus;
	    }
        
	    public void setNewsstatus(int newsstatus) {
		this.newsstatus = newsstatus;
	    }
       

	    /**
		*
		*/
		
        public int getViewcount() {
     
		return viewcount;
	    }
        
	    public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	    }
       
      /*  public static aihao_dao convert(news_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setNewsid(_dao.getNewsid());
        
        temp.setNewstitle(_dao.getNewstitle());
        
        temp.setNewscontent(_dao.getNewscontent());
        
        temp.setNewscreationdate(_dao.getNewscreationdate());
        
        temp.setNewsstatus(_dao.getNewsstatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

