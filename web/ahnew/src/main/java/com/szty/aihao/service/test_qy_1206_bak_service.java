/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTest_qy_1206_bak.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.test_qy_1206_bak_Dao;
import com.szty.aihao.core.test_qy_1206_bak_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEST_QY_1206_BAK逻辑层接口
    *@作者：宋春林 
    */

	public class test_qy_1206_bak_service
	{
        public  test_qy_1206_bak_core _dal=classFactory.gettest_qy_1206_bak();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_1206_BAK实体
         * @return 新插入记录的编号
         */
		public int insert_test_qy_1206_bak (test_qy_1206_bak_Dao _TEST_QY_1206_BAKModel )  throws Exception{
         return _dal.insert_test_qy_1206_bak( _TEST_QY_1206_BAKModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_1206_BAKprrameter
         * @return 新插入记录的编号
         */
         public int insert_test_qy_1206_bak(Object[] _para)  throws Exception{
        return _dal.insert_test_qy_1206_bak( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TEST_QY_1206_BAK实体
         * @return 影响的行数
         */
		public int update_test_qy_1206_bak(test_qy_1206_bak_Dao _TEST_QY_1206_BAKModel)  throws Exception{
        return _dal.update_test_qy_1206_bak( _TEST_QY_1206_BAKModel);
		}
	
		

         /**
         *  删除数据表TEST_QY_1206_BAK中的一条记录
         * @param TEST_QY_1206_BAK实体
         * @return 新插入记录的编号
         */
		public int delete_test_qy_1206_bak(int Id)  throws Exception{
        return _dal.delete_test_qy_1206_bak( Id);
		}

		

       
          /**
         * 得到 test_qy_1206_bak 数据实体
         * @param Id">Id
         * @return<test_qy_1206_bak 数据实体
        * @throws Exception 
         */
		public test_qy_1206_bak_Dao get_test_qy_1206_bakDao(int Id) throws Exception{
        return _dal.get_test_qy_1206_bakDao( Id);
		}
		
		    /**
         * 根据TEST_QY_1206_BAK返回的查询DataRow创建一个TEST_QY_1206_BAKEntity对象
         * @param TEST_QY_1206_BAK row
         * @returnTEST_QY_1206_BAKList对象
        * @throws Exception 
         */
		public List<test_qy_1206_bak_Dao> get_test_qy_1206_bak_All() throws Exception{
            return _dal.get_test_qy_1206_bak_All();
            }
		    /**
         * 根据TEST_QY_1206_BAK返回的查询DataRow创建一个TEST_QY_1206_BAKEntity对象
         * @param TEST_QY_1206_BAK row
         * @returnTEST_QY_1206_BAKList对象
        * @throws Exception 
         */
		public List<test_qy_1206_bak_Dao> get_test_qy_1206_bak_All(String strWhere) throws Exception{
            return _dal.get_test_qy_1206_bak_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<test_qy_1206_bak_Dao> get_test_qy_1206_bak_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_test_qy_1206_bak_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TEST_QY_1206_BAK返回的查询DataRow创建一个TEST_QY_1206_BAKEntity对象
         * @param TEST_QY_1206_BAK row
         * @returnTEST_QY_1206_BAKDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, test_qy_1206_bak_Dao> get_test_qy_1206_bak_Dictionary(String strWhere) throws Exception{
            return _dal.get_test_qy_1206_bak_Dictionary(strWhere);
            }
		 /**
         * 更新TEST_QY_1206_BAK字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_test_qy_1206_bak_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_test_qy_1206_bak_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TEST_QY_1206_BAKInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_test_qy_1206_bak_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_test_qy_1206_bak_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TEST_QY_1206_BAKIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtest_qy_1206_bak_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_test_qy_1206_bak_UpdateString( FieldName, Value, sid);
            }
        
        
    }
