/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumdownloadreslog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumdownloadreslog_Dao;
import com.szty.aihao.core.mvnforumdownloadreslog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMDOWNLOADRESLOG逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumdownloadreslog_service
	{
        public  mvnforumdownloadreslog_core _dal=classFactory.getmvnforumdownloadreslog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMDOWNLOADRESLOG实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumdownloadreslog (mvnforumdownloadreslog_Dao _MVNFORUMDOWNLOADRESLOGModel )  throws Exception{
         return _dal.insert_mvnforumdownloadreslog( _MVNFORUMDOWNLOADRESLOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMDOWNLOADRESLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumdownloadreslog(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumdownloadreslog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMDOWNLOADRESLOG实体
         * @return 影响的行数
         */
		public int update_mvnforumdownloadreslog(mvnforumdownloadreslog_Dao _MVNFORUMDOWNLOADRESLOGModel)  throws Exception{
        return _dal.update_mvnforumdownloadreslog( _MVNFORUMDOWNLOADRESLOGModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMDOWNLOADRESLOG中的一条记录
         * @param MVNFORUMDOWNLOADRESLOG实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumdownloadreslog(int Logid)  throws Exception{
        return _dal.delete_mvnforumdownloadreslog( Logid);
		}

		

       
          /**
         * 得到 mvnforumdownloadreslog 数据实体
         * @param Logid">Logid
         * @return<mvnforumdownloadreslog 数据实体
        * @throws Exception 
         */
		public mvnforumdownloadreslog_Dao get_mvnforumdownloadreslogDao(int Logid) throws Exception{
        return _dal.get_mvnforumdownloadreslogDao( Logid);
		}
		
		    /**
         * 根据MVNFORUMDOWNLOADRESLOG返回的查询DataRow创建一个MVNFORUMDOWNLOADRESLOGEntity对象
         * @param MVNFORUMDOWNLOADRESLOG row
         * @returnMVNFORUMDOWNLOADRESLOGList对象
        * @throws Exception 
         */
		public List<mvnforumdownloadreslog_Dao> get_mvnforumdownloadreslog_All() throws Exception{
            return _dal.get_mvnforumdownloadreslog_All();
            }
		    /**
         * 根据MVNFORUMDOWNLOADRESLOG返回的查询DataRow创建一个MVNFORUMDOWNLOADRESLOGEntity对象
         * @param MVNFORUMDOWNLOADRESLOG row
         * @returnMVNFORUMDOWNLOADRESLOGList对象
        * @throws Exception 
         */
		public List<mvnforumdownloadreslog_Dao> get_mvnforumdownloadreslog_All(String strWhere) throws Exception{
            return _dal.get_mvnforumdownloadreslog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumdownloadreslog_Dao> get_mvnforumdownloadreslog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumdownloadreslog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMDOWNLOADRESLOG返回的查询DataRow创建一个MVNFORUMDOWNLOADRESLOGEntity对象
         * @param MVNFORUMDOWNLOADRESLOG row
         * @returnMVNFORUMDOWNLOADRESLOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumdownloadreslog_Dao> get_mvnforumdownloadreslog_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumdownloadreslog_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMDOWNLOADRESLOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumdownloadreslog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumdownloadreslog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMDOWNLOADRESLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumdownloadreslog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumdownloadreslog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMDOWNLOADRESLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumdownloadreslog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumdownloadreslog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
