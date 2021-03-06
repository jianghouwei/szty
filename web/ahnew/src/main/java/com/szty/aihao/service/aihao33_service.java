﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao33.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao33_Dao;
import com.szty.aihao.core.aihao33_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO33逻辑层接口
    *@作者：宋春林 
    */

	public class aihao33_service
	{
        public  aihao33_core _dal=classFactory.getaihao33();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO33实体
         * @return 新插入记录的编号
         */
		public int insert_aihao33 (aihao33_Dao _AIHAO33Model )  throws Exception{
         return _dal.insert_aihao33( _AIHAO33Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO33prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao33(Object[] _para)  throws Exception{
        return _dal.insert_aihao33( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO33实体
         * @return 影响的行数
         */
		public int update_aihao33(aihao33_Dao _AIHAO33Model)  throws Exception{
        return _dal.update_aihao33( _AIHAO33Model);
		}
	
		

         /**
         *  删除数据表AIHAO33中的一条记录
         * @param AIHAO33实体
         * @return 新插入记录的编号
         */
		public int delete_aihao33(int Id)  throws Exception{
        return _dal.delete_aihao33( Id);
		}

		

       
          /**
         * 得到 aihao33 数据实体
         * @param Id">Id
         * @return<aihao33 数据实体
        * @throws Exception 
         */
		public aihao33_Dao get_aihao33Dao(int Id) throws Exception{
        return _dal.get_aihao33Dao( Id);
		}
		
		    /**
         * 根据AIHAO33返回的查询DataRow创建一个AIHAO33Entity对象
         * @param AIHAO33 row
         * @returnAIHAO33List对象
        * @throws Exception 
         */
		public List<aihao33_Dao> get_aihao33_All() throws Exception{
            return _dal.get_aihao33_All();
            }
		    /**
         * 根据AIHAO33返回的查询DataRow创建一个AIHAO33Entity对象
         * @param AIHAO33 row
         * @returnAIHAO33List对象
        * @throws Exception 
         */
		public List<aihao33_Dao> get_aihao33_All(String strWhere) throws Exception{
            return _dal.get_aihao33_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao33_Dao> get_aihao33_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao33_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO33返回的查询DataRow创建一个AIHAO33Entity对象
         * @param AIHAO33 row
         * @returnAIHAO33Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao33_Dao> get_aihao33_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao33_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO33字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao33_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao33_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO33Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao33_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao33_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO33IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao33_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao33_UpdateString( FieldName, Value, sid);
            }
        
        
    }
