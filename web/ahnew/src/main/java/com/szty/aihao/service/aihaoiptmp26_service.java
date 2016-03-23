/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp26.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp26_Dao;
import com.szty.aihao.core.aihaoiptmp26_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP26逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp26_service
	{
        public  aihaoiptmp26_core _dal=classFactory.getaihaoiptmp26();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP26实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp26 (aihaoiptmp26_Dao _AIHAOIPTMP26Model )  throws Exception{
         return _dal.insert_aihaoiptmp26( _AIHAOIPTMP26Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP26prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp26(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp26( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP26实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp26(aihaoiptmp26_Dao _AIHAOIPTMP26Model)  throws Exception{
        return _dal.update_aihaoiptmp26( _AIHAOIPTMP26Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP26中的一条记录
         * @param AIHAOIPTMP26实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp26(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp26( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp26 数据实体
         * @param Id">Id
         * @return<aihaoiptmp26 数据实体
        * @throws Exception 
         */
		public aihaoiptmp26_Dao get_aihaoiptmp26Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp26Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP26返回的查询DataRow创建一个AIHAOIPTMP26Entity对象
         * @param AIHAOIPTMP26 row
         * @returnAIHAOIPTMP26List对象
        * @throws Exception 
         */
		public List<aihaoiptmp26_Dao> get_aihaoiptmp26_All() throws Exception{
            return _dal.get_aihaoiptmp26_All();
            }
		    /**
         * 根据AIHAOIPTMP26返回的查询DataRow创建一个AIHAOIPTMP26Entity对象
         * @param AIHAOIPTMP26 row
         * @returnAIHAOIPTMP26List对象
        * @throws Exception 
         */
		public List<aihaoiptmp26_Dao> get_aihaoiptmp26_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp26_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp26_Dao> get_aihaoiptmp26_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp26_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP26返回的查询DataRow创建一个AIHAOIPTMP26Entity对象
         * @param AIHAOIPTMP26 row
         * @returnAIHAOIPTMP26Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp26_Dao> get_aihaoiptmp26_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp26_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP26字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp26_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp26_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP26Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp26_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp26_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP26IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp26_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp26_UpdateString( FieldName, Value, sid);
            }
        
        
    }
