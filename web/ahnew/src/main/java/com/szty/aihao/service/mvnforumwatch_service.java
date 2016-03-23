/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumwatch.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumwatch_Dao;
import com.szty.aihao.core.mvnforumwatch_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMWATCH逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumwatch_service
	{
        public  mvnforumwatch_core _dal=classFactory.getmvnforumwatch();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWATCH实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumwatch (mvnforumwatch_Dao _MVNFORUMWATCHModel )  throws Exception{
         return _dal.insert_mvnforumwatch( _MVNFORUMWATCHModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWATCHprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumwatch(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumwatch( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWATCH实体
         * @return 影响的行数
         */
		public int update_mvnforumwatch(mvnforumwatch_Dao _MVNFORUMWATCHModel)  throws Exception{
        return _dal.update_mvnforumwatch( _MVNFORUMWATCHModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMWATCH中的一条记录
         * @param MVNFORUMWATCH实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumwatch(int Watchid)  throws Exception{
        return _dal.delete_mvnforumwatch( Watchid);
		}

		

       
          /**
         * 得到 mvnforumwatch 数据实体
         * @param Watchid">Watchid
         * @return<mvnforumwatch 数据实体
        * @throws Exception 
         */
		public mvnforumwatch_Dao get_mvnforumwatchDao(int Watchid) throws Exception{
        return _dal.get_mvnforumwatchDao( Watchid);
		}
		
		    /**
         * 根据MVNFORUMWATCH返回的查询DataRow创建一个MVNFORUMWATCHEntity对象
         * @param MVNFORUMWATCH row
         * @returnMVNFORUMWATCHList对象
        * @throws Exception 
         */
		public List<mvnforumwatch_Dao> get_mvnforumwatch_All() throws Exception{
            return _dal.get_mvnforumwatch_All();
            }
		    /**
         * 根据MVNFORUMWATCH返回的查询DataRow创建一个MVNFORUMWATCHEntity对象
         * @param MVNFORUMWATCH row
         * @returnMVNFORUMWATCHList对象
        * @throws Exception 
         */
		public List<mvnforumwatch_Dao> get_mvnforumwatch_All(String strWhere) throws Exception{
            return _dal.get_mvnforumwatch_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumwatch_Dao> get_mvnforumwatch_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumwatch_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMWATCH返回的查询DataRow创建一个MVNFORUMWATCHEntity对象
         * @param MVNFORUMWATCH row
         * @returnMVNFORUMWATCHDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumwatch_Dao> get_mvnforumwatch_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumwatch_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMWATCH字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumwatch_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumwatch_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMWATCHInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumwatch_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumwatch_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMWATCHIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumwatch_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumwatch_UpdateString( FieldName, Value, sid);
            }
        
        
    }
