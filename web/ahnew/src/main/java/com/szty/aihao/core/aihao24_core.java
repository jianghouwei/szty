/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao24.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao24_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO24数据接口
    *@作者：宋春林 
    */

	public interface aihao24_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO24实体
         * @return 新插入记录的编号
         */
		public int insert_aihao24(aihao24_Dao _AIHAO24Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO24prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao24(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO24实体
         * @return 影响的行数
         */
		public int update_aihao24(aihao24_Dao _AIHAO24Model) throws Exception;
		

         /**
         *  删除数据表AIHAO24中的一条记录
         * @param AIHAO24实体
         * @return 新插入记录的编号
         */
		public int delete_aihao24(int _id) throws Exception;
		
          /**
         * 得到 aihao24 数据实体
         * @param Id">Id
         * @return<aihao24 数据实体
        * @throws Exception 
         */
		public aihao24_Dao get_aihao24Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO24返回的查询DataRow创建一个AIHAO24Entity对象
         * @param AIHAO24 row
         * @returnAIHAO24List对象
        * @throws Exception 
         */
		public List< aihao24_Dao> get_aihao24_All() throws Exception;
		    /**
         * 根据AIHAO24返回的查询DataRow创建一个AIHAO24Entity对象
         * @param AIHAO24 row
         * @returnAIHAO24List对象
        * @throws Exception 
         */
		public List<aihao24_Dao> get_aihao24_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao24_Dao> get_aihao24_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO24返回的查询DataRow创建一个AIHAO24Entity对象
         * @param AIHAO24 row
         * @returnAIHAO24Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao24_Dao> get_aihao24_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO24字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao24_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO24Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao24_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO24IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao24_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
