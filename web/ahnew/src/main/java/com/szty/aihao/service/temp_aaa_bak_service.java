/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTemp_aaa_bak.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.temp_aaa_bak_Dao;
import com.szty.aihao.core.temp_aaa_bak_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEMP_AAA_BAK逻辑层接口
    *@作者：宋春林 
    */

	public class temp_aaa_bak_service
	{
        public  temp_aaa_bak_core _dal=classFactory.gettemp_aaa_bak();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEMP_AAA_BAK实体
         * @return 新插入记录的编号
         */
		public int insert_temp_aaa_bak (temp_aaa_bak_Dao _TEMP_AAA_BAKModel )  throws Exception{
         return _dal.insert_temp_aaa_bak( _TEMP_AAA_BAKModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEMP_AAA_BAKprrameter
         * @return 新插入记录的编号
         */
         public int insert_temp_aaa_bak(Object[] _para)  throws Exception{
        return _dal.insert_temp_aaa_bak( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TEMP_AAA_BAK实体
         * @return 影响的行数
         */
		public int update_temp_aaa_bak(temp_aaa_bak_Dao _TEMP_AAA_BAKModel)  throws Exception{
        return _dal.update_temp_aaa_bak( _TEMP_AAA_BAKModel);
		}
	
		

         /**
         *  删除数据表TEMP_AAA_BAK中的一条记录
         * @param TEMP_AAA_BAK实体
         * @return 新插入记录的编号
         */
		public int delete_temp_aaa_bak(int Prefix)  throws Exception{
        return _dal.delete_temp_aaa_bak( Prefix);
		}

		

       
          /**
         * 得到 temp_aaa_bak 数据实体
         * @param Prefix">Prefix
         * @return<temp_aaa_bak 数据实体
        * @throws Exception 
         */
		public temp_aaa_bak_Dao get_temp_aaa_bakDao(int Prefix) throws Exception{
        return _dal.get_temp_aaa_bakDao( Prefix);
		}
		
		    /**
         * 根据TEMP_AAA_BAK返回的查询DataRow创建一个TEMP_AAA_BAKEntity对象
         * @param TEMP_AAA_BAK row
         * @returnTEMP_AAA_BAKList对象
        * @throws Exception 
         */
		public List<temp_aaa_bak_Dao> get_temp_aaa_bak_All() throws Exception{
            return _dal.get_temp_aaa_bak_All();
            }
		    /**
         * 根据TEMP_AAA_BAK返回的查询DataRow创建一个TEMP_AAA_BAKEntity对象
         * @param TEMP_AAA_BAK row
         * @returnTEMP_AAA_BAKList对象
        * @throws Exception 
         */
		public List<temp_aaa_bak_Dao> get_temp_aaa_bak_All(String strWhere) throws Exception{
            return _dal.get_temp_aaa_bak_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<temp_aaa_bak_Dao> get_temp_aaa_bak_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_temp_aaa_bak_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TEMP_AAA_BAK返回的查询DataRow创建一个TEMP_AAA_BAKEntity对象
         * @param TEMP_AAA_BAK row
         * @returnTEMP_AAA_BAKDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, temp_aaa_bak_Dao> get_temp_aaa_bak_Dictionary(String strWhere) throws Exception{
            return _dal.get_temp_aaa_bak_Dictionary(strWhere);
            }
		 /**
         * 更新TEMP_AAA_BAK字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_temp_aaa_bak_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_temp_aaa_bak_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TEMP_AAA_BAKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_temp_aaa_bak_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_temp_aaa_bak_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TEMP_AAA_BAKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtemp_aaa_bak_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_temp_aaa_bak_UpdateString( FieldName, Value, sid);
            }
        
        
    }
