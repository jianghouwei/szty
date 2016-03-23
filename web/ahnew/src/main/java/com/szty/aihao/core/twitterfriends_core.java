/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTwitterfriends.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.twitterfriends_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TWITTERFRIENDS数据接口
    *@作者：宋春林 
    */

	public interface twitterfriends_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TWITTERFRIENDS实体
         * @return 新插入记录的编号
         */
		public int insert_twitterfriends(twitterfriends_Dao _TWITTERFRIENDSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TWITTERFRIENDSprrameter
         * @return 新插入记录的编号
         */
         public int insert_twitterfriends(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TWITTERFRIENDS实体
         * @return 影响的行数
         */
		public int update_twitterfriends(twitterfriends_Dao _TWITTERFRIENDSModel) throws Exception;
		

         /**
         *  删除数据表TWITTERFRIENDS中的一条记录
         * @param TWITTERFRIENDS实体
         * @return 新插入记录的编号
         */
		public int delete_twitterfriends(int _userid) throws Exception;
		
          /**
         * 得到 twitterfriends 数据实体
         * @param Userid">Userid
         * @return<twitterfriends 数据实体
        * @throws Exception 
         */
		public twitterfriends_Dao get_twitterfriendsDao(int _userid) throws Exception;
		
		
		    /**
         * 根据TWITTERFRIENDS返回的查询DataRow创建一个TWITTERFRIENDSEntity对象
         * @param TWITTERFRIENDS row
         * @returnTWITTERFRIENDSList对象
        * @throws Exception 
         */
		public List< twitterfriends_Dao> get_twitterfriends_All() throws Exception;
		    /**
         * 根据TWITTERFRIENDS返回的查询DataRow创建一个TWITTERFRIENDSEntity对象
         * @param TWITTERFRIENDS row
         * @returnTWITTERFRIENDSList对象
        * @throws Exception 
         */
		public List<twitterfriends_Dao> get_twitterfriends_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<twitterfriends_Dao> get_twitterfriends_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TWITTERFRIENDS返回的查询DataRow创建一个TWITTERFRIENDSEntity对象
         * @param TWITTERFRIENDS row
         * @returnTWITTERFRIENDSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, twitterfriends_Dao> get_twitterfriends_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TWITTERFRIENDS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_twitterfriends_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TWITTERFRIENDSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_twitterfriends_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TWITTERFRIENDSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_twitterfriends_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
