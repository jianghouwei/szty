/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataJobtable.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.jobtable_Dao;
import com.szty.aihao.core.jobtable_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@JOBTABLE逻辑层接口
    *@作者：宋春林 
    */

	public class jobtable_service
	{
        public  jobtable_core _dal=classFactory.getjobtable();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param JOBTABLE实体
         * @return 新插入记录的编号
         */
		public int insert_jobtable (jobtable_Dao _JOBTABLEModel )  throws Exception{
         return _dal.insert_jobtable( _JOBTABLEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param JOBTABLEprrameter
         * @return 新插入记录的编号
         */
         public int insert_jobtable(Object[] _para)  throws Exception{
        return _dal.insert_jobtable( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param JOBTABLE实体
         * @return 影响的行数
         */
		public int update_jobtable(jobtable_Dao _JOBTABLEModel)  throws Exception{
        return _dal.update_jobtable( _JOBTABLEModel);
		}
	
		

         /**
         *  删除数据表JOBTABLE中的一条记录
         * @param JOBTABLE实体
         * @return 新插入记录的编号
         */
		public int delete_jobtable(int Jobid)  throws Exception{
        return _dal.delete_jobtable( Jobid);
		}

		

       
          /**
         * 得到 jobtable 数据实体
         * @param Jobid">Jobid
         * @return<jobtable 数据实体
        * @throws Exception 
         */
		public jobtable_Dao get_jobtableDao(int Jobid) throws Exception{
        return _dal.get_jobtableDao( Jobid);
		}
		
		    /**
         * 根据JOBTABLE返回的查询DataRow创建一个JOBTABLEEntity对象
         * @param JOBTABLE row
         * @returnJOBTABLEList对象
        * @throws Exception 
         */
		public List<jobtable_Dao> get_jobtable_All() throws Exception{
            return _dal.get_jobtable_All();
            }
		    /**
         * 根据JOBTABLE返回的查询DataRow创建一个JOBTABLEEntity对象
         * @param JOBTABLE row
         * @returnJOBTABLEList对象
        * @throws Exception 
         */
		public List<jobtable_Dao> get_jobtable_All(String strWhere) throws Exception{
            return _dal.get_jobtable_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<jobtable_Dao> get_jobtable_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_jobtable_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据JOBTABLE返回的查询DataRow创建一个JOBTABLEEntity对象
         * @param JOBTABLE row
         * @returnJOBTABLEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, jobtable_Dao> get_jobtable_Dictionary(String strWhere) throws Exception{
            return _dal.get_jobtable_Dictionary(strWhere);
            }
		 /**
         * 更新JOBTABLE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_jobtable_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_jobtable_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新JOBTABLEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_jobtable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_jobtable_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新JOBTABLEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createjobtable_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_jobtable_UpdateString( FieldName, Value, sid);
            }
        
        
    }
