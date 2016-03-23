/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： sztypurviewEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@SZTYPURVIEW数据实体
    *@作者：宋春林 
    */

	public class sztypurview_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * ???????sztypurview_seq
	     */
		private int purid;
        /**
	     * ?ID
	     */
		private int perantid;
        /**
	     * ????
	     */
		private String name;
        /**
	     * ????
	     */
		private String url;
        /**
	     * ????,1???????2???????3????,4?????5??OA?6??OA
	     */
		private String systype;
        /**
	     * ?????????1root??2node
	     */
		private String ptype;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*???????sztypurview_seq
		*/
		
        public int getPurid() {
     
		return purid;
	    }
        
	    public void setPurid(int purid) {
		this.purid = purid;
	    }
       

	    /**
		*?ID
		*/
		
        public int getPerantid() {
     
		return perantid;
	    }
        
	    public void setPerantid(int perantid) {
		this.perantid = perantid;
	    }
       

	    /**
		*????
		*/
		
        public String getName() {
     
		return name;
	    }
        
	    public void setName(String name) {
		this.name = name;
	    }
       

	    /**
		*????
		*/
		
        public String getUrl() {
     
		return url;
	    }
        
	    public void setUrl(String url) {
		this.url = url;
	    }
       

	    /**
		*????,1???????2???????3????,4?????5??OA?6??OA
		*/
		
        public String getSystype() {
     
		return systype;
	    }
        
	    public void setSystype(String systype) {
		this.systype = systype;
	    }
       

	    /**
		*?????????1root??2node
		*/
		
        public String getPtype() {
     
		return ptype;
	    }
        
	    public void setPtype(String ptype) {
		this.ptype = ptype;
	    }
       
      /*  public static aihao_dao convert(sztypurview_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPurid(_dao.getPurid());
        
        temp.setPerantid(_dao.getPerantid());
        
        temp.setName(_dao.getName());
        
        temp.setUrl(_dao.getUrl());
        
        temp.setSystype(_dao.getSystype());
        
        temp.setPtype(_dao.getPtype());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

