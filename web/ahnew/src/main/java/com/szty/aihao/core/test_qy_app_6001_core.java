/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTest_qy_app_6001.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.test_qy_app_6001_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEST_QY_APP_6001数据接口
    *@作者：宋春林 
    */

	public interface test_qy_app_6001_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_APP_6001实体
         * @return 新插入记录的编号
         */
		public int insert_test_qy_app_6001(test_qy_app_6001_Dao _TEST_QY_APP_6001Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_APP_6001prrameter
         * @return 新插入记录的编号
         */
         public int insert_test_qy_app_6001(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_APP_6001实体
         * @return 影响的行数
         */
		public int update_test_qy_app_6001(test_qy_app_6001_Dao _TEST_QY_APP_6001Model) throws Exception;
		

         /**
         *  删除数据表TEST_QY_APP_6001中的一条记录
         * @param TEST_QY_APP_6001实体
         * @return 新插入记录的编号
         */
		public int delete_test_qy_app_6001(int _id) throws Exception;
		
          /**
         * 得到 test_qy_app_6001 数据实体
         * @param Id">Id
         * @return<test_qy_app_6001 数据实体
        * @throws Exception 
         */
		public test_qy_app_6001_Dao get_test_qy_app_6001Dao(int _id) throws Exception;
		
		
		    /**
         * 根据TEST_QY_APP_6001返回的查询DataRow创建一个TEST_QY_APP_6001Entity对象
         * @param TEST_QY_APP_6001 row
         * @returnTEST_QY_APP_6001List对象
        * @throws Exception 
         */
		public List< test_qy_app_6001_Dao> get_test_qy_app_6001_All() throws Exception;
		    /**
         * 根据TEST_QY_APP_6001返回的查询DataRow创建一个TEST_QY_APP_6001Entity对象
         * @param TEST_QY_APP_6001 row
         * @returnTEST_QY_APP_6001List对象
        * @throws Exception 
         */
		public List<test_qy_app_6001_Dao> get_test_qy_app_6001_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<test_qy_app_6001_Dao> get_test_qy_app_6001_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TEST_QY_APP_6001返回的查询DataRow创建一个TEST_QY_APP_6001Entity对象
         * @param TEST_QY_APP_6001 row
         * @returnTEST_QY_APP_6001Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, test_qy_app_6001_Dao> get_test_qy_app_6001_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TEST_QY_APP_6001字段加一
         * @param FieldName
         * @param sid
         */
	public int create_test_qy_app_6001_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TEST_QY_APP_6001Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_test_qy_app_6001_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TEST_QY_APP_6001IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_test_qy_app_6001_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
