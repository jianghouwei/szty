/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoiptmp37.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoiptmp37_Dao;
import com.szty.aihao.core.aihaoiptmp37_core;
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
*@AIHAOIPTMP37数据接口
*@作者：宋春林 
*/
public class aihaoiptmp37_impl implements aihaoiptmp37_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoiptmp37_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOIPTMP37实体
* @return 新插入记录的编号
*/
public int insert_aihaoiptmp37(aihaoiptmp37_Dao _AIHAOIPTMP37Model)  throws Exception{
         String sqlStr = "{call AIHAOIPTMP37_PRO.InsertAIHAOIPTMP37(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOIPTMP37Model.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP37Model.getX());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP37Model.getY());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOIPTMP37
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoiptmp37(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOIPTMP37_PRO.InsertAIHAOIPTMP37(?,?,?)}";
	  OracleParameter[] op = new OracleParameter[3];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOIPTMP37实体
* @return 影响的行数
*/
public int update_aihaoiptmp37(aihaoiptmp37_Dao _AIHAOIPTMP37Model)  throws Exception{
        String sqlStr = "{call AIHAOIPTMP37_PRO.UpdateAIHAOIPTMP37(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP37Model.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP37Model.getX());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP37Model.getY());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOIPTMP37中的一条记录
* @param AIHAOIPTMP37实体
* @return 新插入记录的编号
*/
public int delete_aihaoiptmp37(int Id)  throws Exception{
        String sqlStr = "{call AIHAOIPTMP37_PRO.DeleteAIHAOIPTMP37(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoiptmp37 数据实体
* @param Id">Id
* @return<aihaoiptmp37 数据实体
* @throws Exception 
*/
public aihaoiptmp37_Dao get_aihaoiptmp37Dao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOIPTMP37_PRO.GetAIHAOIPTMP37Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoiptmp37_Dao _obj = new aihaoiptmp37_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOIPTMP37返回的查询DataRow创建一个AIHAOIPTMP37Entity对象
* @param AIHAOIPTMP37 row
* @returnAIHAOIPTMP37List对象
* @throws Exception 
*/
public List<aihaoiptmp37_Dao> get_aihaoiptmp37_All() throws Exception{
        List<aihaoiptmp37_Dao> _list = new ArrayList<aihaoiptmp37_Dao>();
		String sqlStr = "{ call AIHAOIPTMP37_PRO.GetAIHAOIPTMP37(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoiptmp37_Dao _obj = new aihaoiptmp37_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOIPTMP37返回的查询DataRow创建一个AIHAOIPTMP37Entity对象
* @param AIHAOIPTMP37 row
* @returnAIHAOIPTMP37List对象
* @throws Exception 
*/
public List< aihaoiptmp37_Dao> get_aihaoiptmp37_All(String strWhere) throws Exception{
         List<aihaoiptmp37_Dao> _list = new ArrayList<aihaoiptmp37_Dao>();
		 String sqlStr = "{ call AIHAOIPTMP37_PRO.GetAIHAOIPTMP37Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoiptmp37_Dao _obj = new aihaoiptmp37_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOIPTMP37返回 分页数据
* @param AIHAOIPTMP37 row
* @returnAIHAOIPTMP37List对象
* @throws Exception 
*/
public List<aihaoiptmp37_Dao> get_aihaoiptmp37_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoiptmp37_Dao> _list = new ArrayList<aihaoiptmp37_Dao>();
		String sqlStr = "{ call AIHAOIPTMP37_PRO.GetAIHAOIPTMP37Page(?,?,?,?,?,?)}";
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
				aihaoiptmp37_Dao _obj = new aihaoiptmp37_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOIPTMP37返回的查询DataRow创建一个AIHAOIPTMP37Entity对象
* @param AIHAOIPTMP37 row
* @returnAIHAOIPTMP37Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoiptmp37_Dao> get_aihaoiptmp37_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoiptmp37strWhere") == null) {
			Dictionary<Integer, aihaoiptmp37_Dao> _dic = new Hashtable<Integer, aihaoiptmp37_Dao>();
			List<aihaoiptmp37_Dao> _list = new ArrayList<aihaoiptmp37_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoiptmp37", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoiptmp37_Dao> _dic = (Dictionary<Integer, aihaoiptmp37_Dao>) classFactory
					.cacheGet("dicaihaoiptmp37strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOIPTMP37字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoiptmp37_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOIPTMP37_PRO.UpdateFieldAIHAOIPTMP37(?,?)}";
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
* 更新AIHAOIPTMP37Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoiptmp37_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOIPTMP37_PRO.UpdateFieldAIHAOIPTMP37V(?,?,?)}";
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
* 更新AIHAOIPTMP37IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoiptmp37_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOIPTMP37_PRO.UpdateFieldAIHAOIPTMP37U(?,?,?)}";
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
