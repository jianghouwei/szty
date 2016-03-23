package com.szty.aihao.impl;
/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataGamerequestlog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/



import com.szty.aihao.dao.gamerequestlog_Dao;
import com.szty.aihao.core.gamerequestlog_core;
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
*@GAMEREQUESTLOG数据接口
*@作者：宋春林 
*/
public class gamerequestlog_impl implements gamerequestlog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(gamerequestlog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param GAMEREQUESTLOG实体
* @return 新插入记录的编号
*/
public int insert_gamerequestlog(gamerequestlog_Dao _GAMEREQUESTLOGModel)  throws Exception{
         String sqlStr = "{call GAMEREQUESTLOG_PRO.InsertGAMEREQUESTLOG(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_GAMEREQUESTLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GAMEREQUESTLOGModel.getLogurl());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GAMEREQUESTLOGModel.getLogrooturl());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_GAMEREQUESTLOGModel.getLogcreateip());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_GAMEREQUESTLOGModel.getLogcdate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_GAMEREQUESTLOGModel.getLogcreateprovince());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param GAMEREQUESTLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_gamerequestlog(Object[] _para)  throws Exception{
      String sqlStr = "{call GAMEREQUESTLOG_PRO.InsertGAMEREQUESTLOG(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param GAMEREQUESTLOG实体
* @return 影响的行数
*/
public int update_gamerequestlog(gamerequestlog_Dao _GAMEREQUESTLOGModel)  throws Exception{
        String sqlStr = "{call GAMEREQUESTLOG_PRO.UpdateGAMEREQUESTLOG(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_GAMEREQUESTLOGModel.getLogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GAMEREQUESTLOGModel.getLogurl());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GAMEREQUESTLOGModel.getLogrooturl());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_GAMEREQUESTLOGModel.getLogcreateip());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_GAMEREQUESTLOGModel.getLogcdate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_GAMEREQUESTLOGModel.getLogcreateprovince());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表GAMEREQUESTLOG中的一条记录
* @param GAMEREQUESTLOG实体
* @return 新插入记录的编号
*/
public int delete_gamerequestlog(int Logid)  throws Exception{
        String sqlStr = "{call GAMEREQUESTLOG_PRO.DeleteGAMEREQUESTLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Logid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 gamerequestlog 数据实体
* @param Logid">Logid
* @return<gamerequestlog 数据实体
* @throws Exception 
*/
public gamerequestlog_Dao get_gamerequestlogDao(int Logid) throws Exception{
         String sqlStr = "{ call GAMEREQUESTLOG_PRO.GetGAMEREQUESTLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Logid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			gamerequestlog_Dao _obj = new gamerequestlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogurl(arr.getString("LOGURL"));
            _obj.setLogrooturl(arr.getString("LOGROOTURL"));
            _obj.setLogcreateip(arr.getString("LOGCREATEIP"));
             try{_obj.setLogcdate(dateformat.parse(arr.getString("LOGCDATE")));}catch(Exception ce){_obj.setLogcdate((new Date()));}
            _obj.setLogcreateprovince(arr.getString("LOGCREATEPROVINCE"));
			return _obj;
		}
		return null;

}

/**
* 根据GAMEREQUESTLOG返回的查询DataRow创建一个GAMEREQUESTLOGEntity对象
* @param GAMEREQUESTLOG row
* @returnGAMEREQUESTLOGList对象
* @throws Exception 
*/
public List<gamerequestlog_Dao> get_gamerequestlog_All() throws Exception{
        List<gamerequestlog_Dao> _list = new ArrayList<gamerequestlog_Dao>();
		String sqlStr = "{ call GAMEREQUESTLOG_PRO.GetGAMEREQUESTLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			gamerequestlog_Dao _obj = new gamerequestlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogurl(arr.getString("LOGURL"));
            _obj.setLogrooturl(arr.getString("LOGROOTURL"));
            _obj.setLogcreateip(arr.getString("LOGCREATEIP"));
            try{_obj.setLogcdate(dateformat.parse(arr.getString("LOGCDATE")));}catch(Exception ce){_obj.setLogcdate((new Date()));}
            _obj.setLogcreateprovince(arr.getString("LOGCREATEPROVINCE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据GAMEREQUESTLOG返回的查询DataRow创建一个GAMEREQUESTLOGEntity对象
* @param GAMEREQUESTLOG row
* @returnGAMEREQUESTLOGList对象
* @throws Exception 
*/
public List< gamerequestlog_Dao> get_gamerequestlog_All(String strWhere) throws Exception{
         List<gamerequestlog_Dao> _list = new ArrayList<gamerequestlog_Dao>();
		 String sqlStr = "{ call GAMEREQUESTLOG_PRO.GetGAMEREQUESTLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				gamerequestlog_Dao _obj = new gamerequestlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogurl(arr.getString("LOGURL"));
            _obj.setLogrooturl(arr.getString("LOGROOTURL"));
            _obj.setLogcreateip(arr.getString("LOGCREATEIP"));
           try{_obj.setLogcdate(dateformat.parse(arr.getString("LOGCDATE")));}catch(Exception ce){_obj.setLogcdate((new Date()));}
            _obj.setLogcreateprovince(arr.getString("LOGCREATEPROVINCE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据GAMEREQUESTLOG返回 分页数据
* @param GAMEREQUESTLOG row
* @returnGAMEREQUESTLOGList对象
* @throws Exception 
*/
public List<gamerequestlog_Dao> get_gamerequestlog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<gamerequestlog_Dao> _list = new ArrayList<gamerequestlog_Dao>();
		String sqlStr = "{ call GAMEREQUESTLOG_PRO.GetGAMEREQUESTLOGPage(?,?,?,?,?,?)}";
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
				gamerequestlog_Dao _obj = new gamerequestlog_Dao();
            _obj.setLogid(arr.getInt("LOGID"));
            _obj.setLogurl(arr.getString("LOGURL"));
            _obj.setLogrooturl(arr.getString("LOGROOTURL"));
            _obj.setLogcreateip(arr.getString("LOGCREATEIP"));
            try{_obj.setLogcdate(dateformat.parse(arr.getString("LOGCDATE")));}catch(Exception ce){_obj.setLogcdate((new Date()));}
            _obj.setLogcreateprovince(arr.getString("LOGCREATEPROVINCE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据GAMEREQUESTLOG返回的查询DataRow创建一个GAMEREQUESTLOGEntity对象
* @param GAMEREQUESTLOG row
* @returnGAMEREQUESTLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, gamerequestlog_Dao> get_gamerequestlog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicgamerequestlogstrWhere") == null) {
			Dictionary<Integer, gamerequestlog_Dao> _dic = new Hashtable<Integer, gamerequestlog_Dao>();
			List<gamerequestlog_Dao> _list = new ArrayList<gamerequestlog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLogid()), _list.get(i));
			}
			classFactory.cachePut("dicgamerequestlog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, gamerequestlog_Dao> _dic = (Dictionary<Integer, gamerequestlog_Dao>) classFactory
					.cacheGet("dicgamerequestlogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新GAMEREQUESTLOG字段加一
* @param FieldName
* @param sid
*/
public int create_gamerequestlog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call GAMEREQUESTLOG_PRO.UpdateFieldGAMEREQUESTLOG(?,?)}";
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
* 更新GAMEREQUESTLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_gamerequestlog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call GAMEREQUESTLOG_PRO.UpdateFieldGAMEREQUESTLOGV(?,?,?)}";
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
* 更新GAMEREQUESTLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_gamerequestlog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call GAMEREQUESTLOG_PRO.UpdateFieldGAMEREQUESTLOGU(?,?,?)}";
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
