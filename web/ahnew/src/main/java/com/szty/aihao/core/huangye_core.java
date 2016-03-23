/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataHuangye.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.huangye_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@HUANGYE数据接口
    *@作者：宋春林 
    */

	public interface huangye_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param HUANGYE实体
         * @return 新插入记录的编号
         */
		public int insert_huangye(huangye_Dao _HUANGYEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param HUANGYEprrameter
         * @return 新插入记录的编号
         */
         public int insert_huangye(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param HUANGYE实体
         * @return 影响的行数
         */
		public int update_huangye(huangye_Dao _HUANGYEModel) throws Exception;
		

         /**
         *  删除数据表HUANGYE中的一条记录
         * @param HUANGYE实体
         * @return 新插入记录的编号
         */
		public int delete_huangye(int _merid) throws Exception;
		
          /**
         * 得到 huangye 数据实体
         * @param Merid">Merid
         * @return<huangye 数据实体
        * @throws Exception 
         */
		public huangye_Dao get_huangyeDao(int _merid) throws Exception;
		
		
		    /**
         * 根据HUANGYE返回的查询DataRow创建一个HUANGYEEntity对象
         * @param HUANGYE row
         * @returnHUANGYEList对象
        * @throws Exception 
         */
		public List< huangye_Dao> get_huangye_All() throws Exception;
		    /**
         * 根据HUANGYE返回的查询DataRow创建一个HUANGYEEntity对象
         * @param HUANGYE row
         * @returnHUANGYEList对象
        * @throws Exception 
         */
		public List<huangye_Dao> get_huangye_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<huangye_Dao> get_huangye_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据HUANGYE返回的查询DataRow创建一个HUANGYEEntity对象
         * @param HUANGYE row
         * @returnHUANGYEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, huangye_Dao> get_huangye_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新HUANGYE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_huangye_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新HUANGYEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_huangye_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新HUANGYEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_huangye_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
