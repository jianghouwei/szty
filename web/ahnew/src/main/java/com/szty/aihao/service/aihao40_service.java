/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao40.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao40_Dao;
import com.szty.aihao.core.aihao40_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO40逻辑层接口
    *@作者：宋春林 
    */

	public class aihao40_service
	{
        public  aihao40_core _dal=classFactory.getaihao40();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO40实体
         * @return 新插入记录的编号
         */
		public int insert_aihao40 (aihao40_Dao _AIHAO40Model )  throws Exception{
         return _dal.insert_aihao40( _AIHAO40Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO40prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao40(Object[] _para)  throws Exception{
        return _dal.insert_aihao40( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO40实体
         * @return 影响的行数
         */
		public int update_aihao40(aihao40_Dao _AIHAO40Model)  throws Exception{
        return _dal.update_aihao40( _AIHAO40Model);
		}
	
		

         /**
         *  删除数据表AIHAO40中的一条记录
         * @param AIHAO40实体
         * @return 新插入记录的编号
         */
		public int delete_aihao40(int Id)  throws Exception{
        return _dal.delete_aihao40( Id);
		}

		

       
          /**
         * 得到 aihao40 数据实体
         * @param Id">Id
         * @return<aihao40 数据实体
        * @throws Exception 
         */
		public aihao40_Dao get_aihao40Dao(int Id) throws Exception{
        return _dal.get_aihao40Dao( Id);
		}
		
		    /**
         * 根据AIHAO40返回的查询DataRow创建一个AIHAO40Entity对象
         * @param AIHAO40 row
         * @returnAIHAO40List对象
        * @throws Exception 
         */
		public List<aihao40_Dao> get_aihao40_All() throws Exception{
            return _dal.get_aihao40_All();
            }
		    /**
         * 根据AIHAO40返回的查询DataRow创建一个AIHAO40Entity对象
         * @param AIHAO40 row
         * @returnAIHAO40List对象
        * @throws Exception 
         */
		public List<aihao40_Dao> get_aihao40_All(String strWhere) throws Exception{
            return _dal.get_aihao40_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao40_Dao> get_aihao40_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao40_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO40返回的查询DataRow创建一个AIHAO40Entity对象
         * @param AIHAO40 row
         * @returnAIHAO40Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao40_Dao> get_aihao40_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao40_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO40字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao40_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao40_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO40Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao40_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao40_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO40IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao40_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao40_UpdateString( FieldName, Value, sid);
            }
        
        
    }
