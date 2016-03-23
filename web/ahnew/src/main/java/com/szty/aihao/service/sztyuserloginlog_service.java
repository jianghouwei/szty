/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyuserloginlog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sztyuserloginlog_Dao;
import com.szty.aihao.core.sztyuserloginlog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYUSERLOGINLOG逻辑层接口
    *@作者：宋春林 
    */

	public class sztyuserloginlog_service
	{
        public  sztyuserloginlog_core _dal=classFactory.getsztyuserloginlog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERLOGINLOG实体
         * @return 新插入记录的编号
         */
		public int insert_sztyuserloginlog (sztyuserloginlog_Dao _SZTYUSERLOGINLOGModel )  throws Exception{
         return _dal.insert_sztyuserloginlog( _SZTYUSERLOGINLOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERLOGINLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyuserloginlog(Object[] _para)  throws Exception{
        return _dal.insert_sztyuserloginlog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERLOGINLOG实体
         * @return 影响的行数
         */
		public int update_sztyuserloginlog(sztyuserloginlog_Dao _SZTYUSERLOGINLOGModel)  throws Exception{
        return _dal.update_sztyuserloginlog( _SZTYUSERLOGINLOGModel);
		}
	
		

         /**
         *  删除数据表SZTYUSERLOGINLOG中的一条记录
         * @param SZTYUSERLOGINLOG实体
         * @return 新插入记录的编号
         */
		public int delete_sztyuserloginlog(int Id)  throws Exception{
        return _dal.delete_sztyuserloginlog( Id);
		}

		

       
          /**
         * 得到 sztyuserloginlog 数据实体
         * @param Id">Id
         * @return<sztyuserloginlog 数据实体
        * @throws Exception 
         */
		public sztyuserloginlog_Dao get_sztyuserloginlogDao(int Id) throws Exception{
        return _dal.get_sztyuserloginlogDao( Id);
		}
		
		    /**
         * 根据SZTYUSERLOGINLOG返回的查询DataRow创建一个SZTYUSERLOGINLOGEntity对象
         * @param SZTYUSERLOGINLOG row
         * @returnSZTYUSERLOGINLOGList对象
        * @throws Exception 
         */
		public List<sztyuserloginlog_Dao> get_sztyuserloginlog_All() throws Exception{
            return _dal.get_sztyuserloginlog_All();
            }
		    /**
         * 根据SZTYUSERLOGINLOG返回的查询DataRow创建一个SZTYUSERLOGINLOGEntity对象
         * @param SZTYUSERLOGINLOG row
         * @returnSZTYUSERLOGINLOGList对象
        * @throws Exception 
         */
		public List<sztyuserloginlog_Dao> get_sztyuserloginlog_All(String strWhere) throws Exception{
            return _dal.get_sztyuserloginlog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyuserloginlog_Dao> get_sztyuserloginlog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sztyuserloginlog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SZTYUSERLOGINLOG返回的查询DataRow创建一个SZTYUSERLOGINLOGEntity对象
         * @param SZTYUSERLOGINLOG row
         * @returnSZTYUSERLOGINLOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sztyuserloginlog_Dao> get_sztyuserloginlog_Dictionary(String strWhere) throws Exception{
            return _dal.get_sztyuserloginlog_Dictionary(strWhere);
            }
		 /**
         * 更新SZTYUSERLOGINLOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sztyuserloginlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sztyuserloginlog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SZTYUSERLOGINLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sztyuserloginlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sztyuserloginlog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SZTYUSERLOGINLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsztyuserloginlog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sztyuserloginlog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
