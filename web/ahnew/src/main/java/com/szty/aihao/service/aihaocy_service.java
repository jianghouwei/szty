/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaocy.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaocy_Dao;
import com.szty.aihao.core.aihaocy_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOCY逻辑层接口
    *@作者：宋春林 
    */

	public class aihaocy_service
	{
        public  aihaocy_core _dal=classFactory.getaihaocy();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCY实体
         * @return 新插入记录的编号
         */
		public int insert_aihaocy (aihaocy_Dao _AIHAOCYModel )  throws Exception{
         return _dal.insert_aihaocy( _AIHAOCYModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCYprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaocy(Object[] _para)  throws Exception{
        return _dal.insert_aihaocy( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCY实体
         * @return 影响的行数
         */
		public int update_aihaocy(aihaocy_Dao _AIHAOCYModel)  throws Exception{
        return _dal.update_aihaocy( _AIHAOCYModel);
		}
	
		

         /**
         *  删除数据表AIHAOCY中的一条记录
         * @param AIHAOCY实体
         * @return 新插入记录的编号
         */
		public int delete_aihaocy(int Haoid)  throws Exception{
        return _dal.delete_aihaocy( Haoid);
		}

		

       
          /**
         * 得到 aihaocy 数据实体
         * @param Haoid">Haoid
         * @return<aihaocy 数据实体
        * @throws Exception 
         */
		public aihaocy_Dao get_aihaocyDao(int Haoid) throws Exception{
        return _dal.get_aihaocyDao( Haoid);
		}
		
		    /**
         * 根据AIHAOCY返回的查询DataRow创建一个AIHAOCYEntity对象
         * @param AIHAOCY row
         * @returnAIHAOCYList对象
        * @throws Exception 
         */
		public List<aihaocy_Dao> get_aihaocy_All() throws Exception{
            return _dal.get_aihaocy_All();
            }
		    /**
         * 根据AIHAOCY返回的查询DataRow创建一个AIHAOCYEntity对象
         * @param AIHAOCY row
         * @returnAIHAOCYList对象
        * @throws Exception 
         */
		public List<aihaocy_Dao> get_aihaocy_All(String strWhere) throws Exception{
            return _dal.get_aihaocy_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaocy_Dao> get_aihaocy_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaocy_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOCY返回的查询DataRow创建一个AIHAOCYEntity对象
         * @param AIHAOCY row
         * @returnAIHAOCYDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaocy_Dao> get_aihaocy_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaocy_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOCY字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaocy_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaocy_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOCYInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaocy_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaocy_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOCYIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaocy_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaocy_UpdateString( FieldName, Value, sid);
            }
        
        
    }
