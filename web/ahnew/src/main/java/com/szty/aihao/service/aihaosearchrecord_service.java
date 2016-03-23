/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaosearchrecord.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaosearchrecord_Dao;
import com.szty.aihao.core.aihaosearchrecord_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOSEARCHRECORD逻辑层接口
    *@作者：宋春林 
    */

	public class aihaosearchrecord_service
	{
        public  aihaosearchrecord_core _dal=classFactory.getaihaosearchrecord();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSEARCHRECORD实体
         * @return 新插入记录的编号
         */
		public int insert_aihaosearchrecord (aihaosearchrecord_Dao _AIHAOSEARCHRECORDModel )  throws Exception{
         return _dal.insert_aihaosearchrecord( _AIHAOSEARCHRECORDModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSEARCHRECORDprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaosearchrecord(Object[] _para)  throws Exception{
        return _dal.insert_aihaosearchrecord( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSEARCHRECORD实体
         * @return 影响的行数
         */
		public int update_aihaosearchrecord(aihaosearchrecord_Dao _AIHAOSEARCHRECORDModel)  throws Exception{
        return _dal.update_aihaosearchrecord( _AIHAOSEARCHRECORDModel);
		}
	
		

         /**
         *  删除数据表AIHAOSEARCHRECORD中的一条记录
         * @param AIHAOSEARCHRECORD实体
         * @return 新插入记录的编号
         */
		public int delete_aihaosearchrecord(int Id)  throws Exception{
        return _dal.delete_aihaosearchrecord( Id);
		}

		

       
          /**
         * 得到 aihaosearchrecord 数据实体
         * @param Id">Id
         * @return<aihaosearchrecord 数据实体
        * @throws Exception 
         */
		public aihaosearchrecord_Dao get_aihaosearchrecordDao(int Id) throws Exception{
        return _dal.get_aihaosearchrecordDao( Id);
		}
		
		    /**
         * 根据AIHAOSEARCHRECORD返回的查询DataRow创建一个AIHAOSEARCHRECORDEntity对象
         * @param AIHAOSEARCHRECORD row
         * @returnAIHAOSEARCHRECORDList对象
        * @throws Exception 
         */
		public List<aihaosearchrecord_Dao> get_aihaosearchrecord_All() throws Exception{
            return _dal.get_aihaosearchrecord_All();
            }
		    /**
         * 根据AIHAOSEARCHRECORD返回的查询DataRow创建一个AIHAOSEARCHRECORDEntity对象
         * @param AIHAOSEARCHRECORD row
         * @returnAIHAOSEARCHRECORDList对象
        * @throws Exception 
         */
		public List<aihaosearchrecord_Dao> get_aihaosearchrecord_All(String strWhere) throws Exception{
            return _dal.get_aihaosearchrecord_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaosearchrecord_Dao> get_aihaosearchrecord_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaosearchrecord_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOSEARCHRECORD返回的查询DataRow创建一个AIHAOSEARCHRECORDEntity对象
         * @param AIHAOSEARCHRECORD row
         * @returnAIHAOSEARCHRECORDDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaosearchrecord_Dao> get_aihaosearchrecord_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaosearchrecord_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOSEARCHRECORD字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaosearchrecord_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaosearchrecord_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOSEARCHRECORDInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaosearchrecord_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaosearchrecord_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOSEARCHRECORDIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaosearchrecord_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaosearchrecord_UpdateString( FieldName, Value, sid);
            }
        
        
    }
