/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaosetup.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaosetup_Dao;
import com.szty.aihao.core.aihaosetup_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOSETUP逻辑层接口
    *@作者：宋春林 
    */

	public class aihaosetup_service
	{
        public  aihaosetup_core _dal=classFactory.getaihaosetup();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSETUP实体
         * @return 新插入记录的编号
         */
		public int insert_aihaosetup (aihaosetup_Dao _AIHAOSETUPModel )  throws Exception{
         return _dal.insert_aihaosetup( _AIHAOSETUPModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSETUPprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaosetup(Object[] _para)  throws Exception{
        return _dal.insert_aihaosetup( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOSETUP实体
         * @return 影响的行数
         */
		public int update_aihaosetup(aihaosetup_Dao _AIHAOSETUPModel)  throws Exception{
        return _dal.update_aihaosetup( _AIHAOSETUPModel);
		}
	
		

         /**
         *  删除数据表AIHAOSETUP中的一条记录
         * @param AIHAOSETUP实体
         * @return 新插入记录的编号
         */
		public int delete_aihaosetup(int Setupid)  throws Exception{
        return _dal.delete_aihaosetup( Setupid);
		}

		

       
          /**
         * 得到 aihaosetup 数据实体
         * @param Setupid">Setupid
         * @return<aihaosetup 数据实体
        * @throws Exception 
         */
		public aihaosetup_Dao get_aihaosetupDao(int Setupid) throws Exception{
        return _dal.get_aihaosetupDao( Setupid);
		}
		
		    /**
         * 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
         * @param AIHAOSETUP row
         * @returnAIHAOSETUPList对象
        * @throws Exception 
         */
		public List<aihaosetup_Dao> get_aihaosetup_All() throws Exception{
            return _dal.get_aihaosetup_All();
            }
		    /**
         * 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
         * @param AIHAOSETUP row
         * @returnAIHAOSETUPList对象
        * @throws Exception 
         */
		public List<aihaosetup_Dao> get_aihaosetup_All(String strWhere) throws Exception{
            return _dal.get_aihaosetup_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaosetup_Dao> get_aihaosetup_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaosetup_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOSETUP返回的查询DataRow创建一个AIHAOSETUPEntity对象
         * @param AIHAOSETUP row
         * @returnAIHAOSETUPDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaosetup_Dao> get_aihaosetup_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaosetup_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOSETUP字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaosetup_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaosetup_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOSETUPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaosetup_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaosetup_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOSETUPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaosetup_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaosetup_UpdateString( FieldName, Value, sid);
            }
        
        
    }
