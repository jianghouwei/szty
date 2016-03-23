/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： expruletableEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@EXPRULETABLE数据实体
    *@作者：宋春林 
    */

	public class expruletable_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int ruleid;
        /**
	     * 
	     */
		private String rulename;
        /**
	     * 
	     */
		private int ruleexp;
        /**
	     * 
	     */
		private int ruletime;
        /**
	     * 
	     */
		private int ruletype;
        /**
	     * 
	     */
		private Date rulecdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getRuleid() {
     
		return ruleid;
	    }
        
	    public void setRuleid(int ruleid) {
		this.ruleid = ruleid;
	    }
       

	    /**
		*
		*/
		
        public String getRulename() {
     
		return rulename;
	    }
        
	    public void setRulename(String rulename) {
		this.rulename = rulename;
	    }
       

	    /**
		*
		*/
		
        public int getRuleexp() {
     
		return ruleexp;
	    }
        
	    public void setRuleexp(int ruleexp) {
		this.ruleexp = ruleexp;
	    }
       

	    /**
		*
		*/
		
        public int getRuletime() {
     
		return ruletime;
	    }
        
	    public void setRuletime(int ruletime) {
		this.ruletime = ruletime;
	    }
       

	    /**
		*
		*/
		
        public int getRuletype() {
     
		return ruletype;
	    }
        
	    public void setRuletype(int ruletype) {
		this.ruletype = ruletype;
	    }
       

	    /**
		*
		*/
		
        public Date getRulecdate() {
     
		return rulecdate;
	    }
        
	    public void setRulecdate(Date rulecdate) {
		this.rulecdate = rulecdate;
	    }
       
      /*  public static aihao_dao convert(expruletable_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setRuleid(_dao.getRuleid());
        
        temp.setRulename(_dao.getRulename());
        
        temp.setRuleexp(_dao.getRuleexp());
        
        temp.setRuletime(_dao.getRuletime());
        
        temp.setRuletype(_dao.getRuletype());
        
        temp.setRulecdate(_dao.getRulecdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

