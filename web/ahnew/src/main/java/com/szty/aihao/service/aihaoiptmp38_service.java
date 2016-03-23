/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp38.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp38_Dao;
import com.szty.aihao.core.aihaoiptmp38_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP38逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp38_service
	{
        public  aihaoiptmp38_core _dal=classFactory.getaihaoiptmp38();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP38实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp38 (aihaoiptmp38_Dao _AIHAOIPTMP38Model )  throws Exception{
         return _dal.insert_aihaoiptmp38( _AIHAOIPTMP38Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP38prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp38(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp38( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP38实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp38(aihaoiptmp38_Dao _AIHAOIPTMP38Model)  throws Exception{
        return _dal.update_aihaoiptmp38( _AIHAOIPTMP38Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP38中的一条记录
         * @param AIHAOIPTMP38实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp38(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp38( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp38 数据实体
         * @param Id">Id
         * @return<aihaoiptmp38 数据实体
        * @throws Exception 
         */
		public aihaoiptmp38_Dao get_aihaoiptmp38Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp38Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP38返回的查询DataRow创建一个AIHAOIPTMP38Entity对象
         * @param AIHAOIPTMP38 row
         * @returnAIHAOIPTMP38List对象
        * @throws Exception 
         */
		public List<aihaoiptmp38_Dao> get_aihaoiptmp38_All() throws Exception{
            return _dal.get_aihaoiptmp38_All();
            }
		    /**
         * 根据AIHAOIPTMP38返回的查询DataRow创建一个AIHAOIPTMP38Entity对象
         * @param AIHAOIPTMP38 row
         * @returnAIHAOIPTMP38List对象
        * @throws Exception 
         */
		public List<aihaoiptmp38_Dao> get_aihaoiptmp38_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp38_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp38_Dao> get_aihaoiptmp38_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp38_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP38返回的查询DataRow创建一个AIHAOIPTMP38Entity对象
         * @param AIHAOIPTMP38 row
         * @returnAIHAOIPTMP38Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp38_Dao> get_aihaoiptmp38_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp38_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP38字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp38_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp38_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP38Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp38_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp38_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP38IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp38_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp38_UpdateString( FieldName, Value, sid);
            }
        
        
    }
