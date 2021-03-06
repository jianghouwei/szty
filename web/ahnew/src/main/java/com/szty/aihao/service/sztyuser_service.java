﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyuser.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sztyuser_Dao;
import com.szty.aihao.core.sztyuser_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYUSER逻辑层接口
    *@作者：宋春林 
    */

	public class sztyuser_service
	{
        public  sztyuser_core _dal=classFactory.getsztyuser();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSER实体
         * @return 新插入记录的编号
         */
		public int insert_sztyuser (sztyuser_Dao _SZTYUSERModel )  throws Exception{
         return _dal.insert_sztyuser( _SZTYUSERModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyuser(Object[] _para)  throws Exception{
        return _dal.insert_sztyuser( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSER实体
         * @return 影响的行数
         */
		public int update_sztyuser(sztyuser_Dao _SZTYUSERModel)  throws Exception{
        return _dal.update_sztyuser( _SZTYUSERModel);
		}
	
		

         /**
         *  删除数据表SZTYUSER中的一条记录
         * @param SZTYUSER实体
         * @return 新插入记录的编号
         */
		public int delete_sztyuser(int Id)  throws Exception{
        return _dal.delete_sztyuser( Id);
		}

		

       
          /**
         * 得到 sztyuser 数据实体
         * @param Id">Id
         * @return<sztyuser 数据实体
        * @throws Exception 
         */
		public sztyuser_Dao get_sztyuserDao(int Id) throws Exception{
        return _dal.get_sztyuserDao( Id);
		}
		
		    /**
         * 根据SZTYUSER返回的查询DataRow创建一个SZTYUSEREntity对象
         * @param SZTYUSER row
         * @returnSZTYUSERList对象
        * @throws Exception 
         */
		public List<sztyuser_Dao> get_sztyuser_All() throws Exception{
            return _dal.get_sztyuser_All();
            }
		    /**
         * 根据SZTYUSER返回的查询DataRow创建一个SZTYUSEREntity对象
         * @param SZTYUSER row
         * @returnSZTYUSERList对象
        * @throws Exception 
         */
		public List<sztyuser_Dao> get_sztyuser_All(String strWhere) throws Exception{
            return _dal.get_sztyuser_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyuser_Dao> get_sztyuser_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sztyuser_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SZTYUSER返回的查询DataRow创建一个SZTYUSEREntity对象
         * @param SZTYUSER row
         * @returnSZTYUSERDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sztyuser_Dao> get_sztyuser_Dictionary(String strWhere) throws Exception{
            return _dal.get_sztyuser_Dictionary(strWhere);
            }
		 /**
         * 更新SZTYUSER字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sztyuser_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sztyuser_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SZTYUSERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sztyuser_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sztyuser_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SZTYUSERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsztyuser_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sztyuser_UpdateString( FieldName, Value, sid);
            }
        
        
    }
