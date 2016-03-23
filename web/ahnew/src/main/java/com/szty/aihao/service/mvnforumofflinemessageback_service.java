/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumofflinemessageback.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumofflinemessageback_Dao;
import com.szty.aihao.core.mvnforumofflinemessageback_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMOFFLINEMESSAGEBACK逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumofflinemessageback_service
	{
        public  mvnforumofflinemessageback_core _dal=classFactory.getmvnforumofflinemessageback();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGEBACK实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumofflinemessageback (mvnforumofflinemessageback_Dao _MVNFORUMOFFLINEMESSAGEBACKModel )  throws Exception{
         return _dal.insert_mvnforumofflinemessageback( _MVNFORUMOFFLINEMESSAGEBACKModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGEBACKprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumofflinemessageback(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumofflinemessageback( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGEBACK实体
         * @return 影响的行数
         */
		public int update_mvnforumofflinemessageback(mvnforumofflinemessageback_Dao _MVNFORUMOFFLINEMESSAGEBACKModel)  throws Exception{
        return _dal.update_mvnforumofflinemessageback( _MVNFORUMOFFLINEMESSAGEBACKModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMOFFLINEMESSAGEBACK中的一条记录
         * @param MVNFORUMOFFLINEMESSAGEBACK实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumofflinemessageback(int Messageid)  throws Exception{
        return _dal.delete_mvnforumofflinemessageback( Messageid);
		}

		

       
          /**
         * 得到 mvnforumofflinemessageback 数据实体
         * @param Messageid">Messageid
         * @return<mvnforumofflinemessageback 数据实体
        * @throws Exception 
         */
		public mvnforumofflinemessageback_Dao get_mvnforumofflinemessagebackDao(int Messageid) throws Exception{
        return _dal.get_mvnforumofflinemessagebackDao( Messageid);
		}
		
		    /**
         * 根据MVNFORUMOFFLINEMESSAGEBACK返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEBACKEntity对象
         * @param MVNFORUMOFFLINEMESSAGEBACK row
         * @returnMVNFORUMOFFLINEMESSAGEBACKList对象
        * @throws Exception 
         */
		public List<mvnforumofflinemessageback_Dao> get_mvnforumofflinemessageback_All() throws Exception{
            return _dal.get_mvnforumofflinemessageback_All();
            }
		    /**
         * 根据MVNFORUMOFFLINEMESSAGEBACK返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEBACKEntity对象
         * @param MVNFORUMOFFLINEMESSAGEBACK row
         * @returnMVNFORUMOFFLINEMESSAGEBACKList对象
        * @throws Exception 
         */
		public List<mvnforumofflinemessageback_Dao> get_mvnforumofflinemessageback_All(String strWhere) throws Exception{
            return _dal.get_mvnforumofflinemessageback_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumofflinemessageback_Dao> get_mvnforumofflinemessageback_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumofflinemessageback_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMOFFLINEMESSAGEBACK返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEBACKEntity对象
         * @param MVNFORUMOFFLINEMESSAGEBACK row
         * @returnMVNFORUMOFFLINEMESSAGEBACKDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumofflinemessageback_Dao> get_mvnforumofflinemessageback_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumofflinemessageback_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMOFFLINEMESSAGEBACK字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumofflinemessageback_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumofflinemessageback_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMOFFLINEMESSAGEBACKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumofflinemessageback_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumofflinemessageback_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMOFFLINEMESSAGEBACKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumofflinemessageback_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumofflinemessageback_UpdateString( FieldName, Value, sid);
            }
        
        
    }
