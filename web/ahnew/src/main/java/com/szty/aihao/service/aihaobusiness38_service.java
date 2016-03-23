/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness38.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness38_Dao;
import com.szty.aihao.core.aihaobusiness38_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS38逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness38_service
	{
        public  aihaobusiness38_core _dal=classFactory.getaihaobusiness38();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS38实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness38 (aihaobusiness38_Dao _AIHAOBUSINESS38Model )  throws Exception{
         return _dal.insert_aihaobusiness38( _AIHAOBUSINESS38Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS38prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness38(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness38( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS38实体
         * @return 影响的行数
         */
		public int update_aihaobusiness38(aihaobusiness38_Dao _AIHAOBUSINESS38Model)  throws Exception{
        return _dal.update_aihaobusiness38( _AIHAOBUSINESS38Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS38中的一条记录
         * @param AIHAOBUSINESS38实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness38(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness38( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness38 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness38 数据实体
        * @throws Exception 
         */
		public aihaobusiness38_Dao get_aihaobusiness38Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness38Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS38返回的查询DataRow创建一个AIHAOBUSINESS38Entity对象
         * @param AIHAOBUSINESS38 row
         * @returnAIHAOBUSINESS38List对象
        * @throws Exception 
         */
		public List<aihaobusiness38_Dao> get_aihaobusiness38_All() throws Exception{
            return _dal.get_aihaobusiness38_All();
            }
		    /**
         * 根据AIHAOBUSINESS38返回的查询DataRow创建一个AIHAOBUSINESS38Entity对象
         * @param AIHAOBUSINESS38 row
         * @returnAIHAOBUSINESS38List对象
        * @throws Exception 
         */
		public List<aihaobusiness38_Dao> get_aihaobusiness38_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness38_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness38_Dao> get_aihaobusiness38_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness38_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS38返回的查询DataRow创建一个AIHAOBUSINESS38Entity对象
         * @param AIHAOBUSINESS38 row
         * @returnAIHAOBUSINESS38Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness38_Dao> get_aihaobusiness38_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness38_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS38字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness38_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness38_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS38Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness38_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness38_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS38IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness38_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness38_UpdateString( FieldName, Value, sid);
            }
        
        
    }
