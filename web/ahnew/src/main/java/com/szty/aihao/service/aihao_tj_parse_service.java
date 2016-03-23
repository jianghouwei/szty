/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao_tj_parse.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao_tj_parse_Dao;
import com.szty.aihao.core.aihao_tj_parse_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO_TJ_PARSE逻辑层接口
    *@作者：宋春林 
    */

	public class aihao_tj_parse_service
	{
        public  aihao_tj_parse_core _dal=classFactory.getaihao_tj_parse();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_PARSE实体
         * @return 新插入记录的编号
         */
		public int insert_aihao_tj_parse (aihao_tj_parse_Dao _AIHAO_TJ_PARSEModel )  throws Exception{
         return _dal.insert_aihao_tj_parse( _AIHAO_TJ_PARSEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_PARSEprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao_tj_parse(Object[] _para)  throws Exception{
        return _dal.insert_aihao_tj_parse( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_TJ_PARSE实体
         * @return 影响的行数
         */
		public int update_aihao_tj_parse(aihao_tj_parse_Dao _AIHAO_TJ_PARSEModel)  throws Exception{
        return _dal.update_aihao_tj_parse( _AIHAO_TJ_PARSEModel);
		}
	
		

         /**
         *  删除数据表AIHAO_TJ_PARSE中的一条记录
         * @param AIHAO_TJ_PARSE实体
         * @return 新插入记录的编号
         */
		public int delete_aihao_tj_parse(int Logid)  throws Exception{
        return _dal.delete_aihao_tj_parse( Logid);
		}

		

       
          /**
         * 得到 aihao_tj_parse 数据实体
         * @param Logid">Logid
         * @return<aihao_tj_parse 数据实体
        * @throws Exception 
         */
		public aihao_tj_parse_Dao get_aihao_tj_parseDao(int Logid) throws Exception{
        return _dal.get_aihao_tj_parseDao( Logid);
		}
		
		    /**
         * 根据AIHAO_TJ_PARSE返回的查询DataRow创建一个AIHAO_TJ_PARSEEntity对象
         * @param AIHAO_TJ_PARSE row
         * @returnAIHAO_TJ_PARSEList对象
        * @throws Exception 
         */
		public List<aihao_tj_parse_Dao> get_aihao_tj_parse_All() throws Exception{
            return _dal.get_aihao_tj_parse_All();
            }
		    /**
         * 根据AIHAO_TJ_PARSE返回的查询DataRow创建一个AIHAO_TJ_PARSEEntity对象
         * @param AIHAO_TJ_PARSE row
         * @returnAIHAO_TJ_PARSEList对象
        * @throws Exception 
         */
		public List<aihao_tj_parse_Dao> get_aihao_tj_parse_All(String strWhere) throws Exception{
            return _dal.get_aihao_tj_parse_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao_tj_parse_Dao> get_aihao_tj_parse_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao_tj_parse_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO_TJ_PARSE返回的查询DataRow创建一个AIHAO_TJ_PARSEEntity对象
         * @param AIHAO_TJ_PARSE row
         * @returnAIHAO_TJ_PARSEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao_tj_parse_Dao> get_aihao_tj_parse_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao_tj_parse_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO_TJ_PARSE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao_tj_parse_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao_tj_parse_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO_TJ_PARSEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao_tj_parse_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao_tj_parse_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO_TJ_PARSEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao_tj_parse_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao_tj_parse_UpdateString( FieldName, Value, sid);
            }
        
        
    }
