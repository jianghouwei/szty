/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataExpruletable.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.expruletable_Dao;
import com.szty.aihao.core.expruletable_core;
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
*@EXPRULETABLE数据接口
*@作者：宋春林 
*/
public class expruletable_impl implements expruletable_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(expruletable_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param EXPRULETABLE实体
* @return 新插入记录的编号
*/
public int insert_expruletable(expruletable_Dao _EXPRULETABLEModel)  throws Exception{
         String sqlStr = "{call EXPRULETABLE_PRO.InsertEXPRULETABLE(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_EXPRULETABLEModel.getRuleid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_EXPRULETABLEModel.getRulename());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_EXPRULETABLEModel.getRuleexp());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_EXPRULETABLEModel.getRuletime());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_EXPRULETABLEModel.getRuletype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_EXPRULETABLEModel.getRulecdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param EXPRULETABLE
* @Object 
* @return 新插入记录的编号
*/
public int insert_expruletable(Object[] _para)  throws Exception{
      String sqlStr = "{call EXPRULETABLE_PRO.InsertEXPRULETABLE(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param EXPRULETABLE实体
* @return 影响的行数
*/
public int update_expruletable(expruletable_Dao _EXPRULETABLEModel)  throws Exception{
        String sqlStr = "{call EXPRULETABLE_PRO.UpdateEXPRULETABLE(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_EXPRULETABLEModel.getRuleid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_EXPRULETABLEModel.getRulename());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_EXPRULETABLEModel.getRuleexp());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_EXPRULETABLEModel.getRuletime());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_EXPRULETABLEModel.getRuletype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_EXPRULETABLEModel.getRulecdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表EXPRULETABLE中的一条记录
* @param EXPRULETABLE实体
* @return 新插入记录的编号
*/
public int delete_expruletable(int Ruleid)  throws Exception{
        String sqlStr = "{call EXPRULETABLE_PRO.DeleteEXPRULETABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Ruleid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 expruletable 数据实体
* @param Ruleid">Ruleid
* @return<expruletable 数据实体
* @throws Exception 
*/
public expruletable_Dao get_expruletableDao(int Ruleid) throws Exception{
         String sqlStr = "{ call EXPRULETABLE_PRO.GetEXPRULETABLEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Ruleid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			expruletable_Dao _obj = new expruletable_Dao();
            _obj.setRuleid(arr.getInt("RULEID"));
            _obj.setRulename(arr.getString("RULENAME"));
            _obj.setRuleexp(arr.getInt("RULEEXP"));
            _obj.setRuletime(arr.getInt("RULETIME"));
            _obj.setRuletype(arr.getInt("RULETYPE"));
             try{_obj.setRulecdate(dateformat.parse(arr.getString("RULECDATE")));}catch(Exception ce){_obj.setRulecdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据EXPRULETABLE返回的查询DataRow创建一个EXPRULETABLEEntity对象
* @param EXPRULETABLE row
* @returnEXPRULETABLEList对象
* @throws Exception 
*/
public List<expruletable_Dao> get_expruletable_All() throws Exception{
        List<expruletable_Dao> _list = new ArrayList<expruletable_Dao>();
		String sqlStr = "{ call EXPRULETABLE_PRO.GetEXPRULETABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			expruletable_Dao _obj = new expruletable_Dao();
            _obj.setRuleid(arr.getInt("RULEID"));
            _obj.setRulename(arr.getString("RULENAME"));
            _obj.setRuleexp(arr.getInt("RULEEXP"));
            _obj.setRuletime(arr.getInt("RULETIME"));
            _obj.setRuletype(arr.getInt("RULETYPE"));
            try{_obj.setRulecdate(dateformat.parse(arr.getString("RULECDATE")));}catch(Exception ce){_obj.setRulecdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据EXPRULETABLE返回的查询DataRow创建一个EXPRULETABLEEntity对象
* @param EXPRULETABLE row
* @returnEXPRULETABLEList对象
* @throws Exception 
*/
public List< expruletable_Dao> get_expruletable_All(String strWhere) throws Exception{
         List<expruletable_Dao> _list = new ArrayList<expruletable_Dao>();
		 String sqlStr = "{ call EXPRULETABLE_PRO.GetEXPRULETABLEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				expruletable_Dao _obj = new expruletable_Dao();
            _obj.setRuleid(arr.getInt("RULEID"));
            _obj.setRulename(arr.getString("RULENAME"));
            _obj.setRuleexp(arr.getInt("RULEEXP"));
            _obj.setRuletime(arr.getInt("RULETIME"));
            _obj.setRuletype(arr.getInt("RULETYPE"));
           try{_obj.setRulecdate(dateformat.parse(arr.getString("RULECDATE")));}catch(Exception ce){_obj.setRulecdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据EXPRULETABLE返回 分页数据
* @param EXPRULETABLE row
* @returnEXPRULETABLEList对象
* @throws Exception 
*/
public List<expruletable_Dao> get_expruletable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<expruletable_Dao> _list = new ArrayList<expruletable_Dao>();
		String sqlStr = "{ call EXPRULETABLE_PRO.GetEXPRULETABLEPage(?,?,?,?,?,?)}";
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
				expruletable_Dao _obj = new expruletable_Dao();
            _obj.setRuleid(arr.getInt("RULEID"));
            _obj.setRulename(arr.getString("RULENAME"));
            _obj.setRuleexp(arr.getInt("RULEEXP"));
            _obj.setRuletime(arr.getInt("RULETIME"));
            _obj.setRuletype(arr.getInt("RULETYPE"));
            try{_obj.setRulecdate(dateformat.parse(arr.getString("RULECDATE")));}catch(Exception ce){_obj.setRulecdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据EXPRULETABLE返回的查询DataRow创建一个EXPRULETABLEEntity对象
* @param EXPRULETABLE row
* @returnEXPRULETABLEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, expruletable_Dao> get_expruletable_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicexpruletablestrWhere") == null) {
			Dictionary<Integer, expruletable_Dao> _dic = new Hashtable<Integer, expruletable_Dao>();
			List<expruletable_Dao> _list = new ArrayList<expruletable_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getRuleid()), _list.get(i));
			}
			classFactory.cachePut("dicexpruletable", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, expruletable_Dao> _dic = (Dictionary<Integer, expruletable_Dao>) classFactory
					.cacheGet("dicexpruletablestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新EXPRULETABLE字段加一
* @param FieldName
* @param sid
*/
public int create_expruletable_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call EXPRULETABLE_PRO.UpdateFieldEXPRULETABLE(?,?)}";
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
* 更新EXPRULETABLEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_expruletable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call EXPRULETABLE_PRO.UpdateFieldEXPRULETABLEV(?,?,?)}";
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
* 更新EXPRULETABLEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_expruletable_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call EXPRULETABLE_PRO.UpdateFieldEXPRULETABLEU(?,?,?)}";
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
