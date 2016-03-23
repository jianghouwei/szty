/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataWebhaoclass.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.webhaoclass_Dao;
import com.szty.aihao.core.webhaoclass_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@WEBHAOCLASS逻辑层接口
    *@作者：宋春林 
    */

	public class webhaoclass_service
	{
        public  webhaoclass_core _dal=classFactory.getwebhaoclass();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param WEBHAOCLASS实体
         * @return 新插入记录的编号
         */
		public int insert_webhaoclass (webhaoclass_Dao _WEBHAOCLASSModel )  throws Exception{
         return _dal.insert_webhaoclass( _WEBHAOCLASSModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param WEBHAOCLASSprrameter
         * @return 新插入记录的编号
         */
         public int insert_webhaoclass(Object[] _para)  throws Exception{
        return _dal.insert_webhaoclass( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param WEBHAOCLASS实体
         * @return 影响的行数
         */
		public int update_webhaoclass(webhaoclass_Dao _WEBHAOCLASSModel)  throws Exception{
        return _dal.update_webhaoclass( _WEBHAOCLASSModel);
		}
	
		

         /**
         *  删除数据表WEBHAOCLASS中的一条记录
         * @param WEBHAOCLASS实体
         * @return 新插入记录的编号
         */
		public int delete_webhaoclass(int Cat)  throws Exception{
        return _dal.delete_webhaoclass( Cat);
		}

		

       
          /**
         * 得到 webhaoclass 数据实体
         * @param Cat">Cat
         * @return<webhaoclass 数据实体
        * @throws Exception 
         */
		public webhaoclass_Dao get_webhaoclassDao(int Cat) throws Exception{
        return _dal.get_webhaoclassDao( Cat);
		}
		
		    /**
         * 根据WEBHAOCLASS返回的查询DataRow创建一个WEBHAOCLASSEntity对象
         * @param WEBHAOCLASS row
         * @returnWEBHAOCLASSList对象
        * @throws Exception 
         */
		public List<webhaoclass_Dao> get_webhaoclass_All() throws Exception{
            return _dal.get_webhaoclass_All();
            }
		    /**
         * 根据WEBHAOCLASS返回的查询DataRow创建一个WEBHAOCLASSEntity对象
         * @param WEBHAOCLASS row
         * @returnWEBHAOCLASSList对象
        * @throws Exception 
         */
		public List<webhaoclass_Dao> get_webhaoclass_All(String strWhere) throws Exception{
            return _dal.get_webhaoclass_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<webhaoclass_Dao> get_webhaoclass_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_webhaoclass_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据WEBHAOCLASS返回的查询DataRow创建一个WEBHAOCLASSEntity对象
         * @param WEBHAOCLASS row
         * @returnWEBHAOCLASSDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, webhaoclass_Dao> get_webhaoclass_Dictionary(String strWhere) throws Exception{
            return _dal.get_webhaoclass_Dictionary(strWhere);
            }
		 /**
         * 更新WEBHAOCLASS字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_webhaoclass_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_webhaoclass_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新WEBHAOCLASSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_webhaoclass_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_webhaoclass_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新WEBHAOCLASSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createwebhaoclass_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_webhaoclass_UpdateString( FieldName, Value, sid);
            }
        
        
    }
