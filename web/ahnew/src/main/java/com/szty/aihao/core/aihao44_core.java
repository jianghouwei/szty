/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao44.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao44_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO44数据接口
    *@作者：宋春林 
    */

	public interface aihao44_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO44实体
         * @return 新插入记录的编号
         */
		public int insert_aihao44(aihao44_Dao _AIHAO44Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO44prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao44(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO44实体
         * @return 影响的行数
         */
		public int update_aihao44(aihao44_Dao _AIHAO44Model) throws Exception;
		

         /**
         *  删除数据表AIHAO44中的一条记录
         * @param AIHAO44实体
         * @return 新插入记录的编号
         */
		public int delete_aihao44(int _id) throws Exception;
		
          /**
         * 得到 aihao44 数据实体
         * @param Id">Id
         * @return<aihao44 数据实体
        * @throws Exception 
         */
		public aihao44_Dao get_aihao44Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO44返回的查询DataRow创建一个AIHAO44Entity对象
         * @param AIHAO44 row
         * @returnAIHAO44List对象
        * @throws Exception 
         */
		public List< aihao44_Dao> get_aihao44_All() throws Exception;
		    /**
         * 根据AIHAO44返回的查询DataRow创建一个AIHAO44Entity对象
         * @param AIHAO44 row
         * @returnAIHAO44List对象
        * @throws Exception 
         */
		public List<aihao44_Dao> get_aihao44_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao44_Dao> get_aihao44_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO44返回的查询DataRow创建一个AIHAO44Entity对象
         * @param AIHAO44 row
         * @returnAIHAO44Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao44_Dao> get_aihao44_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO44字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao44_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO44Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao44_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO44IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao44_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
