/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataUtilhaoclass.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.utilhaoclass_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@UTILHAOCLASS数据接口
    *@作者：宋春林 
    */

	public interface utilhaoclass_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param UTILHAOCLASS实体
         * @return 新插入记录的编号
         */
		public int insert_utilhaoclass(utilhaoclass_Dao _UTILHAOCLASSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param UTILHAOCLASSprrameter
         * @return 新插入记录的编号
         */
         public int insert_utilhaoclass(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param UTILHAOCLASS实体
         * @return 影响的行数
         */
		public int update_utilhaoclass(utilhaoclass_Dao _UTILHAOCLASSModel) throws Exception;
		

         /**
         *  删除数据表UTILHAOCLASS中的一条记录
         * @param UTILHAOCLASS实体
         * @return 新插入记录的编号
         */
		public int delete_utilhaoclass(int _name) throws Exception;
		
          /**
         * 得到 utilhaoclass 数据实体
         * @param Name">Name
         * @return<utilhaoclass 数据实体
        * @throws Exception 
         */
		public utilhaoclass_Dao get_utilhaoclassDao(int _name) throws Exception;
		
		
		    /**
         * 根据UTILHAOCLASS返回的查询DataRow创建一个UTILHAOCLASSEntity对象
         * @param UTILHAOCLASS row
         * @returnUTILHAOCLASSList对象
        * @throws Exception 
         */
		public List< utilhaoclass_Dao> get_utilhaoclass_All() throws Exception;
		    /**
         * 根据UTILHAOCLASS返回的查询DataRow创建一个UTILHAOCLASSEntity对象
         * @param UTILHAOCLASS row
         * @returnUTILHAOCLASSList对象
        * @throws Exception 
         */
		public List<utilhaoclass_Dao> get_utilhaoclass_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<utilhaoclass_Dao> get_utilhaoclass_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据UTILHAOCLASS返回的查询DataRow创建一个UTILHAOCLASSEntity对象
         * @param UTILHAOCLASS row
         * @returnUTILHAOCLASSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, utilhaoclass_Dao> get_utilhaoclass_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新UTILHAOCLASS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_utilhaoclass_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新UTILHAOCLASSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_utilhaoclass_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新UTILHAOCLASSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_utilhaoclass_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
