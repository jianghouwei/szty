/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp19.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp19_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP19数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp19_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP19实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp19(aihaoiptmp19_Dao _AIHAOIPTMP19Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP19prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp19(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP19实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp19(aihaoiptmp19_Dao _AIHAOIPTMP19Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP19中的一条记录
         * @param AIHAOIPTMP19实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp19(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp19 数据实体
         * @param Id">Id
         * @return<aihaoiptmp19 数据实体
        * @throws Exception 
         */
		public aihaoiptmp19_Dao get_aihaoiptmp19Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP19返回的查询DataRow创建一个AIHAOIPTMP19Entity对象
         * @param AIHAOIPTMP19 row
         * @returnAIHAOIPTMP19List对象
        * @throws Exception 
         */
		public List< aihaoiptmp19_Dao> get_aihaoiptmp19_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP19返回的查询DataRow创建一个AIHAOIPTMP19Entity对象
         * @param AIHAOIPTMP19 row
         * @returnAIHAOIPTMP19List对象
        * @throws Exception 
         */
		public List<aihaoiptmp19_Dao> get_aihaoiptmp19_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp19_Dao> get_aihaoiptmp19_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP19返回的查询DataRow创建一个AIHAOIPTMP19Entity对象
         * @param AIHAOIPTMP19 row
         * @returnAIHAOIPTMP19Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp19_Dao> get_aihaoiptmp19_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP19字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp19_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP19Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp19_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP19IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp19_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
