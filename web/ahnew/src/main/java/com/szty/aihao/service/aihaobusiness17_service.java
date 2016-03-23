/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness17.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness17_Dao;
import com.szty.aihao.core.aihaobusiness17_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS17逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness17_service
	{
        public  aihaobusiness17_core _dal=classFactory.getaihaobusiness17();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS17实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness17 (aihaobusiness17_Dao _AIHAOBUSINESS17Model )  throws Exception{
         return _dal.insert_aihaobusiness17( _AIHAOBUSINESS17Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS17prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness17(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness17( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS17实体
         * @return 影响的行数
         */
		public int update_aihaobusiness17(aihaobusiness17_Dao _AIHAOBUSINESS17Model)  throws Exception{
        return _dal.update_aihaobusiness17( _AIHAOBUSINESS17Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS17中的一条记录
         * @param AIHAOBUSINESS17实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness17(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness17( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness17 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness17 数据实体
        * @throws Exception 
         */
		public aihaobusiness17_Dao get_aihaobusiness17Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness17Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS17返回的查询DataRow创建一个AIHAOBUSINESS17Entity对象
         * @param AIHAOBUSINESS17 row
         * @returnAIHAOBUSINESS17List对象
        * @throws Exception 
         */
		public List<aihaobusiness17_Dao> get_aihaobusiness17_All() throws Exception{
            return _dal.get_aihaobusiness17_All();
            }
		    /**
         * 根据AIHAOBUSINESS17返回的查询DataRow创建一个AIHAOBUSINESS17Entity对象
         * @param AIHAOBUSINESS17 row
         * @returnAIHAOBUSINESS17List对象
        * @throws Exception 
         */
		public List<aihaobusiness17_Dao> get_aihaobusiness17_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness17_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness17_Dao> get_aihaobusiness17_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness17_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS17返回的查询DataRow创建一个AIHAOBUSINESS17Entity对象
         * @param AIHAOBUSINESS17 row
         * @returnAIHAOBUSINESS17Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness17_Dao> get_aihaobusiness17_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness17_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS17字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness17_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness17_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS17Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness17_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness17_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS17IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness17_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness17_UpdateString( FieldName, Value, sid);
            }
        
        
    }
