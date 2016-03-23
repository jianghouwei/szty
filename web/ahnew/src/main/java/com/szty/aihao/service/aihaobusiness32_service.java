/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness32.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness32_Dao;
import com.szty.aihao.core.aihaobusiness32_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS32逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness32_service
	{
        public  aihaobusiness32_core _dal=classFactory.getaihaobusiness32();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS32实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness32 (aihaobusiness32_Dao _AIHAOBUSINESS32Model )  throws Exception{
         return _dal.insert_aihaobusiness32( _AIHAOBUSINESS32Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS32prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness32(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness32( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS32实体
         * @return 影响的行数
         */
		public int update_aihaobusiness32(aihaobusiness32_Dao _AIHAOBUSINESS32Model)  throws Exception{
        return _dal.update_aihaobusiness32( _AIHAOBUSINESS32Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS32中的一条记录
         * @param AIHAOBUSINESS32实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness32(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness32( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness32 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness32 数据实体
        * @throws Exception 
         */
		public aihaobusiness32_Dao get_aihaobusiness32Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness32Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS32返回的查询DataRow创建一个AIHAOBUSINESS32Entity对象
         * @param AIHAOBUSINESS32 row
         * @returnAIHAOBUSINESS32List对象
        * @throws Exception 
         */
		public List<aihaobusiness32_Dao> get_aihaobusiness32_All() throws Exception{
            return _dal.get_aihaobusiness32_All();
            }
		    /**
         * 根据AIHAOBUSINESS32返回的查询DataRow创建一个AIHAOBUSINESS32Entity对象
         * @param AIHAOBUSINESS32 row
         * @returnAIHAOBUSINESS32List对象
        * @throws Exception 
         */
		public List<aihaobusiness32_Dao> get_aihaobusiness32_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness32_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness32_Dao> get_aihaobusiness32_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness32_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS32返回的查询DataRow创建一个AIHAOBUSINESS32Entity对象
         * @param AIHAOBUSINESS32 row
         * @returnAIHAOBUSINESS32Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness32_Dao> get_aihaobusiness32_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness32_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS32字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness32_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness32_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS32Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness32_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness32_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS32IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness32_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness32_UpdateString( FieldName, Value, sid);
            }
        
        
    }
