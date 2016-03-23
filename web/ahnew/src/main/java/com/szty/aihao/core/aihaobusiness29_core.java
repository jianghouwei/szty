/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness29.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness29_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS29数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness29_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS29实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness29(aihaobusiness29_Dao _AIHAOBUSINESS29Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS29prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness29(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS29实体
         * @return 影响的行数
         */
		public int update_aihaobusiness29(aihaobusiness29_Dao _AIHAOBUSINESS29Model) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS29中的一条记录
         * @param AIHAOBUSINESS29实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness29(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness29 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness29 数据实体
        * @throws Exception 
         */
		public aihaobusiness29_Dao get_aihaobusiness29Dao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS29返回的查询DataRow创建一个AIHAOBUSINESS29Entity对象
         * @param AIHAOBUSINESS29 row
         * @returnAIHAOBUSINESS29List对象
        * @throws Exception 
         */
		public List< aihaobusiness29_Dao> get_aihaobusiness29_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS29返回的查询DataRow创建一个AIHAOBUSINESS29Entity对象
         * @param AIHAOBUSINESS29 row
         * @returnAIHAOBUSINESS29List对象
        * @throws Exception 
         */
		public List<aihaobusiness29_Dao> get_aihaobusiness29_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness29_Dao> get_aihaobusiness29_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS29返回的查询DataRow创建一个AIHAOBUSINESS29Entity对象
         * @param AIHAOBUSINESS29 row
         * @returnAIHAOBUSINESS29Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness29_Dao> get_aihaobusiness29_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS29字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness29_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESS29Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness29_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESS29IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness29_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
