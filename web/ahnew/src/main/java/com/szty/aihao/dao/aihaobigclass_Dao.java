/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaobigclassEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOBIGCLASS数据实体
    *@作者：宋春林 
    */

	public class aihaobigclass_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int bigclassid;
        /**
	     * 
	     */
		private String bigclassname;
        /**
	     * 
	     */
		private String bigclasspic;
        /**
	     * 
	     */
		private int bigclasspicsize;
        /**
	     * 
	     */
		private int bigclassorder;
        /**
	     * 
	     */
		private Date bigclasscdate;
        /**
	     * 
	     */
		private int status;
        /**
	     * 
	     */
		private String bigclassbigpic;
        /**
	     * 
	     */
		private int bigclassbigpicsize;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getBigclassid() {
     
		return bigclassid;
	    }
        
	    public void setBigclassid(int bigclassid) {
		this.bigclassid = bigclassid;
	    }
       

	    /**
		*
		*/
		
        public String getBigclassname() {
     
		return bigclassname;
	    }
        
	    public void setBigclassname(String bigclassname) {
		this.bigclassname = bigclassname;
	    }
       

	    /**
		*
		*/
		
        public String getBigclasspic() {
     
		return bigclasspic;
	    }
        
	    public void setBigclasspic(String bigclasspic) {
		this.bigclasspic = bigclasspic;
	    }
       

	    /**
		*
		*/
		
        public int getBigclasspicsize() {
     
		return bigclasspicsize;
	    }
        
	    public void setBigclasspicsize(int bigclasspicsize) {
		this.bigclasspicsize = bigclasspicsize;
	    }
       

	    /**
		*
		*/
		
        public int getBigclassorder() {
     
		return bigclassorder;
	    }
        
	    public void setBigclassorder(int bigclassorder) {
		this.bigclassorder = bigclassorder;
	    }
       

	    /**
		*
		*/
		
        public Date getBigclasscdate() {
     
		return bigclasscdate;
	    }
        
	    public void setBigclasscdate(Date bigclasscdate) {
		this.bigclasscdate = bigclasscdate;
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
		
        public String getBigclassbigpic() {
     
		return bigclassbigpic;
	    }
        
	    public void setBigclassbigpic(String bigclassbigpic) {
		this.bigclassbigpic = bigclassbigpic;
	    }
       

	    /**
		*
		*/
		
        public int getBigclassbigpicsize() {
     
		return bigclassbigpicsize;
	    }
        
	    public void setBigclassbigpicsize(int bigclassbigpicsize) {
		this.bigclassbigpicsize = bigclassbigpicsize;
	    }
       
      /*  public static aihao_dao convert(aihaobigclass_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setBigclassid(_dao.getBigclassid());
        
        temp.setBigclassname(_dao.getBigclassname());
        
        temp.setBigclasspic(_dao.getBigclasspic());
        
        temp.setBigclasspicsize(_dao.getBigclasspicsize());
        
        temp.setBigclassorder(_dao.getBigclassorder());
        
        temp.setBigclasscdate(_dao.getBigclasscdate());
        
        temp.setStatus(_dao.getStatus());
        
        temp.setBigclassbigpic(_dao.getBigclassbigpic());
        
        temp.setBigclassbigpicsize(_dao.getBigclassbigpicsize());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

