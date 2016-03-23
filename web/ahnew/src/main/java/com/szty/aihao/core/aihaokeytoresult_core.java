/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaokeytoresult.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaokeytoresult_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOKEYTORESULT数据接口
    *@作者：宋春林 
    */

	public interface aihaokeytoresult_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOKEYTORESULT实体
         * @return 新插入记录的编号
         */
		public int insert_aihaokeytoresult(aihaokeytoresult_Dao _AIHAOKEYTORESULTModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOKEYTORESULTprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaokeytoresult(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOKEYTORESULT实体
         * @return 影响的行数
         */
		public int update_aihaokeytoresult(aihaokeytoresult_Dao _AIHAOKEYTORESULTModel) throws Exception;
		

         /**
         *  删除数据表AIHAOKEYTORESULT中的一条记录
         * @param AIHAOKEYTORESULT实体
         * @return 新插入记录的编号
         */
		public int delete_aihaokeytoresult(int _keyid) throws Exception;
		
          /**
         * 得到 aihaokeytoresult 数据实体
         * @param Keyid">Keyid
         * @return<aihaokeytoresult 数据实体
        * @throws Exception 
         */
		public aihaokeytoresult_Dao get_aihaokeytoresultDao(int _keyid) throws Exception;
		
		
		    /**
         * 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
         * @param AIHAOKEYTORESULT row
         * @returnAIHAOKEYTORESULTList对象
        * @throws Exception 
         */
		public List< aihaokeytoresult_Dao> get_aihaokeytoresult_All() throws Exception;
		    /**
         * 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
         * @param AIHAOKEYTORESULT row
         * @returnAIHAOKEYTORESULTList对象
        * @throws Exception 
         */
		public List<aihaokeytoresult_Dao> get_aihaokeytoresult_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaokeytoresult_Dao> get_aihaokeytoresult_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
         * @param AIHAOKEYTORESULT row
         * @returnAIHAOKEYTORESULTDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaokeytoresult_Dao> get_aihaokeytoresult_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOKEYTORESULT字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaokeytoresult_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOKEYTORESULTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaokeytoresult_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOKEYTORESULTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaokeytoresult_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
