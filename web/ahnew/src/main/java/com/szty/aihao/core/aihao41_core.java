/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao41.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao41_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO41数据接口
    *@作者：宋春林 
    */

	public interface aihao41_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO41实体
         * @return 新插入记录的编号
         */
		public int insert_aihao41(aihao41_Dao _AIHAO41Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO41prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao41(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO41实体
         * @return 影响的行数
         */
		public int update_aihao41(aihao41_Dao _AIHAO41Model) throws Exception;
		

         /**
         *  删除数据表AIHAO41中的一条记录
         * @param AIHAO41实体
         * @return 新插入记录的编号
         */
		public int delete_aihao41(int _id) throws Exception;
		
          /**
         * 得到 aihao41 数据实体
         * @param Id">Id
         * @return<aihao41 数据实体
        * @throws Exception 
         */
		public aihao41_Dao get_aihao41Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO41返回的查询DataRow创建一个AIHAO41Entity对象
         * @param AIHAO41 row
         * @returnAIHAO41List对象
        * @throws Exception 
         */
		public List< aihao41_Dao> get_aihao41_All() throws Exception;
		    /**
         * 根据AIHAO41返回的查询DataRow创建一个AIHAO41Entity对象
         * @param AIHAO41 row
         * @returnAIHAO41List对象
        * @throws Exception 
         */
		public List<aihao41_Dao> get_aihao41_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao41_Dao> get_aihao41_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO41返回的查询DataRow创建一个AIHAO41Entity对象
         * @param AIHAO41 row
         * @returnAIHAO41Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao41_Dao> get_aihao41_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO41字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao41_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO41Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao41_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO41IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao41_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
