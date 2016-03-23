/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaochangyonghaoma.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaochangyonghaoma_Dao;
import com.szty.aihao.core.aihaochangyonghaoma_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOCHANGYONGHAOMA逻辑层接口
    *@作者：宋春林 
    */

	public class aihaochangyonghaoma_service
	{
        public  aihaochangyonghaoma_core _dal=classFactory.getaihaochangyonghaoma();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCHANGYONGHAOMA实体
         * @return 新插入记录的编号
         */
		public int insert_aihaochangyonghaoma (aihaochangyonghaoma_Dao _AIHAOCHANGYONGHAOMAModel )  throws Exception{
         return _dal.insert_aihaochangyonghaoma( _AIHAOCHANGYONGHAOMAModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCHANGYONGHAOMAprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaochangyonghaoma(Object[] _para)  throws Exception{
        return _dal.insert_aihaochangyonghaoma( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCHANGYONGHAOMA实体
         * @return 影响的行数
         */
		public int update_aihaochangyonghaoma(aihaochangyonghaoma_Dao _AIHAOCHANGYONGHAOMAModel)  throws Exception{
        return _dal.update_aihaochangyonghaoma( _AIHAOCHANGYONGHAOMAModel);
		}
	
		

         /**
         *  删除数据表AIHAOCHANGYONGHAOMA中的一条记录
         * @param AIHAOCHANGYONGHAOMA实体
         * @return 新插入记录的编号
         */
		public int delete_aihaochangyonghaoma(int Haoid)  throws Exception{
        return _dal.delete_aihaochangyonghaoma( Haoid);
		}

		

       
          /**
         * 得到 aihaochangyonghaoma 数据实体
         * @param Haoid">Haoid
         * @return<aihaochangyonghaoma 数据实体
        * @throws Exception 
         */
		public aihaochangyonghaoma_Dao get_aihaochangyonghaomaDao(int Haoid) throws Exception{
        return _dal.get_aihaochangyonghaomaDao( Haoid);
		}
		
		    /**
         * 根据AIHAOCHANGYONGHAOMA返回的查询DataRow创建一个AIHAOCHANGYONGHAOMAEntity对象
         * @param AIHAOCHANGYONGHAOMA row
         * @returnAIHAOCHANGYONGHAOMAList对象
        * @throws Exception 
         */
		public List<aihaochangyonghaoma_Dao> get_aihaochangyonghaoma_All() throws Exception{
            return _dal.get_aihaochangyonghaoma_All();
            }
		    /**
         * 根据AIHAOCHANGYONGHAOMA返回的查询DataRow创建一个AIHAOCHANGYONGHAOMAEntity对象
         * @param AIHAOCHANGYONGHAOMA row
         * @returnAIHAOCHANGYONGHAOMAList对象
        * @throws Exception 
         */
		public List<aihaochangyonghaoma_Dao> get_aihaochangyonghaoma_All(String strWhere) throws Exception{
            return _dal.get_aihaochangyonghaoma_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaochangyonghaoma_Dao> get_aihaochangyonghaoma_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaochangyonghaoma_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOCHANGYONGHAOMA返回的查询DataRow创建一个AIHAOCHANGYONGHAOMAEntity对象
         * @param AIHAOCHANGYONGHAOMA row
         * @returnAIHAOCHANGYONGHAOMADictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaochangyonghaoma_Dao> get_aihaochangyonghaoma_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaochangyonghaoma_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOCHANGYONGHAOMA字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaochangyonghaoma_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaochangyonghaoma_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOCHANGYONGHAOMAInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaochangyonghaoma_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaochangyonghaoma_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOCHANGYONGHAOMAIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaochangyonghaoma_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaochangyonghaoma_UpdateString( FieldName, Value, sid);
            }
        
        
    }
