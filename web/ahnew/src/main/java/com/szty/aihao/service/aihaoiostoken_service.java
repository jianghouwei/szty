/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiostoken.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiostoken_Dao;
import com.szty.aihao.core.aihaoiostoken_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIOSTOKEN逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiostoken_service
	{
        public  aihaoiostoken_core _dal=classFactory.getaihaoiostoken();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIOSTOKEN实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiostoken (aihaoiostoken_Dao _AIHAOIOSTOKENModel )  throws Exception{
         return _dal.insert_aihaoiostoken( _AIHAOIOSTOKENModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIOSTOKENprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiostoken(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiostoken( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIOSTOKEN实体
         * @return 影响的行数
         */
		public int update_aihaoiostoken(aihaoiostoken_Dao _AIHAOIOSTOKENModel)  throws Exception{
        return _dal.update_aihaoiostoken( _AIHAOIOSTOKENModel);
		}
	
		

         /**
         *  删除数据表AIHAOIOSTOKEN中的一条记录
         * @param AIHAOIOSTOKEN实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiostoken(int Productid)  throws Exception{
        return _dal.delete_aihaoiostoken( Productid);
		}

		

       
          /**
         * 得到 aihaoiostoken 数据实体
         * @param Productid">Productid
         * @return<aihaoiostoken 数据实体
        * @throws Exception 
         */
		public aihaoiostoken_Dao get_aihaoiostokenDao(int Productid) throws Exception{
        return _dal.get_aihaoiostokenDao( Productid);
		}
		
		    /**
         * 根据AIHAOIOSTOKEN返回的查询DataRow创建一个AIHAOIOSTOKENEntity对象
         * @param AIHAOIOSTOKEN row
         * @returnAIHAOIOSTOKENList对象
        * @throws Exception 
         */
		public List<aihaoiostoken_Dao> get_aihaoiostoken_All() throws Exception{
            return _dal.get_aihaoiostoken_All();
            }
		    /**
         * 根据AIHAOIOSTOKEN返回的查询DataRow创建一个AIHAOIOSTOKENEntity对象
         * @param AIHAOIOSTOKEN row
         * @returnAIHAOIOSTOKENList对象
        * @throws Exception 
         */
		public List<aihaoiostoken_Dao> get_aihaoiostoken_All(String strWhere) throws Exception{
            return _dal.get_aihaoiostoken_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiostoken_Dao> get_aihaoiostoken_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiostoken_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIOSTOKEN返回的查询DataRow创建一个AIHAOIOSTOKENEntity对象
         * @param AIHAOIOSTOKEN row
         * @returnAIHAOIOSTOKENDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiostoken_Dao> get_aihaoiostoken_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiostoken_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIOSTOKEN字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiostoken_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiostoken_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIOSTOKENInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiostoken_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiostoken_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIOSTOKENIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiostoken_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiostoken_UpdateString( FieldName, Value, sid);
            }
        
        
    }
