﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp16.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp16_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP16数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp16_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP16实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp16(aihaoiptmp16_Dao _AIHAOIPTMP16Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP16prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp16(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP16实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp16(aihaoiptmp16_Dao _AIHAOIPTMP16Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP16中的一条记录
         * @param AIHAOIPTMP16实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp16(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp16 数据实体
         * @param Id">Id
         * @return<aihaoiptmp16 数据实体
        * @throws Exception 
         */
		public aihaoiptmp16_Dao get_aihaoiptmp16Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP16返回的查询DataRow创建一个AIHAOIPTMP16Entity对象
         * @param AIHAOIPTMP16 row
         * @returnAIHAOIPTMP16List对象
        * @throws Exception 
         */
		public List< aihaoiptmp16_Dao> get_aihaoiptmp16_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP16返回的查询DataRow创建一个AIHAOIPTMP16Entity对象
         * @param AIHAOIPTMP16 row
         * @returnAIHAOIPTMP16List对象
        * @throws Exception 
         */
		public List<aihaoiptmp16_Dao> get_aihaoiptmp16_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp16_Dao> get_aihaoiptmp16_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP16返回的查询DataRow创建一个AIHAOIPTMP16Entity对象
         * @param AIHAOIPTMP16 row
         * @returnAIHAOIPTMP16Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp16_Dao> get_aihaoiptmp16_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP16字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp16_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP16Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp16_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP16IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp16_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
