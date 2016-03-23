/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao10.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao10_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO10数据接口
    *@作者：宋春林 
    */

	public interface aihao10_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO10实体
         * @return 新插入记录的编号
         */
		public int insert_aihao10(aihao10_Dao _AIHAO10Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO10prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao10(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO10实体
         * @return 影响的行数
         */
		public int update_aihao10(aihao10_Dao _AIHAO10Model) throws Exception;
		

         /**
         *  删除数据表AIHAO10中的一条记录
         * @param AIHAO10实体
         * @return 新插入记录的编号
         */
		public int delete_aihao10(int _id) throws Exception;
		
          /**
         * 得到 aihao10 数据实体
         * @param Id">Id
         * @return<aihao10 数据实体
        * @throws Exception 
         */
		public aihao10_Dao get_aihao10Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO10返回的查询DataRow创建一个AIHAO10Entity对象
         * @param AIHAO10 row
         * @returnAIHAO10List对象
        * @throws Exception 
         */
		public List< aihao10_Dao> get_aihao10_All() throws Exception;
		    /**
         * 根据AIHAO10返回的查询DataRow创建一个AIHAO10Entity对象
         * @param AIHAO10 row
         * @returnAIHAO10List对象
        * @throws Exception 
         */
		public List<aihao10_Dao> get_aihao10_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao10_Dao> get_aihao10_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO10返回的查询DataRow创建一个AIHAO10Entity对象
         * @param AIHAO10 row
         * @returnAIHAO10Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao10_Dao> get_aihao10_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO10字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao10_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO10Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao10_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO10IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao10_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
