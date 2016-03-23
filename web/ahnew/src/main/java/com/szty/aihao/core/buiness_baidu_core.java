/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataBuiness_baidu.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.buiness_baidu_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@BUINESS_BAIDU数据接口
    *@作者：宋春林 
    */

	public interface buiness_baidu_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param BUINESS_BAIDU实体
         * @return 新插入记录的编号
         */
		public int insert_buiness_baidu(buiness_baidu_Dao _BUINESS_BAIDUModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param BUINESS_BAIDUprrameter
         * @return 新插入记录的编号
         */
         public int insert_buiness_baidu(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param BUINESS_BAIDU实体
         * @return 影响的行数
         */
		public int update_buiness_baidu(buiness_baidu_Dao _BUINESS_BAIDUModel) throws Exception;
		

         /**
         *  删除数据表BUINESS_BAIDU中的一条记录
         * @param BUINESS_BAIDU实体
         * @return 新插入记录的编号
         */
		public int delete_buiness_baidu(int _lat) throws Exception;
		
          /**
         * 得到 buiness_baidu 数据实体
         * @param Lat">Lat
         * @return<buiness_baidu 数据实体
        * @throws Exception 
         */
		public buiness_baidu_Dao get_buiness_baiduDao(int _lat) throws Exception;
		
		
		    /**
         * 根据BUINESS_BAIDU返回的查询DataRow创建一个BUINESS_BAIDUEntity对象
         * @param BUINESS_BAIDU row
         * @returnBUINESS_BAIDUList对象
        * @throws Exception 
         */
		public List< buiness_baidu_Dao> get_buiness_baidu_All() throws Exception;
		    /**
         * 根据BUINESS_BAIDU返回的查询DataRow创建一个BUINESS_BAIDUEntity对象
         * @param BUINESS_BAIDU row
         * @returnBUINESS_BAIDUList对象
        * @throws Exception 
         */
		public List<buiness_baidu_Dao> get_buiness_baidu_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<buiness_baidu_Dao> get_buiness_baidu_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据BUINESS_BAIDU返回的查询DataRow创建一个BUINESS_BAIDUEntity对象
         * @param BUINESS_BAIDU row
         * @returnBUINESS_BAIDUDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, buiness_baidu_Dao> get_buiness_baidu_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新BUINESS_BAIDU字段加一
         * @param FieldName
         * @param sid
         */
	public int create_buiness_baidu_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新BUINESS_BAIDUInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_buiness_baidu_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新BUINESS_BAIDUIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_buiness_baidu_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
