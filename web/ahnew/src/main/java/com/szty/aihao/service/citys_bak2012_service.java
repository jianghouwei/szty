/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataCitys_bak2012.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.citys_bak2012_Dao;
import com.szty.aihao.core.citys_bak2012_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@CITYS_BAK2012逻辑层接口
    *@作者：宋春林 
    */

	public class citys_bak2012_service
	{
        public  citys_bak2012_core _dal=classFactory.getcitys_bak2012();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param CITYS_BAK2012实体
         * @return 新插入记录的编号
         */
		public int insert_citys_bak2012 (citys_bak2012_Dao _CITYS_BAK2012Model )  throws Exception{
         return _dal.insert_citys_bak2012( _CITYS_BAK2012Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param CITYS_BAK2012prrameter
         * @return 新插入记录的编号
         */
         public int insert_citys_bak2012(Object[] _para)  throws Exception{
        return _dal.insert_citys_bak2012( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param CITYS_BAK2012实体
         * @return 影响的行数
         */
		public int update_citys_bak2012(citys_bak2012_Dao _CITYS_BAK2012Model)  throws Exception{
        return _dal.update_citys_bak2012( _CITYS_BAK2012Model);
		}
	
		

         /**
         *  删除数据表CITYS_BAK2012中的一条记录
         * @param CITYS_BAK2012实体
         * @return 新插入记录的编号
         */
		public int delete_citys_bak2012(int Id)  throws Exception{
        return _dal.delete_citys_bak2012( Id);
		}

		

       
          /**
         * 得到 citys_bak2012 数据实体
         * @param Id">Id
         * @return<citys_bak2012 数据实体
        * @throws Exception 
         */
		public citys_bak2012_Dao get_citys_bak2012Dao(int Id) throws Exception{
        return _dal.get_citys_bak2012Dao( Id);
		}
		
		    /**
         * 根据CITYS_BAK2012返回的查询DataRow创建一个CITYS_BAK2012Entity对象
         * @param CITYS_BAK2012 row
         * @returnCITYS_BAK2012List对象
        * @throws Exception 
         */
		public List<citys_bak2012_Dao> get_citys_bak2012_All() throws Exception{
            return _dal.get_citys_bak2012_All();
            }
		    /**
         * 根据CITYS_BAK2012返回的查询DataRow创建一个CITYS_BAK2012Entity对象
         * @param CITYS_BAK2012 row
         * @returnCITYS_BAK2012List对象
        * @throws Exception 
         */
		public List<citys_bak2012_Dao> get_citys_bak2012_All(String strWhere) throws Exception{
            return _dal.get_citys_bak2012_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<citys_bak2012_Dao> get_citys_bak2012_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_citys_bak2012_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据CITYS_BAK2012返回的查询DataRow创建一个CITYS_BAK2012Entity对象
         * @param CITYS_BAK2012 row
         * @returnCITYS_BAK2012Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, citys_bak2012_Dao> get_citys_bak2012_Dictionary(String strWhere) throws Exception{
            return _dal.get_citys_bak2012_Dictionary(strWhere);
            }
		 /**
         * 更新CITYS_BAK2012字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_citys_bak2012_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_citys_bak2012_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新CITYS_BAK2012Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_citys_bak2012_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_citys_bak2012_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新CITYS_BAK2012IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createcitys_bak2012_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_citys_bak2012_UpdateString( FieldName, Value, sid);
            }
        
        
    }
