/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihao_tj_parsetEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAO_TJ_PARSET数据实体
    *@作者：宋春林 
    */

	public class aihao_tj_parset_Dao implements Serializable
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
		private int pointid;
        /**
	     * 
	     */
		private String pcontent;
        /**
	     * 
	     */
		private int porder;
        /**
	     * 
	     */
		private Date datetime;
        /**
	     * 
	     */
		private String cdate;
        /**
	     * 
	     */
		private String pcontent1;
        
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
		
        public int getPointid() {
     
		return pointid;
	    }
        
	    public void setPointid(int pointid) {
		this.pointid = pointid;
	    }
       

	    /**
		*
		*/
		
        public String getPcontent() {
     
		return pcontent;
	    }
        
	    public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	    }
       

	    /**
		*
		*/
		
        public int getPorder() {
     
		return porder;
	    }
        
	    public void setPorder(int porder) {
		this.porder = porder;
	    }
       

	    /**
		*
		*/
		
        public Date getDatetime() {
     
		return datetime;
	    }
        
	    public void setDatetime(Date datetime) {
		this.datetime = datetime;
	    }
       

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
		
        public String getPcontent1() {
     
		return pcontent1;
	    }
        
	    public void setPcontent1(String pcontent1) {
		this.pcontent1 = pcontent1;
	    }
       
      /*  public static aihao_dao convert(aihao_tj_parset_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLogid(_dao.getLogid());
        
        temp.setPointid(_dao.getPointid());
        
        temp.setPcontent(_dao.getPcontent());
        
        temp.setPorder(_dao.getPorder());
        
        temp.setDatetime(_dao.getDatetime());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setPcontent1(_dao.getPcontent1());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

