﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumcity.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumcity_Dao;
import com.szty.aihao.core.mvnforumcity_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMCITY逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumcity_service
	{
        public  mvnforumcity_core _dal=classFactory.getmvnforumcity();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMCITY实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumcity (mvnforumcity_Dao _MVNFORUMCITYModel )  throws Exception{
         return _dal.insert_mvnforumcity( _MVNFORUMCITYModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMCITYprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumcity(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumcity( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMCITY实体
         * @return 影响的行数
         */
		public int update_mvnforumcity(mvnforumcity_Dao _MVNFORUMCITYModel)  throws Exception{
        return _dal.update_mvnforumcity( _MVNFORUMCITYModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMCITY中的一条记录
         * @param MVNFORUMCITY实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumcity(int Cityid)  throws Exception{
        return _dal.delete_mvnforumcity( Cityid);
		}

		

       
          /**
         * 得到 mvnforumcity 数据实体
         * @param Cityid">Cityid
         * @return<mvnforumcity 数据实体
        * @throws Exception 
         */
		public mvnforumcity_Dao get_mvnforumcityDao(int Cityid) throws Exception{
        return _dal.get_mvnforumcityDao( Cityid);
		}
		
		    /**
         * 根据MVNFORUMCITY返回的查询DataRow创建一个MVNFORUMCITYEntity对象
         * @param MVNFORUMCITY row
         * @returnMVNFORUMCITYList对象
        * @throws Exception 
         */
		public List<mvnforumcity_Dao> get_mvnforumcity_All() throws Exception{
            return _dal.get_mvnforumcity_All();
            }
		    /**
         * 根据MVNFORUMCITY返回的查询DataRow创建一个MVNFORUMCITYEntity对象
         * @param MVNFORUMCITY row
         * @returnMVNFORUMCITYList对象
        * @throws Exception 
         */
		public List<mvnforumcity_Dao> get_mvnforumcity_All(String strWhere) throws Exception{
            return _dal.get_mvnforumcity_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumcity_Dao> get_mvnforumcity_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumcity_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMCITY返回的查询DataRow创建一个MVNFORUMCITYEntity对象
         * @param MVNFORUMCITY row
         * @returnMVNFORUMCITYDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumcity_Dao> get_mvnforumcity_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumcity_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMCITY字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumcity_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumcity_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMCITYInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumcity_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumcity_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMCITYIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumcity_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumcity_UpdateString( FieldName, Value, sid);
            }
        
        
    }
