/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumpmattachmessage.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumpmattachmessage_Dao;
import com.szty.aihao.core.mvnforumpmattachmessage_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMPMATTACHMESSAGE逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumpmattachmessage_service
	{
        public  mvnforumpmattachmessage_core _dal=classFactory.getmvnforumpmattachmessage();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPMATTACHMESSAGE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumpmattachmessage (mvnforumpmattachmessage_Dao _MVNFORUMPMATTACHMESSAGEModel )  throws Exception{
         return _dal.insert_mvnforumpmattachmessage( _MVNFORUMPMATTACHMESSAGEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPMATTACHMESSAGEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumpmattachmessage(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumpmattachmessage( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPMATTACHMESSAGE实体
         * @return 影响的行数
         */
		public int update_mvnforumpmattachmessage(mvnforumpmattachmessage_Dao _MVNFORUMPMATTACHMESSAGEModel)  throws Exception{
        return _dal.update_mvnforumpmattachmessage( _MVNFORUMPMATTACHMESSAGEModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMPMATTACHMESSAGE中的一条记录
         * @param MVNFORUMPMATTACHMESSAGE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumpmattachmessage(int Messageid)  throws Exception{
        return _dal.delete_mvnforumpmattachmessage( Messageid);
		}

		

       
          /**
         * 得到 mvnforumpmattachmessage 数据实体
         * @param Messageid">Messageid
         * @return<mvnforumpmattachmessage 数据实体
        * @throws Exception 
         */
		public mvnforumpmattachmessage_Dao get_mvnforumpmattachmessageDao(int Messageid) throws Exception{
        return _dal.get_mvnforumpmattachmessageDao( Messageid);
		}
		
		    /**
         * 根据MVNFORUMPMATTACHMESSAGE返回的查询DataRow创建一个MVNFORUMPMATTACHMESSAGEEntity对象
         * @param MVNFORUMPMATTACHMESSAGE row
         * @returnMVNFORUMPMATTACHMESSAGEList对象
        * @throws Exception 
         */
		public List<mvnforumpmattachmessage_Dao> get_mvnforumpmattachmessage_All() throws Exception{
            return _dal.get_mvnforumpmattachmessage_All();
            }
		    /**
         * 根据MVNFORUMPMATTACHMESSAGE返回的查询DataRow创建一个MVNFORUMPMATTACHMESSAGEEntity对象
         * @param MVNFORUMPMATTACHMESSAGE row
         * @returnMVNFORUMPMATTACHMESSAGEList对象
        * @throws Exception 
         */
		public List<mvnforumpmattachmessage_Dao> get_mvnforumpmattachmessage_All(String strWhere) throws Exception{
            return _dal.get_mvnforumpmattachmessage_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumpmattachmessage_Dao> get_mvnforumpmattachmessage_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumpmattachmessage_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMPMATTACHMESSAGE返回的查询DataRow创建一个MVNFORUMPMATTACHMESSAGEEntity对象
         * @param MVNFORUMPMATTACHMESSAGE row
         * @returnMVNFORUMPMATTACHMESSAGEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumpmattachmessage_Dao> get_mvnforumpmattachmessage_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumpmattachmessage_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMPMATTACHMESSAGE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumpmattachmessage_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumpmattachmessage_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMPMATTACHMESSAGEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumpmattachmessage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumpmattachmessage_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMPMATTACHMESSAGEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumpmattachmessage_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumpmattachmessage_UpdateString( FieldName, Value, sid);
            }
        
        
    }
