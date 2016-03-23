/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTemp_aaa.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.temp_aaa_Dao;
import com.szty.aihao.core.temp_aaa_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEMP_AAA逻辑层接口
    *@作者：宋春林 
    */

	public class temp_aaa_service
	{
        public  temp_aaa_core _dal=classFactory.gettemp_aaa();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEMP_AAA实体
         * @return 新插入记录的编号
         */
		public int insert_temp_aaa (temp_aaa_Dao _TEMP_AAAModel )  throws Exception{
         return _dal.insert_temp_aaa( _TEMP_AAAModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEMP_AAAprrameter
         * @return 新插入记录的编号
         */
         public int insert_temp_aaa(Object[] _para)  throws Exception{
        return _dal.insert_temp_aaa( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TEMP_AAA实体
         * @return 影响的行数
         */
		public int update_temp_aaa(temp_aaa_Dao _TEMP_AAAModel)  throws Exception{
        return _dal.update_temp_aaa( _TEMP_AAAModel);
		}
	
		

         /**
         *  删除数据表TEMP_AAA中的一条记录
         * @param TEMP_AAA实体
         * @return 新插入记录的编号
         */
		public int delete_temp_aaa(int Prefix)  throws Exception{
        return _dal.delete_temp_aaa( Prefix);
		}

		

       
          /**
         * 得到 temp_aaa 数据实体
         * @param Prefix">Prefix
         * @return<temp_aaa 数据实体
        * @throws Exception 
         */
		public temp_aaa_Dao get_temp_aaaDao(int Prefix) throws Exception{
        return _dal.get_temp_aaaDao( Prefix);
		}
		
		    /**
         * 根据TEMP_AAA返回的查询DataRow创建一个TEMP_AAAEntity对象
         * @param TEMP_AAA row
         * @returnTEMP_AAAList对象
        * @throws Exception 
         */
		public List<temp_aaa_Dao> get_temp_aaa_All() throws Exception{
            return _dal.get_temp_aaa_All();
            }
		    /**
         * 根据TEMP_AAA返回的查询DataRow创建一个TEMP_AAAEntity对象
         * @param TEMP_AAA row
         * @returnTEMP_AAAList对象
        * @throws Exception 
         */
		public List<temp_aaa_Dao> get_temp_aaa_All(String strWhere) throws Exception{
            return _dal.get_temp_aaa_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<temp_aaa_Dao> get_temp_aaa_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_temp_aaa_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TEMP_AAA返回的查询DataRow创建一个TEMP_AAAEntity对象
         * @param TEMP_AAA row
         * @returnTEMP_AAADictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, temp_aaa_Dao> get_temp_aaa_Dictionary(String strWhere) throws Exception{
            return _dal.get_temp_aaa_Dictionary(strWhere);
            }
		 /**
         * 更新TEMP_AAA字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_temp_aaa_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_temp_aaa_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TEMP_AAAInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_temp_aaa_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_temp_aaa_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TEMP_AAAIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtemp_aaa_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_temp_aaa_UpdateString( FieldName, Value, sid);
            }
        
        
    }
