/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： gameactionlogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@GAMEACTIONLOG数据实体
    *@作者：宋春林 
    */

	public class gameactionlog_Dao implements Serializable
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
		private String gameaction;
        /**
	     * 
	     */
		private String actionip;
        /**
	     * 
	     */
		private String actionprovince;
        /**
	     * 
	     */
		private Date actioncdate;
        
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
		
        public String getGameaction() {
     
		return gameaction;
	    }
        
	    public void setGameaction(String gameaction) {
		this.gameaction = gameaction;
	    }
       

	    /**
		*
		*/
		
        public String getActionip() {
     
		return actionip;
	    }
        
	    public void setActionip(String actionip) {
		this.actionip = actionip;
	    }
       

	    /**
		*
		*/
		
        public String getActionprovince() {
     
		return actionprovince;
	    }
        
	    public void setActionprovince(String actionprovince) {
		this.actionprovince = actionprovince;
	    }
       

	    /**
		*
		*/
		
        public Date getActioncdate() {
     
		return actioncdate;
	    }
        
	    public void setActioncdate(Date actioncdate) {
		this.actioncdate = actioncdate;
	    }
       
      /*  public static aihao_dao convert(gameactionlog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLogid(_dao.getLogid());
        
        temp.setGameid(_dao.getGameid());
        
        temp.setGameaction(_dao.getGameaction());
        
        temp.setActionip(_dao.getActionip());
        
        temp.setActionprovince(_dao.getActionprovince());
        
        temp.setActioncdate(_dao.getActioncdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

