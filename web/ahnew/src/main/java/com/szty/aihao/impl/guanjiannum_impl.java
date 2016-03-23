/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataGuanjiannum.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.guanjiannum_Dao;
import com.szty.aihao.core.guanjiannum_core;
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
*@GUANJIANNUM数据接口
*@作者：宋春林 
*/
public class guanjiannum_impl implements guanjiannum_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(guanjiannum_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param GUANJIANNUM实体
* @return 新插入记录的编号
*/
public int insert_guanjiannum(guanjiannum_Dao _GUANJIANNUMModel)  throws Exception{
         String sqlStr = "{call GUANJIANNUM_PRO.InsertGUANJIANNUM(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_GUANJIANNUMModel.getGuanjiannum());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_GUANJIANNUMModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param GUANJIANNUM
* @Object 
* @return 新插入记录的编号
*/
public int insert_guanjiannum(Object[] _para)  throws Exception{
      String sqlStr = "{call GUANJIANNUM_PRO.InsertGUANJIANNUM(?,?)}";
	  OracleParameter[] op = new OracleParameter[2];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_para[1]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param GUANJIANNUM实体
* @return 影响的行数
*/
public int update_guanjiannum(guanjiannum_Dao _GUANJIANNUMModel)  throws Exception{
        String sqlStr = "{call GUANJIANNUM_PRO.UpdateGUANJIANNUM(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_GUANJIANNUMModel.getGuanjiannum());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.DATE, dateformat.format(_GUANJIANNUMModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表GUANJIANNUM中的一条记录
* @param GUANJIANNUM实体
* @return 新插入记录的编号
*/
public int delete_guanjiannum(int Guanjiannum)  throws Exception{
        String sqlStr = "{call GUANJIANNUM_PRO.DeleteGUANJIANNUM(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Guanjiannum);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 guanjiannum 数据实体
* @param Guanjiannum">Guanjiannum
* @return<guanjiannum 数据实体
* @throws Exception 
*/
public guanjiannum_Dao get_guanjiannumDao(int Guanjiannum) throws Exception{
         String sqlStr = "{ call GUANJIANNUM_PRO.GetGUANJIANNUMEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Guanjiannum);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			guanjiannum_Dao _obj = new guanjiannum_Dao();
            _obj.setGuanjiannum(arr.getInt("GUANJIANNUM"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据GUANJIANNUM返回的查询DataRow创建一个GUANJIANNUMEntity对象
* @param GUANJIANNUM row
* @returnGUANJIANNUMList对象
* @throws Exception 
*/
public List<guanjiannum_Dao> get_guanjiannum_All() throws Exception{
        List<guanjiannum_Dao> _list = new ArrayList<guanjiannum_Dao>();
		String sqlStr = "{ call GUANJIANNUM_PRO.GetGUANJIANNUM(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			guanjiannum_Dao _obj = new guanjiannum_Dao();
            _obj.setGuanjiannum(arr.getInt("GUANJIANNUM"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据GUANJIANNUM返回的查询DataRow创建一个GUANJIANNUMEntity对象
* @param GUANJIANNUM row
* @returnGUANJIANNUMList对象
* @throws Exception 
*/
public List< guanjiannum_Dao> get_guanjiannum_All(String strWhere) throws Exception{
         List<guanjiannum_Dao> _list = new ArrayList<guanjiannum_Dao>();
		 String sqlStr = "{ call GUANJIANNUM_PRO.GetGUANJIANNUMWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				guanjiannum_Dao _obj = new guanjiannum_Dao();
            _obj.setGuanjiannum(arr.getInt("GUANJIANNUM"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据GUANJIANNUM返回 分页数据
* @param GUANJIANNUM row
* @returnGUANJIANNUMList对象
* @throws Exception 
*/
public List<guanjiannum_Dao> get_guanjiannum_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<guanjiannum_Dao> _list = new ArrayList<guanjiannum_Dao>();
		String sqlStr = "{ call GUANJIANNUM_PRO.GetGUANJIANNUMPage(?,?,?,?,?,?)}";
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
				guanjiannum_Dao _obj = new guanjiannum_Dao();
            _obj.setGuanjiannum(arr.getInt("GUANJIANNUM"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据GUANJIANNUM返回的查询DataRow创建一个GUANJIANNUMEntity对象
* @param GUANJIANNUM row
* @returnGUANJIANNUMDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, guanjiannum_Dao> get_guanjiannum_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicguanjiannumstrWhere") == null) {
			Dictionary<Integer, guanjiannum_Dao> _dic = new Hashtable<Integer, guanjiannum_Dao>();
			List<guanjiannum_Dao> _list = new ArrayList<guanjiannum_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getGuanjiannum()), _list.get(i));
			}
			classFactory.cachePut("dicguanjiannum", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, guanjiannum_Dao> _dic = (Dictionary<Integer, guanjiannum_Dao>) classFactory
					.cacheGet("dicguanjiannumstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新GUANJIANNUM字段加一
* @param FieldName
* @param sid
*/
public int create_guanjiannum_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call GUANJIANNUM_PRO.UpdateFieldGUANJIANNUM(?,?)}";
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
* 更新GUANJIANNUMInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_guanjiannum_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call GUANJIANNUM_PRO.UpdateFieldGUANJIANNUMV(?,?,?)}";
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
* 更新GUANJIANNUMIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_guanjiannum_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call GUANJIANNUM_PRO.UpdateFieldGUANJIANNUMU(?,?,?)}";
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
