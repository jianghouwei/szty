/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsoftwareadapter.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumsoftwareadapter_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSOFTWAREADAPTER数据接口
    *@作者：宋春林 
    */

	public interface mvnforumsoftwareadapter_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSOFTWAREADAPTER实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsoftwareadapter(mvnforumsoftwareadapter_Dao _MVNFORUMSOFTWAREADAPTERModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSOFTWAREADAPTERprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsoftwareadapter(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSOFTWAREADAPTER实体
         * @return 影响的行数
         */
		public int update_mvnforumsoftwareadapter(mvnforumsoftwareadapter_Dao _MVNFORUMSOFTWAREADAPTERModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMSOFTWAREADAPTER中的一条记录
         * @param MVNFORUMSOFTWAREADAPTER实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsoftwareadapter(int _adapterid) throws Exception;
		
          /**
         * 得到 mvnforumsoftwareadapter 数据实体
         * @param Adapterid">Adapterid
         * @return<mvnforumsoftwareadapter 数据实体
        * @throws Exception 
         */
		public mvnforumsoftwareadapter_Dao get_mvnforumsoftwareadapterDao(int _adapterid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMSOFTWAREADAPTER返回的查询DataRow创建一个MVNFORUMSOFTWAREADAPTEREntity对象
         * @param MVNFORUMSOFTWAREADAPTER row
         * @returnMVNFORUMSOFTWAREADAPTERList对象
        * @throws Exception 
         */
		public List< mvnforumsoftwareadapter_Dao> get_mvnforumsoftwareadapter_All() throws Exception;
		    /**
         * 根据MVNFORUMSOFTWAREADAPTER返回的查询DataRow创建一个MVNFORUMSOFTWAREADAPTEREntity对象
         * @param MVNFORUMSOFTWAREADAPTER row
         * @returnMVNFORUMSOFTWAREADAPTERList对象
        * @throws Exception 
         */
		public List<mvnforumsoftwareadapter_Dao> get_mvnforumsoftwareadapter_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsoftwareadapter_Dao> get_mvnforumsoftwareadapter_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMSOFTWAREADAPTER返回的查询DataRow创建一个MVNFORUMSOFTWAREADAPTEREntity对象
         * @param MVNFORUMSOFTWAREADAPTER row
         * @returnMVNFORUMSOFTWAREADAPTERDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumsoftwareadapter_Dao> get_mvnforumsoftwareadapter_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMSOFTWAREADAPTER字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumsoftwareadapter_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMSOFTWAREADAPTERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumsoftwareadapter_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMSOFTWAREADAPTERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumsoftwareadapter_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
