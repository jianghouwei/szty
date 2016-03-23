/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao18_baidu_update.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao18_baidu_update_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO18_BAIDU_UPDATE数据接口
    *@作者：宋春林 
    */

	public interface aihao18_baidu_update_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO18_BAIDU_UPDATE实体
         * @return 新插入记录的编号
         */
		public int insert_aihao18_baidu_update(aihao18_baidu_update_Dao _AIHAO18_BAIDU_UPDATEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO18_BAIDU_UPDATEprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao18_baidu_update(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO18_BAIDU_UPDATE实体
         * @return 影响的行数
         */
		public int update_aihao18_baidu_update(aihao18_baidu_update_Dao _AIHAO18_BAIDU_UPDATEModel) throws Exception;
		

         /**
         *  删除数据表AIHAO18_BAIDU_UPDATE中的一条记录
         * @param AIHAO18_BAIDU_UPDATE实体
         * @return 新插入记录的编号
         */
		public int delete_aihao18_baidu_update(int _nextval) throws Exception;
		
          /**
         * 得到 aihao18_baidu_update 数据实体
         * @param Nextval">Nextval
         * @return<aihao18_baidu_update 数据实体
        * @throws Exception 
         */
		public aihao18_baidu_update_Dao get_aihao18_baidu_updateDao(int _nextval) throws Exception;
		
		
		    /**
         * 根据AIHAO18_BAIDU_UPDATE返回的查询DataRow创建一个AIHAO18_BAIDU_UPDATEEntity对象
         * @param AIHAO18_BAIDU_UPDATE row
         * @returnAIHAO18_BAIDU_UPDATEList对象
        * @throws Exception 
         */
		public List< aihao18_baidu_update_Dao> get_aihao18_baidu_update_All() throws Exception;
		    /**
         * 根据AIHAO18_BAIDU_UPDATE返回的查询DataRow创建一个AIHAO18_BAIDU_UPDATEEntity对象
         * @param AIHAO18_BAIDU_UPDATE row
         * @returnAIHAO18_BAIDU_UPDATEList对象
        * @throws Exception 
         */
		public List<aihao18_baidu_update_Dao> get_aihao18_baidu_update_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao18_baidu_update_Dao> get_aihao18_baidu_update_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO18_BAIDU_UPDATE返回的查询DataRow创建一个AIHAO18_BAIDU_UPDATEEntity对象
         * @param AIHAO18_BAIDU_UPDATE row
         * @returnAIHAO18_BAIDU_UPDATEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao18_baidu_update_Dao> get_aihao18_baidu_update_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO18_BAIDU_UPDATE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao18_baidu_update_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO18_BAIDU_UPDATEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao18_baidu_update_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO18_BAIDU_UPDATEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao18_baidu_update_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
