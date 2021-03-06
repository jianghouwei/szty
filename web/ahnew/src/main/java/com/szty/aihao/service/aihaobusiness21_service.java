﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness21.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness21_Dao;
import com.szty.aihao.core.aihaobusiness21_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS21逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness21_service
	{
        public  aihaobusiness21_core _dal=classFactory.getaihaobusiness21();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS21实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness21 (aihaobusiness21_Dao _AIHAOBUSINESS21Model )  throws Exception{
         return _dal.insert_aihaobusiness21( _AIHAOBUSINESS21Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS21prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness21(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness21( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS21实体
         * @return 影响的行数
         */
		public int update_aihaobusiness21(aihaobusiness21_Dao _AIHAOBUSINESS21Model)  throws Exception{
        return _dal.update_aihaobusiness21( _AIHAOBUSINESS21Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS21中的一条记录
         * @param AIHAOBUSINESS21实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness21(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness21( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness21 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness21 数据实体
        * @throws Exception 
         */
		public aihaobusiness21_Dao get_aihaobusiness21Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness21Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS21返回的查询DataRow创建一个AIHAOBUSINESS21Entity对象
         * @param AIHAOBUSINESS21 row
         * @returnAIHAOBUSINESS21List对象
        * @throws Exception 
         */
		public List<aihaobusiness21_Dao> get_aihaobusiness21_All() throws Exception{
            return _dal.get_aihaobusiness21_All();
            }
		    /**
         * 根据AIHAOBUSINESS21返回的查询DataRow创建一个AIHAOBUSINESS21Entity对象
         * @param AIHAOBUSINESS21 row
         * @returnAIHAOBUSINESS21List对象
        * @throws Exception 
         */
		public List<aihaobusiness21_Dao> get_aihaobusiness21_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness21_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness21_Dao> get_aihaobusiness21_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness21_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS21返回的查询DataRow创建一个AIHAOBUSINESS21Entity对象
         * @param AIHAOBUSINESS21 row
         * @returnAIHAOBUSINESS21Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness21_Dao> get_aihaobusiness21_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness21_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS21字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness21_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness21_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS21Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness21_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness21_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS21IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness21_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness21_UpdateString( FieldName, Value, sid);
            }
        
        
    }
