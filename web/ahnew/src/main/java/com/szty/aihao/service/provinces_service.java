/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataProvinces.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.provinces_Dao;
import com.szty.aihao.core.provinces_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@PROVINCES逻辑层接口
    *@作者：宋春林 
    */

	public class provinces_service
	{
        public  provinces_core _dal=classFactory.getprovinces();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param PROVINCES实体
         * @return 新插入记录的编号
         */
		public int insert_provinces (provinces_Dao _PROVINCESModel )  throws Exception{
         return _dal.insert_provinces( _PROVINCESModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param PROVINCESprrameter
         * @return 新插入记录的编号
         */
         public int insert_provinces(Object[] _para)  throws Exception{
        return _dal.insert_provinces( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param PROVINCES实体
         * @return 影响的行数
         */
		public int update_provinces(provinces_Dao _PROVINCESModel)  throws Exception{
        return _dal.update_provinces( _PROVINCESModel);
		}
	
		

         /**
         *  删除数据表PROVINCES中的一条记录
         * @param PROVINCES实体
         * @return 新插入记录的编号
         */
		public int delete_provinces(int Proname)  throws Exception{
        return _dal.delete_provinces( Proname);
		}

		

       
          /**
         * 得到 provinces 数据实体
         * @param Proname">Proname
         * @return<provinces 数据实体
        * @throws Exception 
         */
		public provinces_Dao get_provincesDao(int Proname) throws Exception{
        return _dal.get_provincesDao( Proname);
		}
		
		    /**
         * 根据PROVINCES返回的查询DataRow创建一个PROVINCESEntity对象
         * @param PROVINCES row
         * @returnPROVINCESList对象
        * @throws Exception 
         */
		public List<provinces_Dao> get_provinces_All() throws Exception{
            return _dal.get_provinces_All();
            }
		    /**
         * 根据PROVINCES返回的查询DataRow创建一个PROVINCESEntity对象
         * @param PROVINCES row
         * @returnPROVINCESList对象
        * @throws Exception 
         */
		public List<provinces_Dao> get_provinces_All(String strWhere) throws Exception{
            return _dal.get_provinces_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<provinces_Dao> get_provinces_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_provinces_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据PROVINCES返回的查询DataRow创建一个PROVINCESEntity对象
         * @param PROVINCES row
         * @returnPROVINCESDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, provinces_Dao> get_provinces_Dictionary(String strWhere) throws Exception{
            return _dal.get_provinces_Dictionary(strWhere);
            }
		 /**
         * 更新PROVINCES字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_provinces_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_provinces_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新PROVINCESInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_provinces_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_provinces_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新PROVINCESIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createprovinces_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_provinces_UpdateString( FieldName, Value, sid);
            }
        
        
    }
