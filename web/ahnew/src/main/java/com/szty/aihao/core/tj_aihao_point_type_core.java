/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTj_aihao_point_type.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.tj_aihao_point_type_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TJ_AIHAO_POINT_TYPE数据接口
    *@作者：宋春林 
    */

	public interface tj_aihao_point_type_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_POINT_TYPE实体
         * @return 新插入记录的编号
         */
		public int insert_tj_aihao_point_type(tj_aihao_point_type_Dao _TJ_AIHAO_POINT_TYPEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_POINT_TYPEprrameter
         * @return 新插入记录的编号
         */
         public int insert_tj_aihao_point_type(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_POINT_TYPE实体
         * @return 影响的行数
         */
		public int update_tj_aihao_point_type(tj_aihao_point_type_Dao _TJ_AIHAO_POINT_TYPEModel) throws Exception;
		

         /**
         *  删除数据表TJ_AIHAO_POINT_TYPE中的一条记录
         * @param TJ_AIHAO_POINT_TYPE实体
         * @return 新插入记录的编号
         */
		public int delete_tj_aihao_point_type(int _pointid) throws Exception;
		
          /**
         * 得到 tj_aihao_point_type 数据实体
         * @param Pointid">Pointid
         * @return<tj_aihao_point_type 数据实体
        * @throws Exception 
         */
		public tj_aihao_point_type_Dao get_tj_aihao_point_typeDao(int _pointid) throws Exception;
		
		
		    /**
         * 根据TJ_AIHAO_POINT_TYPE返回的查询DataRow创建一个TJ_AIHAO_POINT_TYPEEntity对象
         * @param TJ_AIHAO_POINT_TYPE row
         * @returnTJ_AIHAO_POINT_TYPEList对象
        * @throws Exception 
         */
		public List< tj_aihao_point_type_Dao> get_tj_aihao_point_type_All() throws Exception;
		    /**
         * 根据TJ_AIHAO_POINT_TYPE返回的查询DataRow创建一个TJ_AIHAO_POINT_TYPEEntity对象
         * @param TJ_AIHAO_POINT_TYPE row
         * @returnTJ_AIHAO_POINT_TYPEList对象
        * @throws Exception 
         */
		public List<tj_aihao_point_type_Dao> get_tj_aihao_point_type_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tj_aihao_point_type_Dao> get_tj_aihao_point_type_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TJ_AIHAO_POINT_TYPE返回的查询DataRow创建一个TJ_AIHAO_POINT_TYPEEntity对象
         * @param TJ_AIHAO_POINT_TYPE row
         * @returnTJ_AIHAO_POINT_TYPEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, tj_aihao_point_type_Dao> get_tj_aihao_point_type_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TJ_AIHAO_POINT_TYPE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_tj_aihao_point_type_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TJ_AIHAO_POINT_TYPEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_tj_aihao_point_type_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TJ_AIHAO_POINT_TYPEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_tj_aihao_point_type_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
