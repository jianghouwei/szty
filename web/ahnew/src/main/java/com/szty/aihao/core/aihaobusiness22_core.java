/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness22.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness22_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS22数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness22_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS22实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness22(aihaobusiness22_Dao _AIHAOBUSINESS22Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS22prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness22(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS22实体
         * @return 影响的行数
         */
		public int update_aihaobusiness22(aihaobusiness22_Dao _AIHAOBUSINESS22Model) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS22中的一条记录
         * @param AIHAOBUSINESS22实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness22(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness22 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness22 数据实体
        * @throws Exception 
         */
		public aihaobusiness22_Dao get_aihaobusiness22Dao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS22返回的查询DataRow创建一个AIHAOBUSINESS22Entity对象
         * @param AIHAOBUSINESS22 row
         * @returnAIHAOBUSINESS22List对象
        * @throws Exception 
         */
		public List< aihaobusiness22_Dao> get_aihaobusiness22_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS22返回的查询DataRow创建一个AIHAOBUSINESS22Entity对象
         * @param AIHAOBUSINESS22 row
         * @returnAIHAOBUSINESS22List对象
        * @throws Exception 
         */
		public List<aihaobusiness22_Dao> get_aihaobusiness22_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness22_Dao> get_aihaobusiness22_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS22返回的查询DataRow创建一个AIHAOBUSINESS22Entity对象
         * @param AIHAOBUSINESS22 row
         * @returnAIHAOBUSINESS22Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness22_Dao> get_aihaobusiness22_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS22字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness22_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESS22Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness22_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESS22IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness22_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
