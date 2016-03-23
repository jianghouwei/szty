/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGamecentergame_20130327.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.gamecentergame_20130327_Dao;
import com.szty.aihao.core.gamecentergame_20130327_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GAMECENTERGAME_20130327逻辑层接口
    *@作者：宋春林 
    */

	public class gamecentergame_20130327_service
	{
        public  gamecentergame_20130327_core _dal=classFactory.getgamecentergame_20130327();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param GAMECENTERGAME_20130327实体
         * @return 新插入记录的编号
         */
		public int insert_gamecentergame_20130327 (gamecentergame_20130327_Dao _GAMECENTERGAME_20130327Model )  throws Exception{
         return _dal.insert_gamecentergame_20130327( _GAMECENTERGAME_20130327Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param GAMECENTERGAME_20130327prrameter
         * @return 新插入记录的编号
         */
         public int insert_gamecentergame_20130327(Object[] _para)  throws Exception{
        return _dal.insert_gamecentergame_20130327( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param GAMECENTERGAME_20130327实体
         * @return 影响的行数
         */
		public int update_gamecentergame_20130327(gamecentergame_20130327_Dao _GAMECENTERGAME_20130327Model)  throws Exception{
        return _dal.update_gamecentergame_20130327( _GAMECENTERGAME_20130327Model);
		}
	
		

         /**
         *  删除数据表GAMECENTERGAME_20130327中的一条记录
         * @param GAMECENTERGAME_20130327实体
         * @return 新插入记录的编号
         */
		public int delete_gamecentergame_20130327(int Gameid)  throws Exception{
        return _dal.delete_gamecentergame_20130327( Gameid);
		}

		

       
          /**
         * 得到 gamecentergame_20130327 数据实体
         * @param Gameid">Gameid
         * @return<gamecentergame_20130327 数据实体
        * @throws Exception 
         */
		public gamecentergame_20130327_Dao get_gamecentergame_20130327Dao(int Gameid) throws Exception{
        return _dal.get_gamecentergame_20130327Dao( Gameid);
		}
		
		    /**
         * 根据GAMECENTERGAME_20130327返回的查询DataRow创建一个GAMECENTERGAME_20130327Entity对象
         * @param GAMECENTERGAME_20130327 row
         * @returnGAMECENTERGAME_20130327List对象
        * @throws Exception 
         */
		public List<gamecentergame_20130327_Dao> get_gamecentergame_20130327_All() throws Exception{
            return _dal.get_gamecentergame_20130327_All();
            }
		    /**
         * 根据GAMECENTERGAME_20130327返回的查询DataRow创建一个GAMECENTERGAME_20130327Entity对象
         * @param GAMECENTERGAME_20130327 row
         * @returnGAMECENTERGAME_20130327List对象
        * @throws Exception 
         */
		public List<gamecentergame_20130327_Dao> get_gamecentergame_20130327_All(String strWhere) throws Exception{
            return _dal.get_gamecentergame_20130327_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<gamecentergame_20130327_Dao> get_gamecentergame_20130327_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_gamecentergame_20130327_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据GAMECENTERGAME_20130327返回的查询DataRow创建一个GAMECENTERGAME_20130327Entity对象
         * @param GAMECENTERGAME_20130327 row
         * @returnGAMECENTERGAME_20130327Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, gamecentergame_20130327_Dao> get_gamecentergame_20130327_Dictionary(String strWhere) throws Exception{
            return _dal.get_gamecentergame_20130327_Dictionary(strWhere);
            }
		 /**
         * 更新GAMECENTERGAME_20130327字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_gamecentergame_20130327_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_gamecentergame_20130327_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新GAMECENTERGAME_20130327Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_gamecentergame_20130327_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_gamecentergame_20130327_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新GAMECENTERGAME_20130327IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int creategamecentergame_20130327_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_gamecentergame_20130327_UpdateString( FieldName, Value, sid);
            }
        
        
    }
