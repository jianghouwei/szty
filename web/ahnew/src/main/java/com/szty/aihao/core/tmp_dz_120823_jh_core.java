/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTmp_dz_120823_jh.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.tmp_dz_120823_jh_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TMP_DZ_120823_JH数据接口
    *@作者：宋春林 
    */

	public interface tmp_dz_120823_jh_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_120823_JH实体
         * @return 新插入记录的编号
         */
		public int insert_tmp_dz_120823_jh(tmp_dz_120823_jh_Dao _TMP_DZ_120823_JHModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_120823_JHprrameter
         * @return 新插入记录的编号
         */
         public int insert_tmp_dz_120823_jh(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_120823_JH实体
         * @return 影响的行数
         */
		public int update_tmp_dz_120823_jh(tmp_dz_120823_jh_Dao _TMP_DZ_120823_JHModel) throws Exception;
		

         /**
         *  删除数据表TMP_DZ_120823_JH中的一条记录
         * @param TMP_DZ_120823_JH实体
         * @return 新插入记录的编号
         */
		public int delete_tmp_dz_120823_jh(int _p1) throws Exception;
		
          /**
         * 得到 tmp_dz_120823_jh 数据实体
         * @param P1">P1
         * @return<tmp_dz_120823_jh 数据实体
        * @throws Exception 
         */
		public tmp_dz_120823_jh_Dao get_tmp_dz_120823_jhDao(int _p1) throws Exception;
		
		
		    /**
         * 根据TMP_DZ_120823_JH返回的查询DataRow创建一个TMP_DZ_120823_JHEntity对象
         * @param TMP_DZ_120823_JH row
         * @returnTMP_DZ_120823_JHList对象
        * @throws Exception 
         */
		public List< tmp_dz_120823_jh_Dao> get_tmp_dz_120823_jh_All() throws Exception;
		    /**
         * 根据TMP_DZ_120823_JH返回的查询DataRow创建一个TMP_DZ_120823_JHEntity对象
         * @param TMP_DZ_120823_JH row
         * @returnTMP_DZ_120823_JHList对象
        * @throws Exception 
         */
		public List<tmp_dz_120823_jh_Dao> get_tmp_dz_120823_jh_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tmp_dz_120823_jh_Dao> get_tmp_dz_120823_jh_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TMP_DZ_120823_JH返回的查询DataRow创建一个TMP_DZ_120823_JHEntity对象
         * @param TMP_DZ_120823_JH row
         * @returnTMP_DZ_120823_JHDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, tmp_dz_120823_jh_Dao> get_tmp_dz_120823_jh_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TMP_DZ_120823_JH字段加一
         * @param FieldName
         * @param sid
         */
	public int create_tmp_dz_120823_jh_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TMP_DZ_120823_JHInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_tmp_dz_120823_jh_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TMP_DZ_120823_JHIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_tmp_dz_120823_jh_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
