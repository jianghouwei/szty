/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsymimsiimeiEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSYMIMSIIMEI数据实体
    *@作者：宋春林 
    */

	public class mvnforumsymimsiimei_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int imid;
        /**
	     * 
	     */
		private String imei;
        /**
	     * 
	     */
		private String imsi;
        /**
	     * 
	     */
		private String mobile;
        /**
	     * 
	     */
		private Date imcreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getImid() {
     
		return imid;
	    }
        
	    public void setImid(int imid) {
		this.imid = imid;
	    }
       

	    /**
		*
		*/
		
        public String getImei() {
     
		return imei;
	    }
        
	    public void setImei(String imei) {
		this.imei = imei;
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
       

	    /**
		*
		*/
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       

	    /**
		*
		*/
		
        public Date getImcreationdate() {
     
		return imcreationdate;
	    }
        
	    public void setImcreationdate(Date imcreationdate) {
		this.imcreationdate = imcreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumsymimsiimei_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setImid(_dao.getImid());
        
        temp.setImei(_dao.getImei());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setImcreationdate(_dao.getImcreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

