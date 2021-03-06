﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataHllclientlogon.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.hllclientlogon_Dao;
import com.szty.aihao.core.hllclientlogon_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@HLLCLIENTLOGON逻辑层接口
    *@作者：宋春林 
    */

	public class hllclientlogon_service
	{
        public  hllclientlogon_core _dal=classFactory.gethllclientlogon();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param HLLCLIENTLOGON实体
         * @return 新插入记录的编号
         */
		public int insert_hllclientlogon (hllclientlogon_Dao _HLLCLIENTLOGONModel )  throws Exception{
         return _dal.insert_hllclientlogon( _HLLCLIENTLOGONModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param HLLCLIENTLOGONprrameter
         * @return 新插入记录的编号
         */
         public int insert_hllclientlogon(Object[] _para)  throws Exception{
        return _dal.insert_hllclientlogon( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param HLLCLIENTLOGON实体
         * @return 影响的行数
         */
		public int update_hllclientlogon(hllclientlogon_Dao _HLLCLIENTLOGONModel)  throws Exception{
        return _dal.update_hllclientlogon( _HLLCLIENTLOGONModel);
		}
	
		

         /**
         *  删除数据表HLLCLIENTLOGON中的一条记录
         * @param HLLCLIENTLOGON实体
         * @return 新插入记录的编号
         */
		public int delete_hllclientlogon(int Logonid)  throws Exception{
        return _dal.delete_hllclientlogon( Logonid);
		}

		

       
          /**
         * 得到 hllclientlogon 数据实体
         * @param Logonid">Logonid
         * @return<hllclientlogon 数据实体
        * @throws Exception 
         */
		public hllclientlogon_Dao get_hllclientlogonDao(int Logonid) throws Exception{
        return _dal.get_hllclientlogonDao( Logonid);
		}
		
		    /**
         * 根据HLLCLIENTLOGON返回的查询DataRow创建一个HLLCLIENTLOGONEntity对象
         * @param HLLCLIENTLOGON row
         * @returnHLLCLIENTLOGONList对象
        * @throws Exception 
         */
		public List<hllclientlogon_Dao> get_hllclientlogon_All() throws Exception{
            return _dal.get_hllclientlogon_All();
            }
		    /**
         * 根据HLLCLIENTLOGON返回的查询DataRow创建一个HLLCLIENTLOGONEntity对象
         * @param HLLCLIENTLOGON row
         * @returnHLLCLIENTLOGONList对象
        * @throws Exception 
         */
		public List<hllclientlogon_Dao> get_hllclientlogon_All(String strWhere) throws Exception{
            return _dal.get_hllclientlogon_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<hllclientlogon_Dao> get_hllclientlogon_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_hllclientlogon_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据HLLCLIENTLOGON返回的查询DataRow创建一个HLLCLIENTLOGONEntity对象
         * @param HLLCLIENTLOGON row
         * @returnHLLCLIENTLOGONDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, hllclientlogon_Dao> get_hllclientlogon_Dictionary(String strWhere) throws Exception{
            return _dal.get_hllclientlogon_Dictionary(strWhere);
            }
		 /**
         * 更新HLLCLIENTLOGON字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_hllclientlogon_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_hllclientlogon_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新HLLCLIENTLOGONInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_hllclientlogon_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_hllclientlogon_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新HLLCLIENTLOGONIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createhllclientlogon_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_hllclientlogon_UpdateString( FieldName, Value, sid);
            }
        
        
    }
