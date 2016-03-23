/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyemployee.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sztyemployee_Dao;
import com.szty.aihao.core.sztyemployee_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYEMPLOYEE逻辑层接口
    *@作者：宋春林 
    */

	public class sztyemployee_service
	{
        public  sztyemployee_core _dal=classFactory.getsztyemployee();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYEMPLOYEE实体
         * @return 新插入记录的编号
         */
		public int insert_sztyemployee (sztyemployee_Dao _SZTYEMPLOYEEModel )  throws Exception{
         return _dal.insert_sztyemployee( _SZTYEMPLOYEEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYEMPLOYEEprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyemployee(Object[] _para)  throws Exception{
        return _dal.insert_sztyemployee( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYEMPLOYEE实体
         * @return 影响的行数
         */
		public int update_sztyemployee(sztyemployee_Dao _SZTYEMPLOYEEModel)  throws Exception{
        return _dal.update_sztyemployee( _SZTYEMPLOYEEModel);
		}
	
		

         /**
         *  删除数据表SZTYEMPLOYEE中的一条记录
         * @param SZTYEMPLOYEE实体
         * @return 新插入记录的编号
         */
		public int delete_sztyemployee(int Eid)  throws Exception{
        return _dal.delete_sztyemployee( Eid);
		}

		

       
          /**
         * 得到 sztyemployee 数据实体
         * @param Eid">Eid
         * @return<sztyemployee 数据实体
        * @throws Exception 
         */
		public sztyemployee_Dao get_sztyemployeeDao(int Eid) throws Exception{
        return _dal.get_sztyemployeeDao( Eid);
		}
		
		    /**
         * 根据SZTYEMPLOYEE返回的查询DataRow创建一个SZTYEMPLOYEEEntity对象
         * @param SZTYEMPLOYEE row
         * @returnSZTYEMPLOYEEList对象
        * @throws Exception 
         */
		public List<sztyemployee_Dao> get_sztyemployee_All() throws Exception{
            return _dal.get_sztyemployee_All();
            }
		    /**
         * 根据SZTYEMPLOYEE返回的查询DataRow创建一个SZTYEMPLOYEEEntity对象
         * @param SZTYEMPLOYEE row
         * @returnSZTYEMPLOYEEList对象
        * @throws Exception 
         */
		public List<sztyemployee_Dao> get_sztyemployee_All(String strWhere) throws Exception{
            return _dal.get_sztyemployee_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyemployee_Dao> get_sztyemployee_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sztyemployee_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SZTYEMPLOYEE返回的查询DataRow创建一个SZTYEMPLOYEEEntity对象
         * @param SZTYEMPLOYEE row
         * @returnSZTYEMPLOYEEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sztyemployee_Dao> get_sztyemployee_Dictionary(String strWhere) throws Exception{
            return _dal.get_sztyemployee_Dictionary(strWhere);
            }
		 /**
         * 更新SZTYEMPLOYEE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sztyemployee_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sztyemployee_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SZTYEMPLOYEEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sztyemployee_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sztyemployee_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SZTYEMPLOYEEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsztyemployee_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sztyemployee_UpdateString( FieldName, Value, sid);
            }
        
        
    }
