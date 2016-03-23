/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSzty_emp_pur.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.szty_emp_pur_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTY_EMP_PUR数据接口
    *@作者：宋春林 
    */

	public interface szty_emp_pur_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTY_EMP_PUR实体
         * @return 新插入记录的编号
         */
		public int insert_szty_emp_pur(szty_emp_pur_Dao _SZTY_EMP_PURModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTY_EMP_PURprrameter
         * @return 新插入记录的编号
         */
         public int insert_szty_emp_pur(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTY_EMP_PUR实体
         * @return 影响的行数
         */
		public int update_szty_emp_pur(szty_emp_pur_Dao _SZTY_EMP_PURModel) throws Exception;
		

         /**
         *  删除数据表SZTY_EMP_PUR中的一条记录
         * @param SZTY_EMP_PUR实体
         * @return 新插入记录的编号
         */
		public int delete_szty_emp_pur(int _eid) throws Exception;
		
          /**
         * 得到 szty_emp_pur 数据实体
         * @param Eid">Eid
         * @return<szty_emp_pur 数据实体
        * @throws Exception 
         */
		public szty_emp_pur_Dao get_szty_emp_purDao(int _eid) throws Exception;
		
		
		    /**
         * 根据SZTY_EMP_PUR返回的查询DataRow创建一个SZTY_EMP_PUREntity对象
         * @param SZTY_EMP_PUR row
         * @returnSZTY_EMP_PURList对象
        * @throws Exception 
         */
		public List< szty_emp_pur_Dao> get_szty_emp_pur_All() throws Exception;
		    /**
         * 根据SZTY_EMP_PUR返回的查询DataRow创建一个SZTY_EMP_PUREntity对象
         * @param SZTY_EMP_PUR row
         * @returnSZTY_EMP_PURList对象
        * @throws Exception 
         */
		public List<szty_emp_pur_Dao> get_szty_emp_pur_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<szty_emp_pur_Dao> get_szty_emp_pur_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据SZTY_EMP_PUR返回的查询DataRow创建一个SZTY_EMP_PUREntity对象
         * @param SZTY_EMP_PUR row
         * @returnSZTY_EMP_PURDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, szty_emp_pur_Dao> get_szty_emp_pur_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新SZTY_EMP_PUR字段加一
         * @param FieldName
         * @param sid
         */
	public int create_szty_emp_pur_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新SZTY_EMP_PURInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_szty_emp_pur_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新SZTY_EMP_PURIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_szty_emp_pur_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
