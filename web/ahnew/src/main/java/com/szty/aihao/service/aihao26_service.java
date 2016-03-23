/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao26.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao26_Dao;
import com.szty.aihao.core.aihao26_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO26逻辑层接口
    *@作者：宋春林 
    */

	public class aihao26_service
	{
        public  aihao26_core _dal=classFactory.getaihao26();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO26实体
         * @return 新插入记录的编号
         */
		public int insert_aihao26 (aihao26_Dao _AIHAO26Model )  throws Exception{
         return _dal.insert_aihao26( _AIHAO26Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO26prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao26(Object[] _para)  throws Exception{
        return _dal.insert_aihao26( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO26实体
         * @return 影响的行数
         */
		public int update_aihao26(aihao26_Dao _AIHAO26Model)  throws Exception{
        return _dal.update_aihao26( _AIHAO26Model);
		}
	
		

         /**
         *  删除数据表AIHAO26中的一条记录
         * @param AIHAO26实体
         * @return 新插入记录的编号
         */
		public int delete_aihao26(int Id)  throws Exception{
        return _dal.delete_aihao26( Id);
		}

		

       
          /**
         * 得到 aihao26 数据实体
         * @param Id">Id
         * @return<aihao26 数据实体
        * @throws Exception 
         */
		public aihao26_Dao get_aihao26Dao(int Id) throws Exception{
        return _dal.get_aihao26Dao( Id);
		}
		
		    /**
         * 根据AIHAO26返回的查询DataRow创建一个AIHAO26Entity对象
         * @param AIHAO26 row
         * @returnAIHAO26List对象
        * @throws Exception 
         */
		public List<aihao26_Dao> get_aihao26_All() throws Exception{
            return _dal.get_aihao26_All();
            }
		    /**
         * 根据AIHAO26返回的查询DataRow创建一个AIHAO26Entity对象
         * @param AIHAO26 row
         * @returnAIHAO26List对象
        * @throws Exception 
         */
		public List<aihao26_Dao> get_aihao26_All(String strWhere) throws Exception{
            return _dal.get_aihao26_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao26_Dao> get_aihao26_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao26_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO26返回的查询DataRow创建一个AIHAO26Entity对象
         * @param AIHAO26 row
         * @returnAIHAO26Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao26_Dao> get_aihao26_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao26_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO26字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao26_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao26_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO26Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao26_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao26_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO26IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao26_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao26_UpdateString( FieldName, Value, sid);
            }
        
        
    }
