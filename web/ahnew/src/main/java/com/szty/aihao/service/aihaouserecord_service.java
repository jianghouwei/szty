/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaouserecord.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaouserecord_Dao;
import com.szty.aihao.core.aihaouserecord_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOUSERECORD逻辑层接口
    *@作者：宋春林 
    */

	public class aihaouserecord_service
	{
        public  aihaouserecord_core _dal=classFactory.getaihaouserecord();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERECORD实体
         * @return 新插入记录的编号
         */
		public int insert_aihaouserecord (aihaouserecord_Dao _AIHAOUSERECORDModel )  throws Exception{
         return _dal.insert_aihaouserecord( _AIHAOUSERECORDModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERECORDprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaouserecord(Object[] _para)  throws Exception{
        return _dal.insert_aihaouserecord( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERECORD实体
         * @return 影响的行数
         */
		public int update_aihaouserecord(aihaouserecord_Dao _AIHAOUSERECORDModel)  throws Exception{
        return _dal.update_aihaouserecord( _AIHAOUSERECORDModel);
		}
	
		

         /**
         *  删除数据表AIHAOUSERECORD中的一条记录
         * @param AIHAOUSERECORD实体
         * @return 新插入记录的编号
         */
		public int delete_aihaouserecord(int Id)  throws Exception{
        return _dal.delete_aihaouserecord( Id);
		}

		

       
          /**
         * 得到 aihaouserecord 数据实体
         * @param Id">Id
         * @return<aihaouserecord 数据实体
        * @throws Exception 
         */
		public aihaouserecord_Dao get_aihaouserecordDao(int Id) throws Exception{
        return _dal.get_aihaouserecordDao( Id);
		}
		
		    /**
         * 根据AIHAOUSERECORD返回的查询DataRow创建一个AIHAOUSERECORDEntity对象
         * @param AIHAOUSERECORD row
         * @returnAIHAOUSERECORDList对象
        * @throws Exception 
         */
		public List<aihaouserecord_Dao> get_aihaouserecord_All() throws Exception{
            return _dal.get_aihaouserecord_All();
            }
		    /**
         * 根据AIHAOUSERECORD返回的查询DataRow创建一个AIHAOUSERECORDEntity对象
         * @param AIHAOUSERECORD row
         * @returnAIHAOUSERECORDList对象
        * @throws Exception 
         */
		public List<aihaouserecord_Dao> get_aihaouserecord_All(String strWhere) throws Exception{
            return _dal.get_aihaouserecord_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaouserecord_Dao> get_aihaouserecord_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaouserecord_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOUSERECORD返回的查询DataRow创建一个AIHAOUSERECORDEntity对象
         * @param AIHAOUSERECORD row
         * @returnAIHAOUSERECORDDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaouserecord_Dao> get_aihaouserecord_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaouserecord_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOUSERECORD字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaouserecord_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaouserecord_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOUSERECORDInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaouserecord_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaouserecord_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOUSERECORDIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaouserecord_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaouserecord_UpdateString( FieldName, Value, sid);
            }
        
        
    }
