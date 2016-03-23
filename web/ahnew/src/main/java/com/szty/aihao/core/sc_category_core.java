/*
 *@===================================================================
 *@��Ŀ˵��
 *@���ߣ��δ��� 
 *@�汾��Ϣ:@Copy Right 2011-2015
 *@�ļ��� iDataSc_category.java
 *@��Ŀ���ƣ�JAVA��Ŀ����
 *@����ʱ�䣺2015/11/3
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.sc_category_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@�ļ�˵��
    *@SC_CATEGORY���ݽӿ�
    *@���ߣ��δ��� 
    */

	public interface sc_category_core extends Serializable 
	{
     
         /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_CATEGORYʵ��
         * @return �²����¼�ı��
         */
		public int insert_sc_category(sc_category_Dao _SC_CATEGORYModel) throws Exception;
				
        
        /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_CATEGORYprrameter
         * @return �²����¼�ı��
         */
         public int insert_sc_category(Object[] _para) throws Exception;
        
	
		
		 /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_CATEGORYʵ��
         * @return Ӱ�������
         */
		public int update_sc_category(sc_category_Dao _SC_CATEGORYModel) throws Exception;
		

         /**
         *  ɾ�����ݱ�SC_CATEGORY�е�һ����¼
         * @param SC_CATEGORYʵ��
         * @return �²����¼�ı��
         */
		public int delete_sc_category(int _id) throws Exception;
		
          /**
         * �õ� sc_category ����ʵ��
         * @param Id">Id
         * @return<sc_category ����ʵ��
        * @throws Exception 
         */
		public sc_category_Dao get_sc_categoryDao(int _id) throws Exception;
		public int get_sc_categoryCount(String sWhere) throws Exception;
		
		
		    /**
         * ����SC_CATEGORY���صĲ�ѯDataRow����һ��SC_CATEGORYEntity����
         * @param SC_CATEGORY row
         * @returnSC_CATEGORYList����
        * @throws Exception 
         */
		public List< sc_category_Dao> get_sc_category_All() throws Exception;
		    /**
         * ����SC_CATEGORY���صĲ�ѯDataRow����һ��SC_CATEGORYEntity����
         * @param SC_CATEGORY row
         * @returnSC_CATEGORYList����
        * @throws Exception 
         */
		public List<sc_category_Dao> get_sc_category_All(String strWhere) throws Exception;
			/**
	 * ����SCLTEST���� ��ҳ����
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList����
	 * @throws Exception
	 */
	public List<sc_category_Dao> get_sc_category_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * ����SC_CATEGORY���صĲ�ѯDataRow����һ��SC_CATEGORYEntity����
         * @param SC_CATEGORY row
         * @returnSC_CATEGORYDictionary����
        * @throws Exception 
         */
    public Dictionary<Integer, sc_category_Dao> get_sc_category_Dictionary(String strWhere) throws Exception;
		 /**
         * ����SC_CATEGORY�ֶμ�һ
         * @param FieldName
         * @param sid
         */
	public int create_sc_category_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * ����SC_CATEGORYInt���ֶ�
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_sc_category_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * ����SC_CATEGORYIString���ֶ�
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_sc_category_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
