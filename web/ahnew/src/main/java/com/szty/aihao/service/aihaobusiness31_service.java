﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness31.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness31_Dao;
import com.szty.aihao.core.aihaobusiness31_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS31逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness31_service
	{
        public  aihaobusiness31_core _dal=classFactory.getaihaobusiness31();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS31实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness31 (aihaobusiness31_Dao _AIHAOBUSINESS31Model )  throws Exception{
         return _dal.insert_aihaobusiness31( _AIHAOBUSINESS31Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS31prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness31(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness31( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS31实体
         * @return 影响的行数
         */
		public int update_aihaobusiness31(aihaobusiness31_Dao _AIHAOBUSINESS31Model)  throws Exception{
        return _dal.update_aihaobusiness31( _AIHAOBUSINESS31Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS31中的一条记录
         * @param AIHAOBUSINESS31实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness31(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness31( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness31 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness31 数据实体
        * @throws Exception 
         */
		public aihaobusiness31_Dao get_aihaobusiness31Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness31Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS31返回的查询DataRow创建一个AIHAOBUSINESS31Entity对象
         * @param AIHAOBUSINESS31 row
         * @returnAIHAOBUSINESS31List对象
        * @throws Exception 
         */
		public List<aihaobusiness31_Dao> get_aihaobusiness31_All() throws Exception{
            return _dal.get_aihaobusiness31_All();
            }
		    /**
         * 根据AIHAOBUSINESS31返回的查询DataRow创建一个AIHAOBUSINESS31Entity对象
         * @param AIHAOBUSINESS31 row
         * @returnAIHAOBUSINESS31List对象
        * @throws Exception 
         */
		public List<aihaobusiness31_Dao> get_aihaobusiness31_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness31_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness31_Dao> get_aihaobusiness31_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness31_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS31返回的查询DataRow创建一个AIHAOBUSINESS31Entity对象
         * @param AIHAOBUSINESS31 row
         * @returnAIHAOBUSINESS31Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness31_Dao> get_aihaobusiness31_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness31_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS31字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness31_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness31_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS31Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness31_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness31_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS31IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness31_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness31_UpdateString( FieldName, Value, sid);
            }
        
        
    }
