/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumring.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumring_Dao;
import com.szty.aihao.core.mvnforumring_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMRING逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumring_service
	{
        public  mvnforumring_core _dal=classFactory.getmvnforumring();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRING实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumring (mvnforumring_Dao _MVNFORUMRINGModel )  throws Exception{
         return _dal.insert_mvnforumring( _MVNFORUMRINGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRINGprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumring(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumring( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRING实体
         * @return 影响的行数
         */
		public int update_mvnforumring(mvnforumring_Dao _MVNFORUMRINGModel)  throws Exception{
        return _dal.update_mvnforumring( _MVNFORUMRINGModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMRING中的一条记录
         * @param MVNFORUMRING实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumring(int Ringid)  throws Exception{
        return _dal.delete_mvnforumring( Ringid);
		}

		

       
          /**
         * 得到 mvnforumring 数据实体
         * @param Ringid">Ringid
         * @return<mvnforumring 数据实体
        * @throws Exception 
         */
		public mvnforumring_Dao get_mvnforumringDao(int Ringid) throws Exception{
        return _dal.get_mvnforumringDao( Ringid);
		}
		
		    /**
         * 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
         * @param MVNFORUMRING row
         * @returnMVNFORUMRINGList对象
        * @throws Exception 
         */
		public List<mvnforumring_Dao> get_mvnforumring_All() throws Exception{
            return _dal.get_mvnforumring_All();
            }
		    /**
         * 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
         * @param MVNFORUMRING row
         * @returnMVNFORUMRINGList对象
        * @throws Exception 
         */
		public List<mvnforumring_Dao> get_mvnforumring_All(String strWhere) throws Exception{
            return _dal.get_mvnforumring_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumring_Dao> get_mvnforumring_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumring_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMRING返回的查询DataRow创建一个MVNFORUMRINGEntity对象
         * @param MVNFORUMRING row
         * @returnMVNFORUMRINGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumring_Dao> get_mvnforumring_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumring_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMRING字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumring_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumring_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMRINGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumring_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumring_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMRINGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumring_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumring_UpdateString( FieldName, Value, sid);
            }
        
        
    }
