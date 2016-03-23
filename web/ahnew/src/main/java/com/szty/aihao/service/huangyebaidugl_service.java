/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataHuangyebaidugl.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.huangyebaidugl_Dao;
import com.szty.aihao.core.huangyebaidugl_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@HUANGYEBAIDUGL逻辑层接口
    *@作者：宋春林 
    */

	public class huangyebaidugl_service
	{
        public  huangyebaidugl_core _dal=classFactory.gethuangyebaidugl();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param HUANGYEBAIDUGL实体
         * @return 新插入记录的编号
         */
		public int insert_huangyebaidugl (huangyebaidugl_Dao _HUANGYEBAIDUGLModel )  throws Exception{
         return _dal.insert_huangyebaidugl( _HUANGYEBAIDUGLModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param HUANGYEBAIDUGLprrameter
         * @return 新插入记录的编号
         */
         public int insert_huangyebaidugl(Object[] _para)  throws Exception{
        return _dal.insert_huangyebaidugl( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param HUANGYEBAIDUGL实体
         * @return 影响的行数
         */
		public int update_huangyebaidugl(huangyebaidugl_Dao _HUANGYEBAIDUGLModel)  throws Exception{
        return _dal.update_huangyebaidugl( _HUANGYEBAIDUGLModel);
		}
	
		

         /**
         *  删除数据表HUANGYEBAIDUGL中的一条记录
         * @param HUANGYEBAIDUGL实体
         * @return 新插入记录的编号
         */
		public int delete_huangyebaidugl(int Glid)  throws Exception{
        return _dal.delete_huangyebaidugl( Glid);
		}

		

       
          /**
         * 得到 huangyebaidugl 数据实体
         * @param Glid">Glid
         * @return<huangyebaidugl 数据实体
        * @throws Exception 
         */
		public huangyebaidugl_Dao get_huangyebaiduglDao(int Glid) throws Exception{
        return _dal.get_huangyebaiduglDao( Glid);
		}
		
		    /**
         * 根据HUANGYEBAIDUGL返回的查询DataRow创建一个HUANGYEBAIDUGLEntity对象
         * @param HUANGYEBAIDUGL row
         * @returnHUANGYEBAIDUGLList对象
        * @throws Exception 
         */
		public List<huangyebaidugl_Dao> get_huangyebaidugl_All() throws Exception{
            return _dal.get_huangyebaidugl_All();
            }
		    /**
         * 根据HUANGYEBAIDUGL返回的查询DataRow创建一个HUANGYEBAIDUGLEntity对象
         * @param HUANGYEBAIDUGL row
         * @returnHUANGYEBAIDUGLList对象
        * @throws Exception 
         */
		public List<huangyebaidugl_Dao> get_huangyebaidugl_All(String strWhere) throws Exception{
            return _dal.get_huangyebaidugl_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<huangyebaidugl_Dao> get_huangyebaidugl_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_huangyebaidugl_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据HUANGYEBAIDUGL返回的查询DataRow创建一个HUANGYEBAIDUGLEntity对象
         * @param HUANGYEBAIDUGL row
         * @returnHUANGYEBAIDUGLDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, huangyebaidugl_Dao> get_huangyebaidugl_Dictionary(String strWhere) throws Exception{
            return _dal.get_huangyebaidugl_Dictionary(strWhere);
            }
		 /**
         * 更新HUANGYEBAIDUGL字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_huangyebaidugl_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_huangyebaidugl_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新HUANGYEBAIDUGLInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_huangyebaidugl_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_huangyebaidugl_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新HUANGYEBAIDUGLIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createhuangyebaidugl_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_huangyebaidugl_UpdateString( FieldName, Value, sid);
            }
        
        
    }
