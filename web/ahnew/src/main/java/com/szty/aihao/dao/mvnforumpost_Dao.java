/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumpostEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMPOST数据实体
    *@作者：宋春林 
    */

	public class mvnforumpost_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int postid;
        /**
	     * 
	     */
		private int parentpostid;
        /**
	     * 
	     */
		private int forumid;
        /**
	     * 
	     */
		private int threadid;
        /**
	     * 
	     */
		private int memberid;
        /**
	     * 
	     */
		private String membername;
        /**
	     * 
	     */
		private String lasteditmembername;
        /**
	     * 
	     */
		private String posttopic;
        /**
	     * 
	     */
		private String postbody;
        /**
	     * 
	     */
		private Date postcreationdate;
        /**
	     * 
	     */
		private Date postlasteditdate;
        /**
	     * 
	     */
		private String postcreationip;
        /**
	     * 
	     */
		private String postlasteditip;
        /**
	     * 
	     */
		private int posteditcount;
        /**
	     * 
	     */
		private int postformatoption;
        /**
	     * 
	     */
		private int postoption;
        /**
	     * 
	     */
		private int poststatus;
        /**
	     * 
	     */
		private String posticon;
        /**
	     * 
	     */
		private int postattachcount;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getPostid() {
     
		return postid;
	    }
        
	    public void setPostid(int postid) {
		this.postid = postid;
	    }
       

	    /**
		*
		*/
		
        public int getParentpostid() {
     
		return parentpostid;
	    }
        
	    public void setParentpostid(int parentpostid) {
		this.parentpostid = parentpostid;
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
		
        public int getThreadid() {
     
		return threadid;
	    }
        
	    public void setThreadid(int threadid) {
		this.threadid = threadid;
	    }
       

	    /**
		*
		*/
		
        public int getMemberid() {
     
		return memberid;
	    }
        
	    public void setMemberid(int memberid) {
		this.memberid = memberid;
	    }
       

	    /**
		*
		*/
		
        public String getMembername() {
     
		return membername;
	    }
        
	    public void setMembername(String membername) {
		this.membername = membername;
	    }
       

	    /**
		*
		*/
		
        public String getLasteditmembername() {
     
		return lasteditmembername;
	    }
        
	    public void setLasteditmembername(String lasteditmembername) {
		this.lasteditmembername = lasteditmembername;
	    }
       

	    /**
		*
		*/
		
        public String getPosttopic() {
     
		return posttopic;
	    }
        
	    public void setPosttopic(String posttopic) {
		this.posttopic = posttopic;
	    }
       

	    /**
		*
		*/
		
        public String getPostbody() {
     
		return postbody;
	    }
        
	    public void setPostbody(String postbody) {
		this.postbody = postbody;
	    }
       

	    /**
		*
		*/
		
        public Date getPostcreationdate() {
     
		return postcreationdate;
	    }
        
	    public void setPostcreationdate(Date postcreationdate) {
		this.postcreationdate = postcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getPostlasteditdate() {
     
		return postlasteditdate;
	    }
        
	    public void setPostlasteditdate(Date postlasteditdate) {
		this.postlasteditdate = postlasteditdate;
	    }
       

	    /**
		*
		*/
		
        public String getPostcreationip() {
     
		return postcreationip;
	    }
        
	    public void setPostcreationip(String postcreationip) {
		this.postcreationip = postcreationip;
	    }
       

	    /**
		*
		*/
		
        public String getPostlasteditip() {
     
		return postlasteditip;
	    }
        
	    public void setPostlasteditip(String postlasteditip) {
		this.postlasteditip = postlasteditip;
	    }
       

	    /**
		*
		*/
		
        public int getPosteditcount() {
     
		return posteditcount;
	    }
        
	    public void setPosteditcount(int posteditcount) {
		this.posteditcount = posteditcount;
	    }
       

	    /**
		*
		*/
		
        public int getPostformatoption() {
     
		return postformatoption;
	    }
        
	    public void setPostformatoption(int postformatoption) {
		this.postformatoption = postformatoption;
	    }
       

	    /**
		*
		*/
		
        public int getPostoption() {
     
		return postoption;
	    }
        
	    public void setPostoption(int postoption) {
		this.postoption = postoption;
	    }
       

	    /**
		*
		*/
		
        public int getPoststatus() {
     
		return poststatus;
	    }
        
	    public void setPoststatus(int poststatus) {
		this.poststatus = poststatus;
	    }
       

	    /**
		*
		*/
		
        public String getPosticon() {
     
		return posticon;
	    }
        
	    public void setPosticon(String posticon) {
		this.posticon = posticon;
	    }
       

	    /**
		*
		*/
		
        public int getPostattachcount() {
     
		return postattachcount;
	    }
        
	    public void setPostattachcount(int postattachcount) {
		this.postattachcount = postattachcount;
	    }
       
      /*  public static aihao_dao convert(mvnforumpost_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPostid(_dao.getPostid());
        
        temp.setParentpostid(_dao.getParentpostid());
        
        temp.setForumid(_dao.getForumid());
        
        temp.setThreadid(_dao.getThreadid());
        
        temp.setMemberid(_dao.getMemberid());
        
        temp.setMembername(_dao.getMembername());
        
        temp.setLasteditmembername(_dao.getLasteditmembername());
        
        temp.setPosttopic(_dao.getPosttopic());
        
        temp.setPostbody(_dao.getPostbody());
        
        temp.setPostcreationdate(_dao.getPostcreationdate());
        
        temp.setPostlasteditdate(_dao.getPostlasteditdate());
        
        temp.setPostcreationip(_dao.getPostcreationip());
        
        temp.setPostlasteditip(_dao.getPostlasteditip());
        
        temp.setPosteditcount(_dao.getPosteditcount());
        
        temp.setPostformatoption(_dao.getPostformatoption());
        
        temp.setPostoption(_dao.getPostoption());
        
        temp.setPoststatus(_dao.getPoststatus());
        
        temp.setPosticon(_dao.getPosticon());
        
        temp.setPostattachcount(_dao.getPostattachcount());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

