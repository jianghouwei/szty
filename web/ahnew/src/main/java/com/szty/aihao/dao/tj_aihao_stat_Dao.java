/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： tj_aihao_statEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TJ_AIHAO_STAT数据实体
    *@作者：宋春林 
    */

	public class tj_aihao_stat_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String cdate;
        /**
	     * 
	     */
		private String os;
        /**
	     * 
	     */
		private String channelid;
        /**
	     * 
	     */
		private int active_users_month;
        /**
	     * 
	     */
		private String data_category;
        /**
	     * 
	     */
		private String time_category;
        /**
	     * 
	     */
		private int num;
        /**
	     * 
	     */
		private String opname;
        /**
	     * 
	     */
		private String vername;
        /**
	     * 
	     */
		private int active_users_day;
        /**
	     * 
	     */
		private int active_users_week;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(String cdate) {
		this.cdate = cdate;
	    }
       

	    /**
		*
		*/
		
        public String getOs() {
     
		return os;
	    }
        
	    public void setOs(String os) {
		this.os = os;
	    }
       

	    /**
		*
		*/
		
        public String getChannelid() {
     
		return channelid;
	    }
        
	    public void setChannelid(String channelid) {
		this.channelid = channelid;
	    }
       

	    /**
		*
		*/
		
        public int getActive_users_month() {
     
		return active_users_month;
	    }
        
	    public void setActive_users_month(int active_users_month) {
		this.active_users_month = active_users_month;
	    }
       

	    /**
		*
		*/
		
        public String getData_category() {
     
		return data_category;
	    }
        
	    public void setData_category(String data_category) {
		this.data_category = data_category;
	    }
       

	    /**
		*
		*/
		
        public String getTime_category() {
     
		return time_category;
	    }
        
	    public void setTime_category(String time_category) {
		this.time_category = time_category;
	    }
       

	    /**
		*
		*/
		
        public int getNum() {
     
		return num;
	    }
        
	    public void setNum(int num) {
		this.num = num;
	    }
       

	    /**
		*
		*/
		
        public String getOpname() {
     
		return opname;
	    }
        
	    public void setOpname(String opname) {
		this.opname = opname;
	    }
       

	    /**
		*
		*/
		
        public String getVername() {
     
		return vername;
	    }
        
	    public void setVername(String vername) {
		this.vername = vername;
	    }
       

	    /**
		*
		*/
		
        public int getActive_users_day() {
     
		return active_users_day;
	    }
        
	    public void setActive_users_day(int active_users_day) {
		this.active_users_day = active_users_day;
	    }
       

	    /**
		*
		*/
		
        public int getActive_users_week() {
     
		return active_users_week;
	    }
        
	    public void setActive_users_week(int active_users_week) {
		this.active_users_week = active_users_week;
	    }
       
      /*  public static aihao_dao convert(tj_aihao_stat_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setCdate(_dao.getCdate());
        
        temp.setOs(_dao.getOs());
        
        temp.setChannelid(_dao.getChannelid());
        
        temp.setActive_users_month(_dao.getActive_users_month());
        
        temp.setData_category(_dao.getData_category());
        
        temp.setTime_category(_dao.getTime_category());
        
        temp.setNum(_dao.getNum());
        
        temp.setOpname(_dao.getOpname());
        
        temp.setVername(_dao.getVername());
        
        temp.setActive_users_day(_dao.getActive_users_day());
        
        temp.setActive_users_week(_dao.getActive_users_week());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

