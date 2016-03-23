/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness40.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness40_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS40数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness40_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS40实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness40(aihaobusiness40_Dao _AIHAOBUSINESS40Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS40prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness40(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS40实体
         * @return 影响的行数
         */
		public int update_aihaobusiness40(aihaobusiness40_Dao _AIHAOBUSINESS40Model) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS40中的一条记录
         * @param AIHAOBUSINESS40实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness40(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness40 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness40 数据实体
        * @throws Exception 
         */
		public aihaobusiness40_Dao get_aihaobusiness40Dao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS40返回的查询DataRow创建一个AIHAOBUSINESS40Entity对象
         * @param AIHAOBUSINESS40 row
         * @returnAIHAOBUSINESS40List对象
        * @throws Exception 
         */
		public List< aihaobusiness40_Dao> get_aihaobusiness40_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS40返回的查询DataRow创建一个AIHAOBUSINESS40Entity对象
         * @param AIHAOBUSINESS40 row
         * @returnAIHAOBUSINESS40List对象
        * @throws Exception 
         */
		public List<aihaobusiness40_Dao> get_aihaobusiness40_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness40_Dao> get_aihaobusiness40_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS40返回的查询DataRow创建一个AIHAOBUSINESS40Entity对象
         * @param AIHAOBUSINESS40 row
         * @returnAIHAOBUSINESS40Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness40_Dao> get_aihaobusiness40_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS40字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness40_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESS40Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness40_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESS40IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness40_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
