﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTmp_dz_121008_wm_me.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.tmp_dz_121008_wm_me_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TMP_DZ_121008_WM_ME数据接口
    *@作者：宋春林 
    */

	public interface tmp_dz_121008_wm_me_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_121008_WM_ME实体
         * @return 新插入记录的编号
         */
		public int insert_tmp_dz_121008_wm_me(tmp_dz_121008_wm_me_Dao _TMP_DZ_121008_WM_MEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_121008_WM_MEprrameter
         * @return 新插入记录的编号
         */
         public int insert_tmp_dz_121008_wm_me(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_121008_WM_ME实体
         * @return 影响的行数
         */
		public int update_tmp_dz_121008_wm_me(tmp_dz_121008_wm_me_Dao _TMP_DZ_121008_WM_MEModel) throws Exception;
		

         /**
         *  删除数据表TMP_DZ_121008_WM_ME中的一条记录
         * @param TMP_DZ_121008_WM_ME实体
         * @return 新插入记录的编号
         */
		public int delete_tmp_dz_121008_wm_me(int _p1) throws Exception;
		
          /**
         * 得到 tmp_dz_121008_wm_me 数据实体
         * @param P1">P1
         * @return<tmp_dz_121008_wm_me 数据实体
        * @throws Exception 
         */
		public tmp_dz_121008_wm_me_Dao get_tmp_dz_121008_wm_meDao(int _p1) throws Exception;
		
		
		    /**
         * 根据TMP_DZ_121008_WM_ME返回的查询DataRow创建一个TMP_DZ_121008_WM_MEEntity对象
         * @param TMP_DZ_121008_WM_ME row
         * @returnTMP_DZ_121008_WM_MEList对象
        * @throws Exception 
         */
		public List< tmp_dz_121008_wm_me_Dao> get_tmp_dz_121008_wm_me_All() throws Exception;
		    /**
         * 根据TMP_DZ_121008_WM_ME返回的查询DataRow创建一个TMP_DZ_121008_WM_MEEntity对象
         * @param TMP_DZ_121008_WM_ME row
         * @returnTMP_DZ_121008_WM_MEList对象
        * @throws Exception 
         */
		public List<tmp_dz_121008_wm_me_Dao> get_tmp_dz_121008_wm_me_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tmp_dz_121008_wm_me_Dao> get_tmp_dz_121008_wm_me_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TMP_DZ_121008_WM_ME返回的查询DataRow创建一个TMP_DZ_121008_WM_MEEntity对象
         * @param TMP_DZ_121008_WM_ME row
         * @returnTMP_DZ_121008_WM_MEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, tmp_dz_121008_wm_me_Dao> get_tmp_dz_121008_wm_me_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TMP_DZ_121008_WM_ME字段加一
         * @param FieldName
         * @param sid
         */
	public int create_tmp_dz_121008_wm_me_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TMP_DZ_121008_WM_MEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_tmp_dz_121008_wm_me_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TMP_DZ_121008_WM_MEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_tmp_dz_121008_wm_me_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
