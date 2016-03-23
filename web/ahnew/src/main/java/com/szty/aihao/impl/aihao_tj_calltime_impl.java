/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihao_tj_calltime.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihao_tj_calltime_Dao;
import com.szty.aihao.core.aihao_tj_calltime_core;
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
*@AIHAO_TJ_CALLTIME数据接口
*@作者：宋春林 
*/
public class aihao_tj_calltime_impl implements aihao_tj_calltime_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihao_tj_calltime_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAO_TJ_CALLTIME实体
* @return 新插入记录的编号
*/
public int insert_aihao_tj_calltime(aihao_tj_calltime_Dao _AIHAO_TJ_CALLTIMEModel)  throws Exception{
         String sqlStr = "{call AIHAO_TJ_CALLTIME_PRO.InsertAIHAO_TJ_CALLTIME(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAO_TJ_CALLTIMEModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_CALLTIMEModel.getTelnum());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_CALLTIMEModel.getTeltime());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_CALLTIMEModel.getTellong());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_CALLTIMEModel.getRmk());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_CALLTIMEModel.getOs());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAO_TJ_CALLTIME
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihao_tj_calltime(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAO_TJ_CALLTIME_PRO.InsertAIHAO_TJ_CALLTIME(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAO_TJ_CALLTIME实体
* @return 影响的行数
*/
public int update_aihao_tj_calltime(aihao_tj_calltime_Dao _AIHAO_TJ_CALLTIMEModel)  throws Exception{
        String sqlStr = "{call AIHAO_TJ_CALLTIME_PRO.UpdateAIHAO_TJ_CALLTIME(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_CALLTIMEModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_CALLTIMEModel.getTelnum());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_CALLTIMEModel.getTeltime());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_AIHAO_TJ_CALLTIMEModel.getTellong());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_CALLTIMEModel.getRmk());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAO_TJ_CALLTIMEModel.getOs());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAO_TJ_CALLTIME中的一条记录
* @param AIHAO_TJ_CALLTIME实体
* @return 新插入记录的编号
*/
public int delete_aihao_tj_calltime(int Id)  throws Exception{
        String sqlStr = "{call AIHAO_TJ_CALLTIME_PRO.DeleteAIHAO_TJ_CALLTIME(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihao_tj_calltime 数据实体
* @param Id">Id
* @return<aihao_tj_calltime 数据实体
* @throws Exception 
*/
public aihao_tj_calltime_Dao get_aihao_tj_calltimeDao(int Id) throws Exception{
         String sqlStr = "{ call AIHAO_TJ_CALLTIME_PRO.GetAIHAO_TJ_CALLTIMEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_tj_calltime_Dao _obj = new aihao_tj_calltime_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setTelnum(arr.getString("TELNUM"));
            _obj.setTeltime(arr.getString("TELTIME"));
            _obj.setTellong(arr.getInt("TELLONG"));
            _obj.setRmk(arr.getString("RMK"));
            _obj.setOs(arr.getString("OS"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAO_TJ_CALLTIME返回的查询DataRow创建一个AIHAO_TJ_CALLTIMEEntity对象
* @param AIHAO_TJ_CALLTIME row
* @returnAIHAO_TJ_CALLTIMEList对象
* @throws Exception 
*/
public List<aihao_tj_calltime_Dao> get_aihao_tj_calltime_All() throws Exception{
        List<aihao_tj_calltime_Dao> _list = new ArrayList<aihao_tj_calltime_Dao>();
		String sqlStr = "{ call AIHAO_TJ_CALLTIME_PRO.GetAIHAO_TJ_CALLTIME(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihao_tj_calltime_Dao _obj = new aihao_tj_calltime_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setTelnum(arr.getString("TELNUM"));
            _obj.setTeltime(arr.getString("TELTIME"));
            _obj.setTellong(arr.getInt("TELLONG"));
            _obj.setRmk(arr.getString("RMK"));
            _obj.setOs(arr.getString("OS"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAO_TJ_CALLTIME返回的查询DataRow创建一个AIHAO_TJ_CALLTIMEEntity对象
* @param AIHAO_TJ_CALLTIME row
* @returnAIHAO_TJ_CALLTIMEList对象
* @throws Exception 
*/
public List< aihao_tj_calltime_Dao> get_aihao_tj_calltime_All(String strWhere) throws Exception{
         List<aihao_tj_calltime_Dao> _list = new ArrayList<aihao_tj_calltime_Dao>();
		 String sqlStr = "{ call AIHAO_TJ_CALLTIME_PRO.GetAIHAO_TJ_CALLTIMEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihao_tj_calltime_Dao _obj = new aihao_tj_calltime_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setTelnum(arr.getString("TELNUM"));
            _obj.setTeltime(arr.getString("TELTIME"));
            _obj.setTellong(arr.getInt("TELLONG"));
            _obj.setRmk(arr.getString("RMK"));
            _obj.setOs(arr.getString("OS"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAO_TJ_CALLTIME返回 分页数据
* @param AIHAO_TJ_CALLTIME row
* @returnAIHAO_TJ_CALLTIMEList对象
* @throws Exception 
*/
public List<aihao_tj_calltime_Dao> get_aihao_tj_calltime_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihao_tj_calltime_Dao> _list = new ArrayList<aihao_tj_calltime_Dao>();
		String sqlStr = "{ call AIHAO_TJ_CALLTIME_PRO.GetAIHAO_TJ_CALLTIMEPage(?,?,?,?,?,?)}";
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
				aihao_tj_calltime_Dao _obj = new aihao_tj_calltime_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setTelnum(arr.getString("TELNUM"));
            _obj.setTeltime(arr.getString("TELTIME"));
            _obj.setTellong(arr.getInt("TELLONG"));
            _obj.setRmk(arr.getString("RMK"));
            _obj.setOs(arr.getString("OS"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAO_TJ_CALLTIME返回的查询DataRow创建一个AIHAO_TJ_CALLTIMEEntity对象
* @param AIHAO_TJ_CALLTIME row
* @returnAIHAO_TJ_CALLTIMEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihao_tj_calltime_Dao> get_aihao_tj_calltime_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihao_tj_calltimestrWhere") == null) {
			Dictionary<Integer, aihao_tj_calltime_Dao> _dic = new Hashtable<Integer, aihao_tj_calltime_Dao>();
			List<aihao_tj_calltime_Dao> _list = new ArrayList<aihao_tj_calltime_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicaihao_tj_calltime", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihao_tj_calltime_Dao> _dic = (Dictionary<Integer, aihao_tj_calltime_Dao>) classFactory
					.cacheGet("dicaihao_tj_calltimestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAO_TJ_CALLTIME字段加一
* @param FieldName
* @param sid
*/
public int create_aihao_tj_calltime_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAO_TJ_CALLTIME_PRO.UpdateFieldAIHAO_TJ_CALLTIME(?,?)}";
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
* 更新AIHAO_TJ_CALLTIMEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihao_tj_calltime_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAO_TJ_CALLTIME_PRO.UpdateFieldAIHAO_TJ_CALLTIMEV(?,?,?)}";
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
* 更新AIHAO_TJ_CALLTIMEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihao_tj_calltime_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAO_TJ_CALLTIME_PRO.UpdateFieldAIHAO_TJ_CALLTIMEU(?,?,?)}";
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
