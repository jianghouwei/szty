﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp15.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp15_Dao;
import com.szty.aihao.core.aihaoiptmp15_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP15逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp15_service
	{
        public  aihaoiptmp15_core _dal=classFactory.getaihaoiptmp15();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP15实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp15 (aihaoiptmp15_Dao _AIHAOIPTMP15Model )  throws Exception{
         return _dal.insert_aihaoiptmp15( _AIHAOIPTMP15Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP15prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp15(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp15( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP15实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp15(aihaoiptmp15_Dao _AIHAOIPTMP15Model)  throws Exception{
        return _dal.update_aihaoiptmp15( _AIHAOIPTMP15Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP15中的一条记录
         * @param AIHAOIPTMP15实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp15(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp15( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp15 数据实体
         * @param Id">Id
         * @return<aihaoiptmp15 数据实体
        * @throws Exception 
         */
		public aihaoiptmp15_Dao get_aihaoiptmp15Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp15Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP15返回的查询DataRow创建一个AIHAOIPTMP15Entity对象
         * @param AIHAOIPTMP15 row
         * @returnAIHAOIPTMP15List对象
        * @throws Exception 
         */
		public List<aihaoiptmp15_Dao> get_aihaoiptmp15_All() throws Exception{
            return _dal.get_aihaoiptmp15_All();
            }
		    /**
         * 根据AIHAOIPTMP15返回的查询DataRow创建一个AIHAOIPTMP15Entity对象
         * @param AIHAOIPTMP15 row
         * @returnAIHAOIPTMP15List对象
        * @throws Exception 
         */
		public List<aihaoiptmp15_Dao> get_aihaoiptmp15_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp15_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp15_Dao> get_aihaoiptmp15_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp15_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP15返回的查询DataRow创建一个AIHAOIPTMP15Entity对象
         * @param AIHAOIPTMP15 row
         * @returnAIHAOIPTMP15Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp15_Dao> get_aihaoiptmp15_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp15_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP15字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp15_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp15_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP15Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp15_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp15_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP15IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp15_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp15_UpdateString( FieldName, Value, sid);
            }
        
        
    }
