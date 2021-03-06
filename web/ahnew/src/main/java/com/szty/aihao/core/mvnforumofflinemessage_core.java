﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumofflinemessage.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumofflinemessage_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMOFFLINEMESSAGE数据接口
    *@作者：宋春林 
    */

	public interface mvnforumofflinemessage_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumofflinemessage(mvnforumofflinemessage_Dao _MVNFORUMOFFLINEMESSAGEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumofflinemessage(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGE实体
         * @return 影响的行数
         */
		public int update_mvnforumofflinemessage(mvnforumofflinemessage_Dao _MVNFORUMOFFLINEMESSAGEModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMOFFLINEMESSAGE中的一条记录
         * @param MVNFORUMOFFLINEMESSAGE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumofflinemessage(int _messageid) throws Exception;
		
          /**
         * 得到 mvnforumofflinemessage 数据实体
         * @param Messageid">Messageid
         * @return<mvnforumofflinemessage 数据实体
        * @throws Exception 
         */
		public mvnforumofflinemessage_Dao get_mvnforumofflinemessageDao(int _messageid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
         * @param MVNFORUMOFFLINEMESSAGE row
         * @returnMVNFORUMOFFLINEMESSAGEList对象
        * @throws Exception 
         */
		public List< mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_All() throws Exception;
		    /**
         * 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
         * @param MVNFORUMOFFLINEMESSAGE row
         * @returnMVNFORUMOFFLINEMESSAGEList对象
        * @throws Exception 
         */
		public List<mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
         * @param MVNFORUMOFFLINEMESSAGE row
         * @returnMVNFORUMOFFLINEMESSAGEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMOFFLINEMESSAGE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumofflinemessage_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMOFFLINEMESSAGEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumofflinemessage_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMOFFLINEMESSAGEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumofflinemessage_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
