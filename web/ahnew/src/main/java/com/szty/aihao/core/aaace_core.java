/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAaace.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aaace_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AAACE数据接口
    *@作者：宋春林 
    */

	public interface aaace_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AAACE实体
         * @return 新插入记录的编号
         */
		public int insert_aaace(aaace_Dao _AAACEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AAACEprrameter
         * @return 新插入记录的编号
         */
         public int insert_aaace(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AAACE实体
         * @return 影响的行数
         */
		public int update_aaace(aaace_Dao _AAACEModel) throws Exception;
		

         /**
         *  删除数据表AAACE中的一条记录
         * @param AAACE实体
         * @return 新插入记录的编号
         */
		public int delete_aaace(int _id) throws Exception;
		
          /**
         * 得到 aaace 数据实体
         * @param Id">Id
         * @return<aaace 数据实体
        * @throws Exception 
         */
		public aaace_Dao get_aaaceDao(int _id) throws Exception;
		
		
		    /**
         * 根据AAACE返回的查询DataRow创建一个AAACEEntity对象
         * @param AAACE row
         * @returnAAACEList对象
        * @throws Exception 
         */
		public List< aaace_Dao> get_aaace_All() throws Exception;
		    /**
         * 根据AAACE返回的查询DataRow创建一个AAACEEntity对象
         * @param AAACE row
         * @returnAAACEList对象
        * @throws Exception 
         */
		public List<aaace_Dao> get_aaace_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aaace_Dao> get_aaace_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AAACE返回的查询DataRow创建一个AAACEEntity对象
         * @param AAACE row
         * @returnAAACEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aaace_Dao> get_aaace_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AAACE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aaace_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AAACEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aaace_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AAACEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aaace_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
