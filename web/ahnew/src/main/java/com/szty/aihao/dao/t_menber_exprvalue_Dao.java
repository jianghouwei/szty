/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： t_menber_exprvalueEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@T_MENBER_EXPRVALUE数据实体
    *@作者：宋春林 
    */

	public class t_menber_exprvalue_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 用户唯一标记
	     */
		private String uniquevalue;
        /**
	     * 获取经验值日期
	     */
		private String cdate;
        /**
	     * 获取经验值操作项ID
	     */
		private int itemid;
        /**
	     * 项操作次数
	     */
		private int times;
        /**
	     * 项经验值数
	     */
		private int exprunit;
        /**
	     * 获取经验值最大次数
	     */
		private int maxtimes;
        /**
	     * 获取项总经验值数
	     */
		private int exprvalues;
        /**
	     * 生成时间
	     */
		private Date datetime;
        /**
	     * 备注
	     */
		private String rmk;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*用户唯一标记
		*/
		
        public String getUniquevalue() {
     
		return uniquevalue;
	    }
        
	    public void setUniquevalue(String uniquevalue) {
		this.uniquevalue = uniquevalue;
	    }
       

	    /**
		*获取经验值日期
		*/
		
        public String getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(String cdate) {
		this.cdate = cdate;
	    }
       

	    /**
		*获取经验值操作项ID
		*/
		
        public int getItemid() {
     
		return itemid;
	    }
        
	    public void setItemid(int itemid) {
		this.itemid = itemid;
	    }
       

	    /**
		*项操作次数
		*/
		
        public int getTimes() {
     
		return times;
	    }
        
	    public void setTimes(int times) {
		this.times = times;
	    }
       

	    /**
		*项经验值数
		*/
		
        public int getExprunit() {
     
		return exprunit;
	    }
        
	    public void setExprunit(int exprunit) {
		this.exprunit = exprunit;
	    }
       

	    /**
		*获取经验值最大次数
		*/
		
        public int getMaxtimes() {
     
		return maxtimes;
	    }
        
	    public void setMaxtimes(int maxtimes) {
		this.maxtimes = maxtimes;
	    }
       

	    /**
		*获取项总经验值数
		*/
		
        public int getExprvalues() {
     
		return exprvalues;
	    }
        
	    public void setExprvalues(int exprvalues) {
		this.exprvalues = exprvalues;
	    }
       

	    /**
		*生成时间
		*/
		
        public Date getDatetime() {
     
		return datetime;
	    }
        
	    public void setDatetime(Date datetime) {
		this.datetime = datetime;
	    }
       

	    /**
		*备注
		*/
		
        public String getRmk() {
     
		return rmk;
	    }
        
	    public void setRmk(String rmk) {
		this.rmk = rmk;
	    }
       
      /*  public static aihao_dao convert(t_menber_exprvalue_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setUniquevalue(_dao.getUniquevalue());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setItemid(_dao.getItemid());
        
        temp.setTimes(_dao.getTimes());
        
        temp.setExprunit(_dao.getExprunit());
        
        temp.setMaxtimes(_dao.getMaxtimes());
        
        temp.setExprvalues(_dao.getExprvalues());
        
        temp.setDatetime(_dao.getDatetime());
        
        temp.setRmk(_dao.getRmk());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

