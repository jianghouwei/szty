/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumofflinemessage.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumofflinemessage_Dao;
import com.szty.aihao.core.mvnforumofflinemessage_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMOFFLINEMESSAGE逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumofflinemessage_service
	{
        public  mvnforumofflinemessage_core _dal=classFactory.getmvnforumofflinemessage();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumofflinemessage (mvnforumofflinemessage_Dao _MVNFORUMOFFLINEMESSAGEModel )  throws Exception{
         return _dal.insert_mvnforumofflinemessage( _MVNFORUMOFFLINEMESSAGEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumofflinemessage(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumofflinemessage( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMOFFLINEMESSAGE实体
         * @return 影响的行数
         */
		public int update_mvnforumofflinemessage(mvnforumofflinemessage_Dao _MVNFORUMOFFLINEMESSAGEModel)  throws Exception{
        return _dal.update_mvnforumofflinemessage( _MVNFORUMOFFLINEMESSAGEModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMOFFLINEMESSAGE中的一条记录
         * @param MVNFORUMOFFLINEMESSAGE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumofflinemessage(int Messageid)  throws Exception{
        return _dal.delete_mvnforumofflinemessage( Messageid);
		}

		

       
          /**
         * 得到 mvnforumofflinemessage 数据实体
         * @param Messageid">Messageid
         * @return<mvnforumofflinemessage 数据实体
        * @throws Exception 
         */
		public mvnforumofflinemessage_Dao get_mvnforumofflinemessageDao(int Messageid) throws Exception{
        return _dal.get_mvnforumofflinemessageDao( Messageid);
		}
		
		    /**
         * 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
         * @param MVNFORUMOFFLINEMESSAGE row
         * @returnMVNFORUMOFFLINEMESSAGEList对象
        * @throws Exception 
         */
		public List<mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_All() throws Exception{
            return _dal.get_mvnforumofflinemessage_All();
            }
		    /**
         * 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
         * @param MVNFORUMOFFLINEMESSAGE row
         * @returnMVNFORUMOFFLINEMESSAGEList对象
        * @throws Exception 
         */
		public List<mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_All(String strWhere) throws Exception{
            return _dal.get_mvnforumofflinemessage_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumofflinemessage_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMOFFLINEMESSAGE返回的查询DataRow创建一个MVNFORUMOFFLINEMESSAGEEntity对象
         * @param MVNFORUMOFFLINEMESSAGE row
         * @returnMVNFORUMOFFLINEMESSAGEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumofflinemessage_Dao> get_mvnforumofflinemessage_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumofflinemessage_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMOFFLINEMESSAGE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumofflinemessage_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumofflinemessage_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMOFFLINEMESSAGEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumofflinemessage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumofflinemessage_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMOFFLINEMESSAGEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumofflinemessage_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumofflinemessage_UpdateString( FieldName, Value, sid);
            }
        
        
    }
