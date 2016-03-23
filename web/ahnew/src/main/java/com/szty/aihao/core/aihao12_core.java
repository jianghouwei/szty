/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao12.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao12_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO12数据接口
    *@作者：宋春林 
    */

	public interface aihao12_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO12实体
         * @return 新插入记录的编号
         */
		public int insert_aihao12(aihao12_Dao _AIHAO12Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO12prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao12(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO12实体
         * @return 影响的行数
         */
		public int update_aihao12(aihao12_Dao _AIHAO12Model) throws Exception;
		

         /**
         *  删除数据表AIHAO12中的一条记录
         * @param AIHAO12实体
         * @return 新插入记录的编号
         */
		public int delete_aihao12(int _id) throws Exception;
		
          /**
         * 得到 aihao12 数据实体
         * @param Id">Id
         * @return<aihao12 数据实体
        * @throws Exception 
         */
		public aihao12_Dao get_aihao12Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO12返回的查询DataRow创建一个AIHAO12Entity对象
         * @param AIHAO12 row
         * @returnAIHAO12List对象
        * @throws Exception 
         */
		public List< aihao12_Dao> get_aihao12_All() throws Exception;
		    /**
         * 根据AIHAO12返回的查询DataRow创建一个AIHAO12Entity对象
         * @param AIHAO12 row
         * @returnAIHAO12List对象
        * @throws Exception 
         */
		public List<aihao12_Dao> get_aihao12_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao12_Dao> get_aihao12_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO12返回的查询DataRow创建一个AIHAO12Entity对象
         * @param AIHAO12 row
         * @returnAIHAO12Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao12_Dao> get_aihao12_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO12字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao12_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO12Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao12_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO12IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao12_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
