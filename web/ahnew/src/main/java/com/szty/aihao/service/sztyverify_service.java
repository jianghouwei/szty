/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyverify.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sztyverify_Dao;
import com.szty.aihao.core.sztyverify_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYVERIFY逻辑层接口
    *@作者：宋春林 
    */

	public class sztyverify_service
	{
        public  sztyverify_core _dal=classFactory.getsztyverify();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYVERIFY实体
         * @return 新插入记录的编号
         */
		public int insert_sztyverify (sztyverify_Dao _SZTYVERIFYModel )  throws Exception{
         return _dal.insert_sztyverify( _SZTYVERIFYModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYVERIFYprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyverify(Object[] _para)  throws Exception{
        return _dal.insert_sztyverify( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYVERIFY实体
         * @return 影响的行数
         */
		public int update_sztyverify(sztyverify_Dao _SZTYVERIFYModel)  throws Exception{
        return _dal.update_sztyverify( _SZTYVERIFYModel);
		}
	
		

         /**
         *  删除数据表SZTYVERIFY中的一条记录
         * @param SZTYVERIFY实体
         * @return 新插入记录的编号
         */
		public int delete_sztyverify(int Id)  throws Exception{
        return _dal.delete_sztyverify( Id);
		}

		

       
          /**
         * 得到 sztyverify 数据实体
         * @param Id">Id
         * @return<sztyverify 数据实体
        * @throws Exception 
         */
		public sztyverify_Dao get_sztyverifyDao(int Id) throws Exception{
        return _dal.get_sztyverifyDao( Id);
		}
		
		    /**
         * 根据SZTYVERIFY返回的查询DataRow创建一个SZTYVERIFYEntity对象
         * @param SZTYVERIFY row
         * @returnSZTYVERIFYList对象
        * @throws Exception 
         */
		public List<sztyverify_Dao> get_sztyverify_All() throws Exception{
            return _dal.get_sztyverify_All();
            }
		    /**
         * 根据SZTYVERIFY返回的查询DataRow创建一个SZTYVERIFYEntity对象
         * @param SZTYVERIFY row
         * @returnSZTYVERIFYList对象
        * @throws Exception 
         */
		public List<sztyverify_Dao> get_sztyverify_All(String strWhere) throws Exception{
            return _dal.get_sztyverify_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyverify_Dao> get_sztyverify_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sztyverify_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SZTYVERIFY返回的查询DataRow创建一个SZTYVERIFYEntity对象
         * @param SZTYVERIFY row
         * @returnSZTYVERIFYDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sztyverify_Dao> get_sztyverify_Dictionary(String strWhere) throws Exception{
            return _dal.get_sztyverify_Dictionary(strWhere);
            }
		 /**
         * 更新SZTYVERIFY字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sztyverify_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sztyverify_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SZTYVERIFYInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sztyverify_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sztyverify_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SZTYVERIFYIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsztyverify_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sztyverify_UpdateString( FieldName, Value, sid);
            }
        
        
    }
