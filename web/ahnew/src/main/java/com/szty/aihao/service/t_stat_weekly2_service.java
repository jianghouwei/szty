/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_stat_weekly2.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.t_stat_weekly2_Dao;
import com.szty.aihao.core.t_stat_weekly2_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_STAT_WEEKLY2逻辑层接口
    *@作者：宋春林 
    */

	public class t_stat_weekly2_service
	{
        public  t_stat_weekly2_core _dal=classFactory.gett_stat_weekly2();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_STAT_WEEKLY2实体
         * @return 新插入记录的编号
         */
		public int insert_t_stat_weekly2 (t_stat_weekly2_Dao _T_STAT_WEEKLY2Model )  throws Exception{
         return _dal.insert_t_stat_weekly2( _T_STAT_WEEKLY2Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_STAT_WEEKLY2prrameter
         * @return 新插入记录的编号
         */
         public int insert_t_stat_weekly2(Object[] _para)  throws Exception{
        return _dal.insert_t_stat_weekly2( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param T_STAT_WEEKLY2实体
         * @return 影响的行数
         */
		public int update_t_stat_weekly2(t_stat_weekly2_Dao _T_STAT_WEEKLY2Model)  throws Exception{
        return _dal.update_t_stat_weekly2( _T_STAT_WEEKLY2Model);
		}
	
		

         /**
         *  删除数据表T_STAT_WEEKLY2中的一条记录
         * @param T_STAT_WEEKLY2实体
         * @return 新插入记录的编号
         */
		public int delete_t_stat_weekly2(int Item)  throws Exception{
        return _dal.delete_t_stat_weekly2( Item);
		}

		

       
          /**
         * 得到 t_stat_weekly2 数据实体
         * @param Item">Item
         * @return<t_stat_weekly2 数据实体
        * @throws Exception 
         */
		public t_stat_weekly2_Dao get_t_stat_weekly2Dao(int Item) throws Exception{
        return _dal.get_t_stat_weekly2Dao( Item);
		}
		
		    /**
         * 根据T_STAT_WEEKLY2返回的查询DataRow创建一个T_STAT_WEEKLY2Entity对象
         * @param T_STAT_WEEKLY2 row
         * @returnT_STAT_WEEKLY2List对象
        * @throws Exception 
         */
		public List<t_stat_weekly2_Dao> get_t_stat_weekly2_All() throws Exception{
            return _dal.get_t_stat_weekly2_All();
            }
		    /**
         * 根据T_STAT_WEEKLY2返回的查询DataRow创建一个T_STAT_WEEKLY2Entity对象
         * @param T_STAT_WEEKLY2 row
         * @returnT_STAT_WEEKLY2List对象
        * @throws Exception 
         */
		public List<t_stat_weekly2_Dao> get_t_stat_weekly2_All(String strWhere) throws Exception{
            return _dal.get_t_stat_weekly2_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_stat_weekly2_Dao> get_t_stat_weekly2_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_t_stat_weekly2_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据T_STAT_WEEKLY2返回的查询DataRow创建一个T_STAT_WEEKLY2Entity对象
         * @param T_STAT_WEEKLY2 row
         * @returnT_STAT_WEEKLY2Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, t_stat_weekly2_Dao> get_t_stat_weekly2_Dictionary(String strWhere) throws Exception{
            return _dal.get_t_stat_weekly2_Dictionary(strWhere);
            }
		 /**
         * 更新T_STAT_WEEKLY2字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_t_stat_weekly2_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_t_stat_weekly2_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新T_STAT_WEEKLY2Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_t_stat_weekly2_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_t_stat_weekly2_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新T_STAT_WEEKLY2IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createt_stat_weekly2_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_t_stat_weekly2_UpdateString( FieldName, Value, sid);
            }
        
        
    }
