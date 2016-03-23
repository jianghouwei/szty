/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoandroidpush.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoandroidpush_Dao;
import com.szty.aihao.core.aihaoandroidpush_core;
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
*@AIHAOANDROIDPUSH数据接口
*@作者：宋春林 
*/
public class aihaoandroidpush_impl implements aihaoandroidpush_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoandroidpush_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOANDROIDPUSH实体
* @return 新插入记录的编号
*/
public int insert_aihaoandroidpush(aihaoandroidpush_Dao _AIHAOANDROIDPUSHModel)  throws Exception{
         String sqlStr = "{call AIHAOANDROIDPUSH_PRO.InsertAIHAOANDROIDPUSH(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOANDROIDPUSHModel.getImsi());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOANDROIDPUSHModel.getMsg());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOANDROIDPUSHModel.getUrl());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOANDROIDPUSHModel.getCdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAOANDROIDPUSHModel.getPushtype());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOANDROIDPUSH
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoandroidpush(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOANDROIDPUSH_PRO.InsertAIHAOANDROIDPUSH(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOANDROIDPUSH实体
* @return 影响的行数
*/
public int update_aihaoandroidpush(aihaoandroidpush_Dao _AIHAOANDROIDPUSHModel)  throws Exception{
        String sqlStr = "{call AIHAOANDROIDPUSH_PRO.UpdateAIHAOANDROIDPUSH(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOANDROIDPUSHModel.getImsi());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOANDROIDPUSHModel.getMsg());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOANDROIDPUSHModel.getUrl());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOANDROIDPUSHModel.getCdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_AIHAOANDROIDPUSHModel.getPushtype());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOANDROIDPUSH中的一条记录
* @param AIHAOANDROIDPUSH实体
* @return 新插入记录的编号
*/
public int delete_aihaoandroidpush(int Imsi)  throws Exception{
        String sqlStr = "{call AIHAOANDROIDPUSH_PRO.DeleteAIHAOANDROIDPUSH(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Imsi);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoandroidpush 数据实体
* @param Imsi">Imsi
* @return<aihaoandroidpush 数据实体
* @throws Exception 
*/
public aihaoandroidpush_Dao get_aihaoandroidpushDao(int Imsi) throws Exception{
         String sqlStr = "{ call AIHAOANDROIDPUSH_PRO.GetAIHAOANDROIDPUSHEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Imsi);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoandroidpush_Dao _obj = new aihaoandroidpush_Dao();
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMsg(arr.getString("MSG"));
            _obj.setUrl(arr.getString("URL"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setPushtype(arr.getInt("PUSHTYPE"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOANDROIDPUSH返回的查询DataRow创建一个AIHAOANDROIDPUSHEntity对象
* @param AIHAOANDROIDPUSH row
* @returnAIHAOANDROIDPUSHList对象
* @throws Exception 
*/
public List<aihaoandroidpush_Dao> get_aihaoandroidpush_All() throws Exception{
        List<aihaoandroidpush_Dao> _list = new ArrayList<aihaoandroidpush_Dao>();
		String sqlStr = "{ call AIHAOANDROIDPUSH_PRO.GetAIHAOANDROIDPUSH(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoandroidpush_Dao _obj = new aihaoandroidpush_Dao();
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMsg(arr.getString("MSG"));
            _obj.setUrl(arr.getString("URL"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setPushtype(arr.getInt("PUSHTYPE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOANDROIDPUSH返回的查询DataRow创建一个AIHAOANDROIDPUSHEntity对象
* @param AIHAOANDROIDPUSH row
* @returnAIHAOANDROIDPUSHList对象
* @throws Exception 
*/
public List< aihaoandroidpush_Dao> get_aihaoandroidpush_All(String strWhere) throws Exception{
         List<aihaoandroidpush_Dao> _list = new ArrayList<aihaoandroidpush_Dao>();
		 String sqlStr = "{ call AIHAOANDROIDPUSH_PRO.GetAIHAOANDROIDPUSHWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoandroidpush_Dao _obj = new aihaoandroidpush_Dao();
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMsg(arr.getString("MSG"));
            _obj.setUrl(arr.getString("URL"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setPushtype(arr.getInt("PUSHTYPE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOANDROIDPUSH返回 分页数据
* @param AIHAOANDROIDPUSH row
* @returnAIHAOANDROIDPUSHList对象
* @throws Exception 
*/
public List<aihaoandroidpush_Dao> get_aihaoandroidpush_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoandroidpush_Dao> _list = new ArrayList<aihaoandroidpush_Dao>();
		String sqlStr = "{ call AIHAOANDROIDPUSH_PRO.GetAIHAOANDROIDPUSHPage(?,?,?,?,?,?)}";
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
				aihaoandroidpush_Dao _obj = new aihaoandroidpush_Dao();
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setMsg(arr.getString("MSG"));
            _obj.setUrl(arr.getString("URL"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _obj.setPushtype(arr.getInt("PUSHTYPE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOANDROIDPUSH返回的查询DataRow创建一个AIHAOANDROIDPUSHEntity对象
* @param AIHAOANDROIDPUSH row
* @returnAIHAOANDROIDPUSHDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoandroidpush_Dao> get_aihaoandroidpush_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoandroidpushstrWhere") == null) {
			Dictionary<Integer, aihaoandroidpush_Dao> _dic = new Hashtable<Integer, aihaoandroidpush_Dao>();
			List<aihaoandroidpush_Dao> _list = new ArrayList<aihaoandroidpush_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getImsi()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoandroidpush", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoandroidpush_Dao> _dic = (Dictionary<Integer, aihaoandroidpush_Dao>) classFactory
					.cacheGet("dicaihaoandroidpushstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOANDROIDPUSH字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoandroidpush_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOANDROIDPUSH_PRO.UpdateFieldAIHAOANDROIDPUSH(?,?)}";
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
* 更新AIHAOANDROIDPUSHInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoandroidpush_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOANDROIDPUSH_PRO.UpdateFieldAIHAOANDROIDPUSHV(?,?,?)}";
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
* 更新AIHAOANDROIDPUSHIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoandroidpush_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOANDROIDPUSH_PRO.UpdateFieldAIHAOANDROIDPUSHU(?,?,?)}";
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
