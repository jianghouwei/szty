/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyuserinfo.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.sztyuserinfo_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYUSERINFO数据接口
    *@作者：宋春林 
    */

	public interface sztyuserinfo_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERINFO实体
         * @return 新插入记录的编号
         */
		public int insert_sztyuserinfo(sztyuserinfo_Dao _SZTYUSERINFOModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERINFOprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyuserinfo(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERINFO实体
         * @return 影响的行数
         */
		public int update_sztyuserinfo(sztyuserinfo_Dao _SZTYUSERINFOModel) throws Exception;
		

         /**
         *  删除数据表SZTYUSERINFO中的一条记录
         * @param SZTYUSERINFO实体
         * @return 新插入记录的编号
         */
		public int delete_sztyuserinfo(int _id) throws Exception;
		
          /**
         * 得到 sztyuserinfo 数据实体
         * @param Id">Id
         * @return<sztyuserinfo 数据实体
        * @throws Exception 
         */
		public sztyuserinfo_Dao get_sztyuserinfoDao(int _id) throws Exception;
		
		
		    /**
         * 根据SZTYUSERINFO返回的查询DataRow创建一个SZTYUSERINFOEntity对象
         * @param SZTYUSERINFO row
         * @returnSZTYUSERINFOList对象
        * @throws Exception 
         */
		public List< sztyuserinfo_Dao> get_sztyuserinfo_All() throws Exception;
		    /**
         * 根据SZTYUSERINFO返回的查询DataRow创建一个SZTYUSERINFOEntity对象
         * @param SZTYUSERINFO row
         * @returnSZTYUSERINFOList对象
        * @throws Exception 
         */
		public List<sztyuserinfo_Dao> get_sztyuserinfo_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyuserinfo_Dao> get_sztyuserinfo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据SZTYUSERINFO返回的查询DataRow创建一个SZTYUSERINFOEntity对象
         * @param SZTYUSERINFO row
         * @returnSZTYUSERINFODictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, sztyuserinfo_Dao> get_sztyuserinfo_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新SZTYUSERINFO字段加一
         * @param FieldName
         * @param sid
         */
	public int create_sztyuserinfo_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新SZTYUSERINFOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_sztyuserinfo_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新SZTYUSERINFOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_sztyuserinfo_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
