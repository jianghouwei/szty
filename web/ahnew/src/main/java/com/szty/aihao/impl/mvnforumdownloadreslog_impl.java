/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumdownloadreslog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumdownloadreslog_Dao;
import com.szty.aihao.core.mvnforumdownloadreslog_core;
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
*@MVNFORUMDOWNLOADRESLOG数据接口
*@作者：宋春林 
*/
public class mvnforumdownloadreslog_impl implements mvnforumdownloadreslog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumdownloadreslog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMDOWNLOADRESLOG实体
* @return 新插入记录的编号
*/
public int insert_mvnforumdownloadreslog(mvnforumdownloadreslog_Dao _MVNFORUMDOWNLOADRESLOGModel)  throws Exception{
         String sqlStr = "{call MVNFORUMDOWNLOADRESLOG_PRO.InsertMVNFORUMDOWNLOADRESLOG(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMDOWNLOADRESLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMDOWNLOADRESLOGModel.getLogownername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMDOWNLOADRESLOGModel.getOperatingsystem());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMDOWNLOADRESLOGModel.getUseragent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMDOWNLOADRESLOGModel.getResourcetype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMDOWNLOADRESLOGModel.getResourceid());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMDOWNLOADRESLOGModel.getResourcefilename());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMDOWNLOADRESLOGModel.getSrcname());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMDOWNLOADRESLOGModel.getLogcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMDOWNLOADRESLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumdownloadreslog(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMDOWNLOADRESLOG_PRO.InsertMVNFORUMDOWNLOADRESLOG(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MVNFORUMDOWNLOADRESLOG实体
* @return 影响的行数
*/
public int update_mvnforumdownloadreslog(mvnforumdownloadreslog_Dao _MVNFORUMDOWNLOADRESLOGModel)  throws Exception{
        String sqlStr = "{call MVNFORUMDOWNLOADRESLOG_PRO.UpdateMVNFORUMDOWNLOADRESLOG(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMDOWNLOADRESLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMDOWNLOADRESLOGModel.getLogownername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_MVNFORUMDOWNLOADRESLOGModel.getOperatingsystem());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMDOWNLOADRESLOGModel.getUseragent());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_MVNFORUMDOWNLOADRESLOGModel.getResourcetype());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_MVNFORUMDOWNLOADRESLOGModel.getResourceid());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMDOWNLOADRESLOGModel.getResourcefilename());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMDOWNLOADRESLOGModel.getSrcname());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMDOWNLOADRESLOGModel.getLogcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMDOWNLOADRESLOG中的一条记录
* @param MVNFORUMDOWNLOADRESLOG实体
* @return 新插入记录的编号
*/
public int delete_mvnforumdownloadreslog(int Logid)  throws Exception{
        String sqlStr = "{call MVNFORUMDOWNLOADRESLOG_PRO.DeleteMVNFORUMDOWNLOADRESLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumdownloadreslog 数据实体
* @param Logid">Logid
* @return<mvnforumdownloadreslog 数据实体
* @throws Exception 
*/
public mvnforumdownloadreslog_Dao get_mvnforumdownloadreslogDao(int Logid) throws Exception{
         String sqlStr = "{ call MVNFORUMDOWNLOADRESLOG_PRO.GetMVNFORUMDOWNLOADRESLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumdownloadreslog_Dao _obj = new mvnforumdownloadreslog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogownername(arr.getString("LOGOWNERNAME"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setUseragent(arr.getString("USERAGENT"));
            _obj.setResourcetype(arr.getInt("RESOURCETYPE"));
            _obj.setResourceid(arr.getInt("RESOURCEID"));
            _obj.setResourcefilename(arr.getString("RESOURCEFILENAME"));
            _obj.setSrcname(arr.getString("SRCNAME"));
             try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMDOWNLOADRESLOG返回的查询DataRow创建一个MVNFORUMDOWNLOADRESLOGEntity对象
* @param MVNFORUMDOWNLOADRESLOG row
* @returnMVNFORUMDOWNLOADRESLOGList对象
* @throws Exception 
*/
public List<mvnforumdownloadreslog_Dao> get_mvnforumdownloadreslog_All() throws Exception{
        List<mvnforumdownloadreslog_Dao> _list = new ArrayList<mvnforumdownloadreslog_Dao>();
		String sqlStr = "{ call MVNFORUMDOWNLOADRESLOG_PRO.GetMVNFORUMDOWNLOADRESLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumdownloadreslog_Dao _obj = new mvnforumdownloadreslog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogownername(arr.getString("LOGOWNERNAME"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setUseragent(arr.getString("USERAGENT"));
            _obj.setResourcetype(arr.getInt("RESOURCETYPE"));
            _obj.setResourceid(arr.getInt("RESOURCEID"));
            _obj.setResourcefilename(arr.getString("RESOURCEFILENAME"));
            _obj.setSrcname(arr.getString("SRCNAME"));
            try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMDOWNLOADRESLOG返回的查询DataRow创建一个MVNFORUMDOWNLOADRESLOGEntity对象
* @param MVNFORUMDOWNLOADRESLOG row
* @returnMVNFORUMDOWNLOADRESLOGList对象
* @throws Exception 
*/
public List< mvnforumdownloadreslog_Dao> get_mvnforumdownloadreslog_All(String strWhere) throws Exception{
         List<mvnforumdownloadreslog_Dao> _list = new ArrayList<mvnforumdownloadreslog_Dao>();
		 String sqlStr = "{ call MVNFORUMDOWNLOADRESLOG_PRO.GetMVNFORUMDOWNLOADRESLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumdownloadreslog_Dao _obj = new mvnforumdownloadreslog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogownername(arr.getString("LOGOWNERNAME"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setUseragent(arr.getString("USERAGENT"));
            _obj.setResourcetype(arr.getInt("RESOURCETYPE"));
            _obj.setResourceid(arr.getInt("RESOURCEID"));
            _obj.setResourcefilename(arr.getString("RESOURCEFILENAME"));
            _obj.setSrcname(arr.getString("SRCNAME"));
           try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMDOWNLOADRESLOG返回 分页数据
* @param MVNFORUMDOWNLOADRESLOG row
* @returnMVNFORUMDOWNLOADRESLOGList对象
* @throws Exception 
*/
public List<mvnforumdownloadreslog_Dao> get_mvnforumdownloadreslog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumdownloadreslog_Dao> _list = new ArrayList<mvnforumdownloadreslog_Dao>();
		String sqlStr = "{ call MVNFORUMDOWNLOADRESLOG_PRO.GetMVNFORUMDOWNLOADRESLOGPage(?,?,?,?,?,?)}";
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
				mvnforumdownloadreslog_Dao _obj = new mvnforumdownloadreslog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogownername(arr.getString("LOGOWNERNAME"));
            _obj.setOperatingsystem(arr.getInt("OPERATINGSYSTEM"));
            _obj.setUseragent(arr.getString("USERAGENT"));
            _obj.setResourcetype(arr.getInt("RESOURCETYPE"));
            _obj.setResourceid(arr.getInt("RESOURCEID"));
            _obj.setResourcefilename(arr.getString("RESOURCEFILENAME"));
            _obj.setSrcname(arr.getString("SRCNAME"));
            try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMDOWNLOADRESLOG返回的查询DataRow创建一个MVNFORUMDOWNLOADRESLOGEntity对象
* @param MVNFORUMDOWNLOADRESLOG row
* @returnMVNFORUMDOWNLOADRESLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumdownloadreslog_Dao> get_mvnforumdownloadreslog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumdownloadreslogstrWhere") == null) {
			Dictionary<Integer, mvnforumdownloadreslog_Dao> _dic = new Hashtable<Integer, mvnforumdownloadreslog_Dao>();
			List<mvnforumdownloadreslog_Dao> _list = new ArrayList<mvnforumdownloadreslog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumdownloadreslog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumdownloadreslog_Dao> _dic = (Dictionary<Integer, mvnforumdownloadreslog_Dao>) classFactory
					.cacheGet("dicmvnforumdownloadreslogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMDOWNLOADRESLOG字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumdownloadreslog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMDOWNLOADRESLOG_PRO.UpdateFieldMVNFORUMDOWNLOADRESLOG(?,?)}";
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
* 更新MVNFORUMDOWNLOADRESLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumdownloadreslog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMDOWNLOADRESLOG_PRO.UpdateFieldMVNFORUMDOWNLOADRESLOGV(?,?,?)}";
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
* 更新MVNFORUMDOWNLOADRESLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumdownloadreslog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMDOWNLOADRESLOG_PRO.UpdateFieldMVNFORUMDOWNLOADRESLOGU(?,?,?)}";
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
