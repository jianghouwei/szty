/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaomember_bak_130913.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaomember_bak_130913_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOMEMBER_BAK_130913数据接口
    *@作者：宋春林 
    */

	public interface aihaomember_bak_130913_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOMEMBER_BAK_130913实体
         * @return 新插入记录的编号
         */
		public int insert_aihaomember_bak_130913(aihaomember_bak_130913_Dao _AIHAOMEMBER_BAK_130913Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOMEMBER_BAK_130913prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaomember_bak_130913(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOMEMBER_BAK_130913实体
         * @return 影响的行数
         */
		public int update_aihaomember_bak_130913(aihaomember_bak_130913_Dao _AIHAOMEMBER_BAK_130913Model) throws Exception;
		

         /**
         *  删除数据表AIHAOMEMBER_BAK_130913中的一条记录
         * @param AIHAOMEMBER_BAK_130913实体
         * @return 新插入记录的编号
         */
		public int delete_aihaomember_bak_130913(int _memberid) throws Exception;
		
          /**
         * 得到 aihaomember_bak_130913 数据实体
         * @param Memberid">Memberid
         * @return<aihaomember_bak_130913 数据实体
        * @throws Exception 
         */
		public aihaomember_bak_130913_Dao get_aihaomember_bak_130913Dao(int _memberid) throws Exception;
		
		
		    /**
         * 根据AIHAOMEMBER_BAK_130913返回的查询DataRow创建一个AIHAOMEMBER_BAK_130913Entity对象
         * @param AIHAOMEMBER_BAK_130913 row
         * @returnAIHAOMEMBER_BAK_130913List对象
        * @throws Exception 
         */
		public List< aihaomember_bak_130913_Dao> get_aihaomember_bak_130913_All() throws Exception;
		    /**
         * 根据AIHAOMEMBER_BAK_130913返回的查询DataRow创建一个AIHAOMEMBER_BAK_130913Entity对象
         * @param AIHAOMEMBER_BAK_130913 row
         * @returnAIHAOMEMBER_BAK_130913List对象
        * @throws Exception 
         */
		public List<aihaomember_bak_130913_Dao> get_aihaomember_bak_130913_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaomember_bak_130913_Dao> get_aihaomember_bak_130913_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOMEMBER_BAK_130913返回的查询DataRow创建一个AIHAOMEMBER_BAK_130913Entity对象
         * @param AIHAOMEMBER_BAK_130913 row
         * @returnAIHAOMEMBER_BAK_130913Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaomember_bak_130913_Dao> get_aihaomember_bak_130913_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOMEMBER_BAK_130913字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaomember_bak_130913_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOMEMBER_BAK_130913Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaomember_bak_130913_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOMEMBER_BAK_130913IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaomember_bak_130913_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
