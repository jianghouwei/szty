/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： t_user_chanEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@T_USER_CHAN数据实体
    *@作者：宋春林 
    */

	public class t_user_chan_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 登录用户名称
	     */
		private String uname;
        /**
	     * 渠道ID（存在用户对应多个渠道情况）
	     */
		private String chanid;
        /**
	     * 备注
	     */
		private String rmk;
        /**
	     * 添加日期时间
	     */
		private Date cdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*登录用户名称
		*/
		
        public String getUname() {
     
		return uname;
	    }
        
	    public void setUname(String uname) {
		this.uname = uname;
	    }
       

	    /**
		*渠道ID（存在用户对应多个渠道情况）
		*/
		
        public String getChanid() {
     
		return chanid;
	    }
        
	    public void setChanid(String chanid) {
		this.chanid = chanid;
	    }
       

	    /**
		*备注
		*/
		
        public String getRmk() {
     
		return rmk;
	    }
        
	    public void setRmk(String rmk) {
		this.rmk = rmk;
	    }
       

	    /**
		*添加日期时间
		*/
		
        public Date getCdate() {
     
		return cdate;
	    }
        
	    public void setCdate(Date cdate) {
		this.cdate = cdate;
	    }
       
      /*  public static aihao_dao convert(t_user_chan_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setUname(_dao.getUname());
        
        temp.setChanid(_dao.getChanid());
        
        temp.setRmk(_dao.getRmk());
        
        temp.setCdate(_dao.getCdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

