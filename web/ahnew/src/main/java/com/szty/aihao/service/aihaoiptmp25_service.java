/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp25.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp25_Dao;
import com.szty.aihao.core.aihaoiptmp25_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP25逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp25_service
	{
        public  aihaoiptmp25_core _dal=classFactory.getaihaoiptmp25();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP25实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp25 (aihaoiptmp25_Dao _AIHAOIPTMP25Model )  throws Exception{
         return _dal.insert_aihaoiptmp25( _AIHAOIPTMP25Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP25prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp25(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp25( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP25实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp25(aihaoiptmp25_Dao _AIHAOIPTMP25Model)  throws Exception{
        return _dal.update_aihaoiptmp25( _AIHAOIPTMP25Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP25中的一条记录
         * @param AIHAOIPTMP25实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp25(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp25( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp25 数据实体
         * @param Id">Id
         * @return<aihaoiptmp25 数据实体
        * @throws Exception 
         */
		public aihaoiptmp25_Dao get_aihaoiptmp25Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp25Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP25返回的查询DataRow创建一个AIHAOIPTMP25Entity对象
         * @param AIHAOIPTMP25 row
         * @returnAIHAOIPTMP25List对象
        * @throws Exception 
         */
		public List<aihaoiptmp25_Dao> get_aihaoiptmp25_All() throws Exception{
            return _dal.get_aihaoiptmp25_All();
            }
		    /**
         * 根据AIHAOIPTMP25返回的查询DataRow创建一个AIHAOIPTMP25Entity对象
         * @param AIHAOIPTMP25 row
         * @returnAIHAOIPTMP25List对象
        * @throws Exception 
         */
		public List<aihaoiptmp25_Dao> get_aihaoiptmp25_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp25_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp25_Dao> get_aihaoiptmp25_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp25_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP25返回的查询DataRow创建一个AIHAOIPTMP25Entity对象
         * @param AIHAOIPTMP25 row
         * @returnAIHAOIPTMP25Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp25_Dao> get_aihaoiptmp25_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp25_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP25字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp25_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp25_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP25Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp25_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp25_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP25IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp25_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp25_UpdateString( FieldName, Value, sid);
            }
        
        
    }
