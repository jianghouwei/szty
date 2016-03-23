/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： tj_aihao_stat_newEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TJ_AIHAO_STAT_NEW数据实体
    *@作者：宋春林 
    */

	public class tj_aihao_stat_new_Dao implements Serializable
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
        /**
	     * 
	     */
		private String channame;
        /**
	     * 
	     */
		private String rmk1;
        /**
	     * 
	     */
		private String rmk2;
        /**
	     * 
	     */
		private String rmk3;
        /**
	     * 
	     */
		private String rmk4;
        
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
       

	    /**
		*
		*/
		
        public String getChanname() {
     
		return channame;
	    }
        
	    public void setChanname(String channame) {
		this.channame = channame;
	    }
       

	    /**
		*
		*/
		
        public String getRmk1() {
     
		return rmk1;
	    }
        
	    public void setRmk1(String rmk1) {
		this.rmk1 = rmk1;
	    }
       

	    /**
		*
		*/
		
        public String getRmk2() {
     
		return rmk2;
	    }
        
	    public void setRmk2(String rmk2) {
		this.rmk2 = rmk2;
	    }
       

	    /**
		*
		*/
		
        public String getRmk3() {
     
		return rmk3;
	    }
        
	    public void setRmk3(String rmk3) {
		this.rmk3 = rmk3;
	    }
       

	    /**
		*
		*/
		
        public String getRmk4() {
     
		return rmk4;
	    }
        
	    public void setRmk4(String rmk4) {
		this.rmk4 = rmk4;
	    }
       
      /*  public static aihao_dao convert(tj_aihao_stat_new_Dao _dao){
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
        
        temp.setChanname(_dao.getChanname());
        
        temp.setRmk1(_dao.getRmk1());
        
        temp.setRmk2(_dao.getRmk2());
        
        temp.setRmk3(_dao.getRmk3());
        
        temp.setRmk4(_dao.getRmk4());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

