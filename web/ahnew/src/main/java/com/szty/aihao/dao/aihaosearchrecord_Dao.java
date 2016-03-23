/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaosearchrecordEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOSEARCHRECORD数据实体
    *@作者：宋春林 
    */

	public class aihaosearchrecord_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int id;
        /**
	     * 
	     */
		private int userid;
        /**
	     * 
	     */
		private String searchkey;
        /**
	     * 
	     */
		private String province;
        /**
	     * 
	     */
		private String city;
        /**
	     * 
	     */
		private Date createtime;
        /**
	     * 
	     */
		private String imsi;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*
		*/
		
        public int getUserid() {
     
		return userid;
	    }
        
	    public void setUserid(int userid) {
		this.userid = userid;
	    }
       

	    /**
		*
		*/
		
        public String getSearchkey() {
     
		return searchkey;
	    }
        
	    public void setSearchkey(String searchkey) {
		this.searchkey = searchkey;
	    }
       

	    /**
		*
		*/
		
        public String getProvince() {
     
		return province;
	    }
        
	    public void setProvince(String province) {
		this.province = province;
	    }
       

	    /**
		*
		*/
		
        public String getCity() {
     
		return city;
	    }
        
	    public void setCity(String city) {
		this.city = city;
	    }
       

	    /**
		*
		*/
		
        public Date getCreatetime() {
     
		return createtime;
	    }
        
	    public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	    }
       

	    /**
		*
		*/
		
        public String getImsi() {
     
		return imsi;
	    }
        
	    public void setImsi(String imsi) {
		this.imsi = imsi;
	    }
       
      /*  public static aihao_dao convert(aihaosearchrecord_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setUserid(_dao.getUserid());
        
        temp.setSearchkey(_dao.getSearchkey());
        
        temp.setProvince(_dao.getProvince());
        
        temp.setCity(_dao.getCity());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        temp.setImsi(_dao.getImsi());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

