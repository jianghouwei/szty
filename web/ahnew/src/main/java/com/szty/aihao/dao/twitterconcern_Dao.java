/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： twitterconcernEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TWITTERCONCERN数据实体
    *@作者：宋春林 
    */

	public class twitterconcern_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int concernid;
        /**
	     * 
	     */
		private int userid;
        /**
	     * 
	     */
		private int passiveuserid;
        /**
	     * 
	     */
		private Date concerntime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getConcernid() {
     
		return concernid;
	    }
        
	    public void setConcernid(int concernid) {
		this.concernid = concernid;
	    }
       

	    /**
		*
		*/
		
        public int getUserid() {
     
		return userid;
	    }
        
	    public void setUserid(int userid) {
		this.userid = userid;
	    }
       

	    /**
		*
		*/
		
        public int getPassiveuserid() {
     
		return passiveuserid;
	    }
        
	    public void setPassiveuserid(int passiveuserid) {
		this.passiveuserid = passiveuserid;
	    }
       

	    /**
		*
		*/
		
        public Date getConcerntime() {
     
		return concerntime;
	    }
        
	    public void setConcerntime(Date concerntime) {
		this.concerntime = concerntime;
	    }
       
      /*  public static aihao_dao convert(twitterconcern_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setConcernid(_dao.getConcernid());
        
        temp.setUserid(_dao.getUserid());
        
        temp.setPassiveuserid(_dao.getPassiveuserid());
        
        temp.setConcerntime(_dao.getConcerntime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

