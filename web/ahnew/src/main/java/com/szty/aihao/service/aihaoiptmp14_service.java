/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp14.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp14_Dao;
import com.szty.aihao.core.aihaoiptmp14_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP14逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp14_service
	{
        public  aihaoiptmp14_core _dal=classFactory.getaihaoiptmp14();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP14实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp14 (aihaoiptmp14_Dao _AIHAOIPTMP14Model )  throws Exception{
         return _dal.insert_aihaoiptmp14( _AIHAOIPTMP14Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP14prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp14(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp14( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP14实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp14(aihaoiptmp14_Dao _AIHAOIPTMP14Model)  throws Exception{
        return _dal.update_aihaoiptmp14( _AIHAOIPTMP14Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP14中的一条记录
         * @param AIHAOIPTMP14实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp14(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp14( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp14 数据实体
         * @param Id">Id
         * @return<aihaoiptmp14 数据实体
        * @throws Exception 
         */
		public aihaoiptmp14_Dao get_aihaoiptmp14Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp14Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP14返回的查询DataRow创建一个AIHAOIPTMP14Entity对象
         * @param AIHAOIPTMP14 row
         * @returnAIHAOIPTMP14List对象
        * @throws Exception 
         */
		public List<aihaoiptmp14_Dao> get_aihaoiptmp14_All() throws Exception{
            return _dal.get_aihaoiptmp14_All();
            }
		    /**
         * 根据AIHAOIPTMP14返回的查询DataRow创建一个AIHAOIPTMP14Entity对象
         * @param AIHAOIPTMP14 row
         * @returnAIHAOIPTMP14List对象
        * @throws Exception 
         */
		public List<aihaoiptmp14_Dao> get_aihaoiptmp14_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp14_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp14_Dao> get_aihaoiptmp14_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp14_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP14返回的查询DataRow创建一个AIHAOIPTMP14Entity对象
         * @param AIHAOIPTMP14 row
         * @returnAIHAOIPTMP14Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp14_Dao> get_aihaoiptmp14_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp14_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP14字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp14_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp14_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP14Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp14_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp14_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP14IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp14_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp14_UpdateString( FieldName, Value, sid);
            }
        
        
    }
