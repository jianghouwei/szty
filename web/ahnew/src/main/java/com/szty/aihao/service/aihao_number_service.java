﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao_number.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao_number_Dao;
import com.szty.aihao.core.aihao_number_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO_NUMBER逻辑层接口
    *@作者：宋春林 
    */

	public class aihao_number_service
	{
        public  aihao_number_core _dal=classFactory.getaihao_number();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBER实体
         * @return 新插入记录的编号
         */
		public int insert_aihao_number (aihao_number_Dao _AIHAO_NUMBERModel )  throws Exception{
         return _dal.insert_aihao_number( _AIHAO_NUMBERModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBERprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao_number(Object[] _para)  throws Exception{
        return _dal.insert_aihao_number( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBER实体
         * @return 影响的行数
         */
		public int update_aihao_number(aihao_number_Dao _AIHAO_NUMBERModel)  throws Exception{
        return _dal.update_aihao_number( _AIHAO_NUMBERModel);
		}
	
		

         /**
         *  删除数据表AIHAO_NUMBER中的一条记录
         * @param AIHAO_NUMBER实体
         * @return 新插入记录的编号
         */
		public int delete_aihao_number(int Id)  throws Exception{
        return _dal.delete_aihao_number( Id);
		}

		

       
          /**
         * 得到 aihao_number 数据实体
         * @param Id">Id
         * @return<aihao_number 数据实体
        * @throws Exception 
         */
		public aihao_number_Dao get_aihao_numberDao(int Id) throws Exception{
        return _dal.get_aihao_numberDao( Id);
		}
		
		    /**
         * 根据AIHAO_NUMBER返回的查询DataRow创建一个AIHAO_NUMBEREntity对象
         * @param AIHAO_NUMBER row
         * @returnAIHAO_NUMBERList对象
        * @throws Exception 
         */
		public List<aihao_number_Dao> get_aihao_number_All() throws Exception{
            return _dal.get_aihao_number_All();
            }
		    /**
         * 根据AIHAO_NUMBER返回的查询DataRow创建一个AIHAO_NUMBEREntity对象
         * @param AIHAO_NUMBER row
         * @returnAIHAO_NUMBERList对象
        * @throws Exception 
         */
		public List<aihao_number_Dao> get_aihao_number_All(String strWhere) throws Exception{
            return _dal.get_aihao_number_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao_number_Dao> get_aihao_number_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao_number_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO_NUMBER返回的查询DataRow创建一个AIHAO_NUMBEREntity对象
         * @param AIHAO_NUMBER row
         * @returnAIHAO_NUMBERDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao_number_Dao> get_aihao_number_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao_number_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO_NUMBER字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao_number_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao_number_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO_NUMBERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao_number_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao_number_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO_NUMBERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao_number_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao_number_UpdateString( FieldName, Value, sid);
            }
        
        
    }
