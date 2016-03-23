/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumpage.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumpage_Dao;
import com.szty.aihao.core.mvnforumpage_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMPAGE逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumpage_service
	{
        public  mvnforumpage_core _dal=classFactory.getmvnforumpage();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPAGE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumpage (mvnforumpage_Dao _MVNFORUMPAGEModel )  throws Exception{
         return _dal.insert_mvnforumpage( _MVNFORUMPAGEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPAGEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumpage(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumpage( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPAGE实体
         * @return 影响的行数
         */
		public int update_mvnforumpage(mvnforumpage_Dao _MVNFORUMPAGEModel)  throws Exception{
        return _dal.update_mvnforumpage( _MVNFORUMPAGEModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMPAGE中的一条记录
         * @param MVNFORUMPAGE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumpage(int Pageid)  throws Exception{
        return _dal.delete_mvnforumpage( Pageid);
		}

		

       
          /**
         * 得到 mvnforumpage 数据实体
         * @param Pageid">Pageid
         * @return<mvnforumpage 数据实体
        * @throws Exception 
         */
		public mvnforumpage_Dao get_mvnforumpageDao(int Pageid) throws Exception{
        return _dal.get_mvnforumpageDao( Pageid);
		}
		
		    /**
         * 根据MVNFORUMPAGE返回的查询DataRow创建一个MVNFORUMPAGEEntity对象
         * @param MVNFORUMPAGE row
         * @returnMVNFORUMPAGEList对象
        * @throws Exception 
         */
		public List<mvnforumpage_Dao> get_mvnforumpage_All() throws Exception{
            return _dal.get_mvnforumpage_All();
            }
		    /**
         * 根据MVNFORUMPAGE返回的查询DataRow创建一个MVNFORUMPAGEEntity对象
         * @param MVNFORUMPAGE row
         * @returnMVNFORUMPAGEList对象
        * @throws Exception 
         */
		public List<mvnforumpage_Dao> get_mvnforumpage_All(String strWhere) throws Exception{
            return _dal.get_mvnforumpage_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumpage_Dao> get_mvnforumpage_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumpage_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMPAGE返回的查询DataRow创建一个MVNFORUMPAGEEntity对象
         * @param MVNFORUMPAGE row
         * @returnMVNFORUMPAGEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumpage_Dao> get_mvnforumpage_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumpage_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMPAGE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumpage_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumpage_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMPAGEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumpage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumpage_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMPAGEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumpage_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumpage_UpdateString( FieldName, Value, sid);
            }
        
        
    }
