/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumembeddedpageEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMEMBEDDEDPAGE数据实体
    *@作者：宋春林 
    */

	public class mvnforumembeddedpage_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int embid;
        /**
	     * 
	     */
		private int pageid;
        /**
	     * 
	     */
		private int pagenameindex;
        /**
	     * 
	     */
		private String ownername;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getEmbid() {
     
		return embid;
	    }
        
	    public void setEmbid(int embid) {
		this.embid = embid;
	    }
       

	    /**
		*
		*/
		
        public int getPageid() {
     
		return pageid;
	    }
        
	    public void setPageid(int pageid) {
		this.pageid = pageid;
	    }
       

	    /**
		*
		*/
		
        public int getPagenameindex() {
     
		return pagenameindex;
	    }
        
	    public void setPagenameindex(int pagenameindex) {
		this.pagenameindex = pagenameindex;
	    }
       

	    /**
		*
		*/
		
        public String getOwnername() {
     
		return ownername;
	    }
        
	    public void setOwnername(String ownername) {
		this.ownername = ownername;
	    }
       
      /*  public static aihao_dao convert(mvnforumembeddedpage_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setEmbid(_dao.getEmbid());
        
        temp.setPageid(_dao.getPageid());
        
        temp.setPagenameindex(_dao.getPagenameindex());
        
        temp.setOwnername(_dao.getOwnername());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

