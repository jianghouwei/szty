/*
 *@===================================================================
 *@��Ŀ˵��
 *@���ߣ��δ��� 
 *@�汾��Ϣ:@Copy Right 2011-2015
 *@�ļ��� sc_adminEntity.java
 *@��Ŀ���ƣ�JAVA��Ŀ����
 *@����ʱ�䣺2015/11/3
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@�ļ�˵��
    *@SC_ADMIN����ʵ��
    *@���ߣ��δ��� 
    */

	public class sc_admin_Dao implements Serializable
	{
        private static final long serialVersionUID = 1L;
        
		// ��������
        
        /**
	     * 
	     */
		private int id;
        /**
	     * 
	     */
		private String adminname;
        /**
	     * 
	     */
		private String adminpass;
        /**
	     * 
	     */
		private String adminflag;
        /**
	     * 
	     */
		private Date createtime;
        /**
	     * 
	     */
		private int isdel;
        
		// �����������
		
	
		
		// ��������
		
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
		
        public String getAdminname() {
     
		return adminname;
	    }
        
	    public void setAdminname(String adminname) {
		this.adminname = adminname;
	    }
       

	    /**
		*
		*/
		
        public String getAdminpass() {
     
		return adminpass;
	    }
        
	    public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	    }
       

	    /**
		*
		*/
		
        public String getAdminflag() {
     
		return adminflag;
	    }
        
	    public void setAdminflag(String adminflag) {
		this.adminflag = adminflag;
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
		
        public int getIsdel() {
     
		return isdel;
	    }
        
	    public void setIsdel(int isdel) {
		this.isdel = isdel;
	    }
       
      /*  public static aihao_dao convert(sc_admin_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setAdminname(_dao.getAdminname());
        
        temp.setAdminpass(_dao.getAdminpass());
        
        temp.setAdminflag(_dao.getAdminflag());
        
        temp.setCreatetime(_dao.getCreatetime());
        
        temp.setIsdel(_dao.getIsdel());
        
        return temp;
        }*/
		// �������Խ���
		
	}

