/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataUserrequest.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.userrequest_Dao;
import com.szty.aihao.core.userrequest_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@USERREQUEST逻辑层接口
    *@作者：宋春林 
    */

	public class userrequest_service
	{
        public  userrequest_core _dal=classFactory.getuserrequest();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param USERREQUEST实体
         * @return 新插入记录的编号
         */
		public int insert_userrequest (userrequest_Dao _USERREQUESTModel )  throws Exception{
         return _dal.insert_userrequest( _USERREQUESTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param USERREQUESTprrameter
         * @return 新插入记录的编号
         */
         public int insert_userrequest(Object[] _para)  throws Exception{
        return _dal.insert_userrequest( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param USERREQUEST实体
         * @return 影响的行数
         */
		public int update_userrequest(userrequest_Dao _USERREQUESTModel)  throws Exception{
        return _dal.update_userrequest( _USERREQUESTModel);
		}
	
		

         /**
         *  删除数据表USERREQUEST中的一条记录
         * @param USERREQUEST实体
         * @return 新插入记录的编号
         */
		public int delete_userrequest(int Msgid)  throws Exception{
        return _dal.delete_userrequest( Msgid);
		}

		

       
          /**
         * 得到 userrequest 数据实体
         * @param Msgid">Msgid
         * @return<userrequest 数据实体
        * @throws Exception 
         */
		public userrequest_Dao get_userrequestDao(int Msgid) throws Exception{
        return _dal.get_userrequestDao( Msgid);
		}
		
		    /**
         * 根据USERREQUEST返回的查询DataRow创建一个USERREQUESTEntity对象
         * @param USERREQUEST row
         * @returnUSERREQUESTList对象
        * @throws Exception 
         */
		public List<userrequest_Dao> get_userrequest_All() throws Exception{
            return _dal.get_userrequest_All();
            }
		    /**
         * 根据USERREQUEST返回的查询DataRow创建一个USERREQUESTEntity对象
         * @param USERREQUEST row
         * @returnUSERREQUESTList对象
        * @throws Exception 
         */
		public List<userrequest_Dao> get_userrequest_All(String strWhere) throws Exception{
            return _dal.get_userrequest_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<userrequest_Dao> get_userrequest_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_userrequest_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据USERREQUEST返回的查询DataRow创建一个USERREQUESTEntity对象
         * @param USERREQUEST row
         * @returnUSERREQUESTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, userrequest_Dao> get_userrequest_Dictionary(String strWhere) throws Exception{
            return _dal.get_userrequest_Dictionary(strWhere);
            }
		 /**
         * 更新USERREQUEST字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_userrequest_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_userrequest_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新USERREQUESTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_userrequest_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_userrequest_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新USERREQUESTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createuserrequest_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_userrequest_UpdateString( FieldName, Value, sid);
            }
        
        
    }
