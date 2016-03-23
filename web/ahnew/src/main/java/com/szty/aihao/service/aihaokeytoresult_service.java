/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaokeytoresult.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaokeytoresult_Dao;
import com.szty.aihao.core.aihaokeytoresult_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOKEYTORESULT逻辑层接口
    *@作者：宋春林 
    */

	public class aihaokeytoresult_service
	{
        public  aihaokeytoresult_core _dal=classFactory.getaihaokeytoresult();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOKEYTORESULT实体
         * @return 新插入记录的编号
         */
		public int insert_aihaokeytoresult (aihaokeytoresult_Dao _AIHAOKEYTORESULTModel )  throws Exception{
         return _dal.insert_aihaokeytoresult( _AIHAOKEYTORESULTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOKEYTORESULTprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaokeytoresult(Object[] _para)  throws Exception{
        return _dal.insert_aihaokeytoresult( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOKEYTORESULT实体
         * @return 影响的行数
         */
		public int update_aihaokeytoresult(aihaokeytoresult_Dao _AIHAOKEYTORESULTModel)  throws Exception{
        return _dal.update_aihaokeytoresult( _AIHAOKEYTORESULTModel);
		}
	
		

         /**
         *  删除数据表AIHAOKEYTORESULT中的一条记录
         * @param AIHAOKEYTORESULT实体
         * @return 新插入记录的编号
         */
		public int delete_aihaokeytoresult(int Keyid)  throws Exception{
        return _dal.delete_aihaokeytoresult( Keyid);
		}

		

       
          /**
         * 得到 aihaokeytoresult 数据实体
         * @param Keyid">Keyid
         * @return<aihaokeytoresult 数据实体
        * @throws Exception 
         */
		public aihaokeytoresult_Dao get_aihaokeytoresultDao(int Keyid) throws Exception{
        return _dal.get_aihaokeytoresultDao( Keyid);
		}
		
		    /**
         * 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
         * @param AIHAOKEYTORESULT row
         * @returnAIHAOKEYTORESULTList对象
        * @throws Exception 
         */
		public List<aihaokeytoresult_Dao> get_aihaokeytoresult_All() throws Exception{
            return _dal.get_aihaokeytoresult_All();
            }
		    /**
         * 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
         * @param AIHAOKEYTORESULT row
         * @returnAIHAOKEYTORESULTList对象
        * @throws Exception 
         */
		public List<aihaokeytoresult_Dao> get_aihaokeytoresult_All(String strWhere) throws Exception{
            return _dal.get_aihaokeytoresult_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaokeytoresult_Dao> get_aihaokeytoresult_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaokeytoresult_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOKEYTORESULT返回的查询DataRow创建一个AIHAOKEYTORESULTEntity对象
         * @param AIHAOKEYTORESULT row
         * @returnAIHAOKEYTORESULTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaokeytoresult_Dao> get_aihaokeytoresult_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaokeytoresult_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOKEYTORESULT字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaokeytoresult_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaokeytoresult_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOKEYTORESULTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaokeytoresult_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaokeytoresult_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOKEYTORESULTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaokeytoresult_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaokeytoresult_UpdateString( FieldName, Value, sid);
            }
        
        
    }
