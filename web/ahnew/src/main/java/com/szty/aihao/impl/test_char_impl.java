/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTest_char.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.test_char_Dao;
import com.szty.aihao.core.test_char_core;
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
*@TEST_CHAR数据接口
*@作者：宋春林 
*/
public class test_char_impl implements test_char_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(test_char_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TEST_CHAR实体
* @return 新插入记录的编号
*/
public int insert_test_char(test_char_Dao _TEST_CHARModel)  throws Exception{
         String sqlStr = "{call TEST_CHAR_PRO.InsertTEST_CHAR(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TEST_CHARModel.getChar_col());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TEST_CHARModel.getVarchar_col());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TEST_CHARModel.getLong_col());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TEST_CHAR
* @Object 
* @return 新插入记录的编号
*/
public int insert_test_char(Object[] _para)  throws Exception{
      String sqlStr = "{call TEST_CHAR_PRO.InsertTEST_CHAR(?,?,?)}";
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
* @param TEST_CHAR实体
* @return 影响的行数
*/
public int update_test_char(test_char_Dao _TEST_CHARModel)  throws Exception{
        String sqlStr = "{call TEST_CHAR_PRO.UpdateTEST_CHAR(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_TEST_CHARModel.getChar_col());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TEST_CHARModel.getVarchar_col());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TEST_CHARModel.getLong_col());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TEST_CHAR中的一条记录
* @param TEST_CHAR实体
* @return 新插入记录的编号
*/
public int delete_test_char(int Char_col)  throws Exception{
        String sqlStr = "{call TEST_CHAR_PRO.DeleteTEST_CHAR(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Char_col);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 test_char 数据实体
* @param Char_col">Char_col
* @return<test_char 数据实体
* @throws Exception 
*/
public test_char_Dao get_test_charDao(int Char_col) throws Exception{
         String sqlStr = "{ call TEST_CHAR_PRO.GetTEST_CHAREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Char_col);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			test_char_Dao _obj = new test_char_Dao();
            _obj.setVarchar_col(arr.getString("VARCHAR_COL"));
            _obj.setLong_col(arr.getString("LONG_COL"));
			return _obj;
		}
		return null;

}

/**
* 根据TEST_CHAR返回的查询DataRow创建一个TEST_CHAREntity对象
* @param TEST_CHAR row
* @returnTEST_CHARList对象
* @throws Exception 
*/
public List<test_char_Dao> get_test_char_All() throws Exception{
        List<test_char_Dao> _list = new ArrayList<test_char_Dao>();
		String sqlStr = "{ call TEST_CHAR_PRO.GetTEST_CHAR(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			test_char_Dao _obj = new test_char_Dao();
            _obj.setVarchar_col(arr.getString("VARCHAR_COL"));
            _obj.setLong_col(arr.getString("LONG_COL"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TEST_CHAR返回的查询DataRow创建一个TEST_CHAREntity对象
* @param TEST_CHAR row
* @returnTEST_CHARList对象
* @throws Exception 
*/
public List< test_char_Dao> get_test_char_All(String strWhere) throws Exception{
         List<test_char_Dao> _list = new ArrayList<test_char_Dao>();
		 String sqlStr = "{ call TEST_CHAR_PRO.GetTEST_CHARWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				test_char_Dao _obj = new test_char_Dao();
            _obj.setVarchar_col(arr.getString("VARCHAR_COL"));
            _obj.setLong_col(arr.getString("LONG_COL"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TEST_CHAR返回 分页数据
* @param TEST_CHAR row
* @returnTEST_CHARList对象
* @throws Exception 
*/
public List<test_char_Dao> get_test_char_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<test_char_Dao> _list = new ArrayList<test_char_Dao>();
		String sqlStr = "{ call TEST_CHAR_PRO.GetTEST_CHARPage(?,?,?,?,?,?)}";
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
				test_char_Dao _obj = new test_char_Dao();
            _obj.setVarchar_col(arr.getString("VARCHAR_COL"));
            _obj.setLong_col(arr.getString("LONG_COL"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TEST_CHAR返回的查询DataRow创建一个TEST_CHAREntity对象
* @param TEST_CHAR row
* @returnTEST_CHARDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, test_char_Dao> get_test_char_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictest_charstrWhere") == null) {
			Dictionary<Integer, test_char_Dao> _dic = new Hashtable<Integer, test_char_Dao>();
			List<test_char_Dao> _list = new ArrayList<test_char_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getChar_col()), _list.get(i));
			}
			classFactory.cachePut("dictest_char", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, test_char_Dao> _dic = (Dictionary<Integer, test_char_Dao>) classFactory
					.cacheGet("dictest_charstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TEST_CHAR字段加一
* @param FieldName
* @param sid
*/
public int create_test_char_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TEST_CHAR_PRO.UpdateFieldTEST_CHAR(?,?)}";
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
* 更新TEST_CHARInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_test_char_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TEST_CHAR_PRO.UpdateFieldTEST_CHARV(?,?,?)}";
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
* 更新TEST_CHARIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_test_char_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TEST_CHAR_PRO.UpdateFieldTEST_CHARU(?,?,?)}";
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
