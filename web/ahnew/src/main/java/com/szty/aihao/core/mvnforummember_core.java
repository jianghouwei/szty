/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforummember.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforummember_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMMEMBER数据接口
    *@作者：宋春林 
    */

	public interface mvnforummember_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBER实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforummember(mvnforummember_Dao _MVNFORUMMEMBERModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforummember(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBER实体
         * @return 影响的行数
         */
		public int update_mvnforummember(mvnforummember_Dao _MVNFORUMMEMBERModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMMEMBER中的一条记录
         * @param MVNFORUMMEMBER实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforummember(int _memberid) throws Exception;
		
          /**
         * 得到 mvnforummember 数据实体
         * @param Memberid">Memberid
         * @return<mvnforummember 数据实体
        * @throws Exception 
         */
		public mvnforummember_Dao get_mvnforummemberDao(int _memberid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMMEMBER返回的查询DataRow创建一个MVNFORUMMEMBEREntity对象
         * @param MVNFORUMMEMBER row
         * @returnMVNFORUMMEMBERList对象
        * @throws Exception 
         */
		public List< mvnforummember_Dao> get_mvnforummember_All() throws Exception;
		    /**
         * 根据MVNFORUMMEMBER返回的查询DataRow创建一个MVNFORUMMEMBEREntity对象
         * @param MVNFORUMMEMBER row
         * @returnMVNFORUMMEMBERList对象
        * @throws Exception 
         */
		public List<mvnforummember_Dao> get_mvnforummember_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforummember_Dao> get_mvnforummember_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMMEMBER返回的查询DataRow创建一个MVNFORUMMEMBEREntity对象
         * @param MVNFORUMMEMBER row
         * @returnMVNFORUMMEMBERDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforummember_Dao> get_mvnforummember_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMMEMBER字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforummember_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMMEMBERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforummember_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMMEMBERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforummember_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
