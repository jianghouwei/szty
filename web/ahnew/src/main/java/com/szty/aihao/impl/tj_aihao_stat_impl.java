/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataTj_aihao_stat.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.tj_aihao_stat_Dao;
import com.szty.aihao.core.tj_aihao_stat_core;
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
*@TJ_AIHAO_STAT数据接口
*@作者：宋春林 
*/
public class tj_aihao_stat_impl implements tj_aihao_stat_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(tj_aihao_stat_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param TJ_AIHAO_STAT实体
* @return 新插入记录的编号
*/
public int insert_tj_aihao_stat(tj_aihao_stat_Dao _TJ_AIHAO_STATModel)  throws Exception{
         String sqlStr = "{call TJ_AIHAO_STAT_PRO.InsertTJ_AIHAO_STAT(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getCdate());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getOs());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getChannelid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getActive_users_month());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getData_category());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getTime_category());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getNum());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getOpname());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getVername());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getActive_users_day());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getActive_users_week());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param TJ_AIHAO_STAT
* @Object 
* @return 新插入记录的编号
*/
public int insert_tj_aihao_stat(Object[] _para)  throws Exception{
      String sqlStr = "{call TJ_AIHAO_STAT_PRO.InsertTJ_AIHAO_STAT(?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[11];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_para[10]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param TJ_AIHAO_STAT实体
* @return 影响的行数
*/
public int update_tj_aihao_stat(tj_aihao_stat_Dao _TJ_AIHAO_STATModel)  throws Exception{
        String sqlStr = "{call TJ_AIHAO_STAT_PRO.UpdateTJ_AIHAO_STAT(?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[11];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getCdate());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getOs());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getChannelid());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getActive_users_month());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getData_category());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getTime_category());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getNum());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getOpname());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.NVARCHAR,_TJ_AIHAO_STATModel.getVername());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getActive_users_day());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NUMERIC,_TJ_AIHAO_STATModel.getActive_users_week());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表TJ_AIHAO_STAT中的一条记录
* @param TJ_AIHAO_STAT实体
* @return 新插入记录的编号
*/
public int delete_tj_aihao_stat(int Cdate)  throws Exception{
        String sqlStr = "{call TJ_AIHAO_STAT_PRO.DeleteTJ_AIHAO_STAT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Cdate);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 tj_aihao_stat 数据实体
* @param Cdate">Cdate
* @return<tj_aihao_stat 数据实体
* @throws Exception 
*/
public tj_aihao_stat_Dao get_tj_aihao_statDao(int Cdate) throws Exception{
         String sqlStr = "{ call TJ_AIHAO_STAT_PRO.GetTJ_AIHAO_STATEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Cdate);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			tj_aihao_stat_Dao _obj = new tj_aihao_stat_Dao();
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setChannelid(arr.getString("CHANNELID"));
            _obj.setActive_users_month(arr.getInt("ACTIVE_USERS_MONTH"));
            _obj.setData_category(arr.getString("DATA_CATEGORY"));
            _obj.setTime_category(arr.getString("TIME_CATEGORY"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setOpname(arr.getString("OPNAME"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setActive_users_day(arr.getInt("ACTIVE_USERS_DAY"));
            _obj.setActive_users_week(arr.getInt("ACTIVE_USERS_WEEK"));
			return _obj;
		}
		return null;

}

/**
* 根据TJ_AIHAO_STAT返回的查询DataRow创建一个TJ_AIHAO_STATEntity对象
* @param TJ_AIHAO_STAT row
* @returnTJ_AIHAO_STATList对象
* @throws Exception 
*/
public List<tj_aihao_stat_Dao> get_tj_aihao_stat_All() throws Exception{
        List<tj_aihao_stat_Dao> _list = new ArrayList<tj_aihao_stat_Dao>();
		String sqlStr = "{ call TJ_AIHAO_STAT_PRO.GetTJ_AIHAO_STAT(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			tj_aihao_stat_Dao _obj = new tj_aihao_stat_Dao();
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setChannelid(arr.getString("CHANNELID"));
            _obj.setActive_users_month(arr.getInt("ACTIVE_USERS_MONTH"));
            _obj.setData_category(arr.getString("DATA_CATEGORY"));
            _obj.setTime_category(arr.getString("TIME_CATEGORY"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setOpname(arr.getString("OPNAME"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setActive_users_day(arr.getInt("ACTIVE_USERS_DAY"));
            _obj.setActive_users_week(arr.getInt("ACTIVE_USERS_WEEK"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据TJ_AIHAO_STAT返回的查询DataRow创建一个TJ_AIHAO_STATEntity对象
* @param TJ_AIHAO_STAT row
* @returnTJ_AIHAO_STATList对象
* @throws Exception 
*/
public List< tj_aihao_stat_Dao> get_tj_aihao_stat_All(String strWhere) throws Exception{
         List<tj_aihao_stat_Dao> _list = new ArrayList<tj_aihao_stat_Dao>();
		 String sqlStr = "{ call TJ_AIHAO_STAT_PRO.GetTJ_AIHAO_STATWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				tj_aihao_stat_Dao _obj = new tj_aihao_stat_Dao();
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setChannelid(arr.getString("CHANNELID"));
            _obj.setActive_users_month(arr.getInt("ACTIVE_USERS_MONTH"));
            _obj.setData_category(arr.getString("DATA_CATEGORY"));
            _obj.setTime_category(arr.getString("TIME_CATEGORY"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setOpname(arr.getString("OPNAME"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setActive_users_day(arr.getInt("ACTIVE_USERS_DAY"));
            _obj.setActive_users_week(arr.getInt("ACTIVE_USERS_WEEK"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据TJ_AIHAO_STAT返回 分页数据
* @param TJ_AIHAO_STAT row
* @returnTJ_AIHAO_STATList对象
* @throws Exception 
*/
public List<tj_aihao_stat_Dao> get_tj_aihao_stat_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<tj_aihao_stat_Dao> _list = new ArrayList<tj_aihao_stat_Dao>();
		String sqlStr = "{ call TJ_AIHAO_STAT_PRO.GetTJ_AIHAO_STATPage(?,?,?,?,?,?)}";
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
				tj_aihao_stat_Dao _obj = new tj_aihao_stat_Dao();
            _obj.setCdate(arr.getString("CDATE"));
            _obj.setOs(arr.getString("OS"));
            _obj.setChannelid(arr.getString("CHANNELID"));
            _obj.setActive_users_month(arr.getInt("ACTIVE_USERS_MONTH"));
            _obj.setData_category(arr.getString("DATA_CATEGORY"));
            _obj.setTime_category(arr.getString("TIME_CATEGORY"));
            _obj.setNum(arr.getInt("NUM"));
            _obj.setOpname(arr.getString("OPNAME"));
            _obj.setVername(arr.getString("VERNAME"));
            _obj.setActive_users_day(arr.getInt("ACTIVE_USERS_DAY"));
            _obj.setActive_users_week(arr.getInt("ACTIVE_USERS_WEEK"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据TJ_AIHAO_STAT返回的查询DataRow创建一个TJ_AIHAO_STATEntity对象
* @param TJ_AIHAO_STAT row
* @returnTJ_AIHAO_STATDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, tj_aihao_stat_Dao> get_tj_aihao_stat_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dictj_aihao_statstrWhere") == null) {
			Dictionary<Integer, tj_aihao_stat_Dao> _dic = new Hashtable<Integer, tj_aihao_stat_Dao>();
			List<tj_aihao_stat_Dao> _list = new ArrayList<tj_aihao_stat_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getCdate()), _list.get(i));
			}
			classFactory.cachePut("dictj_aihao_stat", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, tj_aihao_stat_Dao> _dic = (Dictionary<Integer, tj_aihao_stat_Dao>) classFactory
					.cacheGet("dictj_aihao_statstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新TJ_AIHAO_STAT字段加一
* @param FieldName
* @param sid
*/
public int create_tj_aihao_stat_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call TJ_AIHAO_STAT_PRO.UpdateFieldTJ_AIHAO_STAT(?,?)}";
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
* 更新TJ_AIHAO_STATInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_tj_aihao_stat_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call TJ_AIHAO_STAT_PRO.UpdateFieldTJ_AIHAO_STATV(?,?,?)}";
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
* 更新TJ_AIHAO_STATIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_tj_aihao_stat_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call TJ_AIHAO_STAT_PRO.UpdateFieldTJ_AIHAO_STATU(?,?,?)}";
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
