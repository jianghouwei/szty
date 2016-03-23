/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao34.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao34_Dao;
import com.szty.aihao.core.aihao34_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO34逻辑层接口
    *@作者：宋春林 
    */

	public class aihao34_service
	{
        public  aihao34_core _dal=classFactory.getaihao34();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO34实体
         * @return 新插入记录的编号
         */
		public int insert_aihao34 (aihao34_Dao _AIHAO34Model )  throws Exception{
         return _dal.insert_aihao34( _AIHAO34Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO34prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao34(Object[] _para)  throws Exception{
        return _dal.insert_aihao34( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO34实体
         * @return 影响的行数
         */
		public int update_aihao34(aihao34_Dao _AIHAO34Model)  throws Exception{
        return _dal.update_aihao34( _AIHAO34Model);
		}
	
		

         /**
         *  删除数据表AIHAO34中的一条记录
         * @param AIHAO34实体
         * @return 新插入记录的编号
         */
		public int delete_aihao34(int Id)  throws Exception{
        return _dal.delete_aihao34( Id);
		}

		

       
          /**
         * 得到 aihao34 数据实体
         * @param Id">Id
         * @return<aihao34 数据实体
        * @throws Exception 
         */
		public aihao34_Dao get_aihao34Dao(int Id) throws Exception{
        return _dal.get_aihao34Dao( Id);
		}
		
		    /**
         * 根据AIHAO34返回的查询DataRow创建一个AIHAO34Entity对象
         * @param AIHAO34 row
         * @returnAIHAO34List对象
        * @throws Exception 
         */
		public List<aihao34_Dao> get_aihao34_All() throws Exception{
            return _dal.get_aihao34_All();
            }
		    /**
         * 根据AIHAO34返回的查询DataRow创建一个AIHAO34Entity对象
         * @param AIHAO34 row
         * @returnAIHAO34List对象
        * @throws Exception 
         */
		public List<aihao34_Dao> get_aihao34_All(String strWhere) throws Exception{
            return _dal.get_aihao34_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao34_Dao> get_aihao34_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao34_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO34返回的查询DataRow创建一个AIHAO34Entity对象
         * @param AIHAO34 row
         * @returnAIHAO34Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao34_Dao> get_aihao34_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao34_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO34字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao34_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao34_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO34Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao34_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao34_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO34IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao34_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao34_UpdateString( FieldName, Value, sid);
            }
        
        
    }
