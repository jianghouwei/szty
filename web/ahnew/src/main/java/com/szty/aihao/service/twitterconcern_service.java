/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTwitterconcern.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.twitterconcern_Dao;
import com.szty.aihao.core.twitterconcern_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TWITTERCONCERN逻辑层接口
    *@作者：宋春林 
    */

	public class twitterconcern_service
	{
        public  twitterconcern_core _dal=classFactory.gettwitterconcern();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TWITTERCONCERN实体
         * @return 新插入记录的编号
         */
		public int insert_twitterconcern (twitterconcern_Dao _TWITTERCONCERNModel )  throws Exception{
         return _dal.insert_twitterconcern( _TWITTERCONCERNModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TWITTERCONCERNprrameter
         * @return 新插入记录的编号
         */
         public int insert_twitterconcern(Object[] _para)  throws Exception{
        return _dal.insert_twitterconcern( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TWITTERCONCERN实体
         * @return 影响的行数
         */
		public int update_twitterconcern(twitterconcern_Dao _TWITTERCONCERNModel)  throws Exception{
        return _dal.update_twitterconcern( _TWITTERCONCERNModel);
		}
	
		

         /**
         *  删除数据表TWITTERCONCERN中的一条记录
         * @param TWITTERCONCERN实体
         * @return 新插入记录的编号
         */
		public int delete_twitterconcern(int Concernid)  throws Exception{
        return _dal.delete_twitterconcern( Concernid);
		}

		

       
          /**
         * 得到 twitterconcern 数据实体
         * @param Concernid">Concernid
         * @return<twitterconcern 数据实体
        * @throws Exception 
         */
		public twitterconcern_Dao get_twitterconcernDao(int Concernid) throws Exception{
        return _dal.get_twitterconcernDao( Concernid);
		}
		
		    /**
         * 根据TWITTERCONCERN返回的查询DataRow创建一个TWITTERCONCERNEntity对象
         * @param TWITTERCONCERN row
         * @returnTWITTERCONCERNList对象
        * @throws Exception 
         */
		public List<twitterconcern_Dao> get_twitterconcern_All() throws Exception{
            return _dal.get_twitterconcern_All();
            }
		    /**
         * 根据TWITTERCONCERN返回的查询DataRow创建一个TWITTERCONCERNEntity对象
         * @param TWITTERCONCERN row
         * @returnTWITTERCONCERNList对象
        * @throws Exception 
         */
		public List<twitterconcern_Dao> get_twitterconcern_All(String strWhere) throws Exception{
            return _dal.get_twitterconcern_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<twitterconcern_Dao> get_twitterconcern_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_twitterconcern_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TWITTERCONCERN返回的查询DataRow创建一个TWITTERCONCERNEntity对象
         * @param TWITTERCONCERN row
         * @returnTWITTERCONCERNDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, twitterconcern_Dao> get_twitterconcern_Dictionary(String strWhere) throws Exception{
            return _dal.get_twitterconcern_Dictionary(strWhere);
            }
		 /**
         * 更新TWITTERCONCERN字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_twitterconcern_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_twitterconcern_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TWITTERCONCERNInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_twitterconcern_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_twitterconcern_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TWITTERCONCERNIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtwitterconcern_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_twitterconcern_UpdateString( FieldName, Value, sid);
            }
        
        
    }
