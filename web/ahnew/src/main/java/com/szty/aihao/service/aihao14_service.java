﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao14.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao14_Dao;
import com.szty.aihao.core.aihao14_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO14逻辑层接口
    *@作者：宋春林 
    */

	public class aihao14_service
	{
        public  aihao14_core _dal=classFactory.getaihao14();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO14实体
         * @return 新插入记录的编号
         */
		public int insert_aihao14 (aihao14_Dao _AIHAO14Model )  throws Exception{
         return _dal.insert_aihao14( _AIHAO14Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO14prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao14(Object[] _para)  throws Exception{
        return _dal.insert_aihao14( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO14实体
         * @return 影响的行数
         */
		public int update_aihao14(aihao14_Dao _AIHAO14Model)  throws Exception{
        return _dal.update_aihao14( _AIHAO14Model);
		}
	
		

         /**
         *  删除数据表AIHAO14中的一条记录
         * @param AIHAO14实体
         * @return 新插入记录的编号
         */
		public int delete_aihao14(int Id)  throws Exception{
        return _dal.delete_aihao14( Id);
		}

		

       
          /**
         * 得到 aihao14 数据实体
         * @param Id">Id
         * @return<aihao14 数据实体
        * @throws Exception 
         */
		public aihao14_Dao get_aihao14Dao(int Id) throws Exception{
        return _dal.get_aihao14Dao( Id);
		}
		
		    /**
         * 根据AIHAO14返回的查询DataRow创建一个AIHAO14Entity对象
         * @param AIHAO14 row
         * @returnAIHAO14List对象
        * @throws Exception 
         */
		public List<aihao14_Dao> get_aihao14_All() throws Exception{
            return _dal.get_aihao14_All();
            }
		    /**
         * 根据AIHAO14返回的查询DataRow创建一个AIHAO14Entity对象
         * @param AIHAO14 row
         * @returnAIHAO14List对象
        * @throws Exception 
         */
		public List<aihao14_Dao> get_aihao14_All(String strWhere) throws Exception{
            return _dal.get_aihao14_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao14_Dao> get_aihao14_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao14_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO14返回的查询DataRow创建一个AIHAO14Entity对象
         * @param AIHAO14 row
         * @returnAIHAO14Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao14_Dao> get_aihao14_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao14_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO14字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao14_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao14_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO14Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao14_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao14_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO14IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao14_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao14_UpdateString( FieldName, Value, sid);
            }
        
        
    }
