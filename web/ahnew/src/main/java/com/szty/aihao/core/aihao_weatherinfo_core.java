/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao_weatherinfo.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao_weatherinfo_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO_WEATHERINFO数据接口
    *@作者：宋春林 
    */

	public interface aihao_weatherinfo_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_WEATHERINFO实体
         * @return 新插入记录的编号
         */
		public int insert_aihao_weatherinfo(aihao_weatherinfo_Dao _AIHAO_WEATHERINFOModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_WEATHERINFOprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao_weatherinfo(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_WEATHERINFO实体
         * @return 影响的行数
         */
		public int update_aihao_weatherinfo(aihao_weatherinfo_Dao _AIHAO_WEATHERINFOModel) throws Exception;
		

         /**
         *  删除数据表AIHAO_WEATHERINFO中的一条记录
         * @param AIHAO_WEATHERINFO实体
         * @return 新插入记录的编号
         */
		public int delete_aihao_weatherinfo(int _wid) throws Exception;
		
          /**
         * 得到 aihao_weatherinfo 数据实体
         * @param Wid">Wid
         * @return<aihao_weatherinfo 数据实体
        * @throws Exception 
         */
		public aihao_weatherinfo_Dao get_aihao_weatherinfoDao(int _wid) throws Exception;
		
		
		    /**
         * 根据AIHAO_WEATHERINFO返回的查询DataRow创建一个AIHAO_WEATHERINFOEntity对象
         * @param AIHAO_WEATHERINFO row
         * @returnAIHAO_WEATHERINFOList对象
        * @throws Exception 
         */
		public List< aihao_weatherinfo_Dao> get_aihao_weatherinfo_All() throws Exception;
		    /**
         * 根据AIHAO_WEATHERINFO返回的查询DataRow创建一个AIHAO_WEATHERINFOEntity对象
         * @param AIHAO_WEATHERINFO row
         * @returnAIHAO_WEATHERINFOList对象
        * @throws Exception 
         */
		public List<aihao_weatherinfo_Dao> get_aihao_weatherinfo_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao_weatherinfo_Dao> get_aihao_weatherinfo_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO_WEATHERINFO返回的查询DataRow创建一个AIHAO_WEATHERINFOEntity对象
         * @param AIHAO_WEATHERINFO row
         * @returnAIHAO_WEATHERINFODictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao_weatherinfo_Dao> get_aihao_weatherinfo_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO_WEATHERINFO字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao_weatherinfo_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO_WEATHERINFOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao_weatherinfo_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO_WEATHERINFOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao_weatherinfo_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
