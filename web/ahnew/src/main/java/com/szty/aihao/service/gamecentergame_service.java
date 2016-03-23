/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataGamecentergame.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.gamecentergame_Dao;
import com.szty.aihao.core.gamecentergame_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@GAMECENTERGAME逻辑层接口
    *@作者：宋春林 
    */

	public class gamecentergame_service
	{
        public  gamecentergame_core _dal=classFactory.getgamecentergame();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param GAMECENTERGAME实体
         * @return 新插入记录的编号
         */
		public int insert_gamecentergame (gamecentergame_Dao _GAMECENTERGAMEModel )  throws Exception{
         return _dal.insert_gamecentergame( _GAMECENTERGAMEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param GAMECENTERGAMEprrameter
         * @return 新插入记录的编号
         */
         public int insert_gamecentergame(Object[] _para)  throws Exception{
        return _dal.insert_gamecentergame( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param GAMECENTERGAME实体
         * @return 影响的行数
         */
		public int update_gamecentergame(gamecentergame_Dao _GAMECENTERGAMEModel)  throws Exception{
        return _dal.update_gamecentergame( _GAMECENTERGAMEModel);
		}
	
		

         /**
         *  删除数据表GAMECENTERGAME中的一条记录
         * @param GAMECENTERGAME实体
         * @return 新插入记录的编号
         */
		public int delete_gamecentergame(int Gameid)  throws Exception{
        return _dal.delete_gamecentergame( Gameid);
		}

		

       
          /**
         * 得到 gamecentergame 数据实体
         * @param Gameid">Gameid
         * @return<gamecentergame 数据实体
        * @throws Exception 
         */
		public gamecentergame_Dao get_gamecentergameDao(int Gameid) throws Exception{
        return _dal.get_gamecentergameDao( Gameid);
		}
		
		    /**
         * 根据GAMECENTERGAME返回的查询DataRow创建一个GAMECENTERGAMEEntity对象
         * @param GAMECENTERGAME row
         * @returnGAMECENTERGAMEList对象
        * @throws Exception 
         */
		public List<gamecentergame_Dao> get_gamecentergame_All() throws Exception{
            return _dal.get_gamecentergame_All();
            }
		    /**
         * 根据GAMECENTERGAME返回的查询DataRow创建一个GAMECENTERGAMEEntity对象
         * @param GAMECENTERGAME row
         * @returnGAMECENTERGAMEList对象
        * @throws Exception 
         */
		public List<gamecentergame_Dao> get_gamecentergame_All(String strWhere) throws Exception{
            return _dal.get_gamecentergame_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<gamecentergame_Dao> get_gamecentergame_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_gamecentergame_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据GAMECENTERGAME返回的查询DataRow创建一个GAMECENTERGAMEEntity对象
         * @param GAMECENTERGAME row
         * @returnGAMECENTERGAMEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, gamecentergame_Dao> get_gamecentergame_Dictionary(String strWhere) throws Exception{
            return _dal.get_gamecentergame_Dictionary(strWhere);
            }
		 /**
         * 更新GAMECENTERGAME字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_gamecentergame_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_gamecentergame_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新GAMECENTERGAMEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_gamecentergame_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_gamecentergame_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新GAMECENTERGAMEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int creategamecentergame_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_gamecentergame_UpdateString( FieldName, Value, sid);
            }
        
        
    }
