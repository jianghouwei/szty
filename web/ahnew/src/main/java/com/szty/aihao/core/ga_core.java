/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGa.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.ga_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GA数据接口
    *@作者：宋春林 
    */

	public interface ga_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param GA实体
         * @return 新插入记录的编号
         */
		public int insert_ga(ga_Dao _GAModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param GAprrameter
         * @return 新插入记录的编号
         */
         public int insert_ga(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param GA实体
         * @return 影响的行数
         */
		public int update_ga(ga_Dao _GAModel) throws Exception;
		

         /**
         *  删除数据表GA中的一条记录
         * @param GA实体
         * @return 新插入记录的编号
         */
		public int delete_ga(int _id) throws Exception;
		
          /**
         * 得到 ga 数据实体
         * @param Id">Id
         * @return<ga 数据实体
        * @throws Exception 
         */
		public ga_Dao get_gaDao(int _id) throws Exception;
		
		
		    /**
         * 根据GA返回的查询DataRow创建一个GAEntity对象
         * @param GA row
         * @returnGAList对象
        * @throws Exception 
         */
		public List< ga_Dao> get_ga_All() throws Exception;
		    /**
         * 根据GA返回的查询DataRow创建一个GAEntity对象
         * @param GA row
         * @returnGAList对象
        * @throws Exception 
         */
		public List<ga_Dao> get_ga_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<ga_Dao> get_ga_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据GA返回的查询DataRow创建一个GAEntity对象
         * @param GA row
         * @returnGADictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, ga_Dao> get_ga_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新GA字段加一
         * @param FieldName
         * @param sid
         */
	public int create_ga_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新GAInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_ga_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新GAIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_ga_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
