/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumvideoEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMVIDEO数据实体
    *@作者：宋春林 
    */

	public class mvnforumvideo_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int videoid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private String videotitle;
        /**
	     * 
	     */
		private String videoimg;
        /**
	     * 
	     */
		private String folderpart;
        /**
	     * 
	     */
		private String videourl;
        /**
	     * 
	     */
		private int videofilesize;
        /**
	     * 
	     */
		private Date videocreationdate;
        /**
	     * 
	     */
		private Date videomodifieddate;
        /**
	     * 
	     */
		private String videoownername;
        /**
	     * 
	     */
		private int videostatus;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getVideoid() {
     
		return videoid;
	    }
        
	    public void setVideoid(int videoid) {
		this.videoid = videoid;
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
		
        public String getVideotitle() {
     
		return videotitle;
	    }
        
	    public void setVideotitle(String videotitle) {
		this.videotitle = videotitle;
	    }
       

	    /**
		*
		*/
		
        public String getVideoimg() {
     
		return videoimg;
	    }
        
	    public void setVideoimg(String videoimg) {
		this.videoimg = videoimg;
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
		
        public String getVideourl() {
     
		return videourl;
	    }
        
	    public void setVideourl(String videourl) {
		this.videourl = videourl;
	    }
       

	    /**
		*
		*/
		
        public int getVideofilesize() {
     
		return videofilesize;
	    }
        
	    public void setVideofilesize(int videofilesize) {
		this.videofilesize = videofilesize;
	    }
       

	    /**
		*
		*/
		
        public Date getVideocreationdate() {
     
		return videocreationdate;
	    }
        
	    public void setVideocreationdate(Date videocreationdate) {
		this.videocreationdate = videocreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getVideomodifieddate() {
     
		return videomodifieddate;
	    }
        
	    public void setVideomodifieddate(Date videomodifieddate) {
		this.videomodifieddate = videomodifieddate;
	    }
       

	    /**
		*
		*/
		
        public String getVideoownername() {
     
		return videoownername;
	    }
        
	    public void setVideoownername(String videoownername) {
		this.videoownername = videoownername;
	    }
       

	    /**
		*
		*/
		
        public int getVideostatus() {
     
		return videostatus;
	    }
        
	    public void setVideostatus(int videostatus) {
		this.videostatus = videostatus;
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
       
      /*  public static aihao_dao convert(mvnforumvideo_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setVideoid(_dao.getVideoid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setVideotitle(_dao.getVideotitle());
        
        temp.setVideoimg(_dao.getVideoimg());
        
        temp.setFolderpart(_dao.getFolderpart());
        
        temp.setVideourl(_dao.getVideourl());
        
        temp.setVideofilesize(_dao.getVideofilesize());
        
        temp.setVideocreationdate(_dao.getVideocreationdate());
        
        temp.setVideomodifieddate(_dao.getVideomodifieddate());
        
        temp.setVideoownername(_dao.getVideoownername());
        
        temp.setVideostatus(_dao.getVideostatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

