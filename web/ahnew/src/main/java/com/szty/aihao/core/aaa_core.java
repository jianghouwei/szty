﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAaa.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aaa_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AAA数据接口
    *@作者：宋春林 
    */

	public interface aaa_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AAA实体
         * @return 新插入记录的编号
         */
		public int insert_aaa(aaa_Dao _AAAModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AAAprrameter
         * @return 新插入记录的编号
         */
         public int insert_aaa(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AAA实体
         * @return 影响的行数
         */
		public int update_aaa(aaa_Dao _AAAModel) throws Exception;
		

         /**
         *  删除数据表AAA中的一条记录
         * @param AAA实体
         * @return 新插入记录的编号
         */
		public int delete_aaa(int _gameid) throws Exception;
		
          /**
         * 得到 aaa 数据实体
         * @param Gameid">Gameid
         * @return<aaa 数据实体
        * @throws Exception 
         */
		public aaa_Dao get_aaaDao(int _gameid) throws Exception;
		
		
		    /**
         * 根据AAA返回的查询DataRow创建一个AAAEntity对象
         * @param AAA row
         * @returnAAAList对象
        * @throws Exception 
         */
		public List< aaa_Dao> get_aaa_All() throws Exception;
		    /**
         * 根据AAA返回的查询DataRow创建一个AAAEntity对象
         * @param AAA row
         * @returnAAAList对象
        * @throws Exception 
         */
		public List<aaa_Dao> get_aaa_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aaa_Dao> get_aaa_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AAA返回的查询DataRow创建一个AAAEntity对象
         * @param AAA row
         * @returnAAADictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aaa_Dao> get_aaa_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AAA字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aaa_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AAAInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aaa_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AAAIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aaa_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
