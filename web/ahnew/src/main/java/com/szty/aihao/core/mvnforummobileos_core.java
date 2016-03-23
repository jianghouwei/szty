/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforummobileos.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforummobileos_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMMOBILEOS数据接口
    *@作者：宋春林 
    */

	public interface mvnforummobileos_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMOBILEOS实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforummobileos(mvnforummobileos_Dao _MVNFORUMMOBILEOSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMOBILEOSprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforummobileos(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMOBILEOS实体
         * @return 影响的行数
         */
		public int update_mvnforummobileos(mvnforummobileos_Dao _MVNFORUMMOBILEOSModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMMOBILEOS中的一条记录
         * @param MVNFORUMMOBILEOS实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforummobileos(int _mobileosid) throws Exception;
		
          /**
         * 得到 mvnforummobileos 数据实体
         * @param Mobileosid">Mobileosid
         * @return<mvnforummobileos 数据实体
        * @throws Exception 
         */
		public mvnforummobileos_Dao get_mvnforummobileosDao(int _mobileosid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMMOBILEOS返回的查询DataRow创建一个MVNFORUMMOBILEOSEntity对象
         * @param MVNFORUMMOBILEOS row
         * @returnMVNFORUMMOBILEOSList对象
        * @throws Exception 
         */
		public List< mvnforummobileos_Dao> get_mvnforummobileos_All() throws Exception;
		    /**
         * 根据MVNFORUMMOBILEOS返回的查询DataRow创建一个MVNFORUMMOBILEOSEntity对象
         * @param MVNFORUMMOBILEOS row
         * @returnMVNFORUMMOBILEOSList对象
        * @throws Exception 
         */
		public List<mvnforummobileos_Dao> get_mvnforummobileos_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforummobileos_Dao> get_mvnforummobileos_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMMOBILEOS返回的查询DataRow创建一个MVNFORUMMOBILEOSEntity对象
         * @param MVNFORUMMOBILEOS row
         * @returnMVNFORUMMOBILEOSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforummobileos_Dao> get_mvnforummobileos_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMMOBILEOS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforummobileos_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMMOBILEOSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforummobileos_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMMOBILEOSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforummobileos_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
