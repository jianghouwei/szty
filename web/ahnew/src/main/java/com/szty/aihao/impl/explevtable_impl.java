/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataExplevtable.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.explevtable_Dao;
import com.szty.aihao.core.explevtable_core;
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
*@EXPLEVTABLE数据接口
*@作者：宋春林 
*/
public class explevtable_impl implements explevtable_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(explevtable_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param EXPLEVTABLE实体
* @return 新插入记录的编号
*/
public int insert_explevtable(explevtable_Dao _EXPLEVTABLEModel)  throws Exception{
         String sqlStr = "{call EXPLEVTABLE_PRO.InsertEXPLEVTABLE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_EXPLEVTABLEModel.getLevid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_EXPLEVTABLEModel.getLevexp());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_EXPLEVTABLEModel.getIntegral());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_EXPLEVTABLEModel.getLevname());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param EXPLEVTABLE
* @Object 
* @return 新插入记录的编号
*/
public int insert_explevtable(Object[] _para)  throws Exception{
      String sqlStr = "{call EXPLEVTABLE_PRO.InsertEXPLEVTABLE(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param EXPLEVTABLE实体
* @return 影响的行数
*/
public int update_explevtable(explevtable_Dao _EXPLEVTABLEModel)  throws Exception{
        String sqlStr = "{call EXPLEVTABLE_PRO.UpdateEXPLEVTABLE(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_EXPLEVTABLEModel.getLevid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_EXPLEVTABLEModel.getLevexp());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_EXPLEVTABLEModel.getIntegral());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_EXPLEVTABLEModel.getLevname());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表EXPLEVTABLE中的一条记录
* @param EXPLEVTABLE实体
* @return 新插入记录的编号
*/
public int delete_explevtable(int Levid)  throws Exception{
        String sqlStr = "{call EXPLEVTABLE_PRO.DeleteEXPLEVTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Levid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 explevtable 数据实体
* @param Levid">Levid
* @return<explevtable 数据实体
* @throws Exception 
*/
public explevtable_Dao get_explevtableDao(int Levid) throws Exception{
         String sqlStr = "{ call EXPLEVTABLE_PRO.GetEXPLEVTABLEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Levid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			explevtable_Dao _obj = new explevtable_Dao();
            _obj.setLevid(arr.getInt("LEVID"));
            _obj.setLevexp(arr.getInt("LEVEXP"));
            _obj.setIntegral(arr.getInt("INTEGRAL"));
            _obj.setLevname(arr.getString("LEVNAME"));
			return _obj;
		}
		return null;

}

/**
* 根据EXPLEVTABLE返回的查询DataRow创建一个EXPLEVTABLEEntity对象
* @param EXPLEVTABLE row
* @returnEXPLEVTABLEList对象
* @throws Exception 
*/
public List<explevtable_Dao> get_explevtable_All() throws Exception{
        List<explevtable_Dao> _list = new ArrayList<explevtable_Dao>();
		String sqlStr = "{ call EXPLEVTABLE_PRO.GetEXPLEVTABLE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			explevtable_Dao _obj = new explevtable_Dao();
            _obj.setLevid(arr.getInt("LEVID"));
            _obj.setLevexp(arr.getInt("LEVEXP"));
            _obj.setIntegral(arr.getInt("INTEGRAL"));
            _obj.setLevname(arr.getString("LEVNAME"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据EXPLEVTABLE返回的查询DataRow创建一个EXPLEVTABLEEntity对象
* @param EXPLEVTABLE row
* @returnEXPLEVTABLEList对象
* @throws Exception 
*/
public List< explevtable_Dao> get_explevtable_All(String strWhere) throws Exception{
         List<explevtable_Dao> _list = new ArrayList<explevtable_Dao>();
		 String sqlStr = "{ call EXPLEVTABLE_PRO.GetEXPLEVTABLEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				explevtable_Dao _obj = new explevtable_Dao();
            _obj.setLevid(arr.getInt("LEVID"));
            _obj.setLevexp(arr.getInt("LEVEXP"));
            _obj.setIntegral(arr.getInt("INTEGRAL"));
            _obj.setLevname(arr.getString("LEVNAME"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据EXPLEVTABLE返回 分页数据
* @param EXPLEVTABLE row
* @returnEXPLEVTABLEList对象
* @throws Exception 
*/
public List<explevtable_Dao> get_explevtable_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<explevtable_Dao> _list = new ArrayList<explevtable_Dao>();
		String sqlStr = "{ call EXPLEVTABLE_PRO.GetEXPLEVTABLEPage(?,?,?,?,?,?)}";
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
				explevtable_Dao _obj = new explevtable_Dao();
            _obj.setLevid(arr.getInt("LEVID"));
            _obj.setLevexp(arr.getInt("LEVEXP"));
            _obj.setIntegral(arr.getInt("INTEGRAL"));
            _obj.setLevname(arr.getString("LEVNAME"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据EXPLEVTABLE返回的查询DataRow创建一个EXPLEVTABLEEntity对象
* @param EXPLEVTABLE row
* @returnEXPLEVTABLEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, explevtable_Dao> get_explevtable_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicexplevtablestrWhere") == null) {
			Dictionary<Integer, explevtable_Dao> _dic = new Hashtable<Integer, explevtable_Dao>();
			List<explevtable_Dao> _list = new ArrayList<explevtable_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getLevid()), _list.get(i));
			}
			classFactory.cachePut("dicexplevtable", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, explevtable_Dao> _dic = (Dictionary<Integer, explevtable_Dao>) classFactory
					.cacheGet("dicexplevtablestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新EXPLEVTABLE字段加一
* @param FieldName
* @param sid
*/
public int create_explevtable_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call EXPLEVTABLE_PRO.UpdateFieldEXPLEVTABLE(?,?)}";
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
* 更新EXPLEVTABLEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_explevtable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call EXPLEVTABLE_PRO.UpdateFieldEXPLEVTABLEV(?,?,?)}";
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
* 更新EXPLEVTABLEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_explevtable_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call EXPLEVTABLE_PRO.UpdateFieldEXPLEVTABLEU(?,?,?)}";
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
