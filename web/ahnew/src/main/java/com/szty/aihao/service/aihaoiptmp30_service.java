/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp30.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp30_Dao;
import com.szty.aihao.core.aihaoiptmp30_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP30逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp30_service
	{
        public  aihaoiptmp30_core _dal=classFactory.getaihaoiptmp30();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP30实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp30 (aihaoiptmp30_Dao _AIHAOIPTMP30Model )  throws Exception{
         return _dal.insert_aihaoiptmp30( _AIHAOIPTMP30Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP30prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp30(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp30( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP30实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp30(aihaoiptmp30_Dao _AIHAOIPTMP30Model)  throws Exception{
        return _dal.update_aihaoiptmp30( _AIHAOIPTMP30Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP30中的一条记录
         * @param AIHAOIPTMP30实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp30(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp30( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp30 数据实体
         * @param Id">Id
         * @return<aihaoiptmp30 数据实体
        * @throws Exception 
         */
		public aihaoiptmp30_Dao get_aihaoiptmp30Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp30Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP30返回的查询DataRow创建一个AIHAOIPTMP30Entity对象
         * @param AIHAOIPTMP30 row
         * @returnAIHAOIPTMP30List对象
        * @throws Exception 
         */
		public List<aihaoiptmp30_Dao> get_aihaoiptmp30_All() throws Exception{
            return _dal.get_aihaoiptmp30_All();
            }
		    /**
         * 根据AIHAOIPTMP30返回的查询DataRow创建一个AIHAOIPTMP30Entity对象
         * @param AIHAOIPTMP30 row
         * @returnAIHAOIPTMP30List对象
        * @throws Exception 
         */
		public List<aihaoiptmp30_Dao> get_aihaoiptmp30_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp30_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp30_Dao> get_aihaoiptmp30_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp30_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP30返回的查询DataRow创建一个AIHAOIPTMP30Entity对象
         * @param AIHAOIPTMP30 row
         * @returnAIHAOIPTMP30Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp30_Dao> get_aihaoiptmp30_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp30_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP30字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp30_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp30_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP30Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp30_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp30_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP30IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp30_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp30_UpdateString( FieldName, Value, sid);
            }
        
        
    }
