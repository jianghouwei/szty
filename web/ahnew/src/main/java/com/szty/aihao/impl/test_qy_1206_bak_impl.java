/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTest_qy_1206_bak.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.test_qy_1206_bak_Dao;
import com.szty.aihao.core.test_qy_1206_bak_core;
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
*@TEST_QY_1206_BAK数据接口
*@作者：宋春林 
*/
public class test_qy_1206_bak_impl implements test_qy_1206_bak_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(test_qy_1206_bak_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TEST_QY_1206_BAK实体
* @return 新插入记录的编号
*/
public int insert_test_qy_1206_bak(test_qy_1206_bak_Dao _TEST_QY_1206_BAKModel)  throws Exception{
         String sqlStr = "{call TEST_QY_1206_BAK_PRO.InsertTEST_QY_1206_BAK(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TEST_QY_1206_BAKModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TEST_QY_1206_BAKModel.getSn());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TEST_QY_1206_BAKModel.getNum());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TEST_QY_1206_BAKModel.getSd());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TEST_QY_1206_BAK
* @Object 
* @return 新插入记录的编号
*/
public int insert_test_qy_1206_bak(Object[] _para)  throws Exception{
      String sqlStr = "{call TEST_QY_1206_BAK_PRO.InsertTEST_QY_1206_BAK(?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[4];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
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
* @param TEST_QY_1206_BAK实体
* @return 影响的行数
*/
public int update_test_qy_1206_bak(test_qy_1206_bak_Dao _TEST_QY_1206_BAKModel)  throws Exception{
        String sqlStr = "{call TEST_QY_1206_BAK_PRO.UpdateTEST_QY_1206_BAK(?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[4];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_TEST_QY_1206_BAKModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TEST_QY_1206_BAKModel.getSn());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_TEST_QY_1206_BAKModel.getNum());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_TEST_QY_1206_BAKModel.getSd());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TEST_QY_1206_BAK中的一条记录
* @param TEST_QY_1206_BAK实体
* @return 新插入记录的编号
*/
public int delete_test_qy_1206_bak(int Id)  throws Exception{
        String sqlStr = "{call TEST_QY_1206_BAK_PRO.DeleteTEST_QY_1206_BAK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 test_qy_1206_bak 数据实体
* @param Id">Id
* @return<test_qy_1206_bak 数据实体
* @throws Exception 
*/
public test_qy_1206_bak_Dao get_test_qy_1206_bakDao(int Id) throws Exception{
         String sqlStr = "{ call TEST_QY_1206_BAK_PRO.GetTEST_QY_1206_BAKEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			test_qy_1206_bak_Dao _obj = new test_qy_1206_bak_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setSn(arr.getString("SN"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setSd(arr.getString("SD"));
			return _obj;
		}
		return null;

}

/**
* 根据TEST_QY_1206_BAK返回的查询DataRow创建一个TEST_QY_1206_BAKEntity对象
* @param TEST_QY_1206_BAK row
* @returnTEST_QY_1206_BAKList对象
* @throws Exception 
*/
public List<test_qy_1206_bak_Dao> get_test_qy_1206_bak_All() throws Exception{
        List<test_qy_1206_bak_Dao> _list = new ArrayList<test_qy_1206_bak_Dao>();
		String sqlStr = "{ call TEST_QY_1206_BAK_PRO.GetTEST_QY_1206_BAK(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			test_qy_1206_bak_Dao _obj = new test_qy_1206_bak_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setSn(arr.getString("SN"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setSd(arr.getString("SD"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TEST_QY_1206_BAK返回的查询DataRow创建一个TEST_QY_1206_BAKEntity对象
* @param TEST_QY_1206_BAK row
* @returnTEST_QY_1206_BAKList对象
* @throws Exception 
*/
public List< test_qy_1206_bak_Dao> get_test_qy_1206_bak_All(String strWhere) throws Exception{
         List<test_qy_1206_bak_Dao> _list = new ArrayList<test_qy_1206_bak_Dao>();
		 String sqlStr = "{ call TEST_QY_1206_BAK_PRO.GetTEST_QY_1206_BAKWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				test_qy_1206_bak_Dao _obj = new test_qy_1206_bak_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setSn(arr.getString("SN"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setSd(arr.getString("SD"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TEST_QY_1206_BAK返回 分页数据
* @param TEST_QY_1206_BAK row
* @returnTEST_QY_1206_BAKList对象
* @throws Exception 
*/
public List<test_qy_1206_bak_Dao> get_test_qy_1206_bak_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<test_qy_1206_bak_Dao> _list = new ArrayList<test_qy_1206_bak_Dao>();
		String sqlStr = "{ call TEST_QY_1206_BAK_PRO.GetTEST_QY_1206_BAKPage(?,?,?,?,?,?)}";
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
				test_qy_1206_bak_Dao _obj = new test_qy_1206_bak_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setSn(arr.getString("SN"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setSd(arr.getString("SD"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TEST_QY_1206_BAK返回的查询DataRow创建一个TEST_QY_1206_BAKEntity对象
* @param TEST_QY_1206_BAK row
* @returnTEST_QY_1206_BAKDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, test_qy_1206_bak_Dao> get_test_qy_1206_bak_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictest_qy_1206_bakstrWhere") == null) {
			Dictionary<Integer, test_qy_1206_bak_Dao> _dic = new Hashtable<Integer, test_qy_1206_bak_Dao>();
			List<test_qy_1206_bak_Dao> _list = new ArrayList<test_qy_1206_bak_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dictest_qy_1206_bak", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, test_qy_1206_bak_Dao> _dic = (Dictionary<Integer, test_qy_1206_bak_Dao>) classFactory
					.cacheGet("dictest_qy_1206_bakstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TEST_QY_1206_BAK字段加一
* @param FieldName
* @param sid
*/
public int create_test_qy_1206_bak_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TEST_QY_1206_BAK_PRO.UpdateFieldTEST_QY_1206_BAK(?,?)}";
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
* 更新TEST_QY_1206_BAKInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_test_qy_1206_bak_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TEST_QY_1206_BAK_PRO.UpdateFieldTEST_QY_1206_BAKV(?,?,?)}";
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
* 更新TEST_QY_1206_BAKIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_test_qy_1206_bak_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TEST_QY_1206_BAK_PRO.UpdateFieldTEST_QY_1206_BAKU(?,?,?)}";
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
