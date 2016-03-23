/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsmsproduct.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumsmsproduct_Dao;
import com.szty.aihao.core.mvnforumsmsproduct_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSMSPRODUCT逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumsmsproduct_service
	{
        public  mvnforumsmsproduct_core _dal=classFactory.getmvnforumsmsproduct();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSPRODUCT实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsmsproduct (mvnforumsmsproduct_Dao _MVNFORUMSMSPRODUCTModel )  throws Exception{
         return _dal.insert_mvnforumsmsproduct( _MVNFORUMSMSPRODUCTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSPRODUCTprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsmsproduct(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumsmsproduct( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSMSPRODUCT实体
         * @return 影响的行数
         */
		public int update_mvnforumsmsproduct(mvnforumsmsproduct_Dao _MVNFORUMSMSPRODUCTModel)  throws Exception{
        return _dal.update_mvnforumsmsproduct( _MVNFORUMSMSPRODUCTModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMSMSPRODUCT中的一条记录
         * @param MVNFORUMSMSPRODUCT实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsmsproduct(int Productid)  throws Exception{
        return _dal.delete_mvnforumsmsproduct( Productid);
		}

		

       
          /**
         * 得到 mvnforumsmsproduct 数据实体
         * @param Productid">Productid
         * @return<mvnforumsmsproduct 数据实体
        * @throws Exception 
         */
		public mvnforumsmsproduct_Dao get_mvnforumsmsproductDao(int Productid) throws Exception{
        return _dal.get_mvnforumsmsproductDao( Productid);
		}
		
		    /**
         * 根据MVNFORUMSMSPRODUCT返回的查询DataRow创建一个MVNFORUMSMSPRODUCTEntity对象
         * @param MVNFORUMSMSPRODUCT row
         * @returnMVNFORUMSMSPRODUCTList对象
        * @throws Exception 
         */
		public List<mvnforumsmsproduct_Dao> get_mvnforumsmsproduct_All() throws Exception{
            return _dal.get_mvnforumsmsproduct_All();
            }
		    /**
         * 根据MVNFORUMSMSPRODUCT返回的查询DataRow创建一个MVNFORUMSMSPRODUCTEntity对象
         * @param MVNFORUMSMSPRODUCT row
         * @returnMVNFORUMSMSPRODUCTList对象
        * @throws Exception 
         */
		public List<mvnforumsmsproduct_Dao> get_mvnforumsmsproduct_All(String strWhere) throws Exception{
            return _dal.get_mvnforumsmsproduct_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsmsproduct_Dao> get_mvnforumsmsproduct_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumsmsproduct_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMSMSPRODUCT返回的查询DataRow创建一个MVNFORUMSMSPRODUCTEntity对象
         * @param MVNFORUMSMSPRODUCT row
         * @returnMVNFORUMSMSPRODUCTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumsmsproduct_Dao> get_mvnforumsmsproduct_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumsmsproduct_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMSMSPRODUCT字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumsmsproduct_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumsmsproduct_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMSMSPRODUCTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumsmsproduct_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumsmsproduct_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMSMSPRODUCTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumsmsproduct_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumsmsproduct_UpdateString( FieldName, Value, sid);
            }
        
        
    }
