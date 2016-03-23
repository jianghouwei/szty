/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoinstallinfo.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoinstallinfo_Dao;
import com.szty.aihao.core.aihaoinstallinfo_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOINSTALLINFO逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoinstallinfo_service
	{
        public  aihaoinstallinfo_core _dal=classFactory.getaihaoinstallinfo();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOINSTALLINFO实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoinstallinfo (aihaoinstallinfo_Dao _AIHAOINSTALLINFOModel )  throws Exception{
         return _dal.insert_aihaoinstallinfo( _AIHAOINSTALLINFOModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOINSTALLINFOprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoinstallinfo(Object[] _para)  throws Exception{
        return _dal.insert_aihaoinstallinfo( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOINSTALLINFO实体
         * @return 影响的行数
         */
		public int update_aihaoinstallinfo(aihaoinstallinfo_Dao _AIHAOINSTALLINFOModel)  throws Exception{
        return _dal.update_aihaoinstallinfo( _AIHAOINSTALLINFOModel);
		}
	
		

         /**
         *  删除数据表AIHAOINSTALLINFO中的一条记录
         * @param AIHAOINSTALLINFO实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoinstallinfo(int Id)  throws Exception{
        return _dal.delete_aihaoinstallinfo( Id);
		}

		

       
          /**
         * 得到 aihaoinstallinfo 数据实体
         * @param Id">Id
         * @return<aihaoinstallinfo 数据实体
        * @throws Exception 
         */
		public aihaoinstallinfo_Dao get_aihaoinstallinfoDao(int Id) throws Exception{
        return _dal.get_aihaoinstallinfoDao( Id);
		}
		
		    /**
         * 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
         * @param AIHAOINSTALLINFO row
         * @returnAIHAOINSTALLINFOList对象
        * @throws Exception 
         */
		public List<aihaoinstallinfo_Dao> get_aihaoinstallinfo_All() throws Exception{
            return _dal.get_aihaoinstallinfo_All();
            }
		    /**
         * 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
         * @param AIHAOINSTALLINFO row
         * @returnAIHAOINSTALLINFOList对象
        * @throws Exception 
         */
		public List<aihaoinstallinfo_Dao> get_aihaoinstallinfo_All(String strWhere) throws Exception{
            return _dal.get_aihaoinstallinfo_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoinstallinfo_Dao> get_aihaoinstallinfo_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoinstallinfo_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOINSTALLINFO返回的查询DataRow创建一个AIHAOINSTALLINFOEntity对象
         * @param AIHAOINSTALLINFO row
         * @returnAIHAOINSTALLINFODictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoinstallinfo_Dao> get_aihaoinstallinfo_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoinstallinfo_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOINSTALLINFO字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoinstallinfo_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoinstallinfo_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOINSTALLINFOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoinstallinfo_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoinstallinfo_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOINSTALLINFOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoinstallinfo_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoinstallinfo_UpdateString( FieldName, Value, sid);
            }
        
        
    }
