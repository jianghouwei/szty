/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyinstallinfo.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sztyinstallinfo_Dao;
import com.szty.aihao.core.sztyinstallinfo_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYINSTALLINFO逻辑层接口
    *@作者：宋春林 
    */

	public class sztyinstallinfo_service
	{
        public  sztyinstallinfo_core _dal=classFactory.getsztyinstallinfo();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYINSTALLINFO实体
         * @return 新插入记录的编号
         */
		public int insert_sztyinstallinfo (sztyinstallinfo_Dao _SZTYINSTALLINFOModel )  throws Exception{
         return _dal.insert_sztyinstallinfo( _SZTYINSTALLINFOModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYINSTALLINFOprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyinstallinfo(Object[] _para)  throws Exception{
        return _dal.insert_sztyinstallinfo( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYINSTALLINFO实体
         * @return 影响的行数
         */
		public int update_sztyinstallinfo(sztyinstallinfo_Dao _SZTYINSTALLINFOModel)  throws Exception{
        return _dal.update_sztyinstallinfo( _SZTYINSTALLINFOModel);
		}
	
		

         /**
         *  删除数据表SZTYINSTALLINFO中的一条记录
         * @param SZTYINSTALLINFO实体
         * @return 新插入记录的编号
         */
		public int delete_sztyinstallinfo(int Id)  throws Exception{
        return _dal.delete_sztyinstallinfo( Id);
		}

		

       
          /**
         * 得到 sztyinstallinfo 数据实体
         * @param Id">Id
         * @return<sztyinstallinfo 数据实体
        * @throws Exception 
         */
		public sztyinstallinfo_Dao get_sztyinstallinfoDao(int Id) throws Exception{
        return _dal.get_sztyinstallinfoDao( Id);
		}
		
		    /**
         * 根据SZTYINSTALLINFO返回的查询DataRow创建一个SZTYINSTALLINFOEntity对象
         * @param SZTYINSTALLINFO row
         * @returnSZTYINSTALLINFOList对象
        * @throws Exception 
         */
		public List<sztyinstallinfo_Dao> get_sztyinstallinfo_All() throws Exception{
            return _dal.get_sztyinstallinfo_All();
            }
		    /**
         * 根据SZTYINSTALLINFO返回的查询DataRow创建一个SZTYINSTALLINFOEntity对象
         * @param SZTYINSTALLINFO row
         * @returnSZTYINSTALLINFOList对象
        * @throws Exception 
         */
		public List<sztyinstallinfo_Dao> get_sztyinstallinfo_All(String strWhere) throws Exception{
            return _dal.get_sztyinstallinfo_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyinstallinfo_Dao> get_sztyinstallinfo_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sztyinstallinfo_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SZTYINSTALLINFO返回的查询DataRow创建一个SZTYINSTALLINFOEntity对象
         * @param SZTYINSTALLINFO row
         * @returnSZTYINSTALLINFODictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sztyinstallinfo_Dao> get_sztyinstallinfo_Dictionary(String strWhere) throws Exception{
            return _dal.get_sztyinstallinfo_Dictionary(strWhere);
            }
		 /**
         * 更新SZTYINSTALLINFO字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sztyinstallinfo_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sztyinstallinfo_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SZTYINSTALLINFOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sztyinstallinfo_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sztyinstallinfo_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SZTYINSTALLINFOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsztyinstallinfo_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sztyinstallinfo_UpdateString( FieldName, Value, sid);
            }
        
        
    }
