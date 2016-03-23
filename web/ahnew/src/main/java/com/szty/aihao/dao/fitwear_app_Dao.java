/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： fitwear_appEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/11/5
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@FITWEAR_APP数据实体
    *@作者：宋春林 
    */

	public class fitwear_app_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int id;
        /**
	     * 
	     */
		private String appname;
        /**
	     * 
	     */
		private String category;
        /**
	     * 
	     */
		private String developer;
        /**
	     * 
	     */
		private String vername;
        /**
	     * 
	     */
		private String vercode;
        /**
	     * 
	     */
		private String summary;
        /**
	     * 
	     */
		private String descript;
        /**
	     * 
	     */
		private String logo;
        /**
	     * 
	     */
		private String imgs;
        /**
	     * 
	     */
		private String m_apk;
        /**
	     * 
	     */
		private String f_apk;
        /**
	     * 
	     */
		private Date createtime;
        /**
	     * 
	     */
		private String operater;
        /**
	     * 
	     */
		private int isdel;
        /**
	     * 
	     */
		private String sortorder;
        /**
	     * 
	     */
		private String m_apk_size;
        /**
	     * 
	     */
		private String f_apk_size;
        /**
	     * 
	     */
		private String packagename;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getId() {
     
		return id;
	    }
        
	    public void setId(int id) {
		this.id = id;
	    }
       

	    /**
		*
		*/
		
        public String getAppname() {
     
		return appname;
	    }
        
	    public void setAppname(String appname) {
		this.appname = appname;
	    }
       

	    /**
		*
		*/
		
        public String getCategory() {
     
		return category;
	    }
        
	    public void setCategory(String category) {
		this.category = category;
	    }
       

	    /**
		*
		*/
		
        public String getDeveloper() {
     
		return developer;
	    }
        
	    public void setDeveloper(String developer) {
		this.developer = developer;
	    }
       

	    /**
		*
		*/
		
        public String getVername() {
     
		return vername;
	    }
        
	    public void setVername(String vername) {
		this.vername = vername;
	    }
       

	    /**
		*
		*/
		
        public String getVercode() {
     
		return vercode;
	    }
        
	    public void setVercode(String vercode) {
		this.vercode = vercode;
	    }
       

	    /**
		*
		*/
		
        public String getSummary() {
     
		return summary;
	    }
        
	    public void setSummary(String summary) {
		this.summary = summary;
	    }
       

	    /**
		*
		*/
		
        public String getDescript() {
     
		return descript;
	    }
        
	    public void setDescript(String descript) {
		this.descript = descript;
	    }
       

	    /**
		*
		*/
		
        public String getLogo() {
     
		return logo;
	    }
        
	    public void setLogo(String logo) {
		this.logo = logo;
	    }
       

	    /**
		*
		*/
		
        public String getImgs() {
     
		return imgs;
	    }
        
	    public void setImgs(String imgs) {
		this.imgs = imgs;
	    }
       

	    /**
		*
		*/
		
        public String getM_apk() {
     
		return m_apk;
	    }
        
	    public void setM_apk(String m_apk) {
		this.m_apk = m_apk;
	    }
       

	    /**
		*
		*/
		
        public String getF_apk() {
     
		return f_apk;
	    }
        
	    public void setF_apk(String f_apk) {
		this.f_apk = f_apk;
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
       

	    /**
		*
		*/
		
        public String getOperater() {
     
		return operater;
	    }
        
	    public void setOperater(String operater) {
		this.operater = operater;
	    }
       

	    /**
		*
		*/
		
        public int getIsdel() {
     
		return isdel;
	    }
        
	    public void setIsdel(int isdel) {
		this.isdel = isdel;
	    }
       

	    /**
		*
		*/
		
        public String getSortorder() {
     
		return sortorder;
	    }
        
	    public void setSortorder(String sortorder) {
		this.sortorder = sortorder;
	    }
       

	    /**
		*
		*/
		
        public String getM_apk_size() {
     
		return m_apk_size;
	    }
        
	    public void setM_apk_size(String m_apk_size) {
		this.m_apk_size = m_apk_size;
	    }
       

	    /**
		*
		*/
		
        public String getF_apk_size() {
     
		return f_apk_size;
	    }
        
	    public void setF_apk_size(String f_apk_size) {
		this.f_apk_size = f_apk_size;
	    }
       

	    /**
		*
		*/
		
        public String getPackagename() {
     
		return packagename;
	    }
        
	    public void setPackagename(String packagename) {
		this.packagename = packagename;
	    }
       
      /*  public static aihao_dao convert(fitwear_app_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setAppname(_dao.getAppname());
        
        temp.setCategory(_dao.getCategory());
        
        temp.setDeveloper(_dao.getDeveloper());
        
        temp.setVername(_dao.getVername());
        
        temp.setVercode(_dao.getVercode());
        
        temp.setSummary(_dao.getSummary());
        
        temp.setDescript(_dao.getDescript());
        
        temp.setLogo(_dao.getLogo());
        
        temp.setImgs(_dao.getImgs());
        
        temp.setM_apk(_dao.getM_apk());
        
        temp.setF_apk(_dao.getF_apk());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        temp.setOperater(_dao.getOperater());
        
        temp.setIsdel(_dao.getIsdel());
        
        temp.setSortorder(_dao.getSortorder());
        
        temp.setM_apk_size(_dao.getM_apk_size());
        
        temp.setF_apk_size(_dao.getF_apk_size());
        
        temp.setPackagename(_dao.getPackagename());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

