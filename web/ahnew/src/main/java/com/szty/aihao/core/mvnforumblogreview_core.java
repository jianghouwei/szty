/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumblogreview.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumblogreview_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMBLOGREVIEW数据接口
    *@作者：宋春林 
    */

	public interface mvnforumblogreview_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOGREVIEW实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumblogreview(mvnforumblogreview_Dao _MVNFORUMBLOGREVIEWModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOGREVIEWprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumblogreview(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOGREVIEW实体
         * @return 影响的行数
         */
		public int update_mvnforumblogreview(mvnforumblogreview_Dao _MVNFORUMBLOGREVIEWModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMBLOGREVIEW中的一条记录
         * @param MVNFORUMBLOGREVIEW实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumblogreview(int _reviewid) throws Exception;
		
          /**
         * 得到 mvnforumblogreview 数据实体
         * @param Reviewid">Reviewid
         * @return<mvnforumblogreview 数据实体
        * @throws Exception 
         */
		public mvnforumblogreview_Dao get_mvnforumblogreviewDao(int _reviewid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMBLOGREVIEW返回的查询DataRow创建一个MVNFORUMBLOGREVIEWEntity对象
         * @param MVNFORUMBLOGREVIEW row
         * @returnMVNFORUMBLOGREVIEWList对象
        * @throws Exception 
         */
		public List< mvnforumblogreview_Dao> get_mvnforumblogreview_All() throws Exception;
		    /**
         * 根据MVNFORUMBLOGREVIEW返回的查询DataRow创建一个MVNFORUMBLOGREVIEWEntity对象
         * @param MVNFORUMBLOGREVIEW row
         * @returnMVNFORUMBLOGREVIEWList对象
        * @throws Exception 
         */
		public List<mvnforumblogreview_Dao> get_mvnforumblogreview_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumblogreview_Dao> get_mvnforumblogreview_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMBLOGREVIEW返回的查询DataRow创建一个MVNFORUMBLOGREVIEWEntity对象
         * @param MVNFORUMBLOGREVIEW row
         * @returnMVNFORUMBLOGREVIEWDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumblogreview_Dao> get_mvnforumblogreview_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMBLOGREVIEW字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumblogreview_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMBLOGREVIEWInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumblogreview_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMBLOGREVIEWIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumblogreview_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
