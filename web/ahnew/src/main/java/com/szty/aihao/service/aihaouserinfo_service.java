/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaouserinfo.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaouserinfo_Dao;
import com.szty.aihao.core.aihaouserinfo_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOUSERINFO逻辑层接口
    *@作者：宋春林 
    */

	public class aihaouserinfo_service
	{
        public  aihaouserinfo_core _dal=classFactory.getaihaouserinfo();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERINFO实体
         * @return 新插入记录的编号
         */
		public int insert_aihaouserinfo (aihaouserinfo_Dao _AIHAOUSERINFOModel )  throws Exception{
         return _dal.insert_aihaouserinfo( _AIHAOUSERINFOModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERINFOprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaouserinfo(Object[] _para)  throws Exception{
        return _dal.insert_aihaouserinfo( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOUSERINFO实体
         * @return 影响的行数
         */
		public int update_aihaouserinfo(aihaouserinfo_Dao _AIHAOUSERINFOModel)  throws Exception{
        return _dal.update_aihaouserinfo( _AIHAOUSERINFOModel);
		}
	
		

         /**
         *  删除数据表AIHAOUSERINFO中的一条记录
         * @param AIHAOUSERINFO实体
         * @return 新插入记录的编号
         */
		public int delete_aihaouserinfo(int Id)  throws Exception{
        return _dal.delete_aihaouserinfo( Id);
		}

		

       
          /**
         * 得到 aihaouserinfo 数据实体
         * @param Id">Id
         * @return<aihaouserinfo 数据实体
        * @throws Exception 
         */
		public aihaouserinfo_Dao get_aihaouserinfoDao(int Id) throws Exception{
        return _dal.get_aihaouserinfoDao( Id);
		}
		
		    /**
         * 根据AIHAOUSERINFO返回的查询DataRow创建一个AIHAOUSERINFOEntity对象
         * @param AIHAOUSERINFO row
         * @returnAIHAOUSERINFOList对象
        * @throws Exception 
         */
		public List<aihaouserinfo_Dao> get_aihaouserinfo_All() throws Exception{
            return _dal.get_aihaouserinfo_All();
            }
		    /**
         * 根据AIHAOUSERINFO返回的查询DataRow创建一个AIHAOUSERINFOEntity对象
         * @param AIHAOUSERINFO row
         * @returnAIHAOUSERINFOList对象
        * @throws Exception 
         */
		public List<aihaouserinfo_Dao> get_aihaouserinfo_All(String strWhere) throws Exception{
            return _dal.get_aihaouserinfo_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaouserinfo_Dao> get_aihaouserinfo_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaouserinfo_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOUSERINFO返回的查询DataRow创建一个AIHAOUSERINFOEntity对象
         * @param AIHAOUSERINFO row
         * @returnAIHAOUSERINFODictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaouserinfo_Dao> get_aihaouserinfo_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaouserinfo_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOUSERINFO字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaouserinfo_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaouserinfo_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOUSERINFOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaouserinfo_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaouserinfo_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOUSERINFOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaouserinfo_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaouserinfo_UpdateString( FieldName, Value, sid);
            }
        
        
    }
