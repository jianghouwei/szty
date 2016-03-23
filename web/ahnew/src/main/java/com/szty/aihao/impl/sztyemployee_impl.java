/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSztyemployee.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.sztyemployee_Dao;
import com.szty.aihao.core.sztyemployee_core;
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
*@SZTYEMPLOYEE数据接口
*@作者：宋春林 
*/
public class sztyemployee_impl implements sztyemployee_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(sztyemployee_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SZTYEMPLOYEE实体
* @return 新插入记录的编号
*/
public int insert_sztyemployee(sztyemployee_Dao _SZTYEMPLOYEEModel)  throws Exception{
         String sqlStr = "{call SZTYEMPLOYEE_PRO.InsertSZTYEMPLOYEE(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SZTYEMPLOYEEModel.getEid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTYEMPLOYEEModel.getDepartmentid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYEMPLOYEEModel.getJob());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_SZTYEMPLOYEEModel.getDuty());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SZTYEMPLOYEEModel.getEntrydate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYEMPLOYEEModel.getHobby());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_SZTYEMPLOYEEModel.getBossid());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_SZTYEMPLOYEEModel.getEmployeename());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_SZTYEMPLOYEEModel.getCard());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SZTYEMPLOYEE
* @Object 
* @return 新插入记录的编号
*/
public int insert_sztyemployee(Object[] _para)  throws Exception{
      String sqlStr = "{call SZTYEMPLOYEE_PRO.InsertSZTYEMPLOYEE(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SZTYEMPLOYEE实体
* @return 影响的行数
*/
public int update_sztyemployee(sztyemployee_Dao _SZTYEMPLOYEEModel)  throws Exception{
        String sqlStr = "{call SZTYEMPLOYEE_PRO.UpdateSZTYEMPLOYEE(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SZTYEMPLOYEEModel.getEid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SZTYEMPLOYEEModel.getDepartmentid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SZTYEMPLOYEEModel.getJob());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_SZTYEMPLOYEEModel.getDuty());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SZTYEMPLOYEEModel.getEntrydate()));
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_SZTYEMPLOYEEModel.getHobby());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_SZTYEMPLOYEEModel.getBossid());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_SZTYEMPLOYEEModel.getEmployeename());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_SZTYEMPLOYEEModel.getCard());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SZTYEMPLOYEE中的一条记录
* @param SZTYEMPLOYEE实体
* @return 新插入记录的编号
*/
public int delete_sztyemployee(int Eid)  throws Exception{
        String sqlStr = "{call SZTYEMPLOYEE_PRO.DeleteSZTYEMPLOYEE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Eid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 sztyemployee 数据实体
* @param Eid">Eid
* @return<sztyemployee 数据实体
* @throws Exception 
*/
public sztyemployee_Dao get_sztyemployeeDao(int Eid) throws Exception{
         String sqlStr = "{ call SZTYEMPLOYEE_PRO.GetSZTYEMPLOYEEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Eid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyemployee_Dao _obj = new sztyemployee_Dao();
            _obj.setEid(arr.getInt("EID"));
            _obj.setDepartmentid(arr.getInt("DEPARTMENTID"));
            _obj.setJob(arr.getString("JOB"));
            _obj.setDuty(arr.getInt("DUTY"));
             try{_obj.setEntrydate(dateformat.parse(arr.getString("ENTRYDATE")));}catch(Exception ce){_obj.setEntrydate((new Date()));}
            _obj.setHobby(arr.getString("HOBBY"));
            _obj.setBossid(arr.getInt("BOSSID"));
            _obj.setEmployeename(arr.getString("EMPLOYEENAME"));
            _obj.setCard(arr.getString("CARD"));
			return _obj;
		}
		return null;

}

/**
* 根据SZTYEMPLOYEE返回的查询DataRow创建一个SZTYEMPLOYEEEntity对象
* @param SZTYEMPLOYEE row
* @returnSZTYEMPLOYEEList对象
* @throws Exception 
*/
public List<sztyemployee_Dao> get_sztyemployee_All() throws Exception{
        List<sztyemployee_Dao> _list = new ArrayList<sztyemployee_Dao>();
		String sqlStr = "{ call SZTYEMPLOYEE_PRO.GetSZTYEMPLOYEE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			sztyemployee_Dao _obj = new sztyemployee_Dao();
            _obj.setEid(arr.getInt("EID"));
            _obj.setDepartmentid(arr.getInt("DEPARTMENTID"));
            _obj.setJob(arr.getString("JOB"));
            _obj.setDuty(arr.getInt("DUTY"));
            try{_obj.setEntrydate(dateformat.parse(arr.getString("ENTRYDATE")));}catch(Exception ce){_obj.setEntrydate((new Date()));}
            _obj.setHobby(arr.getString("HOBBY"));
            _obj.setBossid(arr.getInt("BOSSID"));
            _obj.setEmployeename(arr.getString("EMPLOYEENAME"));
            _obj.setCard(arr.getString("CARD"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SZTYEMPLOYEE返回的查询DataRow创建一个SZTYEMPLOYEEEntity对象
* @param SZTYEMPLOYEE row
* @returnSZTYEMPLOYEEList对象
* @throws Exception 
*/
public List< sztyemployee_Dao> get_sztyemployee_All(String strWhere) throws Exception{
         List<sztyemployee_Dao> _list = new ArrayList<sztyemployee_Dao>();
		 String sqlStr = "{ call SZTYEMPLOYEE_PRO.GetSZTYEMPLOYEEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				sztyemployee_Dao _obj = new sztyemployee_Dao();
            _obj.setEid(arr.getInt("EID"));
            _obj.setDepartmentid(arr.getInt("DEPARTMENTID"));
            _obj.setJob(arr.getString("JOB"));
            _obj.setDuty(arr.getInt("DUTY"));
           try{_obj.setEntrydate(dateformat.parse(arr.getString("ENTRYDATE")));}catch(Exception ce){_obj.setEntrydate((new Date()));}
            _obj.setHobby(arr.getString("HOBBY"));
            _obj.setBossid(arr.getInt("BOSSID"));
            _obj.setEmployeename(arr.getString("EMPLOYEENAME"));
            _obj.setCard(arr.getString("CARD"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SZTYEMPLOYEE返回 分页数据
* @param SZTYEMPLOYEE row
* @returnSZTYEMPLOYEEList对象
* @throws Exception 
*/
public List<sztyemployee_Dao> get_sztyemployee_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<sztyemployee_Dao> _list = new ArrayList<sztyemployee_Dao>();
		String sqlStr = "{ call SZTYEMPLOYEE_PRO.GetSZTYEMPLOYEEPage(?,?,?,?,?,?)}";
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
				sztyemployee_Dao _obj = new sztyemployee_Dao();
            _obj.setEid(arr.getInt("EID"));
            _obj.setDepartmentid(arr.getInt("DEPARTMENTID"));
            _obj.setJob(arr.getString("JOB"));
            _obj.setDuty(arr.getInt("DUTY"));
            try{_obj.setEntrydate(dateformat.parse(arr.getString("ENTRYDATE")));}catch(Exception ce){_obj.setEntrydate((new Date()));}
            _obj.setHobby(arr.getString("HOBBY"));
            _obj.setBossid(arr.getInt("BOSSID"));
            _obj.setEmployeename(arr.getString("EMPLOYEENAME"));
            _obj.setCard(arr.getString("CARD"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SZTYEMPLOYEE返回的查询DataRow创建一个SZTYEMPLOYEEEntity对象
* @param SZTYEMPLOYEE row
* @returnSZTYEMPLOYEEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, sztyemployee_Dao> get_sztyemployee_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsztyemployeestrWhere") == null) {
			Dictionary<Integer, sztyemployee_Dao> _dic = new Hashtable<Integer, sztyemployee_Dao>();
			List<sztyemployee_Dao> _list = new ArrayList<sztyemployee_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getEid()), _list.get(i));
			}
			classFactory.cachePut("dicsztyemployee", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, sztyemployee_Dao> _dic = (Dictionary<Integer, sztyemployee_Dao>) classFactory
					.cacheGet("dicsztyemployeestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SZTYEMPLOYEE字段加一
* @param FieldName
* @param sid
*/
public int create_sztyemployee_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SZTYEMPLOYEE_PRO.UpdateFieldSZTYEMPLOYEE(?,?)}";
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
* 更新SZTYEMPLOYEEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_sztyemployee_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SZTYEMPLOYEE_PRO.UpdateFieldSZTYEMPLOYEEV(?,?,?)}";
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
* 更新SZTYEMPLOYEEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_sztyemployee_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SZTYEMPLOYEE_PRO.UpdateFieldSZTYEMPLOYEEU(?,?,?)}";
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
