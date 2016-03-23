/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao10_ddyh.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao10_ddyh_Dao;
import com.szty.aihao.core.aihao10_ddyh_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO10_DDYH逻辑层接口
    *@作者：宋春林 
    */

	public class aihao10_ddyh_service
	{
        public  aihao10_ddyh_core _dal=classFactory.getaihao10_ddyh();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO10_DDYH实体
         * @return 新插入记录的编号
         */
		public int insert_aihao10_ddyh (aihao10_ddyh_Dao _AIHAO10_DDYHModel )  throws Exception{
         return _dal.insert_aihao10_ddyh( _AIHAO10_DDYHModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO10_DDYHprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao10_ddyh(Object[] _para)  throws Exception{
        return _dal.insert_aihao10_ddyh( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO10_DDYH实体
         * @return 影响的行数
         */
		public int update_aihao10_ddyh(aihao10_ddyh_Dao _AIHAO10_DDYHModel)  throws Exception{
        return _dal.update_aihao10_ddyh( _AIHAO10_DDYHModel);
		}
	
		

         /**
         *  删除数据表AIHAO10_DDYH中的一条记录
         * @param AIHAO10_DDYH实体
         * @return 新插入记录的编号
         */
		public int delete_aihao10_ddyh(int Id)  throws Exception{
        return _dal.delete_aihao10_ddyh( Id);
		}

		

       
          /**
         * 得到 aihao10_ddyh 数据实体
         * @param Id">Id
         * @return<aihao10_ddyh 数据实体
        * @throws Exception 
         */
		public aihao10_ddyh_Dao get_aihao10_ddyhDao(int Id) throws Exception{
        return _dal.get_aihao10_ddyhDao( Id);
		}
		
		    /**
         * 根据AIHAO10_DDYH返回的查询DataRow创建一个AIHAO10_DDYHEntity对象
         * @param AIHAO10_DDYH row
         * @returnAIHAO10_DDYHList对象
        * @throws Exception 
         */
		public List<aihao10_ddyh_Dao> get_aihao10_ddyh_All() throws Exception{
            return _dal.get_aihao10_ddyh_All();
            }
		    /**
         * 根据AIHAO10_DDYH返回的查询DataRow创建一个AIHAO10_DDYHEntity对象
         * @param AIHAO10_DDYH row
         * @returnAIHAO10_DDYHList对象
        * @throws Exception 
         */
		public List<aihao10_ddyh_Dao> get_aihao10_ddyh_All(String strWhere) throws Exception{
            return _dal.get_aihao10_ddyh_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao10_ddyh_Dao> get_aihao10_ddyh_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao10_ddyh_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO10_DDYH返回的查询DataRow创建一个AIHAO10_DDYHEntity对象
         * @param AIHAO10_DDYH row
         * @returnAIHAO10_DDYHDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao10_ddyh_Dao> get_aihao10_ddyh_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao10_ddyh_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO10_DDYH字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao10_ddyh_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao10_ddyh_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO10_DDYHInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao10_ddyh_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao10_ddyh_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO10_DDYHIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao10_ddyh_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao10_ddyh_UpdateString( FieldName, Value, sid);
            }
        
        
    }
