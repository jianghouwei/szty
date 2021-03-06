﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataExplevtable.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.explevtable_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@EXPLEVTABLE数据接口
    *@作者：宋春林 
    */

	public interface explevtable_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param EXPLEVTABLE实体
         * @return 新插入记录的编号
         */
		public int insert_explevtable(explevtable_Dao _EXPLEVTABLEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param EXPLEVTABLEprrameter
         * @return 新插入记录的编号
         */
         public int insert_explevtable(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param EXPLEVTABLE实体
         * @return 影响的行数
         */
		public int update_explevtable(explevtable_Dao _EXPLEVTABLEModel) throws Exception;
		

         /**
         *  删除数据表EXPLEVTABLE中的一条记录
         * @param EXPLEVTABLE实体
         * @return 新插入记录的编号
         */
		public int delete_explevtable(int _levid) throws Exception;
		
          /**
         * 得到 explevtable 数据实体
         * @param Levid">Levid
         * @return<explevtable 数据实体
        * @throws Exception 
         */
		public explevtable_Dao get_explevtableDao(int _levid) throws Exception;
		
		
		    /**
         * 根据EXPLEVTABLE返回的查询DataRow创建一个EXPLEVTABLEEntity对象
         * @param EXPLEVTABLE row
         * @returnEXPLEVTABLEList对象
        * @throws Exception 
         */
		public List< explevtable_Dao> get_explevtable_All() throws Exception;
		    /**
         * 根据EXPLEVTABLE返回的查询DataRow创建一个EXPLEVTABLEEntity对象
         * @param EXPLEVTABLE row
         * @returnEXPLEVTABLEList对象
        * @throws Exception 
         */
		public List<explevtable_Dao> get_explevtable_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<explevtable_Dao> get_explevtable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据EXPLEVTABLE返回的查询DataRow创建一个EXPLEVTABLEEntity对象
         * @param EXPLEVTABLE row
         * @returnEXPLEVTABLEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, explevtable_Dao> get_explevtable_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新EXPLEVTABLE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_explevtable_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新EXPLEVTABLEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_explevtable_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新EXPLEVTABLEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_explevtable_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
