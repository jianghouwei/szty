/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumringEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMRING数据实体
    *@作者：宋春林 
    */

	public class mvnforumring_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int ringid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private String ringname;
        /**
	     * 
	     */
		private String singername;
        /**
	     * 
	     */
		private int ringcategory;
        /**
	     * 
	     */
		private String folderpart;
        /**
	     * 
	     */
		private Date ringcreationdate;
        /**
	     * 
	     */
		private Date ringmodifieddate;
        /**
	     * 
	     */
		private String ringownername;
        /**
	     * 
	     */
		private String ringownerid;
        /**
	     * 
	     */
		private int ringstatus;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getRingid() {
     
		return ringid;
	    }
        
	    public void setRingid(int ringid) {
		this.ringid = ringid;
	    }
       

	    /**
		*
		*/
		
        public int getForumid() {
     
		return forumid;
	    }
        
	    public void setForumid(int forumid) {
		this.forumid = forumid;
	    }
       

	    /**
		*
		*/
		
        public String getRingname() {
     
		return ringname;
	    }
        
	    public void setRingname(String ringname) {
		this.ringname = ringname;
	    }
       

	    /**
		*
		*/
		
        public String getSingername() {
     
		return singername;
	    }
        
	    public void setSingername(String singername) {
		this.singername = singername;
	    }
       

	    /**
		*
		*/
		
        public int getRingcategory() {
     
		return ringcategory;
	    }
        
	    public void setRingcategory(int ringcategory) {
		this.ringcategory = ringcategory;
	    }
       

	    /**
		*
		*/
		
        public String getFolderpart() {
     
		return folderpart;
	    }
        
	    public void setFolderpart(String folderpart) {
		this.folderpart = folderpart;
	    }
       

	    /**
		*
		*/
		
        public Date getRingcreationdate() {
     
		return ringcreationdate;
	    }
        
	    public void setRingcreationdate(Date ringcreationdate) {
		this.ringcreationdate = ringcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getRingmodifieddate() {
     
		return ringmodifieddate;
	    }
        
	    public void setRingmodifieddate(Date ringmodifieddate) {
		this.ringmodifieddate = ringmodifieddate;
	    }
       

	    /**
		*
		*/
		
        public String getRingownername() {
     
		return ringownername;
	    }
        
	    public void setRingownername(String ringownername) {
		this.ringownername = ringownername;
	    }
       

	    /**
		*
		*/
		
        public String getRingownerid() {
     
		return ringownerid;
	    }
        
	    public void setRingownerid(String ringownerid) {
		this.ringownerid = ringownerid;
	    }
       

	    /**
		*
		*/
		
        public int getRingstatus() {
     
		return ringstatus;
	    }
        
	    public void setRingstatus(int ringstatus) {
		this.ringstatus = ringstatus;
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
       
      /*  public static aihao_dao convert(mvnforumring_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setRingid(_dao.getRingid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setRingname(_dao.getRingname());
        
        temp.setSingername(_dao.getSingername());
        
        temp.setRingcategory(_dao.getRingcategory());
        
        temp.setFolderpart(_dao.getFolderpart());
        
        temp.setRingcreationdate(_dao.getRingcreationdate());
        
        temp.setRingmodifieddate(_dao.getRingmodifieddate());
        
        temp.setRingownername(_dao.getRingownername());
        
        temp.setRingownerid(_dao.getRingownerid());
        
        temp.setRingstatus(_dao.getRingstatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

