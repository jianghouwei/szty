﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTemp_aaa.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.temp_aaa_Dao;
import com.szty.aihao.core.temp_aaa_core;
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
*@TEMP_AAA数据接口
*@作者：宋春林 
*/
public class temp_aaa_impl implements temp_aaa_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(temp_aaa_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TEMP_AAA实体
* @return 新插入记录的编号
*/
public int insert_temp_aaa(temp_aaa_Dao _TEMP_AAAModel)  throws Exception{
         String sqlStr = "{call TEMP_AAA_PRO.InsertTEMP_AAA(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TEMP_AAAModel.getPrefix());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TEMP_AAAModel.getMobile());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TEMP_AAA
* @Object 
* @return 新插入记录的编号
*/
public int insert_temp_aaa(Object[] _para)  throws Exception{
      String sqlStr = "{call TEMP_AAA_PRO.InsertTEMP_AAA(?,?)}";
	  OracleParameter[] op = new OracleParameter[2];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TEMP_AAA实体
* @return 影响的行数
*/
public int update_temp_aaa(temp_aaa_Dao _TEMP_AAAModel)  throws Exception{
        String sqlStr = "{call TEMP_AAA_PRO.UpdateTEMP_AAA(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_TEMP_AAAModel.getPrefix());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TEMP_AAAModel.getMobile());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TEMP_AAA中的一条记录
* @param TEMP_AAA实体
* @return 新插入记录的编号
*/
public int delete_temp_aaa(int Prefix)  throws Exception{
        String sqlStr = "{call TEMP_AAA_PRO.DeleteTEMP_AAA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Prefix);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 temp_aaa 数据实体
* @param Prefix">Prefix
* @return<temp_aaa 数据实体
* @throws Exception 
*/
public temp_aaa_Dao get_temp_aaaDao(int Prefix) throws Exception{
         String sqlStr = "{ call TEMP_AAA_PRO.GetTEMP_AAAEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Prefix);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			temp_aaa_Dao _obj = new temp_aaa_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setMobile(arr.getString("MOBILE"));
			return _obj;
		}
		return null;

}

/**
* 根据TEMP_AAA返回的查询DataRow创建一个TEMP_AAAEntity对象
* @param TEMP_AAA row
* @returnTEMP_AAAList对象
* @throws Exception 
*/
public List<temp_aaa_Dao> get_temp_aaa_All() throws Exception{
        List<temp_aaa_Dao> _list = new ArrayList<temp_aaa_Dao>();
		String sqlStr = "{ call TEMP_AAA_PRO.GetTEMP_AAA(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			temp_aaa_Dao _obj = new temp_aaa_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setMobile(arr.getString("MOBILE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TEMP_AAA返回的查询DataRow创建一个TEMP_AAAEntity对象
* @param TEMP_AAA row
* @returnTEMP_AAAList对象
* @throws Exception 
*/
public List< temp_aaa_Dao> get_temp_aaa_All(String strWhere) throws Exception{
         List<temp_aaa_Dao> _list = new ArrayList<temp_aaa_Dao>();
		 String sqlStr = "{ call TEMP_AAA_PRO.GetTEMP_AAAWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				temp_aaa_Dao _obj = new temp_aaa_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setMobile(arr.getString("MOBILE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TEMP_AAA返回 分页数据
* @param TEMP_AAA row
* @returnTEMP_AAAList对象
* @throws Exception 
*/
public List<temp_aaa_Dao> get_temp_aaa_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<temp_aaa_Dao> _list = new ArrayList<temp_aaa_Dao>();
		String sqlStr = "{ call TEMP_AAA_PRO.GetTEMP_AAAPage(?,?,?,?,?,?)}";
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
				temp_aaa_Dao _obj = new temp_aaa_Dao();
            _obj.setPrefix(arr.getString("PREFIX"));
            _obj.setMobile(arr.getString("MOBILE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TEMP_AAA返回的查询DataRow创建一个TEMP_AAAEntity对象
* @param TEMP_AAA row
* @returnTEMP_AAADictionary对象
* @throws Exception 
*/
public Dictionary<Integer, temp_aaa_Dao> get_temp_aaa_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictemp_aaastrWhere") == null) {
			Dictionary<Integer, temp_aaa_Dao> _dic = new Hashtable<Integer, temp_aaa_Dao>();
			List<temp_aaa_Dao> _list = new ArrayList<temp_aaa_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getPrefix()), _list.get(i));
			}
			classFactory.cachePut("dictemp_aaa", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, temp_aaa_Dao> _dic = (Dictionary<Integer, temp_aaa_Dao>) classFactory
					.cacheGet("dictemp_aaastrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TEMP_AAA字段加一
* @param FieldName
* @param sid
*/
public int create_temp_aaa_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TEMP_AAA_PRO.UpdateFieldTEMP_AAA(?,?)}";
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
* 更新TEMP_AAAInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_temp_aaa_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TEMP_AAA_PRO.UpdateFieldTEMP_AAAV(?,?,?)}";
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
* 更新TEMP_AAAIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_temp_aaa_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TEMP_AAA_PRO.UpdateFieldTEMP_AAAU(?,?,?)}";
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
