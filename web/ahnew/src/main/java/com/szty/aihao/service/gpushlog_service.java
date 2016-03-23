/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGpushlog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.gpushlog_Dao;
import com.szty.aihao.core.gpushlog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GPUSHLOG逻辑层接口
    *@作者：宋春林 
    */

	public class gpushlog_service
	{
        public  gpushlog_core _dal=classFactory.getgpushlog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param GPUSHLOG实体
         * @return 新插入记录的编号
         */
		public int insert_gpushlog (gpushlog_Dao _GPUSHLOGModel )  throws Exception{
         return _dal.insert_gpushlog( _GPUSHLOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param GPUSHLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_gpushlog(Object[] _para)  throws Exception{
        return _dal.insert_gpushlog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param GPUSHLOG实体
         * @return 影响的行数
         */
		public int update_gpushlog(gpushlog_Dao _GPUSHLOGModel)  throws Exception{
        return _dal.update_gpushlog( _GPUSHLOGModel);
		}
	
		

         /**
         *  删除数据表GPUSHLOG中的一条记录
         * @param GPUSHLOG实体
         * @return 新插入记录的编号
         */
		public int delete_gpushlog(int Gpuahlogid)  throws Exception{
        return _dal.delete_gpushlog( Gpuahlogid);
		}

		

       
          /**
         * 得到 gpushlog 数据实体
         * @param Gpuahlogid">Gpuahlogid
         * @return<gpushlog 数据实体
        * @throws Exception 
         */
		public gpushlog_Dao get_gpushlogDao(int Gpuahlogid) throws Exception{
        return _dal.get_gpushlogDao( Gpuahlogid);
		}
		
		    /**
         * 根据GPUSHLOG返回的查询DataRow创建一个GPUSHLOGEntity对象
         * @param GPUSHLOG row
         * @returnGPUSHLOGList对象
        * @throws Exception 
         */
		public List<gpushlog_Dao> get_gpushlog_All() throws Exception{
            return _dal.get_gpushlog_All();
            }
		    /**
         * 根据GPUSHLOG返回的查询DataRow创建一个GPUSHLOGEntity对象
         * @param GPUSHLOG row
         * @returnGPUSHLOGList对象
        * @throws Exception 
         */
		public List<gpushlog_Dao> get_gpushlog_All(String strWhere) throws Exception{
            return _dal.get_gpushlog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<gpushlog_Dao> get_gpushlog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_gpushlog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据GPUSHLOG返回的查询DataRow创建一个GPUSHLOGEntity对象
         * @param GPUSHLOG row
         * @returnGPUSHLOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, gpushlog_Dao> get_gpushlog_Dictionary(String strWhere) throws Exception{
            return _dal.get_gpushlog_Dictionary(strWhere);
            }
		 /**
         * 更新GPUSHLOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_gpushlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_gpushlog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新GPUSHLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_gpushlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_gpushlog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新GPUSHLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int creategpushlog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_gpushlog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
