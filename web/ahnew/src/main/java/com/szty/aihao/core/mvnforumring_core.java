﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumring.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumring_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMRING数据接口
    *@作者：宋春林 
    */

	public interface mvnforumring_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRING实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumring(mvnforumring_Dao _MVNFORUMRINGModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRINGprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumring(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRING实体
         * @return 影响的行数
         */
		public int update_mvnforumring(mvnforumring_Dao _MVNFORUMRINGModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMRING中的一条记录
         * @param MVNFORUMRING实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumring(int _ringid) throws Exception;
		
          /**
         * 得到 mvnforumring 数据实体
         * @param Ringid">Ringid
         * @return<mvnforumring 数据实体
        * @throws Exception 
         */
		public mvnforumring_Dao get_mvnforumringDao(int _ringid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
         * @param MVNFORUMRING row
         * @returnMVNFORUMRINGList对象
        * @throws Exception 
         */
		public List< mvnforumring_Dao> get_mvnforumring_All() throws Exception;
		    /**
         * 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
         * @param MVNFORUMRING row
         * @returnMVNFORUMRINGList对象
        * @throws Exception 
         */
		public List<mvnforumring_Dao> get_mvnforumring_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumring_Dao> get_mvnforumring_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
         * @param MVNFORUMRING row
         * @returnMVNFORUMRINGDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumring_Dao> get_mvnforumring_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMRING字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumring_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMRINGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumring_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMRINGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumring_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
