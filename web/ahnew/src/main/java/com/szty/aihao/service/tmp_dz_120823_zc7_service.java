/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTmp_dz_120823_zc7.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.tmp_dz_120823_zc7_Dao;
import com.szty.aihao.core.tmp_dz_120823_zc7_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TMP_DZ_120823_ZC7逻辑层接口
    *@作者：宋春林 
    */

	public class tmp_dz_120823_zc7_service
	{
        public  tmp_dz_120823_zc7_core _dal=classFactory.gettmp_dz_120823_zc7();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_120823_ZC7实体
         * @return 新插入记录的编号
         */
		public int insert_tmp_dz_120823_zc7 (tmp_dz_120823_zc7_Dao _TMP_DZ_120823_ZC7Model )  throws Exception{
         return _dal.insert_tmp_dz_120823_zc7( _TMP_DZ_120823_ZC7Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_120823_ZC7prrameter
         * @return 新插入记录的编号
         */
         public int insert_tmp_dz_120823_zc7(Object[] _para)  throws Exception{
        return _dal.insert_tmp_dz_120823_zc7( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_120823_ZC7实体
         * @return 影响的行数
         */
		public int update_tmp_dz_120823_zc7(tmp_dz_120823_zc7_Dao _TMP_DZ_120823_ZC7Model)  throws Exception{
        return _dal.update_tmp_dz_120823_zc7( _TMP_DZ_120823_ZC7Model);
		}
	
		

         /**
         *  删除数据表TMP_DZ_120823_ZC7中的一条记录
         * @param TMP_DZ_120823_ZC7实体
         * @return 新插入记录的编号
         */
		public int delete_tmp_dz_120823_zc7(int P1)  throws Exception{
        return _dal.delete_tmp_dz_120823_zc7( P1);
		}

		

       
          /**
         * 得到 tmp_dz_120823_zc7 数据实体
         * @param P1">P1
         * @return<tmp_dz_120823_zc7 数据实体
        * @throws Exception 
         */
		public tmp_dz_120823_zc7_Dao get_tmp_dz_120823_zc7Dao(int P1) throws Exception{
        return _dal.get_tmp_dz_120823_zc7Dao( P1);
		}
		
		    /**
         * 根据TMP_DZ_120823_ZC7返回的查询DataRow创建一个TMP_DZ_120823_ZC7Entity对象
         * @param TMP_DZ_120823_ZC7 row
         * @returnTMP_DZ_120823_ZC7List对象
        * @throws Exception 
         */
		public List<tmp_dz_120823_zc7_Dao> get_tmp_dz_120823_zc7_All() throws Exception{
            return _dal.get_tmp_dz_120823_zc7_All();
            }
		    /**
         * 根据TMP_DZ_120823_ZC7返回的查询DataRow创建一个TMP_DZ_120823_ZC7Entity对象
         * @param TMP_DZ_120823_ZC7 row
         * @returnTMP_DZ_120823_ZC7List对象
        * @throws Exception 
         */
		public List<tmp_dz_120823_zc7_Dao> get_tmp_dz_120823_zc7_All(String strWhere) throws Exception{
            return _dal.get_tmp_dz_120823_zc7_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tmp_dz_120823_zc7_Dao> get_tmp_dz_120823_zc7_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_tmp_dz_120823_zc7_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TMP_DZ_120823_ZC7返回的查询DataRow创建一个TMP_DZ_120823_ZC7Entity对象
         * @param TMP_DZ_120823_ZC7 row
         * @returnTMP_DZ_120823_ZC7Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, tmp_dz_120823_zc7_Dao> get_tmp_dz_120823_zc7_Dictionary(String strWhere) throws Exception{
            return _dal.get_tmp_dz_120823_zc7_Dictionary(strWhere);
            }
		 /**
         * 更新TMP_DZ_120823_ZC7字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_tmp_dz_120823_zc7_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_tmp_dz_120823_zc7_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TMP_DZ_120823_ZC7Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_tmp_dz_120823_zc7_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_tmp_dz_120823_zc7_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TMP_DZ_120823_ZC7IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtmp_dz_120823_zc7_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_tmp_dz_120823_zc7_UpdateString( FieldName, Value, sid);
            }
        
        
    }
