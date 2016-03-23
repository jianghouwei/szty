/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumblog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumblog_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMBLOG数据接口
    *@作者：宋春林 
    */

	public interface mvnforumblog_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOG实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumblog(mvnforumblog_Dao _MVNFORUMBLOGModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumblog(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOG实体
         * @return 影响的行数
         */
		public int update_mvnforumblog(mvnforumblog_Dao _MVNFORUMBLOGModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMBLOG中的一条记录
         * @param MVNFORUMBLOG实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumblog(int _blogid) throws Exception;
		
          /**
         * 得到 mvnforumblog 数据实体
         * @param Blogid">Blogid
         * @return<mvnforumblog 数据实体
        * @throws Exception 
         */
		public mvnforumblog_Dao get_mvnforumblogDao(int _blogid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMBLOG返回的查询DataRow创建一个MVNFORUMBLOGEntity对象
         * @param MVNFORUMBLOG row
         * @returnMVNFORUMBLOGList对象
        * @throws Exception 
         */
		public List< mvnforumblog_Dao> get_mvnforumblog_All() throws Exception;
		    /**
         * 根据MVNFORUMBLOG返回的查询DataRow创建一个MVNFORUMBLOGEntity对象
         * @param MVNFORUMBLOG row
         * @returnMVNFORUMBLOGList对象
        * @throws Exception 
         */
		public List<mvnforumblog_Dao> get_mvnforumblog_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumblog_Dao> get_mvnforumblog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMBLOG返回的查询DataRow创建一个MVNFORUMBLOGEntity对象
         * @param MVNFORUMBLOG row
         * @returnMVNFORUMBLOGDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumblog_Dao> get_mvnforumblog_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMBLOG字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumblog_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMBLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumblog_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMBLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumblog_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
