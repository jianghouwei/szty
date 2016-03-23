/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_ptype_info.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.t_ptype_info_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_PTYPE_INFO数据接口
    *@作者：宋春林 
    */

	public interface t_ptype_info_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_PTYPE_INFO实体
         * @return 新插入记录的编号
         */
		public int insert_t_ptype_info(t_ptype_info_Dao _T_PTYPE_INFOModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_PTYPE_INFOprrameter
         * @return 新插入记录的编号
         */
         public int insert_t_ptype_info(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param T_PTYPE_INFO实体
         * @return 影响的行数
         */
		public int update_t_ptype_info(t_ptype_info_Dao _T_PTYPE_INFOModel) throws Exception;
		

         /**
         *  删除数据表T_PTYPE_INFO中的一条记录
         * @param T_PTYPE_INFO实体
         * @return 新插入记录的编号
         */
		public int delete_t_ptype_info(int _pid) throws Exception;
		
          /**
         * 得到 t_ptype_info 数据实体
         * @param Pid">Pid
         * @return<t_ptype_info 数据实体
        * @throws Exception 
         */
		public t_ptype_info_Dao get_t_ptype_infoDao(int _pid) throws Exception;
		
		
		    /**
         * 根据T_PTYPE_INFO返回的查询DataRow创建一个T_PTYPE_INFOEntity对象
         * @param T_PTYPE_INFO row
         * @returnT_PTYPE_INFOList对象
        * @throws Exception 
         */
		public List< t_ptype_info_Dao> get_t_ptype_info_All() throws Exception;
		    /**
         * 根据T_PTYPE_INFO返回的查询DataRow创建一个T_PTYPE_INFOEntity对象
         * @param T_PTYPE_INFO row
         * @returnT_PTYPE_INFOList对象
        * @throws Exception 
         */
		public List<t_ptype_info_Dao> get_t_ptype_info_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_ptype_info_Dao> get_t_ptype_info_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据T_PTYPE_INFO返回的查询DataRow创建一个T_PTYPE_INFOEntity对象
         * @param T_PTYPE_INFO row
         * @returnT_PTYPE_INFODictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, t_ptype_info_Dao> get_t_ptype_info_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新T_PTYPE_INFO字段加一
         * @param FieldName
         * @param sid
         */
	public int create_t_ptype_info_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新T_PTYPE_INFOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_t_ptype_info_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新T_PTYPE_INFOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_t_ptype_info_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
