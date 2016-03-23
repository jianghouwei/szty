/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp35.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp35_Dao;
import com.szty.aihao.core.aihaoiptmp35_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP35逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp35_service
	{
        public  aihaoiptmp35_core _dal=classFactory.getaihaoiptmp35();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP35实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp35 (aihaoiptmp35_Dao _AIHAOIPTMP35Model )  throws Exception{
         return _dal.insert_aihaoiptmp35( _AIHAOIPTMP35Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP35prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp35(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp35( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP35实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp35(aihaoiptmp35_Dao _AIHAOIPTMP35Model)  throws Exception{
        return _dal.update_aihaoiptmp35( _AIHAOIPTMP35Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP35中的一条记录
         * @param AIHAOIPTMP35实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp35(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp35( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp35 数据实体
         * @param Id">Id
         * @return<aihaoiptmp35 数据实体
        * @throws Exception 
         */
		public aihaoiptmp35_Dao get_aihaoiptmp35Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp35Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP35返回的查询DataRow创建一个AIHAOIPTMP35Entity对象
         * @param AIHAOIPTMP35 row
         * @returnAIHAOIPTMP35List对象
        * @throws Exception 
         */
		public List<aihaoiptmp35_Dao> get_aihaoiptmp35_All() throws Exception{
            return _dal.get_aihaoiptmp35_All();
            }
		    /**
         * 根据AIHAOIPTMP35返回的查询DataRow创建一个AIHAOIPTMP35Entity对象
         * @param AIHAOIPTMP35 row
         * @returnAIHAOIPTMP35List对象
        * @throws Exception 
         */
		public List<aihaoiptmp35_Dao> get_aihaoiptmp35_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp35_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp35_Dao> get_aihaoiptmp35_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp35_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP35返回的查询DataRow创建一个AIHAOIPTMP35Entity对象
         * @param AIHAOIPTMP35 row
         * @returnAIHAOIPTMP35Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp35_Dao> get_aihaoiptmp35_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp35_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP35字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp35_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp35_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP35Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp35_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp35_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP35IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp35_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp35_UpdateString( FieldName, Value, sid);
            }
        
        
    }
