/*
 *@===================================================================
 *@��Ŀ˵��
 *@���ߣ��δ��� 
 *@�汾��Ϣ:@Copy Right 2011-2015
 *@�ļ��� sc_categoryEntity.java
 *@��Ŀ���ƣ�JAVA��Ŀ����
 *@����ʱ�䣺2015/11/3
 *@===================================================================
 */

package com.szty.aihao.dao;

import java.io.Serializable;
import java.util.Date;
    /**
    *@�ļ�˵��
    *@SC_CATEGORY����ʵ��
    *@���ߣ��δ��� 
    */

	public class sc_category_Dao implements Serializable
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
		private String catename;
        /**
	     * 
	     */
		private String cateflag;
        /**
	     * 
	     */
		private String parantid;
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
		
        public String getCatename() {
     
		return catename;
	    }
        
	    public void setCatename(String catename) {
		this.catename = catename;
	    }
       

	    /**
		*
		*/
		
        public String getCateflag() {
     
		return cateflag;
	    }
        
	    public void setCateflag(String cateflag) {
		this.cateflag = cateflag;
	    }
       

	    /**
		*
		*/
		
        public String getParantid() {
     
		return parantid;
	    }
        
	    public void setParantid(String parantid) {
		this.parantid = parantid;
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
       
      /*  public static aihao_dao convert(sc_category_Dao _dao){
        aihao_dao temp=new aihao_dao();
        temp.setId(_dao.getId());
        
        temp.setCatename(_dao.getCatename());
        
        temp.setCateflag(_dao.getCateflag());
        
        temp.setParantid(_dao.getParantid());
        
        temp.setIsdel(_dao.getIsdel());
        
        return temp;
        }*/
		// �������Խ���
		
	}

