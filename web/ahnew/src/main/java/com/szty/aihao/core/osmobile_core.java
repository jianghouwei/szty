/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataOsmobile.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.osmobile_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@OSMOBILE数据接口
    *@作者：宋春林 
    */

	public interface osmobile_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param OSMOBILE实体
         * @return 新插入记录的编号
         */
		public int insert_osmobile(osmobile_Dao _OSMOBILEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param OSMOBILEprrameter
         * @return 新插入记录的编号
         */
         public int insert_osmobile(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param OSMOBILE实体
         * @return 影响的行数
         */
		public int update_osmobile(osmobile_Dao _OSMOBILEModel) throws Exception;
		

         /**
         *  删除数据表OSMOBILE中的一条记录
         * @param OSMOBILE实体
         * @return 新插入记录的编号
         */
		public int delete_osmobile(int _osid) throws Exception;
		
          /**
         * 得到 osmobile 数据实体
         * @param Osid">Osid
         * @return<osmobile 数据实体
        * @throws Exception 
         */
		public osmobile_Dao get_osmobileDao(int _osid) throws Exception;
		
		
		    /**
         * 根据OSMOBILE返回的查询DataRow创建一个OSMOBILEEntity对象
         * @param OSMOBILE row
         * @returnOSMOBILEList对象
        * @throws Exception 
         */
		public List< osmobile_Dao> get_osmobile_All() throws Exception;
		    /**
         * 根据OSMOBILE返回的查询DataRow创建一个OSMOBILEEntity对象
         * @param OSMOBILE row
         * @returnOSMOBILEList对象
        * @throws Exception 
         */
		public List<osmobile_Dao> get_osmobile_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<osmobile_Dao> get_osmobile_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据OSMOBILE返回的查询DataRow创建一个OSMOBILEEntity对象
         * @param OSMOBILE row
         * @returnOSMOBILEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, osmobile_Dao> get_osmobile_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新OSMOBILE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_osmobile_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新OSMOBILEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_osmobile_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新OSMOBILEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_osmobile_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
