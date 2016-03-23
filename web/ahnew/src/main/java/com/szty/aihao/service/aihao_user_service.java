/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao_user.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao_user_Dao;
import com.szty.aihao.core.aihao_user_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO_USER逻辑层接口
    *@作者：宋春林 
    */

	public class aihao_user_service
	{
        public  aihao_user_core _dal=classFactory.getaihao_user();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_USER实体
         * @return 新插入记录的编号
         */
		public int insert_aihao_user (aihao_user_Dao _AIHAO_USERModel )  throws Exception{
         return _dal.insert_aihao_user( _AIHAO_USERModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_USERprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao_user(Object[] _para)  throws Exception{
        return _dal.insert_aihao_user( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_USER实体
         * @return 影响的行数
         */
		public int update_aihao_user(aihao_user_Dao _AIHAO_USERModel)  throws Exception{
        return _dal.update_aihao_user( _AIHAO_USERModel);
		}
	
		

         /**
         *  删除数据表AIHAO_USER中的一条记录
         * @param AIHAO_USER实体
         * @return 新插入记录的编号
         */
		public int delete_aihao_user(int Id)  throws Exception{
        return _dal.delete_aihao_user( Id);
		}

		

       
          /**
         * 得到 aihao_user 数据实体
         * @param Id">Id
         * @return<aihao_user 数据实体
        * @throws Exception 
         */
		public aihao_user_Dao get_aihao_userDao(int Id) throws Exception{
        return _dal.get_aihao_userDao( Id);
		}
		
		    /**
         * 根据AIHAO_USER返回的查询DataRow创建一个AIHAO_USEREntity对象
         * @param AIHAO_USER row
         * @returnAIHAO_USERList对象
        * @throws Exception 
         */
		public List<aihao_user_Dao> get_aihao_user_All() throws Exception{
            return _dal.get_aihao_user_All();
            }
		    /**
         * 根据AIHAO_USER返回的查询DataRow创建一个AIHAO_USEREntity对象
         * @param AIHAO_USER row
         * @returnAIHAO_USERList对象
        * @throws Exception 
         */
		public List<aihao_user_Dao> get_aihao_user_All(String strWhere) throws Exception{
            return _dal.get_aihao_user_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao_user_Dao> get_aihao_user_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao_user_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO_USER返回的查询DataRow创建一个AIHAO_USEREntity对象
         * @param AIHAO_USER row
         * @returnAIHAO_USERDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao_user_Dao> get_aihao_user_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao_user_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO_USER字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao_user_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao_user_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO_USERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao_user_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao_user_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO_USERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao_user_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao_user_UpdateString( FieldName, Value, sid);
            }
        
        
    }
