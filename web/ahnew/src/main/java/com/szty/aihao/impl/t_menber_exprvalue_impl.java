/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataT_menber_exprvalue.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.t_menber_exprvalue_Dao;
import com.szty.aihao.core.t_menber_exprvalue_core;
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
*@T_MENBER_EXPRVALUE数据接口
*@作者：宋春林 
*/
public class t_menber_exprvalue_impl implements t_menber_exprvalue_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(t_menber_exprvalue_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param T_MENBER_EXPRVALUE实体
* @return 新插入记录的编号
*/
public int insert_t_menber_exprvalue(t_menber_exprvalue_Dao _T_MENBER_EXPRVALUEModel)  throws Exception{
         String sqlStr = "{call T_MENBER_EXPRVALUE_PRO.InsertT_MENBER_EXPRVALUE(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getUniquevalue());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_T_MENBER_EXPRVALUEModel.getCdate());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getItemid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getTimes());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getExprunit());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getMaxtimes());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getExprvalues());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_T_MENBER_EXPRVALUEModel.getDatetime()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_T_MENBER_EXPRVALUEModel.getRmk());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param T_MENBER_EXPRVALUE
* @Object 
* @return 新插入记录的编号
*/
public int insert_t_menber_exprvalue(Object[] _para)  throws Exception{
      String sqlStr = "{call T_MENBER_EXPRVALUE_PRO.InsertT_MENBER_EXPRVALUE(?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[9];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param T_MENBER_EXPRVALUE实体
* @return 影响的行数
*/
public int update_t_menber_exprvalue(t_menber_exprvalue_Dao _T_MENBER_EXPRVALUEModel)  throws Exception{
        String sqlStr = "{call T_MENBER_EXPRVALUE_PRO.UpdateT_MENBER_EXPRVALUE(?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[9];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_T_MENBER_EXPRVALUEModel.getUniquevalue());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_T_MENBER_EXPRVALUEModel.getCdate());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getItemid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getTimes());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getExprunit());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getMaxtimes());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUEModel.getExprvalues());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_T_MENBER_EXPRVALUEModel.getDatetime()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_T_MENBER_EXPRVALUEModel.getRmk());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表T_MENBER_EXPRVALUE中的一条记录
* @param T_MENBER_EXPRVALUE实体
* @return 新插入记录的编号
*/
public int delete_t_menber_exprvalue(int Uniquevalue)  throws Exception{
        String sqlStr = "{call T_MENBER_EXPRVALUE_PRO.DeleteT_MENBER_EXPRVALUE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Uniquevalue);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 t_menber_exprvalue 数据实体
* @param Uniquevalue">Uniquevalue
* @return<t_menber_exprvalue 数据实体
* @throws Exception 
*/
public t_menber_exprvalue_Dao get_t_menber_exprvalueDao(int Uniquevalue) throws Exception{
         String sqlStr = "{ call T_MENBER_EXPRVALUE_PRO.GetT_MENBER_EXPRVALUEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Uniquevalue);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_menber_exprvalue_Dao _obj = new t_menber_exprvalue_Dao();
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setItemid(arr.getInt("ITEMID"));
            _obj.setTimes(arr.getInt("TIMES"));
            _obj.setExprunit(arr.getInt("EXPRUNIT"));
            _obj.setMaxtimes(arr.getInt("MAXTIMES"));
            _obj.setExprvalues(arr.getInt("EXPRVALUES"));
             try{_obj.setDatetime(dateformat.parse(arr.getString("DATETIME")));}catch(Exception ce){_obj.setDatetime((new Date()));}
            _obj.setRmk(arr.getString("RMK"));
			return _obj;
		}
		return null;

}

/**
* 根据T_MENBER_EXPRVALUE返回的查询DataRow创建一个T_MENBER_EXPRVALUEEntity对象
* @param T_MENBER_EXPRVALUE row
* @returnT_MENBER_EXPRVALUEList对象
* @throws Exception 
*/
public List<t_menber_exprvalue_Dao> get_t_menber_exprvalue_All() throws Exception{
        List<t_menber_exprvalue_Dao> _list = new ArrayList<t_menber_exprvalue_Dao>();
		String sqlStr = "{ call T_MENBER_EXPRVALUE_PRO.GetT_MENBER_EXPRVALUE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_menber_exprvalue_Dao _obj = new t_menber_exprvalue_Dao();
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setItemid(arr.getInt("ITEMID"));
            _obj.setTimes(arr.getInt("TIMES"));
            _obj.setExprunit(arr.getInt("EXPRUNIT"));
            _obj.setMaxtimes(arr.getInt("MAXTIMES"));
            _obj.setExprvalues(arr.getInt("EXPRVALUES"));
            try{_obj.setDatetime(dateformat.parse(arr.getString("DATETIME")));}catch(Exception ce){_obj.setDatetime((new Date()));}
            _obj.setRmk(arr.getString("RMK"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据T_MENBER_EXPRVALUE返回的查询DataRow创建一个T_MENBER_EXPRVALUEEntity对象
* @param T_MENBER_EXPRVALUE row
* @returnT_MENBER_EXPRVALUEList对象
* @throws Exception 
*/
public List< t_menber_exprvalue_Dao> get_t_menber_exprvalue_All(String strWhere) throws Exception{
         List<t_menber_exprvalue_Dao> _list = new ArrayList<t_menber_exprvalue_Dao>();
		 String sqlStr = "{ call T_MENBER_EXPRVALUE_PRO.GetT_MENBER_EXPRVALUEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				t_menber_exprvalue_Dao _obj = new t_menber_exprvalue_Dao();
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setItemid(arr.getInt("ITEMID"));
            _obj.setTimes(arr.getInt("TIMES"));
            _obj.setExprunit(arr.getInt("EXPRUNIT"));
            _obj.setMaxtimes(arr.getInt("MAXTIMES"));
            _obj.setExprvalues(arr.getInt("EXPRVALUES"));
           try{_obj.setDatetime(dateformat.parse(arr.getString("DATETIME")));}catch(Exception ce){_obj.setDatetime((new Date()));}
            _obj.setRmk(arr.getString("RMK"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据T_MENBER_EXPRVALUE返回 分页数据
* @param T_MENBER_EXPRVALUE row
* @returnT_MENBER_EXPRVALUEList对象
* @throws Exception 
*/
public List<t_menber_exprvalue_Dao> get_t_menber_exprvalue_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<t_menber_exprvalue_Dao> _list = new ArrayList<t_menber_exprvalue_Dao>();
		String sqlStr = "{ call T_MENBER_EXPRVALUE_PRO.GetT_MENBER_EXPRVALUEPage(?,?,?,?,?,?)}";
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
				t_menber_exprvalue_Dao _obj = new t_menber_exprvalue_Dao();
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setItemid(arr.getInt("ITEMID"));
            _obj.setTimes(arr.getInt("TIMES"));
            _obj.setExprunit(arr.getInt("EXPRUNIT"));
            _obj.setMaxtimes(arr.getInt("MAXTIMES"));
            _obj.setExprvalues(arr.getInt("EXPRVALUES"));
            try{_obj.setDatetime(dateformat.parse(arr.getString("DATETIME")));}catch(Exception ce){_obj.setDatetime((new Date()));}
            _obj.setRmk(arr.getString("RMK"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据T_MENBER_EXPRVALUE返回的查询DataRow创建一个T_MENBER_EXPRVALUEEntity对象
* @param T_MENBER_EXPRVALUE row
* @returnT_MENBER_EXPRVALUEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, t_menber_exprvalue_Dao> get_t_menber_exprvalue_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dict_menber_exprvaluestrWhere") == null) {
			Dictionary<Integer, t_menber_exprvalue_Dao> _dic = new Hashtable<Integer, t_menber_exprvalue_Dao>();
			List<t_menber_exprvalue_Dao> _list = new ArrayList<t_menber_exprvalue_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getUniquevalue()), _list.get(i));
			}
			classFactory.cachePut("dict_menber_exprvalue", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, t_menber_exprvalue_Dao> _dic = (Dictionary<Integer, t_menber_exprvalue_Dao>) classFactory
					.cacheGet("dict_menber_exprvaluestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新T_MENBER_EXPRVALUE字段加一
* @param FieldName
* @param sid
*/
public int create_t_menber_exprvalue_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call T_MENBER_EXPRVALUE_PRO.UpdateFieldT_MENBER_EXPRVALUE(?,?)}";
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
* 更新T_MENBER_EXPRVALUEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_t_menber_exprvalue_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call T_MENBER_EXPRVALUE_PRO.UpdateFieldT_MENBER_EXPRVALUEV(?,?,?)}";
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
* 更新T_MENBER_EXPRVALUEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_t_menber_exprvalue_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call T_MENBER_EXPRVALUE_PRO.UpdateFieldT_MENBER_EXPRVALUEU(?,?,?)}";
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
