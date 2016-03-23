/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness22.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness22_Dao;
import com.szty.aihao.core.aihaobusiness22_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS22逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness22_service
	{
        public  aihaobusiness22_core _dal=classFactory.getaihaobusiness22();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS22实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness22 (aihaobusiness22_Dao _AIHAOBUSINESS22Model )  throws Exception{
         return _dal.insert_aihaobusiness22( _AIHAOBUSINESS22Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS22prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness22(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness22( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS22实体
         * @return 影响的行数
         */
		public int update_aihaobusiness22(aihaobusiness22_Dao _AIHAOBUSINESS22Model)  throws Exception{
        return _dal.update_aihaobusiness22( _AIHAOBUSINESS22Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS22中的一条记录
         * @param AIHAOBUSINESS22实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness22(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness22( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness22 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness22 数据实体
        * @throws Exception 
         */
		public aihaobusiness22_Dao get_aihaobusiness22Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness22Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS22返回的查询DataRow创建一个AIHAOBUSINESS22Entity对象
         * @param AIHAOBUSINESS22 row
         * @returnAIHAOBUSINESS22List对象
        * @throws Exception 
         */
		public List<aihaobusiness22_Dao> get_aihaobusiness22_All() throws Exception{
            return _dal.get_aihaobusiness22_All();
            }
		    /**
         * 根据AIHAOBUSINESS22返回的查询DataRow创建一个AIHAOBUSINESS22Entity对象
         * @param AIHAOBUSINESS22 row
         * @returnAIHAOBUSINESS22List对象
        * @throws Exception 
         */
		public List<aihaobusiness22_Dao> get_aihaobusiness22_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness22_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness22_Dao> get_aihaobusiness22_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness22_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS22返回的查询DataRow创建一个AIHAOBUSINESS22Entity对象
         * @param AIHAOBUSINESS22 row
         * @returnAIHAOBUSINESS22Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness22_Dao> get_aihaobusiness22_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness22_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS22字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness22_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness22_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS22Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness22_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness22_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS22IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness22_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness22_UpdateString( FieldName, Value, sid);
            }
        
        
    }
