﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoiptmp35.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoiptmp35_Dao;
import com.szty.aihao.core.aihaoiptmp35_core;
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
*@AIHAOIPTMP35数据接口
*@作者：宋春林 
*/
public class aihaoiptmp35_impl implements aihaoiptmp35_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoiptmp35_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOIPTMP35实体
* @return 新插入记录的编号
*/
public int insert_aihaoiptmp35(aihaoiptmp35_Dao _AIHAOIPTMP35Model)  throws Exception{
         String sqlStr = "{call AIHAOIPTMP35_PRO.InsertAIHAOIPTMP35(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOIPTMP35Model.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP35Model.getX());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP35Model.getY());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOIPTMP35
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoiptmp35(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOIPTMP35_PRO.InsertAIHAOIPTMP35(?,?,?)}";
	  OracleParameter[] op = new OracleParameter[3];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOIPTMP35实体
* @return 影响的行数
*/
public int update_aihaoiptmp35(aihaoiptmp35_Dao _AIHAOIPTMP35Model)  throws Exception{
        String sqlStr = "{call AIHAOIPTMP35_PRO.UpdateAIHAOIPTMP35(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP35Model.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP35Model.getX());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP35Model.getY());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOIPTMP35中的一条记录
* @param AIHAOIPTMP35实体
* @return 新插入记录的编号
*/
public int delete_aihaoiptmp35(int Id)  throws Exception{
        String sqlStr = "{call AIHAOIPTMP35_PRO.DeleteAIHAOIPTMP35(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoiptmp35 数据实体
* @param Id">Id
* @return<aihaoiptmp35 数据实体
* @throws Exception 
*/
public aihaoiptmp35_Dao get_aihaoiptmp35Dao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOIPTMP35_PRO.GetAIHAOIPTMP35Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoiptmp35_Dao _obj = new aihaoiptmp35_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOIPTMP35返回的查询DataRow创建一个AIHAOIPTMP35Entity对象
* @param AIHAOIPTMP35 row
* @returnAIHAOIPTMP35List对象
* @throws Exception 
*/
public List<aihaoiptmp35_Dao> get_aihaoiptmp35_All() throws Exception{
        List<aihaoiptmp35_Dao> _list = new ArrayList<aihaoiptmp35_Dao>();
		String sqlStr = "{ call AIHAOIPTMP35_PRO.GetAIHAOIPTMP35(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoiptmp35_Dao _obj = new aihaoiptmp35_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOIPTMP35返回的查询DataRow创建一个AIHAOIPTMP35Entity对象
* @param AIHAOIPTMP35 row
* @returnAIHAOIPTMP35List对象
* @throws Exception 
*/
public List< aihaoiptmp35_Dao> get_aihaoiptmp35_All(String strWhere) throws Exception{
         List<aihaoiptmp35_Dao> _list = new ArrayList<aihaoiptmp35_Dao>();
		 String sqlStr = "{ call AIHAOIPTMP35_PRO.GetAIHAOIPTMP35Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoiptmp35_Dao _obj = new aihaoiptmp35_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOIPTMP35返回 分页数据
* @param AIHAOIPTMP35 row
* @returnAIHAOIPTMP35List对象
* @throws Exception 
*/
public List<aihaoiptmp35_Dao> get_aihaoiptmp35_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoiptmp35_Dao> _list = new ArrayList<aihaoiptmp35_Dao>();
		String sqlStr = "{ call AIHAOIPTMP35_PRO.GetAIHAOIPTMP35Page(?,?,?,?,?,?)}";
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
				aihaoiptmp35_Dao _obj = new aihaoiptmp35_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOIPTMP35返回的查询DataRow创建一个AIHAOIPTMP35Entity对象
* @param AIHAOIPTMP35 row
* @returnAIHAOIPTMP35Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoiptmp35_Dao> get_aihaoiptmp35_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoiptmp35strWhere") == null) {
			Dictionary<Integer, aihaoiptmp35_Dao> _dic = new Hashtable<Integer, aihaoiptmp35_Dao>();
			List<aihaoiptmp35_Dao> _list = new ArrayList<aihaoiptmp35_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoiptmp35", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoiptmp35_Dao> _dic = (Dictionary<Integer, aihaoiptmp35_Dao>) classFactory
					.cacheGet("dicaihaoiptmp35strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOIPTMP35字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoiptmp35_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOIPTMP35_PRO.UpdateFieldAIHAOIPTMP35(?,?)}";
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
* 更新AIHAOIPTMP35Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoiptmp35_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOIPTMP35_PRO.UpdateFieldAIHAOIPTMP35V(?,?,?)}";
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
* 更新AIHAOIPTMP35IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoiptmp35_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOIPTMP35_PRO.UpdateFieldAIHAOIPTMP35U(?,?,?)}";
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
