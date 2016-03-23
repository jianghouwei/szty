/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMobiletype.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mobiletype_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MOBILETYPE数据接口
    *@作者：宋春林 
    */

	public interface mobiletype_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MOBILETYPE实体
         * @return 新插入记录的编号
         */
		public int insert_mobiletype(mobiletype_Dao _MOBILETYPEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MOBILETYPEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mobiletype(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MOBILETYPE实体
         * @return 影响的行数
         */
		public int update_mobiletype(mobiletype_Dao _MOBILETYPEModel) throws Exception;
		

         /**
         *  删除数据表MOBILETYPE中的一条记录
         * @param MOBILETYPE实体
         * @return 新插入记录的编号
         */
		public int delete_mobiletype(int _motypeid) throws Exception;
		
          /**
         * 得到 mobiletype 数据实体
         * @param Motypeid">Motypeid
         * @return<mobiletype 数据实体
        * @throws Exception 
         */
		public mobiletype_Dao get_mobiletypeDao(int _motypeid) throws Exception;
		
		
		    /**
         * 根据MOBILETYPE返回的查询DataRow创建一个MOBILETYPEEntity对象
         * @param MOBILETYPE row
         * @returnMOBILETYPEList对象
        * @throws Exception 
         */
		public List< mobiletype_Dao> get_mobiletype_All() throws Exception;
		    /**
         * 根据MOBILETYPE返回的查询DataRow创建一个MOBILETYPEEntity对象
         * @param MOBILETYPE row
         * @returnMOBILETYPEList对象
        * @throws Exception 
         */
		public List<mobiletype_Dao> get_mobiletype_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mobiletype_Dao> get_mobiletype_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MOBILETYPE返回的查询DataRow创建一个MOBILETYPEEntity对象
         * @param MOBILETYPE row
         * @returnMOBILETYPEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mobiletype_Dao> get_mobiletype_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MOBILETYPE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mobiletype_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MOBILETYPEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mobiletype_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MOBILETYPEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mobiletype_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
