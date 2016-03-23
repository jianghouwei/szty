/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGujianzi_bak.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.gujianzi_bak_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GUJIANZI_BAK数据接口
    *@作者：宋春林 
    */

	public interface gujianzi_bak_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param GUJIANZI_BAK实体
         * @return 新插入记录的编号
         */
		public int insert_gujianzi_bak(gujianzi_bak_Dao _GUJIANZI_BAKModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param GUJIANZI_BAKprrameter
         * @return 新插入记录的编号
         */
         public int insert_gujianzi_bak(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param GUJIANZI_BAK实体
         * @return 影响的行数
         */
		public int update_gujianzi_bak(gujianzi_bak_Dao _GUJIANZI_BAKModel) throws Exception;
		

         /**
         *  删除数据表GUJIANZI_BAK中的一条记录
         * @param GUJIANZI_BAK实体
         * @return 新插入记录的编号
         */
		public int delete_gujianzi_bak(int _gjzid) throws Exception;
		
          /**
         * 得到 gujianzi_bak 数据实体
         * @param Gjzid">Gjzid
         * @return<gujianzi_bak 数据实体
        * @throws Exception 
         */
		public gujianzi_bak_Dao get_gujianzi_bakDao(int _gjzid) throws Exception;
		
		
		    /**
         * 根据GUJIANZI_BAK返回的查询DataRow创建一个GUJIANZI_BAKEntity对象
         * @param GUJIANZI_BAK row
         * @returnGUJIANZI_BAKList对象
        * @throws Exception 
         */
		public List< gujianzi_bak_Dao> get_gujianzi_bak_All() throws Exception;
		    /**
         * 根据GUJIANZI_BAK返回的查询DataRow创建一个GUJIANZI_BAKEntity对象
         * @param GUJIANZI_BAK row
         * @returnGUJIANZI_BAKList对象
        * @throws Exception 
         */
		public List<gujianzi_bak_Dao> get_gujianzi_bak_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<gujianzi_bak_Dao> get_gujianzi_bak_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据GUJIANZI_BAK返回的查询DataRow创建一个GUJIANZI_BAKEntity对象
         * @param GUJIANZI_BAK row
         * @returnGUJIANZI_BAKDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, gujianzi_bak_Dao> get_gujianzi_bak_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新GUJIANZI_BAK字段加一
         * @param FieldName
         * @param sid
         */
	public int create_gujianzi_bak_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新GUJIANZI_BAKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_gujianzi_bak_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新GUJIANZI_BAKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_gujianzi_bak_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
