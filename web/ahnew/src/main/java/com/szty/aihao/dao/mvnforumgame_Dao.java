/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumgameEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMGAME数据实体
    *@作者：宋春林 
    */

	public class mvnforumgame_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int gameid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private String gamename;
        /**
	     * 
	     */
		private int gamenature;
        /**
	     * 
	     */
		private int gamecategory;
        /**
	     * 
	     */
		private String gametags;
        /**
	     * 
	     */
		private String gamelanguage;
        /**
	     * 
	     */
		private String gamedesc;
        /**
	     * 
	     */
		private String gamelogo;
        /**
	     * 
	     */
		private String gameimg;
        /**
	     * 
	     */
		private String folderpart;
        /**
	     * 
	     */
		private Date gamecreationdate;
        /**
	     * 
	     */
		private Date gamemodifieddate;
        /**
	     * 
	     */
		private String gameownername;
        /**
	     * 
	     */
		private int gamestatus;
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
		
        public int getGameid() {
     
		return gameid;
	    }
        
	    public void setGameid(int gameid) {
		this.gameid = gameid;
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
		
        public String getGamename() {
     
		return gamename;
	    }
        
	    public void setGamename(String gamename) {
		this.gamename = gamename;
	    }
       

	    /**
		*
		*/
		
        public int getGamenature() {
     
		return gamenature;
	    }
        
	    public void setGamenature(int gamenature) {
		this.gamenature = gamenature;
	    }
       

	    /**
		*
		*/
		
        public int getGamecategory() {
     
		return gamecategory;
	    }
        
	    public void setGamecategory(int gamecategory) {
		this.gamecategory = gamecategory;
	    }
       

	    /**
		*
		*/
		
        public String getGametags() {
     
		return gametags;
	    }
        
	    public void setGametags(String gametags) {
		this.gametags = gametags;
	    }
       

	    /**
		*
		*/
		
        public String getGamelanguage() {
     
		return gamelanguage;
	    }
        
	    public void setGamelanguage(String gamelanguage) {
		this.gamelanguage = gamelanguage;
	    }
       

	    /**
		*
		*/
		
        public String getGamedesc() {
     
		return gamedesc;
	    }
        
	    public void setGamedesc(String gamedesc) {
		this.gamedesc = gamedesc;
	    }
       

	    /**
		*
		*/
		
        public String getGamelogo() {
     
		return gamelogo;
	    }
        
	    public void setGamelogo(String gamelogo) {
		this.gamelogo = gamelogo;
	    }
       

	    /**
		*
		*/
		
        public String getGameimg() {
     
		return gameimg;
	    }
        
	    public void setGameimg(String gameimg) {
		this.gameimg = gameimg;
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
		
        public Date getGamecreationdate() {
     
		return gamecreationdate;
	    }
        
	    public void setGamecreationdate(Date gamecreationdate) {
		this.gamecreationdate = gamecreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getGamemodifieddate() {
     
		return gamemodifieddate;
	    }
        
	    public void setGamemodifieddate(Date gamemodifieddate) {
		this.gamemodifieddate = gamemodifieddate;
	    }
       

	    /**
		*
		*/
		
        public String getGameownername() {
     
		return gameownername;
	    }
        
	    public void setGameownername(String gameownername) {
		this.gameownername = gameownername;
	    }
       

	    /**
		*
		*/
		
        public int getGamestatus() {
     
		return gamestatus;
	    }
        
	    public void setGamestatus(int gamestatus) {
		this.gamestatus = gamestatus;
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
       
      /*  public static aihao_dao convert(mvnforumgame_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGameid(_dao.getGameid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setGamename(_dao.getGamename());
        
        temp.setGamenature(_dao.getGamenature());
        
        temp.setGamecategory(_dao.getGamecategory());
        
        temp.setGametags(_dao.getGametags());
        
        temp.setGamelanguage(_dao.getGamelanguage());
        
        temp.setGamedesc(_dao.getGamedesc());
        
        temp.setGamelogo(_dao.getGamelogo());
        
        temp.setGameimg(_dao.getGameimg());
        
        temp.setFolderpart(_dao.getFolderpart());
        
        temp.setGamecreationdate(_dao.getGamecreationdate());
        
        temp.setGamemodifieddate(_dao.getGamemodifieddate());
        
        temp.setGameownername(_dao.getGameownername());
        
        temp.setGamestatus(_dao.getGamestatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        temp.setDownloadcount(_dao.getDownloadcount());
        
        temp.setFavoritecount(_dao.getFavoritecount());
        
        temp.setCommentcount(_dao.getCommentcount());
        
        temp.setScoring(_dao.getScoring());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

