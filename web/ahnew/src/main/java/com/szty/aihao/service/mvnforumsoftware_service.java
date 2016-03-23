/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumsoftware.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumsoftware_Dao;
import com.szty.aihao.core.mvnforumsoftware_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMSOFTWARE逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumsoftware_service
	{
        public  mvnforumsoftware_core _dal=classFactory.getmvnforumsoftware();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSOFTWARE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumsoftware (mvnforumsoftware_Dao _MVNFORUMSOFTWAREModel )  throws Exception{
         return _dal.insert_mvnforumsoftware( _MVNFORUMSOFTWAREModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSOFTWAREprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumsoftware(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumsoftware( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMSOFTWARE实体
         * @return 影响的行数
         */
		public int update_mvnforumsoftware(mvnforumsoftware_Dao _MVNFORUMSOFTWAREModel)  throws Exception{
        return _dal.update_mvnforumsoftware( _MVNFORUMSOFTWAREModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMSOFTWARE中的一条记录
         * @param MVNFORUMSOFTWARE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumsoftware(int Softwareid)  throws Exception{
        return _dal.delete_mvnforumsoftware( Softwareid);
		}

		

       
          /**
         * 得到 mvnforumsoftware 数据实体
         * @param Softwareid">Softwareid
         * @return<mvnforumsoftware 数据实体
        * @throws Exception 
         */
		public mvnforumsoftware_Dao get_mvnforumsoftwareDao(int Softwareid) throws Exception{
        return _dal.get_mvnforumsoftwareDao( Softwareid);
		}
		
		    /**
         * 根据MVNFORUMSOFTWARE返回的查询DataRow创建一个MVNFORUMSOFTWAREEntity对象
         * @param MVNFORUMSOFTWARE row
         * @returnMVNFORUMSOFTWAREList对象
        * @throws Exception 
         */
		public List<mvnforumsoftware_Dao> get_mvnforumsoftware_All() throws Exception{
            return _dal.get_mvnforumsoftware_All();
            }
		    /**
         * 根据MVNFORUMSOFTWARE返回的查询DataRow创建一个MVNFORUMSOFTWAREEntity对象
         * @param MVNFORUMSOFTWARE row
         * @returnMVNFORUMSOFTWAREList对象
        * @throws Exception 
         */
		public List<mvnforumsoftware_Dao> get_mvnforumsoftware_All(String strWhere) throws Exception{
            return _dal.get_mvnforumsoftware_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumsoftware_Dao> get_mvnforumsoftware_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumsoftware_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMSOFTWARE返回的查询DataRow创建一个MVNFORUMSOFTWAREEntity对象
         * @param MVNFORUMSOFTWARE row
         * @returnMVNFORUMSOFTWAREDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumsoftware_Dao> get_mvnforumsoftware_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumsoftware_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMSOFTWARE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumsoftware_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumsoftware_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMSOFTWAREInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumsoftware_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumsoftware_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMSOFTWAREIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumsoftware_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumsoftware_UpdateString( FieldName, Value, sid);
            }
        
        
    }
