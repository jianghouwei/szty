/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： t_menber_exprvalue_detailEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@T_MENBER_EXPRVALUE_DETAIL数据实体
    *@作者：宋春林 
    */

	public class t_menber_exprvalue_detail_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 用户唯一标记值
	     */
		private String uniquevalue;
        /**
	     * 操作项ID
	     */
		private int itemid;
        /**
	     * 操作时间
	     */
		private Date datetime;
        /**
	     * 备注
	     */
		private String rmk;
        /**
	     * 操作次数
	     */
		private int times;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*用户唯一标记值
		*/
		
        public String getUniquevalue() {
     
		return uniquevalue;
	    }
        
	    public void setUniquevalue(String uniquevalue) {
		this.uniquevalue = uniquevalue;
	    }
       

	    /**
		*操作项ID
		*/
		
        public int getItemid() {
     
		return itemid;
	    }
        
	    public void setItemid(int itemid) {
		this.itemid = itemid;
	    }
       

	    /**
		*操作时间
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
       

	    /**
		*操作次数
		*/
		
        public int getTimes() {
     
		return times;
	    }
        
	    public void setTimes(int times) {
		this.times = times;
	    }
       
      /*  public static aihao_dao convert(t_menber_exprvalue_detail_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setUniquevalue(_dao.getUniquevalue());
        
        temp.setItemid(_dao.getItemid());
        
        temp.setDatetime(_dao.getDatetime());
        
        temp.setRmk(_dao.getRmk());
        
        temp.setTimes(_dao.getTimes());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

