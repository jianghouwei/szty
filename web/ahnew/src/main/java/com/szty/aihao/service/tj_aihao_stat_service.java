/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTj_aihao_stat.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.tj_aihao_stat_Dao;
import com.szty.aihao.core.tj_aihao_stat_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TJ_AIHAO_STAT逻辑层接口
    *@作者：宋春林 
    */

	public class tj_aihao_stat_service
	{
        public  tj_aihao_stat_core _dal=classFactory.gettj_aihao_stat();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT实体
         * @return 新插入记录的编号
         */
		public int insert_tj_aihao_stat (tj_aihao_stat_Dao _TJ_AIHAO_STATModel )  throws Exception{
         return _dal.insert_tj_aihao_stat( _TJ_AIHAO_STATModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STATprrameter
         * @return 新插入记录的编号
         */
         public int insert_tj_aihao_stat(Object[] _para)  throws Exception{
        return _dal.insert_tj_aihao_stat( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TJ_AIHAO_STAT实体
         * @return 影响的行数
         */
		public int update_tj_aihao_stat(tj_aihao_stat_Dao _TJ_AIHAO_STATModel)  throws Exception{
        return _dal.update_tj_aihao_stat( _TJ_AIHAO_STATModel);
		}
	
		

         /**
         *  删除数据表TJ_AIHAO_STAT中的一条记录
         * @param TJ_AIHAO_STAT实体
         * @return 新插入记录的编号
         */
		public int delete_tj_aihao_stat(int Cdate)  throws Exception{
        return _dal.delete_tj_aihao_stat( Cdate);
		}

		

       
          /**
         * 得到 tj_aihao_stat 数据实体
         * @param Cdate">Cdate
         * @return<tj_aihao_stat 数据实体
        * @throws Exception 
         */
		public tj_aihao_stat_Dao get_tj_aihao_statDao(int Cdate) throws Exception{
        return _dal.get_tj_aihao_statDao( Cdate);
		}
		
		    /**
         * 根据TJ_AIHAO_STAT返回的查询DataRow创建一个TJ_AIHAO_STATEntity对象
         * @param TJ_AIHAO_STAT row
         * @returnTJ_AIHAO_STATList对象
        * @throws Exception 
         */
		public List<tj_aihao_stat_Dao> get_tj_aihao_stat_All() throws Exception{
            return _dal.get_tj_aihao_stat_All();
            }
		    /**
         * 根据TJ_AIHAO_STAT返回的查询DataRow创建一个TJ_AIHAO_STATEntity对象
         * @param TJ_AIHAO_STAT row
         * @returnTJ_AIHAO_STATList对象
        * @throws Exception 
         */
		public List<tj_aihao_stat_Dao> get_tj_aihao_stat_All(String strWhere) throws Exception{
            return _dal.get_tj_aihao_stat_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tj_aihao_stat_Dao> get_tj_aihao_stat_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_tj_aihao_stat_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TJ_AIHAO_STAT返回的查询DataRow创建一个TJ_AIHAO_STATEntity对象
         * @param TJ_AIHAO_STAT row
         * @returnTJ_AIHAO_STATDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, tj_aihao_stat_Dao> get_tj_aihao_stat_Dictionary(String strWhere) throws Exception{
            return _dal.get_tj_aihao_stat_Dictionary(strWhere);
            }
		 /**
         * 更新TJ_AIHAO_STAT字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_tj_aihao_stat_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_tj_aihao_stat_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TJ_AIHAO_STATInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_tj_aihao_stat_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_tj_aihao_stat_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TJ_AIHAO_STATIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtj_aihao_stat_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_tj_aihao_stat_UpdateString( FieldName, Value, sid);
            }
        
        
    }
