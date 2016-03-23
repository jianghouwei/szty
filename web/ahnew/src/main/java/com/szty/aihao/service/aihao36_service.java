/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao36.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao36_Dao;
import com.szty.aihao.core.aihao36_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO36逻辑层接口
    *@作者：宋春林 
    */

	public class aihao36_service
	{
        public  aihao36_core _dal=classFactory.getaihao36();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO36实体
         * @return 新插入记录的编号
         */
		public int insert_aihao36 (aihao36_Dao _AIHAO36Model )  throws Exception{
         return _dal.insert_aihao36( _AIHAO36Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO36prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao36(Object[] _para)  throws Exception{
        return _dal.insert_aihao36( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO36实体
         * @return 影响的行数
         */
		public int update_aihao36(aihao36_Dao _AIHAO36Model)  throws Exception{
        return _dal.update_aihao36( _AIHAO36Model);
		}
	
		

         /**
         *  删除数据表AIHAO36中的一条记录
         * @param AIHAO36实体
         * @return 新插入记录的编号
         */
		public int delete_aihao36(int Id)  throws Exception{
        return _dal.delete_aihao36( Id);
		}

		

       
          /**
         * 得到 aihao36 数据实体
         * @param Id">Id
         * @return<aihao36 数据实体
        * @throws Exception 
         */
		public aihao36_Dao get_aihao36Dao(int Id) throws Exception{
        return _dal.get_aihao36Dao( Id);
		}
		
		    /**
         * 根据AIHAO36返回的查询DataRow创建一个AIHAO36Entity对象
         * @param AIHAO36 row
         * @returnAIHAO36List对象
        * @throws Exception 
         */
		public List<aihao36_Dao> get_aihao36_All() throws Exception{
            return _dal.get_aihao36_All();
            }
		    /**
         * 根据AIHAO36返回的查询DataRow创建一个AIHAO36Entity对象
         * @param AIHAO36 row
         * @returnAIHAO36List对象
        * @throws Exception 
         */
		public List<aihao36_Dao> get_aihao36_All(String strWhere) throws Exception{
            return _dal.get_aihao36_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao36_Dao> get_aihao36_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao36_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO36返回的查询DataRow创建一个AIHAO36Entity对象
         * @param AIHAO36 row
         * @returnAIHAO36Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao36_Dao> get_aihao36_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao36_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO36字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao36_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao36_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO36Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao36_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao36_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO36IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao36_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao36_UpdateString( FieldName, Value, sid);
            }
        
        
    }
