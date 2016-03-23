/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTwittershare.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.twittershare_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TWITTERSHARE数据接口
    *@作者：宋春林 
    */

	public interface twittershare_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TWITTERSHARE实体
         * @return 新插入记录的编号
         */
		public int insert_twittershare(twittershare_Dao _TWITTERSHAREModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TWITTERSHAREprrameter
         * @return 新插入记录的编号
         */
         public int insert_twittershare(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TWITTERSHARE实体
         * @return 影响的行数
         */
		public int update_twittershare(twittershare_Dao _TWITTERSHAREModel) throws Exception;
		

         /**
         *  删除数据表TWITTERSHARE中的一条记录
         * @param TWITTERSHARE实体
         * @return 新插入记录的编号
         */
		public int delete_twittershare(int _shareid) throws Exception;
		
          /**
         * 得到 twittershare 数据实体
         * @param Shareid">Shareid
         * @return<twittershare 数据实体
        * @throws Exception 
         */
		public twittershare_Dao get_twittershareDao(int _shareid) throws Exception;
		
		
		    /**
         * 根据TWITTERSHARE返回的查询DataRow创建一个TWITTERSHAREEntity对象
         * @param TWITTERSHARE row
         * @returnTWITTERSHAREList对象
        * @throws Exception 
         */
		public List< twittershare_Dao> get_twittershare_All() throws Exception;
		    /**
         * 根据TWITTERSHARE返回的查询DataRow创建一个TWITTERSHAREEntity对象
         * @param TWITTERSHARE row
         * @returnTWITTERSHAREList对象
        * @throws Exception 
         */
		public List<twittershare_Dao> get_twittershare_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<twittershare_Dao> get_twittershare_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TWITTERSHARE返回的查询DataRow创建一个TWITTERSHAREEntity对象
         * @param TWITTERSHARE row
         * @returnTWITTERSHAREDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, twittershare_Dao> get_twittershare_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TWITTERSHARE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_twittershare_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TWITTERSHAREInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_twittershare_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TWITTERSHAREIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_twittershare_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
