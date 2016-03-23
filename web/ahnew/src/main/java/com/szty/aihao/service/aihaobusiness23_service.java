/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness23.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness23_Dao;
import com.szty.aihao.core.aihaobusiness23_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS23逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness23_service
	{
        public  aihaobusiness23_core _dal=classFactory.getaihaobusiness23();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS23实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness23 (aihaobusiness23_Dao _AIHAOBUSINESS23Model )  throws Exception{
         return _dal.insert_aihaobusiness23( _AIHAOBUSINESS23Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS23prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness23(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness23( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS23实体
         * @return 影响的行数
         */
		public int update_aihaobusiness23(aihaobusiness23_Dao _AIHAOBUSINESS23Model)  throws Exception{
        return _dal.update_aihaobusiness23( _AIHAOBUSINESS23Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS23中的一条记录
         * @param AIHAOBUSINESS23实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness23(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness23( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness23 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness23 数据实体
        * @throws Exception 
         */
		public aihaobusiness23_Dao get_aihaobusiness23Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness23Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS23返回的查询DataRow创建一个AIHAOBUSINESS23Entity对象
         * @param AIHAOBUSINESS23 row
         * @returnAIHAOBUSINESS23List对象
        * @throws Exception 
         */
		public List<aihaobusiness23_Dao> get_aihaobusiness23_All() throws Exception{
            return _dal.get_aihaobusiness23_All();
            }
		    /**
         * 根据AIHAOBUSINESS23返回的查询DataRow创建一个AIHAOBUSINESS23Entity对象
         * @param AIHAOBUSINESS23 row
         * @returnAIHAOBUSINESS23List对象
        * @throws Exception 
         */
		public List<aihaobusiness23_Dao> get_aihaobusiness23_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness23_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness23_Dao> get_aihaobusiness23_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness23_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS23返回的查询DataRow创建一个AIHAOBUSINESS23Entity对象
         * @param AIHAOBUSINESS23 row
         * @returnAIHAOBUSINESS23Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness23_Dao> get_aihaobusiness23_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness23_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS23字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness23_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness23_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS23Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness23_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness23_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS23IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness23_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness23_UpdateString( FieldName, Value, sid);
            }
        
        
    }
