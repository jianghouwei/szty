/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztyuserinfoEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYUSERINFO数据实体
    *@作者：宋春林 
    */

	public class sztyuserinfo_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ??
	     */
		private long id;
        /**
	     * ??????(?????)
	     */
		private String account;
        /**
	     * ???
	     */
		private String mobile;
        /**
	     * imsi
	     */
		private String imsi;
        /**
	     * ??
	     */
		private String password;
        /**
	     * ??0,1??
	     */
		private String status;
        /**
	     * ????
	     */
		private Date createtime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*??
		*/
		
        public long getId() {
     
		return id;
	    }
        
	    public void setId(long id) {
		this.id = id;
	    }
       

	    /**
		*??????(?????)
		*/
		
        public String getAccount() {
     
		return account;
	    }
        
	    public void setAccount(String account) {
		this.account = account;
	    }
       

	    /**
		*???
		*/
		
        public String getMobile() {
     
		return mobile;
	    }
        
	    public void setMobile(String mobile) {
		this.mobile = mobile;
	    }
       

	    /**
		*imsi
		*/
		
        public String getImsi() {
     
		return imsi;
	    }
        
	    public void setImsi(String imsi) {
		this.imsi = imsi;
	    }
       

	    /**
		*??
		*/
		
        public String getPassword() {
     
		return password;
	    }
        
	    public void setPassword(String password) {
		this.password = password;
	    }
       

	    /**
		*??0,1??
		*/
		
        public String getStatus() {
     
		return status;
	    }
        
	    public void setStatus(String status) {
		this.status = status;
	    }
       

	    /**
		*????
		*/
		
        public Date getCreatetime() {
     
		return createtime;
	    }
        
	    public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	    }
       
      /*  public static aihao_dao convert(sztyuserinfo_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setAccount(_dao.getAccount());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setImsi(_dao.getImsi());
        
        temp.setPassword(_dao.getPassword());
        
        temp.setStatus(_dao.getStatus());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

