/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztyverifyEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYVERIFY数据实体
    *@作者：宋春林 
    */

	public class sztyverify_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String id;
        /**
	     * 
	     */
		private String mobile;
        /**
	     * 
	     */
		private String verifycode;
        /**
	     * 
	     */
		private int type;
        /**
	     * 
	     */
		private Date createtime;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getId() {
     
		return id;
	    }
        
	    public void setId(String id) {
		this.id = id;
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
		
        public String getVerifycode() {
     
		return verifycode;
	    }
        
	    public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	    }
       

	    /**
		*
		*/
		
        public int getType() {
     
		return type;
	    }
        
	    public void setType(int type) {
		this.type = type;
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
       
      /*  public static aihao_dao convert(sztyverify_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setMobile(_dao.getMobile());
        
        temp.setVerifycode(_dao.getVerifycode());
        
        temp.setType(_dao.getType());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

