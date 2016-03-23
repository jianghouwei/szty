/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumhllclientlog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumhllclientlog_Dao;
import com.szty.aihao.core.mvnforumhllclientlog_core;
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
*@MVNFORUMHLLCLIENTLOG数据接口
*@作者：宋春林 
*/
public class mvnforumhllclientlog_impl implements mvnforumhllclientlog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumhllclientlog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMHLLCLIENTLOG实体
* @return 新插入记录的编号
*/
public int insert_mvnforumhllclientlog(mvnforumhllclientlog_Dao _MVNFORUMHLLCLIENTLOGModel)  throws Exception{
         String sqlStr = "{call MVNFORUMHLLCLIENTLOG_PRO.InsertMVNFORUMHLLCLIENTLOG(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMHLLCLIENTLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMHLLCLIENTLOGModel.getLogownername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMHLLCLIENTLOGModel.getOperatingsystem());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMHLLCLIENTLOGModel.getUseragent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMHLLCLIENTLOGModel.getAppid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMHLLCLIENTLOGModel.getFunct());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMHLLCLIENTLOGModel.getLogcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMHLLCLIENTLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumhllclientlog(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMHLLCLIENTLOG_PRO.InsertMVNFORUMHLLCLIENTLOG(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMHLLCLIENTLOG实体
* @return 影响的行数
*/
public int update_mvnforumhllclientlog(mvnforumhllclientlog_Dao _MVNFORUMHLLCLIENTLOGModel)  throws Exception{
        String sqlStr = "{call MVNFORUMHLLCLIENTLOG_PRO.UpdateMVNFORUMHLLCLIENTLOG(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMHLLCLIENTLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMHLLCLIENTLOGModel.getLogownername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMHLLCLIENTLOGModel.getOperatingsystem());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMHLLCLIENTLOGModel.getUseragent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMHLLCLIENTLOGModel.getAppid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMHLLCLIENTLOGModel.getFunct());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMHLLCLIENTLOGModel.getLogcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMHLLCLIENTLOG中的一条记录
* @param MVNFORUMHLLCLIENTLOG实体
* @return 新插入记录的编号
*/
public int delete_mvnforumhllclientlog(int Logid)  throws Exception{
        String sqlStr = "{call MVNFORUMHLLCLIENTLOG_PRO.DeleteMVNFORUMHLLCLIENTLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumhllclientlog 数据实体
* @param Logid">Logid
* @return<mvnforumhllclientlog 数据实体
* @throws Exception 
*/
public mvnforumhllclientlog_Dao get_mvnforumhllclientlogDao(int Logid) throws Exception{
         String sqlStr = "{ call MVNFORUMHLLCLIENTLOG_PRO.GetMVNFORUMHLLCLIENTLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumhllclientlog_Dao _obj = new mvnforumhllclientlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogownername(arr.getString("LOGOWNERNAME"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setUseragent(arr.getString("USERAGENT"));
            _obj.setAppid(arr.getInt("APPID"));
            _obj.setFunct(arr.getString("FUNCT"));
             try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMHLLCLIENTLOG返回的查询DataRow创建一个MVNFORUMHLLCLIENTLOGEntity对象
* @param MVNFORUMHLLCLIENTLOG row
* @returnMVNFORUMHLLCLIENTLOGList对象
* @throws Exception 
*/
public List<mvnforumhllclientlog_Dao> get_mvnforumhllclientlog_All() throws Exception{
        List<mvnforumhllclientlog_Dao> _list = new ArrayList<mvnforumhllclientlog_Dao>();
		String sqlStr = "{ call MVNFORUMHLLCLIENTLOG_PRO.GetMVNFORUMHLLCLIENTLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumhllclientlog_Dao _obj = new mvnforumhllclientlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogownername(arr.getString("LOGOWNERNAME"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setUseragent(arr.getString("USERAGENT"));
            _obj.setAppid(arr.getInt("APPID"));
            _obj.setFunct(arr.getString("FUNCT"));
            try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMHLLCLIENTLOG返回的查询DataRow创建一个MVNFORUMHLLCLIENTLOGEntity对象
* @param MVNFORUMHLLCLIENTLOG row
* @returnMVNFORUMHLLCLIENTLOGList对象
* @throws Exception 
*/
public List< mvnforumhllclientlog_Dao> get_mvnforumhllclientlog_All(String strWhere) throws Exception{
         List<mvnforumhllclientlog_Dao> _list = new ArrayList<mvnforumhllclientlog_Dao>();
		 String sqlStr = "{ call MVNFORUMHLLCLIENTLOG_PRO.GetMVNFORUMHLLCLIENTLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumhllclientlog_Dao _obj = new mvnforumhllclientlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogownername(arr.getString("LOGOWNERNAME"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setUseragent(arr.getString("USERAGENT"));
            _obj.setAppid(arr.getInt("APPID"));
            _obj.setFunct(arr.getString("FUNCT"));
           try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMHLLCLIENTLOG返回 分页数据
* @param MVNFORUMHLLCLIENTLOG row
* @returnMVNFORUMHLLCLIENTLOGList对象
* @throws Exception 
*/
public List<mvnforumhllclientlog_Dao> get_mvnforumhllclientlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumhllclientlog_Dao> _list = new ArrayList<mvnforumhllclientlog_Dao>();
		String sqlStr = "{ call MVNFORUMHLLCLIENTLOG_PRO.GetMVNFORUMHLLCLIENTLOGPage(?,?,?,?,?,?)}";
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
				mvnforumhllclientlog_Dao _obj = new mvnforumhllclientlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogownername(arr.getString("LOGOWNERNAME"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setUseragent(arr.getString("USERAGENT"));
            _obj.setAppid(arr.getInt("APPID"));
            _obj.setFunct(arr.getString("FUNCT"));
            try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMHLLCLIENTLOG返回的查询DataRow创建一个MVNFORUMHLLCLIENTLOGEntity对象
* @param MVNFORUMHLLCLIENTLOG row
* @returnMVNFORUMHLLCLIENTLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumhllclientlog_Dao> get_mvnforumhllclientlog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumhllclientlogstrWhere") == null) {
			Dictionary<Integer, mvnforumhllclientlog_Dao> _dic = new Hashtable<Integer, mvnforumhllclientlog_Dao>();
			List<mvnforumhllclientlog_Dao> _list = new ArrayList<mvnforumhllclientlog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumhllclientlog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumhllclientlog_Dao> _dic = (Dictionary<Integer, mvnforumhllclientlog_Dao>) classFactory
					.cacheGet("dicmvnforumhllclientlogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMHLLCLIENTLOG字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumhllclientlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMHLLCLIENTLOG_PRO.UpdateFieldMVNFORUMHLLCLIENTLOG(?,?)}";
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
* 更新MVNFORUMHLLCLIENTLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumhllclientlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMHLLCLIENTLOG_PRO.UpdateFieldMVNFORUMHLLCLIENTLOGV(?,?,?)}";
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
* 更新MVNFORUMHLLCLIENTLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumhllclientlog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMHLLCLIENTLOG_PRO.UpdateFieldMVNFORUMHLLCLIENTLOGU(?,?,?)}";
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
