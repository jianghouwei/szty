/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： huangyebaiduglEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@HUANGYEBAIDUGL数据实体
    *@作者：宋春林 
    */

	public class huangyebaidugl_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int glid;
        /**
	     * 
	     */
		private int glfrom;
        /**
	     * 
	     */
		private String gladdr;
        /**
	     * 
	     */
		private String glcp;
        /**
	     * 
	     */
		private String gldistance;
        /**
	     * 
	     */
		private String glname;
        /**
	     * 
	     */
		private String glpoitype;
        /**
	     * 
	     */
		private String gltel;
        /**
	     * 
	     */
		private String gluid;
        /**
	     * 
	     */
		private String glzip;
        /**
	     * 
	     */
		private String gllongitude;
        /**
	     * 
	     */
		private String gllatitude;
        /**
	     * 
	     */
		private Date cdate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getGlid() {
     
		return glid;
	    }
        
	    public void setGlid(int glid) {
		this.glid = glid;
	    }
       

	    /**
		*
		*/
		
        public int getGlfrom() {
     
		return glfrom;
	    }
        
	    public void setGlfrom(int glfrom) {
		this.glfrom = glfrom;
	    }
       

	    /**
		*
		*/
		
        public String getGladdr() {
     
		return gladdr;
	    }
        
	    public void setGladdr(String gladdr) {
		this.gladdr = gladdr;
	    }
       

	    /**
		*
		*/
		
        public String getGlcp() {
     
		return glcp;
	    }
        
	    public void setGlcp(String glcp) {
		this.glcp = glcp;
	    }
       

	    /**
		*
		*/
		
        public String getGldistance() {
     
		return gldistance;
	    }
        
	    public void setGldistance(String gldistance) {
		this.gldistance = gldistance;
	    }
       

	    /**
		*
		*/
		
        public String getGlname() {
     
		return glname;
	    }
        
	    public void setGlname(String glname) {
		this.glname = glname;
	    }
       

	    /**
		*
		*/
		
        public String getGlpoitype() {
     
		return glpoitype;
	    }
        
	    public void setGlpoitype(String glpoitype) {
		this.glpoitype = glpoitype;
	    }
       

	    /**
		*
		*/
		
        public String getGltel() {
     
		return gltel;
	    }
        
	    public void setGltel(String gltel) {
		this.gltel = gltel;
	    }
       

	    /**
		*
		*/
		
        public String getGluid() {
     
		return gluid;
	    }
        
	    public void setGluid(String gluid) {
		this.gluid = gluid;
	    }
       

	    /**
		*
		*/
		
        public String getGlzip() {
     
		return glzip;
	    }
        
	    public void setGlzip(String glzip) {
		this.glzip = glzip;
	    }
       

	    /**
		*
		*/
		
        public String getGllongitude() {
     
		return gllongitude;
	    }
        
	    public void setGllongitude(String gllongitude) {
		this.gllongitude = gllongitude;
	    }
       

	    /**
		*
		*/
		
        public String getGllatitude() {
     
		return gllatitude;
	    }
        
	    public void setGllatitude(String gllatitude) {
		this.gllatitude = gllatitude;
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
       
      /*  public static aihao_dao convert(huangyebaidugl_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setGlid(_dao.getGlid());
        
        temp.setGlfrom(_dao.getGlfrom());
        
        temp.setGladdr(_dao.getGladdr());
        
        temp.setGlcp(_dao.getGlcp());
        
        temp.setGldistance(_dao.getGldistance());
        
        temp.setGlname(_dao.getGlname());
        
        temp.setGlpoitype(_dao.getGlpoitype());
        
        temp.setGltel(_dao.getGltel());
        
        temp.setGluid(_dao.getGluid());
        
        temp.setGlzip(_dao.getGlzip());
        
        temp.setGllongitude(_dao.getGllongitude());
        
        temp.setGllatitude(_dao.getGllatitude());
        
        temp.setCdate(_dao.getCdate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

