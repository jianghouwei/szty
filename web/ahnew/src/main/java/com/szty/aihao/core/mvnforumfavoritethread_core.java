﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumfavoritethread.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumfavoritethread_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMFAVORITETHREAD数据接口
    *@作者：宋春林 
    */

	public interface mvnforumfavoritethread_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMFAVORITETHREAD实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumfavoritethread(mvnforumfavoritethread_Dao _MVNFORUMFAVORITETHREADModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMFAVORITETHREADprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumfavoritethread(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMFAVORITETHREAD实体
         * @return 影响的行数
         */
		public int update_mvnforumfavoritethread(mvnforumfavoritethread_Dao _MVNFORUMFAVORITETHREADModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMFAVORITETHREAD中的一条记录
         * @param MVNFORUMFAVORITETHREAD实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumfavoritethread(int _memberid) throws Exception;
		
          /**
         * 得到 mvnforumfavoritethread 数据实体
         * @param Memberid">Memberid
         * @return<mvnforumfavoritethread 数据实体
        * @throws Exception 
         */
		public mvnforumfavoritethread_Dao get_mvnforumfavoritethreadDao(int _memberid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMFAVORITETHREAD返回的查询DataRow创建一个MVNFORUMFAVORITETHREADEntity对象
         * @param MVNFORUMFAVORITETHREAD row
         * @returnMVNFORUMFAVORITETHREADList对象
        * @throws Exception 
         */
		public List< mvnforumfavoritethread_Dao> get_mvnforumfavoritethread_All() throws Exception;
		    /**
         * 根据MVNFORUMFAVORITETHREAD返回的查询DataRow创建一个MVNFORUMFAVORITETHREADEntity对象
         * @param MVNFORUMFAVORITETHREAD row
         * @returnMVNFORUMFAVORITETHREADList对象
        * @throws Exception 
         */
		public List<mvnforumfavoritethread_Dao> get_mvnforumfavoritethread_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumfavoritethread_Dao> get_mvnforumfavoritethread_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMFAVORITETHREAD返回的查询DataRow创建一个MVNFORUMFAVORITETHREADEntity对象
         * @param MVNFORUMFAVORITETHREAD row
         * @returnMVNFORUMFAVORITETHREADDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumfavoritethread_Dao> get_mvnforumfavoritethread_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMFAVORITETHREAD字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumfavoritethread_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMFAVORITETHREADInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumfavoritethread_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMFAVORITETHREADIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumfavoritethread_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
