/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataOsmobile.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.osmobile_Dao;
import com.szty.aihao.core.osmobile_core;
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
*@OSMOBILE数据接口
*@作者：宋春林 
*/
public class osmobile_impl implements osmobile_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(osmobile_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param OSMOBILE实体
* @return 新插入记录的编号
*/
public int insert_osmobile(osmobile_Dao _OSMOBILEModel)  throws Exception{
         String sqlStr = "{call OSMOBILE_PRO.InsertOSMOBILE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_OSMOBILEModel.getOsid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_OSMOBILEModel.getOsname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_OSMOBILEModel.getOsicon());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_OSMOBILEModel.getOscreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param OSMOBILE
* @Object 
* @return 新插入记录的编号
*/
public int insert_osmobile(Object[] _para)  throws Exception{
      String sqlStr = "{call OSMOBILE_PRO.InsertOSMOBILE(?,?,?,?)}";
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
* @param OSMOBILE实体
* @return 影响的行数
*/
public int update_osmobile(osmobile_Dao _OSMOBILEModel)  throws Exception{
        String sqlStr = "{call OSMOBILE_PRO.UpdateOSMOBILE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_OSMOBILEModel.getOsid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_OSMOBILEModel.getOsname());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_OSMOBILEModel.getOsicon());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_OSMOBILEModel.getOscreationdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表OSMOBILE中的一条记录
* @param OSMOBILE实体
* @return 新插入记录的编号
*/
public int delete_osmobile(int Osid)  throws Exception{
        String sqlStr = "{call OSMOBILE_PRO.DeleteOSMOBILE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Osid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 osmobile 数据实体
* @param Osid">Osid
* @return<osmobile 数据实体
* @throws Exception 
*/
public osmobile_Dao get_osmobileDao(int Osid) throws Exception{
         String sqlStr = "{ call OSMOBILE_PRO.GetOSMOBILEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Osid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			osmobile_Dao _obj = new osmobile_Dao();
            _obj.setOsid(arr.getInt("OSID"));
            _obj.setOsname(arr.getString("OSNAME"));
            _obj.setOsicon(arr.getString("OSICON"));
             try{_obj.setOscreationdate(dateformat.parse(arr.getString("OSCREATIONDATE")));}catch(Exception ce){_obj.setOscreationdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据OSMOBILE返回的查询DataRow创建一个OSMOBILEEntity对象
* @param OSMOBILE row
* @returnOSMOBILEList对象
* @throws Exception 
*/
public List<osmobile_Dao> get_osmobile_All() throws Exception{
        List<osmobile_Dao> _list = new ArrayList<osmobile_Dao>();
		String sqlStr = "{ call OSMOBILE_PRO.GetOSMOBILE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			osmobile_Dao _obj = new osmobile_Dao();
            _obj.setOsid(arr.getInt("OSID"));
            _obj.setOsname(arr.getString("OSNAME"));
            _obj.setOsicon(arr.getString("OSICON"));
            try{_obj.setOscreationdate(dateformat.parse(arr.getString("OSCREATIONDATE")));}catch(Exception ce){_obj.setOscreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据OSMOBILE返回的查询DataRow创建一个OSMOBILEEntity对象
* @param OSMOBILE row
* @returnOSMOBILEList对象
* @throws Exception 
*/
public List< osmobile_Dao> get_osmobile_All(String strWhere) throws Exception{
         List<osmobile_Dao> _list = new ArrayList<osmobile_Dao>();
		 String sqlStr = "{ call OSMOBILE_PRO.GetOSMOBILEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				osmobile_Dao _obj = new osmobile_Dao();
            _obj.setOsid(arr.getInt("OSID"));
            _obj.setOsname(arr.getString("OSNAME"));
            _obj.setOsicon(arr.getString("OSICON"));
           try{_obj.setOscreationdate(dateformat.parse(arr.getString("OSCREATIONDATE")));}catch(Exception ce){_obj.setOscreationdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据OSMOBILE返回 分页数据
* @param OSMOBILE row
* @returnOSMOBILEList对象
* @throws Exception 
*/
public List<osmobile_Dao> get_osmobile_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<osmobile_Dao> _list = new ArrayList<osmobile_Dao>();
		String sqlStr = "{ call OSMOBILE_PRO.GetOSMOBILEPage(?,?,?,?,?,?)}";
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
				osmobile_Dao _obj = new osmobile_Dao();
            _obj.setOsid(arr.getInt("OSID"));
            _obj.setOsname(arr.getString("OSNAME"));
            _obj.setOsicon(arr.getString("OSICON"));
            try{_obj.setOscreationdate(dateformat.parse(arr.getString("OSCREATIONDATE")));}catch(Exception ce){_obj.setOscreationdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据OSMOBILE返回的查询DataRow创建一个OSMOBILEEntity对象
* @param OSMOBILE row
* @returnOSMOBILEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, osmobile_Dao> get_osmobile_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicosmobilestrWhere") == null) {
			Dictionary<Integer, osmobile_Dao> _dic = new Hashtable<Integer, osmobile_Dao>();
			List<osmobile_Dao> _list = new ArrayList<osmobile_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getOsid()), _list.get(i));
			}
			classFactory.cachePut("dicosmobile", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, osmobile_Dao> _dic = (Dictionary<Integer, osmobile_Dao>) classFactory
					.cacheGet("dicosmobilestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新OSMOBILE字段加一
* @param FieldName
* @param sid
*/
public int create_osmobile_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call OSMOBILE_PRO.UpdateFieldOSMOBILE(?,?)}";
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
* 更新OSMOBILEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_osmobile_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call OSMOBILE_PRO.UpdateFieldOSMOBILEV(?,?,?)}";
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
* 更新OSMOBILEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_osmobile_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call OSMOBILE_PRO.UpdateFieldOSMOBILEU(?,?,?)}";
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
