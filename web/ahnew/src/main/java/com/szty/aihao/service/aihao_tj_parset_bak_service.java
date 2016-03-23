/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao_tj_parset_bak.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao_tj_parset_bak_Dao;
import com.szty.aihao.core.aihao_tj_parset_bak_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO_TJ_PARSET_BAK逻辑层接口
    *@作者：宋春林 
    */

	public class aihao_tj_parset_bak_service
	{
        public  aihao_tj_parset_bak_core _dal=classFactory.getaihao_tj_parset_bak();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_PARSET_BAK实体
         * @return 新插入记录的编号
         */
		public int insert_aihao_tj_parset_bak (aihao_tj_parset_bak_Dao _AIHAO_TJ_PARSET_BAKModel )  throws Exception{
         return _dal.insert_aihao_tj_parset_bak( _AIHAO_TJ_PARSET_BAKModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_PARSET_BAKprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao_tj_parset_bak(Object[] _para)  throws Exception{
        return _dal.insert_aihao_tj_parset_bak( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_PARSET_BAK实体
         * @return 影响的行数
         */
		public int update_aihao_tj_parset_bak(aihao_tj_parset_bak_Dao _AIHAO_TJ_PARSET_BAKModel)  throws Exception{
        return _dal.update_aihao_tj_parset_bak( _AIHAO_TJ_PARSET_BAKModel);
		}
	
		

         /**
         *  删除数据表AIHAO_TJ_PARSET_BAK中的一条记录
         * @param AIHAO_TJ_PARSET_BAK实体
         * @return 新插入记录的编号
         */
		public int delete_aihao_tj_parset_bak(int Logid)  throws Exception{
        return _dal.delete_aihao_tj_parset_bak( Logid);
		}

		

       
          /**
         * 得到 aihao_tj_parset_bak 数据实体
         * @param Logid">Logid
         * @return<aihao_tj_parset_bak 数据实体
        * @throws Exception 
         */
		public aihao_tj_parset_bak_Dao get_aihao_tj_parset_bakDao(int Logid) throws Exception{
        return _dal.get_aihao_tj_parset_bakDao( Logid);
		}
		
		    /**
         * 根据AIHAO_TJ_PARSET_BAK返回的查询DataRow创建一个AIHAO_TJ_PARSET_BAKEntity对象
         * @param AIHAO_TJ_PARSET_BAK row
         * @returnAIHAO_TJ_PARSET_BAKList对象
        * @throws Exception 
         */
		public List<aihao_tj_parset_bak_Dao> get_aihao_tj_parset_bak_All() throws Exception{
            return _dal.get_aihao_tj_parset_bak_All();
            }
		    /**
         * 根据AIHAO_TJ_PARSET_BAK返回的查询DataRow创建一个AIHAO_TJ_PARSET_BAKEntity对象
         * @param AIHAO_TJ_PARSET_BAK row
         * @returnAIHAO_TJ_PARSET_BAKList对象
        * @throws Exception 
         */
		public List<aihao_tj_parset_bak_Dao> get_aihao_tj_parset_bak_All(String strWhere) throws Exception{
            return _dal.get_aihao_tj_parset_bak_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao_tj_parset_bak_Dao> get_aihao_tj_parset_bak_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao_tj_parset_bak_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO_TJ_PARSET_BAK返回的查询DataRow创建一个AIHAO_TJ_PARSET_BAKEntity对象
         * @param AIHAO_TJ_PARSET_BAK row
         * @returnAIHAO_TJ_PARSET_BAKDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao_tj_parset_bak_Dao> get_aihao_tj_parset_bak_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao_tj_parset_bak_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO_TJ_PARSET_BAK字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao_tj_parset_bak_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao_tj_parset_bak_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO_TJ_PARSET_BAKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao_tj_parset_bak_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao_tj_parset_bak_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO_TJ_PARSET_BAKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao_tj_parset_bak_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao_tj_parset_bak_UpdateString( FieldName, Value, sid);
            }
        
        
    }
