/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMobileareamap1.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mobileareamap1_Dao;
import com.szty.aihao.core.mobileareamap1_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MOBILEAREAMAP1逻辑层接口
    *@作者：宋春林 
    */

	public class mobileareamap1_service
	{
        public  mobileareamap1_core _dal=classFactory.getmobileareamap1();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MOBILEAREAMAP1实体
         * @return 新插入记录的编号
         */
		public int insert_mobileareamap1 (mobileareamap1_Dao _MOBILEAREAMAP1Model )  throws Exception{
         return _dal.insert_mobileareamap1( _MOBILEAREAMAP1Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MOBILEAREAMAP1prrameter
         * @return 新插入记录的编号
         */
         public int insert_mobileareamap1(Object[] _para)  throws Exception{
        return _dal.insert_mobileareamap1( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MOBILEAREAMAP1实体
         * @return 影响的行数
         */
		public int update_mobileareamap1(mobileareamap1_Dao _MOBILEAREAMAP1Model)  throws Exception{
        return _dal.update_mobileareamap1( _MOBILEAREAMAP1Model);
		}
	
		

         /**
         *  删除数据表MOBILEAREAMAP1中的一条记录
         * @param MOBILEAREAMAP1实体
         * @return 新插入记录的编号
         */
		public int delete_mobileareamap1(int Countryid)  throws Exception{
        return _dal.delete_mobileareamap1( Countryid);
		}

		

       
          /**
         * 得到 mobileareamap1 数据实体
         * @param Countryid">Countryid
         * @return<mobileareamap1 数据实体
        * @throws Exception 
         */
		public mobileareamap1_Dao get_mobileareamap1Dao(int Countryid) throws Exception{
        return _dal.get_mobileareamap1Dao( Countryid);
		}
		
		    /**
         * 根据MOBILEAREAMAP1返回的查询DataRow创建一个MOBILEAREAMAP1Entity对象
         * @param MOBILEAREAMAP1 row
         * @returnMOBILEAREAMAP1List对象
        * @throws Exception 
         */
		public List<mobileareamap1_Dao> get_mobileareamap1_All() throws Exception{
            return _dal.get_mobileareamap1_All();
            }
		    /**
         * 根据MOBILEAREAMAP1返回的查询DataRow创建一个MOBILEAREAMAP1Entity对象
         * @param MOBILEAREAMAP1 row
         * @returnMOBILEAREAMAP1List对象
        * @throws Exception 
         */
		public List<mobileareamap1_Dao> get_mobileareamap1_All(String strWhere) throws Exception{
            return _dal.get_mobileareamap1_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mobileareamap1_Dao> get_mobileareamap1_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mobileareamap1_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MOBILEAREAMAP1返回的查询DataRow创建一个MOBILEAREAMAP1Entity对象
         * @param MOBILEAREAMAP1 row
         * @returnMOBILEAREAMAP1Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mobileareamap1_Dao> get_mobileareamap1_Dictionary(String strWhere) throws Exception{
            return _dal.get_mobileareamap1_Dictionary(strWhere);
            }
		 /**
         * 更新MOBILEAREAMAP1字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mobileareamap1_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mobileareamap1_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MOBILEAREAMAP1Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mobileareamap1_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mobileareamap1_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MOBILEAREAMAP1IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmobileareamap1_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mobileareamap1_UpdateString( FieldName, Value, sid);
            }
        
        
    }
