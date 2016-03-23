/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataHuangye_bak.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.huangye_bak_Dao;
import com.szty.aihao.core.huangye_bak_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@HUANGYE_BAK逻辑层接口
    *@作者：宋春林 
    */

	public class huangye_bak_service
	{
        public  huangye_bak_core _dal=classFactory.gethuangye_bak();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param HUANGYE_BAK实体
         * @return 新插入记录的编号
         */
		public int insert_huangye_bak (huangye_bak_Dao _HUANGYE_BAKModel )  throws Exception{
         return _dal.insert_huangye_bak( _HUANGYE_BAKModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param HUANGYE_BAKprrameter
         * @return 新插入记录的编号
         */
         public int insert_huangye_bak(Object[] _para)  throws Exception{
        return _dal.insert_huangye_bak( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param HUANGYE_BAK实体
         * @return 影响的行数
         */
		public int update_huangye_bak(huangye_bak_Dao _HUANGYE_BAKModel)  throws Exception{
        return _dal.update_huangye_bak( _HUANGYE_BAKModel);
		}
	
		

         /**
         *  删除数据表HUANGYE_BAK中的一条记录
         * @param HUANGYE_BAK实体
         * @return 新插入记录的编号
         */
		public int delete_huangye_bak(int Merid)  throws Exception{
        return _dal.delete_huangye_bak( Merid);
		}

		

       
          /**
         * 得到 huangye_bak 数据实体
         * @param Merid">Merid
         * @return<huangye_bak 数据实体
        * @throws Exception 
         */
		public huangye_bak_Dao get_huangye_bakDao(int Merid) throws Exception{
        return _dal.get_huangye_bakDao( Merid);
		}
		
		    /**
         * 根据HUANGYE_BAK返回的查询DataRow创建一个HUANGYE_BAKEntity对象
         * @param HUANGYE_BAK row
         * @returnHUANGYE_BAKList对象
        * @throws Exception 
         */
		public List<huangye_bak_Dao> get_huangye_bak_All() throws Exception{
            return _dal.get_huangye_bak_All();
            }
		    /**
         * 根据HUANGYE_BAK返回的查询DataRow创建一个HUANGYE_BAKEntity对象
         * @param HUANGYE_BAK row
         * @returnHUANGYE_BAKList对象
        * @throws Exception 
         */
		public List<huangye_bak_Dao> get_huangye_bak_All(String strWhere) throws Exception{
            return _dal.get_huangye_bak_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<huangye_bak_Dao> get_huangye_bak_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_huangye_bak_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据HUANGYE_BAK返回的查询DataRow创建一个HUANGYE_BAKEntity对象
         * @param HUANGYE_BAK row
         * @returnHUANGYE_BAKDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, huangye_bak_Dao> get_huangye_bak_Dictionary(String strWhere) throws Exception{
            return _dal.get_huangye_bak_Dictionary(strWhere);
            }
		 /**
         * 更新HUANGYE_BAK字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_huangye_bak_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_huangye_bak_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新HUANGYE_BAKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_huangye_bak_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_huangye_bak_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新HUANGYE_BAKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createhuangye_bak_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_huangye_bak_UpdateString( FieldName, Value, sid);
            }
        
        
    }
