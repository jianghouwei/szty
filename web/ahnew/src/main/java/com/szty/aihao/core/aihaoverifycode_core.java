/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoverifycode.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoverifycode_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOVERIFYCODE数据接口
    *@作者：宋春林 
    */

	public interface aihaoverifycode_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOVERIFYCODE实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoverifycode(aihaoverifycode_Dao _AIHAOVERIFYCODEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOVERIFYCODEprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoverifycode(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOVERIFYCODE实体
         * @return 影响的行数
         */
		public int update_aihaoverifycode(aihaoverifycode_Dao _AIHAOVERIFYCODEModel) throws Exception;
		

         /**
         *  删除数据表AIHAOVERIFYCODE中的一条记录
         * @param AIHAOVERIFYCODE实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoverifycode(int _id) throws Exception;
		
          /**
         * 得到 aihaoverifycode 数据实体
         * @param Id">Id
         * @return<aihaoverifycode 数据实体
        * @throws Exception 
         */
		public aihaoverifycode_Dao get_aihaoverifycodeDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOVERIFYCODE返回的查询DataRow创建一个AIHAOVERIFYCODEEntity对象
         * @param AIHAOVERIFYCODE row
         * @returnAIHAOVERIFYCODEList对象
        * @throws Exception 
         */
		public List< aihaoverifycode_Dao> get_aihaoverifycode_All() throws Exception;
		    /**
         * 根据AIHAOVERIFYCODE返回的查询DataRow创建一个AIHAOVERIFYCODEEntity对象
         * @param AIHAOVERIFYCODE row
         * @returnAIHAOVERIFYCODEList对象
        * @throws Exception 
         */
		public List<aihaoverifycode_Dao> get_aihaoverifycode_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoverifycode_Dao> get_aihaoverifycode_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOVERIFYCODE返回的查询DataRow创建一个AIHAOVERIFYCODEEntity对象
         * @param AIHAOVERIFYCODE row
         * @returnAIHAOVERIFYCODEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoverifycode_Dao> get_aihaoverifycode_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOVERIFYCODE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoverifycode_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOVERIFYCODEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoverifycode_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOVERIFYCODEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoverifycode_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
