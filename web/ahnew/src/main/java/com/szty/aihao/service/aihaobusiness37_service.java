/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness37.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness37_Dao;
import com.szty.aihao.core.aihaobusiness37_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS37逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness37_service
	{
        public  aihaobusiness37_core _dal=classFactory.getaihaobusiness37();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS37实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness37 (aihaobusiness37_Dao _AIHAOBUSINESS37Model )  throws Exception{
         return _dal.insert_aihaobusiness37( _AIHAOBUSINESS37Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS37prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness37(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness37( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS37实体
         * @return 影响的行数
         */
		public int update_aihaobusiness37(aihaobusiness37_Dao _AIHAOBUSINESS37Model)  throws Exception{
        return _dal.update_aihaobusiness37( _AIHAOBUSINESS37Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS37中的一条记录
         * @param AIHAOBUSINESS37实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness37(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness37( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness37 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness37 数据实体
        * @throws Exception 
         */
		public aihaobusiness37_Dao get_aihaobusiness37Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness37Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS37返回的查询DataRow创建一个AIHAOBUSINESS37Entity对象
         * @param AIHAOBUSINESS37 row
         * @returnAIHAOBUSINESS37List对象
        * @throws Exception 
         */
		public List<aihaobusiness37_Dao> get_aihaobusiness37_All() throws Exception{
            return _dal.get_aihaobusiness37_All();
            }
		    /**
         * 根据AIHAOBUSINESS37返回的查询DataRow创建一个AIHAOBUSINESS37Entity对象
         * @param AIHAOBUSINESS37 row
         * @returnAIHAOBUSINESS37List对象
        * @throws Exception 
         */
		public List<aihaobusiness37_Dao> get_aihaobusiness37_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness37_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness37_Dao> get_aihaobusiness37_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness37_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS37返回的查询DataRow创建一个AIHAOBUSINESS37Entity对象
         * @param AIHAOBUSINESS37 row
         * @returnAIHAOBUSINESS37Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness37_Dao> get_aihaobusiness37_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness37_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS37字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness37_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness37_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS37Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness37_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness37_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS37IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness37_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness37_UpdateString( FieldName, Value, sid);
            }
        
        
    }
