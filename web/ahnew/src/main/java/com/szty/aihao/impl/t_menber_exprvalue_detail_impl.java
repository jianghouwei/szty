/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataT_menber_exprvalue_detail.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.t_menber_exprvalue_detail_Dao;
import com.szty.aihao.core.t_menber_exprvalue_detail_core;
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
*@T_MENBER_EXPRVALUE_DETAIL数据接口
*@作者：宋春林 
*/
public class t_menber_exprvalue_detail_impl implements t_menber_exprvalue_detail_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(t_menber_exprvalue_detail_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param T_MENBER_EXPRVALUE_DETAIL实体
* @return 新插入记录的编号
*/
public int insert_t_menber_exprvalue_detail(t_menber_exprvalue_detail_Dao _T_MENBER_EXPRVALUE_DETAILModel)  throws Exception{
         String sqlStr = "{call T_MENBER_EXPRVALUE_DETAIL_PRO.InsertT_MENBER_EXPRVALUE_DETAIL(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUE_DETAILModel.getUniquevalue());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUE_DETAILModel.getItemid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DATE, dateformat.format(_T_MENBER_EXPRVALUE_DETAILModel.getDatetime()));
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_T_MENBER_EXPRVALUE_DETAILModel.getRmk());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUE_DETAILModel.getTimes());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param T_MENBER_EXPRVALUE_DETAIL
* @Object 
* @return 新插入记录的编号
*/
public int insert_t_menber_exprvalue_detail(Object[] _para)  throws Exception{
      String sqlStr = "{call T_MENBER_EXPRVALUE_DETAIL_PRO.InsertT_MENBER_EXPRVALUE_DETAIL(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DATE, dateformat.format(_para[2]));
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_para[4]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param T_MENBER_EXPRVALUE_DETAIL实体
* @return 影响的行数
*/
public int update_t_menber_exprvalue_detail(t_menber_exprvalue_detail_Dao _T_MENBER_EXPRVALUE_DETAILModel)  throws Exception{
        String sqlStr = "{call T_MENBER_EXPRVALUE_DETAIL_PRO.UpdateT_MENBER_EXPRVALUE_DETAIL(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_T_MENBER_EXPRVALUE_DETAILModel.getUniquevalue());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUE_DETAILModel.getItemid());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.DATE, dateformat.format(_T_MENBER_EXPRVALUE_DETAILModel.getDatetime()));
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_T_MENBER_EXPRVALUE_DETAILModel.getRmk());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NUMERIC,_T_MENBER_EXPRVALUE_DETAILModel.getTimes());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表T_MENBER_EXPRVALUE_DETAIL中的一条记录
* @param T_MENBER_EXPRVALUE_DETAIL实体
* @return 新插入记录的编号
*/
public int delete_t_menber_exprvalue_detail(int Uniquevalue)  throws Exception{
        String sqlStr = "{call T_MENBER_EXPRVALUE_DETAIL_PRO.DeleteT_MENBER_EXPRVALUE_DETAIL(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Uniquevalue);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 t_menber_exprvalue_detail 数据实体
* @param Uniquevalue">Uniquevalue
* @return<t_menber_exprvalue_detail 数据实体
* @throws Exception 
*/
public t_menber_exprvalue_detail_Dao get_t_menber_exprvalue_detailDao(int Uniquevalue) throws Exception{
         String sqlStr = "{ call T_MENBER_EXPRVALUE_DETAIL_PRO.GetT_MENBER_EXPRVALUE_DETAILEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Uniquevalue);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_menber_exprvalue_detail_Dao _obj = new t_menber_exprvalue_detail_Dao();
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setItemid(arr.getInt("ITEMID"));
             try{_obj.setDatetime(dateformat.parse(arr.getString("DATETIME")));}catch(Exception ce){_obj.setDatetime((new Date()));}
            _obj.setRmk(arr.getString("RMK"));
            _obj.setTimes(arr.getInt("TIMES"));
			return _obj;
		}
		return null;

}

/**
* 根据T_MENBER_EXPRVALUE_DETAIL返回的查询DataRow创建一个T_MENBER_EXPRVALUE_DETAILEntity对象
* @param T_MENBER_EXPRVALUE_DETAIL row
* @returnT_MENBER_EXPRVALUE_DETAILList对象
* @throws Exception 
*/
public List<t_menber_exprvalue_detail_Dao> get_t_menber_exprvalue_detail_All() throws Exception{
        List<t_menber_exprvalue_detail_Dao> _list = new ArrayList<t_menber_exprvalue_detail_Dao>();
		String sqlStr = "{ call T_MENBER_EXPRVALUE_DETAIL_PRO.GetT_MENBER_EXPRVALUE_DETAIL(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			t_menber_exprvalue_detail_Dao _obj = new t_menber_exprvalue_detail_Dao();
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setItemid(arr.getInt("ITEMID"));
            try{_obj.setDatetime(dateformat.parse(arr.getString("DATETIME")));}catch(Exception ce){_obj.setDatetime((new Date()));}
            _obj.setRmk(arr.getString("RMK"));
            _obj.setTimes(arr.getInt("TIMES"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据T_MENBER_EXPRVALUE_DETAIL返回的查询DataRow创建一个T_MENBER_EXPRVALUE_DETAILEntity对象
* @param T_MENBER_EXPRVALUE_DETAIL row
* @returnT_MENBER_EXPRVALUE_DETAILList对象
* @throws Exception 
*/
public List< t_menber_exprvalue_detail_Dao> get_t_menber_exprvalue_detail_All(String strWhere) throws Exception{
         List<t_menber_exprvalue_detail_Dao> _list = new ArrayList<t_menber_exprvalue_detail_Dao>();
		 String sqlStr = "{ call T_MENBER_EXPRVALUE_DETAIL_PRO.GetT_MENBER_EXPRVALUE_DETAILWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				t_menber_exprvalue_detail_Dao _obj = new t_menber_exprvalue_detail_Dao();
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setItemid(arr.getInt("ITEMID"));
           try{_obj.setDatetime(dateformat.parse(arr.getString("DATETIME")));}catch(Exception ce){_obj.setDatetime((new Date()));}
            _obj.setRmk(arr.getString("RMK"));
            _obj.setTimes(arr.getInt("TIMES"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据T_MENBER_EXPRVALUE_DETAIL返回 分页数据
* @param T_MENBER_EXPRVALUE_DETAIL row
* @returnT_MENBER_EXPRVALUE_DETAILList对象
* @throws Exception 
*/
public List<t_menber_exprvalue_detail_Dao> get_t_menber_exprvalue_detail_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<t_menber_exprvalue_detail_Dao> _list = new ArrayList<t_menber_exprvalue_detail_Dao>();
		String sqlStr = "{ call T_MENBER_EXPRVALUE_DETAIL_PRO.GetT_MENBER_EXPRVALUE_DETAILPage(?,?,?,?,?,?)}";
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
				t_menber_exprvalue_detail_Dao _obj = new t_menber_exprvalue_detail_Dao();
            _obj.setUniquevalue(arr.getString("UNIQUEVALUE"));
            _obj.setItemid(arr.getInt("ITEMID"));
            try{_obj.setDatetime(dateformat.parse(arr.getString("DATETIME")));}catch(Exception ce){_obj.setDatetime((new Date()));}
            _obj.setRmk(arr.getString("RMK"));
            _obj.setTimes(arr.getInt("TIMES"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据T_MENBER_EXPRVALUE_DETAIL返回的查询DataRow创建一个T_MENBER_EXPRVALUE_DETAILEntity对象
* @param T_MENBER_EXPRVALUE_DETAIL row
* @returnT_MENBER_EXPRVALUE_DETAILDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, t_menber_exprvalue_detail_Dao> get_t_menber_exprvalue_detail_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dict_menber_exprvalue_detailstrWhere") == null) {
			Dictionary<Integer, t_menber_exprvalue_detail_Dao> _dic = new Hashtable<Integer, t_menber_exprvalue_detail_Dao>();
			List<t_menber_exprvalue_detail_Dao> _list = new ArrayList<t_menber_exprvalue_detail_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getUniquevalue()), _list.get(i));
			}
			classFactory.cachePut("dict_menber_exprvalue_detail", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, t_menber_exprvalue_detail_Dao> _dic = (Dictionary<Integer, t_menber_exprvalue_detail_Dao>) classFactory
					.cacheGet("dict_menber_exprvalue_detailstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新T_MENBER_EXPRVALUE_DETAIL字段加一
* @param FieldName
* @param sid
*/
public int create_t_menber_exprvalue_detail_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call T_MENBER_EXPRVALUE_DETAIL_PRO.UpdateFieldT_MENBER_EXPRVALUE_DETAIL(?,?)}";
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
* 更新T_MENBER_EXPRVALUE_DETAILInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_t_menber_exprvalue_detail_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call T_MENBER_EXPRVALUE_DETAIL_PRO.UpdateFieldT_MENBER_EXPRVALUE_DETAILV(?,?,?)}";
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
* 更新T_MENBER_EXPRVALUE_DETAILIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_t_menber_exprvalue_detail_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call T_MENBER_EXPRVALUE_DETAIL_PRO.UpdateFieldT_MENBER_EXPRVALUE_DETAILU(?,?,?)}";
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
