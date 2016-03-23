/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataWinlist.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.winlist_Dao;
import com.szty.aihao.core.winlist_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@WINLIST逻辑层接口
    *@作者：宋春林 
    */

	public class winlist_service
	{
        public  winlist_core _dal=classFactory.getwinlist();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param WINLIST实体
         * @return 新插入记录的编号
         */
		public int insert_winlist (winlist_Dao _WINLISTModel )  throws Exception{
         return _dal.insert_winlist( _WINLISTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param WINLISTprrameter
         * @return 新插入记录的编号
         */
         public int insert_winlist(Object[] _para)  throws Exception{
        return _dal.insert_winlist( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param WINLIST实体
         * @return 影响的行数
         */
		public int update_winlist(winlist_Dao _WINLISTModel)  throws Exception{
        return _dal.update_winlist( _WINLISTModel);
		}
	
		

         /**
         *  删除数据表WINLIST中的一条记录
         * @param WINLIST实体
         * @return 新插入记录的编号
         */
		public int delete_winlist(int Winnerid)  throws Exception{
        return _dal.delete_winlist( Winnerid);
		}

		

       
          /**
         * 得到 winlist 数据实体
         * @param Winnerid">Winnerid
         * @return<winlist 数据实体
        * @throws Exception 
         */
		public winlist_Dao get_winlistDao(int Winnerid) throws Exception{
        return _dal.get_winlistDao( Winnerid);
		}
		
		    /**
         * 根据WINLIST返回的查询DataRow创建一个WINLISTEntity对象
         * @param WINLIST row
         * @returnWINLISTList对象
        * @throws Exception 
         */
		public List<winlist_Dao> get_winlist_All() throws Exception{
            return _dal.get_winlist_All();
            }
		    /**
         * 根据WINLIST返回的查询DataRow创建一个WINLISTEntity对象
         * @param WINLIST row
         * @returnWINLISTList对象
        * @throws Exception 
         */
		public List<winlist_Dao> get_winlist_All(String strWhere) throws Exception{
            return _dal.get_winlist_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<winlist_Dao> get_winlist_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_winlist_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据WINLIST返回的查询DataRow创建一个WINLISTEntity对象
         * @param WINLIST row
         * @returnWINLISTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, winlist_Dao> get_winlist_Dictionary(String strWhere) throws Exception{
            return _dal.get_winlist_Dictionary(strWhere);
            }
		 /**
         * 更新WINLIST字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_winlist_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_winlist_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新WINLISTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_winlist_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_winlist_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新WINLISTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createwinlist_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_winlist_UpdateString( FieldName, Value, sid);
            }
        
        
    }
