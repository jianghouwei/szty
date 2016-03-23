/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaosetup.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaosetup_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOSETUP数据接口
    *@作者：宋春林 
    */

	public interface aihaosetup_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSETUP实体
         * @return 新插入记录的编号
         */
		public int insert_aihaosetup(aihaosetup_Dao _AIHAOSETUPModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSETUPprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaosetup(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSETUP实体
         * @return 影响的行数
         */
		public int update_aihaosetup(aihaosetup_Dao _AIHAOSETUPModel) throws Exception;
		

         /**
         *  删除数据表AIHAOSETUP中的一条记录
         * @param AIHAOSETUP实体
         * @return 新插入记录的编号
         */
		public int delete_aihaosetup(int _setupid) throws Exception;
		
          /**
         * 得到 aihaosetup 数据实体
         * @param Setupid">Setupid
         * @return<aihaosetup 数据实体
        * @throws Exception 
         */
		public aihaosetup_Dao get_aihaosetupDao(int _setupid) throws Exception;
		
		
		    /**
         * 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
         * @param AIHAOSETUP row
         * @returnAIHAOSETUPList对象
        * @throws Exception 
         */
		public List< aihaosetup_Dao> get_aihaosetup_All() throws Exception;
		    /**
         * 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
         * @param AIHAOSETUP row
         * @returnAIHAOSETUPList对象
        * @throws Exception 
         */
		public List<aihaosetup_Dao> get_aihaosetup_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaosetup_Dao> get_aihaosetup_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
         * @param AIHAOSETUP row
         * @returnAIHAOSETUPDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaosetup_Dao> get_aihaosetup_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOSETUP字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaosetup_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOSETUPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaosetup_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOSETUPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaosetup_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
