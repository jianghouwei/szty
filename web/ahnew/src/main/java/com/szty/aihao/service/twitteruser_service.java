/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTwitteruser.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.twitteruser_Dao;
import com.szty.aihao.core.twitteruser_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TWITTERUSER逻辑层接口
    *@作者：宋春林 
    */

	public class twitteruser_service
	{
        public  twitteruser_core _dal=classFactory.gettwitteruser();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TWITTERUSER实体
         * @return 新插入记录的编号
         */
		public int insert_twitteruser (twitteruser_Dao _TWITTERUSERModel )  throws Exception{
         return _dal.insert_twitteruser( _TWITTERUSERModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TWITTERUSERprrameter
         * @return 新插入记录的编号
         */
         public int insert_twitteruser(Object[] _para)  throws Exception{
        return _dal.insert_twitteruser( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TWITTERUSER实体
         * @return 影响的行数
         */
		public int update_twitteruser(twitteruser_Dao _TWITTERUSERModel)  throws Exception{
        return _dal.update_twitteruser( _TWITTERUSERModel);
		}
	
		

         /**
         *  删除数据表TWITTERUSER中的一条记录
         * @param TWITTERUSER实体
         * @return 新插入记录的编号
         */
		public int delete_twitteruser(int Userid)  throws Exception{
        return _dal.delete_twitteruser( Userid);
		}

		

       
          /**
         * 得到 twitteruser 数据实体
         * @param Userid">Userid
         * @return<twitteruser 数据实体
        * @throws Exception 
         */
		public twitteruser_Dao get_twitteruserDao(int Userid) throws Exception{
        return _dal.get_twitteruserDao( Userid);
		}
		
		    /**
         * 根据TWITTERUSER返回的查询DataRow创建一个TWITTERUSEREntity对象
         * @param TWITTERUSER row
         * @returnTWITTERUSERList对象
        * @throws Exception 
         */
		public List<twitteruser_Dao> get_twitteruser_All() throws Exception{
            return _dal.get_twitteruser_All();
            }
		    /**
         * 根据TWITTERUSER返回的查询DataRow创建一个TWITTERUSEREntity对象
         * @param TWITTERUSER row
         * @returnTWITTERUSERList对象
        * @throws Exception 
         */
		public List<twitteruser_Dao> get_twitteruser_All(String strWhere) throws Exception{
            return _dal.get_twitteruser_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<twitteruser_Dao> get_twitteruser_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_twitteruser_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TWITTERUSER返回的查询DataRow创建一个TWITTERUSEREntity对象
         * @param TWITTERUSER row
         * @returnTWITTERUSERDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, twitteruser_Dao> get_twitteruser_Dictionary(String strWhere) throws Exception{
            return _dal.get_twitteruser_Dictionary(strWhere);
            }
		 /**
         * 更新TWITTERUSER字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_twitteruser_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_twitteruser_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TWITTERUSERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_twitteruser_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_twitteruser_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TWITTERUSERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtwitteruser_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_twitteruser_UpdateString( FieldName, Value, sid);
            }
        
        
    }
