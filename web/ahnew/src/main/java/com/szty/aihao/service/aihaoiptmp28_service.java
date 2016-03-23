/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp28.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp28_Dao;
import com.szty.aihao.core.aihaoiptmp28_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP28逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp28_service
	{
        public  aihaoiptmp28_core _dal=classFactory.getaihaoiptmp28();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP28实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp28 (aihaoiptmp28_Dao _AIHAOIPTMP28Model )  throws Exception{
         return _dal.insert_aihaoiptmp28( _AIHAOIPTMP28Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP28prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp28(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp28( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP28实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp28(aihaoiptmp28_Dao _AIHAOIPTMP28Model)  throws Exception{
        return _dal.update_aihaoiptmp28( _AIHAOIPTMP28Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP28中的一条记录
         * @param AIHAOIPTMP28实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp28(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp28( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp28 数据实体
         * @param Id">Id
         * @return<aihaoiptmp28 数据实体
        * @throws Exception 
         */
		public aihaoiptmp28_Dao get_aihaoiptmp28Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp28Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP28返回的查询DataRow创建一个AIHAOIPTMP28Entity对象
         * @param AIHAOIPTMP28 row
         * @returnAIHAOIPTMP28List对象
        * @throws Exception 
         */
		public List<aihaoiptmp28_Dao> get_aihaoiptmp28_All() throws Exception{
            return _dal.get_aihaoiptmp28_All();
            }
		    /**
         * 根据AIHAOIPTMP28返回的查询DataRow创建一个AIHAOIPTMP28Entity对象
         * @param AIHAOIPTMP28 row
         * @returnAIHAOIPTMP28List对象
        * @throws Exception 
         */
		public List<aihaoiptmp28_Dao> get_aihaoiptmp28_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp28_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp28_Dao> get_aihaoiptmp28_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp28_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP28返回的查询DataRow创建一个AIHAOIPTMP28Entity对象
         * @param AIHAOIPTMP28 row
         * @returnAIHAOIPTMP28Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp28_Dao> get_aihaoiptmp28_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp28_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP28字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp28_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp28_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP28Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp28_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp28_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP28IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp28_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp28_UpdateString( FieldName, Value, sid);
            }
        
        
    }
