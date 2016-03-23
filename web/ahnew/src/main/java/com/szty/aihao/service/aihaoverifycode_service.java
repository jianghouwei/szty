/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoverifycode.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoverifycode_Dao;
import com.szty.aihao.core.aihaoverifycode_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOVERIFYCODE逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoverifycode_service
	{
        public  aihaoverifycode_core _dal=classFactory.getaihaoverifycode();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOVERIFYCODE实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoverifycode (aihaoverifycode_Dao _AIHAOVERIFYCODEModel )  throws Exception{
         return _dal.insert_aihaoverifycode( _AIHAOVERIFYCODEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOVERIFYCODEprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoverifycode(Object[] _para)  throws Exception{
        return _dal.insert_aihaoverifycode( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOVERIFYCODE实体
         * @return 影响的行数
         */
		public int update_aihaoverifycode(aihaoverifycode_Dao _AIHAOVERIFYCODEModel)  throws Exception{
        return _dal.update_aihaoverifycode( _AIHAOVERIFYCODEModel);
		}
	
		

         /**
         *  删除数据表AIHAOVERIFYCODE中的一条记录
         * @param AIHAOVERIFYCODE实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoverifycode(int Id)  throws Exception{
        return _dal.delete_aihaoverifycode( Id);
		}

		

       
          /**
         * 得到 aihaoverifycode 数据实体
         * @param Id">Id
         * @return<aihaoverifycode 数据实体
        * @throws Exception 
         */
		public aihaoverifycode_Dao get_aihaoverifycodeDao(int Id) throws Exception{
        return _dal.get_aihaoverifycodeDao( Id);
		}
		
		    /**
         * 根据AIHAOVERIFYCODE返回的查询DataRow创建一个AIHAOVERIFYCODEEntity对象
         * @param AIHAOVERIFYCODE row
         * @returnAIHAOVERIFYCODEList对象
        * @throws Exception 
         */
		public List<aihaoverifycode_Dao> get_aihaoverifycode_All() throws Exception{
            return _dal.get_aihaoverifycode_All();
            }
		    /**
         * 根据AIHAOVERIFYCODE返回的查询DataRow创建一个AIHAOVERIFYCODEEntity对象
         * @param AIHAOVERIFYCODE row
         * @returnAIHAOVERIFYCODEList对象
        * @throws Exception 
         */
		public List<aihaoverifycode_Dao> get_aihaoverifycode_All(String strWhere) throws Exception{
            return _dal.get_aihaoverifycode_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoverifycode_Dao> get_aihaoverifycode_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoverifycode_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOVERIFYCODE返回的查询DataRow创建一个AIHAOVERIFYCODEEntity对象
         * @param AIHAOVERIFYCODE row
         * @returnAIHAOVERIFYCODEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoverifycode_Dao> get_aihaoverifycode_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoverifycode_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOVERIFYCODE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoverifycode_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoverifycode_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOVERIFYCODEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoverifycode_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoverifycode_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOVERIFYCODEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoverifycode_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoverifycode_UpdateString( FieldName, Value, sid);
            }
        
        
    }
