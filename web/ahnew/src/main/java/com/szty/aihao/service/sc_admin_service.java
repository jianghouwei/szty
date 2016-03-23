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

package com.szty.aihao.service;

import com.szty.aihao.dao.sc_admin_Dao;
import com.szty.aihao.core.sc_admin_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@�ļ�˵��
    *@SC_ADMIN�߼���ӿ�
    *@���ߣ��δ��� 
    */

	public class sc_admin_service
	{
        public  sc_admin_core _dal=classFactory.getsc_admin();
	
     
         /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_ADMINʵ��
         * @return �²����¼�ı��
         */
		public int insert_sc_admin (sc_admin_Dao _SC_ADMINModel )  throws Exception{
         return _dal.insert_sc_admin( _SC_ADMINModel);
		}
        
        /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_ADMINprrameter
         * @return �²����¼�ı��
         */
         public int insert_sc_admin(Object[] _para)  throws Exception{
        return _dal.insert_sc_admin( _para);
        }
	
		 /**
         * �����ݿ��в���һ���¼�¼��
         * @param SC_ADMINʵ��
         * @return Ӱ�������
         */
		public int update_sc_admin(sc_admin_Dao _SC_ADMINModel)  throws Exception{
        return _dal.update_sc_admin( _SC_ADMINModel);
		}
	
		

         /**
         *  ɾ�����ݱ�SC_ADMIN�е�һ����¼
         * @param SC_ADMINʵ��
         * @return �²����¼�ı��
         */
		public int delete_sc_admin(int Id)  throws Exception{
        return _dal.delete_sc_admin( Id);
		}

		

       
          /**
         * �õ� sc_admin ����ʵ��
         * @param Id">Id
         * @return<sc_admin ����ʵ��
        * @throws Exception 
         */
		public sc_admin_Dao get_sc_adminDao(int Id) throws Exception{
        return _dal.get_sc_adminDao( Id);
		}
		public int get_sc_adminCount(String sWhere) throws Exception{
        return _dal.get_sc_adminCount( sWhere);
		}
		    /**
         * ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
         * @param SC_ADMIN row
         * @returnSC_ADMINList����
        * @throws Exception 
         */
		public List<sc_admin_Dao> get_sc_admin_All() throws Exception{
            return _dal.get_sc_admin_All();
            }
		    /**
         * ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
         * @param SC_ADMIN row
         * @returnSC_ADMINList����
        * @throws Exception 
         */
		public List<sc_admin_Dao> get_sc_admin_All(String strWhere) throws Exception{
            return _dal.get_sc_admin_All(strWhere);
            } 
     /* ����SCLTEST���� ��ҳ����
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList����
	 * @throws Exception
	 */
	public List<sc_admin_Dao> get_sc_admin_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sc_admin_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * ����SC_ADMIN���صĲ�ѯDataRow����һ��SC_ADMINEntity����
         * @param SC_ADMIN row
         * @returnSC_ADMINDictionary����
        * @throws Exception 
         */
        public Dictionary<Integer, sc_admin_Dao> get_sc_admin_Dictionary(String strWhere) throws Exception{
            return _dal.get_sc_admin_Dictionary(strWhere);
            }
		 /**
         * ����SC_ADMIN�ֶμ�һ
         * @param FieldName
         * @param sid
         */
	    public int create_sc_admin_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sc_admin_UpdateIncreate( FieldName, sid);
            }
         /**
         * ����SC_ADMINInt���ֶ�
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sc_admin_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sc_admin_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * ����SC_ADMINIString���ֶ�
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsc_admin_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sc_admin_UpdateString( FieldName, Value, sid);
            }
        
        
    }
