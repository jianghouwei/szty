/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp20.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp20_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP20数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp20_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP20实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp20(aihaoiptmp20_Dao _AIHAOIPTMP20Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP20prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp20(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP20实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp20(aihaoiptmp20_Dao _AIHAOIPTMP20Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP20中的一条记录
         * @param AIHAOIPTMP20实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp20(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp20 数据实体
         * @param Id">Id
         * @return<aihaoiptmp20 数据实体
        * @throws Exception 
         */
		public aihaoiptmp20_Dao get_aihaoiptmp20Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP20返回的查询DataRow创建一个AIHAOIPTMP20Entity对象
         * @param AIHAOIPTMP20 row
         * @returnAIHAOIPTMP20List对象
        * @throws Exception 
         */
		public List< aihaoiptmp20_Dao> get_aihaoiptmp20_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP20返回的查询DataRow创建一个AIHAOIPTMP20Entity对象
         * @param AIHAOIPTMP20 row
         * @returnAIHAOIPTMP20List对象
        * @throws Exception 
         */
		public List<aihaoiptmp20_Dao> get_aihaoiptmp20_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp20_Dao> get_aihaoiptmp20_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP20返回的查询DataRow创建一个AIHAOIPTMP20Entity对象
         * @param AIHAOIPTMP20 row
         * @returnAIHAOIPTMP20Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp20_Dao> get_aihaoiptmp20_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP20字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp20_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP20Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp20_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP20IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp20_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
