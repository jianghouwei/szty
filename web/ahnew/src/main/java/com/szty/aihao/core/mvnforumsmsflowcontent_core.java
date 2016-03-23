package com.szty.aihao.core;


import com.szty.aihao.dao.mvnforumsmsflowcontent_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSMSFLOWCONTENT数据接口
    *@作者：宋春林 
    */

	public interface mvnforumsmsflowcontent_core extends Serializable 
	{
     
         /*
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSFLOWCONTENT实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsmsflowcontent(mvnforumsmsflowcontent_Dao _MVNFORUMSMSFLOWCONTENTModel) throws Exception;
		
        
        /*
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSFLOWCONTENTprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsmsflowcontent(Object[] _para) throws Exception;
        
	
		
		 /*
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSFLOWCONTENT实体
         * @return 影响的行数
         */
		public int update_mvnforumsmsflowcontent(mvnforumsmsflowcontent_Dao _MVNFORUMSMSFLOWCONTENTModel) throws Exception;
		

         /*
         *  删除数据表MVNFORUMSMSFLOWCONTENT中的一条记录
         * @param MVNFORUMSMSFLOWCONTENT实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsmsflowcontent(int _flowcontentid) throws Exception;
		
          /*
         * 得到 mvnforumsmsflowcontent 数据实体
         * @param Flowcontentid">Flowcontentid
         * @return<mvnforumsmsflowcontent 数据实体
        * @throws Exception 
         */
		public mvnforumsmsflowcontent_Dao get_mvnforumsmsflowcontentDao(int _flowcontentid) throws Exception;
		
		
		    /*
         * 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
         * @param MVNFORUMSMSFLOWCONTENT row
         * @returnMVNFORUMSMSFLOWCONTENTList对象
        * @throws Exception 
         */
		public List< mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_All() throws Exception;
		    /*
         * 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
         * @param MVNFORUMSMSFLOWCONTENT row
         * @returnMVNFORUMSMSFLOWCONTENTList对象
        * @throws Exception 
         */
		public List<mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_All(String strWhere) throws Exception;
			/*
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /*
         * 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
         * @param MVNFORUMSMSFLOWCONTENT row
         * @returnMVNFORUMSMSFLOWCONTENTDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_Dictionary(String strWhere) throws Exception;
		 /*
         * 更新MVNFORUMSMSFLOWCONTENT字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumsmsflowcontent_UpdateIncreate(String FieldName,int sid) throws Exception;
         /*
         * 更新MVNFORUMSMSFLOWCONTENTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumsmsflowcontent_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /*
         * 更新MVNFORUMSMSFLOWCONTENTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumsmsflowcontent_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
