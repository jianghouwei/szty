﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao38.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao38_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO38数据接口
    *@作者：宋春林 
    */

	public interface aihao38_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO38实体
         * @return 新插入记录的编号
         */
		public int insert_aihao38(aihao38_Dao _AIHAO38Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO38prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao38(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO38实体
         * @return 影响的行数
         */
		public int update_aihao38(aihao38_Dao _AIHAO38Model) throws Exception;
		

         /**
         *  删除数据表AIHAO38中的一条记录
         * @param AIHAO38实体
         * @return 新插入记录的编号
         */
		public int delete_aihao38(int _id) throws Exception;
		
          /**
         * 得到 aihao38 数据实体
         * @param Id">Id
         * @return<aihao38 数据实体
        * @throws Exception 
         */
		public aihao38_Dao get_aihao38Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO38返回的查询DataRow创建一个AIHAO38Entity对象
         * @param AIHAO38 row
         * @returnAIHAO38List对象
        * @throws Exception 
         */
		public List< aihao38_Dao> get_aihao38_All() throws Exception;
		    /**
         * 根据AIHAO38返回的查询DataRow创建一个AIHAO38Entity对象
         * @param AIHAO38 row
         * @returnAIHAO38List对象
        * @throws Exception 
         */
		public List<aihao38_Dao> get_aihao38_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao38_Dao> get_aihao38_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO38返回的查询DataRow创建一个AIHAO38Entity对象
         * @param AIHAO38 row
         * @returnAIHAO38Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao38_Dao> get_aihao38_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO38字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao38_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO38Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao38_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO38IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao38_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
