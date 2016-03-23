/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoinstallinfo.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoinstallinfo_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOINSTALLINFO数据接口
    *@作者：宋春林 
    */

	public interface aihaoinstallinfo_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOINSTALLINFO实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoinstallinfo(aihaoinstallinfo_Dao _AIHAOINSTALLINFOModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOINSTALLINFOprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoinstallinfo(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOINSTALLINFO实体
         * @return 影响的行数
         */
		public int update_aihaoinstallinfo(aihaoinstallinfo_Dao _AIHAOINSTALLINFOModel) throws Exception;
		

         /**
         *  删除数据表AIHAOINSTALLINFO中的一条记录
         * @param AIHAOINSTALLINFO实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoinstallinfo(int _id) throws Exception;
		
          /**
         * 得到 aihaoinstallinfo 数据实体
         * @param Id">Id
         * @return<aihaoinstallinfo 数据实体
        * @throws Exception 
         */
		public aihaoinstallinfo_Dao get_aihaoinstallinfoDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
         * @param AIHAOINSTALLINFO row
         * @returnAIHAOINSTALLINFOList对象
        * @throws Exception 
         */
		public List< aihaoinstallinfo_Dao> get_aihaoinstallinfo_All() throws Exception;
		    /**
         * 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
         * @param AIHAOINSTALLINFO row
         * @returnAIHAOINSTALLINFOList对象
        * @throws Exception 
         */
		public List<aihaoinstallinfo_Dao> get_aihaoinstallinfo_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoinstallinfo_Dao> get_aihaoinstallinfo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
         * @param AIHAOINSTALLINFO row
         * @returnAIHAOINSTALLINFODictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoinstallinfo_Dao> get_aihaoinstallinfo_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOINSTALLINFO字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoinstallinfo_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOINSTALLINFOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoinstallinfo_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOINSTALLINFOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoinstallinfo_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
