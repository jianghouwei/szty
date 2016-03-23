/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp32.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp32_Dao;
import com.szty.aihao.core.aihaoiptmp32_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP32逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp32_service
	{
        public  aihaoiptmp32_core _dal=classFactory.getaihaoiptmp32();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP32实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp32 (aihaoiptmp32_Dao _AIHAOIPTMP32Model )  throws Exception{
         return _dal.insert_aihaoiptmp32( _AIHAOIPTMP32Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP32prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp32(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp32( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP32实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp32(aihaoiptmp32_Dao _AIHAOIPTMP32Model)  throws Exception{
        return _dal.update_aihaoiptmp32( _AIHAOIPTMP32Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP32中的一条记录
         * @param AIHAOIPTMP32实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp32(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp32( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp32 数据实体
         * @param Id">Id
         * @return<aihaoiptmp32 数据实体
        * @throws Exception 
         */
		public aihaoiptmp32_Dao get_aihaoiptmp32Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp32Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP32返回的查询DataRow创建一个AIHAOIPTMP32Entity对象
         * @param AIHAOIPTMP32 row
         * @returnAIHAOIPTMP32List对象
        * @throws Exception 
         */
		public List<aihaoiptmp32_Dao> get_aihaoiptmp32_All() throws Exception{
            return _dal.get_aihaoiptmp32_All();
            }
		    /**
         * 根据AIHAOIPTMP32返回的查询DataRow创建一个AIHAOIPTMP32Entity对象
         * @param AIHAOIPTMP32 row
         * @returnAIHAOIPTMP32List对象
        * @throws Exception 
         */
		public List<aihaoiptmp32_Dao> get_aihaoiptmp32_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp32_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp32_Dao> get_aihaoiptmp32_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp32_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP32返回的查询DataRow创建一个AIHAOIPTMP32Entity对象
         * @param AIHAOIPTMP32 row
         * @returnAIHAOIPTMP32Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp32_Dao> get_aihaoiptmp32_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp32_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP32字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp32_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp32_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP32Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp32_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp32_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP32IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp32_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp32_UpdateString( FieldName, Value, sid);
            }
        
        
    }
