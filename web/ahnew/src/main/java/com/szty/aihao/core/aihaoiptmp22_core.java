/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp22.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoiptmp22_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP22数据接口
    *@作者：宋春林 
    */

	public interface aihaoiptmp22_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP22实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp22(aihaoiptmp22_Dao _AIHAOIPTMP22Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP22prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp22(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP22实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp22(aihaoiptmp22_Dao _AIHAOIPTMP22Model) throws Exception;
		

         /**
         *  删除数据表AIHAOIPTMP22中的一条记录
         * @param AIHAOIPTMP22实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp22(int _id) throws Exception;
		
          /**
         * 得到 aihaoiptmp22 数据实体
         * @param Id">Id
         * @return<aihaoiptmp22 数据实体
        * @throws Exception 
         */
		public aihaoiptmp22_Dao get_aihaoiptmp22Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOIPTMP22返回的查询DataRow创建一个AIHAOIPTMP22Entity对象
         * @param AIHAOIPTMP22 row
         * @returnAIHAOIPTMP22List对象
        * @throws Exception 
         */
		public List< aihaoiptmp22_Dao> get_aihaoiptmp22_All() throws Exception;
		    /**
         * 根据AIHAOIPTMP22返回的查询DataRow创建一个AIHAOIPTMP22Entity对象
         * @param AIHAOIPTMP22 row
         * @returnAIHAOIPTMP22List对象
        * @throws Exception 
         */
		public List<aihaoiptmp22_Dao> get_aihaoiptmp22_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp22_Dao> get_aihaoiptmp22_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOIPTMP22返回的查询DataRow创建一个AIHAOIPTMP22Entity对象
         * @param AIHAOIPTMP22 row
         * @returnAIHAOIPTMP22Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoiptmp22_Dao> get_aihaoiptmp22_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOIPTMP22字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoiptmp22_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOIPTMP22Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoiptmp22_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOIPTMP22IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoiptmp22_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
