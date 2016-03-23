/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： explevtableEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@EXPLEVTABLE数据实体
    *@作者：宋春林 
    */

	public class explevtable_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 级别ID
	     */
		private int levid;
        /**
	     * 累计经验值
	     */
		private int levexp;
        /**
	     * 单次赠送积分
	     */
		private int integral;
        /**
	     * 级别名称
	     */
		private String levname;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*级别ID
		*/
		
        public int getLevid() {
     
		return levid;
	    }
        
	    public void setLevid(int levid) {
		this.levid = levid;
	    }
       

	    /**
		*累计经验值
		*/
		
        public int getLevexp() {
     
		return levexp;
	    }
        
	    public void setLevexp(int levexp) {
		this.levexp = levexp;
	    }
       

	    /**
		*单次赠送积分
		*/
		
        public int getIntegral() {
     
		return integral;
	    }
        
	    public void setIntegral(int integral) {
		this.integral = integral;
	    }
       

	    /**
		*级别名称
		*/
		
        public String getLevname() {
     
		return levname;
	    }
        
	    public void setLevname(String levname) {
		this.levname = levname;
	    }
       
      /*  public static aihao_dao convert(explevtable_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setLevid(_dao.getLevid());
        
        temp.setLevexp(_dao.getLevexp());
        
        temp.setIntegral(_dao.getIntegral());
        
        temp.setLevname(_dao.getLevname());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

