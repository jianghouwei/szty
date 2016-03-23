/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao32tmp.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao32tmp_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO32TMP数据接口
    *@作者：宋春林 
    */

	public interface aihao32tmp_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO32TMP实体
         * @return 新插入记录的编号
         */
		public int insert_aihao32tmp(aihao32tmp_Dao _AIHAO32TMPModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO32TMPprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao32tmp(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO32TMP实体
         * @return 影响的行数
         */
		public int update_aihao32tmp(aihao32tmp_Dao _AIHAO32TMPModel) throws Exception;
		

         /**
         *  删除数据表AIHAO32TMP中的一条记录
         * @param AIHAO32TMP实体
         * @return 新插入记录的编号
         */
		public int delete_aihao32tmp(int _id) throws Exception;
		
          /**
         * 得到 aihao32tmp 数据实体
         * @param Id">Id
         * @return<aihao32tmp 数据实体
        * @throws Exception 
         */
		public aihao32tmp_Dao get_aihao32tmpDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO32TMP返回的查询DataRow创建一个AIHAO32TMPEntity对象
         * @param AIHAO32TMP row
         * @returnAIHAO32TMPList对象
        * @throws Exception 
         */
		public List< aihao32tmp_Dao> get_aihao32tmp_All() throws Exception;
		    /**
         * 根据AIHAO32TMP返回的查询DataRow创建一个AIHAO32TMPEntity对象
         * @param AIHAO32TMP row
         * @returnAIHAO32TMPList对象
        * @throws Exception 
         */
		public List<aihao32tmp_Dao> get_aihao32tmp_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao32tmp_Dao> get_aihao32tmp_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO32TMP返回的查询DataRow创建一个AIHAO32TMPEntity对象
         * @param AIHAO32TMP row
         * @returnAIHAO32TMPDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao32tmp_Dao> get_aihao32tmp_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO32TMP字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao32tmp_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO32TMPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao32tmp_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO32TMPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao32tmp_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
