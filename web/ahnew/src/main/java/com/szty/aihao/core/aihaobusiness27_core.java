﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness27.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness27_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS27数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness27_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS27实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness27(aihaobusiness27_Dao _AIHAOBUSINESS27Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS27prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness27(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS27实体
         * @return 影响的行数
         */
		public int update_aihaobusiness27(aihaobusiness27_Dao _AIHAOBUSINESS27Model) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS27中的一条记录
         * @param AIHAOBUSINESS27实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness27(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness27 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness27 数据实体
        * @throws Exception 
         */
		public aihaobusiness27_Dao get_aihaobusiness27Dao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS27返回的查询DataRow创建一个AIHAOBUSINESS27Entity对象
         * @param AIHAOBUSINESS27 row
         * @returnAIHAOBUSINESS27List对象
        * @throws Exception 
         */
		public List< aihaobusiness27_Dao> get_aihaobusiness27_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS27返回的查询DataRow创建一个AIHAOBUSINESS27Entity对象
         * @param AIHAOBUSINESS27 row
         * @returnAIHAOBUSINESS27List对象
        * @throws Exception 
         */
		public List<aihaobusiness27_Dao> get_aihaobusiness27_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness27_Dao> get_aihaobusiness27_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS27返回的查询DataRow创建一个AIHAOBUSINESS27Entity对象
         * @param AIHAOBUSINESS27 row
         * @returnAIHAOBUSINESS27Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness27_Dao> get_aihaobusiness27_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS27字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness27_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESS27Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness27_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESS27IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness27_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
