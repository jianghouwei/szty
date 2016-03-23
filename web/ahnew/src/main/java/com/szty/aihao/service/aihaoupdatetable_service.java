/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoupdatetable.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoupdatetable_Dao;
import com.szty.aihao.core.aihaoupdatetable_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOUPDATETABLE逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoupdatetable_service
	{
        public  aihaoupdatetable_core _dal=classFactory.getaihaoupdatetable();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUPDATETABLE实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoupdatetable (aihaoupdatetable_Dao _AIHAOUPDATETABLEModel )  throws Exception{
         return _dal.insert_aihaoupdatetable( _AIHAOUPDATETABLEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUPDATETABLEprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoupdatetable(Object[] _para)  throws Exception{
        return _dal.insert_aihaoupdatetable( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUPDATETABLE实体
         * @return 影响的行数
         */
		public int update_aihaoupdatetable(aihaoupdatetable_Dao _AIHAOUPDATETABLEModel)  throws Exception{
        return _dal.update_aihaoupdatetable( _AIHAOUPDATETABLEModel);
		}
	
		

         /**
         *  删除数据表AIHAOUPDATETABLE中的一条记录
         * @param AIHAOUPDATETABLE实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoupdatetable(int Id)  throws Exception{
        return _dal.delete_aihaoupdatetable( Id);
		}

		

       
          /**
         * 得到 aihaoupdatetable 数据实体
         * @param Id">Id
         * @return<aihaoupdatetable 数据实体
        * @throws Exception 
         */
		public aihaoupdatetable_Dao get_aihaoupdatetableDao(int Id) throws Exception{
        return _dal.get_aihaoupdatetableDao( Id);
		}
		
		    /**
         * 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
         * @param AIHAOUPDATETABLE row
         * @returnAIHAOUPDATETABLEList对象
        * @throws Exception 
         */
		public List<aihaoupdatetable_Dao> get_aihaoupdatetable_All() throws Exception{
            return _dal.get_aihaoupdatetable_All();
            }
		    /**
         * 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
         * @param AIHAOUPDATETABLE row
         * @returnAIHAOUPDATETABLEList对象
        * @throws Exception 
         */
		public List<aihaoupdatetable_Dao> get_aihaoupdatetable_All(String strWhere) throws Exception{
            return _dal.get_aihaoupdatetable_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoupdatetable_Dao> get_aihaoupdatetable_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoupdatetable_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOUPDATETABLE返回的查询DataRow创建一个AIHAOUPDATETABLEEntity对象
         * @param AIHAOUPDATETABLE row
         * @returnAIHAOUPDATETABLEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoupdatetable_Dao> get_aihaoupdatetable_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoupdatetable_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOUPDATETABLE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoupdatetable_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoupdatetable_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOUPDATETABLEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoupdatetable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoupdatetable_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOUPDATETABLEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoupdatetable_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoupdatetable_UpdateString( FieldName, Value, sid);
            }
        
        
    }
