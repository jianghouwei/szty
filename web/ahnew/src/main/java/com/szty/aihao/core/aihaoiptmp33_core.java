/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp33.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp33_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP33数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp33_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP33实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp33(aihaoiptmp33_Dao _AIHAOIPTMP33Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP33prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp33(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP33实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp33(aihaoiptmp33_Dao _AIHAOIPTMP33Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP33中的一条记录
         * @param AIHAOIPTMP33实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp33(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp33 数据实体
         * @param Id">Id
         * @return<aihaoiptmp33 数据实体
        * @throws Exception 
         */
		public aihaoiptmp33_Dao get_aihaoiptmp33Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP33返回的查询DataRow创建一个AIHAOIPTMP33Entity对象
         * @param AIHAOIPTMP33 row
         * @returnAIHAOIPTMP33List对象
        * @throws Exception 
         */
		public List< aihaoiptmp33_Dao> get_aihaoiptmp33_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP33返回的查询DataRow创建一个AIHAOIPTMP33Entity对象
         * @param AIHAOIPTMP33 row
         * @returnAIHAOIPTMP33List对象
        * @throws Exception 
         */
		public List<aihaoiptmp33_Dao> get_aihaoiptmp33_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp33_Dao> get_aihaoiptmp33_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP33返回的查询DataRow创建一个AIHAOIPTMP33Entity对象
         * @param AIHAOIPTMP33 row
         * @returnAIHAOIPTMP33Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp33_Dao> get_aihaoiptmp33_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP33字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp33_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP33Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp33_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP33IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp33_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
