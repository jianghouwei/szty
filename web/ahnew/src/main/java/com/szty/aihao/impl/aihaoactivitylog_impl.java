/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoactivitylog.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoactivitylog_Dao;
import com.szty.aihao.core.aihaoactivitylog_core;
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
*@AIHAOACTIVITYLOG数据接口
*@作者：宋春林 
*/
public class aihaoactivitylog_impl implements aihaoactivitylog_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoactivitylog_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOACTIVITYLOG实体
* @return 新插入记录的编号
*/
public int insert_aihaoactivitylog(aihaoactivitylog_Dao _AIHAOACTIVITYLOGModel)  throws Exception{
         String sqlStr = "{call AIHAOACTIVITYLOG_PRO.InsertAIHAOACTIVITYLOG(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOACTIVITYLOGModel.getActivtiylogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYLOGModel.getActivtiyname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYLOGModel.getUniquevalue());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOACTIVITYLOGModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOACTIVITYLOG
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoactivitylog(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOACTIVITYLOG_PRO.InsertAIHAOACTIVITYLOG(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOACTIVITYLOG实体
* @return 影响的行数
*/
public int update_aihaoactivitylog(aihaoactivitylog_Dao _AIHAOACTIVITYLOGModel)  throws Exception{
        String sqlStr = "{call AIHAOACTIVITYLOG_PRO.UpdateAIHAOACTIVITYLOG(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAOACTIVITYLOGModel.getActivtiylogid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYLOGModel.getActivtiyname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOACTIVITYLOGModel.getUniquevalue());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_AIHAOACTIVITYLOGModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOACTIVITYLOG中的一条记录
* @param AIHAOACTIVITYLOG实体
* @return 新插入记录的编号
*/
public int delete_aihaoactivitylog(int Activtiylogid)  throws Exception{
        String sqlStr = "{call AIHAOACTIVITYLOG_PRO.DeleteAIHAOACTIVITYLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Activtiylogid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoactivitylog 数据实体
* @param Activtiylogid">Activtiylogid
* @return<aihaoactivitylog 数据实体
* @throws Exception 
*/
public aihaoactivitylog_Dao get_aihaoactivitylogDao(int Activtiylogid) throws Exception{
         String sqlStr = "{ call AIHAOACTIVITYLOG_PRO.GetAIHAOACTIVITYLOGEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Activtiylogid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoactivitylog_Dao _obj = new aihaoactivitylog_Dao();
            _obj.setActivtiylogid(arr.getInt("ACTIVTIYLOGID"));
            _obj.setActivtiyname(arr.getString("ACTIVTIYNAME"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOACTIVITYLOG返回的查询DataRow创建一个AIHAOACTIVITYLOGEntity对象
* @param AIHAOACTIVITYLOG row
* @returnAIHAOACTIVITYLOGList对象
* @throws Exception 
*/
public List<aihaoactivitylog_Dao> get_aihaoactivitylog_All() throws Exception{
        List<aihaoactivitylog_Dao> _list = new ArrayList<aihaoactivitylog_Dao>();
		String sqlStr = "{ call AIHAOACTIVITYLOG_PRO.GetAIHAOACTIVITYLOG(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoactivitylog_Dao _obj = new aihaoactivitylog_Dao();
            _obj.setActivtiylogid(arr.getInt("ACTIVTIYLOGID"));
            _obj.setActivtiyname(arr.getString("ACTIVTIYNAME"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOACTIVITYLOG返回的查询DataRow创建一个AIHAOACTIVITYLOGEntity对象
* @param AIHAOACTIVITYLOG row
* @returnAIHAOACTIVITYLOGList对象
* @throws Exception 
*/
public List< aihaoactivitylog_Dao> get_aihaoactivitylog_All(String strWhere) throws Exception{
         List<aihaoactivitylog_Dao> _list = new ArrayList<aihaoactivitylog_Dao>();
		 String sqlStr = "{ call AIHAOACTIVITYLOG_PRO.GetAIHAOACTIVITYLOGWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoactivitylog_Dao _obj = new aihaoactivitylog_Dao();
            _obj.setActivtiylogid(arr.getInt("ACTIVTIYLOGID"));
            _obj.setActivtiyname(arr.getString("ACTIVTIYNAME"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOACTIVITYLOG返回 分页数据
* @param AIHAOACTIVITYLOG row
* @returnAIHAOACTIVITYLOGList对象
* @throws Exception 
*/
public List<aihaoactivitylog_Dao> get_aihaoactivitylog_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoactivitylog_Dao> _list = new ArrayList<aihaoactivitylog_Dao>();
		String sqlStr = "{ call AIHAOACTIVITYLOG_PRO.GetAIHAOACTIVITYLOGPage(?,?,?,?,?,?)}";
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
				aihaoactivitylog_Dao _obj = new aihaoactivitylog_Dao();
            _obj.setActivtiylogid(arr.getInt("ACTIVTIYLOGID"));
            _obj.setActivtiyname(arr.getString("ACTIVTIYNAME"));
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOACTIVITYLOG返回的查询DataRow创建一个AIHAOACTIVITYLOGEntity对象
* @param AIHAOACTIVITYLOG row
* @returnAIHAOACTIVITYLOGDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoactivitylog_Dao> get_aihaoactivitylog_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoactivitylogstrWhere") == null) {
			Dictionary<Integer, aihaoactivitylog_Dao> _dic = new Hashtable<Integer, aihaoactivitylog_Dao>();
			List<aihaoactivitylog_Dao> _list = new ArrayList<aihaoactivitylog_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getActivtiylogid()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoactivitylog", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoactivitylog_Dao> _dic = (Dictionary<Integer, aihaoactivitylog_Dao>) classFactory
					.cacheGet("dicaihaoactivitylogstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOACTIVITYLOG字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoactivitylog_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOACTIVITYLOG_PRO.UpdateFieldAIHAOACTIVITYLOG(?,?)}";
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
* 更新AIHAOACTIVITYLOGInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoactivitylog_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOACTIVITYLOG_PRO.UpdateFieldAIHAOACTIVITYLOGV(?,?,?)}";
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
* 更新AIHAOACTIVITYLOGIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoactivitylog_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOACTIVITYLOG_PRO.UpdateFieldAIHAOACTIVITYLOGU(?,?,?)}";
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
