/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumforum.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumforum_Dao;
import com.szty.aihao.core.mvnforumforum_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMFORUM逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumforum_service
	{
        public  mvnforumforum_core _dal=classFactory.getmvnforumforum();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMFORUM实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumforum (mvnforumforum_Dao _MVNFORUMFORUMModel )  throws Exception{
         return _dal.insert_mvnforumforum( _MVNFORUMFORUMModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMFORUMprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumforum(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumforum( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMFORUM实体
         * @return 影响的行数
         */
		public int update_mvnforumforum(mvnforumforum_Dao _MVNFORUMFORUMModel)  throws Exception{
        return _dal.update_mvnforumforum( _MVNFORUMFORUMModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMFORUM中的一条记录
         * @param MVNFORUMFORUM实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumforum(int Forumid)  throws Exception{
        return _dal.delete_mvnforumforum( Forumid);
		}

		

       
          /**
         * 得到 mvnforumforum 数据实体
         * @param Forumid">Forumid
         * @return<mvnforumforum 数据实体
        * @throws Exception 
         */
		public mvnforumforum_Dao get_mvnforumforumDao(int Forumid) throws Exception{
        return _dal.get_mvnforumforumDao( Forumid);
		}
		
		    /**
         * 根据MVNFORUMFORUM返回的查询DataRow创建一个MVNFORUMFORUMEntity对象
         * @param MVNFORUMFORUM row
         * @returnMVNFORUMFORUMList对象
        * @throws Exception 
         */
		public List<mvnforumforum_Dao> get_mvnforumforum_All() throws Exception{
            return _dal.get_mvnforumforum_All();
            }
		    /**
         * 根据MVNFORUMFORUM返回的查询DataRow创建一个MVNFORUMFORUMEntity对象
         * @param MVNFORUMFORUM row
         * @returnMVNFORUMFORUMList对象
        * @throws Exception 
         */
		public List<mvnforumforum_Dao> get_mvnforumforum_All(String strWhere) throws Exception{
            return _dal.get_mvnforumforum_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumforum_Dao> get_mvnforumforum_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumforum_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMFORUM返回的查询DataRow创建一个MVNFORUMFORUMEntity对象
         * @param MVNFORUMFORUM row
         * @returnMVNFORUMFORUMDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumforum_Dao> get_mvnforumforum_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumforum_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMFORUM字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumforum_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumforum_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMFORUMInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumforum_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumforum_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMFORUMIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumforum_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumforum_UpdateString( FieldName, Value, sid);
            }
        
        
    }
