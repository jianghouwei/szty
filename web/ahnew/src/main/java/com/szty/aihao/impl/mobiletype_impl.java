/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMobiletype.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mobiletype_Dao;
import com.szty.aihao.core.mobiletype_core;
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
*@MOBILETYPE数据接口
*@作者：宋春林 
*/
public class mobiletype_impl implements mobiletype_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mobiletype_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MOBILETYPE实体
* @return 新插入记录的编号
*/
public int insert_mobiletype(mobiletype_Dao _MOBILETYPEModel)  throws Exception{
         String sqlStr = "{call MOBILETYPE_PRO.InsertMOBILETYPE(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MOBILETYPEModel.getMotypeid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MOBILETYPEModel.getOsid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MOBILETYPEModel.getMotypename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MOBILETYPEModel.getMotypeicon());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MOBILETYPEModel.getMotypesis());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MOBILETYPEModel.getMotypecreationdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MOBILETYPEModel.getMotypestatus());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MOBILETYPEModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MOBILETYPE
* @Object 
* @return 新插入记录的编号
*/
public int insert_mobiletype(Object[] _para)  throws Exception{
      String sqlStr = "{call MOBILETYPE_PRO.InsertMOBILETYPE(?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[8];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_para[5]));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_para[7]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MOBILETYPE实体
* @return 影响的行数
*/
public int update_mobiletype(mobiletype_Dao _MOBILETYPEModel)  throws Exception{
        String sqlStr = "{call MOBILETYPE_PRO.UpdateMOBILETYPE(?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[8];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_MOBILETYPEModel.getMotypeid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_MOBILETYPEModel.getOsid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_MOBILETYPEModel.getMotypename());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_MOBILETYPEModel.getMotypeicon());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_MOBILETYPEModel.getMotypesis());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.DATE, dateformat.format(_MOBILETYPEModel.getMotypecreationdate()));
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_MOBILETYPEModel.getMotypestatus());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NUMERIC,_MOBILETYPEModel.getViewcount());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MOBILETYPE中的一条记录
* @param MOBILETYPE实体
* @return 新插入记录的编号
*/
public int delete_mobiletype(int Motypeid)  throws Exception{
        String sqlStr = "{call MOBILETYPE_PRO.DeleteMOBILETYPE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Motypeid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mobiletype 数据实体
* @param Motypeid">Motypeid
* @return<mobiletype 数据实体
* @throws Exception 
*/
public mobiletype_Dao get_mobiletypeDao(int Motypeid) throws Exception{
         String sqlStr = "{ call MOBILETYPE_PRO.GetMOBILETYPEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Motypeid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mobiletype_Dao _obj = new mobiletype_Dao();
            _obj.setMotypeid(arr.getInt("MOTYPEID"));
            _obj.setOsid(arr.getInt("OSID"));
            _obj.setMotypename(arr.getString("MOTYPENAME"));
            _obj.setMotypeicon(arr.getString("MOTYPEICON"));
            _obj.setMotypesis(arr.getString("MOTYPESIS"));
             try{_obj.setMotypecreationdate(dateformat.parse(arr.getString("MOTYPECREATIONDATE")));}catch(Exception ce){_obj.setMotypecreationdate((new Date()));}
            _obj.setMotypestatus(arr.getInt("MOTYPESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			return _obj;
		}
		return null;

}

/**
* 根据MOBILETYPE返回的查询DataRow创建一个MOBILETYPEEntity对象
* @param MOBILETYPE row
* @returnMOBILETYPEList对象
* @throws Exception 
*/
public List<mobiletype_Dao> get_mobiletype_All() throws Exception{
        List<mobiletype_Dao> _list = new ArrayList<mobiletype_Dao>();
		String sqlStr = "{ call MOBILETYPE_PRO.GetMOBILETYPE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mobiletype_Dao _obj = new mobiletype_Dao();
            _obj.setMotypeid(arr.getInt("MOTYPEID"));
            _obj.setOsid(arr.getInt("OSID"));
            _obj.setMotypename(arr.getString("MOTYPENAME"));
            _obj.setMotypeicon(arr.getString("MOTYPEICON"));
            _obj.setMotypesis(arr.getString("MOTYPESIS"));
            try{_obj.setMotypecreationdate(dateformat.parse(arr.getString("MOTYPECREATIONDATE")));}catch(Exception ce){_obj.setMotypecreationdate((new Date()));}
            _obj.setMotypestatus(arr.getInt("MOTYPESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MOBILETYPE返回的查询DataRow创建一个MOBILETYPEEntity对象
* @param MOBILETYPE row
* @returnMOBILETYPEList对象
* @throws Exception 
*/
public List< mobiletype_Dao> get_mobiletype_All(String strWhere) throws Exception{
         List<mobiletype_Dao> _list = new ArrayList<mobiletype_Dao>();
		 String sqlStr = "{ call MOBILETYPE_PRO.GetMOBILETYPEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mobiletype_Dao _obj = new mobiletype_Dao();
            _obj.setMotypeid(arr.getInt("MOTYPEID"));
            _obj.setOsid(arr.getInt("OSID"));
            _obj.setMotypename(arr.getString("MOTYPENAME"));
            _obj.setMotypeicon(arr.getString("MOTYPEICON"));
            _obj.setMotypesis(arr.getString("MOTYPESIS"));
           try{_obj.setMotypecreationdate(dateformat.parse(arr.getString("MOTYPECREATIONDATE")));}catch(Exception ce){_obj.setMotypecreationdate((new Date()));}
            _obj.setMotypestatus(arr.getInt("MOTYPESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MOBILETYPE返回 分页数据
* @param MOBILETYPE row
* @returnMOBILETYPEList对象
* @throws Exception 
*/
public List<mobiletype_Dao> get_mobiletype_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mobiletype_Dao> _list = new ArrayList<mobiletype_Dao>();
		String sqlStr = "{ call MOBILETYPE_PRO.GetMOBILETYPEPage(?,?,?,?,?,?)}";
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
				mobiletype_Dao _obj = new mobiletype_Dao();
            _obj.setMotypeid(arr.getInt("MOTYPEID"));
            _obj.setOsid(arr.getInt("OSID"));
            _obj.setMotypename(arr.getString("MOTYPENAME"));
            _obj.setMotypeicon(arr.getString("MOTYPEICON"));
            _obj.setMotypesis(arr.getString("MOTYPESIS"));
            try{_obj.setMotypecreationdate(dateformat.parse(arr.getString("MOTYPECREATIONDATE")));}catch(Exception ce){_obj.setMotypecreationdate((new Date()));}
            _obj.setMotypestatus(arr.getInt("MOTYPESTATUS"));
            _obj.setViewcount(arr.getInt("VIEWCOUNT"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MOBILETYPE返回的查询DataRow创建一个MOBILETYPEEntity对象
* @param MOBILETYPE row
* @returnMOBILETYPEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mobiletype_Dao> get_mobiletype_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmobiletypestrWhere") == null) {
			Dictionary<Integer, mobiletype_Dao> _dic = new Hashtable<Integer, mobiletype_Dao>();
			List<mobiletype_Dao> _list = new ArrayList<mobiletype_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMotypeid()), _list.get(i));
			}
			classFactory.cachePut("dicmobiletype", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mobiletype_Dao> _dic = (Dictionary<Integer, mobiletype_Dao>) classFactory
					.cacheGet("dicmobiletypestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MOBILETYPE字段加一
* @param FieldName
* @param sid
*/
public int create_mobiletype_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MOBILETYPE_PRO.UpdateFieldMOBILETYPE(?,?)}";
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
* 更新MOBILETYPEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mobiletype_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MOBILETYPE_PRO.UpdateFieldMOBILETYPEV(?,?,?)}";
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
* 更新MOBILETYPEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mobiletype_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MOBILETYPE_PRO.UpdateFieldMOBILETYPEU(?,?,?)}";
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
