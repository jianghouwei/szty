/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao30.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao30_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO30数据接口
    *@作者：宋春林 
    */

	public interface aihao30_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO30实体
         * @return 新插入记录的编号
         */
		public int insert_aihao30(aihao30_Dao _AIHAO30Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO30prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao30(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO30实体
         * @return 影响的行数
         */
		public int update_aihao30(aihao30_Dao _AIHAO30Model) throws Exception;
		

         /**
         *  删除数据表AIHAO30中的一条记录
         * @param AIHAO30实体
         * @return 新插入记录的编号
         */
		public int delete_aihao30(int _id) throws Exception;
		
          /**
         * 得到 aihao30 数据实体
         * @param Id">Id
         * @return<aihao30 数据实体
        * @throws Exception 
         */
		public aihao30_Dao get_aihao30Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO30返回的查询DataRow创建一个AIHAO30Entity对象
         * @param AIHAO30 row
         * @returnAIHAO30List对象
        * @throws Exception 
         */
		public List< aihao30_Dao> get_aihao30_All() throws Exception;
		    /**
         * 根据AIHAO30返回的查询DataRow创建一个AIHAO30Entity对象
         * @param AIHAO30 row
         * @returnAIHAO30List对象
        * @throws Exception 
         */
		public List<aihao30_Dao> get_aihao30_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao30_Dao> get_aihao30_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO30返回的查询DataRow创建一个AIHAO30Entity对象
         * @param AIHAO30 row
         * @returnAIHAO30Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao30_Dao> get_aihao30_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO30字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao30_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO30Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao30_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO30IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao30_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
