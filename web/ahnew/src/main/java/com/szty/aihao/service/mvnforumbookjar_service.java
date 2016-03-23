/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumbookjar.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumbookjar_Dao;
import com.szty.aihao.core.mvnforumbookjar_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMBOOKJAR逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumbookjar_service
	{
        public  mvnforumbookjar_core _dal=classFactory.getmvnforumbookjar();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOKJAR实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumbookjar (mvnforumbookjar_Dao _MVNFORUMBOOKJARModel )  throws Exception{
         return _dal.insert_mvnforumbookjar( _MVNFORUMBOOKJARModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOKJARprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumbookjar(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumbookjar( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMBOOKJAR实体
         * @return 影响的行数
         */
		public int update_mvnforumbookjar(mvnforumbookjar_Dao _MVNFORUMBOOKJARModel)  throws Exception{
        return _dal.update_mvnforumbookjar( _MVNFORUMBOOKJARModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMBOOKJAR中的一条记录
         * @param MVNFORUMBOOKJAR实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumbookjar(int Jarid)  throws Exception{
        return _dal.delete_mvnforumbookjar( Jarid);
		}

		

       
          /**
         * 得到 mvnforumbookjar 数据实体
         * @param Jarid">Jarid
         * @return<mvnforumbookjar 数据实体
        * @throws Exception 
         */
		public mvnforumbookjar_Dao get_mvnforumbookjarDao(int Jarid) throws Exception{
        return _dal.get_mvnforumbookjarDao( Jarid);
		}
		
		    /**
         * 根据MVNFORUMBOOKJAR返回的查询DataRow创建一个MVNFORUMBOOKJAREntity对象
         * @param MVNFORUMBOOKJAR row
         * @returnMVNFORUMBOOKJARList对象
        * @throws Exception 
         */
		public List<mvnforumbookjar_Dao> get_mvnforumbookjar_All() throws Exception{
            return _dal.get_mvnforumbookjar_All();
            }
		    /**
         * 根据MVNFORUMBOOKJAR返回的查询DataRow创建一个MVNFORUMBOOKJAREntity对象
         * @param MVNFORUMBOOKJAR row
         * @returnMVNFORUMBOOKJARList对象
        * @throws Exception 
         */
		public List<mvnforumbookjar_Dao> get_mvnforumbookjar_All(String strWhere) throws Exception{
            return _dal.get_mvnforumbookjar_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumbookjar_Dao> get_mvnforumbookjar_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumbookjar_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMBOOKJAR返回的查询DataRow创建一个MVNFORUMBOOKJAREntity对象
         * @param MVNFORUMBOOKJAR row
         * @returnMVNFORUMBOOKJARDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumbookjar_Dao> get_mvnforumbookjar_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumbookjar_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMBOOKJAR字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumbookjar_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumbookjar_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMBOOKJARInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumbookjar_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumbookjar_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMBOOKJARIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumbookjar_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumbookjar_UpdateString( FieldName, Value, sid);
            }
        
        
    }
