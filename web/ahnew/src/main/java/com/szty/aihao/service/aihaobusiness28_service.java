/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness28.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness28_Dao;
import com.szty.aihao.core.aihaobusiness28_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS28逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness28_service
	{
        public  aihaobusiness28_core _dal=classFactory.getaihaobusiness28();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS28实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness28 (aihaobusiness28_Dao _AIHAOBUSINESS28Model )  throws Exception{
         return _dal.insert_aihaobusiness28( _AIHAOBUSINESS28Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS28prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness28(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness28( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS28实体
         * @return 影响的行数
         */
		public int update_aihaobusiness28(aihaobusiness28_Dao _AIHAOBUSINESS28Model)  throws Exception{
        return _dal.update_aihaobusiness28( _AIHAOBUSINESS28Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS28中的一条记录
         * @param AIHAOBUSINESS28实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness28(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness28( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness28 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness28 数据实体
        * @throws Exception 
         */
		public aihaobusiness28_Dao get_aihaobusiness28Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness28Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS28返回的查询DataRow创建一个AIHAOBUSINESS28Entity对象
         * @param AIHAOBUSINESS28 row
         * @returnAIHAOBUSINESS28List对象
        * @throws Exception 
         */
		public List<aihaobusiness28_Dao> get_aihaobusiness28_All() throws Exception{
            return _dal.get_aihaobusiness28_All();
            }
		    /**
         * 根据AIHAOBUSINESS28返回的查询DataRow创建一个AIHAOBUSINESS28Entity对象
         * @param AIHAOBUSINESS28 row
         * @returnAIHAOBUSINESS28List对象
        * @throws Exception 
         */
		public List<aihaobusiness28_Dao> get_aihaobusiness28_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness28_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness28_Dao> get_aihaobusiness28_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness28_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS28返回的查询DataRow创建一个AIHAOBUSINESS28Entity对象
         * @param AIHAOBUSINESS28 row
         * @returnAIHAOBUSINESS28Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness28_Dao> get_aihaobusiness28_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness28_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS28字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness28_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness28_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS28Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness28_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness28_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS28IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness28_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness28_UpdateString( FieldName, Value, sid);
            }
        
        
    }
