/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataIpnumber.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.ipnumber_Dao;
import com.szty.aihao.core.ipnumber_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@IPNUMBER逻辑层接口
    *@作者：宋春林 
    */

	public class ipnumber_service
	{
        public  ipnumber_core _dal=classFactory.getipnumber();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param IPNUMBER实体
         * @return 新插入记录的编号
         */
		public int insert_ipnumber (ipnumber_Dao _IPNUMBERModel )  throws Exception{
         return _dal.insert_ipnumber( _IPNUMBERModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param IPNUMBERprrameter
         * @return 新插入记录的编号
         */
         public int insert_ipnumber(Object[] _para)  throws Exception{
        return _dal.insert_ipnumber( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param IPNUMBER实体
         * @return 影响的行数
         */
		public int update_ipnumber(ipnumber_Dao _IPNUMBERModel)  throws Exception{
        return _dal.update_ipnumber( _IPNUMBERModel);
		}
	
		

         /**
         *  删除数据表IPNUMBER中的一条记录
         * @param IPNUMBER实体
         * @return 新插入记录的编号
         */
		public int delete_ipnumber(int Ipfrom)  throws Exception{
        return _dal.delete_ipnumber( Ipfrom);
		}

		

       
          /**
         * 得到 ipnumber 数据实体
         * @param Ipfrom">Ipfrom
         * @return<ipnumber 数据实体
        * @throws Exception 
         */
		public ipnumber_Dao get_ipnumberDao(int Ipfrom) throws Exception{
        return _dal.get_ipnumberDao( Ipfrom);
		}
		
		    /**
         * 根据IPNUMBER返回的查询DataRow创建一个IPNUMBEREntity对象
         * @param IPNUMBER row
         * @returnIPNUMBERList对象
        * @throws Exception 
         */
		public List<ipnumber_Dao> get_ipnumber_All() throws Exception{
            return _dal.get_ipnumber_All();
            }
		    /**
         * 根据IPNUMBER返回的查询DataRow创建一个IPNUMBEREntity对象
         * @param IPNUMBER row
         * @returnIPNUMBERList对象
        * @throws Exception 
         */
		public List<ipnumber_Dao> get_ipnumber_All(String strWhere) throws Exception{
            return _dal.get_ipnumber_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<ipnumber_Dao> get_ipnumber_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_ipnumber_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据IPNUMBER返回的查询DataRow创建一个IPNUMBEREntity对象
         * @param IPNUMBER row
         * @returnIPNUMBERDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, ipnumber_Dao> get_ipnumber_Dictionary(String strWhere) throws Exception{
            return _dal.get_ipnumber_Dictionary(strWhere);
            }
		 /**
         * 更新IPNUMBER字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_ipnumber_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_ipnumber_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新IPNUMBERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_ipnumber_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_ipnumber_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新IPNUMBERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createipnumber_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_ipnumber_UpdateString( FieldName, Value, sid);
            }
        
        
    }
