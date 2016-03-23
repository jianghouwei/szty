/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataGameactionlog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.gameactionlog_Dao;
import com.szty.aihao.core.gameactionlog_core;
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
*@GAMEACTIONLOG数据接口
*@作者：宋春林 
*/
public class gameactionlog_impl implements gameactionlog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(gameactionlog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param GAMEACTIONLOG实体
* @return 新插入记录的编号
*/
public int insert_gameactionlog(gameactionlog_Dao _GAMEACTIONLOGModel)  throws Exception{
         String sqlStr = "{call GAMEACTIONLOG_PRO.InsertGAMEACTIONLOG(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_GAMEACTIONLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GAMEACTIONLOGModel.getGameid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GAMEACTIONLOGModel.getGameaction());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_GAMEACTIONLOGModel.getActionip());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_GAMEACTIONLOGModel.getActionprovince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_GAMEACTIONLOGModel.getActioncdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param GAMEACTIONLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_gameactionlog(Object[] _para)  throws Exception{
      String sqlStr = "{call GAMEACTIONLOG_PRO.InsertGAMEACTIONLOG(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param GAMEACTIONLOG实体
* @return 影响的行数
*/
public int update_gameactionlog(gameactionlog_Dao _GAMEACTIONLOGModel)  throws Exception{
        String sqlStr = "{call GAMEACTIONLOG_PRO.UpdateGAMEACTIONLOG(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_GAMEACTIONLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GAMEACTIONLOGModel.getGameid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GAMEACTIONLOGModel.getGameaction());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_GAMEACTIONLOGModel.getActionip());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_GAMEACTIONLOGModel.getActionprovince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_GAMEACTIONLOGModel.getActioncdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表GAMEACTIONLOG中的一条记录
* @param GAMEACTIONLOG实体
* @return 新插入记录的编号
*/
public int delete_gameactionlog(int Logid)  throws Exception{
        String sqlStr = "{call GAMEACTIONLOG_PRO.DeleteGAMEACTIONLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 gameactionlog 数据实体
* @param Logid">Logid
* @return<gameactionlog 数据实体
* @throws Exception 
*/
public gameactionlog_Dao get_gameactionlogDao(int Logid) throws Exception{
         String sqlStr = "{ call GAMEACTIONLOG_PRO.GetGAMEACTIONLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			gameactionlog_Dao _obj = new gameactionlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setGameid(arr.getString("GAMEID"));
            _obj.setGameaction(arr.getString("GAMEACTION"));
            _obj.setActionip(arr.getString("ACTIONIP"));
            _obj.setActionprovince(arr.getString("ACTIONPROVINCE"));
             try{_obj.setActioncdate(dateformat.parse(arr.getString("ACTIONCDATE")));}catch(Exception ce){_obj.setActioncdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据GAMEACTIONLOG返回的查询DataRow创建一个GAMEACTIONLOGEntity对象
* @param GAMEACTIONLOG row
* @returnGAMEACTIONLOGList对象
* @throws Exception 
*/
public List<gameactionlog_Dao> get_gameactionlog_All() throws Exception{
        List<gameactionlog_Dao> _list = new ArrayList<gameactionlog_Dao>();
		String sqlStr = "{ call GAMEACTIONLOG_PRO.GetGAMEACTIONLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			gameactionlog_Dao _obj = new gameactionlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setGameid(arr.getString("GAMEID"));
            _obj.setGameaction(arr.getString("GAMEACTION"));
            _obj.setActionip(arr.getString("ACTIONIP"));
            _obj.setActionprovince(arr.getString("ACTIONPROVINCE"));
            try{_obj.setActioncdate(dateformat.parse(arr.getString("ACTIONCDATE")));}catch(Exception ce){_obj.setActioncdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据GAMEACTIONLOG返回的查询DataRow创建一个GAMEACTIONLOGEntity对象
* @param GAMEACTIONLOG row
* @returnGAMEACTIONLOGList对象
* @throws Exception 
*/
public List< gameactionlog_Dao> get_gameactionlog_All(String strWhere) throws Exception{
         List<gameactionlog_Dao> _list = new ArrayList<gameactionlog_Dao>();
		 String sqlStr = "{ call GAMEACTIONLOG_PRO.GetGAMEACTIONLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				gameactionlog_Dao _obj = new gameactionlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setGameid(arr.getString("GAMEID"));
            _obj.setGameaction(arr.getString("GAMEACTION"));
            _obj.setActionip(arr.getString("ACTIONIP"));
            _obj.setActionprovince(arr.getString("ACTIONPROVINCE"));
           try{_obj.setActioncdate(dateformat.parse(arr.getString("ACTIONCDATE")));}catch(Exception ce){_obj.setActioncdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据GAMEACTIONLOG返回 分页数据
* @param GAMEACTIONLOG row
* @returnGAMEACTIONLOGList对象
* @throws Exception 
*/
public List<gameactionlog_Dao> get_gameactionlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<gameactionlog_Dao> _list = new ArrayList<gameactionlog_Dao>();
		String sqlStr = "{ call GAMEACTIONLOG_PRO.GetGAMEACTIONLOGPage(?,?,?,?,?,?)}";
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
				gameactionlog_Dao _obj = new gameactionlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setGameid(arr.getString("GAMEID"));
            _obj.setGameaction(arr.getString("GAMEACTION"));
            _obj.setActionip(arr.getString("ACTIONIP"));
            _obj.setActionprovince(arr.getString("ACTIONPROVINCE"));
            try{_obj.setActioncdate(dateformat.parse(arr.getString("ACTIONCDATE")));}catch(Exception ce){_obj.setActioncdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据GAMEACTIONLOG返回的查询DataRow创建一个GAMEACTIONLOGEntity对象
* @param GAMEACTIONLOG row
* @returnGAMEACTIONLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, gameactionlog_Dao> get_gameactionlog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicgameactionlogstrWhere") == null) {
			Dictionary<Integer, gameactionlog_Dao> _dic = new Hashtable<Integer, gameactionlog_Dao>();
			List<gameactionlog_Dao> _list = new ArrayList<gameactionlog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicgameactionlog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, gameactionlog_Dao> _dic = (Dictionary<Integer, gameactionlog_Dao>) classFactory
					.cacheGet("dicgameactionlogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新GAMEACTIONLOG字段加一
* @param FieldName
* @param sid
*/
public int create_gameactionlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call GAMEACTIONLOG_PRO.UpdateFieldGAMEACTIONLOG(?,?)}";
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
* 更新GAMEACTIONLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_gameactionlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call GAMEACTIONLOG_PRO.UpdateFieldGAMEACTIONLOGV(?,?,?)}";
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
* 更新GAMEACTIONLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_gameactionlog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call GAMEACTIONLOG_PRO.UpdateFieldGAMEACTIONLOGU(?,?,?)}";
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
