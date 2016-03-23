/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumthread.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumthread_Dao;
import com.szty.aihao.core.mvnforumthread_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMTHREAD逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumthread_service
	{
        public  mvnforumthread_core _dal=classFactory.getmvnforumthread();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMTHREAD实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumthread (mvnforumthread_Dao _MVNFORUMTHREADModel )  throws Exception{
         return _dal.insert_mvnforumthread( _MVNFORUMTHREADModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMTHREADprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumthread(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumthread( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMTHREAD实体
         * @return 影响的行数
         */
		public int update_mvnforumthread(mvnforumthread_Dao _MVNFORUMTHREADModel)  throws Exception{
        return _dal.update_mvnforumthread( _MVNFORUMTHREADModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMTHREAD中的一条记录
         * @param MVNFORUMTHREAD实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumthread(int Threadid)  throws Exception{
        return _dal.delete_mvnforumthread( Threadid);
		}

		

       
          /**
         * 得到 mvnforumthread 数据实体
         * @param Threadid">Threadid
         * @return<mvnforumthread 数据实体
        * @throws Exception 
         */
		public mvnforumthread_Dao get_mvnforumthreadDao(int Threadid) throws Exception{
        return _dal.get_mvnforumthreadDao( Threadid);
		}
		
		    /**
         * 根据MVNFORUMTHREAD返回的查询DataRow创建一个MVNFORUMTHREADEntity对象
         * @param MVNFORUMTHREAD row
         * @returnMVNFORUMTHREADList对象
        * @throws Exception 
         */
		public List<mvnforumthread_Dao> get_mvnforumthread_All() throws Exception{
            return _dal.get_mvnforumthread_All();
            }
		    /**
         * 根据MVNFORUMTHREAD返回的查询DataRow创建一个MVNFORUMTHREADEntity对象
         * @param MVNFORUMTHREAD row
         * @returnMVNFORUMTHREADList对象
        * @throws Exception 
         */
		public List<mvnforumthread_Dao> get_mvnforumthread_All(String strWhere) throws Exception{
            return _dal.get_mvnforumthread_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumthread_Dao> get_mvnforumthread_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumthread_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMTHREAD返回的查询DataRow创建一个MVNFORUMTHREADEntity对象
         * @param MVNFORUMTHREAD row
         * @returnMVNFORUMTHREADDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumthread_Dao> get_mvnforumthread_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumthread_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMTHREAD字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumthread_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumthread_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMTHREADInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumthread_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumthread_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMTHREADIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumthread_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumthread_UpdateString( FieldName, Value, sid);
            }
        
        
    }
