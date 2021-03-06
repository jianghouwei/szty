﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataJobmembertable.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.jobmembertable_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@JOBMEMBERTABLE数据接口
    *@作者：宋春林 
    */

	public interface jobmembertable_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param JOBMEMBERTABLE实体
         * @return 新插入记录的编号
         */
		public int insert_jobmembertable(jobmembertable_Dao _JOBMEMBERTABLEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param JOBMEMBERTABLEprrameter
         * @return 新插入记录的编号
         */
         public int insert_jobmembertable(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param JOBMEMBERTABLE实体
         * @return 影响的行数
         */
		public int update_jobmembertable(jobmembertable_Dao _JOBMEMBERTABLEModel) throws Exception;
		

         /**
         *  删除数据表JOBMEMBERTABLE中的一条记录
         * @param JOBMEMBERTABLE实体
         * @return 新插入记录的编号
         */
		public int delete_jobmembertable(int _jobmemberid) throws Exception;
		
          /**
         * 得到 jobmembertable 数据实体
         * @param Jobmemberid">Jobmemberid
         * @return<jobmembertable 数据实体
        * @throws Exception 
         */
		public jobmembertable_Dao get_jobmembertableDao(int _jobmemberid) throws Exception;
		
		
		    /**
         * 根据JOBMEMBERTABLE返回的查询DataRow创建一个JOBMEMBERTABLEEntity对象
         * @param JOBMEMBERTABLE row
         * @returnJOBMEMBERTABLEList对象
        * @throws Exception 
         */
		public List< jobmembertable_Dao> get_jobmembertable_All() throws Exception;
		    /**
         * 根据JOBMEMBERTABLE返回的查询DataRow创建一个JOBMEMBERTABLEEntity对象
         * @param JOBMEMBERTABLE row
         * @returnJOBMEMBERTABLEList对象
        * @throws Exception 
         */
		public List<jobmembertable_Dao> get_jobmembertable_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<jobmembertable_Dao> get_jobmembertable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据JOBMEMBERTABLE返回的查询DataRow创建一个JOBMEMBERTABLEEntity对象
         * @param JOBMEMBERTABLE row
         * @returnJOBMEMBERTABLEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, jobmembertable_Dao> get_jobmembertable_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新JOBMEMBERTABLE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_jobmembertable_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新JOBMEMBERTABLEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_jobmembertable_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新JOBMEMBERTABLEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_jobmembertable_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
