/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp27.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp27_Dao;
import com.szty.aihao.core.aihaoiptmp27_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP27逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp27_service
	{
        public  aihaoiptmp27_core _dal=classFactory.getaihaoiptmp27();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP27实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp27 (aihaoiptmp27_Dao _AIHAOIPTMP27Model )  throws Exception{
         return _dal.insert_aihaoiptmp27( _AIHAOIPTMP27Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP27prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp27(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp27( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP27实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp27(aihaoiptmp27_Dao _AIHAOIPTMP27Model)  throws Exception{
        return _dal.update_aihaoiptmp27( _AIHAOIPTMP27Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP27中的一条记录
         * @param AIHAOIPTMP27实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp27(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp27( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp27 数据实体
         * @param Id">Id
         * @return<aihaoiptmp27 数据实体
        * @throws Exception 
         */
		public aihaoiptmp27_Dao get_aihaoiptmp27Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp27Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP27返回的查询DataRow创建一个AIHAOIPTMP27Entity对象
         * @param AIHAOIPTMP27 row
         * @returnAIHAOIPTMP27List对象
        * @throws Exception 
         */
		public List<aihaoiptmp27_Dao> get_aihaoiptmp27_All() throws Exception{
            return _dal.get_aihaoiptmp27_All();
            }
		    /**
         * 根据AIHAOIPTMP27返回的查询DataRow创建一个AIHAOIPTMP27Entity对象
         * @param AIHAOIPTMP27 row
         * @returnAIHAOIPTMP27List对象
        * @throws Exception 
         */
		public List<aihaoiptmp27_Dao> get_aihaoiptmp27_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp27_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp27_Dao> get_aihaoiptmp27_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp27_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP27返回的查询DataRow创建一个AIHAOIPTMP27Entity对象
         * @param AIHAOIPTMP27 row
         * @returnAIHAOIPTMP27Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp27_Dao> get_aihaoiptmp27_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp27_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP27字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp27_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp27_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP27Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp27_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp27_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP27IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp27_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp27_UpdateString( FieldName, Value, sid);
            }
        
        
    }
