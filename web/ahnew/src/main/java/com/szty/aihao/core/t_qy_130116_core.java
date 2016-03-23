/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_qy_130116.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.t_qy_130116_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_QY_130116数据接口
    *@作者：宋春林 
    */

	public interface t_qy_130116_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130116实体
         * @return 新插入记录的编号
         */
		public int insert_t_qy_130116(t_qy_130116_Dao _T_QY_130116Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130116prrameter
         * @return 新插入记录的编号
         */
         public int insert_t_qy_130116(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130116实体
         * @return 影响的行数
         */
		public int update_t_qy_130116(t_qy_130116_Dao _T_QY_130116Model) throws Exception;
		

         /**
         *  删除数据表T_QY_130116中的一条记录
         * @param T_QY_130116实体
         * @return 新插入记录的编号
         */
		public int delete_t_qy_130116(int _pcontent) throws Exception;
		
          /**
         * 得到 t_qy_130116 数据实体
         * @param Pcontent">Pcontent
         * @return<t_qy_130116 数据实体
        * @throws Exception 
         */
		public t_qy_130116_Dao get_t_qy_130116Dao(int _pcontent) throws Exception;
		
		
		    /**
         * 根据T_QY_130116返回的查询DataRow创建一个T_QY_130116Entity对象
         * @param T_QY_130116 row
         * @returnT_QY_130116List对象
        * @throws Exception 
         */
		public List< t_qy_130116_Dao> get_t_qy_130116_All() throws Exception;
		    /**
         * 根据T_QY_130116返回的查询DataRow创建一个T_QY_130116Entity对象
         * @param T_QY_130116 row
         * @returnT_QY_130116List对象
        * @throws Exception 
         */
		public List<t_qy_130116_Dao> get_t_qy_130116_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_qy_130116_Dao> get_t_qy_130116_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据T_QY_130116返回的查询DataRow创建一个T_QY_130116Entity对象
         * @param T_QY_130116 row
         * @returnT_QY_130116Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, t_qy_130116_Dao> get_t_qy_130116_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新T_QY_130116字段加一
         * @param FieldName
         * @param sid
         */
	public int create_t_qy_130116_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新T_QY_130116Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_t_qy_130116_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新T_QY_130116IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_t_qy_130116_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
