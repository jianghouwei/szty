/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMobileareamap.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mobileareamap_Dao;
import com.szty.aihao.core.mobileareamap_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MOBILEAREAMAP逻辑层接口
    *@作者：宋春林 
    */

	public class mobileareamap_service
	{
        public  mobileareamap_core _dal=classFactory.getmobileareamap();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MOBILEAREAMAP实体
         * @return 新插入记录的编号
         */
		public int insert_mobileareamap (mobileareamap_Dao _MOBILEAREAMAPModel )  throws Exception{
         return _dal.insert_mobileareamap( _MOBILEAREAMAPModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MOBILEAREAMAPprrameter
         * @return 新插入记录的编号
         */
         public int insert_mobileareamap(Object[] _para)  throws Exception{
        return _dal.insert_mobileareamap( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MOBILEAREAMAP实体
         * @return 影响的行数
         */
		public int update_mobileareamap(mobileareamap_Dao _MOBILEAREAMAPModel)  throws Exception{
        return _dal.update_mobileareamap( _MOBILEAREAMAPModel);
		}
	
		

         /**
         *  删除数据表MOBILEAREAMAP中的一条记录
         * @param MOBILEAREAMAP实体
         * @return 新插入记录的编号
         */
		public int delete_mobileareamap(int Area_id)  throws Exception{
        return _dal.delete_mobileareamap( Area_id);
		}

		

       
          /**
         * 得到 mobileareamap 数据实体
         * @param Area_id">Area_id
         * @return<mobileareamap 数据实体
        * @throws Exception 
         */
		public mobileareamap_Dao get_mobileareamapDao(int Area_id) throws Exception{
        return _dal.get_mobileareamapDao( Area_id);
		}
		
		    /**
         * 根据MOBILEAREAMAP返回的查询DataRow创建一个MOBILEAREAMAPEntity对象
         * @param MOBILEAREAMAP row
         * @returnMOBILEAREAMAPList对象
        * @throws Exception 
         */
		public List<mobileareamap_Dao> get_mobileareamap_All() throws Exception{
            return _dal.get_mobileareamap_All();
            }
		    /**
         * 根据MOBILEAREAMAP返回的查询DataRow创建一个MOBILEAREAMAPEntity对象
         * @param MOBILEAREAMAP row
         * @returnMOBILEAREAMAPList对象
        * @throws Exception 
         */
		public List<mobileareamap_Dao> get_mobileareamap_All(String strWhere) throws Exception{
            return _dal.get_mobileareamap_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mobileareamap_Dao> get_mobileareamap_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mobileareamap_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MOBILEAREAMAP返回的查询DataRow创建一个MOBILEAREAMAPEntity对象
         * @param MOBILEAREAMAP row
         * @returnMOBILEAREAMAPDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mobileareamap_Dao> get_mobileareamap_Dictionary(String strWhere) throws Exception{
            return _dal.get_mobileareamap_Dictionary(strWhere);
            }
		 /**
         * 更新MOBILEAREAMAP字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mobileareamap_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mobileareamap_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MOBILEAREAMAPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mobileareamap_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mobileareamap_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MOBILEAREAMAPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmobileareamap_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mobileareamap_UpdateString( FieldName, Value, sid);
            }
        
        
    }
