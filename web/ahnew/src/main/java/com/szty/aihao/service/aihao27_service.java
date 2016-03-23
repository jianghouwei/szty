/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao27.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao27_Dao;
import com.szty.aihao.core.aihao27_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO27逻辑层接口
    *@作者：宋春林 
    */

	public class aihao27_service
	{
        public  aihao27_core _dal=classFactory.getaihao27();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO27实体
         * @return 新插入记录的编号
         */
		public int insert_aihao27 (aihao27_Dao _AIHAO27Model )  throws Exception{
         return _dal.insert_aihao27( _AIHAO27Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO27prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao27(Object[] _para)  throws Exception{
        return _dal.insert_aihao27( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO27实体
         * @return 影响的行数
         */
		public int update_aihao27(aihao27_Dao _AIHAO27Model)  throws Exception{
        return _dal.update_aihao27( _AIHAO27Model);
		}
	
		

         /**
         *  删除数据表AIHAO27中的一条记录
         * @param AIHAO27实体
         * @return 新插入记录的编号
         */
		public int delete_aihao27(int Id)  throws Exception{
        return _dal.delete_aihao27( Id);
		}

		

       
          /**
         * 得到 aihao27 数据实体
         * @param Id">Id
         * @return<aihao27 数据实体
        * @throws Exception 
         */
		public aihao27_Dao get_aihao27Dao(int Id) throws Exception{
        return _dal.get_aihao27Dao( Id);
		}
		
		    /**
         * 根据AIHAO27返回的查询DataRow创建一个AIHAO27Entity对象
         * @param AIHAO27 row
         * @returnAIHAO27List对象
        * @throws Exception 
         */
		public List<aihao27_Dao> get_aihao27_All() throws Exception{
            return _dal.get_aihao27_All();
            }
		    /**
         * 根据AIHAO27返回的查询DataRow创建一个AIHAO27Entity对象
         * @param AIHAO27 row
         * @returnAIHAO27List对象
        * @throws Exception 
         */
		public List<aihao27_Dao> get_aihao27_All(String strWhere) throws Exception{
            return _dal.get_aihao27_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao27_Dao> get_aihao27_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao27_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO27返回的查询DataRow创建一个AIHAO27Entity对象
         * @param AIHAO27 row
         * @returnAIHAO27Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao27_Dao> get_aihao27_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao27_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO27字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao27_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao27_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO27Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao27_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao27_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO27IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao27_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao27_UpdateString( FieldName, Value, sid);
            }
        
        
    }
