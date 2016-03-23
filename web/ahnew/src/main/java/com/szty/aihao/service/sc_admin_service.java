/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSc_admin.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/11/3
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sc_admin_Dao;
import com.szty.aihao.core.sc_admin_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SC_ADMIN逻辑层接口
    *@作者：宋春林 
    */

	public class sc_admin_service
	{
        public  sc_admin_core _dal=classFactory.getsc_admin();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SC_ADMIN实体
         * @return 新插入记录的编号
         */
		public int insert_sc_admin (sc_admin_Dao _SC_ADMINModel )  throws Exception{
         return _dal.insert_sc_admin( _SC_ADMINModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SC_ADMINprrameter
         * @return 新插入记录的编号
         */
         public int insert_sc_admin(Object[] _para)  throws Exception{
        return _dal.insert_sc_admin( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SC_ADMIN实体
         * @return 影响的行数
         */
		public int update_sc_admin(sc_admin_Dao _SC_ADMINModel)  throws Exception{
        return _dal.update_sc_admin( _SC_ADMINModel);
		}
	
		

         /**
         *  删除数据表SC_ADMIN中的一条记录
         * @param SC_ADMIN实体
         * @return 新插入记录的编号
         */
		public int delete_sc_admin(int Id)  throws Exception{
        return _dal.delete_sc_admin( Id);
		}

		

       
          /**
         * 得到 sc_admin 数据实体
         * @param Id">Id
         * @return<sc_admin 数据实体
        * @throws Exception 
         */
		public sc_admin_Dao get_sc_adminDao(int Id) throws Exception{
        return _dal.get_sc_adminDao( Id);
		}
		public int get_sc_adminCount(String sWhere) throws Exception{
        return _dal.get_sc_adminCount( sWhere);
		}
		    /**
         * 根据SC_ADMIN返回的查询DataRow创建一个SC_ADMINEntity对象
         * @param SC_ADMIN row
         * @returnSC_ADMINList对象
        * @throws Exception 
         */
		public List<sc_admin_Dao> get_sc_admin_All() throws Exception{
            return _dal.get_sc_admin_All();
            }
		    /**
         * 根据SC_ADMIN返回的查询DataRow创建一个SC_ADMINEntity对象
         * @param SC_ADMIN row
         * @returnSC_ADMINList对象
        * @throws Exception 
         */
		public List<sc_admin_Dao> get_sc_admin_All(String strWhere) throws Exception{
            return _dal.get_sc_admin_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sc_admin_Dao> get_sc_admin_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sc_admin_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SC_ADMIN返回的查询DataRow创建一个SC_ADMINEntity对象
         * @param SC_ADMIN row
         * @returnSC_ADMINDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sc_admin_Dao> get_sc_admin_Dictionary(String strWhere) throws Exception{
            return _dal.get_sc_admin_Dictionary(strWhere);
            }
		 /**
         * 更新SC_ADMIN字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sc_admin_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sc_admin_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SC_ADMINInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sc_admin_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sc_admin_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SC_ADMINIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsc_admin_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sc_admin_UpdateString( FieldName, Value, sid);
            }
        
        
    }
