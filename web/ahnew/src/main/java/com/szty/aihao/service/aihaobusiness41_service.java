/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness41.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness41_Dao;
import com.szty.aihao.core.aihaobusiness41_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS41逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness41_service
	{
        public  aihaobusiness41_core _dal=classFactory.getaihaobusiness41();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS41实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness41 (aihaobusiness41_Dao _AIHAOBUSINESS41Model )  throws Exception{
         return _dal.insert_aihaobusiness41( _AIHAOBUSINESS41Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS41prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness41(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness41( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS41实体
         * @return 影响的行数
         */
		public int update_aihaobusiness41(aihaobusiness41_Dao _AIHAOBUSINESS41Model)  throws Exception{
        return _dal.update_aihaobusiness41( _AIHAOBUSINESS41Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS41中的一条记录
         * @param AIHAOBUSINESS41实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness41(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness41( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness41 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness41 数据实体
        * @throws Exception 
         */
		public aihaobusiness41_Dao get_aihaobusiness41Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness41Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS41返回的查询DataRow创建一个AIHAOBUSINESS41Entity对象
         * @param AIHAOBUSINESS41 row
         * @returnAIHAOBUSINESS41List对象
        * @throws Exception 
         */
		public List<aihaobusiness41_Dao> get_aihaobusiness41_All() throws Exception{
            return _dal.get_aihaobusiness41_All();
            }
		    /**
         * 根据AIHAOBUSINESS41返回的查询DataRow创建一个AIHAOBUSINESS41Entity对象
         * @param AIHAOBUSINESS41 row
         * @returnAIHAOBUSINESS41List对象
        * @throws Exception 
         */
		public List<aihaobusiness41_Dao> get_aihaobusiness41_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness41_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness41_Dao> get_aihaobusiness41_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness41_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS41返回的查询DataRow创建一个AIHAOBUSINESS41Entity对象
         * @param AIHAOBUSINESS41 row
         * @returnAIHAOBUSINESS41Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness41_Dao> get_aihaobusiness41_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness41_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS41字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness41_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness41_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS41Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness41_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness41_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS41IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness41_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness41_UpdateString( FieldName, Value, sid);
            }
        
        
    }
