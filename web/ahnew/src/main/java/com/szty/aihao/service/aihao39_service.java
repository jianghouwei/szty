/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao39.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao39_Dao;
import com.szty.aihao.core.aihao39_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO39逻辑层接口
    *@作者：宋春林 
    */

	public class aihao39_service
	{
        public  aihao39_core _dal=classFactory.getaihao39();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO39实体
         * @return 新插入记录的编号
         */
		public int insert_aihao39 (aihao39_Dao _AIHAO39Model )  throws Exception{
         return _dal.insert_aihao39( _AIHAO39Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO39prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao39(Object[] _para)  throws Exception{
        return _dal.insert_aihao39( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO39实体
         * @return 影响的行数
         */
		public int update_aihao39(aihao39_Dao _AIHAO39Model)  throws Exception{
        return _dal.update_aihao39( _AIHAO39Model);
		}
	
		

         /**
         *  删除数据表AIHAO39中的一条记录
         * @param AIHAO39实体
         * @return 新插入记录的编号
         */
		public int delete_aihao39(int Id)  throws Exception{
        return _dal.delete_aihao39( Id);
		}

		

       
          /**
         * 得到 aihao39 数据实体
         * @param Id">Id
         * @return<aihao39 数据实体
        * @throws Exception 
         */
		public aihao39_Dao get_aihao39Dao(int Id) throws Exception{
        return _dal.get_aihao39Dao( Id);
		}
		
		    /**
         * 根据AIHAO39返回的查询DataRow创建一个AIHAO39Entity对象
         * @param AIHAO39 row
         * @returnAIHAO39List对象
        * @throws Exception 
         */
		public List<aihao39_Dao> get_aihao39_All() throws Exception{
            return _dal.get_aihao39_All();
            }
		    /**
         * 根据AIHAO39返回的查询DataRow创建一个AIHAO39Entity对象
         * @param AIHAO39 row
         * @returnAIHAO39List对象
        * @throws Exception 
         */
		public List<aihao39_Dao> get_aihao39_All(String strWhere) throws Exception{
            return _dal.get_aihao39_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao39_Dao> get_aihao39_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao39_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO39返回的查询DataRow创建一个AIHAO39Entity对象
         * @param AIHAO39 row
         * @returnAIHAO39Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao39_Dao> get_aihao39_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao39_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO39字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao39_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao39_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO39Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao39_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao39_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO39IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao39_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao39_UpdateString( FieldName, Value, sid);
            }
        
        
    }
