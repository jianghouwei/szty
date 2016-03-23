/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGuanjian.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.guanjian_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GUANJIAN数据接口
    *@作者：宋春林 
    */

	public interface guanjian_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param GUANJIAN实体
         * @return 新插入记录的编号
         */
		public int insert_guanjian(guanjian_Dao _GUANJIANModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param GUANJIANprrameter
         * @return 新插入记录的编号
         */
         public int insert_guanjian(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param GUANJIAN实体
         * @return 影响的行数
         */
		public int update_guanjian(guanjian_Dao _GUANJIANModel) throws Exception;
		

         /**
         *  删除数据表GUANJIAN中的一条记录
         * @param GUANJIAN实体
         * @return 新插入记录的编号
         */
		public int delete_guanjian(int _gjname) throws Exception;
		
          /**
         * 得到 guanjian 数据实体
         * @param Gjname">Gjname
         * @return<guanjian 数据实体
        * @throws Exception 
         */
		public guanjian_Dao get_guanjianDao(int _gjname) throws Exception;
		
		
		    /**
         * 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
         * @param GUANJIAN row
         * @returnGUANJIANList对象
        * @throws Exception 
         */
		public List< guanjian_Dao> get_guanjian_All() throws Exception;
		    /**
         * 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
         * @param GUANJIAN row
         * @returnGUANJIANList对象
        * @throws Exception 
         */
		public List<guanjian_Dao> get_guanjian_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<guanjian_Dao> get_guanjian_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
         * @param GUANJIAN row
         * @returnGUANJIANDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, guanjian_Dao> get_guanjian_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新GUANJIAN字段加一
         * @param FieldName
         * @param sid
         */
	public int create_guanjian_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新GUANJIANInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_guanjian_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新GUANJIANIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_guanjian_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
