/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTj_aihao_stat_tmp1.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.tj_aihao_stat_tmp1_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TJ_AIHAO_STAT_TMP1数据接口
    *@作者：宋春林 
    */

	public interface tj_aihao_stat_tmp1_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_TMP1实体
         * @return 新插入记录的编号
         */
		public int insert_tj_aihao_stat_tmp1(tj_aihao_stat_tmp1_Dao _TJ_AIHAO_STAT_TMP1Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_TMP1prrameter
         * @return 新插入记录的编号
         */
         public int insert_tj_aihao_stat_tmp1(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_TMP1实体
         * @return 影响的行数
         */
		public int update_tj_aihao_stat_tmp1(tj_aihao_stat_tmp1_Dao _TJ_AIHAO_STAT_TMP1Model) throws Exception;
		

         /**
         *  删除数据表TJ_AIHAO_STAT_TMP1中的一条记录
         * @param TJ_AIHAO_STAT_TMP1实体
         * @return 新插入记录的编号
         */
		public int delete_tj_aihao_stat_tmp1(int _cdate) throws Exception;
		
          /**
         * 得到 tj_aihao_stat_tmp1 数据实体
         * @param Cdate">Cdate
         * @return<tj_aihao_stat_tmp1 数据实体
        * @throws Exception 
         */
		public tj_aihao_stat_tmp1_Dao get_tj_aihao_stat_tmp1Dao(int _cdate) throws Exception;
		
		
		    /**
         * 根据TJ_AIHAO_STAT_TMP1返回的查询DataRow创建一个TJ_AIHAO_STAT_TMP1Entity对象
         * @param TJ_AIHAO_STAT_TMP1 row
         * @returnTJ_AIHAO_STAT_TMP1List对象
        * @throws Exception 
         */
		public List< tj_aihao_stat_tmp1_Dao> get_tj_aihao_stat_tmp1_All() throws Exception;
		    /**
         * 根据TJ_AIHAO_STAT_TMP1返回的查询DataRow创建一个TJ_AIHAO_STAT_TMP1Entity对象
         * @param TJ_AIHAO_STAT_TMP1 row
         * @returnTJ_AIHAO_STAT_TMP1List对象
        * @throws Exception 
         */
		public List<tj_aihao_stat_tmp1_Dao> get_tj_aihao_stat_tmp1_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tj_aihao_stat_tmp1_Dao> get_tj_aihao_stat_tmp1_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TJ_AIHAO_STAT_TMP1返回的查询DataRow创建一个TJ_AIHAO_STAT_TMP1Entity对象
         * @param TJ_AIHAO_STAT_TMP1 row
         * @returnTJ_AIHAO_STAT_TMP1Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, tj_aihao_stat_tmp1_Dao> get_tj_aihao_stat_tmp1_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TJ_AIHAO_STAT_TMP1字段加一
         * @param FieldName
         * @param sid
         */
	public int create_tj_aihao_stat_tmp1_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TJ_AIHAO_STAT_TMP1Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_tj_aihao_stat_tmp1_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TJ_AIHAO_STAT_TMP1IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_tj_aihao_stat_tmp1_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
