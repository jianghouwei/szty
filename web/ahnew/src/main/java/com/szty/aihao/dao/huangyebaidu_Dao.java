/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： huangyebaiduEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@HUANGYEBAIDU数据实体
    *@作者：宋春林 
    */

	public class huangyebaidu_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int merid;
        /**
	     * 
	     */
		private String mername;
        /**
	     * 
	     */
		private String merphone;
        /**
	     * 
	     */
		private String merbaiducity;
        /**
	     * 
	     */
		private String merbaiducitycode;
        /**
	     * 
	     */
		private String merbaidudistrict;
        /**
	     * 
	     */
		private String merbaiduprovince;
        /**
	     * 
	     */
		private String merbaidustreet;
        /**
	     * 
	     */
		private String merbaidustreetnumber;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private String merbaidubusiness;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getMerid() {
     
		return merid;
	    }
        
	    public void setMerid(int merid) {
		this.merid = merid;
	    }
       

	    /**
		*
		*/
		
        public String getMername() {
     
		return mername;
	    }
        
	    public void setMername(String mername) {
		this.mername = mername;
	    }
       

	    /**
		*
		*/
		
        public String getMerphone() {
     
		return merphone;
	    }
        
	    public void setMerphone(String merphone) {
		this.merphone = merphone;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaiducity() {
     
		return merbaiducity;
	    }
        
	    public void setMerbaiducity(String merbaiducity) {
		this.merbaiducity = merbaiducity;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaiducitycode() {
     
		return merbaiducitycode;
	    }
        
	    public void setMerbaiducitycode(String merbaiducitycode) {
		this.merbaiducitycode = merbaiducitycode;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaidudistrict() {
     
		return merbaidudistrict;
	    }
        
	    public void setMerbaidudistrict(String merbaidudistrict) {
		this.merbaidudistrict = merbaidudistrict;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaiduprovince() {
     
		return merbaiduprovince;
	    }
        
	    public void setMerbaiduprovince(String merbaiduprovince) {
		this.merbaiduprovince = merbaiduprovince;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaidustreet() {
     
		return merbaidustreet;
	    }
        
	    public void setMerbaidustreet(String merbaidustreet) {
		this.merbaidustreet = merbaidustreet;
	    }
       

	    /**
		*
		*/
		
        public String getMerbaidustreetnumber() {
     
		return merbaidustreetnumber;
	    }
        
	    public void setMerbaidustreetnumber(String merbaidustreetnumber) {
		this.merbaidustreetnumber = merbaidustreetnumber;
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
		
        public String getMerbaidubusiness() {
     
		return merbaidubusiness;
	    }
        
	    public void setMerbaidubusiness(String merbaidubusiness) {
		this.merbaidubusiness = merbaidubusiness;
	    }
       
      /*  public static aihao_dao convert(huangyebaidu_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setMerid(_dao.getMerid());
        
        temp.setMername(_dao.getMername());
        
        temp.setMerphone(_dao.getMerphone());
        
        temp.setMerbaiducity(_dao.getMerbaiducity());
        
        temp.setMerbaiducitycode(_dao.getMerbaiducitycode());
        
        temp.setMerbaidudistrict(_dao.getMerbaidudistrict());
        
        temp.setMerbaiduprovince(_dao.getMerbaiduprovince());
        
        temp.setMerbaidustreet(_dao.getMerbaidustreet());
        
        temp.setMerbaidustreetnumber(_dao.getMerbaidustreetnumber());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setMerbaidubusiness(_dao.getMerbaidubusiness());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

