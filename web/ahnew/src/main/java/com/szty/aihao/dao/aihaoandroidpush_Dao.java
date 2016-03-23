/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaoandroidpushEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOANDROIDPUSH数据实体
    *@作者：宋春林 
    */

	public class aihaoandroidpush_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String imsi;
        /**
	     * 
	     */
		private String msg;
        /**
	     * 
	     */
		private String url;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private int pushtype;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getImsi() {
     
		return imsi;
	    }
        
	    public void setImsi(String imsi) {
		this.imsi = imsi;
	    }
       

	    /**
		*
		*/
		
        public String getMsg() {
     
		return msg;
	    }
        
	    public void setMsg(String msg) {
		this.msg = msg;
	    }
       

	    /**
		*
		*/
		
        public String getUrl() {
     
		return url;
	    }
        
	    public void setUrl(String url) {
		this.url = url;
	    }
       

	    /**
		*
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       

	    /**
		*
		*/
		
        public int getPushtype() {
     
		return pushtype;
	    }
        
	    public void setPushtype(int pushtype) {
		this.pushtype = pushtype;
	    }
       
      /*  public static aihao_dao convert(aihaoandroidpush_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setImsi(_dao.getImsi());
        
        temp.setMsg(_dao.getMsg());
        
        temp.setUrl(_dao.getUrl());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setPushtype(_dao.getPushtype());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

