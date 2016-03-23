/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao18_20140409bak.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao18_20140409bak_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO18_20140409BAK数据接口
    *@作者：宋春林 
    */

	public interface aihao18_20140409bak_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO18_20140409BAK实体
         * @return 新插入记录的编号
         */
		public int insert_aihao18_20140409bak(aihao18_20140409bak_Dao _AIHAO18_20140409BAKModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO18_20140409BAKprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao18_20140409bak(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO18_20140409BAK实体
         * @return 影响的行数
         */
		public int update_aihao18_20140409bak(aihao18_20140409bak_Dao _AIHAO18_20140409BAKModel) throws Exception;
		

         /**
         *  删除数据表AIHAO18_20140409BAK中的一条记录
         * @param AIHAO18_20140409BAK实体
         * @return 新插入记录的编号
         */
		public int delete_aihao18_20140409bak(int _id) throws Exception;
		
          /**
         * 得到 aihao18_20140409bak 数据实体
         * @param Id">Id
         * @return<aihao18_20140409bak 数据实体
        * @throws Exception 
         */
		public aihao18_20140409bak_Dao get_aihao18_20140409bakDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO18_20140409BAK返回的查询DataRow创建一个AIHAO18_20140409BAKEntity对象
         * @param AIHAO18_20140409BAK row
         * @returnAIHAO18_20140409BAKList对象
        * @throws Exception 
         */
		public List< aihao18_20140409bak_Dao> get_aihao18_20140409bak_All() throws Exception;
		    /**
         * 根据AIHAO18_20140409BAK返回的查询DataRow创建一个AIHAO18_20140409BAKEntity对象
         * @param AIHAO18_20140409BAK row
         * @returnAIHAO18_20140409BAKList对象
        * @throws Exception 
         */
		public List<aihao18_20140409bak_Dao> get_aihao18_20140409bak_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao18_20140409bak_Dao> get_aihao18_20140409bak_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO18_20140409BAK返回的查询DataRow创建一个AIHAO18_20140409BAKEntity对象
         * @param AIHAO18_20140409BAK row
         * @returnAIHAO18_20140409BAKDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao18_20140409bak_Dao> get_aihao18_20140409bak_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO18_20140409BAK字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao18_20140409bak_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO18_20140409BAKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao18_20140409bak_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO18_20140409BAKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao18_20140409bak_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
