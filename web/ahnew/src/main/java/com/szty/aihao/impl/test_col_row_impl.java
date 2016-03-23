/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTest_col_row.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.test_col_row_Dao;
import com.szty.aihao.core.test_col_row_core;
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
*@TEST_COL_ROW数据接口
*@作者：宋春林 
*/
public class test_col_row_impl implements test_col_row_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(test_col_row_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TEST_COL_ROW实体
* @return 新插入记录的编号
*/
public int insert_test_col_row(test_col_row_Dao _TEST_COL_ROWModel)  throws Exception{
         String sqlStr = "{call TEST_COL_ROW_PRO.InsertTEST_COL_ROW(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TEST_COL_ROWModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TEST_COL_ROWModel.getC1());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TEST_COL_ROWModel.getC2());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TEST_COL_ROWModel.getC3());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TEST_COL_ROW
* @Object 
* @return 新插入记录的编号
*/
public int insert_test_col_row(Object[] _para)  throws Exception{
      String sqlStr = "{call TEST_COL_ROW_PRO.InsertTEST_COL_ROW(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TEST_COL_ROW实体
* @return 影响的行数
*/
public int update_test_col_row(test_col_row_Dao _TEST_COL_ROWModel)  throws Exception{
        String sqlStr = "{call TEST_COL_ROW_PRO.UpdateTEST_COL_ROW(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TEST_COL_ROWModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TEST_COL_ROWModel.getC1());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TEST_COL_ROWModel.getC2());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TEST_COL_ROWModel.getC3());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TEST_COL_ROW中的一条记录
* @param TEST_COL_ROW实体
* @return 新插入记录的编号
*/
public int delete_test_col_row(int Id)  throws Exception{
        String sqlStr = "{call TEST_COL_ROW_PRO.DeleteTEST_COL_ROW(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 test_col_row 数据实体
* @param Id">Id
* @return<test_col_row 数据实体
* @throws Exception 
*/
public test_col_row_Dao get_test_col_rowDao(int Id) throws Exception{
         String sqlStr = "{ call TEST_COL_ROW_PRO.GetTEST_COL_ROWEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			test_col_row_Dao _obj = new test_col_row_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setC1(arr.getString("C1"));
            _obj.setC2(arr.getString("C2"));
            _obj.setC3(arr.getString("C3"));
			return _obj;
		}
		return null;

}

/**
* 根据TEST_COL_ROW返回的查询DataRow创建一个TEST_COL_ROWEntity对象
* @param TEST_COL_ROW row
* @returnTEST_COL_ROWList对象
* @throws Exception 
*/
public List<test_col_row_Dao> get_test_col_row_All() throws Exception{
        List<test_col_row_Dao> _list = new ArrayList<test_col_row_Dao>();
		String sqlStr = "{ call TEST_COL_ROW_PRO.GetTEST_COL_ROW(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			test_col_row_Dao _obj = new test_col_row_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setC1(arr.getString("C1"));
            _obj.setC2(arr.getString("C2"));
            _obj.setC3(arr.getString("C3"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TEST_COL_ROW返回的查询DataRow创建一个TEST_COL_ROWEntity对象
* @param TEST_COL_ROW row
* @returnTEST_COL_ROWList对象
* @throws Exception 
*/
public List< test_col_row_Dao> get_test_col_row_All(String strWhere) throws Exception{
         List<test_col_row_Dao> _list = new ArrayList<test_col_row_Dao>();
		 String sqlStr = "{ call TEST_COL_ROW_PRO.GetTEST_COL_ROWWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				test_col_row_Dao _obj = new test_col_row_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setC1(arr.getString("C1"));
            _obj.setC2(arr.getString("C2"));
            _obj.setC3(arr.getString("C3"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TEST_COL_ROW返回 分页数据
* @param TEST_COL_ROW row
* @returnTEST_COL_ROWList对象
* @throws Exception 
*/
public List<test_col_row_Dao> get_test_col_row_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<test_col_row_Dao> _list = new ArrayList<test_col_row_Dao>();
		String sqlStr = "{ call TEST_COL_ROW_PRO.GetTEST_COL_ROWPage(?,?,?,?,?,?)}";
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
				test_col_row_Dao _obj = new test_col_row_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setC1(arr.getString("C1"));
            _obj.setC2(arr.getString("C2"));
            _obj.setC3(arr.getString("C3"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TEST_COL_ROW返回的查询DataRow创建一个TEST_COL_ROWEntity对象
* @param TEST_COL_ROW row
* @returnTEST_COL_ROWDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, test_col_row_Dao> get_test_col_row_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictest_col_rowstrWhere") == null) {
			Dictionary<Integer, test_col_row_Dao> _dic = new Hashtable<Integer, test_col_row_Dao>();
			List<test_col_row_Dao> _list = new ArrayList<test_col_row_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dictest_col_row", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, test_col_row_Dao> _dic = (Dictionary<Integer, test_col_row_Dao>) classFactory
					.cacheGet("dictest_col_rowstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TEST_COL_ROW字段加一
* @param FieldName
* @param sid
*/
public int create_test_col_row_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TEST_COL_ROW_PRO.UpdateFieldTEST_COL_ROW(?,?)}";
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
* 更新TEST_COL_ROWInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_test_col_row_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TEST_COL_ROW_PRO.UpdateFieldTEST_COL_ROWV(?,?,?)}";
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
* 更新TEST_COL_ROWIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_test_col_row_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TEST_COL_ROW_PRO.UpdateFieldTEST_COL_ROWU(?,?,?)}";
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
