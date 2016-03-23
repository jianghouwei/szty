/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： gpushlogEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@GPUSHLOG数据实体
    *@作者：宋春林 
    */

	public class gpushlog_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int gpuahlogid;
        /**
	     * 
	     */
		private String alias;
        /**
	     * 
	     */
		private String title;
        /**
	     * 
	     */
		private String msg;
        /**
	     * 
	     */
		private String extra;
        /**
	     * 
	     */
		private String errorcode;
        /**
	     * 
	     */
		private String errormsg;
        /**
	     * 
	     */
		private Date cdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getGpuahlogid() {
     
		return gpuahlogid;
	    }
        
	    public void setGpuahlogid(int gpuahlogid) {
		this.gpuahlogid = gpuahlogid;
	    }
       

	    /**
		*
		*/
		
        public String getAlias() {
     
		return alias;
	    }
        
	    public void setAlias(String alias) {
		this.alias = alias;
	    }
       

	    /**
		*
		*/
		
        public String getTitle() {
     
		return title;
	    }
        
	    public void setTitle(String title) {
		this.title = title;
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
		
        public String getExtra() {
     
		return extra;
	    }
        
	    public void setExtra(String extra) {
		this.extra = extra;
	    }
       

	    /**
		*
		*/
		
        public String getErrorcode() {
     
		return errorcode;
	    }
        
	    public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	    }
       

	    /**
		*
		*/
		
        public String getErrormsg() {
     
		return errormsg;
	    }
        
	    public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
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
       
      /*  public static aihao_dao convert(gpushlog_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGpuahlogid(_dao.getGpuahlogid());
        
        temp.setAlias(_dao.getAlias());
        
        temp.setTitle(_dao.getTitle());
        
        temp.setMsg(_dao.getMsg());
        
        temp.setExtra(_dao.getExtra());
        
        temp.setErrorcode(_dao.getErrorcode());
        
        temp.setErrormsg(_dao.getErrormsg());
        
        temp.setCdate(_dao.getCdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

