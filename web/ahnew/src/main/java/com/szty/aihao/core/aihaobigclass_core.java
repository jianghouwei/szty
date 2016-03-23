/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobigclass.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobigclass_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBIGCLASS数据接口
    *@作者：宋春林 
    */

	public interface aihaobigclass_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBIGCLASS实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobigclass(aihaobigclass_Dao _AIHAOBIGCLASSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBIGCLASSprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobigclass(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBIGCLASS实体
         * @return 影响的行数
         */
		public int update_aihaobigclass(aihaobigclass_Dao _AIHAOBIGCLASSModel) throws Exception;
		

         /**
         *  删除数据表AIHAOBIGCLASS中的一条记录
         * @param AIHAOBIGCLASS实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobigclass(int _bigclassid) throws Exception;
		
          /**
         * 得到 aihaobigclass 数据实体
         * @param Bigclassid">Bigclassid
         * @return<aihaobigclass 数据实体
        * @throws Exception 
         */
		public aihaobigclass_Dao get_aihaobigclassDao(int _bigclassid) throws Exception;
		
		
		    /**
         * 根据AIHAOBIGCLASS返回的查询DataRow创建一个AIHAOBIGCLASSEntity对象
         * @param AIHAOBIGCLASS row
         * @returnAIHAOBIGCLASSList对象
        * @throws Exception 
         */
		public List< aihaobigclass_Dao> get_aihaobigclass_All() throws Exception;
		    /**
         * 根据AIHAOBIGCLASS返回的查询DataRow创建一个AIHAOBIGCLASSEntity对象
         * @param AIHAOBIGCLASS row
         * @returnAIHAOBIGCLASSList对象
        * @throws Exception 
         */
		public List<aihaobigclass_Dao> get_aihaobigclass_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobigclass_Dao> get_aihaobigclass_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBIGCLASS返回的查询DataRow创建一个AIHAOBIGCLASSEntity对象
         * @param AIHAOBIGCLASS row
         * @returnAIHAOBIGCLASSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobigclass_Dao> get_aihaobigclass_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBIGCLASS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobigclass_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBIGCLASSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobigclass_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBIGCLASSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobigclass_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
