/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTest_varchar.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.test_varchar_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEST_VARCHAR数据接口
    *@作者：宋春林 
    */

	public interface test_varchar_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEST_VARCHAR实体
         * @return 新插入记录的编号
         */
		public int insert_test_varchar(test_varchar_Dao _TEST_VARCHARModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEST_VARCHARprrameter
         * @return 新插入记录的编号
         */
         public int insert_test_varchar(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TEST_VARCHAR实体
         * @return 影响的行数
         */
		public int update_test_varchar(test_varchar_Dao _TEST_VARCHARModel) throws Exception;
		

         /**
         *  删除数据表TEST_VARCHAR中的一条记录
         * @param TEST_VARCHAR实体
         * @return 新插入记录的编号
         */
		public int delete_test_varchar(int _varchar_col) throws Exception;
		
          /**
         * 得到 test_varchar 数据实体
         * @param Varchar_col">Varchar_col
         * @return<test_varchar 数据实体
        * @throws Exception 
         */
		public test_varchar_Dao get_test_varcharDao(int _varchar_col) throws Exception;
		
		
		    /**
         * 根据TEST_VARCHAR返回的查询DataRow创建一个TEST_VARCHAREntity对象
         * @param TEST_VARCHAR row
         * @returnTEST_VARCHARList对象
        * @throws Exception 
         */
		public List< test_varchar_Dao> get_test_varchar_All() throws Exception;
		    /**
         * 根据TEST_VARCHAR返回的查询DataRow创建一个TEST_VARCHAREntity对象
         * @param TEST_VARCHAR row
         * @returnTEST_VARCHARList对象
        * @throws Exception 
         */
		public List<test_varchar_Dao> get_test_varchar_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<test_varchar_Dao> get_test_varchar_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TEST_VARCHAR返回的查询DataRow创建一个TEST_VARCHAREntity对象
         * @param TEST_VARCHAR row
         * @returnTEST_VARCHARDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, test_varchar_Dao> get_test_varchar_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TEST_VARCHAR字段加一
         * @param FieldName
         * @param sid
         */
	public int create_test_varchar_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TEST_VARCHARInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_test_varchar_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TEST_VARCHARIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_test_varchar_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
