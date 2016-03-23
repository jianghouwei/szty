/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： searchkeywordsEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SEARCHKEYWORDS数据实体
    *@作者：宋春林 
    */

	public class searchkeywords_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int searchkeyid;
        /**
	     * 
	     */
		private int procode;
        /**
	     * 
	     */
		private int citycode;
        /**
	     * 
	     */
		private String cityname;
        /**
	     * 
	     */
		private String keywords;
        /**
	     * 
	     */
		private int keyorder;
        /**
	     * 
	     */
		private Date cdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getSearchkeyid() {
     
		return searchkeyid;
	    }
        
	    public void setSearchkeyid(int searchkeyid) {
		this.searchkeyid = searchkeyid;
	    }
       

	    /**
		*
		*/
		
        public int getProcode() {
     
		return procode;
	    }
        
	    public void setProcode(int procode) {
		this.procode = procode;
	    }
       

	    /**
		*
		*/
		
        public int getCitycode() {
     
		return citycode;
	    }
        
	    public void setCitycode(int citycode) {
		this.citycode = citycode;
	    }
       

	    /**
		*
		*/
		
        public String getCityname() {
     
		return cityname;
	    }
        
	    public void setCityname(String cityname) {
		this.cityname = cityname;
	    }
       

	    /**
		*
		*/
		
        public String getKeywords() {
     
		return keywords;
	    }
        
	    public void setKeywords(String keywords) {
		this.keywords = keywords;
	    }
       

	    /**
		*
		*/
		
        public int getKeyorder() {
     
		return keyorder;
	    }
        
	    public void setKeyorder(int keyorder) {
		this.keyorder = keyorder;
	    }
       

	    /**
		*
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       
      /*  public static aihao_dao convert(searchkeywords_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setSearchkeyid(_dao.getSearchkeyid());
        
        temp.setProcode(_dao.getProcode());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setCityname(_dao.getCityname());
        
        temp.setKeywords(_dao.getKeywords());
        
        temp.setKeyorder(_dao.getKeyorder());
        
        temp.setCdate(_dao.getCdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

