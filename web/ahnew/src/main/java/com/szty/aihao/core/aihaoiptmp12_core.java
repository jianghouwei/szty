/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp12.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp12_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP12数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp12_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP12实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp12(aihaoiptmp12_Dao _AIHAOIPTMP12Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP12prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp12(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP12实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp12(aihaoiptmp12_Dao _AIHAOIPTMP12Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP12中的一条记录
         * @param AIHAOIPTMP12实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp12(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp12 数据实体
         * @param Id">Id
         * @return<aihaoiptmp12 数据实体
        * @throws Exception 
         */
		public aihaoiptmp12_Dao get_aihaoiptmp12Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP12返回的查询DataRow创建一个AIHAOIPTMP12Entity对象
         * @param AIHAOIPTMP12 row
         * @returnAIHAOIPTMP12List对象
        * @throws Exception 
         */
		public List< aihaoiptmp12_Dao> get_aihaoiptmp12_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP12返回的查询DataRow创建一个AIHAOIPTMP12Entity对象
         * @param AIHAOIPTMP12 row
         * @returnAIHAOIPTMP12List对象
        * @throws Exception 
         */
		public List<aihaoiptmp12_Dao> get_aihaoiptmp12_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp12_Dao> get_aihaoiptmp12_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP12返回的查询DataRow创建一个AIHAOIPTMP12Entity对象
         * @param AIHAOIPTMP12 row
         * @returnAIHAOIPTMP12Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp12_Dao> get_aihaoiptmp12_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP12字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp12_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP12Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp12_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP12IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp12_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
