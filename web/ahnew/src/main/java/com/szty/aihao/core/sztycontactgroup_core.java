/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztycontactgroup.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.sztycontactgroup_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYCONTACTGROUP数据接口
    *@作者：宋春林 
    */

	public interface sztycontactgroup_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYCONTACTGROUP实体
         * @return 新插入记录的编号
         */
		public int insert_sztycontactgroup(sztycontactgroup_Dao _SZTYCONTACTGROUPModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYCONTACTGROUPprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztycontactgroup(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYCONTACTGROUP实体
         * @return 影响的行数
         */
		public int update_sztycontactgroup(sztycontactgroup_Dao _SZTYCONTACTGROUPModel) throws Exception;
		

         /**
         *  删除数据表SZTYCONTACTGROUP中的一条记录
         * @param SZTYCONTACTGROUP实体
         * @return 新插入记录的编号
         */
		public int delete_sztycontactgroup(int _gid) throws Exception;
		
          /**
         * 得到 sztycontactgroup 数据实体
         * @param Gid">Gid
         * @return<sztycontactgroup 数据实体
        * @throws Exception 
         */
		public sztycontactgroup_Dao get_sztycontactgroupDao(int _gid) throws Exception;
		
		
		    /**
         * 根据SZTYCONTACTGROUP返回的查询DataRow创建一个SZTYCONTACTGROUPEntity对象
         * @param SZTYCONTACTGROUP row
         * @returnSZTYCONTACTGROUPList对象
        * @throws Exception 
         */
		public List< sztycontactgroup_Dao> get_sztycontactgroup_All() throws Exception;
		    /**
         * 根据SZTYCONTACTGROUP返回的查询DataRow创建一个SZTYCONTACTGROUPEntity对象
         * @param SZTYCONTACTGROUP row
         * @returnSZTYCONTACTGROUPList对象
        * @throws Exception 
         */
		public List<sztycontactgroup_Dao> get_sztycontactgroup_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztycontactgroup_Dao> get_sztycontactgroup_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据SZTYCONTACTGROUP返回的查询DataRow创建一个SZTYCONTACTGROUPEntity对象
         * @param SZTYCONTACTGROUP row
         * @returnSZTYCONTACTGROUPDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, sztycontactgroup_Dao> get_sztycontactgroup_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新SZTYCONTACTGROUP字段加一
         * @param FieldName
         * @param sid
         */
	public int create_sztycontactgroup_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新SZTYCONTACTGROUPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_sztycontactgroup_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新SZTYCONTACTGROUPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_sztycontactgroup_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
