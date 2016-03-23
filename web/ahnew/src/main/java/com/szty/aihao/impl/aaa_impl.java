/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAaa.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aaa_Dao;
import com.szty.aihao.core.aaa_core;
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
*@AAA数据接口
*@作者：宋春林 
*/
public class aaa_impl implements aaa_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aaa_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AAA实体
* @return 新插入记录的编号
*/
public int insert_aaa(aaa_Dao _AAAModel)  throws Exception{
         String sqlStr = "{call AAA_PRO.InsertAAA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[20];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AAAModel.getGameid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamename());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DOUBLE,_AAAModel.getGamestar());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamestyle());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DOUBLE,_AAAModel.getGamesize());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamever());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamefrom());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamedownnum());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamereviewnum());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGameicon());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamepics());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGameintro());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_AAAModel.getGameudate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamelimit());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamecategoryid());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamecategoryname());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGameprice());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamehotflag());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamestatus());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamedownloadurl());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AAA
* @Object 
* @return 新插入记录的编号
*/
public int insert_aaa(Object[] _para)  throws Exception{
      String sqlStr = "{call AAA_PRO.InsertAAA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[20];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DOUBLE,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DOUBLE,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_para[12]));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_para[16]);
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_para[17]);
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_para[18]);
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_para[19]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AAA实体
* @return 影响的行数
*/
public int update_aaa(aaa_Dao _AAAModel)  throws Exception{
        String sqlStr = "{call AAA_PRO.UpdateAAA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[20];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AAAModel.getGameid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamename());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DOUBLE,_AAAModel.getGamestar());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamestyle());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DOUBLE,_AAAModel.getGamesize());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamever());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamefrom());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamedownnum());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamereviewnum());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGameicon());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamepics());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGameintro());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.DATE, dateformat.format(_AAAModel.getGameudate()));
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamelimit());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamecategoryid());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamecategoryname());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGameprice());
        op[17]= new OracleParameter(18, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamehotflag());
        op[18]= new OracleParameter(19, "IN", java.sql.Types.NUMERIC,_AAAModel.getGamestatus());
        op[19]= new OracleParameter(20, "IN", java.sql.Types.NVARCHAR,_AAAModel.getGamedownloadurl());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AAA中的一条记录
* @param AAA实体
* @return 新插入记录的编号
*/
public int delete_aaa(int Gameid)  throws Exception{
        String sqlStr = "{call AAA_PRO.DeleteAAA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Gameid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aaa 数据实体
* @param Gameid">Gameid
* @return<aaa 数据实体
* @throws Exception 
*/
public aaa_Dao get_aaaDao(int Gameid) throws Exception{
         String sqlStr = "{ call AAA_PRO.GetAAAEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Gameid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aaa_Dao _obj = new aaa_Dao();
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setGamename(arr.getString("GAMENAME"));
            _obj.setGamestyle(arr.getInt("GAMESTYLE"));
            _obj.setGamever(arr.getString("GAMEVER"));
            _obj.setGamefrom(arr.getString("GAMEFROM"));
            _obj.setGamedownnum(arr.getInt("GAMEDOWNNUM"));
            _obj.setGamereviewnum(arr.getInt("GAMEREVIEWNUM"));
            _obj.setGameicon(arr.getString("GAMEICON"));
            _obj.setGamepics(arr.getString("GAMEPICS"));
            _obj.setGameintro(arr.getString("GAMEINTRO"));
             try{_obj.setGameudate(dateformat.parse(arr.getString("GAMEUDATE")));}catch(Exception ce){_obj.setGameudate((new Date()));}
            _obj.setGamelimit(arr.getString("GAMELIMIT"));
            _obj.setGamecategoryid(arr.getInt("GAMECATEGORYID"));
            _obj.setGamecategoryname(arr.getString("GAMECATEGORYNAME"));
            _obj.setGameprice(arr.getString("GAMEPRICE"));
            _obj.setGamehotflag(arr.getInt("GAMEHOTFLAG"));
            _obj.setGamestatus(arr.getInt("GAMESTATUS"));
            _obj.setGamedownloadurl(arr.getString("GAMEDOWNLOADURL"));
			return _obj;
		}
		return null;

}

/**
* 根据AAA返回的查询DataRow创建一个AAAEntity对象
* @param AAA row
* @returnAAAList对象
* @throws Exception 
*/
public List<aaa_Dao> get_aaa_All() throws Exception{
        List<aaa_Dao> _list = new ArrayList<aaa_Dao>();
		String sqlStr = "{ call AAA_PRO.GetAAA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aaa_Dao _obj = new aaa_Dao();
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setGamename(arr.getString("GAMENAME"));
            _obj.setGamestyle(arr.getInt("GAMESTYLE"));
            _obj.setGamever(arr.getString("GAMEVER"));
            _obj.setGamefrom(arr.getString("GAMEFROM"));
            _obj.setGamedownnum(arr.getInt("GAMEDOWNNUM"));
            _obj.setGamereviewnum(arr.getInt("GAMEREVIEWNUM"));
            _obj.setGameicon(arr.getString("GAMEICON"));
            _obj.setGamepics(arr.getString("GAMEPICS"));
            _obj.setGameintro(arr.getString("GAMEINTRO"));
            try{_obj.setGameudate(dateformat.parse(arr.getString("GAMEUDATE")));}catch(Exception ce){_obj.setGameudate((new Date()));}
            _obj.setGamelimit(arr.getString("GAMELIMIT"));
            _obj.setGamecategoryid(arr.getInt("GAMECATEGORYID"));
            _obj.setGamecategoryname(arr.getString("GAMECATEGORYNAME"));
            _obj.setGameprice(arr.getString("GAMEPRICE"));
            _obj.setGamehotflag(arr.getInt("GAMEHOTFLAG"));
            _obj.setGamestatus(arr.getInt("GAMESTATUS"));
            _obj.setGamedownloadurl(arr.getString("GAMEDOWNLOADURL"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AAA返回的查询DataRow创建一个AAAEntity对象
* @param AAA row
* @returnAAAList对象
* @throws Exception 
*/
public List< aaa_Dao> get_aaa_All(String strWhere) throws Exception{
         List<aaa_Dao> _list = new ArrayList<aaa_Dao>();
		 String sqlStr = "{ call AAA_PRO.GetAAAWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aaa_Dao _obj = new aaa_Dao();
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setGamename(arr.getString("GAMENAME"));
            _obj.setGamestyle(arr.getInt("GAMESTYLE"));
            _obj.setGamever(arr.getString("GAMEVER"));
            _obj.setGamefrom(arr.getString("GAMEFROM"));
            _obj.setGamedownnum(arr.getInt("GAMEDOWNNUM"));
            _obj.setGamereviewnum(arr.getInt("GAMEREVIEWNUM"));
            _obj.setGameicon(arr.getString("GAMEICON"));
            _obj.setGamepics(arr.getString("GAMEPICS"));
            _obj.setGameintro(arr.getString("GAMEINTRO"));
           try{_obj.setGameudate(dateformat.parse(arr.getString("GAMEUDATE")));}catch(Exception ce){_obj.setGameudate((new Date()));}
            _obj.setGamelimit(arr.getString("GAMELIMIT"));
            _obj.setGamecategoryid(arr.getInt("GAMECATEGORYID"));
            _obj.setGamecategoryname(arr.getString("GAMECATEGORYNAME"));
            _obj.setGameprice(arr.getString("GAMEPRICE"));
            _obj.setGamehotflag(arr.getInt("GAMEHOTFLAG"));
            _obj.setGamestatus(arr.getInt("GAMESTATUS"));
            _obj.setGamedownloadurl(arr.getString("GAMEDOWNLOADURL"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AAA返回 分页数据
* @param AAA row
* @returnAAAList对象
* @throws Exception 
*/
public List<aaa_Dao> get_aaa_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aaa_Dao> _list = new ArrayList<aaa_Dao>();
		String sqlStr = "{ call AAA_PRO.GetAAAPage(?,?,?,?,?,?)}";
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
				aaa_Dao _obj = new aaa_Dao();
            _obj.setGameid(arr.getInt("GAMEID"));
            _obj.setGamename(arr.getString("GAMENAME"));
            _obj.setGamestyle(arr.getInt("GAMESTYLE"));
            _obj.setGamever(arr.getString("GAMEVER"));
            _obj.setGamefrom(arr.getString("GAMEFROM"));
            _obj.setGamedownnum(arr.getInt("GAMEDOWNNUM"));
            _obj.setGamereviewnum(arr.getInt("GAMEREVIEWNUM"));
            _obj.setGameicon(arr.getString("GAMEICON"));
            _obj.setGamepics(arr.getString("GAMEPICS"));
            _obj.setGameintro(arr.getString("GAMEINTRO"));
            try{_obj.setGameudate(dateformat.parse(arr.getString("GAMEUDATE")));}catch(Exception ce){_obj.setGameudate((new Date()));}
            _obj.setGamelimit(arr.getString("GAMELIMIT"));
            _obj.setGamecategoryid(arr.getInt("GAMECATEGORYID"));
            _obj.setGamecategoryname(arr.getString("GAMECATEGORYNAME"));
            _obj.setGameprice(arr.getString("GAMEPRICE"));
            _obj.setGamehotflag(arr.getInt("GAMEHOTFLAG"));
            _obj.setGamestatus(arr.getInt("GAMESTATUS"));
            _obj.setGamedownloadurl(arr.getString("GAMEDOWNLOADURL"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AAA返回的查询DataRow创建一个AAAEntity对象
* @param AAA row
* @returnAAADictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aaa_Dao> get_aaa_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaaastrWhere") == null) {
			Dictionary<Integer, aaa_Dao> _dic = new Hashtable<Integer, aaa_Dao>();
			List<aaa_Dao> _list = new ArrayList<aaa_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGameid()), _list.get(i));
			}
			classFactory.cachePut("dicaaa", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aaa_Dao> _dic = (Dictionary<Integer, aaa_Dao>) classFactory
					.cacheGet("dicaaastrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AAA字段加一
* @param FieldName
* @param sid
*/
public int create_aaa_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AAA_PRO.UpdateFieldAAA(?,?)}";
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
* 更新AAAInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aaa_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AAA_PRO.UpdateFieldAAAV(?,?,?)}";
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
* 更新AAAIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aaa_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AAA_PRO.UpdateFieldAAAU(?,?,?)}";
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
