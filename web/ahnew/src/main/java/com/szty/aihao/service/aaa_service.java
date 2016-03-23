/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAaa.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aaa_Dao;
import com.szty.aihao.core.aaa_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AAA逻辑层接口
    *@作者：宋春林 
    */

	public class aaa_service
	{
        public  aaa_core _dal=classFactory.getaaa();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AAA实体
         * @return 新插入记录的编号
         */
		public int insert_aaa (aaa_Dao _AAAModel )  throws Exception{
         return _dal.insert_aaa( _AAAModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AAAprrameter
         * @return 新插入记录的编号
         */
         public int insert_aaa(Object[] _para)  throws Exception{
        return _dal.insert_aaa( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AAA实体
         * @return 影响的行数
         */
		public int update_aaa(aaa_Dao _AAAModel)  throws Exception{
        return _dal.update_aaa( _AAAModel);
		}
	
		

         /**
         *  删除数据表AAA中的一条记录
         * @param AAA实体
         * @return 新插入记录的编号
         */
		public int delete_aaa(int Gameid)  throws Exception{
        return _dal.delete_aaa( Gameid);
		}

		

       
          /**
         * 得到 aaa 数据实体
         * @param Gameid">Gameid
         * @return<aaa 数据实体
        * @throws Exception 
         */
		public aaa_Dao get_aaaDao(int Gameid) throws Exception{
        return _dal.get_aaaDao( Gameid);
		}
		
		    /**
         * 根据AAA返回的查询DataRow创建一个AAAEntity对象
         * @param AAA row
         * @returnAAAList对象
        * @throws Exception 
         */
		public List<aaa_Dao> get_aaa_All() throws Exception{
            return _dal.get_aaa_All();
            }
		    /**
         * 根据AAA返回的查询DataRow创建一个AAAEntity对象
         * @param AAA row
         * @returnAAAList对象
        * @throws Exception 
         */
		public List<aaa_Dao> get_aaa_All(String strWhere) throws Exception{
            return _dal.get_aaa_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aaa_Dao> get_aaa_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aaa_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AAA返回的查询DataRow创建一个AAAEntity对象
         * @param AAA row
         * @returnAAADictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aaa_Dao> get_aaa_Dictionary(String strWhere) throws Exception{
            return _dal.get_aaa_Dictionary(strWhere);
            }
		 /**
         * 更新AAA字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aaa_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aaa_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AAAInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aaa_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aaa_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AAAIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaaa_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aaa_UpdateString( FieldName, Value, sid);
            }
        
        
    }
