﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness13.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness13_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS13数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness13_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS13实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness13(aihaobusiness13_Dao _AIHAOBUSINESS13Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS13prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness13(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS13实体
         * @return 影响的行数
         */
		public int update_aihaobusiness13(aihaobusiness13_Dao _AIHAOBUSINESS13Model) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS13中的一条记录
         * @param AIHAOBUSINESS13实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness13(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness13 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness13 数据实体
        * @throws Exception 
         */
		public aihaobusiness13_Dao get_aihaobusiness13Dao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS13返回的查询DataRow创建一个AIHAOBUSINESS13Entity对象
         * @param AIHAOBUSINESS13 row
         * @returnAIHAOBUSINESS13List对象
        * @throws Exception 
         */
		public List< aihaobusiness13_Dao> get_aihaobusiness13_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS13返回的查询DataRow创建一个AIHAOBUSINESS13Entity对象
         * @param AIHAOBUSINESS13 row
         * @returnAIHAOBUSINESS13List对象
        * @throws Exception 
         */
		public List<aihaobusiness13_Dao> get_aihaobusiness13_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness13_Dao> get_aihaobusiness13_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS13返回的查询DataRow创建一个AIHAOBUSINESS13Entity对象
         * @param AIHAOBUSINESS13 row
         * @returnAIHAOBUSINESS13Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness13_Dao> get_aihaobusiness13_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS13字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness13_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESS13Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness13_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESS13IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness13_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
