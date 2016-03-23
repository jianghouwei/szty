/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTest_char.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.test_char_Dao;
import com.szty.aihao.core.test_char_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEST_CHAR逻辑层接口
    *@作者：宋春林 
    */

	public class test_char_service
	{
        public  test_char_core _dal=classFactory.gettest_char();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEST_CHAR实体
         * @return 新插入记录的编号
         */
		public int insert_test_char (test_char_Dao _TEST_CHARModel )  throws Exception{
         return _dal.insert_test_char( _TEST_CHARModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEST_CHARprrameter
         * @return 新插入记录的编号
         */
         public int insert_test_char(Object[] _para)  throws Exception{
        return _dal.insert_test_char( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TEST_CHAR实体
         * @return 影响的行数
         */
		public int update_test_char(test_char_Dao _TEST_CHARModel)  throws Exception{
        return _dal.update_test_char( _TEST_CHARModel);
		}
	
		

         /**
         *  删除数据表TEST_CHAR中的一条记录
         * @param TEST_CHAR实体
         * @return 新插入记录的编号
         */
		public int delete_test_char(int Char_col)  throws Exception{
        return _dal.delete_test_char( Char_col);
		}

		

       
          /**
         * 得到 test_char 数据实体
         * @param Char_col">Char_col
         * @return<test_char 数据实体
        * @throws Exception 
         */
		public test_char_Dao get_test_charDao(int Char_col) throws Exception{
        return _dal.get_test_charDao( Char_col);
		}
		
		    /**
         * 根据TEST_CHAR返回的查询DataRow创建一个TEST_CHAREntity对象
         * @param TEST_CHAR row
         * @returnTEST_CHARList对象
        * @throws Exception 
         */
		public List<test_char_Dao> get_test_char_All() throws Exception{
            return _dal.get_test_char_All();
            }
		    /**
         * 根据TEST_CHAR返回的查询DataRow创建一个TEST_CHAREntity对象
         * @param TEST_CHAR row
         * @returnTEST_CHARList对象
        * @throws Exception 
         */
		public List<test_char_Dao> get_test_char_All(String strWhere) throws Exception{
            return _dal.get_test_char_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<test_char_Dao> get_test_char_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_test_char_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TEST_CHAR返回的查询DataRow创建一个TEST_CHAREntity对象
         * @param TEST_CHAR row
         * @returnTEST_CHARDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, test_char_Dao> get_test_char_Dictionary(String strWhere) throws Exception{
            return _dal.get_test_char_Dictionary(strWhere);
            }
		 /**
         * 更新TEST_CHAR字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_test_char_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_test_char_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TEST_CHARInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_test_char_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_test_char_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TEST_CHARIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtest_char_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_test_char_UpdateString( FieldName, Value, sid);
            }
        
        
    }
