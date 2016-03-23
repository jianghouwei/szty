/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoaaa.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoaaa_Dao;
import com.szty.aihao.core.aihaoaaa_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOAAA逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoaaa_service
	{
        public  aihaoaaa_core _dal=classFactory.getaihaoaaa();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOAAA实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoaaa (aihaoaaa_Dao _AIHAOAAAModel )  throws Exception{
         return _dal.insert_aihaoaaa( _AIHAOAAAModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOAAAprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoaaa(Object[] _para)  throws Exception{
        return _dal.insert_aihaoaaa( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOAAA实体
         * @return 影响的行数
         */
		public int update_aihaoaaa(aihaoaaa_Dao _AIHAOAAAModel)  throws Exception{
        return _dal.update_aihaoaaa( _AIHAOAAAModel);
		}
	
		

         /**
         *  删除数据表AIHAOAAA中的一条记录
         * @param AIHAOAAA实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoaaa(int Id)  throws Exception{
        return _dal.delete_aihaoaaa( Id);
		}

		

       
          /**
         * 得到 aihaoaaa 数据实体
         * @param Id">Id
         * @return<aihaoaaa 数据实体
        * @throws Exception 
         */
		public aihaoaaa_Dao get_aihaoaaaDao(int Id) throws Exception{
        return _dal.get_aihaoaaaDao( Id);
		}
		
		    /**
         * 根据AIHAOAAA返回的查询DataRow创建一个AIHAOAAAEntity对象
         * @param AIHAOAAA row
         * @returnAIHAOAAAList对象
        * @throws Exception 
         */
		public List<aihaoaaa_Dao> get_aihaoaaa_All() throws Exception{
            return _dal.get_aihaoaaa_All();
            }
		    /**
         * 根据AIHAOAAA返回的查询DataRow创建一个AIHAOAAAEntity对象
         * @param AIHAOAAA row
         * @returnAIHAOAAAList对象
        * @throws Exception 
         */
		public List<aihaoaaa_Dao> get_aihaoaaa_All(String strWhere) throws Exception{
            return _dal.get_aihaoaaa_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoaaa_Dao> get_aihaoaaa_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoaaa_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOAAA返回的查询DataRow创建一个AIHAOAAAEntity对象
         * @param AIHAOAAA row
         * @returnAIHAOAAADictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoaaa_Dao> get_aihaoaaa_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoaaa_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOAAA字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoaaa_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoaaa_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOAAAInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoaaa_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoaaa_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOAAAIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoaaa_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoaaa_UpdateString( FieldName, Value, sid);
            }
        
        
    }
