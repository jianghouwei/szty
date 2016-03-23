/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoandroidpush.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoandroidpush_Dao;
import com.szty.aihao.core.aihaoandroidpush_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOANDROIDPUSH逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoandroidpush_service
	{
        public  aihaoandroidpush_core _dal=classFactory.getaihaoandroidpush();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOANDROIDPUSH实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoandroidpush (aihaoandroidpush_Dao _AIHAOANDROIDPUSHModel )  throws Exception{
         return _dal.insert_aihaoandroidpush( _AIHAOANDROIDPUSHModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOANDROIDPUSHprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoandroidpush(Object[] _para)  throws Exception{
        return _dal.insert_aihaoandroidpush( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOANDROIDPUSH实体
         * @return 影响的行数
         */
		public int update_aihaoandroidpush(aihaoandroidpush_Dao _AIHAOANDROIDPUSHModel)  throws Exception{
        return _dal.update_aihaoandroidpush( _AIHAOANDROIDPUSHModel);
		}
	
		

         /**
         *  删除数据表AIHAOANDROIDPUSH中的一条记录
         * @param AIHAOANDROIDPUSH实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoandroidpush(int Imsi)  throws Exception{
        return _dal.delete_aihaoandroidpush( Imsi);
		}

		

       
          /**
         * 得到 aihaoandroidpush 数据实体
         * @param Imsi">Imsi
         * @return<aihaoandroidpush 数据实体
        * @throws Exception 
         */
		public aihaoandroidpush_Dao get_aihaoandroidpushDao(int Imsi) throws Exception{
        return _dal.get_aihaoandroidpushDao( Imsi);
		}
		
		    /**
         * 根据AIHAOANDROIDPUSH返回的查询DataRow创建一个AIHAOANDROIDPUSHEntity对象
         * @param AIHAOANDROIDPUSH row
         * @returnAIHAOANDROIDPUSHList对象
        * @throws Exception 
         */
		public List<aihaoandroidpush_Dao> get_aihaoandroidpush_All() throws Exception{
            return _dal.get_aihaoandroidpush_All();
            }
		    /**
         * 根据AIHAOANDROIDPUSH返回的查询DataRow创建一个AIHAOANDROIDPUSHEntity对象
         * @param AIHAOANDROIDPUSH row
         * @returnAIHAOANDROIDPUSHList对象
        * @throws Exception 
         */
		public List<aihaoandroidpush_Dao> get_aihaoandroidpush_All(String strWhere) throws Exception{
            return _dal.get_aihaoandroidpush_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoandroidpush_Dao> get_aihaoandroidpush_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoandroidpush_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOANDROIDPUSH返回的查询DataRow创建一个AIHAOANDROIDPUSHEntity对象
         * @param AIHAOANDROIDPUSH row
         * @returnAIHAOANDROIDPUSHDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoandroidpush_Dao> get_aihaoandroidpush_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoandroidpush_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOANDROIDPUSH字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoandroidpush_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoandroidpush_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOANDROIDPUSHInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoandroidpush_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoandroidpush_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOANDROIDPUSHIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoandroidpush_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoandroidpush_UpdateString( FieldName, Value, sid);
            }
        
        
    }
