/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoactivitylog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoactivitylog_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOACTIVITYLOG数据接口
    *@作者：宋春林 
    */

	public interface aihaoactivitylog_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOACTIVITYLOG实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoactivitylog(aihaoactivitylog_Dao _AIHAOACTIVITYLOGModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOACTIVITYLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoactivitylog(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOACTIVITYLOG实体
         * @return 影响的行数
         */
		public int update_aihaoactivitylog(aihaoactivitylog_Dao _AIHAOACTIVITYLOGModel) throws Exception;
		

         /**
         *  删除数据表AIHAOACTIVITYLOG中的一条记录
         * @param AIHAOACTIVITYLOG实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoactivitylog(int _activtiylogid) throws Exception;
		
          /**
         * 得到 aihaoactivitylog 数据实体
         * @param Activtiylogid">Activtiylogid
         * @return<aihaoactivitylog 数据实体
        * @throws Exception 
         */
		public aihaoactivitylog_Dao get_aihaoactivitylogDao(int _activtiylogid) throws Exception;
		
		
		    /**
         * 根据AIHAOACTIVITYLOG返回的查询DataRow创建一个AIHAOACTIVITYLOGEntity对象
         * @param AIHAOACTIVITYLOG row
         * @returnAIHAOACTIVITYLOGList对象
        * @throws Exception 
         */
		public List< aihaoactivitylog_Dao> get_aihaoactivitylog_All() throws Exception;
		    /**
         * 根据AIHAOACTIVITYLOG返回的查询DataRow创建一个AIHAOACTIVITYLOGEntity对象
         * @param AIHAOACTIVITYLOG row
         * @returnAIHAOACTIVITYLOGList对象
        * @throws Exception 
         */
		public List<aihaoactivitylog_Dao> get_aihaoactivitylog_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoactivitylog_Dao> get_aihaoactivitylog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOACTIVITYLOG返回的查询DataRow创建一个AIHAOACTIVITYLOGEntity对象
         * @param AIHAOACTIVITYLOG row
         * @returnAIHAOACTIVITYLOGDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoactivitylog_Dao> get_aihaoactivitylog_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOACTIVITYLOG字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoactivitylog_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOACTIVITYLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoactivitylog_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOACTIVITYLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoactivitylog_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
