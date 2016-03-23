/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： gamedownlogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@GAMEDOWNLOG数据实体
    *@作者：宋春林 
    */

	public class gamedownlog_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int logid;
        /**
	     * 
	     */
		private String gameid;
        /**
	     * 
	     */
		private String downfrom;
        /**
	     * 
	     */
		private String downip;
        /**
	     * 
	     */
		private String downprovince;
        /**
	     * 
	     */
		private Date downcdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getLogid() {
     
		return logid;
	    }
        
	    public void setLogid(int logid) {
		this.logid = logid;
	    }
       

	    /**
		*
		*/
		
        public String getGameid() {
     
		return gameid;
	    }
        
	    public void setGameid(String gameid) {
		this.gameid = gameid;
	    }
       

	    /**
		*
		*/
		
        public String getDownfrom() {
     
		return downfrom;
	    }
        
	    public void setDownfrom(String downfrom) {
		this.downfrom = downfrom;
	    }
       

	    /**
		*
		*/
		
        public String getDownip() {
     
		return downip;
	    }
        
	    public void setDownip(String downip) {
		this.downip = downip;
	    }
       

	    /**
		*
		*/
		
        public String getDownprovince() {
     
		return downprovince;
	    }
        
	    public void setDownprovince(String downprovince) {
		this.downprovince = downprovince;
	    }
       

	    /**
		*
		*/
		
        public Date getDowncdate() {
     
		return downcdate;
	    }
        
	    public void setDowncdate(Date downcdate) {
		this.downcdate = downcdate;
	    }
       
      /*  public static aihao_dao convert(gamedownlog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLogid(_dao.getLogid());
        
        temp.setGameid(_dao.getGameid());
        
        temp.setDownfrom(_dao.getDownfrom());
        
        temp.setDownip(_dao.getDownip());
        
        temp.setDownprovince(_dao.getDownprovince());
        
        temp.setDowncdate(_dao.getDowncdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

