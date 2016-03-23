/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness35.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness35_Dao;
import com.szty.aihao.core.aihaobusiness35_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS35逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness35_service
	{
        public  aihaobusiness35_core _dal=classFactory.getaihaobusiness35();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS35实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness35 (aihaobusiness35_Dao _AIHAOBUSINESS35Model )  throws Exception{
         return _dal.insert_aihaobusiness35( _AIHAOBUSINESS35Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS35prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness35(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness35( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS35实体
         * @return 影响的行数
         */
		public int update_aihaobusiness35(aihaobusiness35_Dao _AIHAOBUSINESS35Model)  throws Exception{
        return _dal.update_aihaobusiness35( _AIHAOBUSINESS35Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS35中的一条记录
         * @param AIHAOBUSINESS35实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness35(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness35( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness35 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness35 数据实体
        * @throws Exception 
         */
		public aihaobusiness35_Dao get_aihaobusiness35Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness35Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS35返回的查询DataRow创建一个AIHAOBUSINESS35Entity对象
         * @param AIHAOBUSINESS35 row
         * @returnAIHAOBUSINESS35List对象
        * @throws Exception 
         */
		public List<aihaobusiness35_Dao> get_aihaobusiness35_All() throws Exception{
            return _dal.get_aihaobusiness35_All();
            }
		    /**
         * 根据AIHAOBUSINESS35返回的查询DataRow创建一个AIHAOBUSINESS35Entity对象
         * @param AIHAOBUSINESS35 row
         * @returnAIHAOBUSINESS35List对象
        * @throws Exception 
         */
		public List<aihaobusiness35_Dao> get_aihaobusiness35_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness35_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness35_Dao> get_aihaobusiness35_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness35_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS35返回的查询DataRow创建一个AIHAOBUSINESS35Entity对象
         * @param AIHAOBUSINESS35 row
         * @returnAIHAOBUSINESS35Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness35_Dao> get_aihaobusiness35_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness35_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS35字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness35_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness35_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS35Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness35_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness35_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS35IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness35_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness35_UpdateString( FieldName, Value, sid);
            }
        
        
    }
