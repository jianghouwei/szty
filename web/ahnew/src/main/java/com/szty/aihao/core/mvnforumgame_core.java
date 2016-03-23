/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumgame.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumgame_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMGAME数据接口
    *@作者：宋春林 
    */

	public interface mvnforumgame_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGAME实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumgame(mvnforumgame_Dao _MVNFORUMGAMEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGAMEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumgame(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGAME实体
         * @return 影响的行数
         */
		public int update_mvnforumgame(mvnforumgame_Dao _MVNFORUMGAMEModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMGAME中的一条记录
         * @param MVNFORUMGAME实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumgame(int _gameid) throws Exception;
		
          /**
         * 得到 mvnforumgame 数据实体
         * @param Gameid">Gameid
         * @return<mvnforumgame 数据实体
        * @throws Exception 
         */
		public mvnforumgame_Dao get_mvnforumgameDao(int _gameid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMGAME返回的查询DataRow创建一个MVNFORUMGAMEEntity对象
         * @param MVNFORUMGAME row
         * @returnMVNFORUMGAMEList对象
        * @throws Exception 
         */
		public List< mvnforumgame_Dao> get_mvnforumgame_All() throws Exception;
		    /**
         * 根据MVNFORUMGAME返回的查询DataRow创建一个MVNFORUMGAMEEntity对象
         * @param MVNFORUMGAME row
         * @returnMVNFORUMGAMEList对象
        * @throws Exception 
         */
		public List<mvnforumgame_Dao> get_mvnforumgame_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumgame_Dao> get_mvnforumgame_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMGAME返回的查询DataRow创建一个MVNFORUMGAMEEntity对象
         * @param MVNFORUMGAME row
         * @returnMVNFORUMGAMEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumgame_Dao> get_mvnforumgame_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMGAME字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumgame_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMGAMEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumgame_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMGAMEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumgame_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
