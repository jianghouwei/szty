/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTj_aihao_stat_tmp.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.tj_aihao_stat_tmp_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TJ_AIHAO_STAT_TMP数据接口
    *@作者：宋春林 
    */

	public interface tj_aihao_stat_tmp_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_TMP实体
         * @return 新插入记录的编号
         */
		public int insert_tj_aihao_stat_tmp(tj_aihao_stat_tmp_Dao _TJ_AIHAO_STAT_TMPModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_TMPprrameter
         * @return 新插入记录的编号
         */
         public int insert_tj_aihao_stat_tmp(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_TMP实体
         * @return 影响的行数
         */
		public int update_tj_aihao_stat_tmp(tj_aihao_stat_tmp_Dao _TJ_AIHAO_STAT_TMPModel) throws Exception;
		

         /**
         *  删除数据表TJ_AIHAO_STAT_TMP中的一条记录
         * @param TJ_AIHAO_STAT_TMP实体
         * @return 新插入记录的编号
         */
		public int delete_tj_aihao_stat_tmp(int _cdate) throws Exception;
		
          /**
         * 得到 tj_aihao_stat_tmp 数据实体
         * @param Cdate">Cdate
         * @return<tj_aihao_stat_tmp 数据实体
        * @throws Exception 
         */
		public tj_aihao_stat_tmp_Dao get_tj_aihao_stat_tmpDao(int _cdate) throws Exception;
		
		
		    /**
         * 根据TJ_AIHAO_STAT_TMP返回的查询DataRow创建一个TJ_AIHAO_STAT_TMPEntity对象
         * @param TJ_AIHAO_STAT_TMP row
         * @returnTJ_AIHAO_STAT_TMPList对象
        * @throws Exception 
         */
		public List< tj_aihao_stat_tmp_Dao> get_tj_aihao_stat_tmp_All() throws Exception;
		    /**
         * 根据TJ_AIHAO_STAT_TMP返回的查询DataRow创建一个TJ_AIHAO_STAT_TMPEntity对象
         * @param TJ_AIHAO_STAT_TMP row
         * @returnTJ_AIHAO_STAT_TMPList对象
        * @throws Exception 
         */
		public List<tj_aihao_stat_tmp_Dao> get_tj_aihao_stat_tmp_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tj_aihao_stat_tmp_Dao> get_tj_aihao_stat_tmp_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TJ_AIHAO_STAT_TMP返回的查询DataRow创建一个TJ_AIHAO_STAT_TMPEntity对象
         * @param TJ_AIHAO_STAT_TMP row
         * @returnTJ_AIHAO_STAT_TMPDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, tj_aihao_stat_tmp_Dao> get_tj_aihao_stat_tmp_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TJ_AIHAO_STAT_TMP字段加一
         * @param FieldName
         * @param sid
         */
	public int create_tj_aihao_stat_tmp_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TJ_AIHAO_STAT_TMPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_tj_aihao_stat_tmp_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TJ_AIHAO_STAT_TMPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_tj_aihao_stat_tmp_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
