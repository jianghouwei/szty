/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGamedownlog.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.gamedownlog_Dao;
import com.szty.aihao.core.gamedownlog_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GAMEDOWNLOG逻辑层接口
    *@作者：宋春林 
    */

	public class gamedownlog_service
	{
        public  gamedownlog_core _dal=classFactory.getgamedownlog();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param GAMEDOWNLOG实体
         * @return 新插入记录的编号
         */
		public int insert_gamedownlog (gamedownlog_Dao _GAMEDOWNLOGModel )  throws Exception{
         return _dal.insert_gamedownlog( _GAMEDOWNLOGModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param GAMEDOWNLOGprrameter
         * @return 新插入记录的编号
         */
         public int insert_gamedownlog(Object[] _para)  throws Exception{
        return _dal.insert_gamedownlog( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param GAMEDOWNLOG实体
         * @return 影响的行数
         */
		public int update_gamedownlog(gamedownlog_Dao _GAMEDOWNLOGModel)  throws Exception{
        return _dal.update_gamedownlog( _GAMEDOWNLOGModel);
		}
	
		

         /**
         *  删除数据表GAMEDOWNLOG中的一条记录
         * @param GAMEDOWNLOG实体
         * @return 新插入记录的编号
         */
		public int delete_gamedownlog(int Logid)  throws Exception{
        return _dal.delete_gamedownlog( Logid);
		}

		

       
          /**
         * 得到 gamedownlog 数据实体
         * @param Logid">Logid
         * @return<gamedownlog 数据实体
        * @throws Exception 
         */
		public gamedownlog_Dao get_gamedownlogDao(int Logid) throws Exception{
        return _dal.get_gamedownlogDao( Logid);
		}
		
		    /**
         * 根据GAMEDOWNLOG返回的查询DataRow创建一个GAMEDOWNLOGEntity对象
         * @param GAMEDOWNLOG row
         * @returnGAMEDOWNLOGList对象
        * @throws Exception 
         */
		public List<gamedownlog_Dao> get_gamedownlog_All() throws Exception{
            return _dal.get_gamedownlog_All();
            }
		    /**
         * 根据GAMEDOWNLOG返回的查询DataRow创建一个GAMEDOWNLOGEntity对象
         * @param GAMEDOWNLOG row
         * @returnGAMEDOWNLOGList对象
        * @throws Exception 
         */
		public List<gamedownlog_Dao> get_gamedownlog_All(String strWhere) throws Exception{
            return _dal.get_gamedownlog_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<gamedownlog_Dao> get_gamedownlog_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_gamedownlog_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据GAMEDOWNLOG返回的查询DataRow创建一个GAMEDOWNLOGEntity对象
         * @param GAMEDOWNLOG row
         * @returnGAMEDOWNLOGDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, gamedownlog_Dao> get_gamedownlog_Dictionary(String strWhere) throws Exception{
            return _dal.get_gamedownlog_Dictionary(strWhere);
            }
		 /**
         * 更新GAMEDOWNLOG字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_gamedownlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_gamedownlog_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新GAMEDOWNLOGInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_gamedownlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_gamedownlog_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新GAMEDOWNLOGIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int creategamedownlog_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_gamedownlog_UpdateString( FieldName, Value, sid);
            }
        
        
    }
