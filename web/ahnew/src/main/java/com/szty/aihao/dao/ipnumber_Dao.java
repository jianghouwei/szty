/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： ipnumberEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@IPNUMBER数据实体
    *@作者：宋春林 
    */

	public class ipnumber_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String ipfrom;
        /**
	     * 
	     */
		private String ipto;
        /**
	     * 
	     */
		private String intro;
        /**
	     * 
	     */
		private String province;
        /**
	     * 
	     */
		private String city;
        /**
	     * 
	     */
		private String other;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private int ipfromnumber;
        /**
	     * 
	     */
		private int iptonumber;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getIpfrom() {
     
		return ipfrom;
	    }
        
	    public void setIpfrom(String ipfrom) {
		this.ipfrom = ipfrom;
	    }
       

	    /**
		*
		*/
		
        public String getIpto() {
     
		return ipto;
	    }
        
	    public void setIpto(String ipto) {
		this.ipto = ipto;
	    }
       

	    /**
		*
		*/
		
        public String getIntro() {
     
		return intro;
	    }
        
	    public void setIntro(String intro) {
		this.intro = intro;
	    }
       

	    /**
		*
		*/
		
        public String getProvince() {
     
		return province;
	    }
        
	    public void setProvince(String province) {
		this.province = province;
	    }
       

	    /**
		*
		*/
		
        public String getCity() {
     
		return city;
	    }
        
	    public void setCity(String city) {
		this.city = city;
	    }
       

	    /**
		*
		*/
		
        public String getOther() {
     
		return other;
	    }
        
	    public void setOther(String other) {
		this.other = other;
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
		
        public int getIpfromnumber() {
     
		return ipfromnumber;
	    }
        
	    public void setIpfromnumber(int ipfromnumber) {
		this.ipfromnumber = ipfromnumber;
	    }
       

	    /**
		*
		*/
		
        public int getIptonumber() {
     
		return iptonumber;
	    }
        
	    public void setIptonumber(int iptonumber) {
		this.iptonumber = iptonumber;
	    }
       
      /*  public static aihao_dao convert(ipnumber_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setIpfrom(_dao.getIpfrom());
        
        temp.setIpto(_dao.getIpto());
        
        temp.setIntro(_dao.getIntro());
        
        temp.setProvince(_dao.getProvince());
        
        temp.setCity(_dao.getCity());
        
        temp.setOther(_dao.getOther());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setIpfromnumber(_dao.getIpfromnumber());
        
        temp.setIptonumber(_dao.getIptonumber());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

