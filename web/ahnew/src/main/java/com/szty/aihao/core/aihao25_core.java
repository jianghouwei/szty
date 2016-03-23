/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao25.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao25_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO25数据接口
    *@作者：宋春林 
    */

	public interface aihao25_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO25实体
         * @return 新插入记录的编号
         */
		public int insert_aihao25(aihao25_Dao _AIHAO25Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO25prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao25(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO25实体
         * @return 影响的行数
         */
		public int update_aihao25(aihao25_Dao _AIHAO25Model) throws Exception;
		

         /**
         *  删除数据表AIHAO25中的一条记录
         * @param AIHAO25实体
         * @return 新插入记录的编号
         */
		public int delete_aihao25(int _id) throws Exception;
		
          /**
         * 得到 aihao25 数据实体
         * @param Id">Id
         * @return<aihao25 数据实体
        * @throws Exception 
         */
		public aihao25_Dao get_aihao25Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO25返回的查询DataRow创建一个AIHAO25Entity对象
         * @param AIHAO25 row
         * @returnAIHAO25List对象
        * @throws Exception 
         */
		public List< aihao25_Dao> get_aihao25_All() throws Exception;
		    /**
         * 根据AIHAO25返回的查询DataRow创建一个AIHAO25Entity对象
         * @param AIHAO25 row
         * @returnAIHAO25List对象
        * @throws Exception 
         */
		public List<aihao25_Dao> get_aihao25_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao25_Dao> get_aihao25_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO25返回的查询DataRow创建一个AIHAO25Entity对象
         * @param AIHAO25 row
         * @returnAIHAO25Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao25_Dao> get_aihao25_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO25字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao25_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO25Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao25_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO25IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao25_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
