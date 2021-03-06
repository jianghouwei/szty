﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp23.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp23_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP23数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp23_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP23实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp23(aihaoiptmp23_Dao _AIHAOIPTMP23Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP23prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp23(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP23实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp23(aihaoiptmp23_Dao _AIHAOIPTMP23Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP23中的一条记录
         * @param AIHAOIPTMP23实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp23(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp23 数据实体
         * @param Id">Id
         * @return<aihaoiptmp23 数据实体
        * @throws Exception 
         */
		public aihaoiptmp23_Dao get_aihaoiptmp23Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP23返回的查询DataRow创建一个AIHAOIPTMP23Entity对象
         * @param AIHAOIPTMP23 row
         * @returnAIHAOIPTMP23List对象
        * @throws Exception 
         */
		public List< aihaoiptmp23_Dao> get_aihaoiptmp23_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP23返回的查询DataRow创建一个AIHAOIPTMP23Entity对象
         * @param AIHAOIPTMP23 row
         * @returnAIHAOIPTMP23List对象
        * @throws Exception 
         */
		public List<aihaoiptmp23_Dao> get_aihaoiptmp23_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp23_Dao> get_aihaoiptmp23_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP23返回的查询DataRow创建一个AIHAOIPTMP23Entity对象
         * @param AIHAOIPTMP23 row
         * @returnAIHAOIPTMP23Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp23_Dao> get_aihaoiptmp23_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP23字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp23_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP23Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp23_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP23IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp23_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
