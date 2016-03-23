/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumquote.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumquote_Dao;
import com.szty.aihao.core.mvnforumquote_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMQUOTE逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumquote_service
	{
        public  mvnforumquote_core _dal=classFactory.getmvnforumquote();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMQUOTE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumquote (mvnforumquote_Dao _MVNFORUMQUOTEModel )  throws Exception{
         return _dal.insert_mvnforumquote( _MVNFORUMQUOTEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMQUOTEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumquote(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumquote( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMQUOTE实体
         * @return 影响的行数
         */
		public int update_mvnforumquote(mvnforumquote_Dao _MVNFORUMQUOTEModel)  throws Exception{
        return _dal.update_mvnforumquote( _MVNFORUMQUOTEModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMQUOTE中的一条记录
         * @param MVNFORUMQUOTE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumquote(int Quoteid)  throws Exception{
        return _dal.delete_mvnforumquote( Quoteid);
		}

		

       
          /**
         * 得到 mvnforumquote 数据实体
         * @param Quoteid">Quoteid
         * @return<mvnforumquote 数据实体
        * @throws Exception 
         */
		public mvnforumquote_Dao get_mvnforumquoteDao(int Quoteid) throws Exception{
        return _dal.get_mvnforumquoteDao( Quoteid);
		}
		
		    /**
         * 根据MVNFORUMQUOTE返回的查询DataRow创建一个MVNFORUMQUOTEEntity对象
         * @param MVNFORUMQUOTE row
         * @returnMVNFORUMQUOTEList对象
        * @throws Exception 
         */
		public List<mvnforumquote_Dao> get_mvnforumquote_All() throws Exception{
            return _dal.get_mvnforumquote_All();
            }
		    /**
         * 根据MVNFORUMQUOTE返回的查询DataRow创建一个MVNFORUMQUOTEEntity对象
         * @param MVNFORUMQUOTE row
         * @returnMVNFORUMQUOTEList对象
        * @throws Exception 
         */
		public List<mvnforumquote_Dao> get_mvnforumquote_All(String strWhere) throws Exception{
            return _dal.get_mvnforumquote_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumquote_Dao> get_mvnforumquote_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumquote_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMQUOTE返回的查询DataRow创建一个MVNFORUMQUOTEEntity对象
         * @param MVNFORUMQUOTE row
         * @returnMVNFORUMQUOTEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumquote_Dao> get_mvnforumquote_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumquote_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMQUOTE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumquote_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumquote_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMQUOTEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumquote_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumquote_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMQUOTEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumquote_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumquote_UpdateString( FieldName, Value, sid);
            }
        
        
    }
