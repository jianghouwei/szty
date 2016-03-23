/*
 *@===================================================================
 *@��Ŀ˵��
 *@���ߣ��δ��� 
 *@�汾��Ϣ:@Copy Right 2011-2015
 *@�ļ��� iDataSc_admin.java
 *@��Ŀ���ƣ�JAVA��Ŀ����
 *@����ʱ�䣺2015/11/3
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.sc_admin_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@�ļ�˵��
    *@SC_ADMIN���ݽӿ�
    *@���ߣ��δ��� 
    */

	public interface sc_admin_core extends Serializable 
	{
     
         /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_ADMINʵ��
         * @return �²����¼�ı��
         */
		public int insert_sc_admin(sc_admin_Dao _SC_ADMINModel) throws Exception;
				
        
        /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_ADMINprrameter
         * @return �²����¼�ı��
         */
         public int insert_sc_admin(Object[] _para) throws Exception;
        
	
		
		 /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_ADMINʵ��
         * @return Ӱ�������
         */
		public int update_sc_admin(sc_admin_Dao _SC_ADMINModel) throws Exception;
		

         /**
         *  ɾ�����ݱ�SC_ADMIN�е�һ����¼
         * @param SC_ADMINʵ��
         * @return �²����¼�ı��
         */
		public int delete_sc_admin(int _id) throws Exception;
		
          /**
         * �õ� sc_admin ����ʵ��
         * @param Id">Id
         * @return<sc_admin ����ʵ��
        * @throws Exception 
         */
		public sc_admin_Dao get_sc_adminDao(int _id) throws Exception;
		public int get_sc_adminCount(String sWhere) throws Exception;
		
		
		    /**
         * ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
         * @param SC_ADMIN row
         * @returnSC_ADMINList����
        * @throws Exception 
         */
		public List< sc_admin_Dao> get_sc_admin_All() throws Exception;
		    /**
         * ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
         * @param SC_ADMIN row
         * @returnSC_ADMINList����
        * @throws Exception 
         */
		public List<sc_admin_Dao> get_sc_admin_All(String strWhere) throws Exception;
			/**
	 * ����SCLTEST���� ��ҳ����
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList����
	 * @throws Exception
	 */
	public List<sc_admin_Dao> get_sc_admin_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
         * @param SC_ADMIN row
         * @returnSC_ADMINDictionary����
        * @throws Exception 
         */
    public Dictionary<Integer, sc_admin_Dao> get_sc_admin_Dictionary(String strWhere) throws Exception;
		 /**
         * ����SC_ADMIN�ֶμ�һ
         * @param FieldName
         * @param sid
         */
	public int create_sc_admin_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * ����SC_ADMINInt���ֶ�
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_sc_admin_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * ����SC_ADMINIString���ֶ�
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_sc_admin_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
