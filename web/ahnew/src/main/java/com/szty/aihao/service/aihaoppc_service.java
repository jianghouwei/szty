/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoppc.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoppc_Dao;
import com.szty.aihao.core.aihaoppc_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOPPC逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoppc_service
	{
        public  aihaoppc_core _dal=classFactory.getaihaoppc();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOPPC实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoppc (aihaoppc_Dao _AIHAOPPCModel )  throws Exception{
         return _dal.insert_aihaoppc( _AIHAOPPCModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOPPCprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoppc(Object[] _para)  throws Exception{
        return _dal.insert_aihaoppc( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOPPC实体
         * @return 影响的行数
         */
		public int update_aihaoppc(aihaoppc_Dao _AIHAOPPCModel)  throws Exception{
        return _dal.update_aihaoppc( _AIHAOPPCModel);
		}
	
		

         /**
         *  删除数据表AIHAOPPC中的一条记录
         * @param AIHAOPPC实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoppc(int Id)  throws Exception{
        return _dal.delete_aihaoppc( Id);
		}

		

       
          /**
         * 得到 aihaoppc 数据实体
         * @param Id">Id
         * @return<aihaoppc 数据实体
        * @throws Exception 
         */
		public aihaoppc_Dao get_aihaoppcDao(int Id) throws Exception{
        return _dal.get_aihaoppcDao( Id);
		}
		
		    /**
         * 根据AIHAOPPC返回的查询DataRow创建一个AIHAOPPCEntity对象
         * @param AIHAOPPC row
         * @returnAIHAOPPCList对象
        * @throws Exception 
         */
		public List<aihaoppc_Dao> get_aihaoppc_All() throws Exception{
            return _dal.get_aihaoppc_All();
            }
		    /**
         * 根据AIHAOPPC返回的查询DataRow创建一个AIHAOPPCEntity对象
         * @param AIHAOPPC row
         * @returnAIHAOPPCList对象
        * @throws Exception 
         */
		public List<aihaoppc_Dao> get_aihaoppc_All(String strWhere) throws Exception{
            return _dal.get_aihaoppc_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoppc_Dao> get_aihaoppc_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoppc_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOPPC返回的查询DataRow创建一个AIHAOPPCEntity对象
         * @param AIHAOPPC row
         * @returnAIHAOPPCDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoppc_Dao> get_aihaoppc_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoppc_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOPPC字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoppc_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoppc_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOPPCInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoppc_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoppc_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOPPCIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoppc_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoppc_UpdateString( FieldName, Value, sid);
            }
        
        
    }
