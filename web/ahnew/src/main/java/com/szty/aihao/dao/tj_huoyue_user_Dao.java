/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： tj_huoyue_userEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@TJ_HUOYUE_USER数据实体
    *@作者：宋春林 
    */

	public class tj_huoyue_user_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private int num;
        /**
	     * 
	     */
		private int data_type;
        /**
	     * 
	     */
		private int days_type;
        /**
	     * 
	     */
		private int week_or_month;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public int getNum() {
     
		return num;
	    }
        
	    public void setNum(int num) {
		this.num = num;
	    }
       

	    /**
		*
		*/
		
        public int getData_type() {
     
		return data_type;
	    }
        
	    public void setData_type(int data_type) {
		this.data_type = data_type;
	    }
       

	    /**
		*
		*/
		
        public int getDays_type() {
     
		return days_type;
	    }
        
	    public void setDays_type(int days_type) {
		this.days_type = days_type;
	    }
       

	    /**
		*
		*/
		
        public int getWeek_or_month() {
     
		return week_or_month;
	    }
        
	    public void setWeek_or_month(int week_or_month) {
		this.week_or_month = week_or_month;
	    }
       
      /*  public static aihao_dao convert(tj_huoyue_user_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setCdate(_dao.getCdate());
        
        temp.setNum(_dao.getNum());
        
        temp.setData_type(_dao.getData_type());
        
        temp.setDays_type(_dao.getDays_type());
        
        temp.setWeek_or_month(_dao.getWeek_or_month());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

