/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_menber_exprvalue_detail.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.t_menber_exprvalue_detail_Dao;
import com.szty.aihao.core.t_menber_exprvalue_detail_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_MENBER_EXPRVALUE_DETAIL逻辑层接口
    *@作者：宋春林 
    */

	public class t_menber_exprvalue_detail_service
	{
        public  t_menber_exprvalue_detail_core _dal=classFactory.gett_menber_exprvalue_detail();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_MENBER_EXPRVALUE_DETAIL实体
         * @return 新插入记录的编号
         */
		public int insert_t_menber_exprvalue_detail (t_menber_exprvalue_detail_Dao _T_MENBER_EXPRVALUE_DETAILModel )  throws Exception{
         return _dal.insert_t_menber_exprvalue_detail( _T_MENBER_EXPRVALUE_DETAILModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_MENBER_EXPRVALUE_DETAILprrameter
         * @return 新插入记录的编号
         */
         public int insert_t_menber_exprvalue_detail(Object[] _para)  throws Exception{
        return _dal.insert_t_menber_exprvalue_detail( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param T_MENBER_EXPRVALUE_DETAIL实体
         * @return 影响的行数
         */
		public int update_t_menber_exprvalue_detail(t_menber_exprvalue_detail_Dao _T_MENBER_EXPRVALUE_DETAILModel)  throws Exception{
        return _dal.update_t_menber_exprvalue_detail( _T_MENBER_EXPRVALUE_DETAILModel);
		}
	
		

         /**
         *  删除数据表T_MENBER_EXPRVALUE_DETAIL中的一条记录
         * @param T_MENBER_EXPRVALUE_DETAIL实体
         * @return 新插入记录的编号
         */
		public int delete_t_menber_exprvalue_detail(int Uniquevalue)  throws Exception{
        return _dal.delete_t_menber_exprvalue_detail( Uniquevalue);
		}

		

       
          /**
         * 得到 t_menber_exprvalue_detail 数据实体
         * @param Uniquevalue">Uniquevalue
         * @return<t_menber_exprvalue_detail 数据实体
        * @throws Exception 
         */
		public t_menber_exprvalue_detail_Dao get_t_menber_exprvalue_detailDao(int Uniquevalue) throws Exception{
        return _dal.get_t_menber_exprvalue_detailDao( Uniquevalue);
		}
		
		    /**
         * 根据T_MENBER_EXPRVALUE_DETAIL返回的查询DataRow创建一个T_MENBER_EXPRVALUE_DETAILEntity对象
         * @param T_MENBER_EXPRVALUE_DETAIL row
         * @returnT_MENBER_EXPRVALUE_DETAILList对象
        * @throws Exception 
         */
		public List<t_menber_exprvalue_detail_Dao> get_t_menber_exprvalue_detail_All() throws Exception{
            return _dal.get_t_menber_exprvalue_detail_All();
            }
		    /**
         * 根据T_MENBER_EXPRVALUE_DETAIL返回的查询DataRow创建一个T_MENBER_EXPRVALUE_DETAILEntity对象
         * @param T_MENBER_EXPRVALUE_DETAIL row
         * @returnT_MENBER_EXPRVALUE_DETAILList对象
        * @throws Exception 
         */
		public List<t_menber_exprvalue_detail_Dao> get_t_menber_exprvalue_detail_All(String strWhere) throws Exception{
            return _dal.get_t_menber_exprvalue_detail_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_menber_exprvalue_detail_Dao> get_t_menber_exprvalue_detail_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_t_menber_exprvalue_detail_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据T_MENBER_EXPRVALUE_DETAIL返回的查询DataRow创建一个T_MENBER_EXPRVALUE_DETAILEntity对象
         * @param T_MENBER_EXPRVALUE_DETAIL row
         * @returnT_MENBER_EXPRVALUE_DETAILDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, t_menber_exprvalue_detail_Dao> get_t_menber_exprvalue_detail_Dictionary(String strWhere) throws Exception{
            return _dal.get_t_menber_exprvalue_detail_Dictionary(strWhere);
            }
		 /**
         * 更新T_MENBER_EXPRVALUE_DETAIL字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_t_menber_exprvalue_detail_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_t_menber_exprvalue_detail_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新T_MENBER_EXPRVALUE_DETAILInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_t_menber_exprvalue_detail_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_t_menber_exprvalue_detail_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新T_MENBER_EXPRVALUE_DETAILIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createt_menber_exprvalue_detail_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_t_menber_exprvalue_detail_UpdateString( FieldName, Value, sid);
            }
        
        
    }
