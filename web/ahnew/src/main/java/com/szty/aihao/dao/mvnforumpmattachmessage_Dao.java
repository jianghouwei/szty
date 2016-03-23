/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumpmattachmessageEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMPMATTACHMESSAGE数据实体
    *@作者：宋春林 
    */

	public class mvnforumpmattachmessage_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int messageid;
        /**
	     * 
	     */
		private int pmattachid;
        /**
	     * 
	     */
		private int relationtype;
        /**
	     * 
	     */
		private int relationoption;
        /**
	     * 
	     */
		private int relationstatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getMessageid() {
     
		return messageid;
	    }
        
	    public void setMessageid(int messageid) {
		this.messageid = messageid;
	    }
       

	    /**
		*
		*/
		
        public int getPmattachid() {
     
		return pmattachid;
	    }
        
	    public void setPmattachid(int pmattachid) {
		this.pmattachid = pmattachid;
	    }
       

	    /**
		*
		*/
		
        public int getRelationtype() {
     
		return relationtype;
	    }
        
	    public void setRelationtype(int relationtype) {
		this.relationtype = relationtype;
	    }
       

	    /**
		*
		*/
		
        public int getRelationoption() {
     
		return relationoption;
	    }
        
	    public void setRelationoption(int relationoption) {
		this.relationoption = relationoption;
	    }
       

	    /**
		*
		*/
		
        public int getRelationstatus() {
     
		return relationstatus;
	    }
        
	    public void setRelationstatus(int relationstatus) {
		this.relationstatus = relationstatus;
	    }
       
      /*  public static aihao_dao convert(mvnforumpmattachmessage_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMessageid(_dao.getMessageid());
        
        temp.setPmattachid(_dao.getPmattachid());
        
        temp.setRelationtype(_dao.getRelationtype());
        
        temp.setRelationoption(_dao.getRelationoption());
        
        temp.setRelationstatus(_dao.getRelationstatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

