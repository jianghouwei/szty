/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness36.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness36_Dao;
import com.szty.aihao.core.aihaobusiness36_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS36逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness36_service
	{
        public  aihaobusiness36_core _dal=classFactory.getaihaobusiness36();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS36实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness36 (aihaobusiness36_Dao _AIHAOBUSINESS36Model )  throws Exception{
         return _dal.insert_aihaobusiness36( _AIHAOBUSINESS36Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS36prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness36(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness36( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS36实体
         * @return 影响的行数
         */
		public int update_aihaobusiness36(aihaobusiness36_Dao _AIHAOBUSINESS36Model)  throws Exception{
        return _dal.update_aihaobusiness36( _AIHAOBUSINESS36Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS36中的一条记录
         * @param AIHAOBUSINESS36实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness36(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness36( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness36 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness36 数据实体
        * @throws Exception 
         */
		public aihaobusiness36_Dao get_aihaobusiness36Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness36Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS36返回的查询DataRow创建一个AIHAOBUSINESS36Entity对象
         * @param AIHAOBUSINESS36 row
         * @returnAIHAOBUSINESS36List对象
        * @throws Exception 
         */
		public List<aihaobusiness36_Dao> get_aihaobusiness36_All() throws Exception{
            return _dal.get_aihaobusiness36_All();
            }
		    /**
         * 根据AIHAOBUSINESS36返回的查询DataRow创建一个AIHAOBUSINESS36Entity对象
         * @param AIHAOBUSINESS36 row
         * @returnAIHAOBUSINESS36List对象
        * @throws Exception 
         */
		public List<aihaobusiness36_Dao> get_aihaobusiness36_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness36_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness36_Dao> get_aihaobusiness36_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness36_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS36返回的查询DataRow创建一个AIHAOBUSINESS36Entity对象
         * @param AIHAOBUSINESS36 row
         * @returnAIHAOBUSINESS36Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness36_Dao> get_aihaobusiness36_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness36_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS36字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness36_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness36_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS36Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness36_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness36_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS36IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness36_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness36_UpdateString( FieldName, Value, sid);
            }
        
        
    }
