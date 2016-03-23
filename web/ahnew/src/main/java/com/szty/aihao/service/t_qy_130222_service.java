/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataT_qy_130222.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.t_qy_130222_Dao;
import com.szty.aihao.core.t_qy_130222_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@T_QY_130222逻辑层接口
    *@作者：宋春林 
    */

	public class t_qy_130222_service
	{
        public  t_qy_130222_core _dal=classFactory.gett_qy_130222();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130222实体
         * @return 新插入记录的编号
         */
		public int insert_t_qy_130222 (t_qy_130222_Dao _T_QY_130222Model )  throws Exception{
         return _dal.insert_t_qy_130222( _T_QY_130222Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130222prrameter
         * @return 新插入记录的编号
         */
         public int insert_t_qy_130222(Object[] _para)  throws Exception{
        return _dal.insert_t_qy_130222( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param T_QY_130222实体
         * @return 影响的行数
         */
		public int update_t_qy_130222(t_qy_130222_Dao _T_QY_130222Model)  throws Exception{
        return _dal.update_t_qy_130222( _T_QY_130222Model);
		}
	
		

         /**
         *  删除数据表T_QY_130222中的一条记录
         * @param T_QY_130222实体
         * @return 新插入记录的编号
         */
		public int delete_t_qy_130222(int Pcontent)  throws Exception{
        return _dal.delete_t_qy_130222( Pcontent);
		}

		

       
          /**
         * 得到 t_qy_130222 数据实体
         * @param Pcontent">Pcontent
         * @return<t_qy_130222 数据实体
        * @throws Exception 
         */
		public t_qy_130222_Dao get_t_qy_130222Dao(int Pcontent) throws Exception{
        return _dal.get_t_qy_130222Dao( Pcontent);
		}
		
		    /**
         * 根据T_QY_130222返回的查询DataRow创建一个T_QY_130222Entity对象
         * @param T_QY_130222 row
         * @returnT_QY_130222List对象
        * @throws Exception 
         */
		public List<t_qy_130222_Dao> get_t_qy_130222_All() throws Exception{
            return _dal.get_t_qy_130222_All();
            }
		    /**
         * 根据T_QY_130222返回的查询DataRow创建一个T_QY_130222Entity对象
         * @param T_QY_130222 row
         * @returnT_QY_130222List对象
        * @throws Exception 
         */
		public List<t_qy_130222_Dao> get_t_qy_130222_All(String strWhere) throws Exception{
            return _dal.get_t_qy_130222_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<t_qy_130222_Dao> get_t_qy_130222_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_t_qy_130222_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据T_QY_130222返回的查询DataRow创建一个T_QY_130222Entity对象
         * @param T_QY_130222 row
         * @returnT_QY_130222Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, t_qy_130222_Dao> get_t_qy_130222_Dictionary(String strWhere) throws Exception{
            return _dal.get_t_qy_130222_Dictionary(strWhere);
            }
		 /**
         * 更新T_QY_130222字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_t_qy_130222_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_t_qy_130222_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新T_QY_130222Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_t_qy_130222_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_t_qy_130222_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新T_QY_130222IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createt_qy_130222_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_t_qy_130222_UpdateString( FieldName, Value, sid);
            }
        
        
    }
