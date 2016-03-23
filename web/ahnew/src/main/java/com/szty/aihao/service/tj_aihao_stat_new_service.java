/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTj_aihao_stat_new.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.tj_aihao_stat_new_Dao;
import com.szty.aihao.core.tj_aihao_stat_new_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TJ_AIHAO_STAT_NEW逻辑层接口
    *@作者：宋春林 
    */

	public class tj_aihao_stat_new_service
	{
        public  tj_aihao_stat_new_core _dal=classFactory.gettj_aihao_stat_new();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_NEW实体
         * @return 新插入记录的编号
         */
		public int insert_tj_aihao_stat_new (tj_aihao_stat_new_Dao _TJ_AIHAO_STAT_NEWModel )  throws Exception{
         return _dal.insert_tj_aihao_stat_new( _TJ_AIHAO_STAT_NEWModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_NEWprrameter
         * @return 新插入记录的编号
         */
         public int insert_tj_aihao_stat_new(Object[] _para)  throws Exception{
        return _dal.insert_tj_aihao_stat_new( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT_NEW实体
         * @return 影响的行数
         */
		public int update_tj_aihao_stat_new(tj_aihao_stat_new_Dao _TJ_AIHAO_STAT_NEWModel)  throws Exception{
        return _dal.update_tj_aihao_stat_new( _TJ_AIHAO_STAT_NEWModel);
		}
	
		

         /**
         *  删除数据表TJ_AIHAO_STAT_NEW中的一条记录
         * @param TJ_AIHAO_STAT_NEW实体
         * @return 新插入记录的编号
         */
		public int delete_tj_aihao_stat_new(int Cdate)  throws Exception{
        return _dal.delete_tj_aihao_stat_new( Cdate);
		}

		

       
          /**
         * 得到 tj_aihao_stat_new 数据实体
         * @param Cdate">Cdate
         * @return<tj_aihao_stat_new 数据实体
        * @throws Exception 
         */
		public tj_aihao_stat_new_Dao get_tj_aihao_stat_newDao(int Cdate) throws Exception{
        return _dal.get_tj_aihao_stat_newDao( Cdate);
		}
		
		    /**
         * 根据TJ_AIHAO_STAT_NEW返回的查询DataRow创建一个TJ_AIHAO_STAT_NEWEntity对象
         * @param TJ_AIHAO_STAT_NEW row
         * @returnTJ_AIHAO_STAT_NEWList对象
        * @throws Exception 
         */
		public List<tj_aihao_stat_new_Dao> get_tj_aihao_stat_new_All() throws Exception{
            return _dal.get_tj_aihao_stat_new_All();
            }
		    /**
         * 根据TJ_AIHAO_STAT_NEW返回的查询DataRow创建一个TJ_AIHAO_STAT_NEWEntity对象
         * @param TJ_AIHAO_STAT_NEW row
         * @returnTJ_AIHAO_STAT_NEWList对象
        * @throws Exception 
         */
		public List<tj_aihao_stat_new_Dao> get_tj_aihao_stat_new_All(String strWhere) throws Exception{
            return _dal.get_tj_aihao_stat_new_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tj_aihao_stat_new_Dao> get_tj_aihao_stat_new_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_tj_aihao_stat_new_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TJ_AIHAO_STAT_NEW返回的查询DataRow创建一个TJ_AIHAO_STAT_NEWEntity对象
         * @param TJ_AIHAO_STAT_NEW row
         * @returnTJ_AIHAO_STAT_NEWDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, tj_aihao_stat_new_Dao> get_tj_aihao_stat_new_Dictionary(String strWhere) throws Exception{
            return _dal.get_tj_aihao_stat_new_Dictionary(strWhere);
            }
		 /**
         * 更新TJ_AIHAO_STAT_NEW字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_tj_aihao_stat_new_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_tj_aihao_stat_new_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TJ_AIHAO_STAT_NEWInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_tj_aihao_stat_new_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_tj_aihao_stat_new_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TJ_AIHAO_STAT_NEWIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtj_aihao_stat_new_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_tj_aihao_stat_new_UpdateString( FieldName, Value, sid);
            }
        
        
    }
