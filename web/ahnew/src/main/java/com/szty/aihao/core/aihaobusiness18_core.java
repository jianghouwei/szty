/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness18.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness18_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS18数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness18_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS18实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness18(aihaobusiness18_Dao _AIHAOBUSINESS18Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS18prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness18(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS18实体
         * @return 影响的行数
         */
		public int update_aihaobusiness18(aihaobusiness18_Dao _AIHAOBUSINESS18Model) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS18中的一条记录
         * @param AIHAOBUSINESS18实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness18(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness18 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness18 数据实体
        * @throws Exception 
         */
		public aihaobusiness18_Dao get_aihaobusiness18Dao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS18返回的查询DataRow创建一个AIHAOBUSINESS18Entity对象
         * @param AIHAOBUSINESS18 row
         * @returnAIHAOBUSINESS18List对象
        * @throws Exception 
         */
		public List< aihaobusiness18_Dao> get_aihaobusiness18_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS18返回的查询DataRow创建一个AIHAOBUSINESS18Entity对象
         * @param AIHAOBUSINESS18 row
         * @returnAIHAOBUSINESS18List对象
        * @throws Exception 
         */
		public List<aihaobusiness18_Dao> get_aihaobusiness18_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness18_Dao> get_aihaobusiness18_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS18返回的查询DataRow创建一个AIHAOBUSINESS18Entity对象
         * @param AIHAOBUSINESS18 row
         * @returnAIHAOBUSINESS18Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness18_Dao> get_aihaobusiness18_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS18字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness18_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESS18Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness18_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESS18IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness18_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
