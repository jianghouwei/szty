/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataClientupdate.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.clientupdate_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@CLIENTUPDATE数据接口
    *@作者：宋春林 
    */

	public interface clientupdate_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param CLIENTUPDATE实体
         * @return 新插入记录的编号
         */
		public int insert_clientupdate(clientupdate_Dao _CLIENTUPDATEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param CLIENTUPDATEprrameter
         * @return 新插入记录的编号
         */
         public int insert_clientupdate(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param CLIENTUPDATE实体
         * @return 影响的行数
         */
		public int update_clientupdate(clientupdate_Dao _CLIENTUPDATEModel) throws Exception;
		

         /**
         *  删除数据表CLIENTUPDATE中的一条记录
         * @param CLIENTUPDATE实体
         * @return 新插入记录的编号
         */
		public int delete_clientupdate(int _updateid) throws Exception;
		
          /**
         * 得到 clientupdate 数据实体
         * @param Updateid">Updateid
         * @return<clientupdate 数据实体
        * @throws Exception 
         */
		public clientupdate_Dao get_clientupdateDao(int _updateid) throws Exception;
		
		
		    /**
         * 根据CLIENTUPDATE返回的查询DataRow创建一个CLIENTUPDATEEntity对象
         * @param CLIENTUPDATE row
         * @returnCLIENTUPDATEList对象
        * @throws Exception 
         */
		public List< clientupdate_Dao> get_clientupdate_All() throws Exception;
		    /**
         * 根据CLIENTUPDATE返回的查询DataRow创建一个CLIENTUPDATEEntity对象
         * @param CLIENTUPDATE row
         * @returnCLIENTUPDATEList对象
        * @throws Exception 
         */
		public List<clientupdate_Dao> get_clientupdate_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<clientupdate_Dao> get_clientupdate_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据CLIENTUPDATE返回的查询DataRow创建一个CLIENTUPDATEEntity对象
         * @param CLIENTUPDATE row
         * @returnCLIENTUPDATEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, clientupdate_Dao> get_clientupdate_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新CLIENTUPDATE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_clientupdate_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新CLIENTUPDATEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_clientupdate_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新CLIENTUPDATEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_clientupdate_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
