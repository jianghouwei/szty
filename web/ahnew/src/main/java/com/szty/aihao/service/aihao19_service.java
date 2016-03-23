/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao19.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao19_Dao;
import com.szty.aihao.core.aihao19_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO19逻辑层接口
    *@作者：宋春林 
    */

	public class aihao19_service
	{
        public  aihao19_core _dal=classFactory.getaihao19();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO19实体
         * @return 新插入记录的编号
         */
		public int insert_aihao19 (aihao19_Dao _AIHAO19Model )  throws Exception{
         return _dal.insert_aihao19( _AIHAO19Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO19prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao19(Object[] _para)  throws Exception{
        return _dal.insert_aihao19( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO19实体
         * @return 影响的行数
         */
		public int update_aihao19(aihao19_Dao _AIHAO19Model)  throws Exception{
        return _dal.update_aihao19( _AIHAO19Model);
		}
	
		

         /**
         *  删除数据表AIHAO19中的一条记录
         * @param AIHAO19实体
         * @return 新插入记录的编号
         */
		public int delete_aihao19(int Id)  throws Exception{
        return _dal.delete_aihao19( Id);
		}

		

       
          /**
         * 得到 aihao19 数据实体
         * @param Id">Id
         * @return<aihao19 数据实体
        * @throws Exception 
         */
		public aihao19_Dao get_aihao19Dao(int Id) throws Exception{
        return _dal.get_aihao19Dao( Id);
		}
		
		    /**
         * 根据AIHAO19返回的查询DataRow创建一个AIHAO19Entity对象
         * @param AIHAO19 row
         * @returnAIHAO19List对象
        * @throws Exception 
         */
		public List<aihao19_Dao> get_aihao19_All() throws Exception{
            return _dal.get_aihao19_All();
            }
		    /**
         * 根据AIHAO19返回的查询DataRow创建一个AIHAO19Entity对象
         * @param AIHAO19 row
         * @returnAIHAO19List对象
        * @throws Exception 
         */
		public List<aihao19_Dao> get_aihao19_All(String strWhere) throws Exception{
            return _dal.get_aihao19_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao19_Dao> get_aihao19_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao19_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO19返回的查询DataRow创建一个AIHAO19Entity对象
         * @param AIHAO19 row
         * @returnAIHAO19Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao19_Dao> get_aihao19_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao19_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO19字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao19_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao19_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO19Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao19_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao19_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO19IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao19_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao19_UpdateString( FieldName, Value, sid);
            }
        
        
    }
