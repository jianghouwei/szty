﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTwittertopics.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.twittertopics_Dao;
import com.szty.aihao.core.twittertopics_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TWITTERTOPICS逻辑层接口
    *@作者：宋春林 
    */

	public class twittertopics_service
	{
        public  twittertopics_core _dal=classFactory.gettwittertopics();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TWITTERTOPICS实体
         * @return 新插入记录的编号
         */
		public int insert_twittertopics (twittertopics_Dao _TWITTERTOPICSModel )  throws Exception{
         return _dal.insert_twittertopics( _TWITTERTOPICSModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TWITTERTOPICSprrameter
         * @return 新插入记录的编号
         */
         public int insert_twittertopics(Object[] _para)  throws Exception{
        return _dal.insert_twittertopics( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TWITTERTOPICS实体
         * @return 影响的行数
         */
		public int update_twittertopics(twittertopics_Dao _TWITTERTOPICSModel)  throws Exception{
        return _dal.update_twittertopics( _TWITTERTOPICSModel);
		}
	
		

         /**
         *  删除数据表TWITTERTOPICS中的一条记录
         * @param TWITTERTOPICS实体
         * @return 新插入记录的编号
         */
		public int delete_twittertopics(int Topicsid)  throws Exception{
        return _dal.delete_twittertopics( Topicsid);
		}

		

       
          /**
         * 得到 twittertopics 数据实体
         * @param Topicsid">Topicsid
         * @return<twittertopics 数据实体
        * @throws Exception 
         */
		public twittertopics_Dao get_twittertopicsDao(int Topicsid) throws Exception{
        return _dal.get_twittertopicsDao( Topicsid);
		}
		
		    /**
         * 根据TWITTERTOPICS返回的查询DataRow创建一个TWITTERTOPICSEntity对象
         * @param TWITTERTOPICS row
         * @returnTWITTERTOPICSList对象
        * @throws Exception 
         */
		public List<twittertopics_Dao> get_twittertopics_All() throws Exception{
            return _dal.get_twittertopics_All();
            }
		    /**
         * 根据TWITTERTOPICS返回的查询DataRow创建一个TWITTERTOPICSEntity对象
         * @param TWITTERTOPICS row
         * @returnTWITTERTOPICSList对象
        * @throws Exception 
         */
		public List<twittertopics_Dao> get_twittertopics_All(String strWhere) throws Exception{
            return _dal.get_twittertopics_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<twittertopics_Dao> get_twittertopics_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_twittertopics_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TWITTERTOPICS返回的查询DataRow创建一个TWITTERTOPICSEntity对象
         * @param TWITTERTOPICS row
         * @returnTWITTERTOPICSDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, twittertopics_Dao> get_twittertopics_Dictionary(String strWhere) throws Exception{
            return _dal.get_twittertopics_Dictionary(strWhere);
            }
		 /**
         * 更新TWITTERTOPICS字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_twittertopics_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_twittertopics_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TWITTERTOPICSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_twittertopics_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_twittertopics_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TWITTERTOPICSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtwittertopics_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_twittertopics_UpdateString( FieldName, Value, sid);
            }
        
        
    }
