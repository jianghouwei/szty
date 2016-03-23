/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： t_qy_130222Entity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@T_QY_130222数据实体
    *@作者：宋春林 
    */

	public class t_qy_130222_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String pcontent;
        /**
	     * 
	     */
		private String ar;
        /**
	     * 
	     */
		private String shopname;
        /**
	     * 
	     */
		private String shoptel;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
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
		
        public String getAr() {
     
		return ar;
	    }
        
	    public void setAr(String ar) {
		this.ar = ar;
	    }
       

	    /**
		*
		*/
		
        public String getShopname() {
     
		return shopname;
	    }
        
	    public void setShopname(String shopname) {
		this.shopname = shopname;
	    }
       

	    /**
		*
		*/
		
        public String getShoptel() {
     
		return shoptel;
	    }
        
	    public void setShoptel(String shoptel) {
		this.shoptel = shoptel;
	    }
       
      /*  public static aihao_dao convert(t_qy_130222_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPcontent(_dao.getPcontent());
        
        temp.setAr(_dao.getAr());
        
        temp.setShopname(_dao.getShopname());
        
        temp.setShoptel(_dao.getShoptel());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

