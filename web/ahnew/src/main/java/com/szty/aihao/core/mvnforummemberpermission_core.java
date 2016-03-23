/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforummemberpermission.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforummemberpermission_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMMEMBERPERMISSION数据接口
    *@作者：宋春林 
    */

	public interface mvnforummemberpermission_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERPERMISSION实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforummemberpermission(mvnforummemberpermission_Dao _MVNFORUMMEMBERPERMISSIONModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERPERMISSIONprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforummemberpermission(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERPERMISSION实体
         * @return 影响的行数
         */
		public int update_mvnforummemberpermission(mvnforummemberpermission_Dao _MVNFORUMMEMBERPERMISSIONModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMMEMBERPERMISSION中的一条记录
         * @param MVNFORUMMEMBERPERMISSION实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforummemberpermission(int _memberid) throws Exception;
		
          /**
         * 得到 mvnforummemberpermission 数据实体
         * @param Memberid">Memberid
         * @return<mvnforummemberpermission 数据实体
        * @throws Exception 
         */
		public mvnforummemberpermission_Dao get_mvnforummemberpermissionDao(int _memberid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMMEMBERPERMISSION返回的查询DataRow创建一个MVNFORUMMEMBERPERMISSIONEntity对象
         * @param MVNFORUMMEMBERPERMISSION row
         * @returnMVNFORUMMEMBERPERMISSIONList对象
        * @throws Exception 
         */
		public List< mvnforummemberpermission_Dao> get_mvnforummemberpermission_All() throws Exception;
		    /**
         * 根据MVNFORUMMEMBERPERMISSION返回的查询DataRow创建一个MVNFORUMMEMBERPERMISSIONEntity对象
         * @param MVNFORUMMEMBERPERMISSION row
         * @returnMVNFORUMMEMBERPERMISSIONList对象
        * @throws Exception 
         */
		public List<mvnforummemberpermission_Dao> get_mvnforummemberpermission_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforummemberpermission_Dao> get_mvnforummemberpermission_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMMEMBERPERMISSION返回的查询DataRow创建一个MVNFORUMMEMBERPERMISSIONEntity对象
         * @param MVNFORUMMEMBERPERMISSION row
         * @returnMVNFORUMMEMBERPERMISSIONDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforummemberpermission_Dao> get_mvnforummemberpermission_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMMEMBERPERMISSION字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforummemberpermission_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMMEMBERPERMISSIONInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforummemberpermission_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMMEMBERPERMISSIONIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforummemberpermission_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
