/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumgroups.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumgroups_Dao;
import com.szty.aihao.core.mvnforumgroups_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMGROUPS逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumgroups_service
	{
        public  mvnforumgroups_core _dal=classFactory.getmvnforumgroups();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPS实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumgroups (mvnforumgroups_Dao _MVNFORUMGROUPSModel )  throws Exception{
         return _dal.insert_mvnforumgroups( _MVNFORUMGROUPSModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPSprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumgroups(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumgroups( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGROUPS实体
         * @return 影响的行数
         */
		public int update_mvnforumgroups(mvnforumgroups_Dao _MVNFORUMGROUPSModel)  throws Exception{
        return _dal.update_mvnforumgroups( _MVNFORUMGROUPSModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMGROUPS中的一条记录
         * @param MVNFORUMGROUPS实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumgroups(int Groupid)  throws Exception{
        return _dal.delete_mvnforumgroups( Groupid);
		}

		

       
          /**
         * 得到 mvnforumgroups 数据实体
         * @param Groupid">Groupid
         * @return<mvnforumgroups 数据实体
        * @throws Exception 
         */
		public mvnforumgroups_Dao get_mvnforumgroupsDao(int Groupid) throws Exception{
        return _dal.get_mvnforumgroupsDao( Groupid);
		}
		
		    /**
         * 根据MVNFORUMGROUPS返回的查询DataRow创建一个MVNFORUMGROUPSEntity对象
         * @param MVNFORUMGROUPS row
         * @returnMVNFORUMGROUPSList对象
        * @throws Exception 
         */
		public List<mvnforumgroups_Dao> get_mvnforumgroups_All() throws Exception{
            return _dal.get_mvnforumgroups_All();
            }
		    /**
         * 根据MVNFORUMGROUPS返回的查询DataRow创建一个MVNFORUMGROUPSEntity对象
         * @param MVNFORUMGROUPS row
         * @returnMVNFORUMGROUPSList对象
        * @throws Exception 
         */
		public List<mvnforumgroups_Dao> get_mvnforumgroups_All(String strWhere) throws Exception{
            return _dal.get_mvnforumgroups_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumgroups_Dao> get_mvnforumgroups_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumgroups_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMGROUPS返回的查询DataRow创建一个MVNFORUMGROUPSEntity对象
         * @param MVNFORUMGROUPS row
         * @returnMVNFORUMGROUPSDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumgroups_Dao> get_mvnforumgroups_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumgroups_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMGROUPS字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumgroups_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumgroups_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMGROUPSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumgroups_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumgroups_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMGROUPSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumgroups_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumgroups_UpdateString( FieldName, Value, sid);
            }
        
        
    }
