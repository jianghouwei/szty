/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp10.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp10_Dao;
import com.szty.aihao.core.aihaoiptmp10_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP10逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp10_service
	{
        public  aihaoiptmp10_core _dal=classFactory.getaihaoiptmp10();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP10实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp10 (aihaoiptmp10_Dao _AIHAOIPTMP10Model )  throws Exception{
         return _dal.insert_aihaoiptmp10( _AIHAOIPTMP10Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP10prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp10(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp10( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP10实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp10(aihaoiptmp10_Dao _AIHAOIPTMP10Model)  throws Exception{
        return _dal.update_aihaoiptmp10( _AIHAOIPTMP10Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP10中的一条记录
         * @param AIHAOIPTMP10实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp10(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp10( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp10 数据实体
         * @param Id">Id
         * @return<aihaoiptmp10 数据实体
        * @throws Exception 
         */
		public aihaoiptmp10_Dao get_aihaoiptmp10Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp10Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP10返回的查询DataRow创建一个AIHAOIPTMP10Entity对象
         * @param AIHAOIPTMP10 row
         * @returnAIHAOIPTMP10List对象
        * @throws Exception 
         */
		public List<aihaoiptmp10_Dao> get_aihaoiptmp10_All() throws Exception{
            return _dal.get_aihaoiptmp10_All();
            }
		    /**
         * 根据AIHAOIPTMP10返回的查询DataRow创建一个AIHAOIPTMP10Entity对象
         * @param AIHAOIPTMP10 row
         * @returnAIHAOIPTMP10List对象
        * @throws Exception 
         */
		public List<aihaoiptmp10_Dao> get_aihaoiptmp10_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp10_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp10_Dao> get_aihaoiptmp10_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp10_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP10返回的查询DataRow创建一个AIHAOIPTMP10Entity对象
         * @param AIHAOIPTMP10 row
         * @returnAIHAOIPTMP10Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp10_Dao> get_aihaoiptmp10_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp10_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP10字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp10_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp10_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP10Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp10_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp10_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP10IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp10_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp10_UpdateString( FieldName, Value, sid);
            }
        
        
    }
