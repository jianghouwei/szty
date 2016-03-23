/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsymconfig.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumsymconfig_Dao;
import com.szty.aihao.core.mvnforumsymconfig_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSYMCONFIG逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumsymconfig_service
	{
        public  mvnforumsymconfig_core _dal=classFactory.getmvnforumsymconfig();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMCONFIG实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsymconfig (mvnforumsymconfig_Dao _MVNFORUMSYMCONFIGModel )  throws Exception{
         return _dal.insert_mvnforumsymconfig( _MVNFORUMSYMCONFIGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMCONFIGprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsymconfig(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumsymconfig( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSYMCONFIG实体
         * @return 影响的行数
         */
		public int update_mvnforumsymconfig(mvnforumsymconfig_Dao _MVNFORUMSYMCONFIGModel)  throws Exception{
        return _dal.update_mvnforumsymconfig( _MVNFORUMSYMCONFIGModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMSYMCONFIG中的一条记录
         * @param MVNFORUMSYMCONFIG实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsymconfig(int Configid)  throws Exception{
        return _dal.delete_mvnforumsymconfig( Configid);
		}

		

       
          /**
         * 得到 mvnforumsymconfig 数据实体
         * @param Configid">Configid
         * @return<mvnforumsymconfig 数据实体
        * @throws Exception 
         */
		public mvnforumsymconfig_Dao get_mvnforumsymconfigDao(int Configid) throws Exception{
        return _dal.get_mvnforumsymconfigDao( Configid);
		}
		
		    /**
         * 根据MVNFORUMSYMCONFIG返回的查询DataRow创建一个MVNFORUMSYMCONFIGEntity对象
         * @param MVNFORUMSYMCONFIG row
         * @returnMVNFORUMSYMCONFIGList对象
        * @throws Exception 
         */
		public List<mvnforumsymconfig_Dao> get_mvnforumsymconfig_All() throws Exception{
            return _dal.get_mvnforumsymconfig_All();
            }
		    /**
         * 根据MVNFORUMSYMCONFIG返回的查询DataRow创建一个MVNFORUMSYMCONFIGEntity对象
         * @param MVNFORUMSYMCONFIG row
         * @returnMVNFORUMSYMCONFIGList对象
        * @throws Exception 
         */
		public List<mvnforumsymconfig_Dao> get_mvnforumsymconfig_All(String strWhere) throws Exception{
            return _dal.get_mvnforumsymconfig_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsymconfig_Dao> get_mvnforumsymconfig_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumsymconfig_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMSYMCONFIG返回的查询DataRow创建一个MVNFORUMSYMCONFIGEntity对象
         * @param MVNFORUMSYMCONFIG row
         * @returnMVNFORUMSYMCONFIGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumsymconfig_Dao> get_mvnforumsymconfig_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumsymconfig_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMSYMCONFIG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumsymconfig_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumsymconfig_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMSYMCONFIGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumsymconfig_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumsymconfig_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMSYMCONFIGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumsymconfig_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumsymconfig_UpdateString( FieldName, Value, sid);
            }
        
        
    }
