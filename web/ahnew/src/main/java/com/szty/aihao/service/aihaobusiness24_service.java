﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness24.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness24_Dao;
import com.szty.aihao.core.aihaobusiness24_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS24逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness24_service
	{
        public  aihaobusiness24_core _dal=classFactory.getaihaobusiness24();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS24实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness24 (aihaobusiness24_Dao _AIHAOBUSINESS24Model )  throws Exception{
         return _dal.insert_aihaobusiness24( _AIHAOBUSINESS24Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS24prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness24(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness24( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS24实体
         * @return 影响的行数
         */
		public int update_aihaobusiness24(aihaobusiness24_Dao _AIHAOBUSINESS24Model)  throws Exception{
        return _dal.update_aihaobusiness24( _AIHAOBUSINESS24Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS24中的一条记录
         * @param AIHAOBUSINESS24实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness24(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness24( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness24 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness24 数据实体
        * @throws Exception 
         */
		public aihaobusiness24_Dao get_aihaobusiness24Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness24Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS24返回的查询DataRow创建一个AIHAOBUSINESS24Entity对象
         * @param AIHAOBUSINESS24 row
         * @returnAIHAOBUSINESS24List对象
        * @throws Exception 
         */
		public List<aihaobusiness24_Dao> get_aihaobusiness24_All() throws Exception{
            return _dal.get_aihaobusiness24_All();
            }
		    /**
         * 根据AIHAOBUSINESS24返回的查询DataRow创建一个AIHAOBUSINESS24Entity对象
         * @param AIHAOBUSINESS24 row
         * @returnAIHAOBUSINESS24List对象
        * @throws Exception 
         */
		public List<aihaobusiness24_Dao> get_aihaobusiness24_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness24_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness24_Dao> get_aihaobusiness24_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness24_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS24返回的查询DataRow创建一个AIHAOBUSINESS24Entity对象
         * @param AIHAOBUSINESS24 row
         * @returnAIHAOBUSINESS24Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness24_Dao> get_aihaobusiness24_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness24_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS24字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness24_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness24_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS24Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness24_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness24_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS24IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness24_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness24_UpdateString( FieldName, Value, sid);
            }
        
        
    }
