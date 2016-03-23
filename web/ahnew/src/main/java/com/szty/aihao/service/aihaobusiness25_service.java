/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness25.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness25_Dao;
import com.szty.aihao.core.aihaobusiness25_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS25逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness25_service
	{
        public  aihaobusiness25_core _dal=classFactory.getaihaobusiness25();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS25实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness25 (aihaobusiness25_Dao _AIHAOBUSINESS25Model )  throws Exception{
         return _dal.insert_aihaobusiness25( _AIHAOBUSINESS25Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS25prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness25(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness25( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS25实体
         * @return 影响的行数
         */
		public int update_aihaobusiness25(aihaobusiness25_Dao _AIHAOBUSINESS25Model)  throws Exception{
        return _dal.update_aihaobusiness25( _AIHAOBUSINESS25Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS25中的一条记录
         * @param AIHAOBUSINESS25实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness25(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness25( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness25 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness25 数据实体
        * @throws Exception 
         */
		public aihaobusiness25_Dao get_aihaobusiness25Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness25Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS25返回的查询DataRow创建一个AIHAOBUSINESS25Entity对象
         * @param AIHAOBUSINESS25 row
         * @returnAIHAOBUSINESS25List对象
        * @throws Exception 
         */
		public List<aihaobusiness25_Dao> get_aihaobusiness25_All() throws Exception{
            return _dal.get_aihaobusiness25_All();
            }
		    /**
         * 根据AIHAOBUSINESS25返回的查询DataRow创建一个AIHAOBUSINESS25Entity对象
         * @param AIHAOBUSINESS25 row
         * @returnAIHAOBUSINESS25List对象
        * @throws Exception 
         */
		public List<aihaobusiness25_Dao> get_aihaobusiness25_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness25_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness25_Dao> get_aihaobusiness25_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness25_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS25返回的查询DataRow创建一个AIHAOBUSINESS25Entity对象
         * @param AIHAOBUSINESS25 row
         * @returnAIHAOBUSINESS25Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness25_Dao> get_aihaobusiness25_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness25_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS25字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness25_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness25_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS25Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness25_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness25_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS25IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness25_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness25_UpdateString( FieldName, Value, sid);
            }
        
        
    }
