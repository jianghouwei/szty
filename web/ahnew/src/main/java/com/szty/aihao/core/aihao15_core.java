﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao15.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao15_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO15数据接口
    *@作者：宋春林 
    */

	public interface aihao15_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO15实体
         * @return 新插入记录的编号
         */
		public int insert_aihao15(aihao15_Dao _AIHAO15Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO15prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao15(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO15实体
         * @return 影响的行数
         */
		public int update_aihao15(aihao15_Dao _AIHAO15Model) throws Exception;
		

         /**
         *  删除数据表AIHAO15中的一条记录
         * @param AIHAO15实体
         * @return 新插入记录的编号
         */
		public int delete_aihao15(int _id) throws Exception;
		
          /**
         * 得到 aihao15 数据实体
         * @param Id">Id
         * @return<aihao15 数据实体
        * @throws Exception 
         */
		public aihao15_Dao get_aihao15Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO15返回的查询DataRow创建一个AIHAO15Entity对象
         * @param AIHAO15 row
         * @returnAIHAO15List对象
        * @throws Exception 
         */
		public List< aihao15_Dao> get_aihao15_All() throws Exception;
		    /**
         * 根据AIHAO15返回的查询DataRow创建一个AIHAO15Entity对象
         * @param AIHAO15 row
         * @returnAIHAO15List对象
        * @throws Exception 
         */
		public List<aihao15_Dao> get_aihao15_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao15_Dao> get_aihao15_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO15返回的查询DataRow创建一个AIHAO15Entity对象
         * @param AIHAO15 row
         * @returnAIHAO15Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao15_Dao> get_aihao15_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO15字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao15_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO15Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao15_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO15IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao15_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
