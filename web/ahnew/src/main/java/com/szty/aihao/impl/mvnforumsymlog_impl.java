/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMvnforumsymlog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mvnforumsymlog_Dao;
import com.szty.aihao.core.mvnforumsymlog_core;
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
*@MVNFORUMSYMLOG数据接口
*@作者：宋春林 
*/
public class mvnforumsymlog_impl implements mvnforumsymlog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mvnforumsymlog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSYMLOG实体
* @return 新插入记录的编号
*/
public int insert_mvnforumsymlog(mvnforumsymlog_Dao _MVNFORUMSYMLOGModel)  throws Exception{
         String sqlStr = "{call MVNFORUMSYMLOG_PRO.InsertMVNFORUMSYMLOG(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MVNFORUMSYMLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getImei());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getImsi());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getCid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getPid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getSid());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getSkey());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getVer());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSYMLOGModel.getLogcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MVNFORUMSYMLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_mvnforumsymlog(Object[] _para)  throws Exception{
      String sqlStr = "{call MVNFORUMSYMLOG_PRO.InsertMVNFORUMSYMLOG(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
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
* @param MVNFORUMSYMLOG实体
* @return 影响的行数
*/
public int update_mvnforumsymlog(mvnforumsymlog_Dao _MVNFORUMSYMLOGModel)  throws Exception{
        String sqlStr = "{call MVNFORUMSYMLOG_PRO.UpdateMVNFORUMSYMLOG(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MVNFORUMSYMLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getImei());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getImsi());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getCid());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getPid());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getSid());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getSkey());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_MVNFORUMSYMLOGModel.getVer());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_MVNFORUMSYMLOGModel.getLogcreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MVNFORUMSYMLOG中的一条记录
* @param MVNFORUMSYMLOG实体
* @return 新插入记录的编号
*/
public int delete_mvnforumsymlog(int Logid)  throws Exception{
        String sqlStr = "{call MVNFORUMSYMLOG_PRO.DeleteMVNFORUMSYMLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mvnforumsymlog 数据实体
* @param Logid">Logid
* @return<mvnforumsymlog 数据实体
* @throws Exception 
*/
public mvnforumsymlog_Dao get_mvnforumsymlogDao(int Logid) throws Exception{
         String sqlStr = "{ call MVNFORUMSYMLOG_PRO.GetMVNFORUMSYMLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsymlog_Dao _obj = new mvnforumsymlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setCid(arr.getString("CID"));
            _obj.setPid(arr.getString("PID"));
            _obj.setSid(arr.getString("SID"));
            _obj.setSkey(arr.getString("SKEY"));
            _obj.setVer(arr.getString("VER"));
             try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据MVNFORUMSYMLOG返回的查询DataRow创建一个MVNFORUMSYMLOGEntity对象
* @param MVNFORUMSYMLOG row
* @returnMVNFORUMSYMLOGList对象
* @throws Exception 
*/
public List<mvnforumsymlog_Dao> get_mvnforumsymlog_All() throws Exception{
        List<mvnforumsymlog_Dao> _list = new ArrayList<mvnforumsymlog_Dao>();
		String sqlStr = "{ call MVNFORUMSYMLOG_PRO.GetMVNFORUMSYMLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mvnforumsymlog_Dao _obj = new mvnforumsymlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setCid(arr.getString("CID"));
            _obj.setPid(arr.getString("PID"));
            _obj.setSid(arr.getString("SID"));
            _obj.setSkey(arr.getString("SKEY"));
            _obj.setVer(arr.getString("VER"));
            try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MVNFORUMSYMLOG返回的查询DataRow创建一个MVNFORUMSYMLOGEntity对象
* @param MVNFORUMSYMLOG row
* @returnMVNFORUMSYMLOGList对象
* @throws Exception 
*/
public List< mvnforumsymlog_Dao> get_mvnforumsymlog_All(String strWhere) throws Exception{
         List<mvnforumsymlog_Dao> _list = new ArrayList<mvnforumsymlog_Dao>();
		 String sqlStr = "{ call MVNFORUMSYMLOG_PRO.GetMVNFORUMSYMLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mvnforumsymlog_Dao _obj = new mvnforumsymlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setCid(arr.getString("CID"));
            _obj.setPid(arr.getString("PID"));
            _obj.setSid(arr.getString("SID"));
            _obj.setSkey(arr.getString("SKEY"));
            _obj.setVer(arr.getString("VER"));
           try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MVNFORUMSYMLOG返回 分页数据
* @param MVNFORUMSYMLOG row
* @returnMVNFORUMSYMLOGList对象
* @throws Exception 
*/
public List<mvnforumsymlog_Dao> get_mvnforumsymlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mvnforumsymlog_Dao> _list = new ArrayList<mvnforumsymlog_Dao>();
		String sqlStr = "{ call MVNFORUMSYMLOG_PRO.GetMVNFORUMSYMLOGPage(?,?,?,?,?,?)}";
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
				mvnforumsymlog_Dao _obj = new mvnforumsymlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setImei(arr.getString("IMEI"));
            _obj.setImsi(arr.getString("IMSI"));
            _obj.setCid(arr.getString("CID"));
            _obj.setPid(arr.getString("PID"));
            _obj.setSid(arr.getString("SID"));
            _obj.setSkey(arr.getString("SKEY"));
            _obj.setVer(arr.getString("VER"));
            try{_obj.setLogcreationdate(dateformat.parse(arr.getString("LOGCREATIONDATE")));}catch(Exception ce){_obj.setLogcreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MVNFORUMSYMLOG返回的查询DataRow创建一个MVNFORUMSYMLOGEntity对象
* @param MVNFORUMSYMLOG row
* @returnMVNFORUMSYMLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mvnforumsymlog_Dao> get_mvnforumsymlog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmvnforumsymlogstrWhere") == null) {
			Dictionary<Integer, mvnforumsymlog_Dao> _dic = new Hashtable<Integer, mvnforumsymlog_Dao>();
			List<mvnforumsymlog_Dao> _list = new ArrayList<mvnforumsymlog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicmvnforumsymlog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mvnforumsymlog_Dao> _dic = (Dictionary<Integer, mvnforumsymlog_Dao>) classFactory
					.cacheGet("dicmvnforumsymlogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MVNFORUMSYMLOG字段加一
* @param FieldName
* @param sid
*/
public int create_mvnforumsymlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MVNFORUMSYMLOG_PRO.UpdateFieldMVNFORUMSYMLOG(?,?)}";
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
* 更新MVNFORUMSYMLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mvnforumsymlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MVNFORUMSYMLOG_PRO.UpdateFieldMVNFORUMSYMLOGV(?,?,?)}";
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
* 更新MVNFORUMSYMLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mvnforumsymlog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MVNFORUMSYMLOG_PRO.UpdateFieldMVNFORUMSYMLOGU(?,?,?)}";
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
