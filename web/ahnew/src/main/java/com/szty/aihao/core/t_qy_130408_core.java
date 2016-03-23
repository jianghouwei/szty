/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_qy_130408.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.t_qy_130408_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_QY_130408数据接口
    *@作者：宋春林 
    */

	public interface t_qy_130408_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130408实体
         * @return 新插入记录的编号
         */
		public int insert_t_qy_130408(t_qy_130408_Dao _T_QY_130408Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130408prrameter
         * @return 新插入记录的编号
         */
         public int insert_t_qy_130408(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130408实体
         * @return 影响的行数
         */
		public int update_t_qy_130408(t_qy_130408_Dao _T_QY_130408Model) throws Exception;
		

         /**
         *  删除数据表T_QY_130408中的一条记录
         * @param T_QY_130408实体
         * @return 新插入记录的编号
         */
		public int delete_t_qy_130408(int _pcontent) throws Exception;
		
          /**
         * 得到 t_qy_130408 数据实体
         * @param Pcontent">Pcontent
         * @return<t_qy_130408 数据实体
        * @throws Exception 
         */
		public t_qy_130408_Dao get_t_qy_130408Dao(int _pcontent) throws Exception;
		
		
		    /**
         * 根据T_QY_130408返回的查询DataRow创建一个T_QY_130408Entity对象
         * @param T_QY_130408 row
         * @returnT_QY_130408List对象
        * @throws Exception 
         */
		public List< t_qy_130408_Dao> get_t_qy_130408_All() throws Exception;
		    /**
         * 根据T_QY_130408返回的查询DataRow创建一个T_QY_130408Entity对象
         * @param T_QY_130408 row
         * @returnT_QY_130408List对象
        * @throws Exception 
         */
		public List<t_qy_130408_Dao> get_t_qy_130408_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_qy_130408_Dao> get_t_qy_130408_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据T_QY_130408返回的查询DataRow创建一个T_QY_130408Entity对象
         * @param T_QY_130408 row
         * @returnT_QY_130408Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, t_qy_130408_Dao> get_t_qy_130408_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新T_QY_130408字段加一
         * @param FieldName
         * @param sid
         */
	public int create_t_qy_130408_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新T_QY_130408Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_t_qy_130408_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新T_QY_130408IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_t_qy_130408_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
