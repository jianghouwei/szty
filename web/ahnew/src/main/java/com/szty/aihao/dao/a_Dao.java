/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@A数据实体
    *@作者：宋春林 
    */

	public class a_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String busname;
        /**
	     * 
	     */
		private String telephone;
        /**
	     * 
	     */
		private String provincename;
        /**
	     * 
	     */
		private String cityname;
        /**
	     * 
	     */
		private String groupname;
        /**
	     * 
	     */
		private String provincecode;
        /**
	     * 
	     */
		private String citycode;
        /**
	     * 
	     */
		private String groupcode;
        /**
	     * 
	     */
		private String weight;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getBusname() {
     
		return busname;
	    }
        
	    public void setBusname(String busname) {
		this.busname = busname;
	    }
       

	    /**
		*
		*/
		
        public String getTelephone() {
     
		return telephone;
	    }
        
	    public void setTelephone(String telephone) {
		this.telephone = telephone;
	    }
       

	    /**
		*
		*/
		
        public String getProvincename() {
     
		return provincename;
	    }
        
	    public void setProvincename(String provincename) {
		this.provincename = provincename;
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
		
        public String getGroupname() {
     
		return groupname;
	    }
        
	    public void setGroupname(String groupname) {
		this.groupname = groupname;
	    }
       

	    /**
		*
		*/
		
        public String getProvincecode() {
     
		return provincecode;
	    }
        
	    public void setProvincecode(String provincecode) {
		this.provincecode = provincecode;
	    }
       

	    /**
		*
		*/
		
        public String getCitycode() {
     
		return citycode;
	    }
        
	    public void setCitycode(String citycode) {
		this.citycode = citycode;
	    }
       

	    /**
		*
		*/
		
        public String getGroupcode() {
     
		return groupcode;
	    }
        
	    public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	    }
       

	    /**
		*
		*/
		
        public String getWeight() {
     
		return weight;
	    }
        
	    public void setWeight(String weight) {
		this.weight = weight;
	    }
       
      /*  public static aihao_dao convert(a_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setBusname(_dao.getBusname());
        
        temp.setTelephone(_dao.getTelephone());
        
        temp.setProvincename(_dao.getProvincename());
        
        temp.setCityname(_dao.getCityname());
        
        temp.setGroupname(_dao.getGroupname());
        
        temp.setProvincecode(_dao.getProvincecode());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setGroupcode(_dao.getGroupcode());
        
        temp.setWeight(_dao.getWeight());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

