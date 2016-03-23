/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao17.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao17_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO17数据接口
    *@作者：宋春林 
    */

	public interface aihao17_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO17实体
         * @return 新插入记录的编号
         */
		public int insert_aihao17(aihao17_Dao _AIHAO17Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO17prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao17(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO17实体
         * @return 影响的行数
         */
		public int update_aihao17(aihao17_Dao _AIHAO17Model) throws Exception;
		

         /**
         *  删除数据表AIHAO17中的一条记录
         * @param AIHAO17实体
         * @return 新插入记录的编号
         */
		public int delete_aihao17(int _id) throws Exception;
		
          /**
         * 得到 aihao17 数据实体
         * @param Id">Id
         * @return<aihao17 数据实体
        * @throws Exception 
         */
		public aihao17_Dao get_aihao17Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO17返回的查询DataRow创建一个AIHAO17Entity对象
         * @param AIHAO17 row
         * @returnAIHAO17List对象
        * @throws Exception 
         */
		public List< aihao17_Dao> get_aihao17_All() throws Exception;
		    /**
         * 根据AIHAO17返回的查询DataRow创建一个AIHAO17Entity对象
         * @param AIHAO17 row
         * @returnAIHAO17List对象
        * @throws Exception 
         */
		public List<aihao17_Dao> get_aihao17_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao17_Dao> get_aihao17_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO17返回的查询DataRow创建一个AIHAO17Entity对象
         * @param AIHAO17 row
         * @returnAIHAO17Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao17_Dao> get_aihao17_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO17字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao17_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO17Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao17_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO17IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao17_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
