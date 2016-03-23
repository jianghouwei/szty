/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp21.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp21_Dao;
import com.szty.aihao.core.aihaoiptmp21_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP21逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp21_service
	{
        public  aihaoiptmp21_core _dal=classFactory.getaihaoiptmp21();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP21实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp21 (aihaoiptmp21_Dao _AIHAOIPTMP21Model )  throws Exception{
         return _dal.insert_aihaoiptmp21( _AIHAOIPTMP21Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP21prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp21(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp21( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP21实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp21(aihaoiptmp21_Dao _AIHAOIPTMP21Model)  throws Exception{
        return _dal.update_aihaoiptmp21( _AIHAOIPTMP21Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP21中的一条记录
         * @param AIHAOIPTMP21实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp21(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp21( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp21 数据实体
         * @param Id">Id
         * @return<aihaoiptmp21 数据实体
        * @throws Exception 
         */
		public aihaoiptmp21_Dao get_aihaoiptmp21Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp21Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP21返回的查询DataRow创建一个AIHAOIPTMP21Entity对象
         * @param AIHAOIPTMP21 row
         * @returnAIHAOIPTMP21List对象
        * @throws Exception 
         */
		public List<aihaoiptmp21_Dao> get_aihaoiptmp21_All() throws Exception{
            return _dal.get_aihaoiptmp21_All();
            }
		    /**
         * 根据AIHAOIPTMP21返回的查询DataRow创建一个AIHAOIPTMP21Entity对象
         * @param AIHAOIPTMP21 row
         * @returnAIHAOIPTMP21List对象
        * @throws Exception 
         */
		public List<aihaoiptmp21_Dao> get_aihaoiptmp21_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp21_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp21_Dao> get_aihaoiptmp21_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp21_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP21返回的查询DataRow创建一个AIHAOIPTMP21Entity对象
         * @param AIHAOIPTMP21 row
         * @returnAIHAOIPTMP21Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp21_Dao> get_aihaoiptmp21_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp21_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP21字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp21_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp21_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP21Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp21_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp21_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP21IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp21_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp21_UpdateString( FieldName, Value, sid);
            }
        
        
    }
