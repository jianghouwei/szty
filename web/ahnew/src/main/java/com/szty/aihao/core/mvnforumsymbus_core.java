/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsymbus.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumsymbus_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSYMBUS数据接口
    *@作者：宋春林 
    */

	public interface mvnforumsymbus_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMBUS实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsymbus(mvnforumsymbus_Dao _MVNFORUMSYMBUSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMBUSprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsymbus(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMBUS实体
         * @return 影响的行数
         */
		public int update_mvnforumsymbus(mvnforumsymbus_Dao _MVNFORUMSYMBUSModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMSYMBUS中的一条记录
         * @param MVNFORUMSYMBUS实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsymbus(int _busid) throws Exception;
		
          /**
         * 得到 mvnforumsymbus 数据实体
         * @param Busid">Busid
         * @return<mvnforumsymbus 数据实体
        * @throws Exception 
         */
		public mvnforumsymbus_Dao get_mvnforumsymbusDao(int _busid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMSYMBUS返回的查询DataRow创建一个MVNFORUMSYMBUSEntity对象
         * @param MVNFORUMSYMBUS row
         * @returnMVNFORUMSYMBUSList对象
        * @throws Exception 
         */
		public List< mvnforumsymbus_Dao> get_mvnforumsymbus_All() throws Exception;
		    /**
         * 根据MVNFORUMSYMBUS返回的查询DataRow创建一个MVNFORUMSYMBUSEntity对象
         * @param MVNFORUMSYMBUS row
         * @returnMVNFORUMSYMBUSList对象
        * @throws Exception 
         */
		public List<mvnforumsymbus_Dao> get_mvnforumsymbus_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsymbus_Dao> get_mvnforumsymbus_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMSYMBUS返回的查询DataRow创建一个MVNFORUMSYMBUSEntity对象
         * @param MVNFORUMSYMBUS row
         * @returnMVNFORUMSYMBUSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumsymbus_Dao> get_mvnforumsymbus_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMSYMBUS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumsymbus_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMSYMBUSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumsymbus_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMSYMBUSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumsymbus_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
