/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumgame.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumgame_Dao;
import com.szty.aihao.core.mvnforumgame_core;
import com.szty.aihao.factory.*;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.rowset.OracleCachedRowSet;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
*@文件说明
*@MVNFORUMGAME数据接口
*@作者：宋春林 
*/
public class mvnforumgame_impl implements mvnforumgame_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumgame_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMGAME实体
* @return 新插入记录的编号
*/
public int insert_mvnforumgame(mvnforumgame_Dao _MVNFORUMGAMEModel)  throws Exception{
         String sqlStr = "{call MVNFORUMGAME_PRO.InsertMVNFORUMGAME(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[20];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getGameid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGamename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getGamenature());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getGamecategory());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGametags());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGamelanguage());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGamedesc());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGamelogo());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGameimg());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getFolderpart());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMGAMEModel.getGamecreationdate()));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMGAMEModel.getGamemodifieddate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGameownername());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getGamestatus());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getViewcount());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getDownloadcount());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getFavoritecount());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getCommentcount());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getScoring());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMGAME
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumgame(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMGAME_PRO.InsertMVNFORUMGAME(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[20];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_para[11]));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_para[12]));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_para[19]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMGAME实体
* @return 影响的行数
*/
public int update_mvnforumgame(mvnforumgame_Dao _MVNFORUMGAMEModel)  throws Exception{
        String sqlStr = "{call MVNFORUMGAME_PRO.UpdateMVNFORUMGAME(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[20];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getGameid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getForumid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGamename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getGamenature());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getGamecategory());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGametags());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGamelanguage());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGamedesc());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGamelogo());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGameimg());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getFolderpart());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMGAMEModel.getGamecreationdate()));
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMGAMEModel.getGamemodifieddate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_MVNFORUMGAMEModel.getGameownername());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getGamestatus());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getViewcount());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getDownloadcount());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getFavoritecount());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getCommentcount());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NUMERIC,_MVNFORUMGAMEModel.getScoring());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMGAME中的一条记录
* @param MVNFORUMGAME实体
* @return 新插入记录的编号
*/
public int delete_mvnforumgame(int Gameid)  throws Exception{
        String sqlStr = "{call MVNFORUMGAME_PRO.DeleteMVNFORUMGAME(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Gameid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumgame 数据实体
* @param Gameid">Gameid
* @return<mvnforumgame 数据实体
* @throws Exception 
*/
public mvnforumgame_Dao get_mvnforumgameDao(int Gameid) throws Exception{
         String sqlStr = "{ call MVNFORUMGAME_PRO.GetMVNFORUMGAMEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Gameid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumgame_Dao _obj = new mvnforumgame_Dao();
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setGamename(arr.getString("GAMENAME"));
            _obj.setGamenature(arr.getInt("GAMENATURE"));
            _obj.setGamecategory(arr.getInt("GAMECATEGORY"));
            _obj.setGametags(arr.getString("GAMETAGS"));
            _obj.setGamelanguage(arr.getString("GAMELANGUAGE"));
            _obj.setGamedesc(arr.getString("GAMEDESC"));
            _obj.setGamelogo(arr.getString("GAMELOGO"));
            _obj.setGameimg(arr.getString("GAMEIMG"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
             try{_obj.setGamecreationdate(dateformat.parse(arr.getString("GAMECREATIONDATE")));}catch(Exception ce){_obj.setGamecreationdate((new Date()));}
             try{_obj.setGamemodifieddate(dateformat.parse(arr.getString("GAMEMODIFIEDDATE")));}catch(Exception ce){_obj.setGamemodifieddate((new Date()));}
            _obj.setGameownername(arr.getString("GAMEOWNERNAME"));
            _obj.setGamestatus(arr.getInt("GAMESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _obj.setFavoritecount(arr.getInt("FAVORITECOUNT"));
            _obj.setCommentcount(arr.getInt("COMMENTCOUNT"));
            _obj.setScoring(arr.getInt("SCORING"));
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMGAME返回的查询DataRow创建一个MVNFORUMGAMEEntity对象
* @param MVNFORUMGAME row
* @returnMVNFORUMGAMEList对象
* @throws Exception 
*/
public List<mvnforumgame_Dao> get_mvnforumgame_All() throws Exception{
        List<mvnforumgame_Dao> _list = new ArrayList<mvnforumgame_Dao>();
		String sqlStr = "{ call MVNFORUMGAME_PRO.GetMVNFORUMGAME(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumgame_Dao _obj = new mvnforumgame_Dao();
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setGamename(arr.getString("GAMENAME"));
            _obj.setGamenature(arr.getInt("GAMENATURE"));
            _obj.setGamecategory(arr.getInt("GAMECATEGORY"));
            _obj.setGametags(arr.getString("GAMETAGS"));
            _obj.setGamelanguage(arr.getString("GAMELANGUAGE"));
            _obj.setGamedesc(arr.getString("GAMEDESC"));
            _obj.setGamelogo(arr.getString("GAMELOGO"));
            _obj.setGameimg(arr.getString("GAMEIMG"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            try{_obj.setGamecreationdate(dateformat.parse(arr.getString("GAMECREATIONDATE")));}catch(Exception ce){_obj.setGamecreationdate((new Date()));}
            try{_obj.setGamemodifieddate(dateformat.parse(arr.getString("GAMEMODIFIEDDATE")));}catch(Exception ce){_obj.setGamemodifieddate((new Date()));}
            _obj.setGameownername(arr.getString("GAMEOWNERNAME"));
            _obj.setGamestatus(arr.getInt("GAMESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _obj.setFavoritecount(arr.getInt("FAVORITECOUNT"));
            _obj.setCommentcount(arr.getInt("COMMENTCOUNT"));
            _obj.setScoring(arr.getInt("SCORING"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMGAME返回的查询DataRow创建一个MVNFORUMGAMEEntity对象
* @param MVNFORUMGAME row
* @returnMVNFORUMGAMEList对象
* @throws Exception 
*/
public List< mvnforumgame_Dao> get_mvnforumgame_All(String strWhere) throws Exception{
         List<mvnforumgame_Dao> _list = new ArrayList<mvnforumgame_Dao>();
		 String sqlStr = "{ call MVNFORUMGAME_PRO.GetMVNFORUMGAMEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumgame_Dao _obj = new mvnforumgame_Dao();
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setGamename(arr.getString("GAMENAME"));
            _obj.setGamenature(arr.getInt("GAMENATURE"));
            _obj.setGamecategory(arr.getInt("GAMECATEGORY"));
            _obj.setGametags(arr.getString("GAMETAGS"));
            _obj.setGamelanguage(arr.getString("GAMELANGUAGE"));
            _obj.setGamedesc(arr.getString("GAMEDESC"));
            _obj.setGamelogo(arr.getString("GAMELOGO"));
            _obj.setGameimg(arr.getString("GAMEIMG"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
           try{_obj.setGamecreationdate(dateformat.parse(arr.getString("GAMECREATIONDATE")));}catch(Exception ce){_obj.setGamecreationdate((new Date()));}
           try{_obj.setGamemodifieddate(dateformat.parse(arr.getString("GAMEMODIFIEDDATE")));}catch(Exception ce){_obj.setGamemodifieddate((new Date()));}
            _obj.setGameownername(arr.getString("GAMEOWNERNAME"));
            _obj.setGamestatus(arr.getInt("GAMESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _obj.setFavoritecount(arr.getInt("FAVORITECOUNT"));
            _obj.setCommentcount(arr.getInt("COMMENTCOUNT"));
            _obj.setScoring(arr.getInt("SCORING"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMGAME返回 分页数据
* @param MVNFORUMGAME row
* @returnMVNFORUMGAMEList对象
* @throws Exception 
*/
public List<mvnforumgame_Dao> get_mvnforumgame_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumgame_Dao> _list = new ArrayList<mvnforumgame_Dao>();
		String sqlStr = "{ call MVNFORUMGAME_PRO.GetMVNFORUMGAMEPage(?,?,?,?,?,?)}";
		OracleParameter[] op = new OracleParameter[6];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "OUT", OracleTypes.NUMBER, "");
		op[2] = new OracleParameter(3, "OUT", OracleTypes.NUMBER, "");
		op[3] = new OracleParameter(4, "IN", OracleTypes.NUMBER, pageIndex);
		op[4] = new OracleParameter(5, "IN", OracleTypes.NUMBER, pageSize);
		op[5] = new OracleParameter(6, "IN", OracleTypes.VARCHAR, strWhere);
		OraclePageCache opc = OracleHelper.executeQueryPage(sqlStr, op);
		OracleCachedRowSet arr = opc.getOcrs();
		while (arr.next()) {
				mvnforumgame_Dao _obj = new mvnforumgame_Dao();
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setForumid(arr.getInt("FORUMID"));
            _obj.setGamename(arr.getString("GAMENAME"));
            _obj.setGamenature(arr.getInt("GAMENATURE"));
            _obj.setGamecategory(arr.getInt("GAMECATEGORY"));
            _obj.setGametags(arr.getString("GAMETAGS"));
            _obj.setGamelanguage(arr.getString("GAMELANGUAGE"));
            _obj.setGamedesc(arr.getString("GAMEDESC"));
            _obj.setGamelogo(arr.getString("GAMELOGO"));
            _obj.setGameimg(arr.getString("GAMEIMG"));
            _obj.setFolderpart(arr.getString("FOLDERPART"));
            try{_obj.setGamecreationdate(dateformat.parse(arr.getString("GAMECREATIONDATE")));}catch(Exception ce){_obj.setGamecreationdate((new Date()));}
            try{_obj.setGamemodifieddate(dateformat.parse(arr.getString("GAMEMODIFIEDDATE")));}catch(Exception ce){_obj.setGamemodifieddate((new Date()));}
            _obj.setGameownername(arr.getString("GAMEOWNERNAME"));
            _obj.setGamestatus(arr.getInt("GAMESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _obj.setDownloadcount(arr.getInt("DOWNLOADCOUNT"));
            _obj.setFavoritecount(arr.getInt("FAVORITECOUNT"));
            _obj.setCommentcount(arr.getInt("COMMENTCOUNT"));
            _obj.setScoring(arr.getInt("SCORING"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMGAME返回的查询DataRow创建一个MVNFORUMGAMEEntity对象
* @param MVNFORUMGAME row
* @returnMVNFORUMGAMEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumgame_Dao> get_mvnforumgame_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumgamestrWhere") == null) {
			Dictionary<Integer, mvnforumgame_Dao> _dic = new Hashtable<Integer, mvnforumgame_Dao>();
			List<mvnforumgame_Dao> _list = new ArrayList<mvnforumgame_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGameid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumgame", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumgame_Dao> _dic = (Dictionary<Integer, mvnforumgame_Dao>) classFactory
					.cacheGet("dicmvnforumgamestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMGAME字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumgame_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMGAME_PRO.UpdateFieldMVNFORUMGAME(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}
/**
* 更新MVNFORUMGAMEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumgame_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMGAME_PRO.UpdateFieldMVNFORUMGAMEV(?,?,?)}";
		OracleParameter[] op = new OracleParameter[3];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		op[2] = new OracleParameter(3, "IN", OracleTypes.NUMBER, Num);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;


}
/**
* 更新MVNFORUMGAMEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumgame_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMGAME_PRO.UpdateFieldMVNFORUMGAMEU(?,?,?)}";
		OracleParameter[] op = new OracleParameter[3];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		op[2] = new OracleParameter(3, "IN", OracleTypes.VARCHAR, Value);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}



}
