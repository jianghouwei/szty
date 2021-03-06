﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp11.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp11_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP11数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp11_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP11实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp11(aihaoiptmp11_Dao _AIHAOIPTMP11Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP11prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp11(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP11实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp11(aihaoiptmp11_Dao _AIHAOIPTMP11Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP11中的一条记录
         * @param AIHAOIPTMP11实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp11(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp11 数据实体
         * @param Id">Id
         * @return<aihaoiptmp11 数据实体
        * @throws Exception 
         */
		public aihaoiptmp11_Dao get_aihaoiptmp11Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP11返回的查询DataRow创建一个AIHAOIPTMP11Entity对象
         * @param AIHAOIPTMP11 row
         * @returnAIHAOIPTMP11List对象
        * @throws Exception 
         */
		public List< aihaoiptmp11_Dao> get_aihaoiptmp11_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP11返回的查询DataRow创建一个AIHAOIPTMP11Entity对象
         * @param AIHAOIPTMP11 row
         * @returnAIHAOIPTMP11List对象
        * @throws Exception 
         */
		public List<aihaoiptmp11_Dao> get_aihaoiptmp11_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp11_Dao> get_aihaoiptmp11_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP11返回的查询DataRow创建一个AIHAOIPTMP11Entity对象
         * @param AIHAOIPTMP11 row
         * @returnAIHAOIPTMP11Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp11_Dao> get_aihaoiptmp11_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP11字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp11_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP11Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp11_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP11IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp11_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
