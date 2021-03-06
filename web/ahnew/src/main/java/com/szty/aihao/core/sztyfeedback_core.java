﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyfeedback.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.sztyfeedback_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYFEEDBACK数据接口
    *@作者：宋春林 
    */

	public interface sztyfeedback_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYFEEDBACK实体
         * @return 新插入记录的编号
         */
		public int insert_sztyfeedback(sztyfeedback_Dao _SZTYFEEDBACKModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYFEEDBACKprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyfeedback(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYFEEDBACK实体
         * @return 影响的行数
         */
		public int update_sztyfeedback(sztyfeedback_Dao _SZTYFEEDBACKModel) throws Exception;
		

         /**
         *  删除数据表SZTYFEEDBACK中的一条记录
         * @param SZTYFEEDBACK实体
         * @return 新插入记录的编号
         */
		public int delete_sztyfeedback(int _id) throws Exception;
		
          /**
         * 得到 sztyfeedback 数据实体
         * @param Id">Id
         * @return<sztyfeedback 数据实体
        * @throws Exception 
         */
		public sztyfeedback_Dao get_sztyfeedbackDao(int _id) throws Exception;
		
		
		    /**
         * 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
         * @param SZTYFEEDBACK row
         * @returnSZTYFEEDBACKList对象
        * @throws Exception 
         */
		public List< sztyfeedback_Dao> get_sztyfeedback_All() throws Exception;
		    /**
         * 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
         * @param SZTYFEEDBACK row
         * @returnSZTYFEEDBACKList对象
        * @throws Exception 
         */
		public List<sztyfeedback_Dao> get_sztyfeedback_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyfeedback_Dao> get_sztyfeedback_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据SZTYFEEDBACK返回的查询DataRow创建一个SZTYFEEDBACKEntity对象
         * @param SZTYFEEDBACK row
         * @returnSZTYFEEDBACKDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, sztyfeedback_Dao> get_sztyfeedback_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新SZTYFEEDBACK字段加一
         * @param FieldName
         * @param sid
         */
	public int create_sztyfeedback_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新SZTYFEEDBACKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_sztyfeedback_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新SZTYFEEDBACKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_sztyfeedback_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
