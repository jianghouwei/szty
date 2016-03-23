/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao37.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao37_Dao;
import com.szty.aihao.core.aihao37_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO37逻辑层接口
    *@作者：宋春林 
    */

	public class aihao37_service
	{
        public  aihao37_core _dal=classFactory.getaihao37();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO37实体
         * @return 新插入记录的编号
         */
		public int insert_aihao37 (aihao37_Dao _AIHAO37Model )  throws Exception{
         return _dal.insert_aihao37( _AIHAO37Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO37prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao37(Object[] _para)  throws Exception{
        return _dal.insert_aihao37( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO37实体
         * @return 影响的行数
         */
		public int update_aihao37(aihao37_Dao _AIHAO37Model)  throws Exception{
        return _dal.update_aihao37( _AIHAO37Model);
		}
	
		

         /**
         *  删除数据表AIHAO37中的一条记录
         * @param AIHAO37实体
         * @return 新插入记录的编号
         */
		public int delete_aihao37(int Id)  throws Exception{
        return _dal.delete_aihao37( Id);
		}

		

       
          /**
         * 得到 aihao37 数据实体
         * @param Id">Id
         * @return<aihao37 数据实体
        * @throws Exception 
         */
		public aihao37_Dao get_aihao37Dao(int Id) throws Exception{
        return _dal.get_aihao37Dao( Id);
		}
		
		    /**
         * 根据AIHAO37返回的查询DataRow创建一个AIHAO37Entity对象
         * @param AIHAO37 row
         * @returnAIHAO37List对象
        * @throws Exception 
         */
		public List<aihao37_Dao> get_aihao37_All() throws Exception{
            return _dal.get_aihao37_All();
            }
		    /**
         * 根据AIHAO37返回的查询DataRow创建一个AIHAO37Entity对象
         * @param AIHAO37 row
         * @returnAIHAO37List对象
        * @throws Exception 
         */
		public List<aihao37_Dao> get_aihao37_All(String strWhere) throws Exception{
            return _dal.get_aihao37_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao37_Dao> get_aihao37_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao37_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO37返回的查询DataRow创建一个AIHAO37Entity对象
         * @param AIHAO37 row
         * @returnAIHAO37Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao37_Dao> get_aihao37_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao37_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO37字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao37_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao37_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO37Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao37_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao37_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO37IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao37_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao37_UpdateString( FieldName, Value, sid);
            }
        
        
    }
