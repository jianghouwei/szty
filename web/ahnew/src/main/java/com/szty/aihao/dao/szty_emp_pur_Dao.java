/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： szty_emp_purEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTY_EMP_PUR数据实体
    *@作者：宋春林 
    */

	public class szty_emp_pur_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ??ID???sztyemployees?eid??
	     */
		private int eid;
        /**
	     * ??ID???sztypurview?purid
	     */
		private int purid;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*??ID???sztyemployees?eid??
		*/
		
        public int getEid() {
     
		return eid;
	    }
        
	    public void setEid(int eid) {
		this.eid = eid;
	    }
       

	    /**
		*??ID???sztypurview?purid
		*/
		
        public int getPurid() {
     
		return purid;
	    }
        
	    public void setPurid(int purid) {
		this.purid = purid;
	    }
       
      /*  public static aihao_dao convert(szty_emp_pur_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setEid(_dao.getEid());
        
        temp.setPurid(_dao.getPurid());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

