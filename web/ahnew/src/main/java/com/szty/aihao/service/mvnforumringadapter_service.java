/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumringadapter.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumringadapter_Dao;
import com.szty.aihao.core.mvnforumringadapter_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMRINGADAPTER逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumringadapter_service
	{
        public  mvnforumringadapter_core _dal=classFactory.getmvnforumringadapter();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRINGADAPTER实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumringadapter (mvnforumringadapter_Dao _MVNFORUMRINGADAPTERModel )  throws Exception{
         return _dal.insert_mvnforumringadapter( _MVNFORUMRINGADAPTERModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRINGADAPTERprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumringadapter(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumringadapter( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMRINGADAPTER实体
         * @return 影响的行数
         */
		public int update_mvnforumringadapter(mvnforumringadapter_Dao _MVNFORUMRINGADAPTERModel)  throws Exception{
        return _dal.update_mvnforumringadapter( _MVNFORUMRINGADAPTERModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMRINGADAPTER中的一条记录
         * @param MVNFORUMRINGADAPTER实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumringadapter(int Adapterid)  throws Exception{
        return _dal.delete_mvnforumringadapter( Adapterid);
		}

		

       
          /**
         * 得到 mvnforumringadapter 数据实体
         * @param Adapterid">Adapterid
         * @return<mvnforumringadapter 数据实体
        * @throws Exception 
         */
		public mvnforumringadapter_Dao get_mvnforumringadapterDao(int Adapterid) throws Exception{
        return _dal.get_mvnforumringadapterDao( Adapterid);
		}
		
		    /**
         * 根据MVNFORUMRINGADAPTER返回的查询DataRow创建一个MVNFORUMRINGADAPTEREntity对象
         * @param MVNFORUMRINGADAPTER row
         * @returnMVNFORUMRINGADAPTERList对象
        * @throws Exception 
         */
		public List<mvnforumringadapter_Dao> get_mvnforumringadapter_All() throws Exception{
            return _dal.get_mvnforumringadapter_All();
            }
		    /**
         * 根据MVNFORUMRINGADAPTER返回的查询DataRow创建一个MVNFORUMRINGADAPTEREntity对象
         * @param MVNFORUMRINGADAPTER row
         * @returnMVNFORUMRINGADAPTERList对象
        * @throws Exception 
         */
		public List<mvnforumringadapter_Dao> get_mvnforumringadapter_All(String strWhere) throws Exception{
            return _dal.get_mvnforumringadapter_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumringadapter_Dao> get_mvnforumringadapter_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumringadapter_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMRINGADAPTER返回的查询DataRow创建一个MVNFORUMRINGADAPTEREntity对象
         * @param MVNFORUMRINGADAPTER row
         * @returnMVNFORUMRINGADAPTERDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumringadapter_Dao> get_mvnforumringadapter_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumringadapter_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMRINGADAPTER字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumringadapter_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumringadapter_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMRINGADAPTERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumringadapter_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumringadapter_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMRINGADAPTERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumringadapter_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumringadapter_UpdateString( FieldName, Value, sid);
            }
        
        
    }
