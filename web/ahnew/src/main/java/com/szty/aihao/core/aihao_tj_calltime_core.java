﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao_tj_calltime.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao_tj_calltime_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO_TJ_CALLTIME数据接口
    *@作者：宋春林 
    */

	public interface aihao_tj_calltime_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_CALLTIME实体
         * @return 新插入记录的编号
         */
		public int insert_aihao_tj_calltime(aihao_tj_calltime_Dao _AIHAO_TJ_CALLTIMEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_CALLTIMEprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao_tj_calltime(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_CALLTIME实体
         * @return 影响的行数
         */
		public int update_aihao_tj_calltime(aihao_tj_calltime_Dao _AIHAO_TJ_CALLTIMEModel) throws Exception;
		

         /**
         *  删除数据表AIHAO_TJ_CALLTIME中的一条记录
         * @param AIHAO_TJ_CALLTIME实体
         * @return 新插入记录的编号
         */
		public int delete_aihao_tj_calltime(int _id) throws Exception;
		
          /**
         * 得到 aihao_tj_calltime 数据实体
         * @param Id">Id
         * @return<aihao_tj_calltime 数据实体
        * @throws Exception 
         */
		public aihao_tj_calltime_Dao get_aihao_tj_calltimeDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO_TJ_CALLTIME返回的查询DataRow创建一个AIHAO_TJ_CALLTIMEEntity对象
         * @param AIHAO_TJ_CALLTIME row
         * @returnAIHAO_TJ_CALLTIMEList对象
        * @throws Exception 
         */
		public List< aihao_tj_calltime_Dao> get_aihao_tj_calltime_All() throws Exception;
		    /**
         * 根据AIHAO_TJ_CALLTIME返回的查询DataRow创建一个AIHAO_TJ_CALLTIMEEntity对象
         * @param AIHAO_TJ_CALLTIME row
         * @returnAIHAO_TJ_CALLTIMEList对象
        * @throws Exception 
         */
		public List<aihao_tj_calltime_Dao> get_aihao_tj_calltime_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao_tj_calltime_Dao> get_aihao_tj_calltime_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO_TJ_CALLTIME返回的查询DataRow创建一个AIHAO_TJ_CALLTIMEEntity对象
         * @param AIHAO_TJ_CALLTIME row
         * @returnAIHAO_TJ_CALLTIMEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao_tj_calltime_Dao> get_aihao_tj_calltime_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO_TJ_CALLTIME字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao_tj_calltime_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO_TJ_CALLTIMEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao_tj_calltime_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO_TJ_CALLTIMEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao_tj_calltime_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
