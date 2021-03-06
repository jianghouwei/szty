﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataNews.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.news_Dao;
import com.szty.aihao.core.news_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@NEWS逻辑层接口
    *@作者：宋春林 
    */

	public class news_service
	{
        public  news_core _dal=classFactory.getnews();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param NEWS实体
         * @return 新插入记录的编号
         */
		public int insert_news (news_Dao _NEWSModel )  throws Exception{
         return _dal.insert_news( _NEWSModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param NEWSprrameter
         * @return 新插入记录的编号
         */
         public int insert_news(Object[] _para)  throws Exception{
        return _dal.insert_news( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param NEWS实体
         * @return 影响的行数
         */
		public int update_news(news_Dao _NEWSModel)  throws Exception{
        return _dal.update_news( _NEWSModel);
		}
	
		

         /**
         *  删除数据表NEWS中的一条记录
         * @param NEWS实体
         * @return 新插入记录的编号
         */
		public int delete_news(int Newsid)  throws Exception{
        return _dal.delete_news( Newsid);
		}

		

       
          /**
         * 得到 news 数据实体
         * @param Newsid">Newsid
         * @return<news 数据实体
        * @throws Exception 
         */
		public news_Dao get_newsDao(int Newsid) throws Exception{
        return _dal.get_newsDao( Newsid);
		}
		
		    /**
         * 根据NEWS返回的查询DataRow创建一个NEWSEntity对象
         * @param NEWS row
         * @returnNEWSList对象
        * @throws Exception 
         */
		public List<news_Dao> get_news_All() throws Exception{
            return _dal.get_news_All();
            }
		    /**
         * 根据NEWS返回的查询DataRow创建一个NEWSEntity对象
         * @param NEWS row
         * @returnNEWSList对象
        * @throws Exception 
         */
		public List<news_Dao> get_news_All(String strWhere) throws Exception{
            return _dal.get_news_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<news_Dao> get_news_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_news_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据NEWS返回的查询DataRow创建一个NEWSEntity对象
         * @param NEWS row
         * @returnNEWSDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, news_Dao> get_news_Dictionary(String strWhere) throws Exception{
            return _dal.get_news_Dictionary(strWhere);
            }
		 /**
         * 更新NEWS字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_news_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_news_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新NEWSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_news_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_news_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新NEWSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createnews_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_news_UpdateString( FieldName, Value, sid);
            }
        
        
    }
