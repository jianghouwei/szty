/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_menber_exprvalue.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.t_menber_exprvalue_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_MENBER_EXPRVALUE数据接口
    *@作者：宋春林 
    */

	public interface t_menber_exprvalue_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_MENBER_EXPRVALUE实体
         * @return 新插入记录的编号
         */
		public int insert_t_menber_exprvalue(t_menber_exprvalue_Dao _T_MENBER_EXPRVALUEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_MENBER_EXPRVALUEprrameter
         * @return 新插入记录的编号
         */
         public int insert_t_menber_exprvalue(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param T_MENBER_EXPRVALUE实体
         * @return 影响的行数
         */
		public int update_t_menber_exprvalue(t_menber_exprvalue_Dao _T_MENBER_EXPRVALUEModel) throws Exception;
		

         /**
         *  删除数据表T_MENBER_EXPRVALUE中的一条记录
         * @param T_MENBER_EXPRVALUE实体
         * @return 新插入记录的编号
         */
		public int delete_t_menber_exprvalue(int _uniquevalue) throws Exception;
		
          /**
         * 得到 t_menber_exprvalue 数据实体
         * @param Uniquevalue">Uniquevalue
         * @return<t_menber_exprvalue 数据实体
        * @throws Exception 
         */
		public t_menber_exprvalue_Dao get_t_menber_exprvalueDao(int _uniquevalue) throws Exception;
		
		
		    /**
         * 根据T_MENBER_EXPRVALUE返回的查询DataRow创建一个T_MENBER_EXPRVALUEEntity对象
         * @param T_MENBER_EXPRVALUE row
         * @returnT_MENBER_EXPRVALUEList对象
        * @throws Exception 
         */
		public List< t_menber_exprvalue_Dao> get_t_menber_exprvalue_All() throws Exception;
		    /**
         * 根据T_MENBER_EXPRVALUE返回的查询DataRow创建一个T_MENBER_EXPRVALUEEntity对象
         * @param T_MENBER_EXPRVALUE row
         * @returnT_MENBER_EXPRVALUEList对象
        * @throws Exception 
         */
		public List<t_menber_exprvalue_Dao> get_t_menber_exprvalue_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_menber_exprvalue_Dao> get_t_menber_exprvalue_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据T_MENBER_EXPRVALUE返回的查询DataRow创建一个T_MENBER_EXPRVALUEEntity对象
         * @param T_MENBER_EXPRVALUE row
         * @returnT_MENBER_EXPRVALUEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, t_menber_exprvalue_Dao> get_t_menber_exprvalue_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新T_MENBER_EXPRVALUE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_t_menber_exprvalue_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新T_MENBER_EXPRVALUEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_t_menber_exprvalue_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新T_MENBER_EXPRVALUEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_t_menber_exprvalue_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
