/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTest_col_row.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.test_col_row_Dao;
import com.szty.aihao.core.test_col_row_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEST_COL_ROW逻辑层接口
    *@作者：宋春林 
    */

	public class test_col_row_service
	{
        public  test_col_row_core _dal=classFactory.gettest_col_row();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEST_COL_ROW实体
         * @return 新插入记录的编号
         */
		public int insert_test_col_row (test_col_row_Dao _TEST_COL_ROWModel )  throws Exception{
         return _dal.insert_test_col_row( _TEST_COL_ROWModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEST_COL_ROWprrameter
         * @return 新插入记录的编号
         */
         public int insert_test_col_row(Object[] _para)  throws Exception{
        return _dal.insert_test_col_row( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TEST_COL_ROW实体
         * @return 影响的行数
         */
		public int update_test_col_row(test_col_row_Dao _TEST_COL_ROWModel)  throws Exception{
        return _dal.update_test_col_row( _TEST_COL_ROWModel);
		}
	
		

         /**
         *  删除数据表TEST_COL_ROW中的一条记录
         * @param TEST_COL_ROW实体
         * @return 新插入记录的编号
         */
		public int delete_test_col_row(int Id)  throws Exception{
        return _dal.delete_test_col_row( Id);
		}

		

       
          /**
         * 得到 test_col_row 数据实体
         * @param Id">Id
         * @return<test_col_row 数据实体
        * @throws Exception 
         */
		public test_col_row_Dao get_test_col_rowDao(int Id) throws Exception{
        return _dal.get_test_col_rowDao( Id);
		}
		
		    /**
         * 根据TEST_COL_ROW返回的查询DataRow创建一个TEST_COL_ROWEntity对象
         * @param TEST_COL_ROW row
         * @returnTEST_COL_ROWList对象
        * @throws Exception 
         */
		public List<test_col_row_Dao> get_test_col_row_All() throws Exception{
            return _dal.get_test_col_row_All();
            }
		    /**
         * 根据TEST_COL_ROW返回的查询DataRow创建一个TEST_COL_ROWEntity对象
         * @param TEST_COL_ROW row
         * @returnTEST_COL_ROWList对象
        * @throws Exception 
         */
		public List<test_col_row_Dao> get_test_col_row_All(String strWhere) throws Exception{
            return _dal.get_test_col_row_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<test_col_row_Dao> get_test_col_row_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_test_col_row_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TEST_COL_ROW返回的查询DataRow创建一个TEST_COL_ROWEntity对象
         * @param TEST_COL_ROW row
         * @returnTEST_COL_ROWDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, test_col_row_Dao> get_test_col_row_Dictionary(String strWhere) throws Exception{
            return _dal.get_test_col_row_Dictionary(strWhere);
            }
		 /**
         * 更新TEST_COL_ROW字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_test_col_row_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_test_col_row_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TEST_COL_ROWInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_test_col_row_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_test_col_row_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TEST_COL_ROWIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtest_col_row_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_test_col_row_UpdateString( FieldName, Value, sid);
            }
        
        
    }
