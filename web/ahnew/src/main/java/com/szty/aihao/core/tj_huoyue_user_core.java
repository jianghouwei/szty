/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTj_huoyue_user.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.tj_huoyue_user_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TJ_HUOYUE_USER数据接口
    *@作者：宋春林 
    */

	public interface tj_huoyue_user_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TJ_HUOYUE_USER实体
         * @return 新插入记录的编号
         */
		public int insert_tj_huoyue_user(tj_huoyue_user_Dao _TJ_HUOYUE_USERModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TJ_HUOYUE_USERprrameter
         * @return 新插入记录的编号
         */
         public int insert_tj_huoyue_user(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TJ_HUOYUE_USER实体
         * @return 影响的行数
         */
		public int update_tj_huoyue_user(tj_huoyue_user_Dao _TJ_HUOYUE_USERModel) throws Exception;
		

         /**
         *  删除数据表TJ_HUOYUE_USER中的一条记录
         * @param TJ_HUOYUE_USER实体
         * @return 新插入记录的编号
         */
		public int delete_tj_huoyue_user(int _cdate) throws Exception;
		
          /**
         * 得到 tj_huoyue_user 数据实体
         * @param Cdate">Cdate
         * @return<tj_huoyue_user 数据实体
        * @throws Exception 
         */
		public tj_huoyue_user_Dao get_tj_huoyue_userDao(int _cdate) throws Exception;
		
		
		    /**
         * 根据TJ_HUOYUE_USER返回的查询DataRow创建一个TJ_HUOYUE_USEREntity对象
         * @param TJ_HUOYUE_USER row
         * @returnTJ_HUOYUE_USERList对象
        * @throws Exception 
         */
		public List< tj_huoyue_user_Dao> get_tj_huoyue_user_All() throws Exception;
		    /**
         * 根据TJ_HUOYUE_USER返回的查询DataRow创建一个TJ_HUOYUE_USEREntity对象
         * @param TJ_HUOYUE_USER row
         * @returnTJ_HUOYUE_USERList对象
        * @throws Exception 
         */
		public List<tj_huoyue_user_Dao> get_tj_huoyue_user_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tj_huoyue_user_Dao> get_tj_huoyue_user_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TJ_HUOYUE_USER返回的查询DataRow创建一个TJ_HUOYUE_USEREntity对象
         * @param TJ_HUOYUE_USER row
         * @returnTJ_HUOYUE_USERDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, tj_huoyue_user_Dao> get_tj_huoyue_user_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TJ_HUOYUE_USER字段加一
         * @param FieldName
         * @param sid
         */
	public int create_tj_huoyue_user_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TJ_HUOYUE_USERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_tj_huoyue_user_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TJ_HUOYUE_USERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_tj_huoyue_user_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
