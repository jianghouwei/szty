/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforummembergroup.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforummembergroup_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMMEMBERGROUP数据接口
    *@作者：宋春林 
    */

	public interface mvnforummembergroup_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERGROUP实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforummembergroup(mvnforummembergroup_Dao _MVNFORUMMEMBERGROUPModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERGROUPprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforummembergroup(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERGROUP实体
         * @return 影响的行数
         */
		public int update_mvnforummembergroup(mvnforummembergroup_Dao _MVNFORUMMEMBERGROUPModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMMEMBERGROUP中的一条记录
         * @param MVNFORUMMEMBERGROUP实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforummembergroup(int _groupid) throws Exception;
		
          /**
         * 得到 mvnforummembergroup 数据实体
         * @param Groupid">Groupid
         * @return<mvnforummembergroup 数据实体
        * @throws Exception 
         */
		public mvnforummembergroup_Dao get_mvnforummembergroupDao(int _groupid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMMEMBERGROUP返回的查询DataRow创建一个MVNFORUMMEMBERGROUPEntity对象
         * @param MVNFORUMMEMBERGROUP row
         * @returnMVNFORUMMEMBERGROUPList对象
        * @throws Exception 
         */
		public List< mvnforummembergroup_Dao> get_mvnforummembergroup_All() throws Exception;
		    /**
         * 根据MVNFORUMMEMBERGROUP返回的查询DataRow创建一个MVNFORUMMEMBERGROUPEntity对象
         * @param MVNFORUMMEMBERGROUP row
         * @returnMVNFORUMMEMBERGROUPList对象
        * @throws Exception 
         */
		public List<mvnforummembergroup_Dao> get_mvnforummembergroup_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforummembergroup_Dao> get_mvnforummembergroup_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMMEMBERGROUP返回的查询DataRow创建一个MVNFORUMMEMBERGROUPEntity对象
         * @param MVNFORUMMEMBERGROUP row
         * @returnMVNFORUMMEMBERGROUPDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforummembergroup_Dao> get_mvnforummembergroup_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMMEMBERGROUP字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforummembergroup_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMMEMBERGROUPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforummembergroup_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMMEMBERGROUPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforummembergroup_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
