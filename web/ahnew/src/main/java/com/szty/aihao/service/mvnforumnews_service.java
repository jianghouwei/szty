/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumnews.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumnews_Dao;
import com.szty.aihao.core.mvnforumnews_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMNEWS逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumnews_service
	{
        public  mvnforumnews_core _dal=classFactory.getmvnforumnews();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMNEWS实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumnews (mvnforumnews_Dao _MVNFORUMNEWSModel )  throws Exception{
         return _dal.insert_mvnforumnews( _MVNFORUMNEWSModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMNEWSprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumnews(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumnews( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMNEWS实体
         * @return 影响的行数
         */
		public int update_mvnforumnews(mvnforumnews_Dao _MVNFORUMNEWSModel)  throws Exception{
        return _dal.update_mvnforumnews( _MVNFORUMNEWSModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMNEWS中的一条记录
         * @param MVNFORUMNEWS实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumnews(int Newsid)  throws Exception{
        return _dal.delete_mvnforumnews( Newsid);
		}

		

       
          /**
         * 得到 mvnforumnews 数据实体
         * @param Newsid">Newsid
         * @return<mvnforumnews 数据实体
        * @throws Exception 
         */
		public mvnforumnews_Dao get_mvnforumnewsDao(int Newsid) throws Exception{
        return _dal.get_mvnforumnewsDao( Newsid);
		}
		
		    /**
         * 根据MVNFORUMNEWS返回的查询DataRow创建一个MVNFORUMNEWSEntity对象
         * @param MVNFORUMNEWS row
         * @returnMVNFORUMNEWSList对象
        * @throws Exception 
         */
		public List<mvnforumnews_Dao> get_mvnforumnews_All() throws Exception{
            return _dal.get_mvnforumnews_All();
            }
		    /**
         * 根据MVNFORUMNEWS返回的查询DataRow创建一个MVNFORUMNEWSEntity对象
         * @param MVNFORUMNEWS row
         * @returnMVNFORUMNEWSList对象
        * @throws Exception 
         */
		public List<mvnforumnews_Dao> get_mvnforumnews_All(String strWhere) throws Exception{
            return _dal.get_mvnforumnews_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumnews_Dao> get_mvnforumnews_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumnews_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMNEWS返回的查询DataRow创建一个MVNFORUMNEWSEntity对象
         * @param MVNFORUMNEWS row
         * @returnMVNFORUMNEWSDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumnews_Dao> get_mvnforumnews_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumnews_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMNEWS字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumnews_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumnews_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMNEWSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumnews_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumnews_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMNEWSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumnews_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumnews_UpdateString( FieldName, Value, sid);
            }
        
        
    }
