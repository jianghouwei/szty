/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumbookchaptersEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMBOOKCHAPTERS数据实体
    *@作者：宋春林 
    */

	public class mvnforumbookchapters_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int chaptersid;
        /**
	     * 
	     */
		private int bookid;
        /**
	     * 
	     */
		private int jarid;
        /**
	     * 
	     */
		private String chaptersname;
        /**
	     * 
	     */
		private String chaptersfolder;
        /**
	     * 
	     */
		private String chaptersurl;
        /**
	     * 
	     */
		private int chapterssize;
        /**
	     * 
	     */
		private String subvolumes;
        /**
	     * 
	     */
		private Date chapterscreationdate;
        /**
	     * 
	     */
		private Date chaptersmodifieddate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getChaptersid() {
     
		return chaptersid;
	    }
        
	    public void setChaptersid(int chaptersid) {
		this.chaptersid = chaptersid;
	    }
       

	    /**
		*
		*/
		
        public int getBookid() {
     
		return bookid;
	    }
        
	    public void setBookid(int bookid) {
		this.bookid = bookid;
	    }
       

	    /**
		*
		*/
		
        public int getJarid() {
     
		return jarid;
	    }
        
	    public void setJarid(int jarid) {
		this.jarid = jarid;
	    }
       

	    /**
		*
		*/
		
        public String getChaptersname() {
     
		return chaptersname;
	    }
        
	    public void setChaptersname(String chaptersname) {
		this.chaptersname = chaptersname;
	    }
       

	    /**
		*
		*/
		
        public String getChaptersfolder() {
     
		return chaptersfolder;
	    }
        
	    public void setChaptersfolder(String chaptersfolder) {
		this.chaptersfolder = chaptersfolder;
	    }
       

	    /**
		*
		*/
		
        public String getChaptersurl() {
     
		return chaptersurl;
	    }
        
	    public void setChaptersurl(String chaptersurl) {
		this.chaptersurl = chaptersurl;
	    }
       

	    /**
		*
		*/
		
        public int getChapterssize() {
     
		return chapterssize;
	    }
        
	    public void setChapterssize(int chapterssize) {
		this.chapterssize = chapterssize;
	    }
       

	    /**
		*
		*/
		
        public String getSubvolumes() {
     
		return subvolumes;
	    }
        
	    public void setSubvolumes(String subvolumes) {
		this.subvolumes = subvolumes;
	    }
       

	    /**
		*
		*/
		
        public Date getChapterscreationdate() {
     
		return chapterscreationdate;
	    }
        
	    public void setChapterscreationdate(Date chapterscreationdate) {
		this.chapterscreationdate = chapterscreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getChaptersmodifieddate() {
     
		return chaptersmodifieddate;
	    }
        
	    public void setChaptersmodifieddate(Date chaptersmodifieddate) {
		this.chaptersmodifieddate = chaptersmodifieddate;
	    }
       
      /*  public static aihao_dao convert(mvnforumbookchapters_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setChaptersid(_dao.getChaptersid());
        
        temp.setBookid(_dao.getBookid());
        
        temp.setJarid(_dao.getJarid());
        
        temp.setChaptersname(_dao.getChaptersname());
        
        temp.setChaptersfolder(_dao.getChaptersfolder());
        
        temp.setChaptersurl(_dao.getChaptersurl());
        
        temp.setChapterssize(_dao.getChapterssize());
        
        temp.setSubvolumes(_dao.getSubvolumes());
        
        temp.setChapterscreationdate(_dao.getChapterscreationdate());
        
        temp.setChaptersmodifieddate(_dao.getChaptersmodifieddate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

