﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao32.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao32_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO32数据接口
    *@作者：宋春林 
    */

	public interface aihao32_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO32实体
         * @return 新插入记录的编号
         */
		public int insert_aihao32(aihao32_Dao _AIHAO32Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO32prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao32(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO32实体
         * @return 影响的行数
         */
		public int update_aihao32(aihao32_Dao _AIHAO32Model) throws Exception;
		

         /**
         *  删除数据表AIHAO32中的一条记录
         * @param AIHAO32实体
         * @return 新插入记录的编号
         */
		public int delete_aihao32(int _id) throws Exception;
		
          /**
         * 得到 aihao32 数据实体
         * @param Id">Id
         * @return<aihao32 数据实体
        * @throws Exception 
         */
		public aihao32_Dao get_aihao32Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO32返回的查询DataRow创建一个AIHAO32Entity对象
         * @param AIHAO32 row
         * @returnAIHAO32List对象
        * @throws Exception 
         */
		public List< aihao32_Dao> get_aihao32_All() throws Exception;
		    /**
         * 根据AIHAO32返回的查询DataRow创建一个AIHAO32Entity对象
         * @param AIHAO32 row
         * @returnAIHAO32List对象
        * @throws Exception 
         */
		public List<aihao32_Dao> get_aihao32_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao32_Dao> get_aihao32_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO32返回的查询DataRow创建一个AIHAO32Entity对象
         * @param AIHAO32 row
         * @returnAIHAO32Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao32_Dao> get_aihao32_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO32字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao32_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO32Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao32_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO32IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao32_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
