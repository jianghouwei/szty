﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumhlldownlog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumhlldownlog_Dao;
import com.szty.aihao.core.mvnforumhlldownlog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMHLLDOWNLOG逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumhlldownlog_service
	{
        public  mvnforumhlldownlog_core _dal=classFactory.getmvnforumhlldownlog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMHLLDOWNLOG实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumhlldownlog (mvnforumhlldownlog_Dao _MVNFORUMHLLDOWNLOGModel )  throws Exception{
         return _dal.insert_mvnforumhlldownlog( _MVNFORUMHLLDOWNLOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMHLLDOWNLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumhlldownlog(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumhlldownlog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMHLLDOWNLOG实体
         * @return 影响的行数
         */
		public int update_mvnforumhlldownlog(mvnforumhlldownlog_Dao _MVNFORUMHLLDOWNLOGModel)  throws Exception{
        return _dal.update_mvnforumhlldownlog( _MVNFORUMHLLDOWNLOGModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMHLLDOWNLOG中的一条记录
         * @param MVNFORUMHLLDOWNLOG实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumhlldownlog(int Downloadid)  throws Exception{
        return _dal.delete_mvnforumhlldownlog( Downloadid);
		}

		

       
          /**
         * 得到 mvnforumhlldownlog 数据实体
         * @param Downloadid">Downloadid
         * @return<mvnforumhlldownlog 数据实体
        * @throws Exception 
         */
		public mvnforumhlldownlog_Dao get_mvnforumhlldownlogDao(int Downloadid) throws Exception{
        return _dal.get_mvnforumhlldownlogDao( Downloadid);
		}
		
		    /**
         * 根据MVNFORUMHLLDOWNLOG返回的查询DataRow创建一个MVNFORUMHLLDOWNLOGEntity对象
         * @param MVNFORUMHLLDOWNLOG row
         * @returnMVNFORUMHLLDOWNLOGList对象
        * @throws Exception 
         */
		public List<mvnforumhlldownlog_Dao> get_mvnforumhlldownlog_All() throws Exception{
            return _dal.get_mvnforumhlldownlog_All();
            }
		    /**
         * 根据MVNFORUMHLLDOWNLOG返回的查询DataRow创建一个MVNFORUMHLLDOWNLOGEntity对象
         * @param MVNFORUMHLLDOWNLOG row
         * @returnMVNFORUMHLLDOWNLOGList对象
        * @throws Exception 
         */
		public List<mvnforumhlldownlog_Dao> get_mvnforumhlldownlog_All(String strWhere) throws Exception{
            return _dal.get_mvnforumhlldownlog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumhlldownlog_Dao> get_mvnforumhlldownlog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumhlldownlog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMHLLDOWNLOG返回的查询DataRow创建一个MVNFORUMHLLDOWNLOGEntity对象
         * @param MVNFORUMHLLDOWNLOG row
         * @returnMVNFORUMHLLDOWNLOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumhlldownlog_Dao> get_mvnforumhlldownlog_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumhlldownlog_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMHLLDOWNLOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumhlldownlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumhlldownlog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMHLLDOWNLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumhlldownlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumhlldownlog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMHLLDOWNLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumhlldownlog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumhlldownlog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
