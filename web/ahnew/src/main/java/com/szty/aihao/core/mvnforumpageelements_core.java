/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumpageelements.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumpageelements_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMPAGEELEMENTS数据接口
    *@作者：宋春林 
    */

	public interface mvnforumpageelements_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPAGEELEMENTS实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumpageelements(mvnforumpageelements_Dao _MVNFORUMPAGEELEMENTSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPAGEELEMENTSprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumpageelements(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPAGEELEMENTS实体
         * @return 影响的行数
         */
		public int update_mvnforumpageelements(mvnforumpageelements_Dao _MVNFORUMPAGEELEMENTSModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMPAGEELEMENTS中的一条记录
         * @param MVNFORUMPAGEELEMENTS实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumpageelements(int _elementid) throws Exception;
		
          /**
         * 得到 mvnforumpageelements 数据实体
         * @param Elementid">Elementid
         * @return<mvnforumpageelements 数据实体
        * @throws Exception 
         */
		public mvnforumpageelements_Dao get_mvnforumpageelementsDao(int _elementid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMPAGEELEMENTS返回的查询DataRow创建一个MVNFORUMPAGEELEMENTSEntity对象
         * @param MVNFORUMPAGEELEMENTS row
         * @returnMVNFORUMPAGEELEMENTSList对象
        * @throws Exception 
         */
		public List< mvnforumpageelements_Dao> get_mvnforumpageelements_All() throws Exception;
		    /**
         * 根据MVNFORUMPAGEELEMENTS返回的查询DataRow创建一个MVNFORUMPAGEELEMENTSEntity对象
         * @param MVNFORUMPAGEELEMENTS row
         * @returnMVNFORUMPAGEELEMENTSList对象
        * @throws Exception 
         */
		public List<mvnforumpageelements_Dao> get_mvnforumpageelements_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumpageelements_Dao> get_mvnforumpageelements_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMPAGEELEMENTS返回的查询DataRow创建一个MVNFORUMPAGEELEMENTSEntity对象
         * @param MVNFORUMPAGEELEMENTS row
         * @returnMVNFORUMPAGEELEMENTSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumpageelements_Dao> get_mvnforumpageelements_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMPAGEELEMENTS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumpageelements_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMPAGEELEMENTSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumpageelements_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMPAGEELEMENTSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumpageelements_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
