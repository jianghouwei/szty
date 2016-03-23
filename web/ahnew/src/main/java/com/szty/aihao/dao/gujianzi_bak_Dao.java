/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： gujianzi_bakEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@GUJIANZI_BAK数据实体
    *@作者：宋春林 
    */

	public class gujianzi_bak_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int gjzid;
        /**
	     * 
	     */
		private String gjzname;
        /**
	     * 
	     */
		private String gjzcolor;
        /**
	     * 
	     */
		private int gjzorder;
        /**
	     * 
	     */
		private int city;
        /**
	     * 
	     */
		private int province;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private int status;
        /**
	     * 
	     */
		private String gjzpic;
        /**
	     * 
	     */
		private int gjzsize;
        /**
	     * 
	     */
		private String gjzowner;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getGjzid() {
     
		return gjzid;
	    }
        
	    public void setGjzid(int gjzid) {
		this.gjzid = gjzid;
	    }
       

	    /**
		*
		*/
		
        public String getGjzname() {
     
		return gjzname;
	    }
        
	    public void setGjzname(String gjzname) {
		this.gjzname = gjzname;
	    }
       

	    /**
		*
		*/
		
        public String getGjzcolor() {
     
		return gjzcolor;
	    }
        
	    public void setGjzcolor(String gjzcolor) {
		this.gjzcolor = gjzcolor;
	    }
       

	    /**
		*
		*/
		
        public int getGjzorder() {
     
		return gjzorder;
	    }
        
	    public void setGjzorder(int gjzorder) {
		this.gjzorder = gjzorder;
	    }
       

	    /**
		*
		*/
		
        public int getCity() {
     
		return city;
	    }
        
	    public void setCity(int city) {
		this.city = city;
	    }
       

	    /**
		*
		*/
		
        public int getProvince() {
     
		return province;
	    }
        
	    public void setProvince(int province) {
		this.province = province;
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
       

	    /**
		*
		*/
		
        public int getStatus() {
     
		return status;
	    }
        
	    public void setStatus(int status) {
		this.status = status;
	    }
       

	    /**
		*
		*/
		
        public String getGjzpic() {
     
		return gjzpic;
	    }
        
	    public void setGjzpic(String gjzpic) {
		this.gjzpic = gjzpic;
	    }
       

	    /**
		*
		*/
		
        public int getGjzsize() {
     
		return gjzsize;
	    }
        
	    public void setGjzsize(int gjzsize) {
		this.gjzsize = gjzsize;
	    }
       

	    /**
		*
		*/
		
        public String getGjzowner() {
     
		return gjzowner;
	    }
        
	    public void setGjzowner(String gjzowner) {
		this.gjzowner = gjzowner;
	    }
       
      /*  public static aihao_dao convert(gujianzi_bak_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGjzid(_dao.getGjzid());
        
        temp.setGjzname(_dao.getGjzname());
        
        temp.setGjzcolor(_dao.getGjzcolor());
        
        temp.setGjzorder(_dao.getGjzorder());
        
        temp.setCity(_dao.getCity());
        
        temp.setProvince(_dao.getProvince());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setStatus(_dao.getStatus());
        
        temp.setGjzpic(_dao.getGjzpic());
        
        temp.setGjzsize(_dao.getGjzsize());
        
        temp.setGjzowner(_dao.getGjzowner());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

