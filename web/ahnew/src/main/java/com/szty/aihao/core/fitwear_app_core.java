/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataFitwear_app.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/11/4
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.fitwear_app_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@FITWEAR_APP数据接口
    *@作者：宋春林 
    */

	public interface fitwear_app_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param FITWEAR_APP实体
         * @return 新插入记录的编号
         */
		public int insert_fitwear_app(fitwear_app_Dao _FITWEAR_APPModel) throws Exception;
				
        
        /**
         * 向数据库中插入一条新记录。
         * @param FITWEAR_APPprrameter
         * @return 新插入记录的编号
         */
         public int insert_fitwear_app(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param FITWEAR_APP实体
         * @return 影响的行数
         */
		public int update_fitwear_app(fitwear_app_Dao _FITWEAR_APPModel) throws Exception;
		

         /**
         *  删除数据表FITWEAR_APP中的一条记录
         * @param FITWEAR_APP实体
         * @return 新插入记录的编号
         */
		public int delete_fitwear_app(int _id) throws Exception;
		
          /**
         * 得到 fitwear_app 数据实体
         * @param Id">Id
         * @return<fitwear_app 数据实体
        * @throws Exception 
         */
		public fitwear_app_Dao get_fitwear_appDao(int _id) throws Exception;
		public int get_fitwear_appCount(String sWhere) throws Exception;
		public int get_fitwear_appVal() throws Exception;
		
		    /**
         * 根据FITWEAR_APP返回的查询DataRow创建一个FITWEAR_APPEntity对象
         * @param FITWEAR_APP row
         * @returnFITWEAR_APPList对象
        * @throws Exception 
         */
		public List< fitwear_app_Dao> get_fitwear_app_All() throws Exception;
		    /**
         * 根据FITWEAR_APP返回的查询DataRow创建一个FITWEAR_APPEntity对象
         * @param FITWEAR_APP row
         * @returnFITWEAR_APPList对象
        * @throws Exception 
         */
		public List<fitwear_app_Dao> get_fitwear_app_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<fitwear_app_Dao> get_fitwear_app_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据FITWEAR_APP返回的查询DataRow创建一个FITWEAR_APPEntity对象
         * @param FITWEAR_APP row
         * @returnFITWEAR_APPDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, fitwear_app_Dao> get_fitwear_app_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新FITWEAR_APP字段加一
         * @param FieldName
         * @param sid
         */
	public int create_fitwear_app_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新FITWEAR_APPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_fitwear_app_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新FITWEAR_APPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_fitwear_app_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
