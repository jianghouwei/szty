/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSzty_emp_pur.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.szty_emp_pur_Dao;
import com.szty.aihao.core.szty_emp_pur_core;
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
*@SZTY_EMP_PUR数据接口
*@作者：宋春林 
*/
public class szty_emp_pur_impl implements szty_emp_pur_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(szty_emp_pur_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTY_EMP_PUR实体
* @return 新插入记录的编号
*/
public int insert_szty_emp_pur(szty_emp_pur_Dao _SZTY_EMP_PURModel)  throws Exception{
         String sqlStr = "{call SZTY_EMP_PUR_PRO.InsertSZTY_EMP_PUR(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTY_EMP_PURModel.getEid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTY_EMP_PURModel.getPurid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTY_EMP_PUR
* @Object 
* @return 新插入记录的编号
*/
public int insert_szty_emp_pur(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTY_EMP_PUR_PRO.InsertSZTY_EMP_PUR(?,?)}";
	  OracleParameter[] op = new OracleParameter[2];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTY_EMP_PUR实体
* @return 影响的行数
*/
public int update_szty_emp_pur(szty_emp_pur_Dao _SZTY_EMP_PURModel)  throws Exception{
        String sqlStr = "{call SZTY_EMP_PUR_PRO.UpdateSZTY_EMP_PUR(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SZTY_EMP_PURModel.getEid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTY_EMP_PURModel.getPurid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTY_EMP_PUR中的一条记录
* @param SZTY_EMP_PUR实体
* @return 新插入记录的编号
*/
public int delete_szty_emp_pur(int Eid)  throws Exception{
        String sqlStr = "{call SZTY_EMP_PUR_PRO.DeleteSZTY_EMP_PUR(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Eid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 szty_emp_pur 数据实体
* @param Eid">Eid
* @return<szty_emp_pur 数据实体
* @throws Exception 
*/
public szty_emp_pur_Dao get_szty_emp_purDao(int Eid) throws Exception{
         String sqlStr = "{ call SZTY_EMP_PUR_PRO.GetSZTY_EMP_PUREntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Eid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			szty_emp_pur_Dao _obj = new szty_emp_pur_Dao();
            _obj.setEid(arr.getInt("EID"));
            _obj.setPurid(arr.getInt("PURID"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTY_EMP_PUR返回的查询DataRow创建一个SZTY_EMP_PUREntity对象
* @param SZTY_EMP_PUR row
* @returnSZTY_EMP_PURList对象
* @throws Exception 
*/
public List<szty_emp_pur_Dao> get_szty_emp_pur_All() throws Exception{
        List<szty_emp_pur_Dao> _list = new ArrayList<szty_emp_pur_Dao>();
		String sqlStr = "{ call SZTY_EMP_PUR_PRO.GetSZTY_EMP_PUR(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			szty_emp_pur_Dao _obj = new szty_emp_pur_Dao();
            _obj.setEid(arr.getInt("EID"));
            _obj.setPurid(arr.getInt("PURID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTY_EMP_PUR返回的查询DataRow创建一个SZTY_EMP_PUREntity对象
* @param SZTY_EMP_PUR row
* @returnSZTY_EMP_PURList对象
* @throws Exception 
*/
public List< szty_emp_pur_Dao> get_szty_emp_pur_All(String strWhere) throws Exception{
         List<szty_emp_pur_Dao> _list = new ArrayList<szty_emp_pur_Dao>();
		 String sqlStr = "{ call SZTY_EMP_PUR_PRO.GetSZTY_EMP_PURWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				szty_emp_pur_Dao _obj = new szty_emp_pur_Dao();
            _obj.setEid(arr.getInt("EID"));
            _obj.setPurid(arr.getInt("PURID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTY_EMP_PUR返回 分页数据
* @param SZTY_EMP_PUR row
* @returnSZTY_EMP_PURList对象
* @throws Exception 
*/
public List<szty_emp_pur_Dao> get_szty_emp_pur_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<szty_emp_pur_Dao> _list = new ArrayList<szty_emp_pur_Dao>();
		String sqlStr = "{ call SZTY_EMP_PUR_PRO.GetSZTY_EMP_PURPage(?,?,?,?,?,?)}";
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
				szty_emp_pur_Dao _obj = new szty_emp_pur_Dao();
            _obj.setEid(arr.getInt("EID"));
            _obj.setPurid(arr.getInt("PURID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTY_EMP_PUR返回的查询DataRow创建一个SZTY_EMP_PUREntity对象
* @param SZTY_EMP_PUR row
* @returnSZTY_EMP_PURDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, szty_emp_pur_Dao> get_szty_emp_pur_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicszty_emp_purstrWhere") == null) {
			Dictionary<Integer, szty_emp_pur_Dao> _dic = new Hashtable<Integer, szty_emp_pur_Dao>();
			List<szty_emp_pur_Dao> _list = new ArrayList<szty_emp_pur_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getEid()), _list.get(i));
			}
			classFactory.cachePut("dicszty_emp_pur", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, szty_emp_pur_Dao> _dic = (Dictionary<Integer, szty_emp_pur_Dao>) classFactory
					.cacheGet("dicszty_emp_purstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTY_EMP_PUR字段加一
* @param FieldName
* @param sid
*/
public int create_szty_emp_pur_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTY_EMP_PUR_PRO.UpdateFieldSZTY_EMP_PUR(?,?)}";
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
* 更新SZTY_EMP_PURInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_szty_emp_pur_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTY_EMP_PUR_PRO.UpdateFieldSZTY_EMP_PURV(?,?,?)}";
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
* 更新SZTY_EMP_PURIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_szty_emp_pur_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTY_EMP_PUR_PRO.UpdateFieldSZTY_EMP_PURU(?,?,?)}";
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
