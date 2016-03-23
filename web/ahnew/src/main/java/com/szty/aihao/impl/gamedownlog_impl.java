/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataGamedownlog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.gamedownlog_Dao;
import com.szty.aihao.core.gamedownlog_core;
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
*@GAMEDOWNLOG数据接口
*@作者：宋春林 
*/
public class gamedownlog_impl implements gamedownlog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(gamedownlog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param GAMEDOWNLOG实体
* @return 新插入记录的编号
*/
public int insert_gamedownlog(gamedownlog_Dao _GAMEDOWNLOGModel)  throws Exception{
         String sqlStr = "{call GAMEDOWNLOG_PRO.InsertGAMEDOWNLOG(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_GAMEDOWNLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GAMEDOWNLOGModel.getGameid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GAMEDOWNLOGModel.getDownfrom());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_GAMEDOWNLOGModel.getDownip());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_GAMEDOWNLOGModel.getDownprovince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_GAMEDOWNLOGModel.getDowncdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param GAMEDOWNLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_gamedownlog(Object[] _para)  throws Exception{
      String sqlStr = "{call GAMEDOWNLOG_PRO.InsertGAMEDOWNLOG(?,?,?,?,?,?)}";
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
* @param GAMEDOWNLOG实体
* @return 影响的行数
*/
public int update_gamedownlog(gamedownlog_Dao _GAMEDOWNLOGModel)  throws Exception{
        String sqlStr = "{call GAMEDOWNLOG_PRO.UpdateGAMEDOWNLOG(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_GAMEDOWNLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GAMEDOWNLOGModel.getGameid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GAMEDOWNLOGModel.getDownfrom());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_GAMEDOWNLOGModel.getDownip());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_GAMEDOWNLOGModel.getDownprovince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_GAMEDOWNLOGModel.getDowncdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表GAMEDOWNLOG中的一条记录
* @param GAMEDOWNLOG实体
* @return 新插入记录的编号
*/
public int delete_gamedownlog(int Logid)  throws Exception{
        String sqlStr = "{call GAMEDOWNLOG_PRO.DeleteGAMEDOWNLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 gamedownlog 数据实体
* @param Logid">Logid
* @return<gamedownlog 数据实体
* @throws Exception 
*/
public gamedownlog_Dao get_gamedownlogDao(int Logid) throws Exception{
         String sqlStr = "{ call GAMEDOWNLOG_PRO.GetGAMEDOWNLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			gamedownlog_Dao _obj = new gamedownlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setGameid(arr.getString("GAMEID"));
            _obj.setDownfrom(arr.getString("DOWNFROM"));
            _obj.setDownip(arr.getString("DOWNIP"));
            _obj.setDownprovince(arr.getString("DOWNPROVINCE"));
             try{_obj.setDowncdate(dateformat.parse(arr.getString("DOWNCDATE")));}catch(Exception ce){_obj.setDowncdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据GAMEDOWNLOG返回的查询DataRow创建一个GAMEDOWNLOGEntity对象
* @param GAMEDOWNLOG row
* @returnGAMEDOWNLOGList对象
* @throws Exception 
*/
public List<gamedownlog_Dao> get_gamedownlog_All() throws Exception{
        List<gamedownlog_Dao> _list = new ArrayList<gamedownlog_Dao>();
		String sqlStr = "{ call GAMEDOWNLOG_PRO.GetGAMEDOWNLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			gamedownlog_Dao _obj = new gamedownlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setGameid(arr.getString("GAMEID"));
            _obj.setDownfrom(arr.getString("DOWNFROM"));
            _obj.setDownip(arr.getString("DOWNIP"));
            _obj.setDownprovince(arr.getString("DOWNPROVINCE"));
            try{_obj.setDowncdate(dateformat.parse(arr.getString("DOWNCDATE")));}catch(Exception ce){_obj.setDowncdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据GAMEDOWNLOG返回的查询DataRow创建一个GAMEDOWNLOGEntity对象
* @param GAMEDOWNLOG row
* @returnGAMEDOWNLOGList对象
* @throws Exception 
*/
public List< gamedownlog_Dao> get_gamedownlog_All(String strWhere) throws Exception{
         List<gamedownlog_Dao> _list = new ArrayList<gamedownlog_Dao>();
		 String sqlStr = "{ call GAMEDOWNLOG_PRO.GetGAMEDOWNLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				gamedownlog_Dao _obj = new gamedownlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setGameid(arr.getString("GAMEID"));
            _obj.setDownfrom(arr.getString("DOWNFROM"));
            _obj.setDownip(arr.getString("DOWNIP"));
            _obj.setDownprovince(arr.getString("DOWNPROVINCE"));
           try{_obj.setDowncdate(dateformat.parse(arr.getString("DOWNCDATE")));}catch(Exception ce){_obj.setDowncdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据GAMEDOWNLOG返回 分页数据
* @param GAMEDOWNLOG row
* @returnGAMEDOWNLOGList对象
* @throws Exception 
*/
public List<gamedownlog_Dao> get_gamedownlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<gamedownlog_Dao> _list = new ArrayList<gamedownlog_Dao>();
		String sqlStr = "{ call GAMEDOWNLOG_PRO.GetGAMEDOWNLOGPage(?,?,?,?,?,?)}";
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
				gamedownlog_Dao _obj = new gamedownlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setGameid(arr.getString("GAMEID"));
            _obj.setDownfrom(arr.getString("DOWNFROM"));
            _obj.setDownip(arr.getString("DOWNIP"));
            _obj.setDownprovince(arr.getString("DOWNPROVINCE"));
            try{_obj.setDowncdate(dateformat.parse(arr.getString("DOWNCDATE")));}catch(Exception ce){_obj.setDowncdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据GAMEDOWNLOG返回的查询DataRow创建一个GAMEDOWNLOGEntity对象
* @param GAMEDOWNLOG row
* @returnGAMEDOWNLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, gamedownlog_Dao> get_gamedownlog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicgamedownlogstrWhere") == null) {
			Dictionary<Integer, gamedownlog_Dao> _dic = new Hashtable<Integer, gamedownlog_Dao>();
			List<gamedownlog_Dao> _list = new ArrayList<gamedownlog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicgamedownlog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, gamedownlog_Dao> _dic = (Dictionary<Integer, gamedownlog_Dao>) classFactory
					.cacheGet("dicgamedownlogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新GAMEDOWNLOG字段加一
* @param FieldName
* @param sid
*/
public int create_gamedownlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call GAMEDOWNLOG_PRO.UpdateFieldGAMEDOWNLOG(?,?)}";
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
* 更新GAMEDOWNLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_gamedownlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call GAMEDOWNLOG_PRO.UpdateFieldGAMEDOWNLOGV(?,?,?)}";
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
* 更新GAMEDOWNLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_gamedownlog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call GAMEDOWNLOG_PRO.UpdateFieldGAMEDOWNLOGU(?,?,?)}";
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
