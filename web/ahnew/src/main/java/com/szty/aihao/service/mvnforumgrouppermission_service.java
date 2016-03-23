/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumgrouppermission.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumgrouppermission_Dao;
import com.szty.aihao.core.mvnforumgrouppermission_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMGROUPPERMISSION逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumgrouppermission_service
	{
        public  mvnforumgrouppermission_core _dal=classFactory.getmvnforumgrouppermission();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPPERMISSION实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumgrouppermission (mvnforumgrouppermission_Dao _MVNFORUMGROUPPERMISSIONModel )  throws Exception{
         return _dal.insert_mvnforumgrouppermission( _MVNFORUMGROUPPERMISSIONModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPPERMISSIONprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumgrouppermission(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumgrouppermission( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPPERMISSION实体
         * @return 影响的行数
         */
		public int update_mvnforumgrouppermission(mvnforumgrouppermission_Dao _MVNFORUMGROUPPERMISSIONModel)  throws Exception{
        return _dal.update_mvnforumgrouppermission( _MVNFORUMGROUPPERMISSIONModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMGROUPPERMISSION中的一条记录
         * @param MVNFORUMGROUPPERMISSION实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumgrouppermission(int Groupid)  throws Exception{
        return _dal.delete_mvnforumgrouppermission( Groupid);
		}

		

       
          /**
         * 得到 mvnforumgrouppermission 数据实体
         * @param Groupid">Groupid
         * @return<mvnforumgrouppermission 数据实体
        * @throws Exception 
         */
		public mvnforumgrouppermission_Dao get_mvnforumgrouppermissionDao(int Groupid) throws Exception{
        return _dal.get_mvnforumgrouppermissionDao( Groupid);
		}
		
		    /**
         * 根据MVNFORUMGROUPPERMISSION返回的查询DataRow创建一个MVNFORUMGROUPPERMISSIONEntity对象
         * @param MVNFORUMGROUPPERMISSION row
         * @returnMVNFORUMGROUPPERMISSIONList对象
        * @throws Exception 
         */
		public List<mvnforumgrouppermission_Dao> get_mvnforumgrouppermission_All() throws Exception{
            return _dal.get_mvnforumgrouppermission_All();
            }
		    /**
         * 根据MVNFORUMGROUPPERMISSION返回的查询DataRow创建一个MVNFORUMGROUPPERMISSIONEntity对象
         * @param MVNFORUMGROUPPERMISSION row
         * @returnMVNFORUMGROUPPERMISSIONList对象
        * @throws Exception 
         */
		public List<mvnforumgrouppermission_Dao> get_mvnforumgrouppermission_All(String strWhere) throws Exception{
            return _dal.get_mvnforumgrouppermission_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumgrouppermission_Dao> get_mvnforumgrouppermission_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumgrouppermission_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMGROUPPERMISSION返回的查询DataRow创建一个MVNFORUMGROUPPERMISSIONEntity对象
         * @param MVNFORUMGROUPPERMISSION row
         * @returnMVNFORUMGROUPPERMISSIONDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumgrouppermission_Dao> get_mvnforumgrouppermission_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumgrouppermission_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMGROUPPERMISSION字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumgrouppermission_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumgrouppermission_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMGROUPPERMISSIONInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumgrouppermission_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumgrouppermission_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMGROUPPERMISSIONIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumgrouppermission_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumgrouppermission_UpdateString( FieldName, Value, sid);
            }
        
        
    }
