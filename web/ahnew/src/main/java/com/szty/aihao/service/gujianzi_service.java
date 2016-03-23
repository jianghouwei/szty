/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGujianzi.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.gujianzi_Dao;
import com.szty.aihao.core.gujianzi_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GUJIANZI逻辑层接口
    *@作者：宋春林 
    */

	public class gujianzi_service
	{
        public  gujianzi_core _dal=classFactory.getgujianzi();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param GUJIANZI实体
         * @return 新插入记录的编号
         */
		public int insert_gujianzi (gujianzi_Dao _GUJIANZIModel )  throws Exception{
         return _dal.insert_gujianzi( _GUJIANZIModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param GUJIANZIprrameter
         * @return 新插入记录的编号
         */
         public int insert_gujianzi(Object[] _para)  throws Exception{
        return _dal.insert_gujianzi( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param GUJIANZI实体
         * @return 影响的行数
         */
		public int update_gujianzi(gujianzi_Dao _GUJIANZIModel)  throws Exception{
        return _dal.update_gujianzi( _GUJIANZIModel);
		}
	
		

         /**
         *  删除数据表GUJIANZI中的一条记录
         * @param GUJIANZI实体
         * @return 新插入记录的编号
         */
		public int delete_gujianzi(int Gjzid)  throws Exception{
        return _dal.delete_gujianzi( Gjzid);
		}

		

       
          /**
         * 得到 gujianzi 数据实体
         * @param Gjzid">Gjzid
         * @return<gujianzi 数据实体
        * @throws Exception 
         */
		public gujianzi_Dao get_gujianziDao(int Gjzid) throws Exception{
        return _dal.get_gujianziDao( Gjzid);
		}
		
		    /**
         * 根据GUJIANZI返回的查询DataRow创建一个GUJIANZIEntity对象
         * @param GUJIANZI row
         * @returnGUJIANZIList对象
        * @throws Exception 
         */
		public List<gujianzi_Dao> get_gujianzi_All() throws Exception{
            return _dal.get_gujianzi_All();
            }
		    /**
         * 根据GUJIANZI返回的查询DataRow创建一个GUJIANZIEntity对象
         * @param GUJIANZI row
         * @returnGUJIANZIList对象
        * @throws Exception 
         */
		public List<gujianzi_Dao> get_gujianzi_All(String strWhere) throws Exception{
            return _dal.get_gujianzi_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<gujianzi_Dao> get_gujianzi_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_gujianzi_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据GUJIANZI返回的查询DataRow创建一个GUJIANZIEntity对象
         * @param GUJIANZI row
         * @returnGUJIANZIDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, gujianzi_Dao> get_gujianzi_Dictionary(String strWhere) throws Exception{
            return _dal.get_gujianzi_Dictionary(strWhere);
            }
		 /**
         * 更新GUJIANZI字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_gujianzi_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_gujianzi_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新GUJIANZIInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_gujianzi_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_gujianzi_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新GUJIANZIIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int creategujianzi_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_gujianzi_UpdateString( FieldName, Value, sid);
            }
        
        
    }
