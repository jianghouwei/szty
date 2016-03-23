/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsmsreport.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumsmsreport_Dao;
import com.szty.aihao.core.mvnforumsmsreport_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSMSREPORT逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumsmsreport_service
	{
        public  mvnforumsmsreport_core _dal=classFactory.getmvnforumsmsreport();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSREPORT实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsmsreport (mvnforumsmsreport_Dao _MVNFORUMSMSREPORTModel )  throws Exception{
         return _dal.insert_mvnforumsmsreport( _MVNFORUMSMSREPORTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSREPORTprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsmsreport(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumsmsreport( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSREPORT实体
         * @return 影响的行数
         */
		public int update_mvnforumsmsreport(mvnforumsmsreport_Dao _MVNFORUMSMSREPORTModel)  throws Exception{
        return _dal.update_mvnforumsmsreport( _MVNFORUMSMSREPORTModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMSMSREPORT中的一条记录
         * @param MVNFORUMSMSREPORT实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsmsreport(int Reportid)  throws Exception{
        return _dal.delete_mvnforumsmsreport( Reportid);
		}

		

       
          /**
         * 得到 mvnforumsmsreport 数据实体
         * @param Reportid">Reportid
         * @return<mvnforumsmsreport 数据实体
        * @throws Exception 
         */
		public mvnforumsmsreport_Dao get_mvnforumsmsreportDao(int Reportid) throws Exception{
        return _dal.get_mvnforumsmsreportDao( Reportid);
		}
		
		    /**
         * 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
         * @param MVNFORUMSMSREPORT row
         * @returnMVNFORUMSMSREPORTList对象
        * @throws Exception 
         */
		public List<mvnforumsmsreport_Dao> get_mvnforumsmsreport_All() throws Exception{
            return _dal.get_mvnforumsmsreport_All();
            }
		    /**
         * 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
         * @param MVNFORUMSMSREPORT row
         * @returnMVNFORUMSMSREPORTList对象
        * @throws Exception 
         */
		public List<mvnforumsmsreport_Dao> get_mvnforumsmsreport_All(String strWhere) throws Exception{
            return _dal.get_mvnforumsmsreport_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsmsreport_Dao> get_mvnforumsmsreport_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumsmsreport_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMSMSREPORT返回的查询DataRow创建一个MVNFORUMSMSREPORTEntity对象
         * @param MVNFORUMSMSREPORT row
         * @returnMVNFORUMSMSREPORTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumsmsreport_Dao> get_mvnforumsmsreport_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumsmsreport_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMSMSREPORT字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumsmsreport_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumsmsreport_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMSMSREPORTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumsmsreport_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumsmsreport_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMSMSREPORTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumsmsreport_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumsmsreport_UpdateString( FieldName, Value, sid);
            }
        
        
    }
