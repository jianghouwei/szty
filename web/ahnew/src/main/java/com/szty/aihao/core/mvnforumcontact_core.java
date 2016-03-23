/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumcontact.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumcontact_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMCONTACT数据接口
    *@作者：宋春林 
    */

	public interface mvnforumcontact_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMCONTACT实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumcontact(mvnforumcontact_Dao _MVNFORUMCONTACTModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMCONTACTprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumcontact(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMCONTACT实体
         * @return 影响的行数
         */
		public int update_mvnforumcontact(mvnforumcontact_Dao _MVNFORUMCONTACTModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMCONTACT中的一条记录
         * @param MVNFORUMCONTACT实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumcontact(int _contactid) throws Exception;
		
          /**
         * 得到 mvnforumcontact 数据实体
         * @param Contactid">Contactid
         * @return<mvnforumcontact 数据实体
        * @throws Exception 
         */
		public mvnforumcontact_Dao get_mvnforumcontactDao(int _contactid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMCONTACT返回的查询DataRow创建一个MVNFORUMCONTACTEntity对象
         * @param MVNFORUMCONTACT row
         * @returnMVNFORUMCONTACTList对象
        * @throws Exception 
         */
		public List< mvnforumcontact_Dao> get_mvnforumcontact_All() throws Exception;
		    /**
         * 根据MVNFORUMCONTACT返回的查询DataRow创建一个MVNFORUMCONTACTEntity对象
         * @param MVNFORUMCONTACT row
         * @returnMVNFORUMCONTACTList对象
        * @throws Exception 
         */
		public List<mvnforumcontact_Dao> get_mvnforumcontact_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumcontact_Dao> get_mvnforumcontact_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMCONTACT返回的查询DataRow创建一个MVNFORUMCONTACTEntity对象
         * @param MVNFORUMCONTACT row
         * @returnMVNFORUMCONTACTDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumcontact_Dao> get_mvnforumcontact_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMCONTACT字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumcontact_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMCONTACTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumcontact_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMCONTACTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumcontact_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
