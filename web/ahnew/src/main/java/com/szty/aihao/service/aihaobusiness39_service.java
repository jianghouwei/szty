/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness39.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness39_Dao;
import com.szty.aihao.core.aihaobusiness39_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS39逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness39_service
	{
        public  aihaobusiness39_core _dal=classFactory.getaihaobusiness39();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS39实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness39 (aihaobusiness39_Dao _AIHAOBUSINESS39Model )  throws Exception{
         return _dal.insert_aihaobusiness39( _AIHAOBUSINESS39Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS39prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness39(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness39( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS39实体
         * @return 影响的行数
         */
		public int update_aihaobusiness39(aihaobusiness39_Dao _AIHAOBUSINESS39Model)  throws Exception{
        return _dal.update_aihaobusiness39( _AIHAOBUSINESS39Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS39中的一条记录
         * @param AIHAOBUSINESS39实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness39(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness39( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness39 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness39 数据实体
        * @throws Exception 
         */
		public aihaobusiness39_Dao get_aihaobusiness39Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness39Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS39返回的查询DataRow创建一个AIHAOBUSINESS39Entity对象
         * @param AIHAOBUSINESS39 row
         * @returnAIHAOBUSINESS39List对象
        * @throws Exception 
         */
		public List<aihaobusiness39_Dao> get_aihaobusiness39_All() throws Exception{
            return _dal.get_aihaobusiness39_All();
            }
		    /**
         * 根据AIHAOBUSINESS39返回的查询DataRow创建一个AIHAOBUSINESS39Entity对象
         * @param AIHAOBUSINESS39 row
         * @returnAIHAOBUSINESS39List对象
        * @throws Exception 
         */
		public List<aihaobusiness39_Dao> get_aihaobusiness39_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness39_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness39_Dao> get_aihaobusiness39_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness39_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS39返回的查询DataRow创建一个AIHAOBUSINESS39Entity对象
         * @param AIHAOBUSINESS39 row
         * @returnAIHAOBUSINESS39Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness39_Dao> get_aihaobusiness39_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness39_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS39字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness39_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness39_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS39Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness39_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness39_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS39IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness39_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness39_UpdateString( FieldName, Value, sid);
            }
        
        
    }
