/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumbookchapters.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumbookchapters_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMBOOKCHAPTERS数据接口
    *@作者：宋春林 
    */

	public interface mvnforumbookchapters_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOKCHAPTERS实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumbookchapters(mvnforumbookchapters_Dao _MVNFORUMBOOKCHAPTERSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOKCHAPTERSprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumbookchapters(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOKCHAPTERS实体
         * @return 影响的行数
         */
		public int update_mvnforumbookchapters(mvnforumbookchapters_Dao _MVNFORUMBOOKCHAPTERSModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMBOOKCHAPTERS中的一条记录
         * @param MVNFORUMBOOKCHAPTERS实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumbookchapters(int _chaptersid) throws Exception;
		
          /**
         * 得到 mvnforumbookchapters 数据实体
         * @param Chaptersid">Chaptersid
         * @return<mvnforumbookchapters 数据实体
        * @throws Exception 
         */
		public mvnforumbookchapters_Dao get_mvnforumbookchaptersDao(int _chaptersid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMBOOKCHAPTERS返回的查询DataRow创建一个MVNFORUMBOOKCHAPTERSEntity对象
         * @param MVNFORUMBOOKCHAPTERS row
         * @returnMVNFORUMBOOKCHAPTERSList对象
        * @throws Exception 
         */
		public List< mvnforumbookchapters_Dao> get_mvnforumbookchapters_All() throws Exception;
		    /**
         * 根据MVNFORUMBOOKCHAPTERS返回的查询DataRow创建一个MVNFORUMBOOKCHAPTERSEntity对象
         * @param MVNFORUMBOOKCHAPTERS row
         * @returnMVNFORUMBOOKCHAPTERSList对象
        * @throws Exception 
         */
		public List<mvnforumbookchapters_Dao> get_mvnforumbookchapters_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumbookchapters_Dao> get_mvnforumbookchapters_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMBOOKCHAPTERS返回的查询DataRow创建一个MVNFORUMBOOKCHAPTERSEntity对象
         * @param MVNFORUMBOOKCHAPTERS row
         * @returnMVNFORUMBOOKCHAPTERSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumbookchapters_Dao> get_mvnforumbookchapters_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMBOOKCHAPTERS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumbookchapters_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMBOOKCHAPTERSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumbookchapters_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMBOOKCHAPTERSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumbookchapters_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
