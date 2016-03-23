/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumrank.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumrank_Dao;
import com.szty.aihao.core.mvnforumrank_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMRANK逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumrank_service
	{
        public  mvnforumrank_core _dal=classFactory.getmvnforumrank();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRANK实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumrank (mvnforumrank_Dao _MVNFORUMRANKModel )  throws Exception{
         return _dal.insert_mvnforumrank( _MVNFORUMRANKModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRANKprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumrank(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumrank( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRANK实体
         * @return 影响的行数
         */
		public int update_mvnforumrank(mvnforumrank_Dao _MVNFORUMRANKModel)  throws Exception{
        return _dal.update_mvnforumrank( _MVNFORUMRANKModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMRANK中的一条记录
         * @param MVNFORUMRANK实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumrank(int Rankid)  throws Exception{
        return _dal.delete_mvnforumrank( Rankid);
		}

		

       
          /**
         * 得到 mvnforumrank 数据实体
         * @param Rankid">Rankid
         * @return<mvnforumrank 数据实体
        * @throws Exception 
         */
		public mvnforumrank_Dao get_mvnforumrankDao(int Rankid) throws Exception{
        return _dal.get_mvnforumrankDao( Rankid);
		}
		
		    /**
         * 根据MVNFORUMRANK返回的查询DataRow创建一个MVNFORUMRANKEntity对象
         * @param MVNFORUMRANK row
         * @returnMVNFORUMRANKList对象
        * @throws Exception 
         */
		public List<mvnforumrank_Dao> get_mvnforumrank_All() throws Exception{
            return _dal.get_mvnforumrank_All();
            }
		    /**
         * 根据MVNFORUMRANK返回的查询DataRow创建一个MVNFORUMRANKEntity对象
         * @param MVNFORUMRANK row
         * @returnMVNFORUMRANKList对象
        * @throws Exception 
         */
		public List<mvnforumrank_Dao> get_mvnforumrank_All(String strWhere) throws Exception{
            return _dal.get_mvnforumrank_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumrank_Dao> get_mvnforumrank_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumrank_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMRANK返回的查询DataRow创建一个MVNFORUMRANKEntity对象
         * @param MVNFORUMRANK row
         * @returnMVNFORUMRANKDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumrank_Dao> get_mvnforumrank_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumrank_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMRANK字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumrank_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumrank_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMRANKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumrank_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumrank_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMRANKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumrank_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumrank_UpdateString( FieldName, Value, sid);
            }
        
        
    }
