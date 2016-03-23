/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumwallpaperadapter.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumwallpaperadapter_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMWALLPAPERADAPTER数据接口
    *@作者：宋春林 
    */

	public interface mvnforumwallpaperadapter_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWALLPAPERADAPTER实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumwallpaperadapter(mvnforumwallpaperadapter_Dao _MVNFORUMWALLPAPERADAPTERModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWALLPAPERADAPTERprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumwallpaperadapter(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWALLPAPERADAPTER实体
         * @return 影响的行数
         */
		public int update_mvnforumwallpaperadapter(mvnforumwallpaperadapter_Dao _MVNFORUMWALLPAPERADAPTERModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMWALLPAPERADAPTER中的一条记录
         * @param MVNFORUMWALLPAPERADAPTER实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumwallpaperadapter(int _adapterid) throws Exception;
		
          /**
         * 得到 mvnforumwallpaperadapter 数据实体
         * @param Adapterid">Adapterid
         * @return<mvnforumwallpaperadapter 数据实体
        * @throws Exception 
         */
		public mvnforumwallpaperadapter_Dao get_mvnforumwallpaperadapterDao(int _adapterid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMWALLPAPERADAPTER返回的查询DataRow创建一个MVNFORUMWALLPAPERADAPTEREntity对象
         * @param MVNFORUMWALLPAPERADAPTER row
         * @returnMVNFORUMWALLPAPERADAPTERList对象
        * @throws Exception 
         */
		public List< mvnforumwallpaperadapter_Dao> get_mvnforumwallpaperadapter_All() throws Exception;
		    /**
         * 根据MVNFORUMWALLPAPERADAPTER返回的查询DataRow创建一个MVNFORUMWALLPAPERADAPTEREntity对象
         * @param MVNFORUMWALLPAPERADAPTER row
         * @returnMVNFORUMWALLPAPERADAPTERList对象
        * @throws Exception 
         */
		public List<mvnforumwallpaperadapter_Dao> get_mvnforumwallpaperadapter_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumwallpaperadapter_Dao> get_mvnforumwallpaperadapter_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMWALLPAPERADAPTER返回的查询DataRow创建一个MVNFORUMWALLPAPERADAPTEREntity对象
         * @param MVNFORUMWALLPAPERADAPTER row
         * @returnMVNFORUMWALLPAPERADAPTERDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumwallpaperadapter_Dao> get_mvnforumwallpaperadapter_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMWALLPAPERADAPTER字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumwallpaperadapter_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMWALLPAPERADAPTERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumwallpaperadapter_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMWALLPAPERADAPTERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumwallpaperadapter_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
