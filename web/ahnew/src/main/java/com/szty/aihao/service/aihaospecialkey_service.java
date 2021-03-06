﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaospecialkey.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaospecialkey_Dao;
import com.szty.aihao.core.aihaospecialkey_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOSPECIALKEY逻辑层接口
    *@作者：宋春林 
    */

	public class aihaospecialkey_service
	{
        public  aihaospecialkey_core _dal=classFactory.getaihaospecialkey();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSPECIALKEY实体
         * @return 新插入记录的编号
         */
		public int insert_aihaospecialkey (aihaospecialkey_Dao _AIHAOSPECIALKEYModel )  throws Exception{
         return _dal.insert_aihaospecialkey( _AIHAOSPECIALKEYModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSPECIALKEYprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaospecialkey(Object[] _para)  throws Exception{
        return _dal.insert_aihaospecialkey( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSPECIALKEY实体
         * @return 影响的行数
         */
		public int update_aihaospecialkey(aihaospecialkey_Dao _AIHAOSPECIALKEYModel)  throws Exception{
        return _dal.update_aihaospecialkey( _AIHAOSPECIALKEYModel);
		}
	
		

         /**
         *  删除数据表AIHAOSPECIALKEY中的一条记录
         * @param AIHAOSPECIALKEY实体
         * @return 新插入记录的编号
         */
		public int delete_aihaospecialkey(int Specialkeyid)  throws Exception{
        return _dal.delete_aihaospecialkey( Specialkeyid);
		}

		

       
          /**
         * 得到 aihaospecialkey 数据实体
         * @param Specialkeyid">Specialkeyid
         * @return<aihaospecialkey 数据实体
        * @throws Exception 
         */
		public aihaospecialkey_Dao get_aihaospecialkeyDao(int Specialkeyid) throws Exception{
        return _dal.get_aihaospecialkeyDao( Specialkeyid);
		}
		
		    /**
         * 根据AIHAOSPECIALKEY返回的查询DataRow创建一个AIHAOSPECIALKEYEntity对象
         * @param AIHAOSPECIALKEY row
         * @returnAIHAOSPECIALKEYList对象
        * @throws Exception 
         */
		public List<aihaospecialkey_Dao> get_aihaospecialkey_All() throws Exception{
            return _dal.get_aihaospecialkey_All();
            }
		    /**
         * 根据AIHAOSPECIALKEY返回的查询DataRow创建一个AIHAOSPECIALKEYEntity对象
         * @param AIHAOSPECIALKEY row
         * @returnAIHAOSPECIALKEYList对象
        * @throws Exception 
         */
		public List<aihaospecialkey_Dao> get_aihaospecialkey_All(String strWhere) throws Exception{
            return _dal.get_aihaospecialkey_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaospecialkey_Dao> get_aihaospecialkey_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaospecialkey_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOSPECIALKEY返回的查询DataRow创建一个AIHAOSPECIALKEYEntity对象
         * @param AIHAOSPECIALKEY row
         * @returnAIHAOSPECIALKEYDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaospecialkey_Dao> get_aihaospecialkey_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaospecialkey_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOSPECIALKEY字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaospecialkey_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaospecialkey_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOSPECIALKEYInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaospecialkey_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaospecialkey_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOSPECIALKEYIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaospecialkey_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaospecialkey_UpdateString( FieldName, Value, sid);
            }
        
        
    }
