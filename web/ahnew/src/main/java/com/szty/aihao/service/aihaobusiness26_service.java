/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness26.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness26_Dao;
import com.szty.aihao.core.aihaobusiness26_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS26逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness26_service
	{
        public  aihaobusiness26_core _dal=classFactory.getaihaobusiness26();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS26实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness26 (aihaobusiness26_Dao _AIHAOBUSINESS26Model )  throws Exception{
         return _dal.insert_aihaobusiness26( _AIHAOBUSINESS26Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS26prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness26(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness26( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS26实体
         * @return 影响的行数
         */
		public int update_aihaobusiness26(aihaobusiness26_Dao _AIHAOBUSINESS26Model)  throws Exception{
        return _dal.update_aihaobusiness26( _AIHAOBUSINESS26Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS26中的一条记录
         * @param AIHAOBUSINESS26实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness26(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness26( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness26 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness26 数据实体
        * @throws Exception 
         */
		public aihaobusiness26_Dao get_aihaobusiness26Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness26Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS26返回的查询DataRow创建一个AIHAOBUSINESS26Entity对象
         * @param AIHAOBUSINESS26 row
         * @returnAIHAOBUSINESS26List对象
        * @throws Exception 
         */
		public List<aihaobusiness26_Dao> get_aihaobusiness26_All() throws Exception{
            return _dal.get_aihaobusiness26_All();
            }
		    /**
         * 根据AIHAOBUSINESS26返回的查询DataRow创建一个AIHAOBUSINESS26Entity对象
         * @param AIHAOBUSINESS26 row
         * @returnAIHAOBUSINESS26List对象
        * @throws Exception 
         */
		public List<aihaobusiness26_Dao> get_aihaobusiness26_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness26_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness26_Dao> get_aihaobusiness26_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness26_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS26返回的查询DataRow创建一个AIHAOBUSINESS26Entity对象
         * @param AIHAOBUSINESS26 row
         * @returnAIHAOBUSINESS26Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness26_Dao> get_aihaobusiness26_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness26_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS26字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness26_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness26_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS26Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness26_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness26_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS26IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness26_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness26_UpdateString( FieldName, Value, sid);
            }
        
        
    }
