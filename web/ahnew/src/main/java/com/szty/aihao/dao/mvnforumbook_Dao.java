/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumbookEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMBOOK数据实体
    *@作者：宋春林 
    */

	public class mvnforumbook_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int bookid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private String bookname;
        /**
	     * 
	     */
		private String bookdescription;
        /**
	     * 
	     */
		private String bookauthor;
        /**
	     * 
	     */
		private int bookcategory;
        /**
	     * 
	     */
		private String bookicon;
        /**
	     * 
	     */
		private int bookchapterscount;
        /**
	     * 
	     */
		private int bookjarcount;
        /**
	     * 
	     */
		private String booklisturl;
        /**
	     * 
	     */
		private String bookcopyright;
        /**
	     * 
	     */
		private int bookseries;
        /**
	     * 
	     */
		private Date bookcreationdate;
        /**
	     * 
	     */
		private Date bookmodifieddate;
        /**
	     * 
	     */
		private String bookownername;
        /**
	     * 
	     */
		private int bookstatus;
        /**
	     * 
	     */
		private int viewcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public int getForumid() {
     
		return forumid;
	    }
        
	    public void setForumid(int forumid) {
		this.forumid = forumid;
	    }
       

	    /**
		*
		*/
		
        public String getBookname() {
     
		return bookname;
	    }
        
	    public void setBookname(String bookname) {
		this.bookname = bookname;
	    }
       

	    /**
		*
		*/
		
        public String getBookdescription() {
     
		return bookdescription;
	    }
        
	    public void setBookdescription(String bookdescription) {
		this.bookdescription = bookdescription;
	    }
       

	    /**
		*
		*/
		
        public String getBookauthor() {
     
		return bookauthor;
	    }
        
	    public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	    }
       

	    /**
		*
		*/
		
        public int getBookcategory() {
     
		return bookcategory;
	    }
        
	    public void setBookcategory(int bookcategory) {
		this.bookcategory = bookcategory;
	    }
       

	    /**
		*
		*/
		
        public String getBookicon() {
     
		return bookicon;
	    }
        
	    public void setBookicon(String bookicon) {
		this.bookicon = bookicon;
	    }
       

	    /**
		*
		*/
		
        public int getBookchapterscount() {
     
		return bookchapterscount;
	    }
        
	    public void setBookchapterscount(int bookchapterscount) {
		this.bookchapterscount = bookchapterscount;
	    }
       

	    /**
		*
		*/
		
        public int getBookjarcount() {
     
		return bookjarcount;
	    }
        
	    public void setBookjarcount(int bookjarcount) {
		this.bookjarcount = bookjarcount;
	    }
       

	    /**
		*
		*/
		
        public String getBooklisturl() {
     
		return booklisturl;
	    }
        
	    public void setBooklisturl(String booklisturl) {
		this.booklisturl = booklisturl;
	    }
       

	    /**
		*
		*/
		
        public String getBookcopyright() {
     
		return bookcopyright;
	    }
        
	    public void setBookcopyright(String bookcopyright) {
		this.bookcopyright = bookcopyright;
	    }
       

	    /**
		*
		*/
		
        public int getBookseries() {
     
		return bookseries;
	    }
        
	    public void setBookseries(int bookseries) {
		this.bookseries = bookseries;
	    }
       

	    /**
		*
		*/
		
        public Date getBookcreationdate() {
     
		return bookcreationdate;
	    }
        
	    public void setBookcreationdate(Date bookcreationdate) {
		this.bookcreationdate = bookcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getBookmodifieddate() {
     
		return bookmodifieddate;
	    }
        
	    public void setBookmodifieddate(Date bookmodifieddate) {
		this.bookmodifieddate = bookmodifieddate;
	    }
       

	    /**
		*
		*/
		
        public String getBookownername() {
     
		return bookownername;
	    }
        
	    public void setBookownername(String bookownername) {
		this.bookownername = bookownername;
	    }
       

	    /**
		*
		*/
		
        public int getBookstatus() {
     
		return bookstatus;
	    }
        
	    public void setBookstatus(int bookstatus) {
		this.bookstatus = bookstatus;
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
       
      /*  public static aihao_dao convert(mvnforumbook_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setBookid(_dao.getBookid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setBookname(_dao.getBookname());
        
        temp.setBookdescription(_dao.getBookdescription());
        
        temp.setBookauthor(_dao.getBookauthor());
        
        temp.setBookcategory(_dao.getBookcategory());
        
        temp.setBookicon(_dao.getBookicon());
        
        temp.setBookchapterscount(_dao.getBookchapterscount());
        
        temp.setBookjarcount(_dao.getBookjarcount());
        
        temp.setBooklisturl(_dao.getBooklisturl());
        
        temp.setBookcopyright(_dao.getBookcopyright());
        
        temp.setBookseries(_dao.getBookseries());
        
        temp.setBookcreationdate(_dao.getBookcreationdate());
        
        temp.setBookmodifieddate(_dao.getBookmodifieddate());
        
        temp.setBookownername(_dao.getBookownername());
        
        temp.setBookstatus(_dao.getBookstatus());
        
        temp.setViewcount(_dao.getViewcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

