/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumhlldownlogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMHLLDOWNLOG数据实体
    *@作者：宋春林 
    */

	public class mvnforumhlldownlog_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int downloadid;
        /**
	     * 
	     */
		private String pid;
        /**
	     * 
	     */
		private String userip;
        /**
	     * 
	     */
		private String ver;
        /**
	     * 
	     */
		private String release;
        /**
	     * 
	     */
		private int step;
        /**
	     * 
	     */
		private Date downloadcreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getDownloadid() {
     
		return downloadid;
	    }
        
	    public void setDownloadid(int downloadid) {
		this.downloadid = downloadid;
	    }
       

	    /**
		*
		*/
		
        public String getPid() {
     
		return pid;
	    }
        
	    public void setPid(String pid) {
		this.pid = pid;
	    }
       

	    /**
		*
		*/
		
        public String getUserip() {
     
		return userip;
	    }
        
	    public void setUserip(String userip) {
		this.userip = userip;
	    }
       

	    /**
		*
		*/
		
        public String getVer() {
     
		return ver;
	    }
        
	    public void setVer(String ver) {
		this.ver = ver;
	    }
       

	    /**
		*
		*/
		
        public String getRelease() {
     
		return release;
	    }
        
	    public void setRelease(String release) {
		this.release = release;
	    }
       

	    /**
		*
		*/
		
        public int getStep() {
     
		return step;
	    }
        
	    public void setStep(int step) {
		this.step = step;
	    }
       

	    /**
		*
		*/
		
        public Date getDownloadcreationdate() {
     
		return downloadcreationdate;
	    }
        
	    public void setDownloadcreationdate(Date downloadcreationdate) {
		this.downloadcreationdate = downloadcreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumhlldownlog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setDownloadid(_dao.getDownloadid());
        
        temp.setPid(_dao.getPid());
        
        temp.setUserip(_dao.getUserip());
        
        temp.setVer(_dao.getVer());
        
        temp.setRelease(_dao.getRelease());
        
        temp.setStep(_dao.getStep());
        
        temp.setDownloadcreationdate(_dao.getDownloadcreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

