/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsymblacklist.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumsymblacklist_Dao;
import com.szty.aihao.core.mvnforumsymblacklist_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    *//**
    *@文件说明
    *@MVNFORUMSYMBLACKLIST逻辑层接口
    *@作者：宋春林 
    *//*

	public class mvnforumsymblacklist_service
	{
        public  mvnforumsymblacklist_core _dal=classFactory.getmvnforumsymblacklist();
	
     
         *//**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMBLACKLIST实体
         * @return 新插入记录的编号
         *//*
		public int insert_mvnforumsymblacklist (mvnforumsymblacklist_Dao _MVNFORUMSYMBLACKLISTModel )  throws Exception{
         return _dal.insert_mvnforumsymblacklist( _MVNFORUMSYMBLACKLISTModel);
		}
        
        *//**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMBLACKLISTprrameter
         * @return 新插入记录的编号
         *//*
         public int insert_mvnforumsymblacklist(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumsymblacklist( _para);
        }
	
		 *//**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMBLACKLIST实体
         * @return 影响的行数
         *//*
		public int update_mvnforumsymblacklist(mvnforumsymblacklist_Dao _MVNFORUMSYMBLACKLISTModel)  throws Exception{
        return _dal.update_mvnforumsymblacklist( _MVNFORUMSYMBLACKLISTModel);
		}
	
		

         *//**
         *  删除数据表MVNFORUMSYMBLACKLIST中的一条记录
         * @param MVNFORUMSYMBLACKLIST实体
         * @return 新插入记录的编号
         *//*
		public int delete_mvnforumsymblacklist(int Mobile)  throws Exception{
        return _dal.delete_mvnforumsymblacklist( Mobile);
		}

		

       
          *//**
         * 得到 mvnforumsymblacklist 数据实体
         * @param Mobile">Mobile
         * @return<mvnforumsymblacklist 数据实体
        * @throws Exception 
         *//*
		public mvnforumsymblacklist_Dao get_mvnforumsymblacklistDao(int Mobile) throws Exception{
        return _dal.get_mvnforumsymblacklistDao( Mobile);
		}
		
		    *//**
         * 根据MVNFORUMSYMBLACKLIST返回的查询DataRow创建一个MVNFORUMSYMBLACKLISTEntity对象
         * @param MVNFORUMSYMBLACKLIST row
         * @returnMVNFORUMSYMBLACKLISTList对象
        * @throws Exception 
         *//*
		public List<mvnforumsymblacklist_Dao> get_mvnforumsymblacklist_All() throws Exception{
            return _dal.get_mvnforumsymblacklist_All();
            }
		    *//**
         * 根据MVNFORUMSYMBLACKLIST返回的查询DataRow创建一个MVNFORUMSYMBLACKLISTEntity对象
         * @param MVNFORUMSYMBLACKLIST row
         * @returnMVNFORUMSYMBLACKLISTList对象
        * @throws Exception 
         *//*
		public List<mvnforumsymblacklist_Dao> get_mvnforumsymblacklist_All(String strWhere) throws Exception{
            return _dal.get_mvnforumsymblacklist_All(strWhere);
            } 
      根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 
	public List<mvnforumsymblacklist_Dao> get_mvnforumsymblacklist_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumsymblacklist_Page(pageSize,pageIndex,strWhere);
            }
           *//**
         * 根据MVNFORUMSYMBLACKLIST返回的查询DataRow创建一个MVNFORUMSYMBLACKLISTEntity对象
         * @param MVNFORUMSYMBLACKLIST row
         * @returnMVNFORUMSYMBLACKLISTDictionary对象
        * @throws Exception 
         *//*
        public Dictionary<Integer, mvnforumsymblacklist_Dao> get_mvnforumsymblacklist_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumsymblacklist_Dictionary(strWhere);
            }
		 *//**
         * 更新MVNFORUMSYMBLACKLIST字段加一
         * @param FieldName
         * @param sid
         *//*
	    public int create_mvnforumsymblacklist_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumsymblacklist_UpdateIncreate( FieldName, sid);
            }
         *//**
         * 更新MVNFORUMSYMBLACKLISTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         *//*
	    public int create_mvnforumsymblacklist_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumsymblacklist_UpdateInteger( FieldName, Num, sid);
            }
          *//**
         * 更新MVNFORUMSYMBLACKLISTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         *//*
	    public int createmvnforumsymblacklist_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumsymblacklist_UpdateString( FieldName, Value, sid);
            }
        
        
    }
*/