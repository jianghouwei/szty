/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumembeddedpage.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.mvnforumembeddedpage_Dao;
import com.szty.aihao.core.mvnforumembeddedpage_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMEMBEDDEDPAGE逻辑层接口
    *@作者：宋春林 
    */

	public class mvnforumembeddedpage_service
	{
        public  mvnforumembeddedpage_core _dal=classFactory.getmvnforumembeddedpage();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMEMBEDDEDPAGE实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumembeddedpage (mvnforumembeddedpage_Dao _MVNFORUMEMBEDDEDPAGEModel )  throws Exception{
         return _dal.insert_mvnforumembeddedpage( _MVNFORUMEMBEDDEDPAGEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMEMBEDDEDPAGEprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumembeddedpage(Object[] _para)  throws Exception{
        return _dal.insert_mvnforumembeddedpage( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMEMBEDDEDPAGE实体
         * @return 影响的行数
         */
		public int update_mvnforumembeddedpage(mvnforumembeddedpage_Dao _MVNFORUMEMBEDDEDPAGEModel)  throws Exception{
        return _dal.update_mvnforumembeddedpage( _MVNFORUMEMBEDDEDPAGEModel);
		}
	
		

         /**
         *  删除数据表MVNFORUMEMBEDDEDPAGE中的一条记录
         * @param MVNFORUMEMBEDDEDPAGE实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumembeddedpage(int Embid)  throws Exception{
        return _dal.delete_mvnforumembeddedpage( Embid);
		}

		

       
          /**
         * 得到 mvnforumembeddedpage 数据实体
         * @param Embid">Embid
         * @return<mvnforumembeddedpage 数据实体
        * @throws Exception 
         */
		public mvnforumembeddedpage_Dao get_mvnforumembeddedpageDao(int Embid) throws Exception{
        return _dal.get_mvnforumembeddedpageDao( Embid);
		}
		
		    /**
         * 根据MVNFORUMEMBEDDEDPAGE返回的查询DataRow创建一个MVNFORUMEMBEDDEDPAGEEntity对象
         * @param MVNFORUMEMBEDDEDPAGE row
         * @returnMVNFORUMEMBEDDEDPAGEList对象
        * @throws Exception 
         */
		public List<mvnforumembeddedpage_Dao> get_mvnforumembeddedpage_All() throws Exception{
            return _dal.get_mvnforumembeddedpage_All();
            }
		    /**
         * 根据MVNFORUMEMBEDDEDPAGE返回的查询DataRow创建一个MVNFORUMEMBEDDEDPAGEEntity对象
         * @param MVNFORUMEMBEDDEDPAGE row
         * @returnMVNFORUMEMBEDDEDPAGEList对象
        * @throws Exception 
         */
		public List<mvnforumembeddedpage_Dao> get_mvnforumembeddedpage_All(String strWhere) throws Exception{
            return _dal.get_mvnforumembeddedpage_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumembeddedpage_Dao> get_mvnforumembeddedpage_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_mvnforumembeddedpage_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据MVNFORUMEMBEDDEDPAGE返回的查询DataRow创建一个MVNFORUMEMBEDDEDPAGEEntity对象
         * @param MVNFORUMEMBEDDEDPAGE row
         * @returnMVNFORUMEMBEDDEDPAGEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, mvnforumembeddedpage_Dao> get_mvnforumembeddedpage_Dictionary(String strWhere) throws Exception{
            return _dal.get_mvnforumembeddedpage_Dictionary(strWhere);
            }
		 /**
         * 更新MVNFORUMEMBEDDEDPAGE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_mvnforumembeddedpage_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_mvnforumembeddedpage_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新MVNFORUMEMBEDDEDPAGEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_mvnforumembeddedpage_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_mvnforumembeddedpage_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新MVNFORUMEMBEDDEDPAGEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createmvnforumembeddedpage_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_mvnforumembeddedpage_UpdateString( FieldName, Value, sid);
            }
        
        
    }
