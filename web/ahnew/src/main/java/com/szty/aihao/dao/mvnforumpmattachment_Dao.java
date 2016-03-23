/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforumpmattachmentEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMPMATTACHMENT数据实体
    *@作者：宋春林 
    */

	public class mvnforumpmattachment_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private int pmattachid;
        /**
	     * 
	     */
		private int memberid;
        /**
	     * 
	     */
		private String pmattachfilename;
        /**
	     * 
	     */
		private int pmattachfilesize;
        /**
	     * 
	     */
		private String pmattachmimetype;
        /**
	     * 
	     */
		private String pmattachdesc;
        /**
	     * 
	     */
		private String pmattachcreationip;
        /**
	     * 
	     */
		private Date pmattachcreationdate;
        /**
	     * 
	     */
		private Date pmattachmodifieddate;
        /**
	     * 
	     */
		private int pmattachdownloadcount;
        /**
	     * 
	     */
		private int pmattachoption;
        /**
	     * 
	     */
		private int pmattachstatus;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public int getPmattachid() {
     
		return pmattachid;
	    }
        
	    public void setPmattachid(int pmattachid) {
		this.pmattachid = pmattachid;
	    }
       

	    /**
		*
		*/
		
        public int getMemberid() {
     
		return memberid;
	    }
        
	    public void setMemberid(int memberid) {
		this.memberid = memberid;
	    }
       

	    /**
		*
		*/
		
        public String getPmattachfilename() {
     
		return pmattachfilename;
	    }
        
	    public void setPmattachfilename(String pmattachfilename) {
		this.pmattachfilename = pmattachfilename;
	    }
       

	    /**
		*
		*/
		
        public int getPmattachfilesize() {
     
		return pmattachfilesize;
	    }
        
	    public void setPmattachfilesize(int pmattachfilesize) {
		this.pmattachfilesize = pmattachfilesize;
	    }
       

	    /**
		*
		*/
		
        public String getPmattachmimetype() {
     
		return pmattachmimetype;
	    }
        
	    public void setPmattachmimetype(String pmattachmimetype) {
		this.pmattachmimetype = pmattachmimetype;
	    }
       

	    /**
		*
		*/
		
        public String getPmattachdesc() {
     
		return pmattachdesc;
	    }
        
	    public void setPmattachdesc(String pmattachdesc) {
		this.pmattachdesc = pmattachdesc;
	    }
       

	    /**
		*
		*/
		
        public String getPmattachcreationip() {
     
		return pmattachcreationip;
	    }
        
	    public void setPmattachcreationip(String pmattachcreationip) {
		this.pmattachcreationip = pmattachcreationip;
	    }
       

	    /**
		*
		*/
		
        public Date getPmattachcreationdate() {
     
		return pmattachcreationdate;
	    }
        
	    public void setPmattachcreationdate(Date pmattachcreationdate) {
		this.pmattachcreationdate = pmattachcreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getPmattachmodifieddate() {
     
		return pmattachmodifieddate;
	    }
        
	    public void setPmattachmodifieddate(Date pmattachmodifieddate) {
		this.pmattachmodifieddate = pmattachmodifieddate;
	    }
       

	    /**
		*
		*/
		
        public int getPmattachdownloadcount() {
     
		return pmattachdownloadcount;
	    }
        
	    public void setPmattachdownloadcount(int pmattachdownloadcount) {
		this.pmattachdownloadcount = pmattachdownloadcount;
	    }
       

	    /**
		*
		*/
		
        public int getPmattachoption() {
     
		return pmattachoption;
	    }
        
	    public void setPmattachoption(int pmattachoption) {
		this.pmattachoption = pmattachoption;
	    }
       

	    /**
		*
		*/
		
        public int getPmattachstatus() {
     
		return pmattachstatus;
	    }
        
	    public void setPmattachstatus(int pmattachstatus) {
		this.pmattachstatus = pmattachstatus;
	    }
       
      /*  public static aihao_dao convert(mvnforumpmattachment_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setPmattachid(_dao.getPmattachid());
        
        temp.setMemberid(_dao.getMemberid());
        
        temp.setPmattachfilename(_dao.getPmattachfilename());
        
        temp.setPmattachfilesize(_dao.getPmattachfilesize());
        
        temp.setPmattachmimetype(_dao.getPmattachmimetype());
        
        temp.setPmattachdesc(_dao.getPmattachdesc());
        
        temp.setPmattachcreationip(_dao.getPmattachcreationip());
        
        temp.setPmattachcreationdate(_dao.getPmattachcreationdate());
        
        temp.setPmattachmodifieddate(_dao.getPmattachmodifieddate());
        
        temp.setPmattachdownloadcount(_dao.getPmattachdownloadcount());
        
        temp.setPmattachoption(_dao.getPmattachoption());
        
        temp.setPmattachstatus(_dao.getPmattachstatus());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

