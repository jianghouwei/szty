/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforummessagestatisticsEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMMESSAGESTATISTICS数据实体
    *@作者：宋春林 
    */

	public class mvnforummessagestatistics_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int fromid;
        /**
	     * 
	     */
		private int toid;
        /**
	     * 
	     */
		private Date messagecreationdate;
        /**
	     * 
	     */
		private int messageattachcount;
        /**
	     * 
	     */
		private int messagetype;
        /**
	     * 
	     */
		private int messageoption;
        /**
	     * 
	     */
		private int messagestatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getFromid() {
     
		return fromid;
	    }
        
	    public void setFromid(int fromid) {
		this.fromid = fromid;
	    }
       

	    /**
		*
		*/
		
        public int getToid() {
     
		return toid;
	    }
        
	    public void setToid(int toid) {
		this.toid = toid;
	    }
       

	    /**
		*
		*/
		
        public Date getMessagecreationdate() {
     
		return messagecreationdate;
	    }
        
	    public void setMessagecreationdate(Date messagecreationdate) {
		this.messagecreationdate = messagecreationdate;
	    }
       

	    /**
		*
		*/
		
        public int getMessageattachcount() {
     
		return messageattachcount;
	    }
        
	    public void setMessageattachcount(int messageattachcount) {
		this.messageattachcount = messageattachcount;
	    }
       

	    /**
		*
		*/
		
        public int getMessagetype() {
     
		return messagetype;
	    }
        
	    public void setMessagetype(int messagetype) {
		this.messagetype = messagetype;
	    }
       

	    /**
		*
		*/
		
        public int getMessageoption() {
     
		return messageoption;
	    }
        
	    public void setMessageoption(int messageoption) {
		this.messageoption = messageoption;
	    }
       

	    /**
		*
		*/
		
        public int getMessagestatus() {
     
		return messagestatus;
	    }
        
	    public void setMessagestatus(int messagestatus) {
		this.messagestatus = messagestatus;
	    }
       
      /*  public static aihao_dao convert(mvnforummessagestatistics_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setFromid(_dao.getFromid());
        
        temp.setToid(_dao.getToid());
        
        temp.setMessagecreationdate(_dao.getMessagecreationdate());
        
        temp.setMessageattachcount(_dao.getMessageattachcount());
        
        temp.setMessagetype(_dao.getMessagetype());
        
        temp.setMessageoption(_dao.getMessageoption());
        
        temp.setMessagestatus(_dao.getMessagestatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

