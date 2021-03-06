﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness10.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness10_Dao;
import com.szty.aihao.core.aihaobusiness10_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS10逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness10_service
	{
        public  aihaobusiness10_core _dal=classFactory.getaihaobusiness10();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS10实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness10 (aihaobusiness10_Dao _AIHAOBUSINESS10Model )  throws Exception{
         return _dal.insert_aihaobusiness10( _AIHAOBUSINESS10Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS10prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness10(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness10( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS10实体
         * @return 影响的行数
         */
		public int update_aihaobusiness10(aihaobusiness10_Dao _AIHAOBUSINESS10Model)  throws Exception{
        return _dal.update_aihaobusiness10( _AIHAOBUSINESS10Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS10中的一条记录
         * @param AIHAOBUSINESS10实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness10(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness10( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness10 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness10 数据实体
        * @throws Exception 
         */
		public aihaobusiness10_Dao get_aihaobusiness10Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness10Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS10返回的查询DataRow创建一个AIHAOBUSINESS10Entity对象
         * @param AIHAOBUSINESS10 row
         * @returnAIHAOBUSINESS10List对象
        * @throws Exception 
         */
		public List<aihaobusiness10_Dao> get_aihaobusiness10_All() throws Exception{
            return _dal.get_aihaobusiness10_All();
            }
		    /**
         * 根据AIHAOBUSINESS10返回的查询DataRow创建一个AIHAOBUSINESS10Entity对象
         * @param AIHAOBUSINESS10 row
         * @returnAIHAOBUSINESS10List对象
        * @throws Exception 
         */
		public List<aihaobusiness10_Dao> get_aihaobusiness10_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness10_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness10_Dao> get_aihaobusiness10_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness10_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS10返回的查询DataRow创建一个AIHAOBUSINESS10Entity对象
         * @param AIHAOBUSINESS10 row
         * @returnAIHAOBUSINESS10Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness10_Dao> get_aihaobusiness10_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness10_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS10字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness10_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness10_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS10Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness10_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness10_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS10IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness10_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness10_UpdateString( FieldName, Value, sid);
            }
        
        
    }
