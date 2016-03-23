/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaouserlogin.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaouserlogin_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOUSERLOGIN数据接口
    *@作者：宋春林 
    */

	public interface aihaouserlogin_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERLOGIN实体
         * @return 新插入记录的编号
         */
		public int insert_aihaouserlogin(aihaouserlogin_Dao _AIHAOUSERLOGINModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERLOGINprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaouserlogin(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERLOGIN实体
         * @return 影响的行数
         */
		public int update_aihaouserlogin(aihaouserlogin_Dao _AIHAOUSERLOGINModel) throws Exception;
		

         /**
         *  删除数据表AIHAOUSERLOGIN中的一条记录
         * @param AIHAOUSERLOGIN实体
         * @return 新插入记录的编号
         */
		public int delete_aihaouserlogin(int _id) throws Exception;
		
          /**
         * 得到 aihaouserlogin 数据实体
         * @param Id">Id
         * @return<aihaouserlogin 数据实体
        * @throws Exception 
         */
		public aihaouserlogin_Dao get_aihaouserloginDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOUSERLOGIN返回的查询DataRow创建一个AIHAOUSERLOGINEntity对象
         * @param AIHAOUSERLOGIN row
         * @returnAIHAOUSERLOGINList对象
        * @throws Exception 
         */
		public List< aihaouserlogin_Dao> get_aihaouserlogin_All() throws Exception;
		    /**
         * 根据AIHAOUSERLOGIN返回的查询DataRow创建一个AIHAOUSERLOGINEntity对象
         * @param AIHAOUSERLOGIN row
         * @returnAIHAOUSERLOGINList对象
        * @throws Exception 
         */
		public List<aihaouserlogin_Dao> get_aihaouserlogin_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaouserlogin_Dao> get_aihaouserlogin_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOUSERLOGIN返回的查询DataRow创建一个AIHAOUSERLOGINEntity对象
         * @param AIHAOUSERLOGIN row
         * @returnAIHAOUSERLOGINDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaouserlogin_Dao> get_aihaouserlogin_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOUSERLOGIN字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaouserlogin_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOUSERLOGINInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaouserlogin_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOUSERLOGINIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaouserlogin_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
