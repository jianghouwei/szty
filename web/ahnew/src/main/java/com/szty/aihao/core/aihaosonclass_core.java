/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaosonclass.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaosonclass_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOSONCLASS数据接口
    *@作者：宋春林 
    */

	public interface aihaosonclass_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSONCLASS实体
         * @return 新插入记录的编号
         */
		public int insert_aihaosonclass(aihaosonclass_Dao _AIHAOSONCLASSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSONCLASSprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaosonclass(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSONCLASS实体
         * @return 影响的行数
         */
		public int update_aihaosonclass(aihaosonclass_Dao _AIHAOSONCLASSModel) throws Exception;
		

         /**
         *  删除数据表AIHAOSONCLASS中的一条记录
         * @param AIHAOSONCLASS实体
         * @return 新插入记录的编号
         */
		public int delete_aihaosonclass(int _sonclassid) throws Exception;
		
          /**
         * 得到 aihaosonclass 数据实体
         * @param Sonclassid">Sonclassid
         * @return<aihaosonclass 数据实体
        * @throws Exception 
         */
		public aihaosonclass_Dao get_aihaosonclassDao(int _sonclassid) throws Exception;
		
		
		    /**
         * 根据AIHAOSONCLASS返回的查询DataRow创建一个AIHAOSONCLASSEntity对象
         * @param AIHAOSONCLASS row
         * @returnAIHAOSONCLASSList对象
        * @throws Exception 
         */
		public List< aihaosonclass_Dao> get_aihaosonclass_All() throws Exception;
		    /**
         * 根据AIHAOSONCLASS返回的查询DataRow创建一个AIHAOSONCLASSEntity对象
         * @param AIHAOSONCLASS row
         * @returnAIHAOSONCLASSList对象
        * @throws Exception 
         */
		public List<aihaosonclass_Dao> get_aihaosonclass_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaosonclass_Dao> get_aihaosonclass_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOSONCLASS返回的查询DataRow创建一个AIHAOSONCLASSEntity对象
         * @param AIHAOSONCLASS row
         * @returnAIHAOSONCLASSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaosonclass_Dao> get_aihaosonclass_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOSONCLASS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaosonclass_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOSONCLASSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaosonclass_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOSONCLASSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaosonclass_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
