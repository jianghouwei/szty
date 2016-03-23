/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMobilehaoclass.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mobilehaoclass_Dao;
import com.szty.aihao.core.mobilehaoclass_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MOBILEHAOCLASS逻辑层接口
    *@作者：宋春林 
    */

	public class mobilehaoclass_service
	{
        public  mobilehaoclass_core _dal=classFactory.getmobilehaoclass();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MOBILEHAOCLASS实体
         * @return 新插入记录的编号
         */
		public int insert_mobilehaoclass (mobilehaoclass_Dao _MOBILEHAOCLASSModel )  throws Exception{
         return _dal.insert_mobilehaoclass( _MOBILEHAOCLASSModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MOBILEHAOCLASSprrameter
         * @return 新插入记录的编号
         */
         public int insert_mobilehaoclass(Object[] _para)  throws Exception{
        return _dal.insert_mobilehaoclass( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MOBILEHAOCLASS实体
         * @return 影响的行数
         */
		public int update_mobilehaoclass(mobilehaoclass_Dao _MOBILEHAOCLASSModel)  throws Exception{
        return _dal.update_mobilehaoclass( _MOBILEHAOCLASSModel);
		}
	
		

         /**
         *  删除数据表MOBILEHAOCLASS中的一条记录
         * @param MOBILEHAOCLASS实体
         * @return 新插入记录的编号
         */
		public int delete_mobilehaoclass(int Name)  throws Exception{
        return _dal.delete_mobilehaoclass( Name);
		}

		

       
          /**
         * 得到 mobilehaoclass 数据实体
         * @param Name">Name
         * @return<mobilehaoclass 数据实体
        * @throws Exception 
         */
		public mobilehaoclass_Dao get_mobilehaoclassDao(int Name) throws Exception{
        return _dal.get_mobilehaoclassDao( Name);
		}
		
		    /**
         * 根据MOBILEHAOCLASS返回的查询DataRow创建一个MOBILEHAOCLASSEntity对象
         * @param MOBILEHAOCLASS row
         * @returnMOBILEHAOCLASSList对象
        * @throws Exception 
         */
		public List<mobilehaoclass_Dao> get_mobilehaoclass_All() throws Exception{
            return _dal.get_mobilehaoclass_All();
            }
		    /**
         * 根据MOBILEHAOCLASS返回的查询DataRow创建一个MOBILEHAOCLASSEntity对象
         * @param MOBILEHAOCLASS row
         * @returnMOBILEHAOCLASSList对象
        * @throws Exception 
         */
		public List<mobilehaoclass_Dao> get_mobilehaoclass_All(String strWhere) throws Exception{
            return _dal.get_mobilehaoclass_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mobilehaoclass_Dao> get_mobilehaoclass_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mobilehaoclass_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MOBILEHAOCLASS返回的查询DataRow创建一个MOBILEHAOCLASSEntity对象
         * @param MOBILEHAOCLASS row
         * @returnMOBILEHAOCLASSDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mobilehaoclass_Dao> get_mobilehaoclass_Dictionary(String strWhere) throws Exception{
            return _dal.get_mobilehaoclass_Dictionary(strWhere);
            }
		 /**
         * 更新MOBILEHAOCLASS字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mobilehaoclass_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mobilehaoclass_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MOBILEHAOCLASSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mobilehaoclass_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mobilehaoclass_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MOBILEHAOCLASSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmobilehaoclass_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mobilehaoclass_UpdateString( FieldName, Value, sid);
            }
        
        
    }
