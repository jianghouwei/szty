/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumpicture.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumpicture_Dao;
import com.szty.aihao.core.mvnforumpicture_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMPICTURE逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumpicture_service
	{
        public  mvnforumpicture_core _dal=classFactory.getmvnforumpicture();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPICTURE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumpicture (mvnforumpicture_Dao _MVNFORUMPICTUREModel )  throws Exception{
         return _dal.insert_mvnforumpicture( _MVNFORUMPICTUREModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPICTUREprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumpicture(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumpicture( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMPICTURE实体
         * @return 影响的行数
         */
		public int update_mvnforumpicture(mvnforumpicture_Dao _MVNFORUMPICTUREModel)  throws Exception{
        return _dal.update_mvnforumpicture( _MVNFORUMPICTUREModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMPICTURE中的一条记录
         * @param MVNFORUMPICTURE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumpicture(int Pictureid)  throws Exception{
        return _dal.delete_mvnforumpicture( Pictureid);
		}

		

       
          /**
         * 得到 mvnforumpicture 数据实体
         * @param Pictureid">Pictureid
         * @return<mvnforumpicture 数据实体
        * @throws Exception 
         */
		public mvnforumpicture_Dao get_mvnforumpictureDao(int Pictureid) throws Exception{
        return _dal.get_mvnforumpictureDao( Pictureid);
		}
		
		    /**
         * 根据MVNFORUMPICTURE返回的查询DataRow创建一个MVNFORUMPICTUREEntity对象
         * @param MVNFORUMPICTURE row
         * @returnMVNFORUMPICTUREList对象
        * @throws Exception 
         */
		public List<mvnforumpicture_Dao> get_mvnforumpicture_All() throws Exception{
            return _dal.get_mvnforumpicture_All();
            }
		    /**
         * 根据MVNFORUMPICTURE返回的查询DataRow创建一个MVNFORUMPICTUREEntity对象
         * @param MVNFORUMPICTURE row
         * @returnMVNFORUMPICTUREList对象
        * @throws Exception 
         */
		public List<mvnforumpicture_Dao> get_mvnforumpicture_All(String strWhere) throws Exception{
            return _dal.get_mvnforumpicture_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumpicture_Dao> get_mvnforumpicture_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumpicture_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMPICTURE返回的查询DataRow创建一个MVNFORUMPICTUREEntity对象
         * @param MVNFORUMPICTURE row
         * @returnMVNFORUMPICTUREDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumpicture_Dao> get_mvnforumpicture_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumpicture_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMPICTURE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumpicture_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumpicture_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMPICTUREInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumpicture_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumpicture_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMPICTUREIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumpicture_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumpicture_UpdateString( FieldName, Value, sid);
            }
        
        
    }
