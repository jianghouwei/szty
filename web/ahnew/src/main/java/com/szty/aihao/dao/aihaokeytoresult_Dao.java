/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： aihaokeytoresultEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@AIHAOKEYTORESULT数据实体
    *@作者：宋春林 
    */

	public class aihaokeytoresult_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int keyid;
        /**
	     * 
	     */
		private String keynames;
        /**
	     * 
	     */
		private String merchantid;
        /**
	     * 
	     */
		private int procode;
        /**
	     * 
	     */
		private int citycode;
        /**
	     * 
	     */
		private int districtcode;
        /**
	     * 
	     */
		private String districtname;
        /**
	     * 
	     */
		private String merchantname;
        /**
	     * 
	     */
		private String merchantphone;
        /**
	     * 
	     */
		private String merchantaddress;
        /**
	     * 
	     */
		private String googlelat;
        /**
	     * 
	     */
		private String googlelng;
        /**
	     * 
	     */
		private String baidulat;
        /**
	     * 
	     */
		private String baidulng;
        /**
	     * 
	     */
		private String geohas;
        /**
	     * 
	     */
		private int fromtype;
        /**
	     * 
	     */
		private String bigclass;
        /**
	     * 
	     */
		private Date cdate;
        /**
	     * 
	     */
		private int keyorder;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getKeyid() {
     
		return keyid;
	    }
        
	    public void setKeyid(int keyid) {
		this.keyid = keyid;
	    }
       

	    /**
		*
		*/
		
        public String getKeynames() {
     
		return keynames;
	    }
        
	    public void setKeynames(String keynames) {
		this.keynames = keynames;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantid() {
     
		return merchantid;
	    }
        
	    public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	    }
       

	    /**
		*
		*/
		
        public int getProcode() {
     
		return procode;
	    }
        
	    public void setProcode(int procode) {
		this.procode = procode;
	    }
       

	    /**
		*
		*/
		
        public int getCitycode() {
     
		return citycode;
	    }
        
	    public void setCitycode(int citycode) {
		this.citycode = citycode;
	    }
       

	    /**
		*
		*/
		
        public int getDistrictcode() {
     
		return districtcode;
	    }
        
	    public void setDistrictcode(int districtcode) {
		this.districtcode = districtcode;
	    }
       

	    /**
		*
		*/
		
        public String getDistrictname() {
     
		return districtname;
	    }
        
	    public void setDistrictname(String districtname) {
		this.districtname = districtname;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantname() {
     
		return merchantname;
	    }
        
	    public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantphone() {
     
		return merchantphone;
	    }
        
	    public void setMerchantphone(String merchantphone) {
		this.merchantphone = merchantphone;
	    }
       

	    /**
		*
		*/
		
        public String getMerchantaddress() {
     
		return merchantaddress;
	    }
        
	    public void setMerchantaddress(String merchantaddress) {
		this.merchantaddress = merchantaddress;
	    }
       

	    /**
		*
		*/
		
        public String getGooglelat() {
     
		return googlelat;
	    }
        
	    public void setGooglelat(String googlelat) {
		this.googlelat = googlelat;
	    }
       

	    /**
		*
		*/
		
        public String getGooglelng() {
     
		return googlelng;
	    }
        
	    public void setGooglelng(String googlelng) {
		this.googlelng = googlelng;
	    }
       

	    /**
		*
		*/
		
        public String getBaidulat() {
     
		return baidulat;
	    }
        
	    public void setBaidulat(String baidulat) {
		this.baidulat = baidulat;
	    }
       

	    /**
		*
		*/
		
        public String getBaidulng() {
     
		return baidulng;
	    }
        
	    public void setBaidulng(String baidulng) {
		this.baidulng = baidulng;
	    }
       

	    /**
		*
		*/
		
        public String getGeohas() {
     
		return geohas;
	    }
        
	    public void setGeohas(String geohas) {
		this.geohas = geohas;
	    }
       

	    /**
		*
		*/
		
        public int getFromtype() {
     
		return fromtype;
	    }
        
	    public void setFromtype(int fromtype) {
		this.fromtype = fromtype;
	    }
       

	    /**
		*
		*/
		
        public String getBigclass() {
     
		return bigclass;
	    }
        
	    public void setBigclass(String bigclass) {
		this.bigclass = bigclass;
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
		
        public int getKeyorder() {
     
		return keyorder;
	    }
        
	    public void setKeyorder(int keyorder) {
		this.keyorder = keyorder;
	    }
       
      /*  public static aihao_dao convert(aihaokeytoresult_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setKeyid(_dao.getKeyid());
        
        temp.setKeynames(_dao.getKeynames());
        
        temp.setMerchantid(_dao.getMerchantid());
        
        temp.setProcode(_dao.getProcode());
        
        temp.setCitycode(_dao.getCitycode());
        
        temp.setDistrictcode(_dao.getDistrictcode());
        
        temp.setDistrictname(_dao.getDistrictname());
        
        temp.setMerchantname(_dao.getMerchantname());
        
        temp.setMerchantphone(_dao.getMerchantphone());
        
        temp.setMerchantaddress(_dao.getMerchantaddress());
        
        temp.setGooglelat(_dao.getGooglelat());
        
        temp.setGooglelng(_dao.getGooglelng());
        
        temp.setBaidulat(_dao.getBaidulat());
        
        temp.setBaidulng(_dao.getBaidulng());
        
        temp.setGeohas(_dao.getGeohas());
        
        temp.setFromtype(_dao.getFromtype());
        
        temp.setBigclass(_dao.getBigclass());
        
        temp.setCdate(_dao.getCdate());
        
        temp.setKeyorder(_dao.getKeyorder());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

