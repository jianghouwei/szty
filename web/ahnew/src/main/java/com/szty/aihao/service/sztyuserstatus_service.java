/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyuserstatus.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sztyuserstatus_Dao;
import com.szty.aihao.core.sztyuserstatus_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYUSERSTATUS逻辑层接口
    *@作者：宋春林 
    */

	public class sztyuserstatus_service
	{
        public  sztyuserstatus_core _dal=classFactory.getsztyuserstatus();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERSTATUS实体
         * @return 新插入记录的编号
         */
		public int insert_sztyuserstatus (sztyuserstatus_Dao _SZTYUSERSTATUSModel )  throws Exception{
         return _dal.insert_sztyuserstatus( _SZTYUSERSTATUSModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERSTATUSprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyuserstatus(Object[] _para)  throws Exception{
        return _dal.insert_sztyuserstatus( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERSTATUS实体
         * @return 影响的行数
         */
		public int update_sztyuserstatus(sztyuserstatus_Dao _SZTYUSERSTATUSModel)  throws Exception{
        return _dal.update_sztyuserstatus( _SZTYUSERSTATUSModel);
		}
	
		

         /**
         *  删除数据表SZTYUSERSTATUS中的一条记录
         * @param SZTYUSERSTATUS实体
         * @return 新插入记录的编号
         */
		public int delete_sztyuserstatus(int Mobile)  throws Exception{
        return _dal.delete_sztyuserstatus( Mobile);
		}

		

       
          /**
         * 得到 sztyuserstatus 数据实体
         * @param Mobile">Mobile
         * @return<sztyuserstatus 数据实体
        * @throws Exception 
         */
		public sztyuserstatus_Dao get_sztyuserstatusDao(int Mobile) throws Exception{
        return _dal.get_sztyuserstatusDao( Mobile);
		}
		
		    /**
         * 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
         * @param SZTYUSERSTATUS row
         * @returnSZTYUSERSTATUSList对象
        * @throws Exception 
         */
		public List<sztyuserstatus_Dao> get_sztyuserstatus_All() throws Exception{
            return _dal.get_sztyuserstatus_All();
            }
		    /**
         * 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
         * @param SZTYUSERSTATUS row
         * @returnSZTYUSERSTATUSList对象
        * @throws Exception 
         */
		public List<sztyuserstatus_Dao> get_sztyuserstatus_All(String strWhere) throws Exception{
            return _dal.get_sztyuserstatus_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyuserstatus_Dao> get_sztyuserstatus_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sztyuserstatus_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
         * @param SZTYUSERSTATUS row
         * @returnSZTYUSERSTATUSDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sztyuserstatus_Dao> get_sztyuserstatus_Dictionary(String strWhere) throws Exception{
            return _dal.get_sztyuserstatus_Dictionary(strWhere);
            }
		 /**
         * 更新SZTYUSERSTATUS字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sztyuserstatus_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sztyuserstatus_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SZTYUSERSTATUSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sztyuserstatus_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sztyuserstatus_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SZTYUSERSTATUSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsztyuserstatus_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sztyuserstatus_UpdateString( FieldName, Value, sid);
            }
        
        
    }
