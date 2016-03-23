/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaouselog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaouselog_Dao;
import com.szty.aihao.core.aihaouselog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOUSELOG逻辑层接口
    *@作者：宋春林 
    */

	public class aihaouselog_service
	{
        public  aihaouselog_core _dal=classFactory.getaihaouselog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSELOG实体
         * @return 新插入记录的编号
         */
		public int insert_aihaouselog (aihaouselog_Dao _AIHAOUSELOGModel )  throws Exception{
         return _dal.insert_aihaouselog( _AIHAOUSELOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSELOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaouselog(Object[] _para)  throws Exception{
        return _dal.insert_aihaouselog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSELOG实体
         * @return 影响的行数
         */
		public int update_aihaouselog(aihaouselog_Dao _AIHAOUSELOGModel)  throws Exception{
        return _dal.update_aihaouselog( _AIHAOUSELOGModel);
		}
	
		

         /**
         *  删除数据表AIHAOUSELOG中的一条记录
         * @param AIHAOUSELOG实体
         * @return 新插入记录的编号
         */
		public int delete_aihaouselog(int Id)  throws Exception{
        return _dal.delete_aihaouselog( Id);
		}

		

       
          /**
         * 得到 aihaouselog 数据实体
         * @param Id">Id
         * @return<aihaouselog 数据实体
        * @throws Exception 
         */
		public aihaouselog_Dao get_aihaouselogDao(int Id) throws Exception{
        return _dal.get_aihaouselogDao( Id);
		}
		
		    /**
         * 根据AIHAOUSELOG返回的查询DataRow创建一个AIHAOUSELOGEntity对象
         * @param AIHAOUSELOG row
         * @returnAIHAOUSELOGList对象
        * @throws Exception 
         */
		public List<aihaouselog_Dao> get_aihaouselog_All() throws Exception{
            return _dal.get_aihaouselog_All();
            }
		    /**
         * 根据AIHAOUSELOG返回的查询DataRow创建一个AIHAOUSELOGEntity对象
         * @param AIHAOUSELOG row
         * @returnAIHAOUSELOGList对象
        * @throws Exception 
         */
		public List<aihaouselog_Dao> get_aihaouselog_All(String strWhere) throws Exception{
            return _dal.get_aihaouselog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaouselog_Dao> get_aihaouselog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaouselog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOUSELOG返回的查询DataRow创建一个AIHAOUSELOGEntity对象
         * @param AIHAOUSELOG row
         * @returnAIHAOUSELOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaouselog_Dao> get_aihaouselog_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaouselog_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOUSELOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaouselog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaouselog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOUSELOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaouselog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaouselog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOUSELOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaouselog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaouselog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
