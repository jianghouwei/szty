/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforummemberforum.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforummemberforum_Dao;
import com.szty.aihao.core.mvnforummemberforum_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMMEMBERFORUM逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforummemberforum_service
	{
        public  mvnforummemberforum_core _dal=classFactory.getmvnforummemberforum();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERFORUM实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforummemberforum (mvnforummemberforum_Dao _MVNFORUMMEMBERFORUMModel )  throws Exception{
         return _dal.insert_mvnforummemberforum( _MVNFORUMMEMBERFORUMModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERFORUMprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforummemberforum(Object[] _para)  throws Exception{
        return _dal.insert_mvnforummemberforum( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMMEMBERFORUM实体
         * @return 影响的行数
         */
		public int update_mvnforummemberforum(mvnforummemberforum_Dao _MVNFORUMMEMBERFORUMModel)  throws Exception{
        return _dal.update_mvnforummemberforum( _MVNFORUMMEMBERFORUMModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMMEMBERFORUM中的一条记录
         * @param MVNFORUMMEMBERFORUM实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforummemberforum(int Memberid)  throws Exception{
        return _dal.delete_mvnforummemberforum( Memberid);
		}

		

       
          /**
         * 得到 mvnforummemberforum 数据实体
         * @param Memberid">Memberid
         * @return<mvnforummemberforum 数据实体
        * @throws Exception 
         */
		public mvnforummemberforum_Dao get_mvnforummemberforumDao(int Memberid) throws Exception{
        return _dal.get_mvnforummemberforumDao( Memberid);
		}
		
		    /**
         * 根据MVNFORUMMEMBERFORUM返回的查询DataRow创建一个MVNFORUMMEMBERFORUMEntity对象
         * @param MVNFORUMMEMBERFORUM row
         * @returnMVNFORUMMEMBERFORUMList对象
        * @throws Exception 
         */
		public List<mvnforummemberforum_Dao> get_mvnforummemberforum_All() throws Exception{
            return _dal.get_mvnforummemberforum_All();
            }
		    /**
         * 根据MVNFORUMMEMBERFORUM返回的查询DataRow创建一个MVNFORUMMEMBERFORUMEntity对象
         * @param MVNFORUMMEMBERFORUM row
         * @returnMVNFORUMMEMBERFORUMList对象
        * @throws Exception 
         */
		public List<mvnforummemberforum_Dao> get_mvnforummemberforum_All(String strWhere) throws Exception{
            return _dal.get_mvnforummemberforum_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforummemberforum_Dao> get_mvnforummemberforum_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforummemberforum_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMMEMBERFORUM返回的查询DataRow创建一个MVNFORUMMEMBERFORUMEntity对象
         * @param MVNFORUMMEMBERFORUM row
         * @returnMVNFORUMMEMBERFORUMDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforummemberforum_Dao> get_mvnforummemberforum_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforummemberforum_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMMEMBERFORUM字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforummemberforum_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforummemberforum_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMMEMBERFORUMInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforummemberforum_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforummemberforum_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMMEMBERFORUMIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforummemberforum_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforummemberforum_UpdateString( FieldName, Value, sid);
            }
        
        
    }
