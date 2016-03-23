/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsmsreport.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumsmsreport_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSMSREPORT数据接口
    *@作者：宋春林 
    */

	public interface mvnforumsmsreport_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSREPORT实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsmsreport(mvnforumsmsreport_Dao _MVNFORUMSMSREPORTModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSREPORTprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsmsreport(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSREPORT实体
         * @return 影响的行数
         */
		public int update_mvnforumsmsreport(mvnforumsmsreport_Dao _MVNFORUMSMSREPORTModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMSMSREPORT中的一条记录
         * @param MVNFORUMSMSREPORT实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsmsreport(int _reportid) throws Exception;
		
          /**
         * 得到 mvnforumsmsreport 数据实体
         * @param Reportid">Reportid
         * @return<mvnforumsmsreport 数据实体
        * @throws Exception 
         */
		public mvnforumsmsreport_Dao get_mvnforumsmsreportDao(int _reportid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
         * @param MVNFORUMSMSREPORT row
         * @returnMVNFORUMSMSREPORTList对象
        * @throws Exception 
         */
		public List< mvnforumsmsreport_Dao> get_mvnforumsmsreport_All() throws Exception;
		    /**
         * 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
         * @param MVNFORUMSMSREPORT row
         * @returnMVNFORUMSMSREPORTList对象
        * @throws Exception 
         */
		public List<mvnforumsmsreport_Dao> get_mvnforumsmsreport_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsmsreport_Dao> get_mvnforumsmsreport_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
         * @param MVNFORUMSMSREPORT row
         * @returnMVNFORUMSMSREPORTDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumsmsreport_Dao> get_mvnforumsmsreport_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMSMSREPORT字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumsmsreport_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMSMSREPORTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumsmsreport_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMSMSREPORTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumsmsreport_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
