/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp39.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp39_Dao;
import com.szty.aihao.core.aihaoiptmp39_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP39逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp39_service
	{
        public  aihaoiptmp39_core _dal=classFactory.getaihaoiptmp39();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP39实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp39 (aihaoiptmp39_Dao _AIHAOIPTMP39Model )  throws Exception{
         return _dal.insert_aihaoiptmp39( _AIHAOIPTMP39Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP39prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp39(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp39( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP39实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp39(aihaoiptmp39_Dao _AIHAOIPTMP39Model)  throws Exception{
        return _dal.update_aihaoiptmp39( _AIHAOIPTMP39Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP39中的一条记录
         * @param AIHAOIPTMP39实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp39(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp39( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp39 数据实体
         * @param Id">Id
         * @return<aihaoiptmp39 数据实体
        * @throws Exception 
         */
		public aihaoiptmp39_Dao get_aihaoiptmp39Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp39Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP39返回的查询DataRow创建一个AIHAOIPTMP39Entity对象
         * @param AIHAOIPTMP39 row
         * @returnAIHAOIPTMP39List对象
        * @throws Exception 
         */
		public List<aihaoiptmp39_Dao> get_aihaoiptmp39_All() throws Exception{
            return _dal.get_aihaoiptmp39_All();
            }
		    /**
         * 根据AIHAOIPTMP39返回的查询DataRow创建一个AIHAOIPTMP39Entity对象
         * @param AIHAOIPTMP39 row
         * @returnAIHAOIPTMP39List对象
        * @throws Exception 
         */
		public List<aihaoiptmp39_Dao> get_aihaoiptmp39_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp39_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp39_Dao> get_aihaoiptmp39_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp39_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP39返回的查询DataRow创建一个AIHAOIPTMP39Entity对象
         * @param AIHAOIPTMP39 row
         * @returnAIHAOIPTMP39Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp39_Dao> get_aihaoiptmp39_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp39_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP39字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp39_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp39_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP39Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp39_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp39_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP39IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp39_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp39_UpdateString( FieldName, Value, sid);
            }
        
        
    }
