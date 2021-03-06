﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataT_stat_weekly3.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.t_stat_weekly3_Dao;
import com.szty.aihao.core.t_stat_weekly3_core;
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
*@T_STAT_WEEKLY3数据接口
*@作者：宋春林 
*/
public class t_stat_weekly3_impl implements t_stat_weekly3_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(t_stat_weekly3_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param T_STAT_WEEKLY3实体
* @return 新插入记录的编号
*/
public int insert_t_stat_weekly3(t_stat_weekly3_Dao _T_STAT_WEEKLY3Model)  throws Exception{
         String sqlStr = "{call T_STAT_WEEKLY3_PRO.InsertT_STAT_WEEKLY3(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_T_STAT_WEEKLY3Model.getItem());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_T_STAT_WEEKLY3Model.getRmk1());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_T_STAT_WEEKLY3Model.getRmk2());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param T_STAT_WEEKLY3
* @Object 
* @return 新插入记录的编号
*/
public int insert_t_stat_weekly3(Object[] _para)  throws Exception{
      String sqlStr = "{call T_STAT_WEEKLY3_PRO.InsertT_STAT_WEEKLY3(?,?,?)}";
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
* @param T_STAT_WEEKLY3实体
* @return 影响的行数
*/
public int update_t_stat_weekly3(t_stat_weekly3_Dao _T_STAT_WEEKLY3Model)  throws Exception{
        String sqlStr = "{call T_STAT_WEEKLY3_PRO.UpdateT_STAT_WEEKLY3(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_T_STAT_WEEKLY3Model.getItem());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_T_STAT_WEEKLY3Model.getRmk1());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_T_STAT_WEEKLY3Model.getRmk2());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表T_STAT_WEEKLY3中的一条记录
* @param T_STAT_WEEKLY3实体
* @return 新插入记录的编号
*/
public int delete_t_stat_weekly3(int Item)  throws Exception{
        String sqlStr = "{call T_STAT_WEEKLY3_PRO.DeleteT_STAT_WEEKLY3(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Item);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 t_stat_weekly3 数据实体
* @param Item">Item
* @return<t_stat_weekly3 数据实体
* @throws Exception 
*/
public t_stat_weekly3_Dao get_t_stat_weekly3Dao(int Item) throws Exception{
         String sqlStr = "{ call T_STAT_WEEKLY3_PRO.GetT_STAT_WEEKLY3Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Item);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_stat_weekly3_Dao _obj = new t_stat_weekly3_Dao();
            _obj.setItem(arr.getString("ITEM"));
            _obj.setRmk1(arr.getString("RMK1"));
            _obj.setRmk2(arr.getString("RMK2"));
			return _obj;
		}
		return null;

}

/**
* 根据T_STAT_WEEKLY3返回的查询DataRow创建一个T_STAT_WEEKLY3Entity对象
* @param T_STAT_WEEKLY3 row
* @returnT_STAT_WEEKLY3List对象
* @throws Exception 
*/
public List<t_stat_weekly3_Dao> get_t_stat_weekly3_All() throws Exception{
        List<t_stat_weekly3_Dao> _list = new ArrayList<t_stat_weekly3_Dao>();
		String sqlStr = "{ call T_STAT_WEEKLY3_PRO.GetT_STAT_WEEKLY3(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_stat_weekly3_Dao _obj = new t_stat_weekly3_Dao();
            _obj.setItem(arr.getString("ITEM"));
            _obj.setRmk1(arr.getString("RMK1"));
            _obj.setRmk2(arr.getString("RMK2"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据T_STAT_WEEKLY3返回的查询DataRow创建一个T_STAT_WEEKLY3Entity对象
* @param T_STAT_WEEKLY3 row
* @returnT_STAT_WEEKLY3List对象
* @throws Exception 
*/
public List< t_stat_weekly3_Dao> get_t_stat_weekly3_All(String strWhere) throws Exception{
         List<t_stat_weekly3_Dao> _list = new ArrayList<t_stat_weekly3_Dao>();
		 String sqlStr = "{ call T_STAT_WEEKLY3_PRO.GetT_STAT_WEEKLY3Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				t_stat_weekly3_Dao _obj = new t_stat_weekly3_Dao();
            _obj.setItem(arr.getString("ITEM"));
            _obj.setRmk1(arr.getString("RMK1"));
            _obj.setRmk2(arr.getString("RMK2"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据T_STAT_WEEKLY3返回 分页数据
* @param T_STAT_WEEKLY3 row
* @returnT_STAT_WEEKLY3List对象
* @throws Exception 
*/
public List<t_stat_weekly3_Dao> get_t_stat_weekly3_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<t_stat_weekly3_Dao> _list = new ArrayList<t_stat_weekly3_Dao>();
		String sqlStr = "{ call T_STAT_WEEKLY3_PRO.GetT_STAT_WEEKLY3Page(?,?,?,?,?,?)}";
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
				t_stat_weekly3_Dao _obj = new t_stat_weekly3_Dao();
            _obj.setItem(arr.getString("ITEM"));
            _obj.setRmk1(arr.getString("RMK1"));
            _obj.setRmk2(arr.getString("RMK2"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据T_STAT_WEEKLY3返回的查询DataRow创建一个T_STAT_WEEKLY3Entity对象
* @param T_STAT_WEEKLY3 row
* @returnT_STAT_WEEKLY3Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, t_stat_weekly3_Dao> get_t_stat_weekly3_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dict_stat_weekly3strWhere") == null) {
			Dictionary<Integer, t_stat_weekly3_Dao> _dic = new Hashtable<Integer, t_stat_weekly3_Dao>();
			List<t_stat_weekly3_Dao> _list = new ArrayList<t_stat_weekly3_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getItem()), _list.get(i));
			}
			classFactory.cachePut("dict_stat_weekly3", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, t_stat_weekly3_Dao> _dic = (Dictionary<Integer, t_stat_weekly3_Dao>) classFactory
					.cacheGet("dict_stat_weekly3strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新T_STAT_WEEKLY3字段加一
* @param FieldName
* @param sid
*/
public int create_t_stat_weekly3_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call T_STAT_WEEKLY3_PRO.UpdateFieldT_STAT_WEEKLY3(?,?)}";
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
* 更新T_STAT_WEEKLY3Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_t_stat_weekly3_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call T_STAT_WEEKLY3_PRO.UpdateFieldT_STAT_WEEKLY3V(?,?,?)}";
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
* 更新T_STAT_WEEKLY3IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_t_stat_weekly3_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call T_STAT_WEEKLY3_PRO.UpdateFieldT_STAT_WEEKLY3U(?,?,?)}";
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
