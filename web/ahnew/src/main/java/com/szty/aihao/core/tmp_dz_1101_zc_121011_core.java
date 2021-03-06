﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTmp_dz_1101_zc_121011.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.tmp_dz_1101_zc_121011_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TMP_DZ_1101_ZC_121011数据接口
    *@作者：宋春林 
    */

	public interface tmp_dz_1101_zc_121011_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_1101_ZC_121011实体
         * @return 新插入记录的编号
         */
		public int insert_tmp_dz_1101_zc_121011(tmp_dz_1101_zc_121011_Dao _TMP_DZ_1101_ZC_121011Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_1101_ZC_121011prrameter
         * @return 新插入记录的编号
         */
         public int insert_tmp_dz_1101_zc_121011(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_1101_ZC_121011实体
         * @return 影响的行数
         */
		public int update_tmp_dz_1101_zc_121011(tmp_dz_1101_zc_121011_Dao _TMP_DZ_1101_ZC_121011Model) throws Exception;
		

         /**
         *  删除数据表TMP_DZ_1101_ZC_121011中的一条记录
         * @param TMP_DZ_1101_ZC_121011实体
         * @return 新插入记录的编号
         */
		public int delete_tmp_dz_1101_zc_121011(int _p1) throws Exception;
		
          /**
         * 得到 tmp_dz_1101_zc_121011 数据实体
         * @param P1">P1
         * @return<tmp_dz_1101_zc_121011 数据实体
        * @throws Exception 
         */
		public tmp_dz_1101_zc_121011_Dao get_tmp_dz_1101_zc_121011Dao(int _p1) throws Exception;
		
		
		    /**
         * 根据TMP_DZ_1101_ZC_121011返回的查询DataRow创建一个TMP_DZ_1101_ZC_121011Entity对象
         * @param TMP_DZ_1101_ZC_121011 row
         * @returnTMP_DZ_1101_ZC_121011List对象
        * @throws Exception 
         */
		public List< tmp_dz_1101_zc_121011_Dao> get_tmp_dz_1101_zc_121011_All() throws Exception;
		    /**
         * 根据TMP_DZ_1101_ZC_121011返回的查询DataRow创建一个TMP_DZ_1101_ZC_121011Entity对象
         * @param TMP_DZ_1101_ZC_121011 row
         * @returnTMP_DZ_1101_ZC_121011List对象
        * @throws Exception 
         */
		public List<tmp_dz_1101_zc_121011_Dao> get_tmp_dz_1101_zc_121011_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tmp_dz_1101_zc_121011_Dao> get_tmp_dz_1101_zc_121011_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TMP_DZ_1101_ZC_121011返回的查询DataRow创建一个TMP_DZ_1101_ZC_121011Entity对象
         * @param TMP_DZ_1101_ZC_121011 row
         * @returnTMP_DZ_1101_ZC_121011Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, tmp_dz_1101_zc_121011_Dao> get_tmp_dz_1101_zc_121011_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TMP_DZ_1101_ZC_121011字段加一
         * @param FieldName
         * @param sid
         */
	public int create_tmp_dz_1101_zc_121011_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TMP_DZ_1101_ZC_121011Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_tmp_dz_1101_zc_121011_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TMP_DZ_1101_ZC_121011IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_tmp_dz_1101_zc_121011_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
