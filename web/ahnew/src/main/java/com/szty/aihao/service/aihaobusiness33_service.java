/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness33.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness33_Dao;
import com.szty.aihao.core.aihaobusiness33_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS33逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness33_service
	{
        public  aihaobusiness33_core _dal=classFactory.getaihaobusiness33();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS33实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness33 (aihaobusiness33_Dao _AIHAOBUSINESS33Model )  throws Exception{
         return _dal.insert_aihaobusiness33( _AIHAOBUSINESS33Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS33prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness33(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness33( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS33实体
         * @return 影响的行数
         */
		public int update_aihaobusiness33(aihaobusiness33_Dao _AIHAOBUSINESS33Model)  throws Exception{
        return _dal.update_aihaobusiness33( _AIHAOBUSINESS33Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS33中的一条记录
         * @param AIHAOBUSINESS33实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness33(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness33( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness33 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness33 数据实体
        * @throws Exception 
         */
		public aihaobusiness33_Dao get_aihaobusiness33Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness33Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS33返回的查询DataRow创建一个AIHAOBUSINESS33Entity对象
         * @param AIHAOBUSINESS33 row
         * @returnAIHAOBUSINESS33List对象
        * @throws Exception 
         */
		public List<aihaobusiness33_Dao> get_aihaobusiness33_All() throws Exception{
            return _dal.get_aihaobusiness33_All();
            }
		    /**
         * 根据AIHAOBUSINESS33返回的查询DataRow创建一个AIHAOBUSINESS33Entity对象
         * @param AIHAOBUSINESS33 row
         * @returnAIHAOBUSINESS33List对象
        * @throws Exception 
         */
		public List<aihaobusiness33_Dao> get_aihaobusiness33_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness33_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness33_Dao> get_aihaobusiness33_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness33_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS33返回的查询DataRow创建一个AIHAOBUSINESS33Entity对象
         * @param AIHAOBUSINESS33 row
         * @returnAIHAOBUSINESS33Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness33_Dao> get_aihaobusiness33_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness33_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS33字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness33_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness33_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS33Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness33_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness33_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS33IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness33_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness33_UpdateString( FieldName, Value, sid);
            }
        
        
    }
