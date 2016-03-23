/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp31.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp31_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP31数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp31_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP31实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp31(aihaoiptmp31_Dao _AIHAOIPTMP31Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP31prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp31(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP31实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp31(aihaoiptmp31_Dao _AIHAOIPTMP31Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP31中的一条记录
         * @param AIHAOIPTMP31实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp31(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp31 数据实体
         * @param Id">Id
         * @return<aihaoiptmp31 数据实体
        * @throws Exception 
         */
		public aihaoiptmp31_Dao get_aihaoiptmp31Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP31返回的查询DataRow创建一个AIHAOIPTMP31Entity对象
         * @param AIHAOIPTMP31 row
         * @returnAIHAOIPTMP31List对象
        * @throws Exception 
         */
		public List< aihaoiptmp31_Dao> get_aihaoiptmp31_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP31返回的查询DataRow创建一个AIHAOIPTMP31Entity对象
         * @param AIHAOIPTMP31 row
         * @returnAIHAOIPTMP31List对象
        * @throws Exception 
         */
		public List<aihaoiptmp31_Dao> get_aihaoiptmp31_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp31_Dao> get_aihaoiptmp31_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP31返回的查询DataRow创建一个AIHAOIPTMP31Entity对象
         * @param AIHAOIPTMP31 row
         * @returnAIHAOIPTMP31Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp31_Dao> get_aihaoiptmp31_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP31字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp31_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP31Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp31_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP31IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp31_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
