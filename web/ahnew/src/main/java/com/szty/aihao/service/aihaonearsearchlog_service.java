﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaonearsearchlog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaonearsearchlog_Dao;
import com.szty.aihao.core.aihaonearsearchlog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAONEARSEARCHLOG逻辑层接口
    *@作者：宋春林 
    */

	public class aihaonearsearchlog_service
	{
        public  aihaonearsearchlog_core _dal=classFactory.getaihaonearsearchlog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAONEARSEARCHLOG实体
         * @return 新插入记录的编号
         */
		public int insert_aihaonearsearchlog (aihaonearsearchlog_Dao _AIHAONEARSEARCHLOGModel )  throws Exception{
         return _dal.insert_aihaonearsearchlog( _AIHAONEARSEARCHLOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAONEARSEARCHLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaonearsearchlog(Object[] _para)  throws Exception{
        return _dal.insert_aihaonearsearchlog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAONEARSEARCHLOG实体
         * @return 影响的行数
         */
		public int update_aihaonearsearchlog(aihaonearsearchlog_Dao _AIHAONEARSEARCHLOGModel)  throws Exception{
        return _dal.update_aihaonearsearchlog( _AIHAONEARSEARCHLOGModel);
		}
	
		

         /**
         *  删除数据表AIHAONEARSEARCHLOG中的一条记录
         * @param AIHAONEARSEARCHLOG实体
         * @return 新插入记录的编号
         */
		public int delete_aihaonearsearchlog(int Logid)  throws Exception{
        return _dal.delete_aihaonearsearchlog( Logid);
		}

		

       
          /**
         * 得到 aihaonearsearchlog 数据实体
         * @param Logid">Logid
         * @return<aihaonearsearchlog 数据实体
        * @throws Exception 
         */
		public aihaonearsearchlog_Dao get_aihaonearsearchlogDao(int Logid) throws Exception{
        return _dal.get_aihaonearsearchlogDao( Logid);
		}
		
		    /**
         * 根据AIHAONEARSEARCHLOG返回的查询DataRow创建一个AIHAONEARSEARCHLOGEntity对象
         * @param AIHAONEARSEARCHLOG row
         * @returnAIHAONEARSEARCHLOGList对象
        * @throws Exception 
         */
		public List<aihaonearsearchlog_Dao> get_aihaonearsearchlog_All() throws Exception{
            return _dal.get_aihaonearsearchlog_All();
            }
		    /**
         * 根据AIHAONEARSEARCHLOG返回的查询DataRow创建一个AIHAONEARSEARCHLOGEntity对象
         * @param AIHAONEARSEARCHLOG row
         * @returnAIHAONEARSEARCHLOGList对象
        * @throws Exception 
         */
		public List<aihaonearsearchlog_Dao> get_aihaonearsearchlog_All(String strWhere) throws Exception{
            return _dal.get_aihaonearsearchlog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaonearsearchlog_Dao> get_aihaonearsearchlog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaonearsearchlog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAONEARSEARCHLOG返回的查询DataRow创建一个AIHAONEARSEARCHLOGEntity对象
         * @param AIHAONEARSEARCHLOG row
         * @returnAIHAONEARSEARCHLOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaonearsearchlog_Dao> get_aihaonearsearchlog_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaonearsearchlog_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAONEARSEARCHLOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaonearsearchlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaonearsearchlog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAONEARSEARCHLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaonearsearchlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaonearsearchlog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAONEARSEARCHLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaonearsearchlog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaonearsearchlog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
