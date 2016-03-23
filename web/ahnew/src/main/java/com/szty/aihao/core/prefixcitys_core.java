/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataPrefixcitys.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.prefixcitys_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@PREFIXCITYS数据接口
    *@作者：宋春林 
    */

	public interface prefixcitys_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param PREFIXCITYS实体
         * @return 新插入记录的编号
         */
		public int insert_prefixcitys(prefixcitys_Dao _PREFIXCITYSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param PREFIXCITYSprrameter
         * @return 新插入记录的编号
         */
         public int insert_prefixcitys(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param PREFIXCITYS实体
         * @return 影响的行数
         */
		public int update_prefixcitys(prefixcitys_Dao _PREFIXCITYSModel) throws Exception;
		

         /**
         *  删除数据表PREFIXCITYS中的一条记录
         * @param PREFIXCITYS实体
         * @return 新插入记录的编号
         */
		public int delete_prefixcitys(int _prefix) throws Exception;
		
          /**
         * 得到 prefixcitys 数据实体
         * @param Prefix">Prefix
         * @return<prefixcitys 数据实体
        * @throws Exception 
         */
		public prefixcitys_Dao get_prefixcitysDao(int _prefix) throws Exception;
		
		
		    /**
         * 根据PREFIXCITYS返回的查询DataRow创建一个PREFIXCITYSEntity对象
         * @param PREFIXCITYS row
         * @returnPREFIXCITYSList对象
        * @throws Exception 
         */
		public List< prefixcitys_Dao> get_prefixcitys_All() throws Exception;
		    /**
         * 根据PREFIXCITYS返回的查询DataRow创建一个PREFIXCITYSEntity对象
         * @param PREFIXCITYS row
         * @returnPREFIXCITYSList对象
        * @throws Exception 
         */
		public List<prefixcitys_Dao> get_prefixcitys_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<prefixcitys_Dao> get_prefixcitys_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据PREFIXCITYS返回的查询DataRow创建一个PREFIXCITYSEntity对象
         * @param PREFIXCITYS row
         * @returnPREFIXCITYSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, prefixcitys_Dao> get_prefixcitys_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新PREFIXCITYS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_prefixcitys_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新PREFIXCITYSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_prefixcitys_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新PREFIXCITYSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_prefixcitys_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
