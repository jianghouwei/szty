/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTest_qy_dd.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.test_qy_dd_Dao;
import com.szty.aihao.core.test_qy_dd_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEST_QY_DD逻辑层接口
    *@作者：宋春林 
    */

	public class test_qy_dd_service
	{
        public  test_qy_dd_core _dal=classFactory.gettest_qy_dd();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_DD实体
         * @return 新插入记录的编号
         */
		public int insert_test_qy_dd (test_qy_dd_Dao _TEST_QY_DDModel )  throws Exception{
         return _dal.insert_test_qy_dd( _TEST_QY_DDModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_DDprrameter
         * @return 新插入记录的编号
         */
         public int insert_test_qy_dd(Object[] _para)  throws Exception{
        return _dal.insert_test_qy_dd( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_DD实体
         * @return 影响的行数
         */
		public int update_test_qy_dd(test_qy_dd_Dao _TEST_QY_DDModel)  throws Exception{
        return _dal.update_test_qy_dd( _TEST_QY_DDModel);
		}
	
		

         /**
         *  删除数据表TEST_QY_DD中的一条记录
         * @param TEST_QY_DD实体
         * @return 新插入记录的编号
         */
		public int delete_test_qy_dd(int Id)  throws Exception{
        return _dal.delete_test_qy_dd( Id);
		}

		

       
          /**
         * 得到 test_qy_dd 数据实体
         * @param Id">Id
         * @return<test_qy_dd 数据实体
        * @throws Exception 
         */
		public test_qy_dd_Dao get_test_qy_ddDao(int Id) throws Exception{
        return _dal.get_test_qy_ddDao( Id);
		}
		
		    /**
         * 根据TEST_QY_DD返回的查询DataRow创建一个TEST_QY_DDEntity对象
         * @param TEST_QY_DD row
         * @returnTEST_QY_DDList对象
        * @throws Exception 
         */
		public List<test_qy_dd_Dao> get_test_qy_dd_All() throws Exception{
            return _dal.get_test_qy_dd_All();
            }
		    /**
         * 根据TEST_QY_DD返回的查询DataRow创建一个TEST_QY_DDEntity对象
         * @param TEST_QY_DD row
         * @returnTEST_QY_DDList对象
        * @throws Exception 
         */
		public List<test_qy_dd_Dao> get_test_qy_dd_All(String strWhere) throws Exception{
            return _dal.get_test_qy_dd_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<test_qy_dd_Dao> get_test_qy_dd_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_test_qy_dd_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TEST_QY_DD返回的查询DataRow创建一个TEST_QY_DDEntity对象
         * @param TEST_QY_DD row
         * @returnTEST_QY_DDDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, test_qy_dd_Dao> get_test_qy_dd_Dictionary(String strWhere) throws Exception{
            return _dal.get_test_qy_dd_Dictionary(strWhere);
            }
		 /**
         * 更新TEST_QY_DD字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_test_qy_dd_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_test_qy_dd_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TEST_QY_DDInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_test_qy_dd_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_test_qy_dd_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TEST_QY_DDIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtest_qy_dd_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_test_qy_dd_UpdateString( FieldName, Value, sid);
            }
        
        
    }
