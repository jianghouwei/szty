/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztyuserloginlog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztyuserloginlog_Dao;
import com.szty.aihao.core.sztyuserloginlog_core;
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
*@SZTYUSERLOGINLOG数据接口
*@作者：宋春林 
*/
public class sztyuserloginlog_impl implements sztyuserloginlog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztyuserloginlog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYUSERLOGINLOG实体
* @return 新插入记录的编号
*/
public int insert_sztyuserloginlog(sztyuserloginlog_Dao _SZTYUSERLOGINLOGModel)  throws Exception{
         String sqlStr = "{call SZTYUSERLOGINLOG_PRO.InsertSZTYUSERLOGINLOG(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYUSERLOGINLOGModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_SZTYUSERLOGINLOGModel.getUinfoid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYUSERLOGINLOGModel.getPlatform());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYUSERLOGINLOGModel.getStatus());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYUSERLOGINLOGModel.getLongitude());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYUSERLOGINLOGModel.getLatitude());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERLOGINLOGModel.getLogintime()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERLOGINLOGModel.getLogouttime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYUSERLOGINLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztyuserloginlog(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYUSERLOGINLOG_PRO.InsertSZTYUSERLOGINLOG(?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[8];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYUSERLOGINLOG实体
* @return 影响的行数
*/
public int update_sztyuserloginlog(sztyuserloginlog_Dao _SZTYUSERLOGINLOGModel)  throws Exception{
        String sqlStr = "{call SZTYUSERLOGINLOG_PRO.UpdateSZTYUSERLOGINLOG(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_SZTYUSERLOGINLOGModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_SZTYUSERLOGINLOGModel.getUinfoid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYUSERLOGINLOGModel.getPlatform());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SZTYUSERLOGINLOGModel.getStatus());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SZTYUSERLOGINLOGModel.getLongitude());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYUSERLOGINLOGModel.getLatitude());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERLOGINLOGModel.getLogintime()));
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_SZTYUSERLOGINLOGModel.getLogouttime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYUSERLOGINLOG中的一条记录
* @param SZTYUSERLOGINLOG实体
* @return 新插入记录的编号
*/
public int delete_sztyuserloginlog(int Id)  throws Exception{
        String sqlStr = "{call SZTYUSERLOGINLOG_PRO.DeleteSZTYUSERLOGINLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztyuserloginlog 数据实体
* @param Id">Id
* @return<sztyuserloginlog 数据实体
* @throws Exception 
*/
public sztyuserloginlog_Dao get_sztyuserloginlogDao(int Id) throws Exception{
         String sqlStr = "{ call SZTYUSERLOGINLOG_PRO.GetSZTYUSERLOGINLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyuserloginlog_Dao _obj = new sztyuserloginlog_Dao();
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setStatus(arr.getString("STATUS"));
            _obj.setLongitude(arr.getString("LONGITUDE"));
            _obj.setLatitude(arr.getString("LATITUDE"));
             try{_obj.setLogintime(dateformat.parse(arr.getString("LOGINTIME")));}catch(Exception ce){_obj.setLogintime((new Date()));}
             try{_obj.setLogouttime(dateformat.parse(arr.getString("LOGOUTTIME")));}catch(Exception ce){_obj.setLogouttime((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据SZTYUSERLOGINLOG返回的查询DataRow创建一个SZTYUSERLOGINLOGEntity对象
* @param SZTYUSERLOGINLOG row
* @returnSZTYUSERLOGINLOGList对象
* @throws Exception 
*/
public List<sztyuserloginlog_Dao> get_sztyuserloginlog_All() throws Exception{
        List<sztyuserloginlog_Dao> _list = new ArrayList<sztyuserloginlog_Dao>();
		String sqlStr = "{ call SZTYUSERLOGINLOG_PRO.GetSZTYUSERLOGINLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyuserloginlog_Dao _obj = new sztyuserloginlog_Dao();
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setStatus(arr.getString("STATUS"));
            _obj.setLongitude(arr.getString("LONGITUDE"));
            _obj.setLatitude(arr.getString("LATITUDE"));
            try{_obj.setLogintime(dateformat.parse(arr.getString("LOGINTIME")));}catch(Exception ce){_obj.setLogintime((new Date()));}
            try{_obj.setLogouttime(dateformat.parse(arr.getString("LOGOUTTIME")));}catch(Exception ce){_obj.setLogouttime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYUSERLOGINLOG返回的查询DataRow创建一个SZTYUSERLOGINLOGEntity对象
* @param SZTYUSERLOGINLOG row
* @returnSZTYUSERLOGINLOGList对象
* @throws Exception 
*/
public List< sztyuserloginlog_Dao> get_sztyuserloginlog_All(String strWhere) throws Exception{
         List<sztyuserloginlog_Dao> _list = new ArrayList<sztyuserloginlog_Dao>();
		 String sqlStr = "{ call SZTYUSERLOGINLOG_PRO.GetSZTYUSERLOGINLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztyuserloginlog_Dao _obj = new sztyuserloginlog_Dao();
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setStatus(arr.getString("STATUS"));
            _obj.setLongitude(arr.getString("LONGITUDE"));
            _obj.setLatitude(arr.getString("LATITUDE"));
           try{_obj.setLogintime(dateformat.parse(arr.getString("LOGINTIME")));}catch(Exception ce){_obj.setLogintime((new Date()));}
           try{_obj.setLogouttime(dateformat.parse(arr.getString("LOGOUTTIME")));}catch(Exception ce){_obj.setLogouttime((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYUSERLOGINLOG返回 分页数据
* @param SZTYUSERLOGINLOG row
* @returnSZTYUSERLOGINLOGList对象
* @throws Exception 
*/
public List<sztyuserloginlog_Dao> get_sztyuserloginlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztyuserloginlog_Dao> _list = new ArrayList<sztyuserloginlog_Dao>();
		String sqlStr = "{ call SZTYUSERLOGINLOG_PRO.GetSZTYUSERLOGINLOGPage(?,?,?,?,?,?)}";
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
				sztyuserloginlog_Dao _obj = new sztyuserloginlog_Dao();
            _obj.setPlatform(arr.getString("PLATFORM"));
            _obj.setStatus(arr.getString("STATUS"));
            _obj.setLongitude(arr.getString("LONGITUDE"));
            _obj.setLatitude(arr.getString("LATITUDE"));
            try{_obj.setLogintime(dateformat.parse(arr.getString("LOGINTIME")));}catch(Exception ce){_obj.setLogintime((new Date()));}
            try{_obj.setLogouttime(dateformat.parse(arr.getString("LOGOUTTIME")));}catch(Exception ce){_obj.setLogouttime((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYUSERLOGINLOG返回的查询DataRow创建一个SZTYUSERLOGINLOGEntity对象
* @param SZTYUSERLOGINLOG row
* @returnSZTYUSERLOGINLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztyuserloginlog_Dao> get_sztyuserloginlog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztyuserloginlogstrWhere") == null) {
			Dictionary<Integer, sztyuserloginlog_Dao> _dic = new Hashtable<Integer, sztyuserloginlog_Dao>();
			List<sztyuserloginlog_Dao> _list = new ArrayList<sztyuserloginlog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicsztyuserloginlog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztyuserloginlog_Dao> _dic = (Dictionary<Integer, sztyuserloginlog_Dao>) classFactory
					.cacheGet("dicsztyuserloginlogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYUSERLOGINLOG字段加一
* @param FieldName
* @param sid
*/
public int create_sztyuserloginlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYUSERLOGINLOG_PRO.UpdateFieldSZTYUSERLOGINLOG(?,?)}";
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
* 更新SZTYUSERLOGINLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztyuserloginlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYUSERLOGINLOG_PRO.UpdateFieldSZTYUSERLOGINLOGV(?,?,?)}";
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
* 更新SZTYUSERLOGINLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztyuserloginlog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYUSERLOGINLOG_PRO.UpdateFieldSZTYUSERLOGINLOGU(?,?,?)}";
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
