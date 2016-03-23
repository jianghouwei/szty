/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsymlog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumsymlog_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSYMLOG数据接口
    *@作者：宋春林 
    */

	public interface mvnforumsymlog_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMLOG实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsymlog(mvnforumsymlog_Dao _MVNFORUMSYMLOGModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsymlog(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMLOG实体
         * @return 影响的行数
         */
		public int update_mvnforumsymlog(mvnforumsymlog_Dao _MVNFORUMSYMLOGModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMSYMLOG中的一条记录
         * @param MVNFORUMSYMLOG实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsymlog(int _logid) throws Exception;
		
          /**
         * 得到 mvnforumsymlog 数据实体
         * @param Logid">Logid
         * @return<mvnforumsymlog 数据实体
        * @throws Exception 
         */
		public mvnforumsymlog_Dao get_mvnforumsymlogDao(int _logid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMSYMLOG返回的查询DataRow创建一个MVNFORUMSYMLOGEntity对象
         * @param MVNFORUMSYMLOG row
         * @returnMVNFORUMSYMLOGList对象
        * @throws Exception 
         */
		public List< mvnforumsymlog_Dao> get_mvnforumsymlog_All() throws Exception;
		    /**
         * 根据MVNFORUMSYMLOG返回的查询DataRow创建一个MVNFORUMSYMLOGEntity对象
         * @param MVNFORUMSYMLOG row
         * @returnMVNFORUMSYMLOGList对象
        * @throws Exception 
         */
		public List<mvnforumsymlog_Dao> get_mvnforumsymlog_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsymlog_Dao> get_mvnforumsymlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMSYMLOG返回的查询DataRow创建一个MVNFORUMSYMLOGEntity对象
         * @param MVNFORUMSYMLOG row
         * @returnMVNFORUMSYMLOGDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumsymlog_Dao> get_mvnforumsymlog_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMSYMLOG字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumsymlog_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMSYMLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumsymlog_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMSYMLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumsymlog_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
