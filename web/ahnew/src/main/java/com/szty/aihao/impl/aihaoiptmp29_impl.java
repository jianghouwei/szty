/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaoiptmp29.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaoiptmp29_Dao;
import com.szty.aihao.core.aihaoiptmp29_core;
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
*@AIHAOIPTMP29数据接口
*@作者：宋春林 
*/
public class aihaoiptmp29_impl implements aihaoiptmp29_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaoiptmp29_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOIPTMP29实体
* @return 新插入记录的编号
*/
public int insert_aihaoiptmp29(aihaoiptmp29_Dao _AIHAOIPTMP29Model)  throws Exception{
         String sqlStr = "{call AIHAOIPTMP29_PRO.InsertAIHAOIPTMP29(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOIPTMP29Model.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP29Model.getX());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP29Model.getY());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOIPTMP29
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaoiptmp29(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOIPTMP29_PRO.InsertAIHAOIPTMP29(?,?,?)}";
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
* @param AIHAOIPTMP29实体
* @return 影响的行数
*/
public int update_aihaoiptmp29(aihaoiptmp29_Dao _AIHAOIPTMP29Model)  throws Exception{
        String sqlStr = "{call AIHAOIPTMP29_PRO.UpdateAIHAOIPTMP29(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP29Model.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP29Model.getX());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOIPTMP29Model.getY());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOIPTMP29中的一条记录
* @param AIHAOIPTMP29实体
* @return 新插入记录的编号
*/
public int delete_aihaoiptmp29(int Id)  throws Exception{
        String sqlStr = "{call AIHAOIPTMP29_PRO.DeleteAIHAOIPTMP29(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaoiptmp29 数据实体
* @param Id">Id
* @return<aihaoiptmp29 数据实体
* @throws Exception 
*/
public aihaoiptmp29_Dao get_aihaoiptmp29Dao(int Id) throws Exception{
         String sqlStr = "{ call AIHAOIPTMP29_PRO.GetAIHAOIPTMP29Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoiptmp29_Dao _obj = new aihaoiptmp29_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOIPTMP29返回的查询DataRow创建一个AIHAOIPTMP29Entity对象
* @param AIHAOIPTMP29 row
* @returnAIHAOIPTMP29List对象
* @throws Exception 
*/
public List<aihaoiptmp29_Dao> get_aihaoiptmp29_All() throws Exception{
        List<aihaoiptmp29_Dao> _list = new ArrayList<aihaoiptmp29_Dao>();
		String sqlStr = "{ call AIHAOIPTMP29_PRO.GetAIHAOIPTMP29(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaoiptmp29_Dao _obj = new aihaoiptmp29_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOIPTMP29返回的查询DataRow创建一个AIHAOIPTMP29Entity对象
* @param AIHAOIPTMP29 row
* @returnAIHAOIPTMP29List对象
* @throws Exception 
*/
public List< aihaoiptmp29_Dao> get_aihaoiptmp29_All(String strWhere) throws Exception{
         List<aihaoiptmp29_Dao> _list = new ArrayList<aihaoiptmp29_Dao>();
		 String sqlStr = "{ call AIHAOIPTMP29_PRO.GetAIHAOIPTMP29Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaoiptmp29_Dao _obj = new aihaoiptmp29_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOIPTMP29返回 分页数据
* @param AIHAOIPTMP29 row
* @returnAIHAOIPTMP29List对象
* @throws Exception 
*/
public List<aihaoiptmp29_Dao> get_aihaoiptmp29_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaoiptmp29_Dao> _list = new ArrayList<aihaoiptmp29_Dao>();
		String sqlStr = "{ call AIHAOIPTMP29_PRO.GetAIHAOIPTMP29Page(?,?,?,?,?,?)}";
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
				aihaoiptmp29_Dao _obj = new aihaoiptmp29_Dao();
            _obj.setId(arr.getString("ID"));
            _obj.setX(arr.getString("X"));
            _obj.setY(arr.getString("Y"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOIPTMP29返回的查询DataRow创建一个AIHAOIPTMP29Entity对象
* @param AIHAOIPTMP29 row
* @returnAIHAOIPTMP29Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaoiptmp29_Dao> get_aihaoiptmp29_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaoiptmp29strWhere") == null) {
			Dictionary<Integer, aihaoiptmp29_Dao> _dic = new Hashtable<Integer, aihaoiptmp29_Dao>();
			List<aihaoiptmp29_Dao> _list = new ArrayList<aihaoiptmp29_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihaoiptmp29", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaoiptmp29_Dao> _dic = (Dictionary<Integer, aihaoiptmp29_Dao>) classFactory
					.cacheGet("dicaihaoiptmp29strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOIPTMP29字段加一
* @param FieldName
* @param sid
*/
public int create_aihaoiptmp29_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOIPTMP29_PRO.UpdateFieldAIHAOIPTMP29(?,?)}";
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
* 更新AIHAOIPTMP29Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaoiptmp29_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOIPTMP29_PRO.UpdateFieldAIHAOIPTMP29V(?,?,?)}";
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
* 更新AIHAOIPTMP29IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaoiptmp29_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOIPTMP29_PRO.UpdateFieldAIHAOIPTMP29U(?,?,?)}";
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
