/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumgroupforum.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumgroupforum_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMGROUPFORUM数据接口
    *@作者：宋春林 
    */

	public interface mvnforumgroupforum_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPFORUM实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumgroupforum(mvnforumgroupforum_Dao _MVNFORUMGROUPFORUMModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPFORUMprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumgroupforum(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPFORUM实体
         * @return 影响的行数
         */
		public int update_mvnforumgroupforum(mvnforumgroupforum_Dao _MVNFORUMGROUPFORUMModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMGROUPFORUM中的一条记录
         * @param MVNFORUMGROUPFORUM实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumgroupforum(int _groupid) throws Exception;
		
          /**
         * 得到 mvnforumgroupforum 数据实体
         * @param Groupid">Groupid
         * @return<mvnforumgroupforum 数据实体
        * @throws Exception 
         */
		public mvnforumgroupforum_Dao get_mvnforumgroupforumDao(int _groupid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMGROUPFORUM返回的查询DataRow创建一个MVNFORUMGROUPFORUMEntity对象
         * @param MVNFORUMGROUPFORUM row
         * @returnMVNFORUMGROUPFORUMList对象
        * @throws Exception 
         */
		public List< mvnforumgroupforum_Dao> get_mvnforumgroupforum_All() throws Exception;
		    /**
         * 根据MVNFORUMGROUPFORUM返回的查询DataRow创建一个MVNFORUMGROUPFORUMEntity对象
         * @param MVNFORUMGROUPFORUM row
         * @returnMVNFORUMGROUPFORUMList对象
        * @throws Exception 
         */
		public List<mvnforumgroupforum_Dao> get_mvnforumgroupforum_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumgroupforum_Dao> get_mvnforumgroupforum_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMGROUPFORUM返回的查询DataRow创建一个MVNFORUMGROUPFORUMEntity对象
         * @param MVNFORUMGROUPFORUM row
         * @returnMVNFORUMGROUPFORUMDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumgroupforum_Dao> get_mvnforumgroupforum_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMGROUPFORUM字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumgroupforum_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMGROUPFORUMInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumgroupforum_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMGROUPFORUMIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumgroupforum_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
