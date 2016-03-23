/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaouserlogin.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaouserlogin_Dao;
import com.szty.aihao.core.aihaouserlogin_core;
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
*@AIHAOUSERLOGIN数据接口
*@作者：宋春林 
*/
public class aihaouserlogin_impl implements aihaouserlogin_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaouserlogin_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOUSERLOGIN实体
* @return 新插入记录的编号
*/
public int insert_aihaouserlogin(aihaouserlogin_Dao _AIHAOUSERLOGINModel)  throws Exception{
         String sqlStr = "{call AIHAOUSERLOGIN_PRO.InsertAIHAOUSERLOGIN(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOUSERLOGINModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_AIHAOUSERLOGINModel.getUinfoid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOUSERLOGINModel.getStatus());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOUSERLOGINModel.getLongitude());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOUSERLOGINModel.getLatitude());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUSERLOGINModel.getLogintime()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUSERLOGINModel.getLogouttime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOUSERLOGIN
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaouserlogin(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOUSERLOGIN_PRO.InsertAIHAOUSERLOGIN(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOUSERLOGIN实体
* @return 影响的行数
*/
public int update_aihaouserlogin(aihaouserlogin_Dao _AIHAOUSERLOGINModel)  throws Exception{
        String sqlStr = "{call AIHAOUSERLOGIN_PRO.UpdateAIHAOUSERLOGIN(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.BIGINT,_AIHAOUSERLOGINModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.BIGINT,_AIHAOUSERLOGINModel.getUinfoid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOUSERLOGINModel.getStatus());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOUSERLOGINModel.getLongitude());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOUSERLOGINModel.getLatitude());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUSERLOGINModel.getLogintime()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOUSERLOGINModel.getLogouttime()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOUSERLOGIN中的一条记录
* @param AIHAOUSERLOGIN实体
* @return 新插入记录的编号
*/
public int delete_aihaouserlogin(int Id)  throws Exception{
        String sqlStr = "{call AIHAOUSERLOGIN_PRO.DeleteAIHAOUSERLOGIN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaouserlogin 数据实体
* @param Id">Id
* @return<aihaouserlogin 数据实体
* @throws Exception 
*/
public aihaouserlogin_Dao get_aihaouserloginDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOUSERLOGIN_PRO.GetAIHAOUSERLOGINEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaouserlogin_Dao _obj = new aihaouserlogin_Dao();
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
* 根据AIHAOUSERLOGIN返回的查询DataRow创建一个AIHAOUSERLOGINEntity对象
* @param AIHAOUSERLOGIN row
* @returnAIHAOUSERLOGINList对象
* @throws Exception 
*/
public List<aihaouserlogin_Dao> get_aihaouserlogin_All() throws Exception{
        List<aihaouserlogin_Dao> _list = new ArrayList<aihaouserlogin_Dao>();
		String sqlStr = "{ call AIHAOUSERLOGIN_PRO.GetAIHAOUSERLOGIN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaouserlogin_Dao _obj = new aihaouserlogin_Dao();
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
* 根据AIHAOUSERLOGIN返回的查询DataRow创建一个AIHAOUSERLOGINEntity对象
* @param AIHAOUSERLOGIN row
* @returnAIHAOUSERLOGINList对象
* @throws Exception 
*/
public List< aihaouserlogin_Dao> get_aihaouserlogin_All(String strWhere) throws Exception{
         List<aihaouserlogin_Dao> _list = new ArrayList<aihaouserlogin_Dao>();
		 String sqlStr = "{ call AIHAOUSERLOGIN_PRO.GetAIHAOUSERLOGINWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaouserlogin_Dao _obj = new aihaouserlogin_Dao();
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
* 根据AIHAOUSERLOGIN返回 分页数据
* @param AIHAOUSERLOGIN row
* @returnAIHAOUSERLOGINList对象
* @throws Exception 
*/
public List<aihaouserlogin_Dao> get_aihaouserlogin_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaouserlogin_Dao> _list = new ArrayList<aihaouserlogin_Dao>();
		String sqlStr = "{ call AIHAOUSERLOGIN_PRO.GetAIHAOUSERLOGINPage(?,?,?,?,?,?)}";
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
				aihaouserlogin_Dao _obj = new aihaouserlogin_Dao();
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
* 根据AIHAOUSERLOGIN返回的查询DataRow创建一个AIHAOUSERLOGINEntity对象
* @param AIHAOUSERLOGIN row
* @returnAIHAOUSERLOGINDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaouserlogin_Dao> get_aihaouserlogin_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaouserloginstrWhere") == null) {
			Dictionary<Integer, aihaouserlogin_Dao> _dic = new Hashtable<Integer, aihaouserlogin_Dao>();
			List<aihaouserlogin_Dao> _list = new ArrayList<aihaouserlogin_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((int)(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaouserlogin", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaouserlogin_Dao> _dic = (Dictionary<Integer, aihaouserlogin_Dao>) classFactory
					.cacheGet("dicaihaouserloginstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOUSERLOGIN字段加一
* @param FieldName
* @param sid
*/
public int create_aihaouserlogin_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOUSERLOGIN_PRO.UpdateFieldAIHAOUSERLOGIN(?,?)}";
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
* 更新AIHAOUSERLOGINInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaouserlogin_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOUSERLOGIN_PRO.UpdateFieldAIHAOUSERLOGINV(?,?,?)}";
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
* 更新AIHAOUSERLOGINIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaouserlogin_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOUSERLOGIN_PRO.UpdateFieldAIHAOUSERLOGINU(?,?,?)}";
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
