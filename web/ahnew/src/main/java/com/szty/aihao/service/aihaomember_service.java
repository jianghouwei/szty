/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaomember.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaomember_Dao;
import com.szty.aihao.core.aihaomember_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOMEMBER逻辑层接口
    *@作者：宋春林 
    */

	public class aihaomember_service
	{
        public  aihaomember_core _dal=classFactory.getaihaomember();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOMEMBER实体
         * @return 新插入记录的编号
         */
		public int insert_aihaomember (aihaomember_Dao _AIHAOMEMBERModel )  throws Exception{
         return _dal.insert_aihaomember( _AIHAOMEMBERModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOMEMBERprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaomember(Object[] _para)  throws Exception{
        return _dal.insert_aihaomember( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOMEMBER实体
         * @return 影响的行数
         */
		public int update_aihaomember(aihaomember_Dao _AIHAOMEMBERModel)  throws Exception{
        return _dal.update_aihaomember( _AIHAOMEMBERModel);
		}
	
		

         /**
         *  删除数据表AIHAOMEMBER中的一条记录
         * @param AIHAOMEMBER实体
         * @return 新插入记录的编号
         */
		public int delete_aihaomember(int Memberid)  throws Exception{
        return _dal.delete_aihaomember( Memberid);
		}

		

       
          /**
         * 得到 aihaomember 数据实体
         * @param Memberid">Memberid
         * @return<aihaomember 数据实体
        * @throws Exception 
         */
		public aihaomember_Dao get_aihaomemberDao(int Memberid) throws Exception{
        return _dal.get_aihaomemberDao( Memberid);
		}
		
		    /**
         * 根据AIHAOMEMBER返回的查询DataRow创建一个AIHAOMEMBEREntity对象
         * @param AIHAOMEMBER row
         * @returnAIHAOMEMBERList对象
        * @throws Exception 
         */
		public List<aihaomember_Dao> get_aihaomember_All() throws Exception{
            return _dal.get_aihaomember_All();
            }
		    /**
         * 根据AIHAOMEMBER返回的查询DataRow创建一个AIHAOMEMBEREntity对象
         * @param AIHAOMEMBER row
         * @returnAIHAOMEMBERList对象
        * @throws Exception 
         */
		public List<aihaomember_Dao> get_aihaomember_All(String strWhere) throws Exception{
            return _dal.get_aihaomember_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaomember_Dao> get_aihaomember_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaomember_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOMEMBER返回的查询DataRow创建一个AIHAOMEMBEREntity对象
         * @param AIHAOMEMBER row
         * @returnAIHAOMEMBERDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaomember_Dao> get_aihaomember_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaomember_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOMEMBER字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaomember_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaomember_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOMEMBERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaomember_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaomember_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOMEMBERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaomember_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaomember_UpdateString( FieldName, Value, sid);
            }
        
        
    }
