/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness30.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness30_Dao;
import com.szty.aihao.core.aihaobusiness30_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS30逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness30_service
	{
        public  aihaobusiness30_core _dal=classFactory.getaihaobusiness30();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS30实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness30 (aihaobusiness30_Dao _AIHAOBUSINESS30Model )  throws Exception{
         return _dal.insert_aihaobusiness30( _AIHAOBUSINESS30Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS30prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness30(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness30( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS30实体
         * @return 影响的行数
         */
		public int update_aihaobusiness30(aihaobusiness30_Dao _AIHAOBUSINESS30Model)  throws Exception{
        return _dal.update_aihaobusiness30( _AIHAOBUSINESS30Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS30中的一条记录
         * @param AIHAOBUSINESS30实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness30(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness30( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness30 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness30 数据实体
        * @throws Exception 
         */
		public aihaobusiness30_Dao get_aihaobusiness30Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness30Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS30返回的查询DataRow创建一个AIHAOBUSINESS30Entity对象
         * @param AIHAOBUSINESS30 row
         * @returnAIHAOBUSINESS30List对象
        * @throws Exception 
         */
		public List<aihaobusiness30_Dao> get_aihaobusiness30_All() throws Exception{
            return _dal.get_aihaobusiness30_All();
            }
		    /**
         * 根据AIHAOBUSINESS30返回的查询DataRow创建一个AIHAOBUSINESS30Entity对象
         * @param AIHAOBUSINESS30 row
         * @returnAIHAOBUSINESS30List对象
        * @throws Exception 
         */
		public List<aihaobusiness30_Dao> get_aihaobusiness30_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness30_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness30_Dao> get_aihaobusiness30_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness30_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS30返回的查询DataRow创建一个AIHAOBUSINESS30Entity对象
         * @param AIHAOBUSINESS30 row
         * @returnAIHAOBUSINESS30Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness30_Dao> get_aihaobusiness30_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness30_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS30字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness30_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness30_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS30Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness30_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness30_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS30IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness30_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness30_UpdateString( FieldName, Value, sid);
            }
        
        
    }
