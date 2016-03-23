/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumbookjarEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMBOOKJAR数据实体
    *@作者：宋春林 
    */

	public class mvnforumbookjar_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int jarid;
        /**
	     * 
	     */
		private int bookid;
        /**
	     * 
	     */
		private String jardescription;
        /**
	     * 
	     */
		private String jartexturl;
        /**
	     * 
	     */
		private int jartextsize;
        /**
	     * 
	     */
		private String jarjarurl;
        /**
	     * 
	     */
		private int jarjarsize;
        /**
	     * 
	     */
		private int jarchapterscount;
        /**
	     * 
	     */
		private Date jarcreationdate;
        /**
	     * 
	     */
		private Date jarmodifieddate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public int getBookid() {
     
		return bookid;
	    }
        
	    public void setBookid(int bookid) {
		this.bookid = bookid;
	    }
       

	    /**
		*
		*/
		
        public String getJardescription() {
     
		return jardescription;
	    }
        
	    public void setJardescription(String jardescription) {
		this.jardescription = jardescription;
	    }
       

	    /**
		*
		*/
		
        public String getJartexturl() {
     
		return jartexturl;
	    }
        
	    public void setJartexturl(String jartexturl) {
		this.jartexturl = jartexturl;
	    }
       

	    /**
		*
		*/
		
        public int getJartextsize() {
     
		return jartextsize;
	    }
        
	    public void setJartextsize(int jartextsize) {
		this.jartextsize = jartextsize;
	    }
       

	    /**
		*
		*/
		
        public String getJarjarurl() {
     
		return jarjarurl;
	    }
        
	    public void setJarjarurl(String jarjarurl) {
		this.jarjarurl = jarjarurl;
	    }
       

	    /**
		*
		*/
		
        public int getJarjarsize() {
     
		return jarjarsize;
	    }
        
	    public void setJarjarsize(int jarjarsize) {
		this.jarjarsize = jarjarsize;
	    }
       

	    /**
		*
		*/
		
        public int getJarchapterscount() {
     
		return jarchapterscount;
	    }
        
	    public void setJarchapterscount(int jarchapterscount) {
		this.jarchapterscount = jarchapterscount;
	    }
       

	    /**
		*
		*/
		
        public Date getJarcreationdate() {
     
		return jarcreationdate;
	    }
        
	    public void setJarcreationdate(Date jarcreationdate) {
		this.jarcreationdate = jarcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getJarmodifieddate() {
     
		return jarmodifieddate;
	    }
        
	    public void setJarmodifieddate(Date jarmodifieddate) {
		this.jarmodifieddate = jarmodifieddate;
	    }
       
      /*  public static aihao_dao convert(mvnforumbookjar_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setJarid(_dao.getJarid());
        
        temp.setBookid(_dao.getBookid());
        
        temp.setJardescription(_dao.getJardescription());
        
        temp.setJartexturl(_dao.getJartexturl());
        
        temp.setJartextsize(_dao.getJartextsize());
        
        temp.setJarjarurl(_dao.getJarjarurl());
        
        temp.setJarjarsize(_dao.getJarjarsize());
        
        temp.setJarchapterscount(_dao.getJarchapterscount());
        
        temp.setJarcreationdate(_dao.getJarcreationdate());
        
        temp.setJarmodifieddate(_dao.getJarmodifieddate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

