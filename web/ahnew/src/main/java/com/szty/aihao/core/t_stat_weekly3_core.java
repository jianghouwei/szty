﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_stat_weekly3.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.t_stat_weekly3_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_STAT_WEEKLY3数据接口
    *@作者：宋春林 
    */

	public interface t_stat_weekly3_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_STAT_WEEKLY3实体
         * @return 新插入记录的编号
         */
		public int insert_t_stat_weekly3(t_stat_weekly3_Dao _T_STAT_WEEKLY3Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_STAT_WEEKLY3prrameter
         * @return 新插入记录的编号
         */
         public int insert_t_stat_weekly3(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param T_STAT_WEEKLY3实体
         * @return 影响的行数
         */
		public int update_t_stat_weekly3(t_stat_weekly3_Dao _T_STAT_WEEKLY3Model) throws Exception;
		

         /**
         *  删除数据表T_STAT_WEEKLY3中的一条记录
         * @param T_STAT_WEEKLY3实体
         * @return 新插入记录的编号
         */
		public int delete_t_stat_weekly3(int _item) throws Exception;
		
          /**
         * 得到 t_stat_weekly3 数据实体
         * @param Item">Item
         * @return<t_stat_weekly3 数据实体
        * @throws Exception 
         */
		public t_stat_weekly3_Dao get_t_stat_weekly3Dao(int _item) throws Exception;
		
		
		    /**
         * 根据T_STAT_WEEKLY3返回的查询DataRow创建一个T_STAT_WEEKLY3Entity对象
         * @param T_STAT_WEEKLY3 row
         * @returnT_STAT_WEEKLY3List对象
        * @throws Exception 
         */
		public List< t_stat_weekly3_Dao> get_t_stat_weekly3_All() throws Exception;
		    /**
         * 根据T_STAT_WEEKLY3返回的查询DataRow创建一个T_STAT_WEEKLY3Entity对象
         * @param T_STAT_WEEKLY3 row
         * @returnT_STAT_WEEKLY3List对象
        * @throws Exception 
         */
		public List<t_stat_weekly3_Dao> get_t_stat_weekly3_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_stat_weekly3_Dao> get_t_stat_weekly3_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据T_STAT_WEEKLY3返回的查询DataRow创建一个T_STAT_WEEKLY3Entity对象
         * @param T_STAT_WEEKLY3 row
         * @returnT_STAT_WEEKLY3Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, t_stat_weekly3_Dao> get_t_stat_weekly3_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新T_STAT_WEEKLY3字段加一
         * @param FieldName
         * @param sid
         */
	public int create_t_stat_weekly3_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新T_STAT_WEEKLY3Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_t_stat_weekly3_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新T_STAT_WEEKLY3IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_t_stat_weekly3_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
