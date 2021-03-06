﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGuishulog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.guishulog_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GUISHULOG数据接口
    *@作者：宋春林 
    */

	public interface guishulog_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param GUISHULOG实体
         * @return 新插入记录的编号
         */
		public int insert_guishulog(guishulog_Dao _GUISHULOGModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param GUISHULOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_guishulog(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param GUISHULOG实体
         * @return 影响的行数
         */
		public int update_guishulog(guishulog_Dao _GUISHULOGModel) throws Exception;
		

         /**
         *  删除数据表GUISHULOG中的一条记录
         * @param GUISHULOG实体
         * @return 新插入记录的编号
         */
		public int delete_guishulog(int _mobile) throws Exception;
		
          /**
         * 得到 guishulog 数据实体
         * @param Mobile">Mobile
         * @return<guishulog 数据实体
        * @throws Exception 
         */
		public guishulog_Dao get_guishulogDao(int _mobile) throws Exception;
		
		
		    /**
         * 根据GUISHULOG返回的查询DataRow创建一个GUISHULOGEntity对象
         * @param GUISHULOG row
         * @returnGUISHULOGList对象
        * @throws Exception 
         */
		public List< guishulog_Dao> get_guishulog_All() throws Exception;
		    /**
         * 根据GUISHULOG返回的查询DataRow创建一个GUISHULOGEntity对象
         * @param GUISHULOG row
         * @returnGUISHULOGList对象
        * @throws Exception 
         */
		public List<guishulog_Dao> get_guishulog_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<guishulog_Dao> get_guishulog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据GUISHULOG返回的查询DataRow创建一个GUISHULOGEntity对象
         * @param GUISHULOG row
         * @returnGUISHULOGDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, guishulog_Dao> get_guishulog_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新GUISHULOG字段加一
         * @param FieldName
         * @param sid
         */
	public int create_guishulog_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新GUISHULOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_guishulog_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新GUISHULOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_guishulog_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
