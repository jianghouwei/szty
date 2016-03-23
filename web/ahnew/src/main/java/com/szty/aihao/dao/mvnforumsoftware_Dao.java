/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsoftwareEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSOFTWARE数据实体
    *@作者：宋春林 
    */

	public class mvnforumsoftware_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int softwareid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private String softwarename;
        /**
	     * 
	     */
		private int softwarenature;
        /**
	     * 
	     */
		private int softwarecategory;
        /**
	     * 
	     */
		private String softwaretags;
        /**
	     * 
	     */
		private String softwarelanguage;
        /**
	     * 
	     */
		private String softwaredesc;
        /**
	     * 
	     */
		private String softwarelogo;
        /**
	     * 
	     */
		private String softwareimg;
        /**
	     * 
	     */
		private String softwarefilename;
        /**
	     * 
	     */
		private String folderpart;
        /**
	     * 
	     */
		private Date softwarecreationdate;
        /**
	     * 
	     */
		private Date softwaremodifieddate;
        /**
	     * 
	     */
		private String softwareownername;
        /**
	     * 
	     */
		private int softwarestatus;
        /**
	     * 
	     */
		private int viewcount;
        /**
	     * 
	     */
		private int downloadcount;
        /**
	     * 
	     */
		private int favoritecount;
        /**
	     * 
	     */
		private int commentcount;
        /**
	     * 
	     */
		private int scoring;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getSoftwareid() {
     
		return softwareid;
	    }
        
	    public void setSoftwareid(int softwareid) {
		this.softwareid = softwareid;
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
		
        public String getSoftwarename() {
     
		return softwarename;
	    }
        
	    public void setSoftwarename(String softwarename) {
		this.softwarename = softwarename;
	    }
       

	    /**
		*
		*/
		
        public int getSoftwarenature() {
     
		return softwarenature;
	    }
        
	    public void setSoftwarenature(int softwarenature) {
		this.softwarenature = softwarenature;
	    }
       

	    /**
		*
		*/
		
        public int getSoftwarecategory() {
     
		return softwarecategory;
	    }
        
	    public void setSoftwarecategory(int softwarecategory) {
		this.softwarecategory = softwarecategory;
	    }
       

	    /**
		*
		*/
		
        public String getSoftwaretags() {
     
		return softwaretags;
	    }
        
	    public void setSoftwaretags(String softwaretags) {
		this.softwaretags = softwaretags;
	    }
       

	    /**
		*
		*/
		
        public String getSoftwarelanguage() {
     
		return softwarelanguage;
	    }
        
	    public void setSoftwarelanguage(String softwarelanguage) {
		this.softwarelanguage = softwarelanguage;
	    }
       

	    /**
		*
		*/
		
        public String getSoftwaredesc() {
     
		return softwaredesc;
	    }
        
	    public void setSoftwaredesc(String softwaredesc) {
		this.softwaredesc = softwaredesc;
	    }
       

	    /**
		*
		*/
		
        public String getSoftwarelogo() {
     
		return softwarelogo;
	    }
        
	    public void setSoftwarelogo(String softwarelogo) {
		this.softwarelogo = softwarelogo;
	    }
       

	    /**
		*
		*/
		
        public String getSoftwareimg() {
     
		return softwareimg;
	    }
        
	    public void setSoftwareimg(String softwareimg) {
		this.softwareimg = softwareimg;
	    }
       

	    /**
		*
		*/
		
        public String getSoftwarefilename() {
     
		return softwarefilename;
	    }
        
	    public void setSoftwarefilename(String softwarefilename) {
		this.softwarefilename = softwarefilename;
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
		
        public Date getSoftwarecreationdate() {
     
		return softwarecreationdate;
	    }
        
	    public void setSoftwarecreationdate(Date softwarecreationdate) {
		this.softwarecreationdate = softwarecreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getSoftwaremodifieddate() {
     
		return softwaremodifieddate;
	    }
        
	    public void setSoftwaremodifieddate(Date softwaremodifieddate) {
		this.softwaremodifieddate = softwaremodifieddate;
	    }
       

	    /**
		*
		*/
		
        public String getSoftwareownername() {
     
		return softwareownername;
	    }
        
	    public void setSoftwareownername(String softwareownername) {
		this.softwareownername = softwareownername;
	    }
       

	    /**
		*
		*/
		
        public int getSoftwarestatus() {
     
		return softwarestatus;
	    }
        
	    public void setSoftwarestatus(int softwarestatus) {
		this.softwarestatus = softwarestatus;
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
       

	    /**
		*
		*/
		
        public int getDownloadcount() {
     
		return downloadcount;
	    }
        
	    public void setDownloadcount(int downloadcount) {
		this.downloadcount = downloadcount;
	    }
       

	    /**
		*
		*/
		
        public int getFavoritecount() {
     
		return favoritecount;
	    }
        
	    public void setFavoritecount(int favoritecount) {
		this.favoritecount = favoritecount;
	    }
       

	    /**
		*
		*/
		
        public int getCommentcount() {
     
		return commentcount;
	    }
        
	    public void setCommentcount(int commentcount) {
		this.commentcount = commentcount;
	    }
       

	    /**
		*
		*/
		
        public int getScoring() {
     
		return scoring;
	    }
        
	    public void setScoring(int scoring) {
		this.scoring = scoring;
	    }
       
      /*  public static aihao_dao convert(mvnforumsoftware_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setSoftwareid(_dao.getSoftwareid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setSoftwarename(_dao.getSoftwarename());
        
        temp.setSoftwarenature(_dao.getSoftwarenature());
        
        temp.setSoftwarecategory(_dao.getSoftwarecategory());
        
        temp.setSoftwaretags(_dao.getSoftwaretags());
        
        temp.setSoftwarelanguage(_dao.getSoftwarelanguage());
        
        temp.setSoftwaredesc(_dao.getSoftwaredesc());
        
        temp.setSoftwarelogo(_dao.getSoftwarelogo());
        
        temp.setSoftwareimg(_dao.getSoftwareimg());
        
        temp.setSoftwarefilename(_dao.getSoftwarefilename());
        
        temp.setFolderpart(_dao.getFolderpart());
        
        temp.setSoftwarecreationdate(_dao.getSoftwarecreationdate());
        
        temp.setSoftwaremodifieddate(_dao.getSoftwaremodifieddate());
        
        temp.setSoftwareownername(_dao.getSoftwareownername());
        
        temp.setSoftwarestatus(_dao.getSoftwarestatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        temp.setDownloadcount(_dao.getDownloadcount());
        
        temp.setFavoritecount(_dao.getFavoritecount());
        
        temp.setCommentcount(_dao.getCommentcount());
        
        temp.setScoring(_dao.getScoring());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

