/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataHuangyebaidu.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.huangyebaidu_Dao;
import com.szty.aihao.core.huangyebaidu_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@HUANGYEBAIDU逻辑层接口
    *@作者：宋春林 
    */

	public class huangyebaidu_service
	{
        public  huangyebaidu_core _dal=classFactory.gethuangyebaidu();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param HUANGYEBAIDU实体
         * @return 新插入记录的编号
         */
		public int insert_huangyebaidu (huangyebaidu_Dao _HUANGYEBAIDUModel )  throws Exception{
         return _dal.insert_huangyebaidu( _HUANGYEBAIDUModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param HUANGYEBAIDUprrameter
         * @return 新插入记录的编号
         */
         public int insert_huangyebaidu(Object[] _para)  throws Exception{
        return _dal.insert_huangyebaidu( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param HUANGYEBAIDU实体
         * @return 影响的行数
         */
		public int update_huangyebaidu(huangyebaidu_Dao _HUANGYEBAIDUModel)  throws Exception{
        return _dal.update_huangyebaidu( _HUANGYEBAIDUModel);
		}
	
		

         /**
         *  删除数据表HUANGYEBAIDU中的一条记录
         * @param HUANGYEBAIDU实体
         * @return 新插入记录的编号
         */
		public int delete_huangyebaidu(int Merid)  throws Exception{
        return _dal.delete_huangyebaidu( Merid);
		}

		

       
          /**
         * 得到 huangyebaidu 数据实体
         * @param Merid">Merid
         * @return<huangyebaidu 数据实体
        * @throws Exception 
         */
		public huangyebaidu_Dao get_huangyebaiduDao(int Merid) throws Exception{
        return _dal.get_huangyebaiduDao( Merid);
		}
		
		    /**
         * 根据HUANGYEBAIDU返回的查询DataRow创建一个HUANGYEBAIDUEntity对象
         * @param HUANGYEBAIDU row
         * @returnHUANGYEBAIDUList对象
        * @throws Exception 
         */
		public List<huangyebaidu_Dao> get_huangyebaidu_All() throws Exception{
            return _dal.get_huangyebaidu_All();
            }
		    /**
         * 根据HUANGYEBAIDU返回的查询DataRow创建一个HUANGYEBAIDUEntity对象
         * @param HUANGYEBAIDU row
         * @returnHUANGYEBAIDUList对象
        * @throws Exception 
         */
		public List<huangyebaidu_Dao> get_huangyebaidu_All(String strWhere) throws Exception{
            return _dal.get_huangyebaidu_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<huangyebaidu_Dao> get_huangyebaidu_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_huangyebaidu_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据HUANGYEBAIDU返回的查询DataRow创建一个HUANGYEBAIDUEntity对象
         * @param HUANGYEBAIDU row
         * @returnHUANGYEBAIDUDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, huangyebaidu_Dao> get_huangyebaidu_Dictionary(String strWhere) throws Exception{
            return _dal.get_huangyebaidu_Dictionary(strWhere);
            }
		 /**
         * 更新HUANGYEBAIDU字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_huangyebaidu_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_huangyebaidu_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新HUANGYEBAIDUInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_huangyebaidu_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_huangyebaidu_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新HUANGYEBAIDUIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createhuangyebaidu_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_huangyebaidu_UpdateString( FieldName, Value, sid);
            }
        
        
    }
