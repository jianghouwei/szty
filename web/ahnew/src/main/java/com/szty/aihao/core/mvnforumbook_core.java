/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumbook.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumbook_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMBOOK数据接口
    *@作者：宋春林 
    */

	public interface mvnforumbook_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOK实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumbook(mvnforumbook_Dao _MVNFORUMBOOKModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOKprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumbook(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOK实体
         * @return 影响的行数
         */
		public int update_mvnforumbook(mvnforumbook_Dao _MVNFORUMBOOKModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMBOOK中的一条记录
         * @param MVNFORUMBOOK实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumbook(int _bookid) throws Exception;
		
          /**
         * 得到 mvnforumbook 数据实体
         * @param Bookid">Bookid
         * @return<mvnforumbook 数据实体
        * @throws Exception 
         */
		public mvnforumbook_Dao get_mvnforumbookDao(int _bookid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMBOOK返回的查询DataRow创建一个MVNFORUMBOOKEntity对象
         * @param MVNFORUMBOOK row
         * @returnMVNFORUMBOOKList对象
        * @throws Exception 
         */
		public List< mvnforumbook_Dao> get_mvnforumbook_All() throws Exception;
		    /**
         * 根据MVNFORUMBOOK返回的查询DataRow创建一个MVNFORUMBOOKEntity对象
         * @param MVNFORUMBOOK row
         * @returnMVNFORUMBOOKList对象
        * @throws Exception 
         */
		public List<mvnforumbook_Dao> get_mvnforumbook_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumbook_Dao> get_mvnforumbook_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMBOOK返回的查询DataRow创建一个MVNFORUMBOOKEntity对象
         * @param MVNFORUMBOOK row
         * @returnMVNFORUMBOOKDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumbook_Dao> get_mvnforumbook_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMBOOK字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumbook_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMBOOKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumbook_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMBOOKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumbook_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
