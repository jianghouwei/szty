/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataDdinput.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.ddinput_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@DDINPUT数据接口
    *@作者：宋春林 
    */

	public interface ddinput_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param DDINPUT实体
         * @return 新插入记录的编号
         */
		public int insert_ddinput(ddinput_Dao _DDINPUTModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param DDINPUTprrameter
         * @return 新插入记录的编号
         */
         public int insert_ddinput(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param DDINPUT实体
         * @return 影响的行数
         */
		public int update_ddinput(ddinput_Dao _DDINPUTModel) throws Exception;
		

         /**
         *  删除数据表DDINPUT中的一条记录
         * @param DDINPUT实体
         * @return 新插入记录的编号
         */
		public int delete_ddinput(int _ddcity) throws Exception;
		
          /**
         * 得到 ddinput 数据实体
         * @param Ddcity">Ddcity
         * @return<ddinput 数据实体
        * @throws Exception 
         */
		public ddinput_Dao get_ddinputDao(int _ddcity) throws Exception;
		
		
		    /**
         * 根据DDINPUT返回的查询DataRow创建一个DDINPUTEntity对象
         * @param DDINPUT row
         * @returnDDINPUTList对象
        * @throws Exception 
         */
		public List< ddinput_Dao> get_ddinput_All() throws Exception;
		    /**
         * 根据DDINPUT返回的查询DataRow创建一个DDINPUTEntity对象
         * @param DDINPUT row
         * @returnDDINPUTList对象
        * @throws Exception 
         */
		public List<ddinput_Dao> get_ddinput_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<ddinput_Dao> get_ddinput_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据DDINPUT返回的查询DataRow创建一个DDINPUTEntity对象
         * @param DDINPUT row
         * @returnDDINPUTDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, ddinput_Dao> get_ddinput_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新DDINPUT字段加一
         * @param FieldName
         * @param sid
         */
	public int create_ddinput_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新DDINPUTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_ddinput_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新DDINPUTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_ddinput_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
