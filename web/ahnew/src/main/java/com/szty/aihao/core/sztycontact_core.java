/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztycontact.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.sztycontact_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYCONTACT数据接口
    *@作者：宋春林 
    */

	public interface sztycontact_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYCONTACT实体
         * @return 新插入记录的编号
         */
		public int insert_sztycontact(sztycontact_Dao _SZTYCONTACTModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYCONTACTprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztycontact(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYCONTACT实体
         * @return 影响的行数
         */
		public int update_sztycontact(sztycontact_Dao _SZTYCONTACTModel) throws Exception;
		

         /**
         *  删除数据表SZTYCONTACT中的一条记录
         * @param SZTYCONTACT实体
         * @return 新插入记录的编号
         */
		public int delete_sztycontact(int _id) throws Exception;
		
          /**
         * 得到 sztycontact 数据实体
         * @param Id">Id
         * @return<sztycontact 数据实体
        * @throws Exception 
         */
		public sztycontact_Dao get_sztycontactDao(int _id) throws Exception;
		
		
		    /**
         * 根据SZTYCONTACT返回的查询DataRow创建一个SZTYCONTACTEntity对象
         * @param SZTYCONTACT row
         * @returnSZTYCONTACTList对象
        * @throws Exception 
         */
		public List< sztycontact_Dao> get_sztycontact_All() throws Exception;
		    /**
         * 根据SZTYCONTACT返回的查询DataRow创建一个SZTYCONTACTEntity对象
         * @param SZTYCONTACT row
         * @returnSZTYCONTACTList对象
        * @throws Exception 
         */
		public List<sztycontact_Dao> get_sztycontact_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztycontact_Dao> get_sztycontact_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据SZTYCONTACT返回的查询DataRow创建一个SZTYCONTACTEntity对象
         * @param SZTYCONTACT row
         * @returnSZTYCONTACTDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, sztycontact_Dao> get_sztycontact_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新SZTYCONTACT字段加一
         * @param FieldName
         * @param sid
         */
	public int create_sztycontact_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新SZTYCONTACTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_sztycontact_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新SZTYCONTACTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_sztycontact_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
