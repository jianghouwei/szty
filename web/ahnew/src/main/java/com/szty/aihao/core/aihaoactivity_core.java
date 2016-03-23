/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoactivity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoactivity_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOACTIVITY数据接口
    *@作者：宋春林 
    */

	public interface aihaoactivity_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOACTIVITY实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoactivity(aihaoactivity_Dao _AIHAOACTIVITYModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOACTIVITYprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoactivity(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOACTIVITY实体
         * @return 影响的行数
         */
		public int update_aihaoactivity(aihaoactivity_Dao _AIHAOACTIVITYModel) throws Exception;
		

         /**
         *  删除数据表AIHAOACTIVITY中的一条记录
         * @param AIHAOACTIVITY实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoactivity(int _activtiylogid) throws Exception;
		
          /**
         * 得到 aihaoactivity 数据实体
         * @param Activtiylogid">Activtiylogid
         * @return<aihaoactivity 数据实体
        * @throws Exception 
         */
		public aihaoactivity_Dao get_aihaoactivityDao(int _activtiylogid) throws Exception;
		
		
		    /**
         * 根据AIHAOACTIVITY返回的查询DataRow创建一个AIHAOACTIVITYEntity对象
         * @param AIHAOACTIVITY row
         * @returnAIHAOACTIVITYList对象
        * @throws Exception 
         */
		public List< aihaoactivity_Dao> get_aihaoactivity_All() throws Exception;
		    /**
         * 根据AIHAOACTIVITY返回的查询DataRow创建一个AIHAOACTIVITYEntity对象
         * @param AIHAOACTIVITY row
         * @returnAIHAOACTIVITYList对象
        * @throws Exception 
         */
		public List<aihaoactivity_Dao> get_aihaoactivity_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoactivity_Dao> get_aihaoactivity_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOACTIVITY返回的查询DataRow创建一个AIHAOACTIVITYEntity对象
         * @param AIHAOACTIVITY row
         * @returnAIHAOACTIVITYDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoactivity_Dao> get_aihaoactivity_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOACTIVITY字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoactivity_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOACTIVITYInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoactivity_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOACTIVITYIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoactivity_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
