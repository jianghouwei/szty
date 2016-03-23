/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztyuserstatus.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztyuserstatus_Dao;
import com.szty.aihao.core.sztyuserstatus_core;
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
*@SZTYUSERSTATUS数据接口
*@作者：宋春林 
*/
public class sztyuserstatus_impl implements sztyuserstatus_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztyuserstatus_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYUSERSTATUS实体
* @return 新插入记录的编号
*/
public int insert_sztyuserstatus(sztyuserstatus_Dao _SZTYUSERSTATUSModel)  throws Exception{
         String sqlStr = "{call SZTYUSERSTATUS_PRO.InsertSZTYUSERSTATUS(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYUSERSTATUSModel.getMobile());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTYUSERSTATUSModel.getPlatform());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_SZTYUSERSTATUSModel.getStatus());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERSTATUSModel.getLoginintime()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERSTATUSModel.getLoginouttime()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYUSERSTATUSModel.getLongitude());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_SZTYUSERSTATUSModel.getLatitude());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_SZTYUSERSTATUSModel.getId());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYUSERSTATUS
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztyuserstatus(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYUSERSTATUS_PRO.InsertSZTYUSERSTATUS(?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[8];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYUSERSTATUS实体
* @return 影响的行数
*/
public int update_sztyuserstatus(sztyuserstatus_Dao _SZTYUSERSTATUSModel)  throws Exception{
        String sqlStr = "{call SZTYUSERSTATUS_PRO.UpdateSZTYUSERSTATUS(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_SZTYUSERSTATUSModel.getMobile());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTYUSERSTATUSModel.getPlatform());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_SZTYUSERSTATUSModel.getStatus());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERSTATUSModel.getLoginintime()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERSTATUSModel.getLoginouttime()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYUSERSTATUSModel.getLongitude());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_SZTYUSERSTATUSModel.getLatitude());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_SZTYUSERSTATUSModel.getId());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYUSERSTATUS中的一条记录
* @param SZTYUSERSTATUS实体
* @return 新插入记录的编号
*/
public int delete_sztyuserstatus(int Mobile)  throws Exception{
        String sqlStr = "{call SZTYUSERSTATUS_PRO.DeleteSZTYUSERSTATUS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Mobile);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztyuserstatus 数据实体
* @param Mobile">Mobile
* @return<sztyuserstatus 数据实体
* @throws Exception 
*/
public sztyuserstatus_Dao get_sztyuserstatusDao(int Mobile) throws Exception{
         String sqlStr = "{ call SZTYUSERSTATUS_PRO.GetSZTYUSERSTATUSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Mobile);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyuserstatus_Dao _obj = new sztyuserstatus_Dao();
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPlatform(arr.getInt("PLATFORM"));
            _obj.setStatus(arr.getInt("STATUS"));
             try{_obj.setLoginintime(dateformat.parse(arr.getString("LOGININTIME")));}catch(Exception ce){_obj.setLoginintime((new Date()));}
             try{_obj.setLoginouttime(dateformat.parse(arr.getString("LOGINOUTTIME")));}catch(Exception ce){_obj.setLoginouttime((new Date()));}
            _obj.setLongitude(arr.getString("LONGITUDE"));
            _obj.setLatitude(arr.getString("LATITUDE"));
            _obj.setId(arr.getInt("ID"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
* @param SZTYUSERSTATUS row
* @returnSZTYUSERSTATUSList对象
* @throws Exception 
*/
public List<sztyuserstatus_Dao> get_sztyuserstatus_All() throws Exception{
        List<sztyuserstatus_Dao> _list = new ArrayList<sztyuserstatus_Dao>();
		String sqlStr = "{ call SZTYUSERSTATUS_PRO.GetSZTYUSERSTATUS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyuserstatus_Dao _obj = new sztyuserstatus_Dao();
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPlatform(arr.getInt("PLATFORM"));
            _obj.setStatus(arr.getInt("STATUS"));
            try{_obj.setLoginintime(dateformat.parse(arr.getString("LOGININTIME")));}catch(Exception ce){_obj.setLoginintime((new Date()));}
            try{_obj.setLoginouttime(dateformat.parse(arr.getString("LOGINOUTTIME")));}catch(Exception ce){_obj.setLoginouttime((new Date()));}
            _obj.setLongitude(arr.getString("LONGITUDE"));
            _obj.setLatitude(arr.getString("LATITUDE"));
            _obj.setId(arr.getInt("ID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
* @param SZTYUSERSTATUS row
* @returnSZTYUSERSTATUSList对象
* @throws Exception 
*/
public List< sztyuserstatus_Dao> get_sztyuserstatus_All(String strWhere) throws Exception{
         List<sztyuserstatus_Dao> _list = new ArrayList<sztyuserstatus_Dao>();
		 String sqlStr = "{ call SZTYUSERSTATUS_PRO.GetSZTYUSERSTATUSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztyuserstatus_Dao _obj = new sztyuserstatus_Dao();
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPlatform(arr.getInt("PLATFORM"));
            _obj.setStatus(arr.getInt("STATUS"));
           try{_obj.setLoginintime(dateformat.parse(arr.getString("LOGININTIME")));}catch(Exception ce){_obj.setLoginintime((new Date()));}
           try{_obj.setLoginouttime(dateformat.parse(arr.getString("LOGINOUTTIME")));}catch(Exception ce){_obj.setLoginouttime((new Date()));}
            _obj.setLongitude(arr.getString("LONGITUDE"));
            _obj.setLatitude(arr.getString("LATITUDE"));
            _obj.setId(arr.getInt("ID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYUSERSTATUS返回 分页数据
* @param SZTYUSERSTATUS row
* @returnSZTYUSERSTATUSList对象
* @throws Exception 
*/
public List<sztyuserstatus_Dao> get_sztyuserstatus_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztyuserstatus_Dao> _list = new ArrayList<sztyuserstatus_Dao>();
		String sqlStr = "{ call SZTYUSERSTATUS_PRO.GetSZTYUSERSTATUSPage(?,?,?,?,?,?)}";
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
				sztyuserstatus_Dao _obj = new sztyuserstatus_Dao();
            _obj.setMobile(arr.getString("MOBILE"));
            _obj.setPlatform(arr.getInt("PLATFORM"));
            _obj.setStatus(arr.getInt("STATUS"));
            try{_obj.setLoginintime(dateformat.parse(arr.getString("LOGININTIME")));}catch(Exception ce){_obj.setLoginintime((new Date()));}
            try{_obj.setLoginouttime(dateformat.parse(arr.getString("LOGINOUTTIME")));}catch(Exception ce){_obj.setLoginouttime((new Date()));}
            _obj.setLongitude(arr.getString("LONGITUDE"));
            _obj.setLatitude(arr.getString("LATITUDE"));
            _obj.setId(arr.getInt("ID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
* @param SZTYUSERSTATUS row
* @returnSZTYUSERSTATUSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztyuserstatus_Dao> get_sztyuserstatus_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztyuserstatusstrWhere") == null) {
			Dictionary<Integer, sztyuserstatus_Dao> _dic = new Hashtable<Integer, sztyuserstatus_Dao>();
			List<sztyuserstatus_Dao> _list = new ArrayList<sztyuserstatus_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getMobile()), _list.get(i));
			}
			classFactory.cachePut("dicsztyuserstatus", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztyuserstatus_Dao> _dic = (Dictionary<Integer, sztyuserstatus_Dao>) classFactory
					.cacheGet("dicsztyuserstatusstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYUSERSTATUS字段加一
* @param FieldName
* @param sid
*/
public int create_sztyuserstatus_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYUSERSTATUS_PRO.UpdateFieldSZTYUSERSTATUS(?,?)}";
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
* 更新SZTYUSERSTATUSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztyuserstatus_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYUSERSTATUS_PRO.UpdateFieldSZTYUSERSTATUSV(?,?,?)}";
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
* 更新SZTYUSERSTATUSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztyuserstatus_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYUSERSTATUS_PRO.UpdateFieldSZTYUSERSTATUSU(?,?,?)}";
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
