/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTwittermessage.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.twittermessage_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TWITTERMESSAGE数据接口
    *@作者：宋春林 
    */

	public interface twittermessage_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TWITTERMESSAGE实体
         * @return 新插入记录的编号
         */
		public int insert_twittermessage(twittermessage_Dao _TWITTERMESSAGEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TWITTERMESSAGEprrameter
         * @return 新插入记录的编号
         */
         public int insert_twittermessage(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TWITTERMESSAGE实体
         * @return 影响的行数
         */
		public int update_twittermessage(twittermessage_Dao _TWITTERMESSAGEModel) throws Exception;
		

         /**
         *  删除数据表TWITTERMESSAGE中的一条记录
         * @param TWITTERMESSAGE实体
         * @return 新插入记录的编号
         */
		public int delete_twittermessage(int _messageid) throws Exception;
		
          /**
         * 得到 twittermessage 数据实体
         * @param Messageid">Messageid
         * @return<twittermessage 数据实体
        * @throws Exception 
         */
		public twittermessage_Dao get_twittermessageDao(int _messageid) throws Exception;
		
		
		    /**
         * 根据TWITTERMESSAGE返回的查询DataRow创建一个TWITTERMESSAGEEntity对象
         * @param TWITTERMESSAGE row
         * @returnTWITTERMESSAGEList对象
        * @throws Exception 
         */
		public List< twittermessage_Dao> get_twittermessage_All() throws Exception;
		    /**
         * 根据TWITTERMESSAGE返回的查询DataRow创建一个TWITTERMESSAGEEntity对象
         * @param TWITTERMESSAGE row
         * @returnTWITTERMESSAGEList对象
        * @throws Exception 
         */
		public List<twittermessage_Dao> get_twittermessage_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<twittermessage_Dao> get_twittermessage_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TWITTERMESSAGE返回的查询DataRow创建一个TWITTERMESSAGEEntity对象
         * @param TWITTERMESSAGE row
         * @returnTWITTERMESSAGEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, twittermessage_Dao> get_twittermessage_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TWITTERMESSAGE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_twittermessage_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TWITTERMESSAGEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_twittermessage_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TWITTERMESSAGEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_twittermessage_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
