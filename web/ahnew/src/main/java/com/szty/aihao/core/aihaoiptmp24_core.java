/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp24.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp24_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP24数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp24_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP24实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp24(aihaoiptmp24_Dao _AIHAOIPTMP24Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP24prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp24(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP24实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp24(aihaoiptmp24_Dao _AIHAOIPTMP24Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP24中的一条记录
         * @param AIHAOIPTMP24实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp24(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp24 数据实体
         * @param Id">Id
         * @return<aihaoiptmp24 数据实体
        * @throws Exception 
         */
		public aihaoiptmp24_Dao get_aihaoiptmp24Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP24返回的查询DataRow创建一个AIHAOIPTMP24Entity对象
         * @param AIHAOIPTMP24 row
         * @returnAIHAOIPTMP24List对象
        * @throws Exception 
         */
		public List< aihaoiptmp24_Dao> get_aihaoiptmp24_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP24返回的查询DataRow创建一个AIHAOIPTMP24Entity对象
         * @param AIHAOIPTMP24 row
         * @returnAIHAOIPTMP24List对象
        * @throws Exception 
         */
		public List<aihaoiptmp24_Dao> get_aihaoiptmp24_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp24_Dao> get_aihaoiptmp24_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP24返回的查询DataRow创建一个AIHAOIPTMP24Entity对象
         * @param AIHAOIPTMP24 row
         * @returnAIHAOIPTMP24Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp24_Dao> get_aihaoiptmp24_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP24字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp24_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP24Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp24_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP24IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp24_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
