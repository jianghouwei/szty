/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoupdatetable.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoupdatetable_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOUPDATETABLE数据接口
    *@作者：宋春林 
    */

	public interface aihaoupdatetable_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUPDATETABLE实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoupdatetable(aihaoupdatetable_Dao _AIHAOUPDATETABLEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUPDATETABLEprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoupdatetable(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUPDATETABLE实体
         * @return 影响的行数
         */
		public int update_aihaoupdatetable(aihaoupdatetable_Dao _AIHAOUPDATETABLEModel) throws Exception;
		

         /**
         *  删除数据表AIHAOUPDATETABLE中的一条记录
         * @param AIHAOUPDATETABLE实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoupdatetable(int _id) throws Exception;
		
          /**
         * 得到 aihaoupdatetable 数据实体
         * @param Id">Id
         * @return<aihaoupdatetable 数据实体
        * @throws Exception 
         */
		public aihaoupdatetable_Dao get_aihaoupdatetableDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
         * @param AIHAOUPDATETABLE row
         * @returnAIHAOUPDATETABLEList对象
        * @throws Exception 
         */
		public List< aihaoupdatetable_Dao> get_aihaoupdatetable_All() throws Exception;
		    /**
         * 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
         * @param AIHAOUPDATETABLE row
         * @returnAIHAOUPDATETABLEList对象
        * @throws Exception 
         */
		public List<aihaoupdatetable_Dao> get_aihaoupdatetable_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoupdatetable_Dao> get_aihaoupdatetable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
         * @param AIHAOUPDATETABLE row
         * @returnAIHAOUPDATETABLEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoupdatetable_Dao> get_aihaoupdatetable_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOUPDATETABLE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoupdatetable_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOUPDATETABLEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoupdatetable_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOUPDATETABLEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoupdatetable_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
