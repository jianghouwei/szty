/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness34.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness34_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS34数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness34_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS34实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness34(aihaobusiness34_Dao _AIHAOBUSINESS34Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS34prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness34(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS34实体
         * @return 影响的行数
         */
		public int update_aihaobusiness34(aihaobusiness34_Dao _AIHAOBUSINESS34Model) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS34中的一条记录
         * @param AIHAOBUSINESS34实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness34(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness34 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness34 数据实体
        * @throws Exception 
         */
		public aihaobusiness34_Dao get_aihaobusiness34Dao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS34返回的查询DataRow创建一个AIHAOBUSINESS34Entity对象
         * @param AIHAOBUSINESS34 row
         * @returnAIHAOBUSINESS34List对象
        * @throws Exception 
         */
		public List< aihaobusiness34_Dao> get_aihaobusiness34_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS34返回的查询DataRow创建一个AIHAOBUSINESS34Entity对象
         * @param AIHAOBUSINESS34 row
         * @returnAIHAOBUSINESS34List对象
        * @throws Exception 
         */
		public List<aihaobusiness34_Dao> get_aihaobusiness34_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness34_Dao> get_aihaobusiness34_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS34返回的查询DataRow创建一个AIHAOBUSINESS34Entity对象
         * @param AIHAOBUSINESS34 row
         * @returnAIHAOBUSINESS34Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness34_Dao> get_aihaobusiness34_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS34字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness34_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESS34Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness34_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESS34IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness34_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
