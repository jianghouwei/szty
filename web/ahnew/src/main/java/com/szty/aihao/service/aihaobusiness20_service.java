/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness20.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness20_Dao;
import com.szty.aihao.core.aihaobusiness20_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS20逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness20_service
	{
        public  aihaobusiness20_core _dal=classFactory.getaihaobusiness20();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS20实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness20 (aihaobusiness20_Dao _AIHAOBUSINESS20Model )  throws Exception{
         return _dal.insert_aihaobusiness20( _AIHAOBUSINESS20Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS20prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness20(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness20( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS20实体
         * @return 影响的行数
         */
		public int update_aihaobusiness20(aihaobusiness20_Dao _AIHAOBUSINESS20Model)  throws Exception{
        return _dal.update_aihaobusiness20( _AIHAOBUSINESS20Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS20中的一条记录
         * @param AIHAOBUSINESS20实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness20(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness20( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness20 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness20 数据实体
        * @throws Exception 
         */
		public aihaobusiness20_Dao get_aihaobusiness20Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness20Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS20返回的查询DataRow创建一个AIHAOBUSINESS20Entity对象
         * @param AIHAOBUSINESS20 row
         * @returnAIHAOBUSINESS20List对象
        * @throws Exception 
         */
		public List<aihaobusiness20_Dao> get_aihaobusiness20_All() throws Exception{
            return _dal.get_aihaobusiness20_All();
            }
		    /**
         * 根据AIHAOBUSINESS20返回的查询DataRow创建一个AIHAOBUSINESS20Entity对象
         * @param AIHAOBUSINESS20 row
         * @returnAIHAOBUSINESS20List对象
        * @throws Exception 
         */
		public List<aihaobusiness20_Dao> get_aihaobusiness20_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness20_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness20_Dao> get_aihaobusiness20_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness20_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS20返回的查询DataRow创建一个AIHAOBUSINESS20Entity对象
         * @param AIHAOBUSINESS20 row
         * @returnAIHAOBUSINESS20Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness20_Dao> get_aihaobusiness20_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness20_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS20字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness20_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness20_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS20Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness20_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness20_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS20IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness20_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness20_UpdateString( FieldName, Value, sid);
            }
        
        
    }
