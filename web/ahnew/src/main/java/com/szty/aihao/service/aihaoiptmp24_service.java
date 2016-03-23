/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp24.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp24_Dao;
import com.szty.aihao.core.aihaoiptmp24_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP24逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp24_service
	{
        public  aihaoiptmp24_core _dal=classFactory.getaihaoiptmp24();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP24实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp24 (aihaoiptmp24_Dao _AIHAOIPTMP24Model )  throws Exception{
         return _dal.insert_aihaoiptmp24( _AIHAOIPTMP24Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP24prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp24(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp24( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP24实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp24(aihaoiptmp24_Dao _AIHAOIPTMP24Model)  throws Exception{
        return _dal.update_aihaoiptmp24( _AIHAOIPTMP24Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP24中的一条记录
         * @param AIHAOIPTMP24实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp24(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp24( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp24 数据实体
         * @param Id">Id
         * @return<aihaoiptmp24 数据实体
        * @throws Exception 
         */
		public aihaoiptmp24_Dao get_aihaoiptmp24Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp24Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP24返回的查询DataRow创建一个AIHAOIPTMP24Entity对象
         * @param AIHAOIPTMP24 row
         * @returnAIHAOIPTMP24List对象
        * @throws Exception 
         */
		public List<aihaoiptmp24_Dao> get_aihaoiptmp24_All() throws Exception{
            return _dal.get_aihaoiptmp24_All();
            }
		    /**
         * 根据AIHAOIPTMP24返回的查询DataRow创建一个AIHAOIPTMP24Entity对象
         * @param AIHAOIPTMP24 row
         * @returnAIHAOIPTMP24List对象
        * @throws Exception 
         */
		public List<aihaoiptmp24_Dao> get_aihaoiptmp24_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp24_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp24_Dao> get_aihaoiptmp24_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp24_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP24返回的查询DataRow创建一个AIHAOIPTMP24Entity对象
         * @param AIHAOIPTMP24 row
         * @returnAIHAOIPTMP24Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp24_Dao> get_aihaoiptmp24_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp24_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP24字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp24_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp24_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP24Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp24_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp24_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP24IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp24_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp24_UpdateString( FieldName, Value, sid);
            }
        
        
    }
