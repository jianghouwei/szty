/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataGuanjian.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.guanjian_Dao;
import com.szty.aihao.core.guanjian_core;
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
*@GUANJIAN数据接口
*@作者：宋春林 
*/
public class guanjian_impl implements guanjian_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(guanjian_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param GUANJIAN实体
* @return 新插入记录的编号
*/
public int insert_guanjian(guanjian_Dao _GUANJIANModel)  throws Exception{
         String sqlStr = "{call GUANJIAN_PRO.InsertGUANJIAN(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_GUANJIANModel.getGjname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GUANJIANModel.getGjcolor());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GUANJIANModel.getGjsize());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_GUANJIANModel.getGjcdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_GUANJIANModel.getGjorder());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_GUANJIANModel.getGjid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param GUANJIAN
* @Object 
* @return 新插入记录的编号
*/
public int insert_guanjian(Object[] _para)  throws Exception{
      String sqlStr = "{call GUANJIAN_PRO.InsertGUANJIAN(?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[6];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_para[3]));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param GUANJIAN实体
* @return 影响的行数
*/
public int update_guanjian(guanjian_Dao _GUANJIANModel)  throws Exception{
        String sqlStr = "{call GUANJIAN_PRO.UpdateGUANJIAN(?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[6];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_GUANJIANModel.getGjname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_GUANJIANModel.getGjcolor());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_GUANJIANModel.getGjsize());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.DATE, dateformat.format(_GUANJIANModel.getGjcdate()));
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_GUANJIANModel.getGjorder());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_GUANJIANModel.getGjid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表GUANJIAN中的一条记录
* @param GUANJIAN实体
* @return 新插入记录的编号
*/
public int delete_guanjian(int Gjname)  throws Exception{
        String sqlStr = "{call GUANJIAN_PRO.DeleteGUANJIAN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Gjname);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 guanjian 数据实体
* @param Gjname">Gjname
* @return<guanjian 数据实体
* @throws Exception 
*/
public guanjian_Dao get_guanjianDao(int Gjname) throws Exception{
         String sqlStr = "{ call GUANJIAN_PRO.GetGUANJIANEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Gjname);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			guanjian_Dao _obj = new guanjian_Dao();
            _obj.setGjname(arr.getString("GJNAME"));
            _obj.setGjcolor(arr.getString("GJCOLOR"));
            _obj.setGjsize(arr.getString("GJSIZE"));
             try{_obj.setGjcdate(dateformat.parse(arr.getString("GJCDATE")));}catch(Exception ce){_obj.setGjcdate((new Date()));}
            _obj.setGjorder(arr.getInt("GJORDER"));
            _obj.setGjid(arr.getInt("GJID"));
			return _obj;
		}
		return null;

}

/**
* 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
* @param GUANJIAN row
* @returnGUANJIANList对象
* @throws Exception 
*/
public List<guanjian_Dao> get_guanjian_All() throws Exception{
        List<guanjian_Dao> _list = new ArrayList<guanjian_Dao>();
		String sqlStr = "{ call GUANJIAN_PRO.GetGUANJIAN(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			guanjian_Dao _obj = new guanjian_Dao();
            _obj.setGjname(arr.getString("GJNAME"));
            _obj.setGjcolor(arr.getString("GJCOLOR"));
            _obj.setGjsize(arr.getString("GJSIZE"));
            try{_obj.setGjcdate(dateformat.parse(arr.getString("GJCDATE")));}catch(Exception ce){_obj.setGjcdate((new Date()));}
            _obj.setGjorder(arr.getInt("GJORDER"));
            _obj.setGjid(arr.getInt("GJID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
* @param GUANJIAN row
* @returnGUANJIANList对象
* @throws Exception 
*/
public List< guanjian_Dao> get_guanjian_All(String strWhere) throws Exception{
         List<guanjian_Dao> _list = new ArrayList<guanjian_Dao>();
		 String sqlStr = "{ call GUANJIAN_PRO.GetGUANJIANWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				guanjian_Dao _obj = new guanjian_Dao();
            _obj.setGjname(arr.getString("GJNAME"));
            _obj.setGjcolor(arr.getString("GJCOLOR"));
            _obj.setGjsize(arr.getString("GJSIZE"));
           try{_obj.setGjcdate(dateformat.parse(arr.getString("GJCDATE")));}catch(Exception ce){_obj.setGjcdate((new Date()));}
            _obj.setGjorder(arr.getInt("GJORDER"));
            _obj.setGjid(arr.getInt("GJID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据GUANJIAN返回 分页数据
* @param GUANJIAN row
* @returnGUANJIANList对象
* @throws Exception 
*/
public List<guanjian_Dao> get_guanjian_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<guanjian_Dao> _list = new ArrayList<guanjian_Dao>();
		String sqlStr = "{ call GUANJIAN_PRO.GetGUANJIANPage(?,?,?,?,?,?)}";
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
				guanjian_Dao _obj = new guanjian_Dao();
            _obj.setGjname(arr.getString("GJNAME"));
            _obj.setGjcolor(arr.getString("GJCOLOR"));
            _obj.setGjsize(arr.getString("GJSIZE"));
            try{_obj.setGjcdate(dateformat.parse(arr.getString("GJCDATE")));}catch(Exception ce){_obj.setGjcdate((new Date()));}
            _obj.setGjorder(arr.getInt("GJORDER"));
            _obj.setGjid(arr.getInt("GJID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据GUANJIAN返回的查询DataRow创建一个GUANJIANEntity对象
* @param GUANJIAN row
* @returnGUANJIANDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, guanjian_Dao> get_guanjian_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicguanjianstrWhere") == null) {
			Dictionary<Integer, guanjian_Dao> _dic = new Hashtable<Integer, guanjian_Dao>();
			List<guanjian_Dao> _list = new ArrayList<guanjian_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getGjname()), _list.get(i));
			}
			classFactory.cachePut("dicguanjian", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, guanjian_Dao> _dic = (Dictionary<Integer, guanjian_Dao>) classFactory
					.cacheGet("dicguanjianstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新GUANJIAN字段加一
* @param FieldName
* @param sid
*/
public int create_guanjian_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call GUANJIAN_PRO.UpdateFieldGUANJIAN(?,?)}";
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
* 更新GUANJIANInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_guanjian_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call GUANJIAN_PRO.UpdateFieldGUANJIANV(?,?,?)}";
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
* 更新GUANJIANIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_guanjian_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call GUANJIAN_PRO.UpdateFieldGUANJIANU(?,?,?)}";
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
