/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataMobilehaoclass.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.mobilehaoclass_Dao;
import com.szty.aihao.core.mobilehaoclass_core;
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
*@MOBILEHAOCLASS数据接口
*@作者：宋春林 
*/
public class mobilehaoclass_impl implements mobilehaoclass_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(mobilehaoclass_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param MOBILEHAOCLASS实体
* @return 新插入记录的编号
*/
public int insert_mobilehaoclass(mobilehaoclass_Dao _MOBILEHAOCLASSModel)  throws Exception{
         String sqlStr = "{call MOBILEHAOCLASS_PRO.InsertMOBILEHAOCLASS(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_MOBILEHAOCLASSModel.getName());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MOBILEHAOCLASSModel.getMobile());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param MOBILEHAOCLASS
* @Object 
* @return 新插入记录的编号
*/
public int insert_mobilehaoclass(Object[] _para)  throws Exception{
      String sqlStr = "{call MOBILEHAOCLASS_PRO.InsertMOBILEHAOCLASS(?,?)}";
	  OracleParameter[] op = new OracleParameter[2];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param MOBILEHAOCLASS实体
* @return 影响的行数
*/
public int update_mobilehaoclass(mobilehaoclass_Dao _MOBILEHAOCLASSModel)  throws Exception{
        String sqlStr = "{call MOBILEHAOCLASS_PRO.UpdateMOBILEHAOCLASS(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_MOBILEHAOCLASSModel.getName());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_MOBILEHAOCLASSModel.getMobile());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表MOBILEHAOCLASS中的一条记录
* @param MOBILEHAOCLASS实体
* @return 新插入记录的编号
*/
public int delete_mobilehaoclass(int Name)  throws Exception{
        String sqlStr = "{call MOBILEHAOCLASS_PRO.DeleteMOBILEHAOCLASS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Name);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 mobilehaoclass 数据实体
* @param Name">Name
* @return<mobilehaoclass 数据实体
* @throws Exception 
*/
public mobilehaoclass_Dao get_mobilehaoclassDao(int Name) throws Exception{
         String sqlStr = "{ call MOBILEHAOCLASS_PRO.GetMOBILEHAOCLASSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Name);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mobilehaoclass_Dao _obj = new mobilehaoclass_Dao();
            _obj.setName(arr.getString("NAME"));
            _obj.setMobile(arr.getString("MOBILE"));
			return _obj;
		}
		return null;

}

/**
* 根据MOBILEHAOCLASS返回的查询DataRow创建一个MOBILEHAOCLASSEntity对象
* @param MOBILEHAOCLASS row
* @returnMOBILEHAOCLASSList对象
* @throws Exception 
*/
public List<mobilehaoclass_Dao> get_mobilehaoclass_All() throws Exception{
        List<mobilehaoclass_Dao> _list = new ArrayList<mobilehaoclass_Dao>();
		String sqlStr = "{ call MOBILEHAOCLASS_PRO.GetMOBILEHAOCLASS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			mobilehaoclass_Dao _obj = new mobilehaoclass_Dao();
            _obj.setName(arr.getString("NAME"));
            _obj.setMobile(arr.getString("MOBILE"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据MOBILEHAOCLASS返回的查询DataRow创建一个MOBILEHAOCLASSEntity对象
* @param MOBILEHAOCLASS row
* @returnMOBILEHAOCLASSList对象
* @throws Exception 
*/
public List< mobilehaoclass_Dao> get_mobilehaoclass_All(String strWhere) throws Exception{
         List<mobilehaoclass_Dao> _list = new ArrayList<mobilehaoclass_Dao>();
		 String sqlStr = "{ call MOBILEHAOCLASS_PRO.GetMOBILEHAOCLASSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				mobilehaoclass_Dao _obj = new mobilehaoclass_Dao();
            _obj.setName(arr.getString("NAME"));
            _obj.setMobile(arr.getString("MOBILE"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据MOBILEHAOCLASS返回 分页数据
* @param MOBILEHAOCLASS row
* @returnMOBILEHAOCLASSList对象
* @throws Exception 
*/
public List<mobilehaoclass_Dao> get_mobilehaoclass_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<mobilehaoclass_Dao> _list = new ArrayList<mobilehaoclass_Dao>();
		String sqlStr = "{ call MOBILEHAOCLASS_PRO.GetMOBILEHAOCLASSPage(?,?,?,?,?,?)}";
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
				mobilehaoclass_Dao _obj = new mobilehaoclass_Dao();
            _obj.setName(arr.getString("NAME"));
            _obj.setMobile(arr.getString("MOBILE"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据MOBILEHAOCLASS返回的查询DataRow创建一个MOBILEHAOCLASSEntity对象
* @param MOBILEHAOCLASS row
* @returnMOBILEHAOCLASSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, mobilehaoclass_Dao> get_mobilehaoclass_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicmobilehaoclassstrWhere") == null) {
			Dictionary<Integer, mobilehaoclass_Dao> _dic = new Hashtable<Integer, mobilehaoclass_Dao>();
			List<mobilehaoclass_Dao> _list = new ArrayList<mobilehaoclass_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getName()), _list.get(i));
			}
			classFactory.cachePut("dicmobilehaoclass", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, mobilehaoclass_Dao> _dic = (Dictionary<Integer, mobilehaoclass_Dao>) classFactory
					.cacheGet("dicmobilehaoclassstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新MOBILEHAOCLASS字段加一
* @param FieldName
* @param sid
*/
public int create_mobilehaoclass_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call MOBILEHAOCLASS_PRO.UpdateFieldMOBILEHAOCLASS(?,?)}";
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
* 更新MOBILEHAOCLASSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_mobilehaoclass_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call MOBILEHAOCLASS_PRO.UpdateFieldMOBILEHAOCLASSV(?,?,?)}";
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
* 更新MOBILEHAOCLASSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_mobilehaoclass_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call MOBILEHAOCLASS_PRO.UpdateFieldMOBILEHAOCLASSU(?,?,?)}";
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
