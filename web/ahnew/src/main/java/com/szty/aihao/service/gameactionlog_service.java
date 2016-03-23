/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGameactionlog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.gameactionlog_Dao;
import com.szty.aihao.core.gameactionlog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GAMEACTIONLOG逻辑层接口
    *@作者：宋春林 
    */

	public class gameactionlog_service
	{
        public  gameactionlog_core _dal=classFactory.getgameactionlog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param GAMEACTIONLOG实体
         * @return 新插入记录的编号
         */
		public int insert_gameactionlog (gameactionlog_Dao _GAMEACTIONLOGModel )  throws Exception{
         return _dal.insert_gameactionlog( _GAMEACTIONLOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param GAMEACTIONLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_gameactionlog(Object[] _para)  throws Exception{
        return _dal.insert_gameactionlog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param GAMEACTIONLOG实体
         * @return 影响的行数
         */
		public int update_gameactionlog(gameactionlog_Dao _GAMEACTIONLOGModel)  throws Exception{
        return _dal.update_gameactionlog( _GAMEACTIONLOGModel);
		}
	
		

         /**
         *  删除数据表GAMEACTIONLOG中的一条记录
         * @param GAMEACTIONLOG实体
         * @return 新插入记录的编号
         */
		public int delete_gameactionlog(int Logid)  throws Exception{
        return _dal.delete_gameactionlog( Logid);
		}

		

       
          /**
         * 得到 gameactionlog 数据实体
         * @param Logid">Logid
         * @return<gameactionlog 数据实体
        * @throws Exception 
         */
		public gameactionlog_Dao get_gameactionlogDao(int Logid) throws Exception{
        return _dal.get_gameactionlogDao( Logid);
		}
		
		    /**
         * 根据GAMEACTIONLOG返回的查询DataRow创建一个GAMEACTIONLOGEntity对象
         * @param GAMEACTIONLOG row
         * @returnGAMEACTIONLOGList对象
        * @throws Exception 
         */
		public List<gameactionlog_Dao> get_gameactionlog_All() throws Exception{
            return _dal.get_gameactionlog_All();
            }
		    /**
         * 根据GAMEACTIONLOG返回的查询DataRow创建一个GAMEACTIONLOGEntity对象
         * @param GAMEACTIONLOG row
         * @returnGAMEACTIONLOGList对象
        * @throws Exception 
         */
		public List<gameactionlog_Dao> get_gameactionlog_All(String strWhere) throws Exception{
            return _dal.get_gameactionlog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<gameactionlog_Dao> get_gameactionlog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_gameactionlog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据GAMEACTIONLOG返回的查询DataRow创建一个GAMEACTIONLOGEntity对象
         * @param GAMEACTIONLOG row
         * @returnGAMEACTIONLOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, gameactionlog_Dao> get_gameactionlog_Dictionary(String strWhere) throws Exception{
            return _dal.get_gameactionlog_Dictionary(strWhere);
            }
		 /**
         * 更新GAMEACTIONLOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_gameactionlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_gameactionlog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新GAMEACTIONLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_gameactionlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_gameactionlog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新GAMEACTIONLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int creategameactionlog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_gameactionlog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
