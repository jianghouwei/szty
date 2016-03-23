/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataClientupdate.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.clientupdate_Dao;
import com.szty.aihao.core.clientupdate_core;
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
*@CLIENTUPDATE数据接口
*@作者：宋春林 
*/
public class clientupdate_impl implements clientupdate_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(clientupdate_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param CLIENTUPDATE实体
* @return 新插入记录的编号
*/
public int insert_clientupdate(clientupdate_Dao _CLIENTUPDATEModel)  throws Exception{
         String sqlStr = "{call CLIENTUPDATE_PRO.InsertCLIENTUPDATE(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_CLIENTUPDATEModel.getUpdateid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getOs());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getJixing());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getIntroduction());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getUrl());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_CLIENTUPDATEModel.getIsstrong());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_CLIENTUPDATEModel.getCdate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_CLIENTUPDATEModel.getUdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_CLIENTUPDATEModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param CLIENTUPDATE
* @Object 
* @return 新插入记录的编号
*/
public int insert_clientupdate(Object[] _para)  throws Exception{
      String sqlStr = "{call CLIENTUPDATE_PRO.InsertCLIENTUPDATE(?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[10];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param CLIENTUPDATE实体
* @return 影响的行数
*/
public int update_clientupdate(clientupdate_Dao _CLIENTUPDATEModel)  throws Exception{
        String sqlStr = "{call CLIENTUPDATE_PRO.UpdateCLIENTUPDATE(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_CLIENTUPDATEModel.getUpdateid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getOs());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getJixing());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getIntroduction());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getVer());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_CLIENTUPDATEModel.getUrl());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_CLIENTUPDATEModel.getIsstrong());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_CLIENTUPDATEModel.getCdate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_CLIENTUPDATEModel.getUdate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_CLIENTUPDATEModel.getStatus());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表CLIENTUPDATE中的一条记录
* @param CLIENTUPDATE实体
* @return 新插入记录的编号
*/
public int delete_clientupdate(int Updateid)  throws Exception{
        String sqlStr = "{call CLIENTUPDATE_PRO.DeleteCLIENTUPDATE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Updateid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 clientupdate 数据实体
* @param Updateid">Updateid
* @return<clientupdate 数据实体
* @throws Exception 
*/
public clientupdate_Dao get_clientupdateDao(int Updateid) throws Exception{
         String sqlStr = "{ call CLIENTUPDATE_PRO.GetCLIENTUPDATEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Updateid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			clientupdate_Dao _obj = new clientupdate_Dao();
            _obj.setUpdateid(arr.getInt("UPDATEID"));
            _obj.setOs(arr.getString("OS"));
            _obj.setJixing(arr.getString("JIXING"));
            _obj.setIntroduction(arr.getString("INTRODUCTION"));
            _obj.setVer(arr.getString("VER"));
            _obj.setUrl(arr.getString("URL"));
            _obj.setIsstrong(arr.getInt("ISSTRONG"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
             try{_obj.setUdate(dateformat.parse(arr.getString("UDATE")));}catch(Exception ce){_obj.setUdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
			return _obj;
		}
		return null;

}

/**
* 根据CLIENTUPDATE返回的查询DataRow创建一个CLIENTUPDATEEntity对象
* @param CLIENTUPDATE row
* @returnCLIENTUPDATEList对象
* @throws Exception 
*/
public List<clientupdate_Dao> get_clientupdate_All() throws Exception{
        List<clientupdate_Dao> _list = new ArrayList<clientupdate_Dao>();
		String sqlStr = "{ call CLIENTUPDATE_PRO.GetCLIENTUPDATE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			clientupdate_Dao _obj = new clientupdate_Dao();
            _obj.setUpdateid(arr.getInt("UPDATEID"));
            _obj.setOs(arr.getString("OS"));
            _obj.setJixing(arr.getString("JIXING"));
            _obj.setIntroduction(arr.getString("INTRODUCTION"));
            _obj.setVer(arr.getString("VER"));
            _obj.setUrl(arr.getString("URL"));
            _obj.setIsstrong(arr.getInt("ISSTRONG"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            try{_obj.setUdate(dateformat.parse(arr.getString("UDATE")));}catch(Exception ce){_obj.setUdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据CLIENTUPDATE返回的查询DataRow创建一个CLIENTUPDATEEntity对象
* @param CLIENTUPDATE row
* @returnCLIENTUPDATEList对象
* @throws Exception 
*/
public List< clientupdate_Dao> get_clientupdate_All(String strWhere) throws Exception{
         List<clientupdate_Dao> _list = new ArrayList<clientupdate_Dao>();
		 String sqlStr = "{ call CLIENTUPDATE_PRO.GetCLIENTUPDATEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				clientupdate_Dao _obj = new clientupdate_Dao();
            _obj.setUpdateid(arr.getInt("UPDATEID"));
            _obj.setOs(arr.getString("OS"));
            _obj.setJixing(arr.getString("JIXING"));
            _obj.setIntroduction(arr.getString("INTRODUCTION"));
            _obj.setVer(arr.getString("VER"));
            _obj.setUrl(arr.getString("URL"));
            _obj.setIsstrong(arr.getInt("ISSTRONG"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
           try{_obj.setUdate(dateformat.parse(arr.getString("UDATE")));}catch(Exception ce){_obj.setUdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据CLIENTUPDATE返回 分页数据
* @param CLIENTUPDATE row
* @returnCLIENTUPDATEList对象
* @throws Exception 
*/
public List<clientupdate_Dao> get_clientupdate_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<clientupdate_Dao> _list = new ArrayList<clientupdate_Dao>();
		String sqlStr = "{ call CLIENTUPDATE_PRO.GetCLIENTUPDATEPage(?,?,?,?,?,?)}";
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
				clientupdate_Dao _obj = new clientupdate_Dao();
            _obj.setUpdateid(arr.getInt("UPDATEID"));
            _obj.setOs(arr.getString("OS"));
            _obj.setJixing(arr.getString("JIXING"));
            _obj.setIntroduction(arr.getString("INTRODUCTION"));
            _obj.setVer(arr.getString("VER"));
            _obj.setUrl(arr.getString("URL"));
            _obj.setIsstrong(arr.getInt("ISSTRONG"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            try{_obj.setUdate(dateformat.parse(arr.getString("UDATE")));}catch(Exception ce){_obj.setUdate((new Date()));}
            _obj.setStatus(arr.getInt("STATUS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据CLIENTUPDATE返回的查询DataRow创建一个CLIENTUPDATEEntity对象
* @param CLIENTUPDATE row
* @returnCLIENTUPDATEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, clientupdate_Dao> get_clientupdate_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicclientupdatestrWhere") == null) {
			Dictionary<Integer, clientupdate_Dao> _dic = new Hashtable<Integer, clientupdate_Dao>();
			List<clientupdate_Dao> _list = new ArrayList<clientupdate_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getUpdateid()), _list.get(i));
			}
			classFactory.cachePut("dicclientupdate", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, clientupdate_Dao> _dic = (Dictionary<Integer, clientupdate_Dao>) classFactory
					.cacheGet("dicclientupdatestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新CLIENTUPDATE字段加一
* @param FieldName
* @param sid
*/
public int create_clientupdate_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call CLIENTUPDATE_PRO.UpdateFieldCLIENTUPDATE(?,?)}";
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
* 更新CLIENTUPDATEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_clientupdate_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call CLIENTUPDATE_PRO.UpdateFieldCLIENTUPDATEV(?,?,?)}";
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
* 更新CLIENTUPDATEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_clientupdate_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call CLIENTUPDATE_PRO.UpdateFieldCLIENTUPDATEU(?,?,?)}";
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
