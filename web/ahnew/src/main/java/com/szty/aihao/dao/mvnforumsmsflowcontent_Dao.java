/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumsmsflowcontentEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMSMSFLOWCONTENT数据实体
    *@作者：宋春林 
    */

	public class mvnforumsmsflowcontent_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int flowcontentid;
        /**
	     * 
	     */
		private String productname;
        /**
	     * 
	     */
		private int step;
        /**
	     * 
	     */
		private String content;
        /**
	     * 
	     */
		private Date flowcontentcreationdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getFlowcontentid() {
     
		return flowcontentid;
	    }
        
	    public void setFlowcontentid(int flowcontentid) {
		this.flowcontentid = flowcontentid;
	    }
       

	    /**
		*
		*/
		
        public String getProductname() {
     
		return productname;
	    }
        
	    public void setProductname(String productname) {
		this.productname = productname;
	    }
       

	    /**
		*
		*/
		
        public int getStep() {
     
		return step;
	    }
        
	    public void setStep(int step) {
		this.step = step;
	    }
       

	    /**
		*
		*/
		
        public String getContent() {
     
		return content;
	    }
        
	    public void setContent(String content) {
		this.content = content;
	    }
       

	    /**
		*
		*/
		
        public Date getFlowcontentcreationdate() {
     
		return flowcontentcreationdate;
	    }
        
	    public void setFlowcontentcreationdate(Date flowcontentcreationdate) {
		this.flowcontentcreationdate = flowcontentcreationdate;
	    }
       
      /*  public static aihao_dao convert(mvnforumsmsflowcontent_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setFlowcontentid(_dao.getFlowcontentid());
        
        temp.setProductname(_dao.getProductname());
        
        temp.setStep(_dao.getStep());
        
        temp.setContent(_dao.getContent());
        
        temp.setFlowcontentcreationdate(_dao.getFlowcontentcreationdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

