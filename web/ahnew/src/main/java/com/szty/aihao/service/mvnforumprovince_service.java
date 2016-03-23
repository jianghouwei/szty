/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumprovince.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumprovince_Dao;
import com.szty.aihao.core.mvnforumprovince_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMPROVINCE逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumprovince_service
	{
        public  mvnforumprovince_core _dal=classFactory.getmvnforumprovince();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPROVINCE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumprovince (mvnforumprovince_Dao _MVNFORUMPROVINCEModel )  throws Exception{
         return _dal.insert_mvnforumprovince( _MVNFORUMPROVINCEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPROVINCEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumprovince(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumprovince( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPROVINCE实体
         * @return 影响的行数
         */
		public int update_mvnforumprovince(mvnforumprovince_Dao _MVNFORUMPROVINCEModel)  throws Exception{
        return _dal.update_mvnforumprovince( _MVNFORUMPROVINCEModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMPROVINCE中的一条记录
         * @param MVNFORUMPROVINCE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumprovince(int Proid)  throws Exception{
        return _dal.delete_mvnforumprovince( Proid);
		}

		

       
          /**
         * 得到 mvnforumprovince 数据实体
         * @param Proid">Proid
         * @return<mvnforumprovince 数据实体
        * @throws Exception 
         */
		public mvnforumprovince_Dao get_mvnforumprovinceDao(int Proid) throws Exception{
        return _dal.get_mvnforumprovinceDao( Proid);
		}
		
		    /**
         * 根据MVNFORUMPROVINCE返回的查询DataRow创建一个MVNFORUMPROVINCEEntity对象
         * @param MVNFORUMPROVINCE row
         * @returnMVNFORUMPROVINCEList对象
        * @throws Exception 
         */
		public List<mvnforumprovince_Dao> get_mvnforumprovince_All() throws Exception{
            return _dal.get_mvnforumprovince_All();
            }
		    /**
         * 根据MVNFORUMPROVINCE返回的查询DataRow创建一个MVNFORUMPROVINCEEntity对象
         * @param MVNFORUMPROVINCE row
         * @returnMVNFORUMPROVINCEList对象
        * @throws Exception 
         */
		public List<mvnforumprovince_Dao> get_mvnforumprovince_All(String strWhere) throws Exception{
            return _dal.get_mvnforumprovince_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumprovince_Dao> get_mvnforumprovince_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumprovince_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMPROVINCE返回的查询DataRow创建一个MVNFORUMPROVINCEEntity对象
         * @param MVNFORUMPROVINCE row
         * @returnMVNFORUMPROVINCEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumprovince_Dao> get_mvnforumprovince_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumprovince_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMPROVINCE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumprovince_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumprovince_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMPROVINCEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumprovince_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumprovince_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMPROVINCEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumprovince_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumprovince_UpdateString( FieldName, Value, sid);
            }
        
        
    }
