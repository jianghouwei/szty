/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness11.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness11_Dao;
import com.szty.aihao.core.aihaobusiness11_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS11逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness11_service
	{
        public  aihaobusiness11_core _dal=classFactory.getaihaobusiness11();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS11实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness11 (aihaobusiness11_Dao _AIHAOBUSINESS11Model )  throws Exception{
         return _dal.insert_aihaobusiness11( _AIHAOBUSINESS11Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS11prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness11(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness11( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS11实体
         * @return 影响的行数
         */
		public int update_aihaobusiness11(aihaobusiness11_Dao _AIHAOBUSINESS11Model)  throws Exception{
        return _dal.update_aihaobusiness11( _AIHAOBUSINESS11Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS11中的一条记录
         * @param AIHAOBUSINESS11实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness11(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness11( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness11 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness11 数据实体
        * @throws Exception 
         */
		public aihaobusiness11_Dao get_aihaobusiness11Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness11Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS11返回的查询DataRow创建一个AIHAOBUSINESS11Entity对象
         * @param AIHAOBUSINESS11 row
         * @returnAIHAOBUSINESS11List对象
        * @throws Exception 
         */
		public List<aihaobusiness11_Dao> get_aihaobusiness11_All() throws Exception{
            return _dal.get_aihaobusiness11_All();
            }
		    /**
         * 根据AIHAOBUSINESS11返回的查询DataRow创建一个AIHAOBUSINESS11Entity对象
         * @param AIHAOBUSINESS11 row
         * @returnAIHAOBUSINESS11List对象
        * @throws Exception 
         */
		public List<aihaobusiness11_Dao> get_aihaobusiness11_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness11_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness11_Dao> get_aihaobusiness11_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness11_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS11返回的查询DataRow创建一个AIHAOBUSINESS11Entity对象
         * @param AIHAOBUSINESS11 row
         * @returnAIHAOBUSINESS11Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness11_Dao> get_aihaobusiness11_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness11_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS11字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness11_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness11_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS11Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness11_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness11_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS11IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness11_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness11_UpdateString( FieldName, Value, sid);
            }
        
        
    }
