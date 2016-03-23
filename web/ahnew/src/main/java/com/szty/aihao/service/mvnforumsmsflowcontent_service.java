/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsmsflowcontent.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumsmsflowcontent_Dao;
import com.szty.aihao.core.mvnforumsmsflowcontent_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSMSFLOWCONTENT逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumsmsflowcontent_service
	{
        public  mvnforumsmsflowcontent_core _dal=classFactory.getmvnforumsmsflowcontent();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSFLOWCONTENT实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsmsflowcontent (mvnforumsmsflowcontent_Dao _MVNFORUMSMSFLOWCONTENTModel )  throws Exception{
         return _dal.insert_mvnforumsmsflowcontent( _MVNFORUMSMSFLOWCONTENTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSFLOWCONTENTprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsmsflowcontent(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumsmsflowcontent( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSFLOWCONTENT实体
         * @return 影响的行数
         */
		public int update_mvnforumsmsflowcontent(mvnforumsmsflowcontent_Dao _MVNFORUMSMSFLOWCONTENTModel)  throws Exception{
        return _dal.update_mvnforumsmsflowcontent( _MVNFORUMSMSFLOWCONTENTModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMSMSFLOWCONTENT中的一条记录
         * @param MVNFORUMSMSFLOWCONTENT实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsmsflowcontent(int Flowcontentid)  throws Exception{
        return _dal.delete_mvnforumsmsflowcontent( Flowcontentid);
		}

		

       
          /**
         * 得到 mvnforumsmsflowcontent 数据实体
         * @param Flowcontentid">Flowcontentid
         * @return<mvnforumsmsflowcontent 数据实体
        * @throws Exception 
         */
		public mvnforumsmsflowcontent_Dao get_mvnforumsmsflowcontentDao(int Flowcontentid) throws Exception{
        return _dal.get_mvnforumsmsflowcontentDao( Flowcontentid);
		}
		
		    /**
         * 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
         * @param MVNFORUMSMSFLOWCONTENT row
         * @returnMVNFORUMSMSFLOWCONTENTList对象
        * @throws Exception 
         */
		public List<mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_All() throws Exception{
            return _dal.get_mvnforumsmsflowcontent_All();
            }
		    /**
         * 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
         * @param MVNFORUMSMSFLOWCONTENT row
         * @returnMVNFORUMSMSFLOWCONTENTList对象
        * @throws Exception 
         */
		public List<mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_All(String strWhere) throws Exception{
            return _dal.get_mvnforumsmsflowcontent_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumsmsflowcontent_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMSMSFLOWCONTENT返回的查询DataRow创建一个MVNFORUMSMSFLOWCONTENTEntity对象
         * @param MVNFORUMSMSFLOWCONTENT row
         * @returnMVNFORUMSMSFLOWCONTENTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumsmsflowcontent_Dao> get_mvnforumsmsflowcontent_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumsmsflowcontent_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMSMSFLOWCONTENT字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumsmsflowcontent_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumsmsflowcontent_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMSMSFLOWCONTENTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumsmsflowcontent_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumsmsflowcontent_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMSMSFLOWCONTENTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumsmsflowcontent_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumsmsflowcontent_UpdateString( FieldName, Value, sid);
            }
        
        
    }
