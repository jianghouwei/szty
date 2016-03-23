/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao20.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao20_Dao;
import com.szty.aihao.core.aihao20_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO20逻辑层接口
    *@作者：宋春林 
    */

	public class aihao20_service
	{
        public  aihao20_core _dal=classFactory.getaihao20();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO20实体
         * @return 新插入记录的编号
         */
		public int insert_aihao20 (aihao20_Dao _AIHAO20Model )  throws Exception{
         return _dal.insert_aihao20( _AIHAO20Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO20prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao20(Object[] _para)  throws Exception{
        return _dal.insert_aihao20( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO20实体
         * @return 影响的行数
         */
		public int update_aihao20(aihao20_Dao _AIHAO20Model)  throws Exception{
        return _dal.update_aihao20( _AIHAO20Model);
		}
	
		

         /**
         *  删除数据表AIHAO20中的一条记录
         * @param AIHAO20实体
         * @return 新插入记录的编号
         */
		public int delete_aihao20(int Id)  throws Exception{
        return _dal.delete_aihao20( Id);
		}

		

       
          /**
         * 得到 aihao20 数据实体
         * @param Id">Id
         * @return<aihao20 数据实体
        * @throws Exception 
         */
		public aihao20_Dao get_aihao20Dao(int Id) throws Exception{
        return _dal.get_aihao20Dao( Id);
		}
		
		    /**
         * 根据AIHAO20返回的查询DataRow创建一个AIHAO20Entity对象
         * @param AIHAO20 row
         * @returnAIHAO20List对象
        * @throws Exception 
         */
		public List<aihao20_Dao> get_aihao20_All() throws Exception{
            return _dal.get_aihao20_All();
            }
		    /**
         * 根据AIHAO20返回的查询DataRow创建一个AIHAO20Entity对象
         * @param AIHAO20 row
         * @returnAIHAO20List对象
        * @throws Exception 
         */
		public List<aihao20_Dao> get_aihao20_All(String strWhere) throws Exception{
            return _dal.get_aihao20_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao20_Dao> get_aihao20_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao20_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO20返回的查询DataRow创建一个AIHAO20Entity对象
         * @param AIHAO20 row
         * @returnAIHAO20Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao20_Dao> get_aihao20_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao20_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO20字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao20_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao20_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO20Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao20_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao20_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO20IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao20_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao20_UpdateString( FieldName, Value, sid);
            }
        
        
    }
