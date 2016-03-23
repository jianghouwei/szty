/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumattachment.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumattachment_Dao;
import com.szty.aihao.core.mvnforumattachment_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMATTACHMENT逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumattachment_service
	{
        public  mvnforumattachment_core _dal=classFactory.getmvnforumattachment();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMATTACHMENT实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumattachment (mvnforumattachment_Dao _MVNFORUMATTACHMENTModel )  throws Exception{
         return _dal.insert_mvnforumattachment( _MVNFORUMATTACHMENTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMATTACHMENTprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumattachment(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumattachment( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMATTACHMENT实体
         * @return 影响的行数
         */
		public int update_mvnforumattachment(mvnforumattachment_Dao _MVNFORUMATTACHMENTModel)  throws Exception{
        return _dal.update_mvnforumattachment( _MVNFORUMATTACHMENTModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMATTACHMENT中的一条记录
         * @param MVNFORUMATTACHMENT实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumattachment(int Attachid)  throws Exception{
        return _dal.delete_mvnforumattachment( Attachid);
		}

		

       
          /**
         * 得到 mvnforumattachment 数据实体
         * @param Attachid">Attachid
         * @return<mvnforumattachment 数据实体
        * @throws Exception 
         */
		public mvnforumattachment_Dao get_mvnforumattachmentDao(int Attachid) throws Exception{
        return _dal.get_mvnforumattachmentDao( Attachid);
		}
		
		    /**
         * 根据MVNFORUMATTACHMENT返回的查询DataRow创建一个MVNFORUMATTACHMENTEntity对象
         * @param MVNFORUMATTACHMENT row
         * @returnMVNFORUMATTACHMENTList对象
        * @throws Exception 
         */
		public List<mvnforumattachment_Dao> get_mvnforumattachment_All() throws Exception{
            return _dal.get_mvnforumattachment_All();
            }
		    /**
         * 根据MVNFORUMATTACHMENT返回的查询DataRow创建一个MVNFORUMATTACHMENTEntity对象
         * @param MVNFORUMATTACHMENT row
         * @returnMVNFORUMATTACHMENTList对象
        * @throws Exception 
         */
		public List<mvnforumattachment_Dao> get_mvnforumattachment_All(String strWhere) throws Exception{
            return _dal.get_mvnforumattachment_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumattachment_Dao> get_mvnforumattachment_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumattachment_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMATTACHMENT返回的查询DataRow创建一个MVNFORUMATTACHMENTEntity对象
         * @param MVNFORUMATTACHMENT row
         * @returnMVNFORUMATTACHMENTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumattachment_Dao> get_mvnforumattachment_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumattachment_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMATTACHMENT字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumattachment_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumattachment_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMATTACHMENTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumattachment_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumattachment_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMATTACHMENTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumattachment_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumattachment_UpdateString( FieldName, Value, sid);
            }
        
        
    }
