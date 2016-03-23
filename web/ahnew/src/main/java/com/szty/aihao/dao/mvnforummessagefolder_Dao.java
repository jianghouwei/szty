/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： mvnforummessagefolderEntity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@文件说明
    *@MVNFORUMMESSAGEFOLDER数据实体
    *@作者：宋春林 
    */

	public class mvnforummessagefolder_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// 变量定义
        
        /**
	     * 
	     */
		private String foldername;
        /**
	     * 
	     */
		private int memberid;
        /**
	     * 
	     */
		private int folderorder;
        /**
	     * 
	     */
		private int folderstatus;
        /**
	     * 
	     */
		private int folderoption;
        /**
	     * 
	     */
		private int foldertype;
        /**
	     * 
	     */
		private Date foldercreationdate;
        /**
	     * 
	     */
		private Date foldermodifieddate;
        
		// 变量定义结束
		
	
		
		// 公共属性
		
	    /**
		*
		*/
		
        public String getFoldername() {
     
		return foldername;
	    }
        
	    public void setFoldername(String foldername) {
		this.foldername = foldername;
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
		
        public int getFolderorder() {
     
		return folderorder;
	    }
        
	    public void setFolderorder(int folderorder) {
		this.folderorder = folderorder;
	    }
       

	    /**
		*
		*/
		
        public int getFolderstatus() {
     
		return folderstatus;
	    }
        
	    public void setFolderstatus(int folderstatus) {
		this.folderstatus = folderstatus;
	    }
       

	    /**
		*
		*/
		
        public int getFolderoption() {
     
		return folderoption;
	    }
        
	    public void setFolderoption(int folderoption) {
		this.folderoption = folderoption;
	    }
       

	    /**
		*
		*/
		
        public int getFoldertype() {
     
		return foldertype;
	    }
        
	    public void setFoldertype(int foldertype) {
		this.foldertype = foldertype;
	    }
       

	    /**
		*
		*/
		
        public Date getFoldercreationdate() {
     
		return foldercreationdate;
	    }
        
	    public void setFoldercreationdate(Date foldercreationdate) {
		this.foldercreationdate = foldercreationdate;
	    }
       

	    /**
		*
		*/
		
        public Date getFoldermodifieddate() {
     
		return foldermodifieddate;
	    }
        
	    public void setFoldermodifieddate(Date foldermodifieddate) {
		this.foldermodifieddate = foldermodifieddate;
	    }
       
      /*  public static aihao_dao convert(mvnforummessagefolder_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setFoldername(_dao.getFoldername());
        
        temp.setMemberid(_dao.getMemberid());
        
        temp.setFolderorder(_dao.getFolderorder());
        
        temp.setFolderstatus(_dao.getFolderstatus());
        
        temp.setFolderoption(_dao.getFolderoption());
        
        temp.setFoldertype(_dao.getFoldertype());
        
        temp.setFoldercreationdate(_dao.getFoldercreationdate());
        
        temp.setFoldermodifieddate(_dao.getFoldermodifieddate());
        
        return temp;
        }*/
		// 公共属性结束
		
	}

