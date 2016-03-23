/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataScltest.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.scltest_Dao;
import com.szty.aihao.core.scltest_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SCLTEST逻辑层接口
    *@作者：宋春林 
    */

	public class scltest_service
	{
        public  scltest_core _dal=classFactory.getscltest();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SCLTEST实体
         * @return 新插入记录的编号
         */
		public int insert_scltest (scltest_Dao _SCLTESTModel )  throws Exception{
         return _dal.insert_scltest( _SCLTESTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SCLTESTprrameter
         * @return 新插入记录的编号
         */
         public int insert_scltest(Object[] _para)  throws Exception{
        return _dal.insert_scltest( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SCLTEST实体
         * @return 影响的行数
         */
		public int update_scltest(scltest_Dao _SCLTESTModel)  throws Exception{
        return _dal.update_scltest( _SCLTESTModel);
		}
	
		

         /**
         *  删除数据表SCLTEST中的一条记录
         * @param SCLTEST实体
         * @return 新插入记录的编号
         */
		public int delete_scltest(int Id)  throws Exception{
        return _dal.delete_scltest( Id);
		}

		

       
          /**
         * 得到 scltest 数据实体
         * @param Id">Id
         * @return<scltest 数据实体
        * @throws Exception 
         */
		public scltest_Dao get_scltestDao(int Id) throws Exception{
        return _dal.get_scltestDao( Id);
		}
		
		    /**
         * 根据SCLTEST返回的查询DataRow创建一个SCLTESTEntity对象
         * @param SCLTEST row
         * @returnSCLTESTList对象
        * @throws Exception 
         */
		public List<scltest_Dao> get_scltest_All() throws Exception{
            return _dal.get_scltest_All();
            }
		    /**
         * 根据SCLTEST返回的查询DataRow创建一个SCLTESTEntity对象
         * @param SCLTEST row
         * @returnSCLTESTList对象
        * @throws Exception 
         */
		public List<scltest_Dao> get_scltest_All(String strWhere) throws Exception{
            return _dal.get_scltest_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<scltest_Dao> get_scltest_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_scltest_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SCLTEST返回的查询DataRow创建一个SCLTESTEntity对象
         * @param SCLTEST row
         * @returnSCLTESTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, scltest_Dao> get_scltest_Dictionary(String strWhere) throws Exception{
            return _dal.get_scltest_Dictionary(strWhere);
            }
		 /**
         * 更新SCLTEST字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_scltest_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_scltest_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SCLTESTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_scltest_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_scltest_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SCLTESTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createscltest_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_scltest_UpdateString( FieldName, Value, sid);
            }
        
        
    }
