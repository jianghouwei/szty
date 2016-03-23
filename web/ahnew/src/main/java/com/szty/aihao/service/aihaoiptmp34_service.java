/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp34.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp34_Dao;
import com.szty.aihao.core.aihaoiptmp34_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP34逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp34_service
	{
        public  aihaoiptmp34_core _dal=classFactory.getaihaoiptmp34();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP34实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp34 (aihaoiptmp34_Dao _AIHAOIPTMP34Model )  throws Exception{
         return _dal.insert_aihaoiptmp34( _AIHAOIPTMP34Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP34prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp34(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp34( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP34实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp34(aihaoiptmp34_Dao _AIHAOIPTMP34Model)  throws Exception{
        return _dal.update_aihaoiptmp34( _AIHAOIPTMP34Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP34中的一条记录
         * @param AIHAOIPTMP34实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp34(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp34( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp34 数据实体
         * @param Id">Id
         * @return<aihaoiptmp34 数据实体
        * @throws Exception 
         */
		public aihaoiptmp34_Dao get_aihaoiptmp34Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp34Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP34返回的查询DataRow创建一个AIHAOIPTMP34Entity对象
         * @param AIHAOIPTMP34 row
         * @returnAIHAOIPTMP34List对象
        * @throws Exception 
         */
		public List<aihaoiptmp34_Dao> get_aihaoiptmp34_All() throws Exception{
            return _dal.get_aihaoiptmp34_All();
            }
		    /**
         * 根据AIHAOIPTMP34返回的查询DataRow创建一个AIHAOIPTMP34Entity对象
         * @param AIHAOIPTMP34 row
         * @returnAIHAOIPTMP34List对象
        * @throws Exception 
         */
		public List<aihaoiptmp34_Dao> get_aihaoiptmp34_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp34_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp34_Dao> get_aihaoiptmp34_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp34_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP34返回的查询DataRow创建一个AIHAOIPTMP34Entity对象
         * @param AIHAOIPTMP34 row
         * @returnAIHAOIPTMP34Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp34_Dao> get_aihaoiptmp34_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp34_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP34字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp34_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp34_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP34Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp34_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp34_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP34IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp34_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp34_UpdateString( FieldName, Value, sid);
            }
        
        
    }
