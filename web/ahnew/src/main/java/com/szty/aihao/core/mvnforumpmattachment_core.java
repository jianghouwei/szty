/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumpmattachment.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumpmattachment_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMPMATTACHMENT数据接口
    *@作者：宋春林 
    */

	public interface mvnforumpmattachment_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPMATTACHMENT实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumpmattachment(mvnforumpmattachment_Dao _MVNFORUMPMATTACHMENTModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPMATTACHMENTprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumpmattachment(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPMATTACHMENT实体
         * @return 影响的行数
         */
		public int update_mvnforumpmattachment(mvnforumpmattachment_Dao _MVNFORUMPMATTACHMENTModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMPMATTACHMENT中的一条记录
         * @param MVNFORUMPMATTACHMENT实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumpmattachment(int _pmattachid) throws Exception;
		
          /**
         * 得到 mvnforumpmattachment 数据实体
         * @param Pmattachid">Pmattachid
         * @return<mvnforumpmattachment 数据实体
        * @throws Exception 
         */
		public mvnforumpmattachment_Dao get_mvnforumpmattachmentDao(int _pmattachid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMPMATTACHMENT返回的查询DataRow创建一个MVNFORUMPMATTACHMENTEntity对象
         * @param MVNFORUMPMATTACHMENT row
         * @returnMVNFORUMPMATTACHMENTList对象
        * @throws Exception 
         */
		public List< mvnforumpmattachment_Dao> get_mvnforumpmattachment_All() throws Exception;
		    /**
         * 根据MVNFORUMPMATTACHMENT返回的查询DataRow创建一个MVNFORUMPMATTACHMENTEntity对象
         * @param MVNFORUMPMATTACHMENT row
         * @returnMVNFORUMPMATTACHMENTList对象
        * @throws Exception 
         */
		public List<mvnforumpmattachment_Dao> get_mvnforumpmattachment_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumpmattachment_Dao> get_mvnforumpmattachment_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMPMATTACHMENT返回的查询DataRow创建一个MVNFORUMPMATTACHMENTEntity对象
         * @param MVNFORUMPMATTACHMENT row
         * @returnMVNFORUMPMATTACHMENTDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumpmattachment_Dao> get_mvnforumpmattachment_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMPMATTACHMENT字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumpmattachment_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMPMATTACHMENTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumpmattachment_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMPMATTACHMENTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumpmattachment_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
