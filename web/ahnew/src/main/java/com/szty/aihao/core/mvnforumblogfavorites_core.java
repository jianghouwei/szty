/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumblogfavorites.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumblogfavorites_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMBLOGFAVORITES数据接口
    *@作者：宋春林 
    */

	public interface mvnforumblogfavorites_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOGFAVORITES实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumblogfavorites(mvnforumblogfavorites_Dao _MVNFORUMBLOGFAVORITESModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOGFAVORITESprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumblogfavorites(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBLOGFAVORITES实体
         * @return 影响的行数
         */
		public int update_mvnforumblogfavorites(mvnforumblogfavorites_Dao _MVNFORUMBLOGFAVORITESModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMBLOGFAVORITES中的一条记录
         * @param MVNFORUMBLOGFAVORITES实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumblogfavorites(int _favoriteid) throws Exception;
		
          /**
         * 得到 mvnforumblogfavorites 数据实体
         * @param Favoriteid">Favoriteid
         * @return<mvnforumblogfavorites 数据实体
        * @throws Exception 
         */
		public mvnforumblogfavorites_Dao get_mvnforumblogfavoritesDao(int _favoriteid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMBLOGFAVORITES返回的查询DataRow创建一个MVNFORUMBLOGFAVORITESEntity对象
         * @param MVNFORUMBLOGFAVORITES row
         * @returnMVNFORUMBLOGFAVORITESList对象
        * @throws Exception 
         */
		public List< mvnforumblogfavorites_Dao> get_mvnforumblogfavorites_All() throws Exception;
		    /**
         * 根据MVNFORUMBLOGFAVORITES返回的查询DataRow创建一个MVNFORUMBLOGFAVORITESEntity对象
         * @param MVNFORUMBLOGFAVORITES row
         * @returnMVNFORUMBLOGFAVORITESList对象
        * @throws Exception 
         */
		public List<mvnforumblogfavorites_Dao> get_mvnforumblogfavorites_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumblogfavorites_Dao> get_mvnforumblogfavorites_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMBLOGFAVORITES返回的查询DataRow创建一个MVNFORUMBLOGFAVORITESEntity对象
         * @param MVNFORUMBLOGFAVORITES row
         * @returnMVNFORUMBLOGFAVORITESDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumblogfavorites_Dao> get_mvnforumblogfavorites_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMBLOGFAVORITES字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumblogfavorites_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMBLOGFAVORITESInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumblogfavorites_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMBLOGFAVORITESIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumblogfavorites_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
