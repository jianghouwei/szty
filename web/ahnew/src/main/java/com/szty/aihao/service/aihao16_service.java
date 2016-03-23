/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao16.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao16_Dao;
import com.szty.aihao.core.aihao16_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO16逻辑层接口
    *@作者：宋春林 
    */

	public class aihao16_service
	{
        public  aihao16_core _dal=classFactory.getaihao16();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO16实体
         * @return 新插入记录的编号
         */
		public int insert_aihao16 (aihao16_Dao _AIHAO16Model )  throws Exception{
         return _dal.insert_aihao16( _AIHAO16Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO16prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao16(Object[] _para)  throws Exception{
        return _dal.insert_aihao16( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO16实体
         * @return 影响的行数
         */
		public int update_aihao16(aihao16_Dao _AIHAO16Model)  throws Exception{
        return _dal.update_aihao16( _AIHAO16Model);
		}
	
		

         /**
         *  删除数据表AIHAO16中的一条记录
         * @param AIHAO16实体
         * @return 新插入记录的编号
         */
		public int delete_aihao16(int Id)  throws Exception{
        return _dal.delete_aihao16( Id);
		}

		

       
          /**
         * 得到 aihao16 数据实体
         * @param Id">Id
         * @return<aihao16 数据实体
        * @throws Exception 
         */
		public aihao16_Dao get_aihao16Dao(int Id) throws Exception{
        return _dal.get_aihao16Dao( Id);
		}
		
		    /**
         * 根据AIHAO16返回的查询DataRow创建一个AIHAO16Entity对象
         * @param AIHAO16 row
         * @returnAIHAO16List对象
        * @throws Exception 
         */
		public List<aihao16_Dao> get_aihao16_All() throws Exception{
            return _dal.get_aihao16_All();
            }
		    /**
         * 根据AIHAO16返回的查询DataRow创建一个AIHAO16Entity对象
         * @param AIHAO16 row
         * @returnAIHAO16List对象
        * @throws Exception 
         */
		public List<aihao16_Dao> get_aihao16_All(String strWhere) throws Exception{
            return _dal.get_aihao16_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao16_Dao> get_aihao16_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao16_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO16返回的查询DataRow创建一个AIHAO16Entity对象
         * @param AIHAO16 row
         * @returnAIHAO16Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao16_Dao> get_aihao16_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao16_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO16字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao16_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao16_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO16Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao16_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao16_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO16IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao16_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao16_UpdateString( FieldName, Value, sid);
            }
        
        
    }
