/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGuanjian.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.guanjian_Dao;
import com.szty.aihao.core.guanjian_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GUANJIAN逻辑层接口
    *@作者：宋春林 
    */

	public class guanjian_service
	{
        public  guanjian_core _dal=classFactory.getguanjian();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param GUANJIAN实体
         * @return 新插入记录的编号
         */
		public int insert_guanjian (guanjian_Dao _GUANJIANModel )  throws Exception{
         return _dal.insert_guanjian( _GUANJIANModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param GUANJIANprrameter
         * @return 新插入记录的编号
         */
         public int insert_guanjian(Object[] _para)  throws Exception{
        return _dal.insert_guanjian( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param GUANJIAN实体
         * @return 影响的行数
         */
		public int update_guanjian(guanjian_Dao _GUANJIANModel)  throws Exception{
        return _dal.update_guanjian( _GUANJIANModel);
		}
	
		

         /**
         *  删除数据表GUANJIAN中的一条记录
         * @param GUANJIAN实体
         * @return 新插入记录的编号
         */
		public int delete_guanjian(int Gjname)  throws Exception{
        return _dal.delete_guanjian( Gjname);
		}

		

       
          /**
         * 得到 guanjian 数据实体
         * @param Gjname">Gjname
         * @return<guanjian 数据实体
        * @throws Exception 
         */
		public guanjian_Dao get_guanjianDao(int Gjname) throws Exception{
        return _dal.get_guanjianDao( Gjname);
		}
		
		    /**
         * 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
         * @param GUANJIAN row
         * @returnGUANJIANList对象
        * @throws Exception 
         */
		public List<guanjian_Dao> get_guanjian_All() throws Exception{
            return _dal.get_guanjian_All();
            }
		    /**
         * 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
         * @param GUANJIAN row
         * @returnGUANJIANList对象
        * @throws Exception 
         */
		public List<guanjian_Dao> get_guanjian_All(String strWhere) throws Exception{
            return _dal.get_guanjian_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<guanjian_Dao> get_guanjian_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_guanjian_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
         * @param GUANJIAN row
         * @returnGUANJIANDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, guanjian_Dao> get_guanjian_Dictionary(String strWhere) throws Exception{
            return _dal.get_guanjian_Dictionary(strWhere);
            }
		 /**
         * 更新GUANJIAN字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_guanjian_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_guanjian_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新GUANJIANInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_guanjian_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_guanjian_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新GUANJIANIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createguanjian_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_guanjian_UpdateString( FieldName, Value, sid);
            }
        
        
    }
