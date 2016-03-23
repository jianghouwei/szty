/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataPptmptable.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.pptmptable_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@PPTMPTABLE数据接口
    *@作者：宋春林 
    */

	public interface pptmptable_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param PPTMPTABLE实体
         * @return 新插入记录的编号
         */
		public int insert_pptmptable(pptmptable_Dao _PPTMPTABLEModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param PPTMPTABLEprrameter
         * @return 新插入记录的编号
         */
         public int insert_pptmptable(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param PPTMPTABLE实体
         * @return 影响的行数
         */
		public int update_pptmptable(pptmptable_Dao _PPTMPTABLEModel) throws Exception;
		

         /**
         *  删除数据表PPTMPTABLE中的一条记录
         * @param PPTMPTABLE实体
         * @return 新插入记录的编号
         */
		public int delete_pptmptable(int _bid) throws Exception;
		
          /**
         * 得到 pptmptable 数据实体
         * @param Bid">Bid
         * @return<pptmptable 数据实体
        * @throws Exception 
         */
		public pptmptable_Dao get_pptmptableDao(int _bid) throws Exception;
		
		
		    /**
         * 根据PPTMPTABLE返回的查询DataRow创建一个PPTMPTABLEEntity对象
         * @param PPTMPTABLE row
         * @returnPPTMPTABLEList对象
        * @throws Exception 
         */
		public List< pptmptable_Dao> get_pptmptable_All() throws Exception;
		    /**
         * 根据PPTMPTABLE返回的查询DataRow创建一个PPTMPTABLEEntity对象
         * @param PPTMPTABLE row
         * @returnPPTMPTABLEList对象
        * @throws Exception 
         */
		public List<pptmptable_Dao> get_pptmptable_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<pptmptable_Dao> get_pptmptable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据PPTMPTABLE返回的查询DataRow创建一个PPTMPTABLEEntity对象
         * @param PPTMPTABLE row
         * @returnPPTMPTABLEDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, pptmptable_Dao> get_pptmptable_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新PPTMPTABLE字段加一
         * @param FieldName
         * @param sid
         */
	public int create_pptmptable_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新PPTMPTABLEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_pptmptable_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新PPTMPTABLEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_pptmptable_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
