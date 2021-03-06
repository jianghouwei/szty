﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao31.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao31_Dao;
import com.szty.aihao.core.aihao31_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO31逻辑层接口
    *@作者：宋春林 
    */

	public class aihao31_service
	{
        public  aihao31_core _dal=classFactory.getaihao31();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO31实体
         * @return 新插入记录的编号
         */
		public int insert_aihao31 (aihao31_Dao _AIHAO31Model )  throws Exception{
         return _dal.insert_aihao31( _AIHAO31Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO31prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao31(Object[] _para)  throws Exception{
        return _dal.insert_aihao31( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO31实体
         * @return 影响的行数
         */
		public int update_aihao31(aihao31_Dao _AIHAO31Model)  throws Exception{
        return _dal.update_aihao31( _AIHAO31Model);
		}
	
		

         /**
         *  删除数据表AIHAO31中的一条记录
         * @param AIHAO31实体
         * @return 新插入记录的编号
         */
		public int delete_aihao31(int Id)  throws Exception{
        return _dal.delete_aihao31( Id);
		}

		

       
          /**
         * 得到 aihao31 数据实体
         * @param Id">Id
         * @return<aihao31 数据实体
        * @throws Exception 
         */
		public aihao31_Dao get_aihao31Dao(int Id) throws Exception{
        return _dal.get_aihao31Dao( Id);
		}
		
		    /**
         * 根据AIHAO31返回的查询DataRow创建一个AIHAO31Entity对象
         * @param AIHAO31 row
         * @returnAIHAO31List对象
        * @throws Exception 
         */
		public List<aihao31_Dao> get_aihao31_All() throws Exception{
            return _dal.get_aihao31_All();
            }
		    /**
         * 根据AIHAO31返回的查询DataRow创建一个AIHAO31Entity对象
         * @param AIHAO31 row
         * @returnAIHAO31List对象
        * @throws Exception 
         */
		public List<aihao31_Dao> get_aihao31_All(String strWhere) throws Exception{
            return _dal.get_aihao31_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao31_Dao> get_aihao31_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao31_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO31返回的查询DataRow创建一个AIHAO31Entity对象
         * @param AIHAO31 row
         * @returnAIHAO31Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao31_Dao> get_aihao31_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao31_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO31字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao31_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao31_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO31Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao31_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao31_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO31IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao31_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao31_UpdateString( FieldName, Value, sid);
            }
        
        
    }
