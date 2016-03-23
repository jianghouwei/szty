/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp36.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp36_Dao;
import com.szty.aihao.core.aihaoiptmp36_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP36逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp36_service
	{
        public  aihaoiptmp36_core _dal=classFactory.getaihaoiptmp36();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP36实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp36 (aihaoiptmp36_Dao _AIHAOIPTMP36Model )  throws Exception{
         return _dal.insert_aihaoiptmp36( _AIHAOIPTMP36Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP36prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp36(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp36( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP36实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp36(aihaoiptmp36_Dao _AIHAOIPTMP36Model)  throws Exception{
        return _dal.update_aihaoiptmp36( _AIHAOIPTMP36Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP36中的一条记录
         * @param AIHAOIPTMP36实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp36(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp36( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp36 数据实体
         * @param Id">Id
         * @return<aihaoiptmp36 数据实体
        * @throws Exception 
         */
		public aihaoiptmp36_Dao get_aihaoiptmp36Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp36Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP36返回的查询DataRow创建一个AIHAOIPTMP36Entity对象
         * @param AIHAOIPTMP36 row
         * @returnAIHAOIPTMP36List对象
        * @throws Exception 
         */
		public List<aihaoiptmp36_Dao> get_aihaoiptmp36_All() throws Exception{
            return _dal.get_aihaoiptmp36_All();
            }
		    /**
         * 根据AIHAOIPTMP36返回的查询DataRow创建一个AIHAOIPTMP36Entity对象
         * @param AIHAOIPTMP36 row
         * @returnAIHAOIPTMP36List对象
        * @throws Exception 
         */
		public List<aihaoiptmp36_Dao> get_aihaoiptmp36_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp36_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp36_Dao> get_aihaoiptmp36_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp36_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP36返回的查询DataRow创建一个AIHAOIPTMP36Entity对象
         * @param AIHAOIPTMP36 row
         * @returnAIHAOIPTMP36Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp36_Dao> get_aihaoiptmp36_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp36_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP36字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp36_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp36_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP36Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp36_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp36_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP36IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp36_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp36_UpdateString( FieldName, Value, sid);
            }
        
        
    }
