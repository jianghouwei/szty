﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_user_chan.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.t_user_chan_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_USER_CHAN数据接口
    *@作者：宋春林 
    */

	public interface t_user_chan_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_USER_CHAN实体
         * @return 新插入记录的编号
         */
		public int insert_t_user_chan(t_user_chan_Dao _T_USER_CHANModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_USER_CHANprrameter
         * @return 新插入记录的编号
         */
         public int insert_t_user_chan(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param T_USER_CHAN实体
         * @return 影响的行数
         */
		public int update_t_user_chan(t_user_chan_Dao _T_USER_CHANModel) throws Exception;
		

         /**
         *  删除数据表T_USER_CHAN中的一条记录
         * @param T_USER_CHAN实体
         * @return 新插入记录的编号
         */
		public int delete_t_user_chan(int _uname) throws Exception;
		
          /**
         * 得到 t_user_chan 数据实体
         * @param Uname">Uname
         * @return<t_user_chan 数据实体
        * @throws Exception 
         */
		public t_user_chan_Dao get_t_user_chanDao(int _uname) throws Exception;
		
		
		    /**
         * 根据T_USER_CHAN返回的查询DataRow创建一个T_USER_CHANEntity对象
         * @param T_USER_CHAN row
         * @returnT_USER_CHANList对象
        * @throws Exception 
         */
		public List< t_user_chan_Dao> get_t_user_chan_All() throws Exception;
		    /**
         * 根据T_USER_CHAN返回的查询DataRow创建一个T_USER_CHANEntity对象
         * @param T_USER_CHAN row
         * @returnT_USER_CHANList对象
        * @throws Exception 
         */
		public List<t_user_chan_Dao> get_t_user_chan_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_user_chan_Dao> get_t_user_chan_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据T_USER_CHAN返回的查询DataRow创建一个T_USER_CHANEntity对象
         * @param T_USER_CHAN row
         * @returnT_USER_CHANDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, t_user_chan_Dao> get_t_user_chan_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新T_USER_CHAN字段加一
         * @param FieldName
         * @param sid
         */
	public int create_t_user_chan_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新T_USER_CHANInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_t_user_chan_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新T_USER_CHANIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_t_user_chan_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
