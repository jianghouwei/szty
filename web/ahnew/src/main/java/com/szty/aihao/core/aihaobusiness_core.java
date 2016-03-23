/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness(aihaobusiness_Dao _AIHAOBUSINESSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESSprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS实体
         * @return 影响的行数
         */
		public int update_aihaobusiness(aihaobusiness_Dao _AIHAOBUSINESSModel) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS中的一条记录
         * @param AIHAOBUSINESS实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness 数据实体
        * @throws Exception 
         */
		public aihaobusiness_Dao get_aihaobusinessDao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS返回的查询DataRow创建一个AIHAOBUSINESSEntity对象
         * @param AIHAOBUSINESS row
         * @returnAIHAOBUSINESSList对象
        * @throws Exception 
         */
		public List< aihaobusiness_Dao> get_aihaobusiness_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS返回的查询DataRow创建一个AIHAOBUSINESSEntity对象
         * @param AIHAOBUSINESS row
         * @returnAIHAOBUSINESSList对象
        * @throws Exception 
         */
		public List<aihaobusiness_Dao> get_aihaobusiness_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness_Dao> get_aihaobusiness_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS返回的查询DataRow创建一个AIHAOBUSINESSEntity对象
         * @param AIHAOBUSINESS row
         * @returnAIHAOBUSINESSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness_Dao> get_aihaobusiness_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
