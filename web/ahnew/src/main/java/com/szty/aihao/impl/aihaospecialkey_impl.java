﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaospecialkey.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaospecialkey_Dao;
import com.szty.aihao.core.aihaospecialkey_core;
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
*@AIHAOSPECIALKEY数据接口
*@作者：宋春林 
*/
public class aihaospecialkey_impl implements aihaospecialkey_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaospecialkey_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOSPECIALKEY实体
* @return 新插入记录的编号
*/
public int insert_aihaospecialkey(aihaospecialkey_Dao _AIHAOSPECIALKEYModel)  throws Exception{
         String sqlStr = "{call AIHAOSPECIALKEY_PRO.InsertAIHAOSPECIALKEY(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOSPECIALKEYModel.getSpecialkeyid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOSPECIALKEYModel.getSpecialkeyname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOSPECIALKEYModel.getSpecialcontain());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAOSPECIALKEYModel.getStatus());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOSPECIALKEYModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOSPECIALKEY
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaospecialkey(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOSPECIALKEY_PRO.InsertAIHAOSPECIALKEY(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOSPECIALKEY实体
* @return 影响的行数
*/
public int update_aihaospecialkey(aihaospecialkey_Dao _AIHAOSPECIALKEYModel)  throws Exception{
        String sqlStr = "{call AIHAOSPECIALKEY_PRO.UpdateAIHAOSPECIALKEY(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOSPECIALKEYModel.getSpecialkeyid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOSPECIALKEYModel.getSpecialkeyname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOSPECIALKEYModel.getSpecialcontain());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAOSPECIALKEYModel.getStatus());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOSPECIALKEYModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOSPECIALKEY中的一条记录
* @param AIHAOSPECIALKEY实体
* @return 新插入记录的编号
*/
public int delete_aihaospecialkey(int Specialkeyid)  throws Exception{
        String sqlStr = "{call AIHAOSPECIALKEY_PRO.DeleteAIHAOSPECIALKEY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Specialkeyid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaospecialkey 数据实体
* @param Specialkeyid">Specialkeyid
* @return<aihaospecialkey 数据实体
* @throws Exception 
*/
public aihaospecialkey_Dao get_aihaospecialkeyDao(int Specialkeyid) throws Exception{
         String sqlStr = "{ call AIHAOSPECIALKEY_PRO.GetAIHAOSPECIALKEYEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Specialkeyid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaospecialkey_Dao _obj = new aihaospecialkey_Dao();
            _obj.setSpecialkeyid(arr.getInt("SPECIALKEYID"));
            _obj.setSpecialkeyname(arr.getString("SPECIALKEYNAME"));
            _obj.setSpecialcontain(arr.getString("SPECIALCONTAIN"));
            _obj.setStatus(arr.getInt("STATUS"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOSPECIALKEY返回的查询DataRow创建一个AIHAOSPECIALKEYEntity对象
* @param AIHAOSPECIALKEY row
* @returnAIHAOSPECIALKEYList对象
* @throws Exception 
*/
public List<aihaospecialkey_Dao> get_aihaospecialkey_All() throws Exception{
        List<aihaospecialkey_Dao> _list = new ArrayList<aihaospecialkey_Dao>();
		String sqlStr = "{ call AIHAOSPECIALKEY_PRO.GetAIHAOSPECIALKEY(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaospecialkey_Dao _obj = new aihaospecialkey_Dao();
            _obj.setSpecialkeyid(arr.getInt("SPECIALKEYID"));
            _obj.setSpecialkeyname(arr.getString("SPECIALKEYNAME"));
            _obj.setSpecialcontain(arr.getString("SPECIALCONTAIN"));
            _obj.setStatus(arr.getInt("STATUS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOSPECIALKEY返回的查询DataRow创建一个AIHAOSPECIALKEYEntity对象
* @param AIHAOSPECIALKEY row
* @returnAIHAOSPECIALKEYList对象
* @throws Exception 
*/
public List< aihaospecialkey_Dao> get_aihaospecialkey_All(String strWhere) throws Exception{
         List<aihaospecialkey_Dao> _list = new ArrayList<aihaospecialkey_Dao>();
		 String sqlStr = "{ call AIHAOSPECIALKEY_PRO.GetAIHAOSPECIALKEYWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaospecialkey_Dao _obj = new aihaospecialkey_Dao();
            _obj.setSpecialkeyid(arr.getInt("SPECIALKEYID"));
            _obj.setSpecialkeyname(arr.getString("SPECIALKEYNAME"));
            _obj.setSpecialcontain(arr.getString("SPECIALCONTAIN"));
            _obj.setStatus(arr.getInt("STATUS"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOSPECIALKEY返回 分页数据
* @param AIHAOSPECIALKEY row
* @returnAIHAOSPECIALKEYList对象
* @throws Exception 
*/
public List<aihaospecialkey_Dao> get_aihaospecialkey_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaospecialkey_Dao> _list = new ArrayList<aihaospecialkey_Dao>();
		String sqlStr = "{ call AIHAOSPECIALKEY_PRO.GetAIHAOSPECIALKEYPage(?,?,?,?,?,?)}";
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
				aihaospecialkey_Dao _obj = new aihaospecialkey_Dao();
            _obj.setSpecialkeyid(arr.getInt("SPECIALKEYID"));
            _obj.setSpecialkeyname(arr.getString("SPECIALKEYNAME"));
            _obj.setSpecialcontain(arr.getString("SPECIALCONTAIN"));
            _obj.setStatus(arr.getInt("STATUS"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOSPECIALKEY返回的查询DataRow创建一个AIHAOSPECIALKEYEntity对象
* @param AIHAOSPECIALKEY row
* @returnAIHAOSPECIALKEYDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaospecialkey_Dao> get_aihaospecialkey_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaospecialkeystrWhere") == null) {
			Dictionary<Integer, aihaospecialkey_Dao> _dic = new Hashtable<Integer, aihaospecialkey_Dao>();
			List<aihaospecialkey_Dao> _list = new ArrayList<aihaospecialkey_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getSpecialkeyid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaospecialkey", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaospecialkey_Dao> _dic = (Dictionary<Integer, aihaospecialkey_Dao>) classFactory
					.cacheGet("dicaihaospecialkeystrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOSPECIALKEY字段加一
* @param FieldName
* @param sid
*/
public int create_aihaospecialkey_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOSPECIALKEY_PRO.UpdateFieldAIHAOSPECIALKEY(?,?)}";
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
* 更新AIHAOSPECIALKEYInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaospecialkey_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOSPECIALKEY_PRO.UpdateFieldAIHAOSPECIALKEYV(?,?,?)}";
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
* 更新AIHAOSPECIALKEYIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaospecialkey_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOSPECIALKEY_PRO.UpdateFieldAIHAOSPECIALKEYU(?,?,?)}";
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
