/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataUrlhao.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.urlhao_Dao;
import com.szty.aihao.core.urlhao_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@URLHAO逻辑层接口
    *@作者：宋春林 
    */

	public class urlhao_service
	{
        public  urlhao_core _dal=classFactory.geturlhao();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param URLHAO实体
         * @return 新插入记录的编号
         */
		public int insert_urlhao (urlhao_Dao _URLHAOModel )  throws Exception{
         return _dal.insert_urlhao( _URLHAOModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param URLHAOprrameter
         * @return 新插入记录的编号
         */
         public int insert_urlhao(Object[] _para)  throws Exception{
        return _dal.insert_urlhao( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param URLHAO实体
         * @return 影响的行数
         */
		public int update_urlhao(urlhao_Dao _URLHAOModel)  throws Exception{
        return _dal.update_urlhao( _URLHAOModel);
		}
	
		

         /**
         *  删除数据表URLHAO中的一条记录
         * @param URLHAO实体
         * @return 新插入记录的编号
         */
		public int delete_urlhao(int Haoid)  throws Exception{
        return _dal.delete_urlhao( Haoid);
		}

		

       
          /**
         * 得到 urlhao 数据实体
         * @param Haoid">Haoid
         * @return<urlhao 数据实体
        * @throws Exception 
         */
		public urlhao_Dao get_urlhaoDao(int Haoid) throws Exception{
        return _dal.get_urlhaoDao( Haoid);
		}
		
		    /**
         * 根据URLHAO返回的查询DataRow创建一个URLHAOEntity对象
         * @param URLHAO row
         * @returnURLHAOList对象
        * @throws Exception 
         */
		public List<urlhao_Dao> get_urlhao_All() throws Exception{
            return _dal.get_urlhao_All();
            }
		    /**
         * 根据URLHAO返回的查询DataRow创建一个URLHAOEntity对象
         * @param URLHAO row
         * @returnURLHAOList对象
        * @throws Exception 
         */
		public List<urlhao_Dao> get_urlhao_All(String strWhere) throws Exception{
            return _dal.get_urlhao_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<urlhao_Dao> get_urlhao_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_urlhao_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据URLHAO返回的查询DataRow创建一个URLHAOEntity对象
         * @param URLHAO row
         * @returnURLHAODictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, urlhao_Dao> get_urlhao_Dictionary(String strWhere) throws Exception{
            return _dal.get_urlhao_Dictionary(strWhere);
            }
		 /**
         * 更新URLHAO字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_urlhao_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_urlhao_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新URLHAOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_urlhao_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_urlhao_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新URLHAOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createurlhao_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_urlhao_UpdateString( FieldName, Value, sid);
            }
        
        
    }
