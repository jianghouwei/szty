﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGamerequestlog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.gamerequestlog_Dao;
import com.szty.aihao.core.gamerequestlog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GAMEREQUESTLOG逻辑层接口
    *@作者：宋春林 
    */

	public class gamerequestlog_service
	{
        public  gamerequestlog_core _dal=classFactory.getgamerequestlog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param GAMEREQUESTLOG实体
         * @return 新插入记录的编号
         */
		public int insert_gamerequestlog (gamerequestlog_Dao _GAMEREQUESTLOGModel )  throws Exception{
         return _dal.insert_gamerequestlog( _GAMEREQUESTLOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param GAMEREQUESTLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_gamerequestlog(Object[] _para)  throws Exception{
        return _dal.insert_gamerequestlog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param GAMEREQUESTLOG实体
         * @return 影响的行数
         */
		public int update_gamerequestlog(gamerequestlog_Dao _GAMEREQUESTLOGModel)  throws Exception{
        return _dal.update_gamerequestlog( _GAMEREQUESTLOGModel);
		}
	
		

         /**
         *  删除数据表GAMEREQUESTLOG中的一条记录
         * @param GAMEREQUESTLOG实体
         * @return 新插入记录的编号
         */
		public int delete_gamerequestlog(int Logid)  throws Exception{
        return _dal.delete_gamerequestlog( Logid);
		}

		

       
          /**
         * 得到 gamerequestlog 数据实体
         * @param Logid">Logid
         * @return<gamerequestlog 数据实体
        * @throws Exception 
         */
		public gamerequestlog_Dao get_gamerequestlogDao(int Logid) throws Exception{
        return _dal.get_gamerequestlogDao( Logid);
		}
		
		    /**
         * 根据GAMEREQUESTLOG返回的查询DataRow创建一个GAMEREQUESTLOGEntity对象
         * @param GAMEREQUESTLOG row
         * @returnGAMEREQUESTLOGList对象
        * @throws Exception 
         */
		public List<gamerequestlog_Dao> get_gamerequestlog_All() throws Exception{
            return _dal.get_gamerequestlog_All();
            }
		    /**
         * 根据GAMEREQUESTLOG返回的查询DataRow创建一个GAMEREQUESTLOGEntity对象
         * @param GAMEREQUESTLOG row
         * @returnGAMEREQUESTLOGList对象
        * @throws Exception 
         */
		public List<gamerequestlog_Dao> get_gamerequestlog_All(String strWhere) throws Exception{
            return _dal.get_gamerequestlog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<gamerequestlog_Dao> get_gamerequestlog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_gamerequestlog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据GAMEREQUESTLOG返回的查询DataRow创建一个GAMEREQUESTLOGEntity对象
         * @param GAMEREQUESTLOG row
         * @returnGAMEREQUESTLOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, gamerequestlog_Dao> get_gamerequestlog_Dictionary(String strWhere) throws Exception{
            return _dal.get_gamerequestlog_Dictionary(strWhere);
            }
		 /**
         * 更新GAMEREQUESTLOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_gamerequestlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_gamerequestlog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新GAMEREQUESTLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_gamerequestlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_gamerequestlog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新GAMEREQUESTLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int creategamerequestlog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_gamerequestlog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
