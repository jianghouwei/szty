/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao_number_group_bak.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao_number_group_bak_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO_NUMBER_GROUP_BAK数据接口
    *@作者：宋春林 
    */

	public interface aihao_number_group_bak_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBER_GROUP_BAK实体
         * @return 新插入记录的编号
         */
		public int insert_aihao_number_group_bak(aihao_number_group_bak_Dao _AIHAO_NUMBER_GROUP_BAKModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBER_GROUP_BAKprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao_number_group_bak(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBER_GROUP_BAK实体
         * @return 影响的行数
         */
		public int update_aihao_number_group_bak(aihao_number_group_bak_Dao _AIHAO_NUMBER_GROUP_BAKModel) throws Exception;
		

         /**
         *  删除数据表AIHAO_NUMBER_GROUP_BAK中的一条记录
         * @param AIHAO_NUMBER_GROUP_BAK实体
         * @return 新插入记录的编号
         */
		public int delete_aihao_number_group_bak(int _id) throws Exception;
		
          /**
         * 得到 aihao_number_group_bak 数据实体
         * @param Id">Id
         * @return<aihao_number_group_bak 数据实体
        * @throws Exception 
         */
		public aihao_number_group_bak_Dao get_aihao_number_group_bakDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO_NUMBER_GROUP_BAK返回的查询DataRow创建一个AIHAO_NUMBER_GROUP_BAKEntity对象
         * @param AIHAO_NUMBER_GROUP_BAK row
         * @returnAIHAO_NUMBER_GROUP_BAKList对象
        * @throws Exception 
         */
		public List< aihao_number_group_bak_Dao> get_aihao_number_group_bak_All() throws Exception;
		    /**
         * 根据AIHAO_NUMBER_GROUP_BAK返回的查询DataRow创建一个AIHAO_NUMBER_GROUP_BAKEntity对象
         * @param AIHAO_NUMBER_GROUP_BAK row
         * @returnAIHAO_NUMBER_GROUP_BAKList对象
        * @throws Exception 
         */
		public List<aihao_number_group_bak_Dao> get_aihao_number_group_bak_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao_number_group_bak_Dao> get_aihao_number_group_bak_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO_NUMBER_GROUP_BAK返回的查询DataRow创建一个AIHAO_NUMBER_GROUP_BAKEntity对象
         * @param AIHAO_NUMBER_GROUP_BAK row
         * @returnAIHAO_NUMBER_GROUP_BAKDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao_number_group_bak_Dao> get_aihao_number_group_bak_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO_NUMBER_GROUP_BAK字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao_number_group_bak_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO_NUMBER_GROUP_BAKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao_number_group_bak_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO_NUMBER_GROUP_BAKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao_number_group_bak_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
