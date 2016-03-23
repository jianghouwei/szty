/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumvideo.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumvideo_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMVIDEO数据接口
    *@作者：宋春林 
    */

	public interface mvnforumvideo_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMVIDEO实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumvideo(mvnforumvideo_Dao _MVNFORUMVIDEOModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMVIDEOprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumvideo(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMVIDEO实体
         * @return 影响的行数
         */
		public int update_mvnforumvideo(mvnforumvideo_Dao _MVNFORUMVIDEOModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMVIDEO中的一条记录
         * @param MVNFORUMVIDEO实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumvideo(int _videoid) throws Exception;
		
          /**
         * 得到 mvnforumvideo 数据实体
         * @param Videoid">Videoid
         * @return<mvnforumvideo 数据实体
        * @throws Exception 
         */
		public mvnforumvideo_Dao get_mvnforumvideoDao(int _videoid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMVIDEO返回的查询DataRow创建一个MVNFORUMVIDEOEntity对象
         * @param MVNFORUMVIDEO row
         * @returnMVNFORUMVIDEOList对象
        * @throws Exception 
         */
		public List< mvnforumvideo_Dao> get_mvnforumvideo_All() throws Exception;
		    /**
         * 根据MVNFORUMVIDEO返回的查询DataRow创建一个MVNFORUMVIDEOEntity对象
         * @param MVNFORUMVIDEO row
         * @returnMVNFORUMVIDEOList对象
        * @throws Exception 
         */
		public List<mvnforumvideo_Dao> get_mvnforumvideo_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumvideo_Dao> get_mvnforumvideo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMVIDEO返回的查询DataRow创建一个MVNFORUMVIDEOEntity对象
         * @param MVNFORUMVIDEO row
         * @returnMVNFORUMVIDEODictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumvideo_Dao> get_mvnforumvideo_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMVIDEO字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumvideo_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMVIDEOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumvideo_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMVIDEOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumvideo_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
