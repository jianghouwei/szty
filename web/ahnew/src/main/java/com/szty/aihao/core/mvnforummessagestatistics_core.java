/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforummessagestatistics.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforummessagestatistics_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMMESSAGESTATISTICS数据接口
    *@作者：宋春林 
    */

	public interface mvnforummessagestatistics_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMESSAGESTATISTICS实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforummessagestatistics(mvnforummessagestatistics_Dao _MVNFORUMMESSAGESTATISTICSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMESSAGESTATISTICSprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforummessagestatistics(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMESSAGESTATISTICS实体
         * @return 影响的行数
         */
		public int update_mvnforummessagestatistics(mvnforummessagestatistics_Dao _MVNFORUMMESSAGESTATISTICSModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMMESSAGESTATISTICS中的一条记录
         * @param MVNFORUMMESSAGESTATISTICS实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforummessagestatistics(int _fromid) throws Exception;
		
          /**
         * 得到 mvnforummessagestatistics 数据实体
         * @param Fromid">Fromid
         * @return<mvnforummessagestatistics 数据实体
        * @throws Exception 
         */
		public mvnforummessagestatistics_Dao get_mvnforummessagestatisticsDao(int _fromid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMMESSAGESTATISTICS返回的查询DataRow创建一个MVNFORUMMESSAGESTATISTICSEntity对象
         * @param MVNFORUMMESSAGESTATISTICS row
         * @returnMVNFORUMMESSAGESTATISTICSList对象
        * @throws Exception 
         */
		public List< mvnforummessagestatistics_Dao> get_mvnforummessagestatistics_All() throws Exception;
		    /**
         * 根据MVNFORUMMESSAGESTATISTICS返回的查询DataRow创建一个MVNFORUMMESSAGESTATISTICSEntity对象
         * @param MVNFORUMMESSAGESTATISTICS row
         * @returnMVNFORUMMESSAGESTATISTICSList对象
        * @throws Exception 
         */
		public List<mvnforummessagestatistics_Dao> get_mvnforummessagestatistics_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforummessagestatistics_Dao> get_mvnforummessagestatistics_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMMESSAGESTATISTICS返回的查询DataRow创建一个MVNFORUMMESSAGESTATISTICSEntity对象
         * @param MVNFORUMMESSAGESTATISTICS row
         * @returnMVNFORUMMESSAGESTATISTICSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforummessagestatistics_Dao> get_mvnforummessagestatistics_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMMESSAGESTATISTICS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforummessagestatistics_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMMESSAGESTATISTICSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforummessagestatistics_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMMESSAGESTATISTICSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforummessagestatistics_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
